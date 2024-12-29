package com.miot.api.bluetooth;

import android.os.Bundle;
import android.os.RemoteException;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.IBluetoothCaller;
import com.miot.api.IResponse;
import com.miot.api.LogHelper;
import com.miot.api.bluetooth.response.BleConnectResponse;
import com.miot.api.bluetooth.response.BleNotifyResponse;
import com.miot.api.bluetooth.response.BleReadResponse;
import com.miot.api.bluetooth.response.BleReadRssiResponse;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.api.bluetooth.response.BleWriteResponse;
import com.miot.api.bluetooth.response.GetBeaconKeyResponse;
import com.miot.api.bluetooth.response.GetFirmwareUpdateInfoResponse;
import com.miot.api.bluetooth.response.MiotBleResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.service.connection.wifi.WebShellActivity;
import java.util.ArrayList;
import java.util.UUID;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;
import org.json.JSONException;
import org.json.JSONObject;

public class BluetoothManager extends XmBluetoothManager {
    public static final int CODE_ON_DEVICE_FOUNDED = 1;
    public static final int CODE_ON_SEARCH_CANCELED = 4;
    public static final int CODE_ON_SEARCH_STARTED = 0;
    public static final int CODE_ON_SEARCH_STOPPED = 2;
    public static final String EXTRA_FIRMWARE_UPDATE_INFO = "extra_firmware_update_info";
    public static final String EXTRA_SEARCH_RESULT = "extra_search_result";
    private static final String TAG = "MiotBluetooth";
    private IBluetoothCaller mRemote;

    public BluetoothManager(IBluetoothCaller iBluetoothCaller) {
        this.mRemote = iBluetoothCaller;
        XmBluetoothManager.instance = this;
    }

    private void safeRemoteCall(int i, Bundle bundle, IResponse iResponse) {
        try {
            this.mRemote.callBluetoothApi(i, bundle, iResponse);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void bleMeshBind(String str, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(59, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void bleMeshConnect(String str, String str2, String str3, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putString(XmBluetoothManager.EXTRA_DID, str2);
        bundle.putByteArray(XmBluetoothManager.EXTRA_TOKEN, ByteUtils.stringToBytes(str3));
        safeRemoteCall(60, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void bleStandardAuthBind(String str, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(69, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void bleStandardAuthConnect(String str, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(70, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void cancelBleMeshUpgrade(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(62, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
            }
        });
    }

    public void clearLocalToken(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(57, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
            }
        });
    }

    public void connect(String str, final BleConnectResponse bleConnectResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(this.CODE_CONNECT, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                bleConnectResponse.onResponse(i, bundle);
            }
        });
    }

    public void createLightGroup(ArrayList<String> arrayList, String str, MiotBleResponse miotBleResponse) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Constants.EXTRA_GROUP_CREATE_DIDS, arrayList);
        bundle.putString(Constants.EXTRA_GROUP_CREATE_NAME, str);
        safeRemoteCall(65, bundle, miotBleResponse);
    }

    public void defLightGroup(MiotBleResponse miotBleResponse) {
        safeRemoteCall(67, new Bundle(), miotBleResponse);
    }

    public void disconnect(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(this.CODE_DISCONNECT, bundle, (IResponse) null);
    }

    public void getBleMeshFirmwareUpdateInfo(String str, MiotBleResponse miotBleResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(XmBluetoothManager.EXTRA_DID, str);
        safeRemoteCall(63, bundle, miotBleResponse);
    }

    public void getBleMeshFirmwareUpdateInfoBatch(ArrayList<String> arrayList, MiotBleResponse miotBleResponse) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Constants.EXTRA_OTA_QUERY_DIDS, arrayList);
        safeRemoteCall(64, bundle, miotBleResponse);
    }

