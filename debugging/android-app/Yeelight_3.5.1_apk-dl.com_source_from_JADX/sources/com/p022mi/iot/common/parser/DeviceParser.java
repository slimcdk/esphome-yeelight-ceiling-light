package com.p022mi.iot.common.parser;

import com.p022mi.iot.common.constraint.AccessType;
import com.p022mi.iot.common.constraint.AllowedValue;
import com.p022mi.iot.common.constraint.AllowedValueAny;
import com.p022mi.iot.common.constraint.AllowedValueList;
import com.p022mi.iot.common.constraint.AllowedValueRange;
import com.p022mi.iot.common.constraint.UnitType;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.DataFormat;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.instance.PropertyDefinition;
import com.p022mi.iot.common.instance.Service;
import com.p022mi.iot.common.urn.UrnType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mi.iot.common.parser.DeviceParser */
public class DeviceParser {
    public static final String ACCESS = "access";
    private static final String ACTIONS = "actions";
    public static final String DESCRIPTION = "description";
    public static final String FORMAT = "format";
    public static final String IID = "iid";
    public static final String PROPERTIES = "properties";
    public static final String SERVICES = "services";
    private static final String TAG = "DeviceParser";
    public static final String TYPE = "type";
    public static final String UNIT = "unit";
    public static final String VALUE_LIST = "value-list";
    public static final String VALUE_RANGE = "value-range";

    private static Action parseAction(JSONObject jSONObject, Service service) {
        Action action = new Action();
        action.setActionType(UrnType.parse(jSONObject.getString("type")));
        action.setDescription(jSONObject.getString("description"));
        int i = jSONObject.getInt(IID);
        action.setAid(service.getDeviceId() + "." + service.getInstanceID() + "." + i);
        action.setInstanceID(i);
        JSONArray jSONArray = jSONObject.getJSONArray("in");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Property property = service.getProperty(Integer.valueOf(jSONArray.getInt(i2)).intValue());
            if (property != null) {
                action.addArgument(property);
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("out");
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            Property property2 = service.getProperty(Integer.valueOf(jSONArray2.getInt(i3)).intValue());
            if (property2 != null) {
                action.addResult(property2);
            }
        }
        return action;
    }

    public static Device parseDevice(String str, String str2) {
        try {
            Device device = new Device();
            device.setDeviceId(str2);
            JSONObject jSONObject = new JSONObject(str);
            device.setDeviceType(UrnType.parse(jSONObject.getString("type")));
            device.setDescription(jSONObject.optString("description"));
            JSONArray jSONArray = jSONObject.getJSONArray(SERVICES);
            for (int i = 0; i < jSONArray.length(); i++) {
                Service parseService = parseService(jSONArray.getJSONObject(i), str2);
                if (parseService != null) {
                    device.addService(parseService);
                }
            }
            return device;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Property parseProperty(JSONObject jSONObject, Service service) {
        PropertyDefinition propertyDefinition = new PropertyDefinition();
        propertyDefinition.setPropertyType(UrnType.parse(jSONObject.getString("type")));
        propertyDefinition.setDescription(jSONObject.optString("description"));
        DataFormat retrieveType = DataFormat.retrieveType(jSONObject.getString(FORMAT));
        if (retrieveType == null) {
            return null;
        }
        propertyDefinition.setDataFormat(retrieveType);
        propertyDefinition.setAccessType(AccessType.valueOf(jSONObject.getJSONArray(ACCESS)));
        JSONArray optJSONArray = jSONObject.optJSONArray(VALUE_RANGE);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(VALUE_LIST);
        AllowedValue parseValueRange = optJSONArray != null ? parseValueRange(retrieveType, optJSONArray) : optJSONArray2 != null ? parseValueList(retrieveType, optJSONArray2) : new AllowedValueAny(retrieveType);
        if (parseValueRange != null) {
            propertyDefinition.setAllowedValue(parseValueRange);
            String optString = jSONObject.optString(UNIT);
            if (optString != null) {
                propertyDefinition.setUnitType(UnitType.retrieveType(optString));
            }
            Property property = new Property(propertyDefinition);
            int i = jSONObject.getInt(IID);
            property.setPid(service.getDeviceId() + "." + service.getInstanceID() + "." + i);
            property.setInstanceID(i);
            return property;
        }
        throw new IllegalStateException("parse allowed value error: " + " valueRange=" + optJSONArray + " valueList=" + optJSONArray2);
    }

    public static Service parseService(JSONObject jSONObject, String str) {
        Service service = new Service();
        service.setDeviceId(str);
        service.setServiceType(UrnType.parse(jSONObject.getString("type")));
        service.setDescription(jSONObject.optString("description"));
        service.setInstanceID(jSONObject.getInt(IID));
        JSONArray jSONArray = jSONObject.getJSONArray(PROPERTIES);
        for (int i = 0; i < jSONArray.length(); i++) {
            Property parseProperty = parseProperty(jSONArray.getJSONObject(i), service);
            if (parseProperty != null) {
                service.addProperty(parseProperty);
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(ACTIONS);
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                Action parseAction = parseAction(optJSONArray.getJSONObject(i2), service);
                if (parseAction != null) {
                    service.addAction(parseAction);
                }
            }
        }
        return service;
    }

    public static AllowedValueList parseValueList(DataFormat dataFormat, JSONArray jSONArray) {
        AllowedValueList allowedValueList = new AllowedValueList(dataFormat);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && !allowedValueList.appendAllowedValue(new AllowedValueList.DataValue(optJSONObject.opt("value"), optJSONObject.optString("description")))) {
                return null;
            }
        }
        return allowedValueList;
    }

    public static AllowedValueRange parseValueRange(DataFormat dataFormat, JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return null;
        }
        Number number = (Number) jSONArray.opt(0);
        Number number2 = (Number) jSONArray.opt(1);
        return jSONArray.length() == 3 ? new AllowedValueRange(dataFormat, number, number2, (Number) jSONArray.opt(2)) : new AllowedValueRange(dataFormat, number, number2);
    }
}
