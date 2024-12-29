package miot.bluetooth.security;

import android.os.Message;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.util.Arrays;
import java.util.UUID;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.rc4.BleRc4Connector;

public class BleLoginConnector extends BleRc4Connector {
    private static final int MSG_NOTIFY_CONFIRM_TIMEOUT = 2;
    private static final int MSG_NOTIFY_TICK_TIMEOUT = 1;
    private static final int SESSION_CONFIRM = 916084937;
    private static final int SESSION_END = -1816155127;
    private static final int SESSION_START = -851198976;
    private static final int TICK_LEN = 4;
    private final BleNotifyResponse mBleNotifyResponse = new BleNotifyResponse() {
        public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        }

        public void onResponse(int i) {
            if (i == 0) {
                BleLoginConnector.this.processStep2();
            } else {
                BleLoginConnector.this.dispatchResult(-1);
            }
        }
    };
    private byte[] mEncryptKey;

    protected BleLoginConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    private void processConfirmNotify(byte[] bArr) {
        byte[] encrypt = BLECipher.encrypt(this.mEncryptKey, bArr);
        BluetoothLog.m10334d("processConfirmNotify " + ByteUtils.byteToString(encrypt));
        if (ByteUtils.byteEquals(Arrays.copyOfRange(encrypt, 0, 4), ByteUtils.fromInt(SESSION_CONFIRM))) {
            dispatchResult(0);
            return;
        }
        BluetoothCache.removePropToken(getMac());
        dispatchResult(-11);
    }

    private void processConfirmNotifyTimeout() {
        dispatchResult(willNotifyTokenNotMatch() ? -7 : -11);
    }

    /* access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10334d("process step 2");
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_EVENT, ByteUtils.fromInt(SESSION_START), new BleWriteResponse() {
            public void onResponse(int i) {
            }
        });
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, 10000);
    }

    private void processStep3(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10334d("process step 3");
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m10334d("MiotBleClient.getInstance().write  code" + i);
            }
        });
        this.mHandler.removeMessages(2);
        this.mHandler.sendEmptyMessageDelayed(2, 10000);
    }

    private void processTickNotify(byte[] bArr) {
        BluetoothLog.m10334d("processTickNotify " + ByteUtils.byteToString(bArr));
        if (bArr == null || bArr.length < 4) {
            dispatchResult(-11);
            return;
        }
        byte[] token = getToken();
        byte[] encrypt = BLECipher.encrypt(token, bArr);
        BluetoothLog.m10338v("processTickNotify tick = " + ByteUtils.byteToString(encrypt));
        this.mEncryptKey = Arrays.copyOfRange(token, 0, token.length);
        for (int i = 0; i < 4; i++) {
            byte[] bArr2 = this.mEncryptKey;
            bArr2[i] = (byte) (bArr2[i] ^ encrypt[i]);
        }
        BluetoothLog.m10338v("processTickNotify mEncryptKey = " + ByteUtils.byteToString(this.mEncryptKey));
        processStep3(BLECipher.encrypt(this.mEncryptKey, ByteUtils.fromInt(SESSION_END)));
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            BluetoothLog.m10339w("tick notify timeout");
            this.mHandler.removeMessages(1);
            dispatchResult(-7);
        } else if (i == 2) {
            BluetoothLog.m10339w("confirm notify timeout");
            this.mHandler.removeMessages(2);
            processConfirmNotifyTimeout();
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_TOKEN)) {
            if (this.mHandler.hasMessages(1)) {
                BluetoothLog.m10334d("login onNotify tick");
                this.mHandler.removeMessages(1);
                processTickNotify(bArr);
            } else if (this.mHandler.hasMessages(2)) {
                BluetoothLog.m10334d("login onNotify confirm");
                this.mHandler.removeMessages(2);
                processConfirmNotify(bArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10334d("process step 1 ...");
        openTokenNotify(this.mBleNotifyResponse);
    }
}
