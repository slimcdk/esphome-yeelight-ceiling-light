package com.miot.service.manipulator.codec.invoke;

import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.property.Property;
import com.miot.service.common.miotcloud.JsonResponse;
import com.miot.service.manipulator.codec.DecodeHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class InvokeCodec {
    protected AtomicInteger mSessionId = new AtomicInteger(1);

    public void decode(ActionInfo actionInfo, JsonResponse jsonResponse) {
        JSONObject result = jsonResponse.getResult();
        JSONArray resultArray = jsonResponse.getResultArray();
        if (resultArray == null && result == null) {
            throw new InvalidResponseException("invalid response, result is null");
        }
        List<Property> results = actionInfo.getResults();
        if (resultArray != null) {
            DecodeHelper.decode(results, resultArray);
        }
        if (result != null) {
            DecodeHelper.decode(results, result);
        }
    }

    public abstract JSONObject encode(ActionInfo actionInfo);
}
