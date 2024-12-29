package com.inuker.bluetooth.library;

import java.util.UUID;

public class Constants {
    public static final String ACTION_CHARACTER_CHANGED = "action.character_changed";
    public static final String ACTION_CONNECT_STATUS_CHANGED = "action.connect_status_changed";
    public static final int BLE_NOT_SUPPORTED = -4;
    public static final int BLUETOOTH_DISABLED = -5;
    public static final int BOND_BONDED = 12;
    public static final int BOND_BONDING = 11;
    public static final int BOND_NONE = 10;
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final int CODE_CLEAR_REQUEST = 20;
    public static final int CODE_CONNECT = 1;
    public static final int CODE_DISCONNECT = 2;
    public static final int CODE_INDICATE = 10;
    public static final int CODE_NOTIFY = 6;
    public static final int CODE_READ = 3;
    public static final int CODE_READ_DESCRIPTOR = 13;
    public static final int CODE_READ_RSSI = 8;
    public static final int CODE_SEARCH = 11;
    public static final int CODE_STOP_SESARCH = 12;
    public static final int CODE_UNNOTIFY = 7;
    public static final int CODE_WRITE = 4;
    public static final int CODE_WRITE_DESCRIPTOR = 14;
    public static final int CODE_WRITE_NORSP = 5;
    public static final int CODE_WRITE_NORSP_FAST = 21;
    public static final int DEVICE_FOUND = 4;
    public static final String EXTRA_BYTE_VALUE = "extra.byte.value";
    public static final String EXTRA_CHARACTER_UUID = "extra.character.uuid";
    public static final String EXTRA_CODE = "extra.code";
    public static final String EXTRA_DATA_JSON = "extra.data.json";
    public static final String EXTRA_DESCRIPTOR_UUID = "extra.descriptor.uuid";
    public static final String EXTRA_GATT_PROFILE = "extra.gatt.profile";
    public static final String EXTRA_GROUP_CREATE_DIDS = "extra.group.create.dids";
    public static final String EXTRA_GROUP_CREATE_NAME = "extra.group.create.name";
    public static final String EXTRA_GROUP_MOD_ADD_DIDS = "extra.group.add.dids";
    public static final String EXTRA_GROUP_MOD_DEL_DIDS = "extra.group.del.dids";
    public static final String EXTRA_GROUP_QUERY_DIDS = "extra.group.query.dids";
    public static final String EXTRA_MAC = "extra.mac";
    public static final String EXTRA_OPTIONS = "extra.options";
    public static final String EXTRA_OTA_FILE_PATH = "extra.ota.file.path";
    public static final String EXTRA_OTA_LATEST_VERSION = "extra.ota.latest.version";
    public static final String EXTRA_OTA_PROGRESS = "extra.ota.progress";
    public static final String EXTRA_OTA_QUERY_DIDS = "extra.ota.dids";
    public static final String EXTRA_REQUEST = "extra.request";
    public static final String EXTRA_RESPONSE_CODE = "extra.code";
    public static final String EXTRA_RESPONSE_MSG = "extra.msg";
    public static final String EXTRA_RSSI = "extra.rssi";
    public static final String EXTRA_SEARCH_RESULT = "extra.search.result";
    public static final String EXTRA_SERVICE_UUID = "extra.service.uuid";
    public static final String EXTRA_STATE = "extra.state";
    public static final String EXTRA_STATUS = "extra.status";
    public static final String EXTRA_TYPE = "extra.type";
    public static final String EXTRA_VERSION = "extra.version";
    public static final int ILLEGAL_ARGUMENT = -3;
    public static final int REQUEST_CANCELED = -2;
    public static final int REQUEST_DENIED = -9;
    public static final int REQUEST_EXCEPTION = -10;
    public static final int REQUEST_FAILED = -1;
    public static final int REQUEST_NOTIFY = 4;
    public static final int REQUEST_OVERFLOW = -8;
    public static final int REQUEST_READ = 1;
    public static final int REQUEST_RSSI = 8;
    public static final int REQUEST_SUCCESS = 0;
    public static final int REQUEST_TIMEDOUT = -7;
    public static final int REQUEST_WRITE = 2;
    public static final int SEARCH_CANCEL = 3;
    public static final int SEARCH_START = 1;
    public static final int SEARCH_STOP = 2;
    public static final int SEARCH_TYPE_BLE = 2;
    public static final int SEARCH_TYPE_CLASSIC = 1;
    public static final int SERVICE_UNREADY = -6;
    public static final int STATE_OFF = 10;
    public static final int STATE_ON = 12;
    public static final int STATE_TURNING_OFF = 13;
    public static final int STATE_TURNING_ON = 11;
    public static final int STATUS_CONNECTED = 16;
    public static final int STATUS_DEVICE_CONNECTED = 2;
    public static final int STATUS_DEVICE_CONNECTING = 1;
    public static final int STATUS_DEVICE_DISCONNECTED = 0;
    public static final int STATUS_DEVICE_DISCONNECTING = 3;
    public static final int STATUS_DEVICE_SERVICE_READY = 19;
    public static final int STATUS_DISCONNECTED = 32;
    public static final int STATUS_UNKNOWN = -1;

    public static String getStatusText(int i) {
        if (i == 0) {
            return "Disconnected";
        }
        if (i == 1) {
            return "Connecting";
        }
        if (i == 2) {
            return "Connected";
        }
        if (i == 3) {
            return "Disconnecting";
        }
        if (i == 19) {
            return "Service Ready";
        }
        return String.format("Unknown %d", new Object[]{Integer.valueOf(i)});
    }
}
