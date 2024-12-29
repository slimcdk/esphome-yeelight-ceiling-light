package com.miot.service.common.miotcloud;

import com.miot.common.ReturnCode;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonResponse {
    private static final String RESP_CODE = "code";
    private static final String RESP_MESSAGE = "message";
    private static final String RESP_RESULT = "result";
    private int mCode;
    private String mMessage;
    private JSONObject mResponse;
    private JSONArray mResultArray = new JSONArray();
    private JSONObject mResultObject = new JSONObject();

    public JsonResponse(JSONObject jSONObject) {
        this.mResponse = jSONObject;
        this.mCode = jSONObject.optInt("code", ReturnCode.E_ACTION_INVALID_RESULT);
        this.mMessage = jSONObject.optString("message");
        this.mResultObject = jSONObject.optJSONObject(RESP_RESULT);
        this.mResultArray = jSONObject.optJSONArray(RESP_RESULT);
        int i = this.mCode;
        if (i != 0 && !MiotCode.validate(i)) {
            this.mMessage = MiotCode.getDescription(this.mCode);
            this.mCode = 1010;
        }
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public JSONObject getResult() {
        return this.mResultObject;
    }

    public JSONArray getResultArray() {
        return this.mResultArray;
    }

    public String toString() {
        JSONObject jSONObject = this.mResponse;
        return jSONObject != null ? jSONObject.toString() : super.toString();
    }
}
