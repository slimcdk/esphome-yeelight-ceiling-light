package com.miot.service.manipulator.codec.get;

import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.device.InvalidPropertyException;
import com.miot.common.property.Property;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommonGetCodec extends GetCodec {
    public JSONObject encode(PropertyInfo propertyInfo) {
        if (propertyInfo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("did", propertyInfo.getInvokeInfo().getDeviceId());
                jSONObject.put("id", this.mSessionId.getAndIncrement());
                jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
                JSONArray jSONArray = new JSONArray();
                for (Property internalName : propertyInfo.getProperties()) {
                    jSONArray.put(internalName.getInternalName());
                }
                jSONObject.put("params", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                throw new InvalidPropertyException((Throwable) e);
            }
        } else {
            throw new InvalidPropertyException("propertyInfo is null");
        }
    }
}
