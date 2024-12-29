package miot.bluetooth.security.mesh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.manager.ChannelManager;
import com.miot.bluetooth.channel.manager.MeshDfuChannelManager;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public final class MeshDfuManager {
    private static final int MSG_SEND_COMMAND_TIMEOUT = 12289;
    private static final int MSG_SEND_NEXT_FRAGMENT = 12291;
    private static final int MSG_UPDATE_PROGRESS = 12290;
    private static final int SEND_TIMEOUT = 10000;
    private static final String TAG = "MeshDfuManager";
    private static volatile MeshDfuManager sInstance;
    private BroadcastReceiver mBluetoothReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BluetoothLog.m10338v(String.format("MeshDfuManager, mesh dfu BluetoothReceiver onReceive: %s", new Object[]{action}));
            if (TextUtils.equals(action, "action.connect_status_changed")) {
                String stringExtra = intent.getStringExtra("extra.mac");
                if (MeshDfuManager.this.mUpgradeMac != null && MeshDfuManager.this.mUpgradeMac.equalsIgnoreCase(stringExtra) && intent.getIntExtra("extra.status", 5) == 32 && MeshDfuManager.this.mResponse != null) {
                    MeshDfuManager.this.onUpgradeFailed(-1, "disconnect");
                }
            } else if (TextUtils.equals(action, "action.character_changed")) {
                String stringExtra2 = intent.getStringExtra("extra.mac");
                if (MeshDfuManager.this.mUpgradeMac != null && MeshDfuManager.this.mUpgradeMac.equalsIgnoreCase(stringExtra2)) {
                    UUID uuid = (UUID) intent.getSerializableExtra("extra.service.uuid");
                    UUID uuid2 = (UUID) intent.getSerializableExtra("extra.character.uuid");
                    byte[] byteArrayExtra = intent.getByteArrayExtra("extra.byte.value");
                    if (uuid != null && uuid2 != null) {
                        MeshDfuManager.this.processNotify(uuid, uuid2, byteArrayExtra);
                    }
                }
            }
        }
    };
    private IBleChannelReader mChannelReader = new IBleChannelReader() {
        public IBinder asBinder() {
            return null;
        }

        public void onRead(String str, byte[] bArr, int i) {
        }
    };
    private IBleChannelWriter mChannelWriter;
    /* access modifiers changed from: private */
    public DfuHandler mDfuHandler;
    private String mFilePath;
    private HandlerThread mHandlerThread = new HandlerThread("MeshDfuManager-Thread");
    private boolean mIsUpdating = false;
    /* access modifiers changed from: private */
    public SendCommandRequest mLastSendCommandRequest;
    private MeshFileLoader mMeshFileLoader;
    /* access modifiers changed from: private */
    public ProgressInfo mProgressInfo;
    /* access modifiers changed from: private */
    public long mProgressUpdateInterval;
    /* access modifiers changed from: private */
    public IBleMeshUpgradeResponse mResponse;
    /* access modifiers changed from: private */
    public TransferFragmentCallback mTransferFragmentCallback;
    /* access modifiers changed from: private */
    public String mUpgradeMac;

    private class DfuHandler extends Handler {
        public DfuHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case MeshDfuManager.MSG_SEND_COMMAND_TIMEOUT /*12289*/:
                    if (!(MeshDfuManager.this.mLastSendCommandRequest == null || MeshDfuManager.this.mLastSendCommandRequest.sendCallback == null)) {
                        MeshDfuManager.this.mLastSendCommandRequest.sendCallback.onFailure(-7, "send command timeout");
                    }
                    SendCommandRequest unused = MeshDfuManager.this.mLastSendCommandRequest = null;
                    return;
                case MeshDfuManager.MSG_UPDATE_PROGRESS /*12290*/:
                    if (MeshDfuManager.this.mProgressInfo != null && MeshDfuManager.this.mResponse != null) {
                        if (MeshDfuManager.this.mProgressInfo.progress < MeshDfuManager.this.mProgressInfo.maxProgress) {
                            MeshDfuManager.this.mResponse.onProgress(MeshDfuManager.this.mProgressInfo.progress);
                            MeshDfuManager.this.mProgressInfo.progress++;
                        }
                        MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_UPDATE_PROGRESS, MeshDfuManager.this.mProgressUpdateInterval);
                        return;
                    }
                    return;
                case MeshDfuManager.MSG_SEND_NEXT_FRAGMENT /*12291*/:
                    MeshDfuManager.this.sendFragmentData();
                    return;
                default:
                    return;
            }
        }
    }

    private class MeshFileLoader {
        private boolean complete = false;
        private byte[] fileBuffer;
        private int fileBufferCount = 0;
        private int fileBufferIndex = 0;
        private FileInputStream fis;
        private byte[] fragmentBuffer;
        short fragmentIndex = 1;
        private int fragmentSize;
        private long sendFileSize = 0;
        private long totalFileSize;

        public MeshFileLoader(String str, int i) {
            this.fragmentSize = i;
            this.fileBuffer = new byte[(i * 10)];
            this.fragmentBuffer = new byte[(i + 2)];
            File file = new File(str);
            this.totalFileSize = file.length();
            try {
                this.fis = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        private boolean loadFromFile() {
            boolean z;
            try {
                this.fileBufferCount = this.fis.read(this.fileBuffer);
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
                z = false;
            }
            this.fileBufferIndex = 0;
            return z;
        }

        public byte[] getFragmentBuffer() {
            String str;
            byte[] bArr;
            if (this.complete) {
                str = "MeshDfuManager getFragmentBuffer has send complete";
            } else if (this.fis == null) {
                str = "MeshDfuManager getFragmentBuffer fis is null";
            } else if (this.fileBufferIndex < this.fileBufferCount || loadFromFile()) {
                int i = this.fileBufferCount;
                if (i == 0 || i == -1) {
                    str = "MeshDfuManager getFragmentBuffer fileBufferCount is " + this.fileBufferCount;
                } else {
                    int i2 = this.fileBufferIndex;
                    int i3 = i - i2;
                    int i4 = this.fragmentSize;
                    if (i3 >= i4) {
                        System.arraycopy(this.fileBuffer, i2, this.fragmentBuffer, 2, i4);
                        bArr = this.fragmentBuffer;
                        long j = this.sendFileSize;
                        int i5 = this.fragmentSize;
                        this.sendFileSize = j + ((long) i5);
                        this.fileBufferIndex += i5;
                    } else {
                        byte[] bArr2 = new byte[((i - i2) + 2)];
                        System.arraycopy(this.fileBuffer, i2, bArr2, 2, i - i2);
                        long j2 = this.sendFileSize;
                        int i6 = this.fileBufferCount;
                        this.sendFileSize = j2 + ((long) (i6 - this.fileBufferIndex));
                        this.fileBufferIndex = i6;
                        bArr = bArr2;
                    }
                    byte[] fromShort = ByteUtils.fromShort(this.fragmentIndex);
                    bArr[0] = fromShort[0];
                    bArr[1] = fromShort[1];
                    this.fragmentIndex = (short) (this.fragmentIndex + 1);
                    if (this.sendFileSize >= this.totalFileSize) {
                        this.complete = true;
                    }
                    return bArr;
                }
            } else {
                str = "MeshDfuManager loadFromFile failed";
            }
            BluetoothLog.m10338v(str);
            return null;
        }

        public boolean isComplete() {
            return this.complete;
        }

        /* access modifiers changed from: package-private */
        public void release() {
            FileInputStream fileInputStream = this.fis;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.fis = null;
            }
            this.fileBuffer = null;
            this.fragmentBuffer = null;
        }
    }

    private class ProgressInfo {
        int maxProgress;
        int progress;
        private long sendFileSize = 0;
        private long totalFileSize;

        public ProgressInfo(long j) {
            this.totalFileSize = j;
        }

        public void updateMaxProgress() {
            int i = (int) ((this.sendFileSize * 100) / this.totalFileSize);
            this.maxProgress = i;
            if (i > 100) {
                this.maxProgress = 100;
            }
        }

        public void updateSendSize(int i) {
            this.sendFileSize += (long) i;
        }
    }

    private interface SendCommandCallback {
        void onFailure(int i, String str);

        void onSuccess(byte[] bArr);
    }

    private class SendCommandRequest {
        int opcode;
        SendCommandCallback sendCallback;

        public SendCommandRequest(int i, SendCommandCallback sendCommandCallback) {
            this.opcode = i;
            this.sendCallback = sendCommandCallback;
        }
    }

    private interface TransferFragmentCallback {
        void onFailure(int i, String str);

        void onSuccess(int i, int i2);
    }

    private MeshDfuManager() {
        this.mHandlerThread.start();
        this.mDfuHandler = new DfuHandler(this.mHandlerThread.getLooper());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.character_changed");
        intentFilter.addAction("action.connect_status_changed");
        BluetoothUtils.registerReceiver(this.mBluetoothReceiver, intentFilter);
    }

    /* access modifiers changed from: private */
    public void getFragmentSize() {
        sendCommand(2, (byte[]) null, new SendCommandCallback() {
            public void onFailure(int i, String str) {
                MeshDfuManager.this.onUpgradeFailed(i, str);
            }

            public void onSuccess(byte[] bArr) {
                MeshDfuManager meshDfuManager;
                String str;
                if (bArr == null || bArr.length < 2) {
                    meshDfuManager = MeshDfuManager.this;
                    str = "get fragment size failed";
                } else {
                    short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
                    if (s > 0) {
                        MeshDfuManager.this.sendData(s);
                        return;
                    } else {
                        meshDfuManager = MeshDfuManager.this;
                        str = "fragment size is 0";
                    }
                }
                meshDfuManager.onUpgradeFailed(-1, str);
            }
        });
    }

    public static MeshDfuManager getInstance() {
        if (sInstance == null) {
            synchronized (MeshDfuManager.class) {
                if (sInstance == null) {
                    sInstance = new MeshDfuManager();
                }
            }
        }
        return sInstance;
    }

    private void invokeResponse(IBleMeshUpgradeResponse iBleMeshUpgradeResponse, int i, String str) {
        if (iBleMeshUpgradeResponse != null) {
            iBleMeshUpgradeResponse.onResponse(i, str);
        }
    }

    private boolean isFileExist(String str) {
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    /* access modifiers changed from: private */
    public void onUpgradeFailed(int i, String str) {
        BluetoothLog.m10338v(String.format("MeshDfuManager onUpgradeFailed errorCode = %d, errorMsg = %s", new Object[]{Integer.valueOf(i), str}));
        invokeResponse(this.mResponse, i, str);
        release();
    }

    /* access modifiers changed from: private */
    public void onUpgradeSuccess() {
        BluetoothLog.m10338v("MeshDfuManager onUpgradeSuccess ");
        invokeResponse(this.mResponse, 0, (String) null);
        release();
    }

    private void openCommandNotify() {
        MiotBleClient.getInstance().notify(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                if (i == 0) {
                    MeshDfuManager.this.openDataNotify();
                } else {
                    MeshDfuManager.this.onUpgradeFailed(-1, "open command notify failed");
                }
            }
        });
    }

    private void processCommandEvent(DfuCommandCompleteEvent dfuCommandCompleteEvent) {
        SendCommandRequest sendCommandRequest = this.mLastSendCommandRequest;
        if (sendCommandRequest == null || sendCommandRequest.opcode != dfuCommandCompleteEvent.getCommandOpcode()) {
            BluetoothLog.m10338v(String.format("MeshDfuManager processCommandEvent (%s) error, can't find callback", new Object[]{dfuCommandCompleteEvent.toString()}));
            return;
        }
        this.mDfuHandler.removeMessages(MSG_SEND_COMMAND_TIMEOUT);
        if (this.mLastSendCommandRequest.sendCallback != null) {
            if (dfuCommandCompleteEvent.getStatus() == 0) {
                this.mLastSendCommandRequest.sendCallback.onSuccess(dfuCommandCompleteEvent.getValue());
            } else {
                this.mLastSendCommandRequest.sendCallback.onFailure(-1, (String) null);
                BluetoothLog.m10338v(String.format("MeshDfuManager processCommandEvent (%s) error, status failed", new Object[]{dfuCommandCompleteEvent.toString()}));
            }
        }
        this.mLastSendCommandRequest = null;
    }

    /* access modifiers changed from: private */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        ChannelManager.BleChannel channel;
        if (!BluetoothConstants.MISERVICE.equals(uuid)) {
            return;
        }
        if (BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT.equals(uuid2)) {
            if (bArr != null && bArr.length > 0) {
                byte b = bArr[0];
                if (b == 1) {
                    processCommandEvent(new DfuCommandCompleteEvent(bArr));
                } else if (b == 2) {
                    processTransferEvent(new DfuTransferCompleteEvent(bArr));
                }
            }
        } else if (BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT.equals(uuid2) && (channel = MeshDfuChannelManager.getInstance().getChannel(this.mUpgradeMac)) != null) {
            channel.onRead(bArr);
        }
    }

    private void processTransferEvent(DfuTransferCompleteEvent dfuTransferCompleteEvent) {
        String str;
        if (this.mTransferFragmentCallback == null) {
            str = String.format("MeshDfuManager processTransferEvent (%s) error, can't find callback", new Object[]{dfuTransferCompleteEvent.toString()});
        } else if (dfuTransferCompleteEvent.getStatus() == 0) {
            this.mTransferFragmentCallback.onSuccess(dfuTransferCompleteEvent.getStatus(), dfuTransferCompleteEvent.getIndex());
            return;
        } else {
            this.mTransferFragmentCallback.onFailure(-1, (String) null);
            str = String.format("MeshDfuManager processTransferEvent (%s) error, status failed", new Object[]{dfuTransferCompleteEvent.toString()});
        }
        BluetoothLog.m10338v(str);
    }

    private void release() {
        if (this.mChannelWriter != null) {
            MeshDfuChannelManager.getInstance().unregisterChannelReader(this.mUpgradeMac, this.mChannelReader);
            this.mChannelWriter = null;
        }
        MeshFileLoader meshFileLoader = this.mMeshFileLoader;
        if (meshFileLoader != null) {
            meshFileLoader.release();
            this.mMeshFileLoader = null;
        }
        this.mDfuHandler.removeMessages(MSG_SEND_COMMAND_TIMEOUT);
        this.mDfuHandler.removeMessages(MSG_UPDATE_PROGRESS);
        this.mLastSendCommandRequest = null;
        this.mTransferFragmentCallback = null;
        this.mResponse = null;
        this.mIsUpdating = false;
        this.mUpgradeMac = null;
        this.mFilePath = null;
        this.mProgressInfo = null;
    }

    private void sendCommand(int i, byte[] bArr, final SendCommandCallback sendCommandCallback) {
        "upgrade mac = " + this.mUpgradeMac;
        try {
            DfuCommand dfuCommand = new DfuCommand(i, bArr);
            this.mLastSendCommandRequest = new SendCommandRequest(i, sendCommandCallback);
            this.mDfuHandler.sendEmptyMessageDelayed(MSG_SEND_COMMAND_TIMEOUT, 10000);
            MiotBleClient.getInstance().write(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT, dfuCommand.toBytes(), new BleWriteResponse() {
                public void onResponse(int i) {
                    "upgrade sendCommand code = " + i;
                    if (i != 0) {
                        SendCommandRequest unused = MeshDfuManager.this.mLastSendCommandRequest = null;
                        MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_SEND_COMMAND_TIMEOUT);
                        sendCommandCallback.onFailure(i, "send command failed");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            sendCommandCallback.onFailure(-8, "params exceed max size");
        }
    }

    /* access modifiers changed from: private */
    public void sendData(int i) {
        BluetoothLog.m10338v("MeshDfuManager sendData fragmentSize = " + i);
        File file = new File(this.mFilePath);
        if (!file.exists()) {
            onUpgradeFailed(-1, "file don't exist");
            return;
        }
        long length = file.length();
        BluetoothLog.m10338v("MeshDfuManager sendData fileLength = " + length);
        this.mProgressUpdateInterval = (length / 512) * 10;
        this.mProgressInfo = new ProgressInfo(length);
        this.mMeshFileLoader = new MeshFileLoader(this.mFilePath, i);
        sendFragmentData();
    }

    /* access modifiers changed from: private */
    public void sendFragmentData() {
        MeshFileLoader meshFileLoader = this.mMeshFileLoader;
        if (meshFileLoader != null) {
            if (meshFileLoader.isComplete()) {
                switchFirmware();
                return;
            }
            byte[] fragmentBuffer = this.mMeshFileLoader.getFragmentBuffer();
            if (fragmentBuffer == null) {
                BluetoothLog.m10334d("MeshDfuManager sendFragmentData buffer is null");
                onUpgradeFailed(-1, "read file error");
                return;
            }
            this.mProgressInfo.updateSendSize(fragmentBuffer.length);
            this.mProgressInfo.updateMaxProgress();
            this.mDfuHandler.removeMessages(MSG_UPDATE_PROGRESS);
            this.mDfuHandler.sendEmptyMessage(MSG_UPDATE_PROGRESS);
            StringBuilder sb = new StringBuilder();
            sb.append("MeshDfuManager sendFragmentData fragment index = ");
            sb.append(this.mMeshFileLoader.fragmentIndex - 1);
            BluetoothLog.m10338v(sb.toString());
            transferFragment(fragmentBuffer, new TransferFragmentCallback() {
                public void onFailure(int i, String str) {
                    MeshDfuManager.this.onUpgradeFailed(i, str);
                }

                public void onSuccess(int i, int i2) {
                    MeshDfuManager.this.mDfuHandler.sendEmptyMessage(MeshDfuManager.MSG_SEND_NEXT_FRAGMENT);
                }
            });
        }
    }

    private void switchFirmware() {
        BluetoothLog.m10338v("MeshDfuManager switchFirmware");
        sendCommand(4, ByteUtils.fromInt(1), new SendCommandCallback() {
            public void onFailure(int i, String str) {
                MeshDfuManager.this.onUpgradeFailed(i, str);
            }

            public void onSuccess(byte[] bArr) {
                if (MeshDfuManager.this.mResponse != null) {
                    MeshDfuManager.this.mResponse.onProgress(100);
                }
                MeshDfuManager.this.onUpgradeSuccess();
            }
        });
    }

    private void transferFragment(byte[] bArr, final TransferFragmentCallback transferFragmentCallback) {
        String str;
        IBleChannelWriter iBleChannelWriter = this.mChannelWriter;
        if (iBleChannelWriter == null) {
            str = "channel write is null";
        } else {
            try {
                this.mTransferFragmentCallback = transferFragmentCallback;
                iBleChannelWriter.write(bArr, 0, new IResponse() {
                    public IBinder asBinder() {
                        return null;
                    }

                    public void onResponse(int i, Bundle bundle) {
                        if (i != 0) {
                            TransferFragmentCallback unused = MeshDfuManager.this.mTransferFragmentCallback = null;
                            transferFragmentCallback.onFailure(i, "channel write failed");
                        }
                    }
                });
                return;
            } catch (RemoteException e) {
                e.printStackTrace();
                str = "channel write exception";
            }
        }
        transferFragmentCallback.onFailure(-1, str);
    }

    public void cancelUpgrade(String str) {
        BluetoothLog.m10338v(String.format("MeshDfuManager cancelUpgrade mac = %s", new Object[]{str}));
        if (this.mIsUpdating && TextUtils.equals(str, this.mUpgradeMac)) {
            onUpgradeFailed(-2, "cancel upgrade");
        }
    }

    /* access modifiers changed from: protected */
    public void openDataNotify() {
        MiotBleClient.getInstance().notify(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                if (i == 0) {
                    MeshDfuManager.this.getFragmentSize();
                } else {
                    MeshDfuManager.this.onUpgradeFailed(-1, "open data notify failed");
                }
            }
        });
    }

    public void startUpgrade(String str, String str2, IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        BluetoothLog.m10338v(String.format("MeshDfuManager startUpgrade mac = %s, filePath = %s", new Object[]{str, str2}));
        if (iBleMeshUpgradeResponse == null) {
            BluetoothLog.m10334d("MeshDfuManager startUpdate failed, callback is null");
        } else if (TextUtils.isEmpty(str)) {
            BluetoothLog.m10334d("MeshDfuManager startUpdate failed, mac is null");
            invokeResponse(iBleMeshUpgradeResponse, -1, "mac is null");
        } else if (this.mIsUpdating) {
            BluetoothLog.m10334d("MeshDfuManager startUpdate failed, has another updating");
            invokeResponse(iBleMeshUpgradeResponse, -1, "has another updating");
        } else if (!isFileExist(str2)) {
            BluetoothLog.m10334d("MeshDfuManager startUpdate failed, file is not exist : " + str2);
            invokeResponse(iBleMeshUpgradeResponse, -1, "file is not exist");
        } else {
            this.mIsUpdating = true;
            this.mUpgradeMac = str;
            this.mFilePath = str2;
            this.mResponse = iBleMeshUpgradeResponse;
            this.mChannelWriter = MeshDfuChannelManager.getInstance().registerChannelReader(str, this.mChannelReader);
            openCommandNotify();
        }
    }
}
