package miot.bluetooth.security.standardauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.response.BleReadResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.ResponseHandler;
import com.xiaomi.mipush.sdk.Constants;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import miot.bluetooth.security.IBleDeviceLauncher;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.utils.ECCPointConvert;
import miot.bluetooth.security.utils.Hkdf;
import miot.bluetooth.security.utils.SecurityChipUtil;
import org.json.JSONObject;

public class BleStandardAuthRegisterConnector extends BleStandardAuthConnector {
    private static final byte[] ERR_REGISTERED = {-31};
    private static final int MSG_NOTIFY_TIMEOUT = 4102;
    private static final byte[] REG_FAILED = {ParameterInitDefType.DoubleVec2Init};
    private static final byte[] REG_SUCCESS = {ParameterInitDefType.DoubleInit};
    private static final byte[] REG_VERIFY_FAILED = {ParameterInitDefType.DoubleVec4Init};
    private static final byte[] REG_VERIFY_SUCCESS = {ParameterInitDefType.DoubleVec3Init};
    private static final byte[] REQ_DEV_INFO = {-94};
    private static final int SUPPORT_STANDARD_AUTH_VERSION = 1;
    private static final String TAG = "BleStandardAuthRegisterConnector";
    /* access modifiers changed from: private */
    public SecretKey eShareKey;
    private byte[] mAppConfirmation;
    private byte[] mAppRandom;
    private final BleReadResponse mApplyDidResponse = new BleReadResponse() {
        public void onResponse(int i, byte[] bArr) {
            if (i != 0) {
                BleStandardAuthRegisterConnector.this.writeBindResultToDevice(false, new BleWriteResponse() {
                    public void onResponse(int i) {
                        BleStandardAuthRegisterConnector.this.dispatchResult(i);
                    }
                });
            } else if (!ByteUtils.isEmpty(bArr)) {
                if (!ByteUtils.isEmpty(BleStandardAuthRegisterConnector.this.mTempDeviceId) && !ByteUtils.byteEquals(BleStandardAuthRegisterConnector.this.mTempDeviceId, bArr)) {
                    BluetoothLog.m7329e("BleStandardAuthRegisterConnector device did don't match server did, device did = " + ByteUtils.byteToString(BleStandardAuthRegisterConnector.this.mTempDeviceId) + ", server did = " + ByteUtils.byteToString(bArr));
                }
                byte[] unused = BleStandardAuthRegisterConnector.this.mTempDeviceId = bArr;
                byte[] fillBeforeBytes = ByteUtils.fillBeforeBytes(bArr, 20, (byte) 0);
                BluetoothLog.m7333w("BleStandardAuthRegisterConnector write Did to Device: " + ByteUtils.byteToString(fillBeforeBytes));
                BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                bleStandardAuthRegisterConnector.writeDidToDevice(fillBeforeBytes, bleStandardAuthRegisterConnector.mWriteDidResponse);
            } else {
                throw new IllegalStateException("strange exception");
            }
        }
    };
    private byte[] mBeaconKey;
    /* access modifiers changed from: private */
    public final BleWriteResponse mBindDidResponse = new BleWriteResponse() {
        public void onResponse(int i) {
            BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector;
            BleWriteResponse bleWriteResponse;
            boolean z;
            if (i == 0) {
                BluetoothCache.setPropBoundStatus(BleStandardAuthRegisterConnector.this.getMac(), 2);
                bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                z = true;
                bleWriteResponse = new BleWriteResponse() {
                    public void onResponse(int i) {
                        BleStandardAuthRegisterConnector.this.mHandler.removeMessages(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT);
                        BleStandardAuthRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    }
                };
            } else {
                bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                z = false;
                bleWriteResponse = new BleWriteResponse() {
                    public void onResponse(int i) {
                        BleStandardAuthRegisterConnector.this.dispatchResult(i);
                    }
                };
            }
            bleStandardAuthRegisterConnector.writeBindResultToDevice(z, bleWriteResponse);
        }
    };
    private int mCurrentStandardAuthVersion;
    /* access modifiers changed from: private */
    public byte[] mDevConfirmation;
    private byte[] mDeviceKey;
    private byte[] mDevicePubInfo;
    private PublicKey mDevicePubKey;
    private int mInputCapability;
    /* access modifiers changed from: private */
    public byte[] mOOB;
    private int mOutputCapability;
    private String mQrcodeOob;
    private KeyPair mRegisterAppKeyPair;
    /* access modifiers changed from: private */
    public byte[] mTempDeviceId;
    private byte[] mToken;
    /* access modifiers changed from: private */
    public final BleWriteResponse mWriteDidResponse = new BleWriteResponse() {
        public void onResponse(int i) {
            if (i == 0) {
                BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                bleStandardAuthRegisterConnector.bindDidToServer(bleStandardAuthRegisterConnector.mBindDidResponse);
                return;
            }
            BleStandardAuthRegisterConnector.this.dispatchResult(i);
        }
    };

