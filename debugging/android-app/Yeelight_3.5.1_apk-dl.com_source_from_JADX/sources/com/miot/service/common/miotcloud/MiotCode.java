package com.miot.service.common.miotcloud;

public class MiotCode {
    public static final int E_DEVICE_OFFLINE = -2;
    public static final int E_FEQUENT_REQUEST = -12;
    public static final int E_INTERNAL_DEVICE_ERROR = -5;
    public static final int E_INTERNAL_SERVER_ERROR = -4;
    public static final int E_INVALID_REQUEST = -6;
    public static final int E_MAXIMAL_SHARE_REQUEST = -13;
    private static final int E_MAX_VALUE = 0;
    private static final int E_MIN_VALUE = -10000;
    public static final int E_MSG_FORMAT_ERROR = -8;
    public static final int E_MSG_TOO_LONG = -7;
    public static final int E_NO_METHOD = -10;
    public static final int E_PERMISSION_DENIED = -1;
    public static final int E_REPEATED_REQUEST = -11;
    public static final int E_REQUEST_TIMEOUT = -3;
    public static final int E_SUBDEVICE_ERROR = -16;
    public static final int E_SUBDEVICE_NOT_FOUND = -14;
    public static final int E_SUBDEVICE_NO_METHOD = -15;
    public static final int E_UNKNOWN_ERROR = -9;

    /* renamed from: OK */
    public static final int f4700OK = 0;

    public static String getDescription(int i) {
        String format = String.format("invalid cloud return code: %d", new Object[]{Integer.valueOf(i)});
        if (!validate(i)) {
            return format;
        }
        switch (i) {
            case -16:
            case E_SUBDEVICE_NOT_FOUND /*-14*/:
                return "sub device not found";
            case E_SUBDEVICE_NO_METHOD /*-15*/:
                return "sub device no such method";
            case -13:
                return "maximal share request";
            case -12:
                return "frequent request";
            case -11:
                return "repeated request";
            case -10:
                return "method ?";
            case -9:
                return "unknown error";
            case -8:
                return "message format error";
            case -7:
                return "message too long";
            case -6:
                return "invalid request";
            case -5:
                return "internal exception occurred from device";
            case -4:
                return "internal exception occurred from server";
            case -3:
                return "request timeout";
            case -2:
                return "device offline";
            case -1:
                return "permission denied";
            case 0:
                return "OK";
            default:
                return format;
        }
    }

    public static boolean validate(int i) {
        return i <= 0 && i >= E_MIN_VALUE;
    }
}