    public void getBleMeshFirmwareVersion(String str, final BleResponse<String> bleResponse) {
        read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() {
            public void onResponse(int i, byte[] bArr) {
                if (i == 0 && !ByteUtils.isEmpty(bArr)) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < bArr.length && bArr[i2] != 0) {
                        i3++;
                        i2++;
                    }
                    if (i3 != 0) {
                        byte[] bArr2 = new byte[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            bArr2[i4] = bArr[i4];
                        }
                        bleResponse.onResponse(0, new String(bArr2));
                        return;
                    }
                }
                bleResponse.onResponse(-1, "");
            }
        });
    }

    public void getBluetoothFirmwareUpdateInfo(String str, final GetFirmwareUpdateInfoResponse getFirmwareUpdateInfoResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(XmBluetoothManager.EXTRA_MODEL, str);
        safeRemoteCall(53, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                if (i == 0) {
                    BtFirmwareUpdateInfo btFirmwareUpdateInfo = new BtFirmwareUpdateInfo();
                    if (bundle != null && bundle.containsKey(BluetoothManager.EXTRA_FIRMWARE_UPDATE_INFO)) {
                        try {
                            JSONObject jSONObject = new JSONObject(bundle.getString(BluetoothManager.EXTRA_FIRMWARE_UPDATE_INFO)).getJSONObject("result");
                            if (jSONObject != null) {
                                btFirmwareUpdateInfo.version = jSONObject.getString(com.xiaomi.mipush.sdk.Constants.VERSION);
                                btFirmwareUpdateInfo.changeLog = jSONObject.getString("changeLog");
                                btFirmwareUpdateInfo.url = jSONObject.getString(WebShellActivity.ARGS_KEY_URL);
                            }
                            getFirmwareUpdateInfoResponse.onResponse(i, btFirmwareUpdateInfo);
                            return;
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    getFirmwareUpdateInfoResponse.onResponse(-1, null);
                    return;
                }
                getFirmwareUpdateInfoResponse.onResponse(i, null);
            }
        });
    }

    public void getDeviceBeaconKey(String str, final GetBeaconKeyResponse getBeaconKeyResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(XmBluetoothManager.EXTRA_DID, str);
        safeRemoteCall(56, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                String string = (i != 0 || bundle == null) ? null : bundle.getString(XmBluetoothManager.EXTRA_BEACONKEY);
                GetBeaconKeyResponse getBeaconKeyResponse = getBeaconKeyResponse;
                if (getBeaconKeyResponse != null) {
                    getBeaconKeyResponse.onResponse(i, string);
                }
            }
        });
    }

    public void modLightGroup(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, MiotBleResponse miotBleResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(XmBluetoothManager.EXTRA_DID, str);
        bundle.putStringArrayList(Constants.EXTRA_GROUP_MOD_ADD_DIDS, arrayList);
        bundle.putStringArrayList(Constants.EXTRA_GROUP_MOD_DEL_DIDS, arrayList2);
        safeRemoteCall(66, bundle, miotBleResponse);
    }

    public void notify(String str, UUID uuid, UUID uuid2, final BleNotifyResponse bleNotifyResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putSerializable(this.EXTRA_SERVICE_UUID, uuid);
        bundle.putSerializable(this.EXTRA_CHARACTER_UUID, uuid2);
        safeRemoteCall(this.CODE_NOTIFY, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                BleNotifyResponse bleNotifyResponse = bleNotifyResponse;
                if (bleNotifyResponse != null) {
                    bleNotifyResponse.onResponse(i, null);
                }
            }
        });
    }

    public void queryLightGroup(ArrayList<String> arrayList, MiotBleResponse miotBleResponse) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Constants.EXTRA_GROUP_QUERY_DIDS, arrayList);
        safeRemoteCall(68, bundle, miotBleResponse);
    }

    public void read(String str, UUID uuid, UUID uuid2, final BleReadResponse bleReadResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putSerializable(this.EXTRA_SERVICE_UUID, uuid);
        bundle.putSerializable(this.EXTRA_CHARACTER_UUID, uuid2);
        safeRemoteCall(this.CODE_READ, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                if (bleReadResponse != null) {
                    bleReadResponse.onResponse(i, bundle != null ? bundle.getByteArray(BluetoothManager.this.EXTRA_BYTE_VALUE) : null);
                }
            }
        });
    }

    public void readRemoteRssi(String str, final BleReadRssiResponse bleReadRssiResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(this.CODE_READ_RSSI, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                if (bleReadRssiResponse != null) {
                    int i2 = 0;
                    if (bundle != null) {
                        i2 = bundle.getInt(BluetoothManager.this.EXTRA_RSSI, 0);
                    }
                    bleReadRssiResponse.onResponse(i, Integer.valueOf(i2));
                }
            }
        });
    }

    public void search(SearchRequest searchRequest, final SearchResponse searchResponse) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(XmBluetoothManager.EXTRA_SEARCH_REQUEST, searchRequest);
        safeRemoteCall(51, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                if (i == 0) {
                    searchResponse.onSearchStarted();
                } else if (i == 1) {
                    bundle.setClassLoader(SearchResult.class.getClassLoader());
                    searchResponse.onDeviceFounded((SearchResult) bundle.getParcelable(BluetoothManager.EXTRA_SEARCH_RESULT));
                } else if (i == 2) {
                    searchResponse.onSearchStopped();
                } else if (i == 4) {
                    searchResponse.onSearchCanceled();
                }
            }
        });
    }

    public void secureConnect(String str, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        safeRemoteCall(50, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void secureLogin(String str, byte[] bArr, final BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putByteArray(XmBluetoothManager.EXTRA_TOKEN, bArr);
        safeRemoteCall(58, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (bluetoothConnectStatusResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        bluetoothConnectStatusResponse.onResponse(i, bundle);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void setDeviceConfig(BluetoothDeviceConfig bluetoothDeviceConfig) {
        LogHelper.log(TAG, "setDeviceConfig config: " + bluetoothDeviceConfig.toString());
        Bundle bundle = new Bundle();
        bundle.putSerializable(this.EXTRA_CONFIG, bluetoothDeviceConfig);
        safeRemoteCall(12, bundle, (IResponse) null);
    }

    public void startBleMeshUpgrade(String str, String str2, String str3, String str4, final IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putString(XmBluetoothManager.EXTRA_DID, str2);
        bundle.putString(Constants.EXTRA_OTA_LATEST_VERSION, str3);
        bundle.putString(Constants.EXTRA_OTA_FILE_PATH, str4);
        safeRemoteCall(61, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                try {
                    if (iBleMeshUpgradeResponse != null) {
                        bundle.setClassLoader(getClass().getClassLoader());
                        if (i == 10101) {
                            iBleMeshUpgradeResponse.onProgress(bundle.getInt(Constants.EXTRA_OTA_PROGRESS));
                        } else {
                            iBleMeshUpgradeResponse.onResponse(bundle.getInt("extra.code"), bundle.getString(Constants.EXTRA_RESPONSE_MSG));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void stopSearch() {
        safeRemoteCall(52, (Bundle) null, (IResponse) null);
    }

    public void unnotify(String str, UUID uuid, UUID uuid2) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putSerializable(this.EXTRA_SERVICE_UUID, uuid);
        bundle.putSerializable(this.EXTRA_CHARACTER_UUID, uuid2);
        safeRemoteCall(this.CODE_UNNOTIFY, bundle, (IResponse) null);
    }

    public void write(String str, UUID uuid, UUID uuid2, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putSerializable(this.EXTRA_SERVICE_UUID, uuid);
        bundle.putSerializable(this.EXTRA_CHARACTER_UUID, uuid2);
        bundle.putByteArray(this.EXTRA_BYTE_VALUE, bArr);
        safeRemoteCall(this.CODE_WRITE, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i, null);
                }
            }
        });
    }

    public void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, final BleWriteResponse bleWriteResponse) {
        Bundle bundle = new Bundle();
        bundle.putString(this.EXTRA_MAC, str);
        bundle.putSerializable(this.EXTRA_SERVICE_UUID, uuid);
        bundle.putSerializable(this.EXTRA_CHARACTER_UUID, uuid2);
        bundle.putByteArray(this.EXTRA_BYTE_VALUE, bArr);
        safeRemoteCall(this.CODE_WRITE_NORSP, bundle, new MiotBleResponse() {
            public void onResponse(int i, Bundle bundle) {
                BleWriteResponse bleWriteResponse = bleWriteResponse;
                if (bleWriteResponse != null) {
                    bleWriteResponse.onResponse(i, null);
                }
            }
        });
    }
}
