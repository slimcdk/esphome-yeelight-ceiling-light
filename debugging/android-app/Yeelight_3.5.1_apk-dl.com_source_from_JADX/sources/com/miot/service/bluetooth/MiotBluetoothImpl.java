package com.miot.service.bluetooth;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.inuker.bluetooth.library.BluetoothContext;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleReadRssiResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.IBluetoothCaller;
import com.miot.api.IResponse;
import com.miot.api.bluetooth.BluetoothDeviceConfig;
import com.miot.api.bluetooth.BluetoothManager;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.bluetooth.BleSecurityStatusResponseWrapper;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import com.miot.bluetooth.ResponseHandler;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;
import org.json.JSONObject;

public class MiotBluetoothImpl extends IBluetoothCaller.Stub implements Handler.Callback {
    private Context mContext;
    private Handler mHandler = new Handler(Looper.getMainLooper(), this);

    public MiotBluetoothImpl(Context context) {
        this.mContext = context;
        BluetoothContext.set(context);
        MiotBleClient.getInstance().setRestAPI(new RestAPIImpl());
    }

    private void bleMeshBind(String str, IResponse iResponse) {
        MiotBleClient.getInstance().bleMeshBind(str, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void bleMeshConnect(String str, String str2, String str3, IResponse iResponse) {
        MiotBleClient.getInstance().bleMeshConnect(str, str2, str3, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void bleStandardAuthBind(String str, IResponse iResponse) {
        MiotBleClient.getInstance().bleStandardAuthBind(str, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void bleStandardAuthConnect(String str, IResponse iResponse) {
        MiotBleClient.getInstance().bleStandardAuthConnect(str, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void clearLocalToken(String str) {
        MiotBleClient.getInstance().clearLocalToken(str);
    }

    private void connect(String str, final IResponse iResponse) {
        MiotBleClient.getInstance().connect(str, new BleConnectResponse() {
            public void onResponse(int i, Bundle bundle) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void disconnect(String str) {
        MiotBleClient.getInstance().disconnect(str);
    }

    private void getDeviceBeaconKey(final String str, final IResponse iResponse) {
        MiotBleClient.getInstance().getDeviceProps(str, Arrays.asList(new String[]{"prop.bind_key"}), new ResponseHandler() {
            public void onFailure(int i, String str) {
                try {
                    iResponse.onResponse(-1, (Bundle) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                Bundle bundle = new Bundle();
                if (!(jSONObject == null || !jSONObject.has("code") || jSONObject.optInt("code") != 0 || (optJSONObject = jSONObject.optJSONObject("result")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null)) {
                    String optString = optJSONObject2.optString("prop.bind_key");
                    if (!TextUtils.isEmpty(optString)) {
                        bundle.putString(XmBluetoothManager.EXTRA_BEACONKEY, optString);
                    }
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void getFirmwareUpdateInfo(String str, final IResponse iResponse) {
        MiotBleClient.getInstance().getBluetoothFirmwareUpdateInfo(str, new ResponseHandler() {
            public void onFailure(int i, String str) {
                try {
                    iResponse.onResponse(-1, (Bundle) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                bundle.putString(BluetoothManager.EXTRA_FIRMWARE_UPDATE_INFO, jSONObject.toString());
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void notify(String str, UUID uuid, UUID uuid2, final IResponse iResponse) {
        MiotBleClient.getInstance().notify(str, uuid, uuid2, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, (Bundle) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void read(String str, UUID uuid, UUID uuid2, final IResponse iResponse) {
        MiotBleClient.getInstance().read(str, uuid, uuid2, new BleReadResponse() {
            public void onResponse(int i, byte[] bArr) {
                if (iResponse != null) {
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("extra.byte.value", bArr);
                    try {
                        iResponse.onResponse(i, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void readRssi(String str, final IResponse iResponse) {
        MiotBleClient.getInstance().readRemoteRssi(str, new BleReadRssiResponse() {
            public void onResponse(int i, Integer num) {
                if (iResponse != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(Constants.EXTRA_RSSI, num.intValue());
                    try {
                        iResponse.onResponse(i, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void search(SearchRequest searchRequest, final IResponse iResponse) {
        MiotBleClient.getInstance().search(searchRequest, new SearchResponse() {
            public void onDeviceFounded(SearchResult searchResult) {
                try {
                    if (iResponse != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(BluetoothManager.EXTRA_SEARCH_RESULT, searchResult);
                        iResponse.onResponse(1, bundle);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSearchCanceled() {
                try {
                    IResponse iResponse = iResponse;
                    if (iResponse != null) {
                        iResponse.onResponse(4, new Bundle());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSearchStarted() {
                try {
                    IResponse iResponse = iResponse;
                    if (iResponse != null) {
                        iResponse.onResponse(0, new Bundle());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSearchStopped() {
                try {
                    IResponse iResponse = iResponse;
                    if (iResponse != null) {
                        iResponse.onResponse(2, new Bundle());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void secureConnect(String str, IResponse iResponse) {
        MiotBleClient.getInstance().secureConnect(str, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void secureLogin(String str, byte[] bArr, IResponse iResponse) {
        MiotBleClient.getInstance().secureLogin(str, bArr, new BleSecurityStatusResponseWrapper(iResponse));
    }

    private void setDeviceConfig(BluetoothDeviceConfig bluetoothDeviceConfig) {
        MiotBleDeviceConfig miotBleDeviceConfig = new MiotBleDeviceConfig();
        miotBleDeviceConfig.setBindStyle(bluetoothDeviceConfig.bindStyle.style);
        miotBleDeviceConfig.setProductId(bluetoothDeviceConfig.productId);
        miotBleDeviceConfig.setModel(bluetoothDeviceConfig.model);
        MiotBleClient.getInstance().setDeviceConfig(miotBleDeviceConfig);
    }

    private void startBleMeshUpgrade(String str, String str2, String str3, String str4, final IResponse iResponse) {
        MiotBleClient.getInstance().startBleMeshUpgrade(str, str2, str3, str4, new IBleMeshUpgradeResponse() {
            public void onProgress(int i) {
                Bundle bundle = new Bundle();
                bundle.putInt(Constants.EXTRA_OTA_PROGRESS, i);
                try {
                    iResponse.onResponse(10101, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onResponse(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void stopSearch() {
        MiotBleClient.getInstance().stopSearch();
    }

    private void unnotify(String str, UUID uuid, UUID uuid2, final IResponse iResponse) {
        MiotBleClient.getInstance().unnotify(str, uuid, uuid2, new BleUnnotifyResponse() {
            public void onResponse(int i) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, (Bundle) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void write(String str, UUID uuid, UUID uuid2, byte[] bArr, final IResponse iResponse) {
        MiotBleClient.getInstance().write(str, uuid, uuid2, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, (Bundle) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, final IResponse iResponse) {
        MiotBleClient.getInstance().writeNoRsp(str, uuid, uuid2, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, (Bundle) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, final IResponse iResponse) {
        MiotBleClient.getInstance().writeNoRspFast(str, uuid, uuid2, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                IResponse iResponse = iResponse;
                if (iResponse != null) {
                    try {
                        iResponse.onResponse(i, (Bundle) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void callBluetoothApi(int i, Bundle bundle, IResponse iResponse) {
        Message obtainMessage = this.mHandler.obtainMessage(i, iResponse);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public void cancelBleMeshUpgrade(String str) {
        MiotBleClient.getInstance().cancelBleMeshUpgrade(str);
    }

    public void createLightGroup(List<String> list, String str, final IResponse iResponse) {
        MiotCloudApi.createLightGroup(ServiceManager.getInstance().getPeople(), list, str, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void defLightGroup(final IResponse iResponse) {
        MiotCloudApi.defLightGroup(ServiceManager.getInstance().getPeople(), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void getBleMeshFirmwareUpdateInfo(String str, final IResponse iResponse) {
        MiotCloudApi.getBleMeshFirmwareUpdateInfo(ServiceManager.getInstance().getPeople(), str, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getBleMeshFirmwareUpdateInfo onFailure meet error");
                    sb.append(e.getMessage());
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getBleMeshFirmwareUpdateInfo onSuccess meet error");
                    sb.append(e.getMessage());
                }
            }
        });
    }

    public void getBleMeshFirmwareUpdateInfoBatch(List<String> list, final IResponse iResponse) {
        MiotCloudApi.getBleMeshFirmwareUpdateInfoBatch(ServiceManager.getInstance().getPeople(), list, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public boolean handleMessage(Message message) {
        Bundle data = message.getData();
        data.setClassLoader(SearchRequest.class.getClassLoader());
        String string = data.getString("extra.mac");
        String string2 = data.getString(XmBluetoothManager.EXTRA_DID);
        byte[] byteArray = data.getByteArray(XmBluetoothManager.EXTRA_TOKEN);
        UUID uuid = (UUID) data.getSerializable("extra.service.uuid");
        UUID uuid2 = (UUID) data.getSerializable("extra.character.uuid");
        byte[] byteArray2 = data.getByteArray("extra.byte.value");
        String string3 = data.getString(Constants.EXTRA_OTA_LATEST_VERSION, "");
        String string4 = data.getString(Constants.EXTRA_OTA_FILE_PATH, "");
        IResponse iResponse = (IResponse) message.obj;
        int i = message.what;
        if (i == 12) {
            BluetoothDeviceConfig bluetoothDeviceConfig = (BluetoothDeviceConfig) data.getSerializable("extra.config");
            if (bluetoothDeviceConfig == null) {
                return true;
            }
            setDeviceConfig(bluetoothDeviceConfig);
            return true;
        } else if (i != 21) {
            switch (i) {
                case 1:
                    connect(string, iResponse);
                    return true;
                case 2:
                    disconnect(string);
                    return true;
                case 3:
                    read(string, uuid, uuid2, iResponse);
                    return true;
                case 4:
                    write(string, uuid, uuid2, byteArray2, iResponse);
                    return true;
                case 5:
                    writeNoRsp(string, uuid, uuid2, byteArray2, iResponse);
                    return true;
                case 6:
                    notify(string, uuid, uuid2, iResponse);
                    return true;
                case 7:
                    unnotify(string, uuid, uuid2, iResponse);
                    return true;
                case 8:
                    readRssi(string, iResponse);
                    return true;
                default:
                    switch (i) {
                        case 50:
                            secureConnect(string, iResponse);
                            return true;
                        case 51:
                            SearchRequest searchRequest = (SearchRequest) data.getParcelable(XmBluetoothManager.EXTRA_SEARCH_REQUEST);
                            if (searchRequest == null) {
                                return true;
                            }
                            search(searchRequest, iResponse);
                            return true;
                        case 52:
                            stopSearch();
                            return true;
                        case 53:
                            getFirmwareUpdateInfo(data.getString(XmBluetoothManager.EXTRA_MODEL), iResponse);
                            return true;
                        default:
                            switch (i) {
                                case 56:
                                    getDeviceBeaconKey(string2, iResponse);
                                    return true;
                                case 57:
                                    clearLocalToken(string);
                                    return true;
                                case 58:
                                    secureLogin(string, byteArray, iResponse);
                                    return true;
                                case 59:
                                    bleMeshBind(string, iResponse);
                                    return true;
                                case 60:
                                    bleMeshConnect(string, string2, ByteUtils.byteToString(byteArray), iResponse);
                                    return true;
                                case 61:
                                    startBleMeshUpgrade(string, string2, string3, string4, iResponse);
                                    return true;
                                case 62:
                                    cancelBleMeshUpgrade(string);
                                    return true;
                                case 63:
                                    getBleMeshFirmwareUpdateInfo(string2, iResponse);
                                    return true;
                                case 64:
                                    getBleMeshFirmwareUpdateInfoBatch(data.getStringArrayList(Constants.EXTRA_OTA_QUERY_DIDS), iResponse);
                                    return true;
                                case 65:
                                    createLightGroup(data.getStringArrayList(Constants.EXTRA_GROUP_CREATE_DIDS), data.getString(Constants.EXTRA_GROUP_CREATE_NAME), iResponse);
                                    return true;
                                case 66:
                                    modLightGroup(string2, data.getStringArrayList(Constants.EXTRA_GROUP_MOD_ADD_DIDS), data.getStringArrayList(Constants.EXTRA_GROUP_MOD_DEL_DIDS), iResponse);
                                    return true;
                                case 67:
                                    defLightGroup(iResponse);
                                    return true;
                                case 68:
                                    queryLightGroup(data.getStringArrayList(Constants.EXTRA_GROUP_QUERY_DIDS), iResponse);
                                    return true;
                                case 69:
                                    bleStandardAuthBind(string, iResponse);
                                    return true;
                                case 70:
                                    bleStandardAuthConnect(string, iResponse);
                                    return true;
                                default:
                                    return true;
                            }
                    }
            }
        } else {
            writeNoRspFast(string, uuid, uuid2, byteArray2, iResponse);
            return true;
        }
    }

    public void modLightGroup(String str, List<String> list, List<String> list2, final IResponse iResponse) {
        MiotCloudApi.modLightGroup(ServiceManager.getInstance().getPeople(), str, list, list2, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void queryLightGroup(List<String> list, final IResponse iResponse) {
        MiotCloudApi.queryLightGroup(ServiceManager.getInstance().getPeople(), list, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra.code", i);
                bundle.putString(Constants.EXTRA_RESPONSE_MSG, str);
                try {
                    iResponse.onResponse(-1, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                Bundle bundle = new Bundle();
                if (jSONObject != null) {
                    bundle.putString(Constants.EXTRA_DATA_JSON, jSONObject.toString());
                }
                try {
                    iResponse.onResponse(0, bundle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
