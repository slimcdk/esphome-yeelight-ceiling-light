package com.miot.service.common.task;

import com.miot.common.ReturnCode;

public class MiotError {
    public static final MiotError ACCOUNT_EXPIRED = new MiotError(ReturnCode.E_ACCOUNT_LOGOUT, "account expired");
    public static final MiotError ACCOUNT_INVALID = new MiotError(ReturnCode.E_ACCOUNT_LOGIN, "account invalid");
    public static final MiotError ACCOUNT_NOT_LOGIN = new MiotError(ReturnCode.E_ACCOUNT_LOGOUT, "account not login");
    public static final MiotError ACTION_ARGUMENT_INVALID = new MiotError(2002, "action argument invalid");
    public static final MiotError ACTION_INVALID = new MiotError(ReturnCode.E_ACTION_INVALID, "action invalid");
    public static final MiotError BINDKEY_BOUND = new MiotError(-3, "bind key has bound");
    public static final MiotError BINDKEY_EXPIRE = new MiotError(-2, "bind key expire");
    public static final MiotError BINDKEY_FAILED = new MiotError(-4, "bind key failed");
    public static final MiotError BINDKEY_ILLEGAL = new MiotError(-1, "bind key illegal");
    public static final MiotError BINDKEY_SERVER_ERROR = new MiotError(-5, "bind key server error");
    public static final MiotError DEVICE_NOT_FOUND = new MiotError(ReturnCode.E_ACTION_NOT_SUPPORT, "cannot find device");
    public static final MiotError INTERNAL_ERROR = new MiotError(1004, "internal error");
    public static final MiotError NETWORK_UNAVAILABLE = new MiotError(1006, "network unavailable");
    public static final MiotError NOT_IMPLEMENTED = new MiotError(1003, "not implemented");

    /* renamed from: OK */
    public static final MiotError f4701OK = new MiotError(0, "ok");
    public static final MiotError PARAM_INVALID = new MiotError(1006, "param invalid");
    public static final MiotError PROPERTY_INVALID = new MiotError(ReturnCode.E_ACTION_ARGUMENT_INVALID, "property invalid");
    public static final MiotError REQUEST_INVALID = new MiotError(1001, "request invalid");
    public static final MiotError REQUEST_TIMEOUT = new MiotError(1007, "request timeout");
    public static final MiotError RESPONSE_INVALID = new MiotError(1002, "response invalid");
    public static final MiotError SERVICE_UNAVAILABLE = new MiotError(ReturnCode.E_INVALID_OPERATION, "service unavailable");
    private int mCode;
    private String mMessage;

    public MiotError(int i, String str) {
        this.mCode = i;
        this.mMessage = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MiotError) && this.mCode == ((MiotError) obj).getCode();
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public void setCode(int i) {
        this.mCode = i;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public String toString() {
        return "code:" + this.mCode + "  message:" + this.mMessage;
    }
}
