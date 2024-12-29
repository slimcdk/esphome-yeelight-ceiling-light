package com.miot.service.manipulator.codec;

import com.miot.common.exception.general.InvalidResponseException;
import com.miot.common.property.Property;
import com.miot.common.property.PropertyDefinition;
import com.miot.common.utils.Logger;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class DecodeHelper {
    private static final String TAG = "DecodeHelper";

    public static void decode(List<Property> list, JSONArray jSONArray) {
        if (jSONArray.length() >= list.size()) {
            for (int i = 0; i < list.size(); i++) {
                Property property = list.get(i);
                Object objectValue = property.getDefinition().getDataType().toObjectValue(jSONArray.optString(i));
                if (objectValue != null) {
                    property.setValue(objectValue);
                } else {
                    property.setValueValid(false);
                }
            }
            return;
        }
        Logger.m7500e(TAG, "jArray.length() < properties.size()");
        throw new InvalidResponseException("jArray.length < properties.size()");
    }

    public static void decode(List<Property> list, JSONObject jSONObject) {
        for (Property next : list) {
            PropertyDefinition definition = next.getDefinition();
            Object objectValue = definition.getDataType().toObjectValue(jSONObject.optString(definition.getInternalName()));
            if (objectValue != null) {
                next.setValue(objectValue);
            } else {
                next.setValueValid(false);
            }
        }
    }
}
