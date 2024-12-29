package miot.bluetooth.security;

import android.os.Bundle;
import android.os.Message;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.MD5Utils;
import com.inuker.bluetooth.library.utils.RandomUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.util.UUID;

public class BleRegisterConnector extends BleSecurityConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 1;
    private static final int SESSION_END = -95114350;
    private static final int SESSION_START = -561657200;
    private final BleNotifyResponse mBleNotifyResponse = new BleNotifyResponse() {
        public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        }

        public void onResponse(int i) {
            BluetoothLog.m7328d("Step2 onResponse: " + i);
            if (i == 0) {
                BleRegisterConnector.this.processStep3();
            } else {
                BleRegisterConnector.this.dispatchResult(-27);
            }
        }
    };
    protected boolean mNeedBindToServer = true;
    private byte[] mTempToken;

    protected BleRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    public static byte[] generateToken() {
        return MD5Utils.MD5_12(String.format("token.%d.%f", new Object[]{Long.valueOf(System.currentTimeMillis()), Double.valueOf(RandomUtils.randFloat())}));
    }

    /* access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7328d("process step 2 ...");
        openTokenNotify(this.mBleNotifyResponse);
    }

    /* access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7328d("process step 3");
        this.mTempToken = generateToken();
        BluetoothLog.m7328d("Generated token: " + ByteUtils.byteToString(this.mTempToken));
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, BLECipher.encrypt(BLECipher.mixA(getMac(), getProductId()), this.mTempToken), new BleWriteResponse() {
            public void onResponse(int i) {
            }
        });
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, 10000);
    }

    private void processStep4() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7328d("process step 4 ...");
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, BLECipher.encrypt(this.mTempToken, ByteUtils.fromInt(SESSION_END)), new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7328d("Step4 onResponse: " + i);
                BleRegisterConnector.this.dispatchResult(i);
            }
        });
    }

    public boolean checkBindAbility() {
        return this.mNeedBindToServer;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = ((com.inuker.bluetooth.library.model.BleGattProfile) r3.getParcelable(com.inuker.bluetooth.library.Constants.EXTRA_GATT_PROFILE)).getService(com.miot.bluetooth.BluetoothConstants.MISERVICE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkNeedBindToServer(android.os.Bundle r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "extra.gatt.profile"
            android.os.Parcelable r3 = r3.getParcelable(r1)
            com.inuker.bluetooth.library.model.BleGattProfile r3 = (com.inuker.bluetooth.library.model.BleGattProfile) r3
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.MISERVICE
            com.inuker.bluetooth.library.model.BleGattService r3 = r3.getService(r1)
            if (r3 == 0) goto L_0x0025
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.CHARACTER_SN
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0025
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.CHARACTER_BEACONKEY
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 1
            r0 = 1
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.BleRegisterConnector.checkNeedBindToServer(android.os.Bundle):boolean");
    }

    /* access modifiers changed from: protected */
    public byte[] getGeneratedToken() {
        return this.mTempToken;
    }

    /* access modifiers changed from: protected */
    public void onConnectSuccess(Bundle bundle) {
        this.mNeedBindToServer = checkNeedBindToServer(bundle);
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == 1) {
            BluetoothLog.m7333w("notify timeout");
            dispatchResult(-7);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_TOKEN) && this.mHandler.hasMessages(1)) {
            this.mHandler.removeMessages(1);
            if (ByteUtils.byteEquals(BLECipher.encrypt(BLECipher.mixB(getMac(), getProductId()), BLECipher.encrypt(BLECipher.mixA(getMac(), getProductId()), bArr)), this.mTempToken)) {
                processStep4();
                return;
            }
            BluetoothLog.m7333w("token not match");
            dispatchResult(-11);
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7328d("process step 1 ...");
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_EVENT, ByteUtils.fromInt(SESSION_START), new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7328d("Step1 onResponse: " + i);
                if (i == 0) {
                    BleRegisterConnector.this.processStep2();
                } else {
                    BleRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }
}
