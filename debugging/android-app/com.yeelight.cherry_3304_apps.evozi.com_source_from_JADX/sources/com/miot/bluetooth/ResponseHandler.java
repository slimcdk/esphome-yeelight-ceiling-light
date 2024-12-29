package com.miot.bluetooth;

import org.json.JSONObject;

public interface ResponseHandler {
    void onFailure(int i, String str);

    void onSuccess(JSONObject jSONObject);
}
