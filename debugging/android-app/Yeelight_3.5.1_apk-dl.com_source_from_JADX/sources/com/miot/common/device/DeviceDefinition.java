package com.miot.common.device;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class DeviceDefinition {
    private static final String ADDRESS = "address";
    public static FieldDefinition Address = null;
    private static final String CONNECTION_TYPE = "connectionType";
    public static FieldDefinition ConnectionType = null;
    private static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_TOKEN = "deviceToken";
    public static FieldDefinition DeviceId = null;
    public static FieldDefinition DeviceToken = null;
    private static final String IS_VIRTUAL = "isVirtual";
    public static FieldDefinition IsVirtual = null;
    private static final String MANUFACTURER = "manufacturer";
    private static final String MANUFACTURER_URL = "manufacturerUrl";
    private static final String MODEL = "model";
    private static final String MODEL_DESCRIPTION = "modelDescription";
    private static final String MODEL_NAME = "modelName";
    private static final String MODEL_NUMBER = "modelNumber";
    public static FieldDefinition Manufacturer = null;
    public static FieldDefinition ManufacturerUrl = null;
    public static FieldDefinition Model = null;
    public static FieldDefinition ModelDescription = null;
    public static FieldDefinition ModelName = null;
    public static FieldDefinition ModelNumber = null;
    private static final String NAME = "name";
    public static FieldDefinition Name = null;
    private static final String ONLINE = "online";
    private static final String OWNER_SHIP = "ownership";
    public static FieldDefinition Online = null;
    public static FieldDefinition OwnerShip = null;
    private static final String PARENT_DEVICE_ID = "parentDeviceId";
    private static final String PARENT_DEVICE_MODEL = "parentDeviceModel";
    private static final String PRODUCT_ID = "pid";
    public static FieldDefinition ParentDeviceId;
    public static FieldDefinition ParentDeviceModel;
    public static FieldDefinition ProductId;

    static {
        DataType dataType = DataType.STRING;
        DeviceId = new FieldDefinition(DEVICE_ID, dataType);
        DeviceToken = new FieldDefinition(DEVICE_TOKEN, dataType);
        Name = new FieldDefinition("name", dataType);
        Model = new FieldDefinition(MODEL, dataType);
        DataType dataType2 = DataType.BOOL;
        Online = new FieldDefinition(ONLINE, dataType2);
        OwnerShip = new FieldDefinition(OWNER_SHIP, dataType);
        ConnectionType = new FieldDefinition(CONNECTION_TYPE, dataType);
        IsVirtual = new FieldDefinition(IS_VIRTUAL, dataType2);
        Address = new FieldDefinition(ADDRESS, dataType);
        ProductId = new FieldDefinition("pid", dataType);
        ParentDeviceId = new FieldDefinition(PARENT_DEVICE_ID, dataType);
        ParentDeviceModel = new FieldDefinition(PARENT_DEVICE_MODEL, dataType);
        ModelName = new FieldDefinition("modelName", dataType);
        ModelNumber = new FieldDefinition("modelNumber", dataType);
        ModelDescription = new FieldDefinition("modelDescription", dataType);
        Manufacturer = new FieldDefinition("manufacturer", dataType);
        ManufacturerUrl = new FieldDefinition(MANUFACTURER_URL, dataType);
    }
}
