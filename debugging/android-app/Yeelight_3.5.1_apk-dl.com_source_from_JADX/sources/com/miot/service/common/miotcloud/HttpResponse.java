package com.miot.service.common.miotcloud;

import org.json.JSONObject;

public class HttpResponse {
    private int mCode;
    private String mMessage;
    private JSONObject mResult;

    public HttpResponse(int i, String str, JSONObject jSONObject) {
        this.mCode = i;
        this.mMessage = str;
        this.mResult = jSONObject;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public JSONObject getResult() {
        return this.mResult;
    }

    public String toString() {
        return "code: " + this.mCode + " " + "message: " + this.mMessage + " " + "result: " + this.mResult;
    }
}
