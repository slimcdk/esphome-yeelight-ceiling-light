package com.miot.service.common.mipush;

import org.json.JSONObject;

public interface MiotpnMessageProcessor {
    boolean onProcess(JSONObject jSONObject);
}
