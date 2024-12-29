package com.miot.service.manipulator.codec.invoke;

import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.property.Property;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GatewayInvokeCodec extends InvokeCodec {
    public JSONObject encode(ActionInfo actionInfo) {
        if (actionInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        InvokeInfo invokeInfo = actionInfo.getInvokeInfo();
        try {
            jSONObject.put("did", invokeInfo.getParentDeviceId());
            jSONObject.put("sid", invokeInfo.getDeviceId());
            jSONObject.put("id", this.mSessionId.getAndIncrement());
            jSONObject.put("method", actionInfo.getInternalName());
            JSONArray jSONArray = new JSONArray();
            for (Property value : actionInfo.getArguments()) {
                jSONArray.put(value.getValue());
            }
            jSONObject.put("params", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
