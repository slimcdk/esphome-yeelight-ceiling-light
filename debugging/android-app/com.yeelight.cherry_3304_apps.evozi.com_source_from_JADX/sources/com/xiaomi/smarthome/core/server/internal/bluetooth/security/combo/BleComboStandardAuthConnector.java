package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.service.log.MyLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.SecretKey;
import miot.bluetooth.security.IBleDeviceLauncher;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.encryption.BleSecurityChipEncrypt;
import miot.bluetooth.security.standardauth.BleStandardAuthConnector;
import miot.bluetooth.security.utils.ECCPointConvert;
import miot.bluetooth.security.utils.Hkdf;
import miot.bluetooth.security.utils.SecurityChipUtil;

public class BleComboStandardAuthConnector extends BleStandardAuthConnector {
    private static final byte[] ERR_REGISTERED = {-31, 0, 0, 0};
    private static final int MSG_NOTIFY_TIMEOUT = 4102;
    private static final byte[] REG_FAILED = {ParameterInitDefType.DoubleVec2Init, 0, 0, 0};
    private static final byte[] REG_SUCCESS = {ParameterInitDefType.DoubleInit, 0, 0, 0};
    private static final byte[] REG_VERIFY_FAILED = {ParameterInitDefType.DoubleVec4Init, 0, 0, 0};
    private static final byte[] REG_VERIFY_SUCCESS = {ParameterInitDefType.DoubleVec3Init, 0, 0, 0};
    private static final byte[] REQ_DEV_INFO = {-94, 0, 0, 0};
    private static final int SUPPORT_STANDARD_AUTH_VERSION = 1;
    private static final String TAG = "BleComboStandardAuthConnector";
    private SecretKey eShareKey;
    private byte[] mAppIv;
    private byte[] mAppKey;
    private int mCurrentStandardAuthVersion;
    private byte[] mDevIv;
    private byte[] mDeviceKey;
    private PublicKey mDevicePubKey;
    /* access modifiers changed from: private */
    public String mDeviceVersion = "";
    private BleSecurityChipEncrypt.EncryptCounter mEncryptCounter = new BleSecurityChipEncrypt.EncryptCounter();
    private boolean mNeedRealOOB = false;
    private byte[] mOOB;
    private KeyPair mRegisterAppKeyPair;
    private byte[] mTempDeviceId;
    private BleComboWifiConfig mWifiConfig;

    public BleComboStandardAuthConnector(IBleDeviceLauncher iBleDeviceLauncher, BleComboWifiConfig bleComboWifiConfig) {
        super(iBleDeviceLauncher);
        this.mWifiConfig = bleComboWifiConfig;
    }

