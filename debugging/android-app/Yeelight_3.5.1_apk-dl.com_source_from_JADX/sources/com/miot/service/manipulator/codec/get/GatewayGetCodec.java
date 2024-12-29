package com.miot.service.manipulator.codec.get;

import com.miot.common.device.invocation.InvokeInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.property.Property;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.manipulator.codec.DecodeHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GatewayGetCodec extends GetCodec {
    public void decode(PropertyInfo propertyInfo, JsonResponse jsonResponse) {
        JSONArray resultArray = jsonResponse.getResultArray();
        if (resultArray != null) {
            try {
                DecodeHelper.decode(propertyInfo.getProperties(), resultArray.getJSONArray(0));
            } catch (JSONException e) {
                e.printStackTrace();
                throw new InvalidResponseException((Throwable) e);
            }
        } else {
            throw new InvalidResponseException("invalid response: result is null");
        }
    }

    public JSONObject encode(PropertyInfo propertyInfo) {
        if (propertyInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        InvokeInfo invokeInfo = propertyInfo.getInvokeInfo();
        try {
            jSONObject.put("did", Integer.parseInt(invokeInfo.getParentDeviceId()));
            jSONObject.put("id", this.mSessionId.getAndIncrement());
            jSONObject.put("method", "get_device_prop_exp");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(invokeInfo.getDeviceId());
            for (Property internalName : propertyInfo.getProperties()) {
                jSONArray.put(internalName.getInternalName());
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            jSONObject.put("params", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
