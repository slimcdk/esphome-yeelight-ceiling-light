package miot.bluetooth.security.standardauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import miot.bluetooth.security.IBleDeviceLauncher;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.utils.Hkdf;
import miot.bluetooth.security.utils.SecurityChipUtil;

public class BleStandardAuthLoginConnector extends BleStandardAuthConnector {
    private static final byte[] ERR_NOT_REGISTERED = {-32};
    private static final byte[] ERR_RELOGIN = {-30};
    private static final byte[] LOGIN_FAILED = {34};
    private static final byte[] LOGIN_START_W_RANDOM = {36};
    private static final byte[] LOGIN_SUCCESS = {33};
    private static final byte[] LOG_DECRYPT_FAILED = {35};
    private static final int MSG_NOTIFY_TIMEOUT = 4103;
    private static final String TAG = "BleStandardAuthLoginConnector";
    private byte[] mAppConfirm;
    private byte[] mAppIv;
    private byte[] mAppKey;
    private byte[] mAppRandom;
    private byte[] mDevIv;
    private byte[] mDevKey;
    private byte[] mDeviceRandom;
    private byte[] mSessionKey;

    protected BleStandardAuthLoginConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    private byte[] deriveSessionKey(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf instance = Hkdf.getInstance("HmacSHA256");
            instance.init(bArr, bArr2);
            return instance.deriveKey("mible-login-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] generateAppRandom() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthLoginConnector Process Step 1 plus ...");
        openAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthLoginConnector Step 1 plus onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.sendLoginStart();
                } else {
                    BleStandardAuthLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    private void receiveDeviceResult(byte[] bArr) {
        int i;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthLoginConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, LOGIN_SUCCESS)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            this.mBundle.putByteArray(BluetoothConstants.KEY_SESSION_KEY, this.mSessionKey);
            i = 0;
        } else if (ByteUtils.equals(bArr, LOGIN_FAILED) || ByteUtils.equals(bArr, LOG_DECRYPT_FAILED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = -52;
        } else if (ByteUtils.equals(bArr, ERR_NOT_REGISTERED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = -16;
        } else if (ByteUtils.equals(bArr, ERR_RELOGIN)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = -53;
        } else {
            return;
        }
        dispatchResult(i);
    }

    private void recvDevConfirmation(byte[] bArr) {
        BluetoothLog.m7332v("BleStandardAuthLoginConnector recvDevConfirmation ...");
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        byte[] bArr2 = this.mDeviceRandom;
        byte[] bArr3 = new byte[(bArr2.length + this.mAppRandom.length)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = this.mAppRandom;
        System.arraycopy(bArr4, 0, bArr3, this.mDeviceRandom.length, bArr4.length);
        if (ByteUtils.equals(bArr, SecurityChipUtil.sha256HMAC(this.mDevKey, bArr3))) {
            BluetoothLog.m7332v("BleStandardAuthLoginConnector verify device confirm success ...");
            sendAppConfirm();
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 10000);
            return;
        }
        dispatchResult(-52);
    }

    private void recvDevRandom(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7328d("BleStandardAuthLoginConnector recvDevRandom ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mDeviceRandom = bArr;
        byte[] bArr2 = this.mAppRandom;
        byte[] bArr3 = new byte[(bArr2.length + bArr.length)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = this.mDeviceRandom;
        System.arraycopy(bArr4, 0, bArr3, this.mAppRandom.length, bArr4.length);
        byte[] deriveSessionKey = deriveSessionKey(getToken(), bArr3);
        this.mSessionKey = deriveSessionKey;
        if (deriveSessionKey == null) {
            dispatchResult(-52);
            return;
        }
        byte[] bArr5 = new byte[16];
        this.mDevKey = bArr5;
        System.arraycopy(deriveSessionKey, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[16];
        this.mAppKey = bArr6;
        System.arraycopy(this.mSessionKey, 16, bArr6, 0, 16);
        byte[] bArr7 = new byte[4];
        this.mDevIv = bArr7;
        System.arraycopy(this.mSessionKey, 32, bArr7, 0, 4);
        byte[] bArr8 = new byte[4];
        this.mAppIv = bArr8;
        System.arraycopy(this.mSessionKey, 36, bArr8, 0, 4);
        this.mAppConfirm = SecurityChipUtil.sha256HMAC(this.mAppKey, bArr3);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 10000);
    }

    private void sendAppConfirm() {
        int i;
        BluetoothLog.m7332v("BleStandardAuthLoginConnector sendAppConfirm ...");
        if (isCanceled()) {
            i = -2;
        } else if (ByteUtils.isEmpty(this.mAppConfirm)) {
            BluetoothLog.m7332v("BleStandardAuthLoginConnector sendAppConfirm mAppConfirm is empty");
            i = -52;
        } else if (!writeChannel(this.mAppConfirm, 10, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m7332v("BleStandardAuthLoginConnector sendAppConfirm onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.mHandler.removeMessages(BleStandardAuthLoginConnector.MSG_NOTIFY_TIMEOUT);
                    BleStandardAuthLoginConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthLoginConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleStandardAuthLoginConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
            return;
        } else {
            return;
        }
        dispatchResult(i);
    }

    /* access modifiers changed from: private */
    public void sendAppRandom() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthLoginConnector sendAppRandom ...");
        byte[] generateAppRandom = generateAppRandom();
        this.mAppRandom = generateAppRandom;
        if (!writeChannel(generateAppRandom, 11, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m7332v("BleStandardAuthLoginConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.mHandler.removeMessages(BleStandardAuthLoginConnector.MSG_NOTIFY_TIMEOUT);
                    BleStandardAuthLoginConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthLoginConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleStandardAuthLoginConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    /* access modifiers changed from: private */
    public void sendLoginStart() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthLoginConnector sendLoginStart ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, LOGIN_START_W_RANDOM, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthLoginConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.sendAppRandom();
                } else {
                    BleStandardAuthLoginConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
        } else if (i == 12) {
            recvDevConfirmation(bArr);
        } else if (i == 13) {
            recvDevRandom(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == MSG_NOTIFY_TIMEOUT) {
            BluetoothLog.m7333w("BleStandardAuthLoginConnector notify timeout");
            dispatchResult(-7);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            receiveDeviceResult(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_STANDARD_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthLoginConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openStandardAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthLoginConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.processStep1Plus();
                } else {
                    BleStandardAuthLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
