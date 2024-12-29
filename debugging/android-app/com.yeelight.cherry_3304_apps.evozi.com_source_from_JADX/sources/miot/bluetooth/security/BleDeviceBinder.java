package miot.bluetooth.security;

import android.text.TextUtils;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BleBindResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import com.miot.bluetooth.ResponseHandler;
import miot.bluetooth.security.cache.BluetoothCache;
import org.json.JSONObject;

public class BleDeviceBinder implements IBleDeviceBinder {
    public static final int BIND_FAILED = -381567184;
    public static final int BIND_SUCCESS = -1402883792;
    /* access modifiers changed from: private */
    public final BleReadResponse mApplySNResponse = new BleReadResponse() {
        public void onResponse(int i, byte[] bArr) {
            BluetoothLog.m10339w("ApplySN Response: code = " + i + ", sn = " + ByteUtils.byteToString(bArr));
            if (i != 0) {
                BluetoothLog.m10339w("mApplySNResponse: code = " + i);
                BleDeviceBinder.this.writeBindResultToDevice(i, new BleWriteResponse() {
                    public void onResponse(int i) {
                        BleDeviceBinder.this.dispatchResult(i);
                    }
                });
            } else if (ByteUtils.isEmpty(BleDeviceBinder.this.mTempSN) && !ByteUtils.isEmpty(bArr)) {
                byte[] unused = BleDeviceBinder.this.mTempSN = bArr;
                byte[] fillBeforeBytes = ByteUtils.fillBeforeBytes(bArr, 20, (byte) 0);
                BluetoothLog.m10339w("write did to Device: " + ByteUtils.byteToString(fillBeforeBytes));
                byte[] encrypt = BLECipher.encrypt(BleDeviceBinder.this.getToken(), fillBeforeBytes);
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                bleDeviceBinder.writeSNToDevice(encrypt, bleDeviceBinder.mWriteSNResponse);
                BluetoothCache.setPropDid(BleDeviceBinder.this.getMac(), BleDeviceBinder.this.getSNText());
            } else if (ByteUtils.isEmpty(BleDeviceBinder.this.mTempSN) || !ByteUtils.byteEquals(BleDeviceBinder.this.mTempSN, bArr)) {
                throw new IllegalStateException("strange exception");
            } else {
                BleDeviceBinder bleDeviceBinder2 = BleDeviceBinder.this;
                bleDeviceBinder2.bindSNToServer(bleDeviceBinder2.mBindSNResponse);
            }
        }
    };
    /* access modifiers changed from: private */
    public byte[] mBeaconKey;
    /* access modifiers changed from: private */
    public final BleWriteResponse mBindSNResponse = new BleWriteResponse() {
        public void onResponse(final int i) {
            BluetoothLog.m10339w("BindSN Response: code = " + i);
            BleDeviceBinder.this.writeBindResultToDevice(i, new BleWriteResponse() {
                public void onResponse(int i) {
                    BleDeviceBinder.this.dispatchResult(i);
                }
            });
        }
    };
    private boolean mCanceld;
    private IBleDeviceLauncher mLauncher;
    /* access modifiers changed from: private */
    public final BleReadResponse mReadBeaconKeyResponse = new BleReadResponse() {
        public void onResponse(int i, byte[] bArr) {
            if (i != 0 || ByteUtils.isEmpty(bArr)) {
                BluetoothLog.m10339w("mReadBeaconKeyResponse meet error, error code = " + i);
            } else {
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                byte[] unused = bleDeviceBinder.mBeaconKey = BLECipher.encrypt(bleDeviceBinder.getToken(), bArr);
                BluetoothCache.setPropBeaconKey(BleDeviceBinder.this.getMac(), BleDeviceBinder.this.getBeaconKeyText());
                BluetoothLog.m10334d("readBeaconKey: " + BleDeviceBinder.this.getBeaconKeyText());
            }
            BleDeviceBinder bleDeviceBinder2 = BleDeviceBinder.this;
            bleDeviceBinder2.applySNFromServer(bleDeviceBinder2.mApplySNResponse);
        }
    };
    private final BleReadResponse mReadSNResponse = new BleReadResponse() {
        public void onResponse(int i, byte[] bArr) {
            if (i != 0 || ByteUtils.isEmpty(bArr)) {
                BluetoothLog.m10339w("mReadSNResponse meet error, error code = " + i);
            } else {
                BluetoothLog.m10339w("local did(encrypted): " + ByteUtils.byteToString(bArr));
                BluetoothLog.m10339w("local token is " + BleDeviceBinder.this.getTokenText());
                byte[] encrypt = BLECipher.encrypt(BleDeviceBinder.this.getToken(), bArr);
                BluetoothLog.m10339w("local did(decrypted): " + ByteUtils.byteToString(encrypt));
                if (!ByteUtils.isAllFF(encrypt)) {
                    byte[] unused = BleDeviceBinder.this.mTempSN = ByteUtils.cutBeforeBytes(encrypt, (byte) 0);
                    BluetoothCache.setPropDid(BleDeviceBinder.this.getMac(), BleDeviceBinder.this.getSNText());
                }
            }
            BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
            bleDeviceBinder.readBeaconKeyFromDevice(bleDeviceBinder.mReadBeaconKeyResponse);
        }
    };
    private BleBindResponse mResponse;
    /* access modifiers changed from: private */
    public byte[] mTempSN;
    /* access modifiers changed from: private */
    public final BleWriteResponse mWriteSNResponse = new BleWriteResponse() {
        public void onResponse(int i) {
            if (i == 0) {
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                bleDeviceBinder.bindSNToServer(bleDeviceBinder.mBindSNResponse);
                return;
            }
            BluetoothLog.m10339w("mWriteSNResponse: code = " + i);
            BleDeviceBinder.this.dispatchResult(i);
        }
    };

