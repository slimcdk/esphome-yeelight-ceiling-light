package com.miot.service.manipulator.codec.get;

import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.property.Property;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.manipulator.codec.DecodeHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class GetCodec {
    public static final String DEFAULT_GET_PROPERTY = "get_prop";
    protected AtomicInteger mSessionId = new AtomicInteger(1);

    public void decode(PropertyInfo propertyInfo, JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        JSONArray resultArray = jsonResponse.getResultArray();
        if (resultArray == null && result == null) {
            throw new InvalidResponseException("invalid response: result is null");
        }
        List<Property> properties = propertyInfo.getProperties();
        if (resultArray != null) {
            DecodeHelper.decode(properties, resultArray);
        }
        if (result != null) {
            DecodeHelper.decode(properties, result);
        }
    }

    public abstract JSONObject encode(PropertyInfo propertyInfo);
}
