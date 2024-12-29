package com.miot.api.bluetooth;

import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.miot.api.bluetooth.response.BleConnectResponse;
import com.miot.api.bluetooth.response.BleNotifyResponse;
import com.miot.api.bluetooth.response.BleReadResponse;
import com.miot.api.bluetooth.response.BleReadRssiResponse;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.api.bluetooth.response.BleWriteResponse;
import com.miot.api.bluetooth.response.GetBeaconKeyResponse;
import com.miot.api.bluetooth.response.GetFirmwareUpdateInfoResponse;
import com.miot.api.bluetooth.response.MiotBleResponse;
import java.util.ArrayList;
import java.util.UUID;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;

public abstract class XmBluetoothManager {
    public static final int CODE_BLE_MESH_BIND = 59;
    public static final int CODE_BLE_MESH_CONNECT = 60;
    public static final int CODE_BLE_MESH_OTA = 61;
    public static final int CODE_BLE_MESH_OTA_CANCEL = 62;
    public static final int CODE_BLE_STANDARD_AUTH_BIND = 69;
    public static final int CODE_BLE_STANDARD_AUTH_CONNECT = 70;
    public static final int CODE_CLEAR_LOCAL_TOKEN = 57;
    public static final int CODE_FIRMWARE_UPDATE = 53;
    public static final int CODE_GET_BEACONKEY = 56;
    public static final int CODE_MESH_GROUP_CREATE = 65;
    public static final int CODE_MESH_GROUP_DEF = 67;
    public static final int CODE_MESH_GROUP_MOD = 66;
    public static final int CODE_MESH_GROUP_QUERY = 68;
    public static final int CODE_MESH_OTA_BATCH_LATEST_VERSION = 64;
    public static final int CODE_MESH_OTA_LATEST_VERSION = 63;
    public static final int CODE_SEARCH = 51;
    public static final int CODE_SECURE_CONNECT = 50;
    public static final int CODE_SECURE_LOGIN = 58;
    public static final int CODE_SET_CONFIG = 12;
    public static final int CODE_STOP_SEARCH = 52;
    public static final String EXTRA_BEACONKEY = "extra.beacon.key";
    public static final String EXTRA_DID = "extra.did";
    public static final String EXTRA_MODEL = "extra_model";
    public static final String EXTRA_SEARCH_REQUEST = "extra_search_request";
    public static final String EXTRA_TOKEN = "extra.token";
    protected static XmBluetoothManager instance;
    int CODE_CONNECT = 1;
    int CODE_DISCONNECT = 2;
    int CODE_NOTIFY = 6;
    int CODE_READ = 3;
    int CODE_READ_RSSI = 8;
    int CODE_UNNOTIFY = 7;
    int CODE_WRITE = 4;
    int CODE_WRITE_NORSP = 5;
    String EXTRA_BYTE_VALUE = "extra.byte.value";
    String EXTRA_CHARACTER_UUID = "extra.character.uuid";
    String EXTRA_CODE = "extra.code";
    String EXTRA_CONFIG = "extra.config";
    String EXTRA_GATT_PROFILE = Constants.EXTRA_GATT_PROFILE;
    String EXTRA_MAC = "extra.mac";
    String EXTRA_OPTIONS = Constants.EXTRA_OPTIONS;
    String EXTRA_REQUEST = Constants.EXTRA_REQUEST;
    String EXTRA_RSSI = Constants.EXTRA_RSSI;
    String EXTRA_SEARCH_RESULT = Constants.EXTRA_SEARCH_RESULT;
    String EXTRA_SERVICE_UUID = "extra.service.uuid";
    String EXTRA_STATE = Constants.EXTRA_STATE;
    String EXTRA_STATUS = "extra.status";
    String EXTRA_VERSION = Constants.EXTRA_VERSION;

    public static XmBluetoothManager getInstance() {
        return instance;
    }

    public abstract void bleMeshBind(String str, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void bleMeshConnect(String str, String str2, String str3, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void bleStandardAuthBind(String str, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void bleStandardAuthConnect(String str, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void cancelBleMeshUpgrade(String str);

    public abstract void clearLocalToken(String str);

    public abstract void connect(String str, BleConnectResponse bleConnectResponse);

    public abstract void createLightGroup(ArrayList<String> arrayList, String str, MiotBleResponse miotBleResponse);

    public abstract void defLightGroup(MiotBleResponse miotBleResponse);

    public abstract void disconnect(String str);

    public abstract void getBleMeshFirmwareUpdateInfo(String str, MiotBleResponse miotBleResponse);

    public abstract void getBleMeshFirmwareUpdateInfoBatch(ArrayList<String> arrayList, MiotBleResponse miotBleResponse);

    public abstract void getBleMeshFirmwareVersion(String str, BleResponse<String> bleResponse);

    public abstract void getBluetoothFirmwareUpdateInfo(String str, GetFirmwareUpdateInfoResponse getFirmwareUpdateInfoResponse);

    public abstract void getDeviceBeaconKey(String str, GetBeaconKeyResponse getBeaconKeyResponse);

    public abstract void modLightGroup(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, MiotBleResponse miotBleResponse);

    public abstract void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse);

    public abstract void queryLightGroup(ArrayList<String> arrayList, MiotBleResponse miotBleResponse);

    public abstract void read(String str, UUID uuid, UUID uuid2, BleReadResponse bleReadResponse);

    public abstract void readRemoteRssi(String str, BleReadRssiResponse bleReadRssiResponse);

    public abstract void search(SearchRequest searchRequest, SearchResponse searchResponse);

    public abstract void secureConnect(String str, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void secureLogin(String str, byte[] bArr, BluetoothConnectStatusResponse bluetoothConnectStatusResponse);

    public abstract void setDeviceConfig(BluetoothDeviceConfig bluetoothDeviceConfig);

    public abstract void startBleMeshUpgrade(String str, String str2, String str3, String str4, IBleMeshUpgradeResponse iBleMeshUpgradeResponse);

    public abstract void stopSearch();

    public abstract void unnotify(String str, UUID uuid, UUID uuid2);

    public abstract void write(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse);

    public abstract void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse);
}
