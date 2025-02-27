package com.inuker.bluetooth.library;

public class Code {
    public static final int BLE_NOT_SUPPORTED = -4;
    public static final int BLUETOOTH_DISABLED = -5;
    public static final int CONFIG_UNREADY = -12;
    public static final int ILLEGAL_ARGUMENT = -3;
    public static final int REQUEST_BIND_DID_FAILED = -30;
    public static final int REQUEST_CANCELED = -2;
    public static final int REQUEST_DENIED = -9;
    public static final int REQUEST_EXCEPTION = -10;
    public static final int REQUEST_FAILED = -1;
    public static final int REQUEST_GET_DID_FAILED = -29;
    public static final int REQUEST_MESH_PROVISION_INFO_FAILED = -44;
    public static final int REQUEST_MESH_REG_DEVICE_VERIFY_CERT_FAILED = -41;
    public static final int REQUEST_MESH_REG_DEVICE_VERIFY_PUB_FAILED = -43;
    public static final int REQUEST_MESH_REG_DEVICE_VERIFY_SIGN_FAILED = -42;
    public static final int REQUEST_MESH_REG_SERVER_VERIFY_CERT_FAILED = -39;
    public static final int REQUEST_MESH_REG_SERVER_VERIFY_SIGN_FAILED = -40;
    public static final int REQUEST_MESH_SEND_SERVER_RESULT_FAILED = -45;
    public static final int REQUEST_NOTIFY_FAILED = -27;
    public static final int REQUEST_NOTIFY_TIMEDOUT = -55;
    public static final int REQUEST_NOT_CONNECTED = -13;
    public static final int REQUEST_OVERFLOW = -8;
    public static final int REQUEST_SC_BIND_LTMK_FAILED = -26;
    public static final int REQUEST_SC_LOGIN_ENCRYPT_DATA_FAILED = -21;
    public static final int REQUEST_SC_LOGIN_FAILED = -22;
    public static final int REQUEST_SC_NOT_REGISTERED = -16;
    public static final int REQUEST_SC_REGISTERED = -17;
    public static final int REQUEST_SC_REGISTER_FAILED = -20;
    public static final int REQUEST_SC_REGISTER_GET_BIND_KEY_FAILED = -46;
    public static final int REQUEST_SC_REGISTER_UNSUPPORT_VERSION = -37;
    public static final int REQUEST_SC_SHARED_KEY_EXPIRED = -18;
    public static final int REQUEST_SC_SHARED_KEY_FAILED = -19;
    public static final int REQUEST_SC_SHARED_LOGIN_ENCRYPT_DATA_FAILED = -23;
    public static final int REQUEST_SC_SHARED_LOGIN_FAILED = -24;
    public static final int REQUEST_SC_SHARED_LOGIN_KEY_ID_EMPTY = -25;
    public static final int REQUEST_STANDARD_AUTH_ERR_RELOGIN = -53;
    public static final int REQUEST_STANDARD_AUTH_GET_APP_CONFIRM_FAILED = -48;
    public static final int REQUEST_STANDARD_AUTH_GET_DEVICE_INFO_FAILED = -47;
    public static final int REQUEST_STANDARD_AUTH_GET_QR_OOB_FAILED = -50;
    public static final int REQUEST_STANDARD_AUTH_LOGIN_FAILED = -52;
    public static final int REQUEST_STANDARD_AUTH_OOB_FAILED = -49;
    public static final int REQUEST_STANDARD_AUTH_REGISTER_FAILED = -51;
    public static final int REQUEST_STANDARD_AUTH_TOKEN_IS_EMPTY = -54;
    public static final int REQUEST_SUCCESS = 0;
    public static final int REQUEST_TIMEDOUT = -7;
    public static final int REQUEST_WRITE_FAILED = -28;
    public static final int SERVICE_UNREADY = -6;
    public static final int TOKEN_NOT_MATCHED = -11;

    public static String toString(int i) {
        if (i == -13) {
            return "REQUEST_NOT_CONNECTED";
        }
        if (i == -9) {
            return "REQUEST_DENIED";
        }
        if (i == -7) {
            return "REQUEST_TIMEDOUT";
        }
        if (i == -6) {
            return "SERVICE_UNREADY";
        }
        if (i == -5) {
            return "BLUETOOTH_DISABLED";
        }
        if (i == -4) {
            return "BLE_NOT_SUPPORTED";
        }
        if (i == -3) {
            return "ILLEGAL_ARGUMENT";
        }
        if (i == -1) {
            return "REQUEST_FAILED";
        }
        if (i == 0) {
            return "REQUEST_SUCCESS";
        }
        switch (i) {
            case REQUEST_STANDARD_AUTH_TOKEN_IS_EMPTY /*-54*/:
                return "REQUEST_STANDARD_AUTH_TOKEN_IS_EMPTY";
            case REQUEST_STANDARD_AUTH_ERR_RELOGIN /*-53*/:
                return "REQUEST_STANDARD_AUTH_ERR_RELOGIN";
            case REQUEST_STANDARD_AUTH_LOGIN_FAILED /*-52*/:
                return "REQUEST_STANDARD_AUTH_LOGIN_FAILED";
            case REQUEST_STANDARD_AUTH_REGISTER_FAILED /*-51*/:
                return "REQUEST_STANDARD_AUTH_REGISTER_FAILED";
            case REQUEST_STANDARD_AUTH_GET_QR_OOB_FAILED /*-50*/:
                return "REQUEST_STANDARD_AUTH_GET_QR_OOB_FAILED";
            case REQUEST_STANDARD_AUTH_OOB_FAILED /*-49*/:
                return "REQUEST_STANDARD_AUTH_OOB_FAILED";
            case REQUEST_STANDARD_AUTH_GET_APP_CONFIRM_FAILED /*-48*/:
                return "REQUEST_STANDARD_AUTH_GET_APP_CONFIRM_FAILED";
            case REQUEST_STANDARD_AUTH_GET_DEVICE_INFO_FAILED /*-47*/:
                return "REQUEST_STANDARD_AUTH_GET_DEVICE_INFO_FAILED";
            default:
                return "unknown code: " + i;
        }
    }
}
