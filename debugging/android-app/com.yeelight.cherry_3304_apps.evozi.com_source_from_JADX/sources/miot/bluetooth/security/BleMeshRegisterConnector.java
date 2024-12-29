package miot.bluetooth.security;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.IResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.rc4.Base64Coder;
import miot.bluetooth.security.utils.SecurityChipUtil;
import org.json.JSONArray;
import org.json.JSONObject;

public class BleMeshRegisterConnector extends BleSecurityChipConnector {
    private static final byte[] ERR_REGISTERED = {-31};
    /* access modifiers changed from: private */
    public static final byte[] MESH_REG_D_CERT_INVALID = {71};
    private static final byte[] MESH_REG_D_PUBKEY_INVALID = {72};
    /* access modifiers changed from: private */
    public static final byte[] MESH_REG_D_SIGN_INVALID = {73};
    /* access modifiers changed from: private */
    public static final byte[] MESH_REG_FAILED = {66};
    private static final byte[] MESH_REG_START = {64};
    private static final byte[] MESH_REG_SUCCESS = {65};
    private static final byte[] MESH_REG_S_CERT_INVALID = {68};
    private static final byte[] MESH_REG_S_PUBKEY_INVALID = {69};
    private static final byte[] MESH_REG_S_SIGN_INVALID = {70};
    private static final byte[] MESH_REG_VERIFY_SUCCESS = {67};
    private static final int MSG_NOTIFY_TIMEOUT = 4101;
    private static final String TAG = "BleMeshRegisterConnector";
    /* access modifiers changed from: private */
    public int mDefaultFailedCode = -7;
    private byte[] mDevCertRaw;
    private byte[] mDevInfo;
    private byte[] mDevPub;
    /* access modifiers changed from: private */
    public String mDid;
    /* access modifiers changed from: private */
    public byte[] mGattLtmk;
    private byte[] mManuId;
    /* access modifiers changed from: private */
    public byte[] mMeshAppKey;
    private byte[] mMeshDevKey;
    public Map<Integer, List<Integer>> mMeshElementMap = new LinkedHashMap();
    /* access modifiers changed from: private */
    public int mMeshIvIndex = 0;
    /* access modifiers changed from: private */
    public byte[] mMeshNetKey;
    /* access modifiers changed from: private */
    public String mMeshStaticOOB;
    /* access modifiers changed from: private */
    public int mMeshUnicastAddress;
    private People mPeople = ServiceManager.getInstance().getPeople();
    /* access modifiers changed from: private */
    public String mServerCert;
    /* access modifiers changed from: private */
    public String mServerPub;
    /* access modifiers changed from: private */
    public String mServerSign;