    private byte[] deriveKeyFromOOB(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf instance = Hkdf.getInstance("HmacSHA256");
            instance.init(bArr, bArr2);
            return instance.deriveKey("mible-setup-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] encryptAppData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.mEncryptCounter.addAppLowCounter();
        short appLowCounter = this.mEncryptCounter.getAppLowCounter();
        byte[] appNonce = this.mEncryptCounter.getAppNonce();
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr2, 0, bArr4, 0, 4);
        System.arraycopy(appNonce, 0, bArr4, 8, 4);
        byte[] AESEncrypt = SecurityChipUtil.AESEncrypt(bArr, bArr4, bArr3);
        if (AESEncrypt == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(AESEncrypt.length + 2).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) (65535 & appLowCounter));
        order.put(AESEncrypt);
        return order.array();
    }

    private byte[] generateWifiConfig() {
        return this.mWifiConfig.toBytes();
    }

    /* access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector Process Step 1 plus ...");
        openAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                MyLogger instance = MyLogger.getInstance();
                instance.log("BleComboStandardAuthConnector Step 1 plus onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.requestDeviceInfo();
                } else {
                    BleComboStandardAuthConnector.this.dispatchResult(-27);
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
        MyLogger instance = MyLogger.getInstance();
        instance.log("BleComboStandardAuthConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, REG_SUCCESS)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = 0;
        } else if (ByteUtils.equals(bArr, REG_FAILED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = -51;
        } else if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            i = -17;
        } else {
            return;
        }
        dispatchResult(i);
    }

    private void recvDeviceInfo(byte[] bArr) {
        MyLogger.getInstance().log("BleComboStandardAuthConnector recvDeviceInfo ...");
        if (bArr.length >= 4) {
            int i = bArr[0] + (bArr[1] << 8);
            this.mCurrentStandardAuthVersion = i;
            if (i > 1) {
                dispatchResult(-37);
                return;
            }
            if (bArr.length > 4) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 4, bArr.length);
                int i2 = 0;
                int i3 = 0;
                while (i2 < copyOfRange.length && copyOfRange[i2] != 0) {
                    i3 = i2;
                    i2++;
                }
                this.mTempDeviceId = Arrays.copyOfRange(copyOfRange, 0, i3 + 1);
            }
            MyLogger instance = MyLogger.getInstance();
            instance.log("BleComboStandardAuthConnector device id = " + getDidText());
            if (bArr[2] + (bArr[3] << 8) > 0) {
                this.mNeedRealOOB = true;
                dispatchResult(-37);
                return;
            }
            this.mNeedRealOOB = false;
            sendRegStart();
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector recvDeviceInfo data format error");
        dispatchResult(-47);
    }

    private void recvDevicePubKey(byte[] bArr) {
        MyLogger.getInstance().log("BleComboStandardAuthConnector recvDevicePubKey ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        byte[] bArr2 = new byte[65];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        try {
            this.mDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr2, ((ECPublicKey) this.mRegisterAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        verifyDeviceParams();
    }

    /* access modifiers changed from: private */
    public void requestDeviceInfo() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector requestDeviceInfo ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, REQ_DEV_INFO, new BleWriteResponse() {
            public void onResponse(int i) {
                MyLogger instance = MyLogger.getInstance();
                instance.log("BleComboStandardAuthConnector requestDeviceInfo onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.mHandler.removeMessages(BleComboStandardAuthConnector.MSG_NOTIFY_TIMEOUT);
                    BleComboStandardAuthConnector.this.mHandler.sendEmptyMessageDelayed(BleComboStandardAuthConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleComboStandardAuthConnector.this.dispatchResult(-28);
            }
        });
    }

    private byte[] requestOOB() {
        return new byte[16];
    }

    /* access modifiers changed from: private */
    public void sendAppPublicKey() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector sendAppPublicKey ...");
        KeyPair generateEcc256KeyPair = SecurityChipUtil.generateEcc256KeyPair();
        this.mRegisterAppKeyPair = generateEcc256KeyPair;
        if (!writeChannel(SecurityChipUtil.getRawPublicKey(generateEcc256KeyPair.getPublic()), 3, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                MyLogger instance = MyLogger.getInstance();
                instance.log("BleComboStandardAuthConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.mHandler.removeMessages(BleComboStandardAuthConnector.MSG_NOTIFY_TIMEOUT);
                    BleComboStandardAuthConnector.this.mHandler.sendEmptyMessageDelayed(BleComboStandardAuthConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleComboStandardAuthConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void sendRegStart() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector sendRegStart ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, new byte[]{21, 0, 0, 0}, new BleWriteResponse() {
            public void onResponse(int i) {
                MyLogger instance = MyLogger.getInstance();
                instance.log("BleComboStandardAuthConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.sendAppPublicKey();
                } else {
                    BleComboStandardAuthConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    private void sendWifiConfig(byte[] bArr) {
        MyLogger.getInstance().log("BleComboStandardAuthConnector sendWifiConfig");
        if (!writeChannel(bArr, 15, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                MyLogger instance = MyLogger.getInstance();
                instance.log("BleComboStandardAuthConnector sendWifiConfig onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.dispatchResult(0);
                } else {
                    BleComboStandardAuthConnector.this.dispatchResult(-28);
                }
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void startSendWifiConfigAfterAuthSuccess() {
        MyLogger.getInstance().log("BleComboStandardAuthConnector startSendWifiConfigAfterAuthSuccess");
        byte[] deriveKeyFromOOB = deriveKeyFromOOB(this.eShareKey.getEncoded(), this.mOOB);
        byte[] bArr = new byte[16];
        this.mDeviceKey = bArr;
        System.arraycopy(deriveKeyFromOOB, 0, bArr, 0, 16);
        byte[] bArr2 = new byte[16];
        this.mAppKey = bArr2;
        System.arraycopy(deriveKeyFromOOB, 16, bArr2, 0, 16);
        byte[] bArr3 = new byte[4];
        this.mDevIv = bArr3;
        System.arraycopy(deriveKeyFromOOB, 32, bArr3, 0, 4);
        byte[] bArr4 = new byte[4];
        this.mAppIv = bArr4;
        System.arraycopy(deriveKeyFromOOB, 36, bArr4, 0, 4);
        byte[] encryptAppData = encryptAppData(this.mAppKey, this.mAppIv, generateWifiConfig());
        if (encryptAppData == null) {
            MyLogger.getInstance().log("BleComboStandardAuthConnector encrypt wifi config failed");
            dispatchResult(-51);
            return;
        }
        sendWifiConfig(encryptAppData);
    }

    private void verifyDeviceParams() {
        MyLogger instance;
        String str;
        MyLogger instance2 = MyLogger.getInstance();
        instance2.log("BleComboStandardAuthConnector verifyDeviceParams ..., mNeedRealOOB = " + this.mNeedRealOOB);
        PublicKey publicKey = this.mDevicePubKey;
        if (publicKey == null) {
            instance = MyLogger.getInstance();
            str = "BleComboStandardAuthConnector mDevicePubKey is null ...";
        } else {
            SecretKey secret = SecurityChipUtil.getSecret(publicKey, this.mRegisterAppKeyPair.getPrivate());
            this.eShareKey = secret;
            if (secret == null) {
                instance = MyLogger.getInstance();
                str = "BleComboStandardAuthConnector eShareKey is null ...";
            } else if (this.mNeedRealOOB) {
                dispatchResult(-37);
                return;
            } else {
                this.mOOB = requestOOB();
                startSendWifiConfigAfterAuthSuccess();
                return;
            }
        }
        instance.log(str);
        dispatchResult(-51);
    }

    /* access modifiers changed from: protected */
    public String getDidText() {
        return ByteUtils.isEmpty(this.mTempDeviceId) ? "" : new String(this.mTempDeviceId);
    }

    /* access modifiers changed from: protected */
    public byte[] getGeneratedToken() {
        return null;
    }

    public int getInt(int i, int i2, int i3) {
        return (i >> i2) & ((1 << ((i3 - i2) + 1)) - 1);
    }

    /* access modifiers changed from: protected */
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
        } else if (i == 0) {
            recvDeviceInfo(bArr);
        } else if (i == 3) {
            recvDevicePubKey(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == MSG_NOTIFY_TIMEOUT) {
            MyLogger.getInstance().log("BleComboStandardAuthConnector notify timeout");
            dispatchResult(-55);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            receiveDeviceResult(bArr);
        } else if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_STANDARD_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        MyLogger.getInstance().log("BleComboStandardAuthConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        this.mEncryptCounter.resetAllCounter();
        getBleLockFirmwareVersion(getMac(), new BleResponse<String>() {
            public void onResponse(int i, String str) {
                String str2;
                MyLogger myLogger;
                if (i == 0) {
                    String unused = BleComboStandardAuthConnector.this.mDeviceVersion = str;
                    myLogger = MyLogger.getInstance();
                    str2 = "BleComboStandardAuthConnector get device version: " + str;
                } else {
                    myLogger = MyLogger.getInstance();
                    str2 = "BleComboStandardAuthConnector get device version failed";
                }
                myLogger.log(str2);
                BleComboStandardAuthConnector.this.openStandardAuthNotify(new BleNotifyResponse() {
                    public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
                    }

                    public void onResponse(int i) {
                        MyLogger instance = MyLogger.getInstance();
                        instance.log("BleComboStandardAuthConnector Step 1 onResponse: " + Code.toString(i));
                        if (i == 0) {
                            BleComboStandardAuthConnector.this.processStep1Plus();
                        } else {
                            BleComboStandardAuthConnector.this.dispatchResult(-27);
                        }
                    }
                });
            }
        });
    }
}
