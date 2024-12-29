package com.miot.common.device;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class DeviceDefinition {
    private static final String ADDRESS = "address";
    public static FieldDefinition Address = new FieldDefinition(ADDRESS, DataType.STRING);
    private static final String CONNECTION_TYPE = "connectionType";
    public static FieldDefinition ConnectionType = new FieldDefinition(CONNECTION_TYPE, DataType.STRING);
    private static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_TOKEN = "deviceToken";
    public static FieldDefinition DeviceId = new FieldDefinition(DEVICE_ID, DataType.STRING);
    public static FieldDefinition DeviceToken = new FieldDefinition(DEVICE_TOKEN, DataType.STRING);
    private static final String IS_VIRTUAL = "isVirtual";
    public static FieldDefinition IsVirtual = new FieldDefinition(IS_VIRTUAL, DataType.BOOL);
    private static final String MANUFACTURER = "manufacturer";
    private static final String MANUFACTURER_URL = "manufacturerUrl";
    private static final String MODEL = "model";
    private static final String MODEL_DESCRIPTION = "modelDescription";
    private static final String MODEL_NAME = "modelName";
    private static final String MODEL_NUMBER = "modelNumber";
    public static FieldDefinition Manufacturer = new FieldDefinition("manufacturer", DataType.STRING);
    public static FieldDefinition ManufacturerUrl = new FieldDefinition(MANUFACTURER_URL, DataType.STRING);
    public static FieldDefinition Model = new FieldDefinition(MODEL, DataType.STRING);
    public static FieldDefinition ModelDescription = new FieldDefinition("modelDescription", DataType.STRING);
    public static FieldDefinition ModelName = new FieldDefinition("modelName", DataType.STRING);
    public static FieldDefinition ModelNumber = new FieldDefinition("modelNumber", DataType.STRING);
    private static final String NAME = "name";
    public static FieldDefinition Name = new FieldDefinition("name", DataType.STRING);
    private static final String ONLINE = "online";
    private static final String OWNER_SHIP = "ownership";
    public static FieldDefinition Online = new FieldDefinition(ONLINE, DataType.BOOL);
    public static FieldDefinition OwnerShip = new FieldDefinition(OWNER_SHIP, DataType.STRING);
    private static final String PARENT_DEVICE_ID = "parentDeviceId";
    private static final String PARENT_DEVICE_MODEL = "parentDeviceModel";
    private static final String PRODUCT_ID = "pid";
    public static FieldDefinition ParentDeviceId = new FieldDefinition(PARENT_DEVICE_ID, DataType.STRING);
    public static FieldDefinition ParentDeviceModel = new FieldDefinition(PARENT_DEVICE_MODEL, DataType.STRING);
    public static FieldDefinition ProductId = new FieldDefinition("pid", DataType.STRING);
}
