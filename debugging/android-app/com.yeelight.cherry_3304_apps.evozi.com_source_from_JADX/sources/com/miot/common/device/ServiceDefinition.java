package com.miot.common.device;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class ServiceDefinition {
    private static final String CONNECTION_TYPE = "connectionType";
    public static FieldDefinition ConnectionType = new FieldDefinition(CONNECTION_TYPE, DataType.STRING);
    private static String DESCRIPTION = "description";
    private static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_MODEL = "deviceModel";
    public static FieldDefinition Description = new FieldDefinition(DESCRIPTION, DataType.STRING);
    public static FieldDefinition DeviceId = new FieldDefinition(DEVICE_ID, DataType.STRING);
    public static FieldDefinition DeviceModel = new FieldDefinition(DEVICE_MODEL, DataType.STRING);
    private static final String PARENT_DEVICE_ID = "parentDeviceId";
    public static FieldDefinition ParentDeviceId = new FieldDefinition(PARENT_DEVICE_ID, DataType.STRING);
    private static String SCPDURL = "SCPDURL";
    public static FieldDefinition ScpdUrl = new FieldDefinition(SCPDURL, DataType.STRING);
    private static final String TOKEN = "token";
    public static FieldDefinition Token = new FieldDefinition("token", DataType.STRING);
}
