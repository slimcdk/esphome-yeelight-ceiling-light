package com.miot.common.device;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class ServiceDefinition {
    private static final String CONNECTION_TYPE = "connectionType";
    public static FieldDefinition ConnectionType = null;
    private static String DESCRIPTION = "description";
    private static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_MODEL = "deviceModel";
    public static FieldDefinition Description = null;
    public static FieldDefinition DeviceId = null;
    public static FieldDefinition DeviceModel = null;
    private static final String PARENT_DEVICE_ID = "parentDeviceId";
    public static FieldDefinition ParentDeviceId = null;
    private static String SCPDURL = "SCPDURL";
    public static FieldDefinition ScpdUrl = null;
    private static final String TOKEN = "token";
    public static FieldDefinition Token;

    static {
        String str = DESCRIPTION;
        DataType dataType = DataType.STRING;
        Description = new FieldDefinition(str, dataType);
        ScpdUrl = new FieldDefinition(SCPDURL, dataType);
        ParentDeviceId = new FieldDefinition(PARENT_DEVICE_ID, dataType);
        DeviceId = new FieldDefinition(DEVICE_ID, dataType);
        DeviceModel = new FieldDefinition(DEVICE_MODEL, dataType);
        ConnectionType = new FieldDefinition(CONNECTION_TYPE, dataType);
        Token = new FieldDefinition("token", dataType);
    }
}