    protected BleMeshRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    public static final byte[] generateRandomNumber() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private int getBindModelCount() {
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> value : this.mMeshElementMap.entrySet()) {
            i += ((List) value.getValue()).size();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void getMeshProvisionCtrInfo() {
        MiotCloudApi.blemeshQueryCtlInfo(this.mPeople, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                int unused = BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null) {
                    try {
                        int unused = BleMeshRegisterConnector.this.mMeshIvIndex = Integer.parseInt(optJSONObject.optString("iv_index"), 16);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("primary_netkey");
                    if (optJSONObject2 != null) {
                        byte[] unused2 = BleMeshRegisterConnector.this.mMeshNetKey = ByteUtils.stringToBytes(optJSONObject2.optString(BaseService.KEY));
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("ctl_appkey");
                    if (optJSONObject3 != null) {
                        byte[] unused3 = BleMeshRegisterConnector.this.mMeshAppKey = ByteUtils.stringToBytes(optJSONObject3.optString(BaseService.KEY));
                    }
                    if (BleMeshRegisterConnector.this.mMeshNetKey == null || BleMeshRegisterConnector.this.mMeshAppKey == null) {
                        int unused4 = BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
                        return;
                    }
                    BleMeshRegisterConnector.this.getMeshProvisionModelInfo();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void getMeshProvisionModelInfo() {
        MiotCloudApi.blemeshQueryModel(this.mPeople, MiotBleDeviceConfig.productId(), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                int unused = BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("elements");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            if (optJSONObject2 != null) {
                                int optInt = optJSONObject2.optInt("num");
                                ArrayList arrayList = new ArrayList();
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("model_id");
                                if (optJSONArray2 != null) {
                                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                        try {
                                            arrayList.add(Integer.valueOf(Integer.parseInt(optJSONArray2.optString(i2), 16)));
                                        } catch (NumberFormatException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                BleMeshRegisterConnector.this.mMeshElementMap.put(Integer.valueOf(optInt), arrayList);
                            }
                        }
                    }
                    BleMeshRegisterConnector bleMeshRegisterConnector = BleMeshRegisterConnector.this;
                    if (bleMeshRegisterConnector.mMeshElementMap != null) {
                        bleMeshRegisterConnector.sendMeshProvisionInfoToDevice();
                        return;
                    }
                    int unused = bleMeshRegisterConnector.mDefaultFailedCode = -44;
                    BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
                }
            }
        });
    }

    public static byte[] getSHA2Digest(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void processDeviceNotify(byte[] bArr) {
        int i;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector Process Step 10 ..., value = " + ByteUtils.byteToString(bArr));
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        if (ByteUtils.equals(bArr, MESH_REG_SUCCESS)) {
            sendMeshProvisionSuccessToServer();
            return;
        }
        if (ByteUtils.equals(bArr, MESH_REG_S_CERT_INVALID)) {
            i = -41;
        } else if (ByteUtils.equals(bArr, MESH_REG_S_SIGN_INVALID)) {
            i = -42;
        } else if (ByteUtils.equals(bArr, MESH_REG_S_PUBKEY_INVALID)) {
            i = -43;
        } else if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
            i = -17;
        } else {
            return;
        }
        dispatchResult(i);
    }

    /* access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector Process Step 1 plus ...");
        openAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 1 plus onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.processStep2();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector Process Step 2 ...");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, MESH_REG_START, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 2 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.mHandler.removeMessages(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleMeshRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleMeshRegisterConnector.this.dispatchResult(-28);
            }
        });
    }

    private void recvDeviceCert(byte[] bArr) {
        BluetoothLog.m10338v("BleMeshRegisterConnector Process recvDeviceCert ...");
        this.mDevCertRaw = Arrays.copyOf(bArr, bArr.length);
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 10000);
    }

    private void recvDevicePub(byte[] bArr) {
        BluetoothLog.m10338v("BleMeshRegisterConnector Process recvDevicePub ...");
        this.mDevInfo = Arrays.copyOfRange(bArr, 0, 12);
        this.mManuId = Arrays.copyOfRange(bArr, 12, 20);
        this.mDevPub = Arrays.copyOfRange(bArr, 20, 84);
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        sendDeviceCertToServer();
    }

    private void recvDeviceSign(byte[] bArr) {
        BluetoothLog.m10338v("BleMeshRegisterConnector Process recvDeviceSign ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        sendDeviceSignToServer(bArr);
    }

    private void sendDeviceCertToServer() {
        int productId = MiotBleDeviceConfig.productId();
        String encodeBytes = Base64Coder.encodeBytes(this.mDevCertRaw, 24);
        MiotCloudApi.blemeshauth(this.mPeople, productId, Base64Coder.encodeBytes(this.mDevPub, 24), ByteBuffer.wrap(this.mManuId).order(ByteOrder.LITTLE_ENDIAN).getLong(), encodeBytes, ByteUtils.byteToString(this.mDevInfo), "123456", new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                int unused = BleMeshRegisterConnector.this.mDefaultFailedCode = -39;
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_CERT_INVALID);
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null) {
                    String unused = BleMeshRegisterConnector.this.mServerSign = optJSONObject.optString("sign");
                    String unused2 = BleMeshRegisterConnector.this.mServerPub = optJSONObject.optString("pub");
                    String unused3 = BleMeshRegisterConnector.this.mServerCert = optJSONObject.optString("server_cert");
                    optJSONObject.optString("code");
                    String unused4 = BleMeshRegisterConnector.this.mDid = optJSONObject.optString("did");
                    if (TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerSign) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerPub) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerCert) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mDid)) {
                        int unused5 = BleMeshRegisterConnector.this.mDefaultFailedCode = -39;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_CERT_INVALID);
                        return;
                    }
                    BleMeshRegisterConnector.this.sendServerCertToDevice();
                }
            }
        });
    }

    private void sendDeviceSignToServer(byte[] bArr) {
        int productId = MiotBleDeviceConfig.productId();
        MiotCloudApi.blemeshBind(this.mPeople, (long) productId, getMac(), Base64Coder.encodeBytes(bArr, 24), this.mDid, "", new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                int unused = BleMeshRegisterConnector.this.mDefaultFailedCode = -40;
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_SIGN_INVALID);
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null) {
                    String unused = BleMeshRegisterConnector.this.mMeshStaticOOB = optJSONObject.optString("static_oob");
                    String optString = optJSONObject.optString("gatt_ltmk");
                    int unused2 = BleMeshRegisterConnector.this.mMeshUnicastAddress = optJSONObject.optInt("address");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("appkey");
                    if (optJSONObject2 != null) {
                        optJSONObject2.optString(BaseService.KEY);
                        optJSONObject2.optString("appkey_id");
                    }
                    if (TextUtils.isEmpty(optString)) {
                        int unused3 = BleMeshRegisterConnector.this.mDefaultFailedCode = -40;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_SIGN_INVALID);
                        return;
                    }
                    BluetoothCache.setPropMeshBindInfo(BleMeshRegisterConnector.this.getMac(), optJSONObject.toString());
                    BluetoothCache.setPropLtmk(BleMeshRegisterConnector.this.getMac(), optString);
                    byte[] unused4 = BleMeshRegisterConnector.this.mGattLtmk = Base64Coder.decode(optString, 24);
                    BleMeshRegisterConnector.this.sendRegVerifySuccessToDevice();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendErrorCodeToDevice(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector, sendErrorCodeToDevice errorCode = " + ByteUtils.byteToString(bArr));
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m10338v("BleMeshRegisterConnector sendErrorCodeToDevice onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.mHandler.removeMessages(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleMeshRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT, 10000);
                    return;
                }
                BleMeshRegisterConnector.this.dispatchResult(-28);
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendMeshProvisionInfoToDevice() {
        ByteBuffer order = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.mMeshDevKey = generateRandomNumber();
        order.put((byte) 1);
        order.put(ParameterInitDefType.ExternalSamplerInit);
        order.put(this.mMeshDevKey);
        order.put((byte) 2);
        order.put((byte) 25);
        order.put(this.mMeshNetKey);
        order.putShort(0);
        order.put((byte) 0);
        order.putInt(this.mMeshIvIndex);
        order.putShort((short) this.mMeshUnicastAddress);
        order.put((byte) 3);
        order.put(ParameterInitDefType.DoubleVec4Init);
        order.putShort(0);
        order.putShort(0);
        order.put(this.mMeshAppKey);
        order.put((byte) 4);
        int bindModelCount = getBindModelCount();
        order.put((byte) (bindModelCount * 8));
        if (bindModelCount != 0) {
            for (Map.Entry next : this.mMeshElementMap.entrySet()) {
                Integer num = (Integer) next.getKey();
                for (Integer num2 : (List) next.getValue()) {
                    order.putShort(num.shortValue());
                    Integer valueOf = Integer.valueOf(num2.intValue() >> 16);
                    Integer valueOf2 = Integer.valueOf(num2.intValue() & SupportMenu.USER_MASK);
                    order.putShort(valueOf.shortValue());
                    order.putShort(valueOf2.shortValue());
                    order.putShort(0);
                }
            }
        }
        int position = order.position();
        byte[] bArr = new byte[position];
        System.arraycopy(order.array(), 0, bArr, 0, position);
        byte[] stringToBytes = ByteUtils.stringToBytes(this.mMeshStaticOOB);
        byte[] bArr2 = new byte[8];
        System.arraycopy(stringToBytes, 0, bArr2, 0, 8);
        if (!writeChannel(SecurityChipUtil.AESEncrypt(stringToBytes, bArr2, bArr), 9, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m10338v("BleMeshRegisterConnector sendMeshProvisionInfoToDevice onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.mHandler.removeMessages(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleMeshRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT, 20000);
                    return;
                }
                BleMeshRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    private void sendMeshProvisionSuccessToServer() {
        MiotCloudApi.blemeshSendProvisionDone(this.mPeople, true, this.mDid, ByteUtils.byteToString(this.mMeshDevKey), ByteUtils.byteToString(getSHA2Digest(ByteUtils.stringToBytes(this.mMeshStaticOOB))).toLowerCase().substring(0, 32), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                BleMeshRegisterConnector.this.dispatchResult(-45);
            }

            public void onSuccess(JSONObject jSONObject) {
                BleMeshRegisterConnector bleMeshRegisterConnector;
                int i;
                if (jSONObject.optInt("code", -1) == 0) {
                    bleMeshRegisterConnector = BleMeshRegisterConnector.this;
                    i = 0;
                } else {
                    bleMeshRegisterConnector = BleMeshRegisterConnector.this;
                    i = -45;
                }
                bleMeshRegisterConnector.dispatchResult(i);
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendRegVerifySuccessToDevice() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector, sendRegVerifySuccessToDevice");
        MiotBleClient.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, MESH_REG_VERIFY_SUCCESS, new BleWriteResponse() {
            public void onResponse(int i) {
                BluetoothLog.m10338v("BleMeshRegisterConnector sendRegVerifySuccessToDevice onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.getMeshProvisionCtrInfo();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendServerCertToDevice() {
        if (!writeChannel(Base64Coder.decode(this.mServerCert, 24), 7, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 3 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.sendServerPubToDevice();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        })) {
            dispatchResult(-28);
        }
    }

    /* access modifiers changed from: private */
    public void sendServerPubToDevice() {
        if (!writeChannel(Base64Coder.decode(this.mServerPub, 24), 3, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 4 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.sendServerSignToDevice();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        })) {
            dispatchResult(-28);
        }
    }

    /* access modifiers changed from: private */
    public void sendServerSignToDevice() {
        if (!writeChannel(Base64Coder.decode(this.mServerSign, 24), 8, new IResponse() {
            public IBinder asBinder() {
                return null;
            }

            public void onResponse(int i, Bundle bundle) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 5 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.mHandler.removeMessages(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT);
                    BleMeshRegisterConnector.this.mHandler.sendEmptyMessageDelayed(BleMeshRegisterConnector.MSG_NOTIFY_TIMEOUT, 20000);
                    return;
                }
                BleMeshRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            dispatchResult(-28);
        }
    }

    public String getDeviceDid() {
        return this.mDid;
    }

    /* access modifiers changed from: protected */
    public byte[] getGeneratedToken() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
        } else if (i == 1) {
            recvDeviceCert(bArr);
        } else if (i == 3) {
            recvDevicePub(bArr);
        } else if (i == 4) {
            recvDeviceSign(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processHandlerMessage(Message message) {
        if (message.what == MSG_NOTIFY_TIMEOUT) {
            BluetoothLog.m10339w("BleMeshRegisterConnector notify timeout");
            dispatchResult(this.mDefaultFailedCode);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            processDeviceNotify(bArr);
        } else if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_SECURE_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothLog.m10338v("BleMeshRegisterConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                BluetoothLog.m10338v("BleMeshRegisterConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.processStep1Plus();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
