package miot.bluetooth.security;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.channel.CRC32;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.utils.ECCPointConvert;
import miot.bluetooth.security.utils.Hkdf;
import miot.bluetooth.security.utils.SecurityChipUtil;

public class BleMeshLoginConnector extends BleSecurityChipConnector {
    public static final byte[] ERR_NOT_REGISTERED = {-32};
    private static final byte[] MESH_ADMIN_LOGIN_FAILED = {82};
    private static final byte[] MESH_ADMIN_LOGIN_START = {80};
    private static final byte[] MESH_ADMIN_LOGIN_SUCCESS = {81};
    private static final int MSG_NOTIFY_TIMEOUT = 4099;
    private static final String TAG = "BleMeshLoginConnector";
    private byte[] mGattLtmk;
    private KeyPair mLoginAppKeyPair;
    private PublicKey mLoginDevicePubKey;
    private byte[] mSessionKey;

    protected BleMeshLoginConnector(IBleDeviceLauncher iBleDeviceLauncher, byte[] bArr) {
        super(iBleDeviceLauncher);
        this.mGattLtmk = bArr;
    }

    private byte[] deriveLoginSessionKey(byte[] bArr) {
        try {
            Hkdf instance = Hkdf.getInstance("HmacSHA256");
            instance.init(bArr, "miot-mesh-login-salt".getBytes());
            return instance.deriveKey("miot-mesh-login-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 2 ...");
        openAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleMeshLoginConnector Step 2 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshLoginConnector.this.processStep3();
                } else {
                    BleMeshLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 3 ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, MESH_ADMIN_LOGIN_START, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7332v("BleMeshLoginConnector Step 3 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshLoginConnector.this.processStep4();
                } else {
                    BleMeshLoginConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void processStep4() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 4 ...");
        KeyPair generateEcc256KeyPair = SecurityChipUtil.generateEcc256KeyPair();
        this.mLoginAppKeyPair = generateEcc256KeyPair;
        if (!writeChannel(SecurityChipUtil.getRawPublicKey(generateEcc256KeyPair.getPublic()), 3, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m7332v("BleMeshLoginConnector Step 4 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshLoginConnector.this.mHandler.removeMessages(4099);
                    BleMeshLoginConnector.this.mHandler.sendEmptyMessageDelayed(4099, 10000);
                    return;
                }
                BleMeshLoginConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void processStep5(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 5 ...");
        this.mHandler.removeMessages(4099);
        processStep6(recvLoginDevicePubKey(bArr, this.mGattLtmk));
    }

    private void processStep6(byte[] bArr) {
        int i;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 6 ...");
        if (bArr != null) {
            this.mHandler.removeMessages(4099);
            this.mHandler.sendEmptyMessageDelayed(4099, 10000);
            if (!writeChannel(bArr, 5, new IResponse() {
                public IBinder asBinder() {
                    return null;
                }

                public void onResponse(int i, Bundle bundle) {
                    if (i != 0) {
                        BleMeshLoginConnector.this.dispatchResult(-28);
                    }
                }
            })) {
                i = -28;
            } else {
                return;
            }
        } else {
            BluetoothLog.m7332v("BleMeshLoginConnector Process Step 6 encryptData is null ... ");
            i = -21;
        }
        dispatchResult(i);
    }

    private void processStep7(byte[] bArr) {
        int i;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 7 ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, MESH_ADMIN_LOGIN_SUCCESS)) {
            this.mHandler.removeMessages(4099);
            this.mBundle.putByteArray(BluetoothConstants.KEY_SESSION_KEY, this.mSessionKey);
            i = 0;
        } else if (ByteUtils.equals(bArr, MESH_ADMIN_LOGIN_FAILED)) {
            this.mHandler.removeMessages(4099);
            i = -22;
        } else if (ByteUtils.equals(bArr, ERR_NOT_REGISTERED)) {
            this.mHandler.removeMessages(4099);
            i = -16;
        } else {
            return;
        }
        dispatchResult(i);
    }

    private byte[] recvLoginDevicePubKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[65];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        try {
            this.mLoginDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr3, ((ECPublicKey) this.mLoginAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            byte[] bArr4 = new byte[64];
            System.arraycopy(SecurityChipUtil.getSecret(this.mLoginDevicePubKey, this.mLoginAppKeyPair.getPrivate()).getEncoded(), 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 0, bArr4, 32, 32);
            byte[] deriveLoginSessionKey = deriveLoginSessionKey(bArr4);
            this.mSessionKey = deriveLoginSessionKey;
            return SecurityChipUtil.AESEncrypt(Arrays.copyOfRange(deriveLoginSessionKey, 16, 32), new byte[]{ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, 26, 27}, CRC32.get(bArr));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onChannelRead(byte[] bArr, int i) {
        if (i == 3) {
            processStep5(bArr);
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            this.mHandler.postDelayed(runnable, j);
        }
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == 4099) {
            BluetoothLog.m7333w("BleMeshLoginConnector notify timeout");
            dispatchResult(-7);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            processStep7(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_SECURE_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleMeshLoginConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleMeshLoginConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshLoginConnector.this.processStep2();
                } else {
                    BleMeshLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
