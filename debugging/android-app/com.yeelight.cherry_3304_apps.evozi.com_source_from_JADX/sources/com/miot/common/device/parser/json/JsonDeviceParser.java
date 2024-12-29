package com.miot.common.device.parser.json;

import com.miot.common.device.Action;
import com.miot.common.device.Argument;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.device.parser.DeviceParser;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.common.device.urn.JsonType;
import com.miot.common.device.urn.Type;
import com.miot.common.device.urn.UrnType;
import com.miot.common.device.urn.UrnTypeParser;
import com.miot.common.exception.device.InvalidActionException;
import com.miot.common.exception.device.InvalidDeviceException;
import com.miot.common.exception.device.InvalidPropertyException;
import com.miot.common.exception.device.InvalidServiceException;
import com.miot.common.property.AllowedValueAny;
import com.miot.common.property.AllowedValueList;
import com.miot.common.property.AllowedValueRange;
import com.miot.common.property.DataType;
import com.miot.common.property.Property;
import com.miot.common.property.PropertyDefinition;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.commons.p271io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDeviceParser implements DeviceParser {
    public static final String DESCRIPTION = "description";
    public static final String TYPE = "type";
    public static final String VALUE = "value";

    public static void genPropertySetter(Service service, Property property) {
        JsonType jsonType = new JsonType((JsonType) property.getDefinition().getType());
        jsonType.setType(Type.action);
        String str = "set" + jsonType.getName();
        jsonType.setName(str);
        Action action = new Action();
        action.setType(jsonType);
        action.setFriendlyName(str);
        action.setInternalName("set#" + jsonType.getName());
        action.setDescription("设置" + property.getDefinition().getDescription());
        Argument argument = new Argument();
        argument.setName(property.getDefinition().getType().toString());
        argument.setDirection(Argument.Direction.in);
        argument.setRelatedProperty(property);
        action.addArgument(argument);
        service.addAction(action);
    }

    public static void parseAction(Service service, JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        UrnType parseType = UrnTypeParser.parseType(optString);
        if (parseType != null) {
            Action action = new Action();
            action.setType(parseType);
            action.setFriendlyName(parseType.getName());
            action.setInternalName(parseType.getName());
            action.setDescription(jSONObject.optString("description"));
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject != null) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("in");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString2 = optJSONArray.optString(i);
                        Property property0 = service.getProperty0(optString2);
                        Argument argument = new Argument();
                        argument.setName(optString2);
                        argument.setRelatedProperty(property0);
                        argument.setDirection(Argument.Direction.in);
                        action.addArgument(argument);
                    }
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("out");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        String optString3 = optJSONArray.optString(i2);
                        Property property02 = service.getProperty0(optString3);
                        Argument argument2 = new Argument();
                        argument2.setName(optString3);
                        argument2.setRelatedProperty(property02);
                        argument2.setDirection(Argument.Direction.out);
                        action.addArgument(argument2);
                    }
                }
            }
            service.addAction(action);
            return;
        }
        throw new InvalidActionException("parse type failed: " + optString);
    }

    public static void parseProperty(Service service, JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        UrnType parseType = UrnTypeParser.parseType(optString);
        if (parseType != null) {
            PropertyDefinition propertyDefinition = new PropertyDefinition();
            propertyDefinition.setType(parseType);
            propertyDefinition.setFriendlyName(parseType.getName());
            propertyDefinition.setInternalName(parseType.getName());
            propertyDefinition.setDescription(jSONObject.optString("description"));
            JSONArray optJSONArray = jSONObject.optJSONArray(com.p146mi.iot.common.parser.DeviceParser.ACCESS);
            int i = 0;
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2).toLowerCase());
                }
                if (arrayList.contains(DddTag.PL_PROPERTY_ATTR_GETTABLE)) {
                    propertyDefinition.setGettable(true);
                }
                if (arrayList.contains(DddTag.PL_PROPERTY_ATTR_SETTABLE)) {
                    propertyDefinition.setSettable(true);
                }
                if (arrayList.contains(DddTag.PL_PROPERTY_ATTR_NOTIFIABLE)) {
                    propertyDefinition.setNotifiable(true);
                }
            }
            DataType retrieveType = DataType.retrieveType(jSONObject.optString("dataType"));
            propertyDefinition.setDataType(retrieveType);
            Object objectValue = retrieveType.toObjectValue(jSONObject.optString("value"));
            JSONObject optJSONObject = jSONObject.optJSONObject("valueRange");
            AllowedValueRange allowedValueRange = null;
            if (optJSONObject != null) {
                allowedValueRange = new AllowedValueRange(retrieveType, retrieveType.toObjectValue(optJSONObject.optString("min")), retrieveType.toObjectValue(optJSONObject.optString("max")));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("valueList");
            if (optJSONArray2 != null) {
                while (i < optJSONArray2.length()) {
                    Object objectValue2 = retrieveType.toObjectValue(optJSONArray2.optString(i));
                    AllowedValueList allowedValueList = new AllowedValueList(retrieveType);
                    allowedValueList.appendAllowedValue(objectValue2);
                    i++;
                    allowedValueRange = allowedValueList;
                }
            }
            if (optJSONArray2 == null && optJSONObject == null) {
                propertyDefinition.setAllowedValue(new AllowedValueAny(retrieveType));
            } else {
                propertyDefinition.setAllowedValue(allowedValueRange);
            }
            Property property = new Property(propertyDefinition);
            property.setValue(objectValue);
            service.addProperty(property);
            if (propertyDefinition.getSettable()) {
                genPropertySetter(service, property);
                return;
            }
            return;
        }
        throw new InvalidPropertyException("parse type failed: " + optString);
    }

    static Service parseService(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        UrnType parseType = UrnTypeParser.parseType(optString);
        if (parseType != null) {
            Service service = new Service();
            service.setType(parseType);
            service.setDescription(jSONObject.optString("description"));
            JSONArray optJSONArray = jSONObject.optJSONArray(com.p146mi.iot.common.parser.DeviceParser.PROPERTIES);
            for (int i = 0; i < optJSONArray.length(); i++) {
                parseProperty(service, optJSONArray.optJSONObject(i));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("actions");
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                parseAction(service, optJSONArray2.optJSONObject(i2));
            }
            return service;
        }
        throw new InvalidServiceException("parse type failed: " + optString);
    }

    public Device parse(InputStream inputStream) {
        Device device = new Device();
        if (inputStream != null) {
            try {
                JSONObject jSONObject = new JSONObject(IOUtils.toString(inputStream));
                String optString = jSONObject.optString("type");
                UrnType parseType = UrnTypeParser.parseType(optString);
                if (parseType != null) {
                    device.setType(parseType);
                    device.setDescription(jSONObject.optString("description"));
                    JSONArray optJSONArray = jSONObject.optJSONArray(com.p146mi.iot.common.parser.DeviceParser.SERVICES);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        Service parseService = parseService(optJSONArray.optJSONObject(i));
                        if (parseService != null) {
                            device.addService(parseService);
                        }
                    }
                    return device;
                }
                throw new InvalidDeviceException("parse type failed: " + optString);
            } catch (IOException | JSONException e) {
                e.printStackTrace();
                throw new InvalidDeviceException((Throwable) e);
            }
        } else {
            throw new NullPointerException("inputStream is null");
        }
    }
}
