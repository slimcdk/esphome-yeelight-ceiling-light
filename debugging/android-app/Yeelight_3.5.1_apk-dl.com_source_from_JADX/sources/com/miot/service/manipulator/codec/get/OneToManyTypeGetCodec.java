package com.miot.service.manipulator.codec.get;

import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.property.Property;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.manipulator.codec.DecodeHelper;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class OneToManyTypeGetCodec extends CommonGetCodec {
    public void decode(PropertyInfo propertyInfo, JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        JSONArray resultArray = jsonResponse.getResultArray();
        if (resultArray == null && result == null) {
            throw new InvalidResponseException("invalid response: result is null");
        }
        List<Property> properties = propertyInfo.getProperties();
        if (resultArray != null) {
            if (properties.size() != 1 || resultArray.length() <= 1) {
                DecodeHelper.decode(properties, resultArray);
            } else {
                properties.get(0).setValue(resultArray.toString());
            }
        }
        if (result != null) {
            DecodeHelper.decode(properties, result);
        }
    }
}