    public BleDeviceBinder(IBleDeviceLauncher iBleDeviceLauncher) {
        this.mLauncher = iBleDeviceLauncher;
        if (iBleDeviceLauncher == null) {
            throw new NullPointerException("launcher should not be null");
        }
    }

    /* access modifiers changed from: private */
    public void dispatchResult(int i) {
        this.mResponse.onResponse(i);
    }

    /* access modifiers changed from: private */
    public String getBeaconKeyText() {
        return getByteHexText(this.mBeaconKey);
    }

    private String getByteHexText(byte[] bArr) {
        return ByteUtils.isEmpty(bArr) ? "" : ByteUtils.byteToString(bArr);
    }

    private String getByteText(byte[] bArr) {
        return ByteUtils.isEmpty(bArr) ? "" : new String(bArr);
    }

    /* access modifiers changed from: private */
    public String getMac() {
        return this.mLauncher.getDeviceMac();
    }

    private int getProductId() {
        return this.mLauncher.getDeviceProductId();
    }

    /* access modifiers changed from: private */
    public String getSNText() {
        return getByteText(this.mTempSN);
    }

    /* access modifiers changed from: private */
    public byte[] getToken() {
        return this.mLauncher.getDeviceToken();
    }

    /* access modifiers changed from: private */
    public String getTokenText() {
        return getByteHexText(getToken());
    }

    /* access modifiers changed from: private */
    public void writeBindResultToDevice(int i, BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10339w("writeBindResultToDevice " + i);
        MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_EVENT, BLECipher.encrypt(getToken(), ByteUtils.fromInt(i == 0 ? BIND_SUCCESS : BIND_FAILED)), bleWriteResponse);
    }

    public void applySNFromServer(final BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
            return;
        }
        MiotBleClient.getInstance().getDeviceSN(getSNText(), getMac(), MiotBleDeviceConfig.model(), getTokenText(), new ResponseHandler() {
            public void onFailure(int i, String str) {
                BluetoothLog.m10339w("getDeviceSN failed, code = " + i + ", description: " + str);
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
                    com.inuker.bluetooth.library.connect.response.BleReadResponse r0 = r7
                    r1 = 0
                    byte[] r3 = r3.getBytes()
                    r0.onResponse(r1, r3)
                    goto L_0x003a
                L_0x0032:
                    com.inuker.bluetooth.library.connect.response.BleReadResponse r3 = r7
                    r0 = -29
                    r1 = 0
                    r3.onResponse(r0, r1)
                L_0x003a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.BleDeviceBinder.C115936.onSuccess(org.json.JSONObject):void");
            }
        });
    }

    public void bindDeviceToServer(BleBindResponse bleBindResponse) {
        this.mResponse = bleBindResponse;
        if (bleBindResponse != null) {
            readSNFromDevice(this.mReadSNResponse);
            return;
        }
        throw new NullPointerException("bind response should not be null");
    }

    public void bindSNToServer(final BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            MiotBleClient.getInstance().bindDeviceSN(getSNText(), getBeaconKeyText(), getTokenText(), new ResponseHandler() {
                public void onFailure(int i, String str) {
                    BluetoothLog.m10338v("bindSNToServer return failed: " + i);
                    if (i != -1 || TextUtils.isEmpty(str) || str.contains("Unable to resolve")) {
                        bleWriteResponse.onResponse(-30);
                    } else {
                        bleWriteResponse.onResponse(-9);
                    }
                }

                public void onSuccess(JSONObject jSONObject) {
                    int i = 0;
                    boolean optBoolean = (jSONObject == null || !jSONObject.has("code") || jSONObject.optInt("code") != 0 || !jSONObject.has("result")) ? false : jSONObject.optBoolean("result");
                    BleWriteResponse bleWriteResponse = bleWriteResponse;
                    if (!optBoolean) {
                        i = -30;
                    }
                    bleWriteResponse.onResponse(i);
                }
            });
        }
    }

    public void cancel() {
        BluetoothLog.m10335e("cancel!");
        this.mCanceld = true;
    }

    public int getBindStyle() {
        return MiotBleDeviceConfig.bindStyle();
    }

    public void readBeaconKeyFromDevice(BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            MiotBleClient.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_BEACONKEY, bleReadResponse);
        }
    }

    public void readSNFromDevice(BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            MiotBleClient.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SN, bleReadResponse);
        }
    }

    public void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            MiotBleClient.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SN, bArr, bleWriteResponse);
        }
    }
}
