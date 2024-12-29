package com.miot.bluetooth;

import android.os.Bundle;
import android.text.TextUtils;
import com.inuker.bluetooth.library.BluetoothClient;
import com.inuker.bluetooth.library.BluetoothContext;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleReadRssiResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.log.MyLogger;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuth;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import java.util.List;
import java.util.UUID;
import miot.bluetooth.security.BleMeshLogin;
import miot.bluetooth.security.BleMeshRegister;
import miot.bluetooth.security.BleSecurityLogin;
import miot.bluetooth.security.BleSecurityRegister;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;
import miot.bluetooth.security.mesh.MeshDfuManager;
import miot.bluetooth.security.standardauth.BleStandardAuthLogin;
import miot.bluetooth.security.standardauth.BleStandardAuthRegister;
import miot.bluetooth.security.utils.AsyncCallback;
import org.json.JSONObject;

public class MiotBleClient implements IMiotBleClient, RestAPI {
    public static final BleConnectOptions CONNECT_OPTIONS = new BleConnectOptions.Builder().setConnectRetry(3).setConnectTimeout(25000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(20000).build();
    private static MiotBleClient sInstance;
    private BluetoothClient mClient = new BluetoothClient(BluetoothContext.get());
    private MiotBleDeviceConfig mConfig;
    private RestAPI mRestApi;

    private MiotBleClient() {
    }

    private static void getBleMeshGattLtmk(String str, final AsyncCallback<String, Error> asyncCallback) {
        MiotCloudApi.blemeshQueryBindInfo(ServiceManager.getInstance().getPeople(), str, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                BluetoothLog.m7329e("MiotBleClient getBleMeshGattLtmk failed! code = " + i + ", msg = " + str);
                AsyncCallback asyncCallback = AsyncCallback.this;
                if (asyncCallback != null) {
                    asyncCallback.onFailure(null);
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("gatt_ltmk");
                    AsyncCallback asyncCallback = AsyncCallback.this;
                    if (asyncCallback != null) {
                        asyncCallback.onSuccess(optString);
                    }
                }
            }
        });
    }

    public static MiotBleClient getInstance() {
        if (sInstance == null) {
            synchronized (MiotBleClient.class) {
                if (sInstance == null) {
                    sInstance = new MiotBleClient();
                }
            }
        }
        return sInstance;
    }

    public void bindDeviceSN(String str, String str2, String str3, ResponseHandler responseHandler) {
        RestAPI restAPI = this.mRestApi;
        if (restAPI != null) {
            restAPI.bindDeviceSN(str, str2, str3, responseHandler);
        }
    }

    public void bleComboStandardAuth(String str, int i, BleComboWifiConfig bleComboWifiConfig, BleConnectOptions bleConnectOptions, BleSecurityStatusResponse bleSecurityStatusResponse) {
        BluetoothCache.setPropProductId(str, i);
        if (i <= 0) {
            BluetoothLog.m7329e("bleComboStandardAuth for error: productId invalid!!");
            bleSecurityStatusResponse.onResponse(-12, (Bundle) null);
            return;
        }
        new BleComboStandardAuth(str, i, bleComboWifiConfig, CONNECT_OPTIONS).start(bleSecurityStatusResponse);
    }

    public void bleMeshBind(String str, BleSecurityStatusResponse bleSecurityStatusResponse) {
        int productId = MiotBleDeviceConfig.productId();
        BluetoothCache.setPropProductId(str, productId);
        BleMeshRegister.register(str, productId, bleSecurityStatusResponse);
    }

    public void bleMeshConnect(String str, String str2, String str3, BleSecurityStatusResponse bleSecurityStatusResponse) {
        final int propProductId = BluetoothCache.getPropProductId(str);
        String propToken = BluetoothCache.getPropToken(str);
        String propLtmk = BluetoothCache.getPropLtmk(str);
        if (!TextUtils.equals(propToken, str3) || TextUtils.isEmpty(propLtmk)) {
            final String str4 = str;
            final String str5 = str3;
            final BleSecurityStatusResponse bleSecurityStatusResponse2 = bleSecurityStatusResponse;
            getBleMeshGattLtmk(str2, new AsyncCallback<String, Error>() {
                public void onFailure(Error error) {
                    BluetoothLog.m7332v(String.format("bleMeshConnect for %s error: gatt ltmk failed!", new Object[]{str4}));
                    if (bleSecurityStatusResponse2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, "gatt ltmk failed!");
                        bleSecurityStatusResponse2.onResponse(-102, bundle);
                    }
                }

                public void onSuccess(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        BluetoothCache.setPropToken(str4, str5);
                        BluetoothCache.setPropLtmk(str4, str);
                        BleMeshLogin.register(str4, propProductId, ByteUtils.stringToBytes(str), bleSecurityStatusResponse2);
                        return;
                    }
                    BluetoothLog.m7332v(String.format("bleMeshConnect for %s error: gatt ltmk is null", new Object[]{str4}));
                    if (bleSecurityStatusResponse2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, "gatt ltmk is null");
                        bleSecurityStatusResponse2.onResponse(-101, bundle);
                    }
                }
            });
            return;
        }
        BleMeshLogin.register(str, propProductId, ByteUtils.stringToBytes(propLtmk), bleSecurityStatusResponse);
    }

    public void bleStandardAuthBind(String str, BleSecurityStatusResponse bleSecurityStatusResponse) {
        int productId = MiotBleDeviceConfig.productId();
        BluetoothCache.setPropProductId(str, productId);
        if (productId <= 0) {
            BluetoothLog.m7329e("bleStandardAuthBind for error: productId invalid!!");
            bleSecurityStatusResponse.onResponse(-12, (Bundle) null);
            return;
        }
        new BleStandardAuthRegister(str, productId, CONNECT_OPTIONS).start(bleSecurityStatusResponse);
    }

    public void bleStandardAuthConnect(String str, BleSecurityStatusResponse bleSecurityStatusResponse) {
        int propProductId = BluetoothCache.getPropProductId(str);
        if (propProductId <= 0) {
            BluetoothLog.m7329e("bleStandardAuthConnect for error: productId invalid!!");
            bleSecurityStatusResponse.onResponse(-12, (Bundle) null);
            return;
        }
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (ByteUtils.isEmpty(propTokenBytes)) {
            BluetoothLog.m7329e("bleStandardAuthConnect for  error: token is empty!!");
            bleSecurityStatusResponse.onResponse(-54, (Bundle) null);
            return;
        }
        new BleStandardAuthLogin(str, propProductId, propTokenBytes, CONNECT_OPTIONS).start(bleSecurityStatusResponse);
    }

    public void cancelBleMeshUpgrade(String str) {
        MeshDfuManager.getInstance().cancelUpgrade(str);
    }

    public void clearLocalToken(String str) {
        BluetoothCache.removePropToken(str);
    }

    public void connect(String str, BleConnectResponse bleConnectResponse) {
        this.mClient.connect(str, bleConnectResponse);
    }

    public void disconnect(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mClient.disconnect(str);
        }
    }

    public void getBluetoothFirmwareUpdateInfo(String str, ResponseHandler responseHandler) {
        RestAPI restAPI = this.mRestApi;
        if (restAPI != null) {
            restAPI.getBluetoothFirmwareUpdateInfo(str, responseHandler);
        }
    }

    public MiotBleDeviceConfig getConfig() {
        return this.mConfig;
    }

    public void getDeviceProps(String str, List<String> list, ResponseHandler responseHandler) {
        RestAPI restAPI = this.mRestApi;
        if (restAPI != null) {
            restAPI.getDeviceProps(str, list, responseHandler);
        }
    }

    public void getDeviceSN(String str, String str2, String str3, String str4, ResponseHandler responseHandler) {
        RestAPI restAPI = this.mRestApi;
        if (restAPI != null) {
            restAPI.getDeviceSN(str, str2, str3, str4, responseHandler);
        }
    }

    public void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        this.mClient.notify(str, uuid, uuid2, bleNotifyResponse);
    }

    public void read(String str, UUID uuid, UUID uuid2, BleReadResponse bleReadResponse) {
        this.mClient.read(str, uuid, uuid2, bleReadResponse);
    }

    public void readRemoteRssi(String str, BleReadRssiResponse bleReadRssiResponse) {
        this.mClient.readRssi(str, bleReadRssiResponse);
    }

    public void search(SearchRequest searchRequest, SearchResponse searchResponse) {
        if (searchRequest != null) {
            this.mClient.search(searchRequest, searchResponse);
        }
    }

    public void secureConnect(String str, BleSecurityStatusResponse bleSecurityStatusResponse) {
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        int productId = MiotBleDeviceConfig.productId();
        if (ByteUtils.isEmpty(propTokenBytes)) {
            BleSecurityRegister.register(str, productId, bleSecurityStatusResponse);
        } else {
            BleSecurityLogin.login(str, productId, propTokenBytes, bleSecurityStatusResponse);
        }
    }

    public void secureLogin(String str, byte[] bArr, BleSecurityStatusResponse bleSecurityStatusResponse) {
        BleSecurityLogin.login(str, MiotBleDeviceConfig.productId(), bArr, bleSecurityStatusResponse);
    }

    public void setDeviceConfig(MiotBleDeviceConfig miotBleDeviceConfig) {
        this.mConfig = miotBleDeviceConfig;
    }

    public void setRestAPI(RestAPI restAPI) {
        this.mRestApi = restAPI;
    }

    public void startBleMeshUpgrade(String str, final String str2, final String str3, String str4, final IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        MeshDfuManager.getInstance().startUpgrade(str, str4, new IBleMeshUpgradeResponse() {
            public void onProgress(int i) {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse != null) {
                    iBleMeshUpgradeResponse.onProgress(i);
                }
            }

            public void onResponse(int i, String str) {
                IBleMeshUpgradeResponse iBleMeshUpgradeResponse = iBleMeshUpgradeResponse;
                if (iBleMeshUpgradeResponse != null) {
                    iBleMeshUpgradeResponse.onResponse(i, str);
                }
                if (i == 0 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    MiotCloudApi.blemeshReportDevInfo(ServiceManager.getInstance().getPeople(), str2, str3, "", "", "", "", new MiotCloud.ResponseHandler() {
                        public void onFailure(int i, String str) {
                            MyLogger instance = MyLogger.getInstance();
                            instance.log("update version to cloud failed. error = " + i + ", msg = " + str);
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            MyLogger.getInstance().log("update version to cloud successfully.");
                        }
                    });
                }
            }
        });
    }

    public void stopSearch() {
        this.mClient.stopSearch();
    }

    public void unnotify(String str, UUID uuid, UUID uuid2, BleUnnotifyResponse bleUnnotifyResponse) {
        this.mClient.unnotify(str, uuid, uuid2, bleUnnotifyResponse);
    }

    public void write(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mClient.write(str, uuid, uuid2, bArr, bleWriteResponse);
    }

    public void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mClient.writeNoRsp(str, uuid, uuid2, bArr, bleWriteResponse);
    }

    public void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mClient.writeNoRspFast(str, uuid, uuid2, bArr, bleWriteResponse);
    }
}
