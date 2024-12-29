package com.miot.service.manipulator.codec.get;

import com.miot.common.device.invocation.PropertyInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WaterPurifierGetCodec extends GetCodec {
    public JSONObject encode(PropertyInfo propertyInfo) {
        if (propertyInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", propertyInfo.getInvokeInfo().getDeviceId());
            jSONObject.put("id", this.mSessionId.getAndIncrement());
            jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
            jSONObject.put("params", new JSONArray());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