    public BleStandardAuthRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher, String str) {
        super(iBleDeviceLauncher);
        this.mQrcodeOob = str;
    }

    private void applyDid(final BleReadResponse bleReadResponse) {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector applyDid");
        MiotBleClient.getInstance().getDeviceSN(getDidText(), getMac(), MiotBleClient.getInstance().getConfig().getModel(), getTokenText(), new ResponseHandler() {
            public void onFailure(int i, String str) {
                BluetoothLog.m7333w("BleStandardAuthRegisterConnector >>> getDeviceSN failed, code = " + i + ", description: " + str);
                bleReadResponse.onResponse(-29, null);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
                r3 = r3.optJSONObject("result");
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(org.json.JSONObject r3) {
                /*
                    r2 = this;
                    if (r3 == 0) goto L_0x001f
                    java.lang.String r0 = "code"
                    boolean r1 = r3.has(r0)
                    if (r1 == 0) goto L_0x001f
                    int r0 = r3.optInt(r0)
                    if (r0 != 0) goto L_0x001f
                    java.lang.String r0 = "result"
                    org.json.JSONObject r3 = r3.optJSONObject(r0)
                    if (r3 == 0) goto L_0x001f
                    java.lang.String r0 = "did"
                    java.lang.String r3 = r3.optString(r0)
                    goto L_0x0021
                L_0x001f:
                    java.lang.String r3 = ""
                L_0x0021:
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    if (r0 != 0) goto L_0x0032
                    com.miot.api.bluetooth.response.BleReadResponse r0 = r8
                    r1 = 0
                    byte[] r3 = r3.getBytes()
                    r0.onResponse(r1, r3)
                    goto L_0x003a
                L_0x0032:
                    com.miot.api.bluetooth.response.BleReadResponse r3 = r8
                    r0 = -29
                    r1 = 0
                    r3.onResponse(r0, r1)
                L_0x003a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.C97009.onSuccess(org.json.JSONObject):void");
            }
        });
    }

    /* access modifiers changed from: private */
    public void bindDidToServer(final BleWriteResponse bleWriteResponse) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector bindDidToServer start");
        MiotBleClient.getInstance().bindDeviceSN(getDidText(), getBeaconKeyText(), getTokenText(), new ResponseHandler() {
            public void onFailure(int i, String str) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector bindDidToServer return failed: code=" + i + Constants.ACCEPT_TIME_SEPARATOR_SP + str);
                if (i != -1 || TextUtils.isEmpty(str) || str.contains("Unable to resolve")) {
                    bleWriteResponse.onResponse(-30);
                } else {
                    bleWriteResponse.onResponse(-9);
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                int i = 0;
                boolean optBoolean = (jSONObject == null || !jSONObject.has("code") || jSONObject.optInt("code") != 0 || !jSONObject.has("result")) ? false : jSONObject.optBoolean("result");
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector bindDidToServer return " + optBoolean);
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (!optBoolean) {
                    i = -30;
                }
                bleWriteResponse.onResponse(i);
            }
        });
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

    private byte[] generateAppRandom() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private String getBeaconKeyText() {
        return ByteUtils.isEmpty(this.mBeaconKey) ? "" : ByteUtils.byteToString(this.mBeaconKey);
    }

    private String getTokenText() {
        return ByteUtils.isEmpty(this.mToken) ? "" : ByteUtils.byteToString(this.mToken);
    }

    /* access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector Process Step 1 plus ...");
        openAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector Step 1 plus onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.requestDeviceInfo();
                } else {
                    BleStandardAuthRegisterConnector.this.dispatchResult(-27);
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
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
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

    private void recvDevConfirmation(byte[] bArr) {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDevConfirmation ...");
        this.mDevConfirmation = bArr;
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        if (ByteUtils.isEmpty(this.mAppConfirmation)) {
            dispatchResult(-48);
        } else {
            sendAppConfirmation();
        }
    }

    private void recvDevRandom(final byte[] bArr) {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDevRandom ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        if (!writeChannel(this.mAppRandom, 11, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector;
                BleWriteResponse r0;
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDevRandom onResponse: " + Code.toString(i));
                if (i == 0) {
                    if (ByteUtils.isEmpty(BleStandardAuthRegisterConnector.this.mOOB)) {
                        BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDevRandom mOOB is empty");
                        bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                        r0 = new BleWriteResponse() {
                            public void onResponse(int i) {
                                BleStandardAuthRegisterConnector.this.dispatchResult(-49);
                            }
                        };
                    } else {
                        byte[] bArr = new byte[32];
                        System.arraycopy(bArr, 0, bArr, 0, 16);
                        System.arraycopy(BleStandardAuthRegisterConnector.this.mOOB, 0, bArr, 16, 16);
                        if (ByteUtils.byteEquals(BleStandardAuthRegisterConnector.this.mDevConfirmation, SecurityChipUtil.sha256HMAC(BleStandardAuthRegisterConnector.this.eShareKey.getEncoded(), bArr))) {
                            BleStandardAuthRegisterConnector.this.startBindAfterAuthSuccess();
                            return;
                        } else {
                            bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                            r0 = new BleWriteResponse() {
                                public void onResponse(int i) {
                                    BleStandardAuthRegisterConnector.this.dispatchResult(-49);
                                }
                            };
                        }
                    }
                    bleStandardAuthRegisterConnector.writeBindResultToDevice(false, r0);
                    return;
                }
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void recvDeviceInfo(byte[] bArr) {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDeviceInfo ...");
        if (bArr.length >= 4) {
            int i = bArr[0] + (bArr[1] << 8);
            this.mCurrentStandardAuthVersion = i;
            if (i > 1) {
                dispatchResult(-37);
                return;
            }
            byte[] bArr2 = {bArr[2], bArr[3]};
            this.mInputCapability = getInt(bArr2[0], 0, 3);
            this.mOutputCapability = getInt(bArr2[0], 4, 7);
            if (bArr.length > 4) {
                this.mTempDeviceId = ByteUtils.cutBeforeBytes(Arrays.copyOfRange(bArr, 4, bArr.length), (byte) 0);
            }
            sendRegStart(new byte[]{bArr[2], bArr[3]});
            return;
        }
        BluetoothLog.m7329e("BleStandardAuthRegisterConnector recvDeviceInfo data format error");
        dispatchResult(-47);
    }

    private void recvDevicePubKey(byte[] bArr) {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector recvDevicePubKey ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mDevicePubInfo = bArr;
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
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector requestDeviceInfo ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, REQ_DEV_INFO, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector requestDeviceInfo onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.mHandler.removeMessages(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleStandardAuthRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
            }
        });
    }

    private void sendAppConfirmation() {
        int i;
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendAppConfirmation ...");
        if (isCanceled()) {
            i = -2;
        } else if (ByteUtils.isEmpty(this.mAppConfirmation)) {
            BluetoothLog.m7332v("BleStandardAuthRegisterConnector mAppConfirmation is null ...");
            i = -51;
        } else if (!writeChannel(this.mAppConfirmation, 10, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendAppConfirmation onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.mHandler.removeMessages(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleStandardAuthRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
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
    public void sendAppPublicKey() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendAppPublicKey ...");
        KeyPair generateEcc256KeyPair = SecurityChipUtil.generateEcc256KeyPair();
        this.mRegisterAppKeyPair = generateEcc256KeyPair;
        if (!writeChannel(SecurityChipUtil.getRawPublicKey(generateEcc256KeyPair.getPublic()), 3, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.mHandler.removeMessages(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleStandardAuthRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleStandardAuthRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void sendRegStart(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        byte[] bArr2 = new byte[4];
        bArr2[0] = 21;
        bArr2[1] = bArr[0];
        bArr2[2] = bArr[1];
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendRegStart ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr2, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.sendAppPublicKey();
                } else {
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void startBindAfterAuthSuccess() {
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector startBindAfterAuthSuccess");
        byte[] deriveKeyFromOOB = deriveKeyFromOOB(this.eShareKey.getEncoded(), this.mOOB);
        byte[] bArr = new byte[12];
        this.mToken = bArr;
        System.arraycopy(deriveKeyFromOOB, 0, bArr, 0, 12);
        byte[] bArr2 = new byte[16];
        this.mBeaconKey = bArr2;
        System.arraycopy(deriveKeyFromOOB, 12, bArr2, 0, 16);
        byte[] bArr3 = new byte[16];
        this.mDeviceKey = bArr3;
        System.arraycopy(deriveKeyFromOOB, 28, bArr3, 0, 16);
        applyDid(this.mApplyDidResponse);
    }

    private void verifyDeviceParams() {
        StringBuilder sb;
        int i;
        String str;
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector verifyDeviceParams ...");
        PublicKey publicKey = this.mDevicePubKey;
        if (publicKey == null) {
            str = "BleStandardAuthRegisterConnector mDevicePubKey is null ...";
        } else {
            SecretKey secret = SecurityChipUtil.getSecret(publicKey, this.mRegisterAppKeyPair.getPrivate());
            this.eShareKey = secret;
            if (secret == null) {
                str = "BleStandardAuthRegisterConnector eShareKey is null ...";
            } else {
                if (this.mInputCapability != 0) {
                    sb = new StringBuilder();
                    sb.append("BleStandardAuthRegisterConnectordon't support this input capability: ");
                    i = this.mInputCapability;
                } else {
                    int i2 = this.mOutputCapability;
                    if (i2 == 0) {
                        this.mOOB = new byte[16];
                        startBindAfterAuthSuccess();
                        return;
                    } else if (i2 != 8) {
                        sb = new StringBuilder();
                        sb.append("BleStandardAuthRegisterConnector don't support this output capability: ");
                        i = this.mOutputCapability;
                    } else if (TextUtils.isEmpty(this.mQrcodeOob)) {
                        BluetoothLog.m7332v("BleStandardAuthRegisterConnector  get qrcode oob failed");
                        dispatchResult(-50);
                        return;
                    } else {
                        this.mOOB = new byte[16];
                        byte[] stringToBytes = ByteUtils.stringToBytes(this.mQrcodeOob);
                        System.arraycopy(stringToBytes, 0, this.mOOB, 0, Math.min(stringToBytes.length, 16));
                        byte[] generateAppRandom = generateAppRandom();
                        this.mAppRandom = generateAppRandom;
                        byte[] bArr = new byte[32];
                        System.arraycopy(generateAppRandom, 0, bArr, 0, 16);
                        System.arraycopy(this.mOOB, 0, bArr, 16, 16);
                        this.mAppConfirmation = SecurityChipUtil.sha256HMAC(this.eShareKey.getEncoded(), bArr);
                        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
                        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 10000);
                        return;
                    }
                }
                sb.append(i);
                BluetoothLog.m7332v(sb.toString());
                dispatchResult(-37);
                return;
            }
        }
        BluetoothLog.m7332v(str);
        dispatchResult(-51);
    }

    /* access modifiers changed from: private */
    public void writeBindResultToDevice(boolean z, BleWriteResponse bleWriteResponse) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        byte[] bArr = z ? REG_VERIFY_SUCCESS : REG_VERIFY_FAILED;
        BluetoothLog.m7333w(String.format("BleStandardAuthRegisterConnector writeBindResultToDevice : %s", new Object[]{ByteUtils.byteToString(bArr)}));
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, bleWriteResponse);
    }

    /* access modifiers changed from: private */
    public void writeDidToDevice(byte[] bArr, final BleWriteResponse bleWriteResponse) {
        int i;
        if (isCanceled()) {
            i = -2;
        } else {
            byte[] bArr2 = null;
            byte[] bArr3 = {ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, 26, 27};
            try {
                bArr2 = SecurityChipUtil.AESEncryptWithAuth(new SecretKeySpec(this.mDeviceKey, "AES"), bArr3, bArr, "devID".getBytes()).getTotalData();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (bArr2 == null) {
                BluetoothLog.m7329e("BleStandardAuthRegisterConnector encrypt did failed");
                i = -51;
            } else {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector start writeDidToDevice");
                if (!writeChannel(bArr2, 0, new IResponse() {
                    public IBinder asBinder() {
                        return null;
                    }

                    public void onResponse(int i, Bundle bundle) {
                        BluetoothLog.m7332v("BleStandardAuthRegisterConnector writeDidToDevice onResponse: " + Code.toString(i));
                        BleWriteResponse bleWriteResponse = bleWriteResponse;
                        if (bleWriteResponse != null) {
                            bleWriteResponse.onResponse(i);
                        }
                    }
                })) {
                    dispatchResult(-28);
                    return;
                }
                return;
            }
        }
        dispatchResult(i);
    }

    /* access modifiers changed from: protected */
    public String getDidText() {
        return ByteUtils.isEmpty(this.mTempDeviceId) ? "" : new String(this.mTempDeviceId);
    }

    /* access modifiers changed from: protected */
    public byte[] getGeneratedToken() {
        return this.mToken;
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
        } else if (i == 12) {
            recvDevConfirmation(bArr);
        } else if (i == 13) {
            recvDevRandom(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == MSG_NOTIFY_TIMEOUT) {
            BluetoothLog.m7333w("BleStandardAuthRegisterConnector notify timeout");
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
        BluetoothLog.m7332v("BleStandardAuthRegisterConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openStandardAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m7332v("BleStandardAuthRegisterConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.processStep1Plus();
                } else {
                    BleStandardAuthRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
