package com.miot.common.device.firmware;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class MiotFirmwareDefinition {
    private static final String CURRENT_VERSION = "curr";
    public static FieldDefinition CurrentVersion = new FieldDefinition(CURRENT_VERSION, DataType.STRING);
    private static final String DESCRIPTION = "description";
    public static FieldDefinition Description = new FieldDefinition("description", DataType.STRING);
    private static final String IS_LATEST = "isLatest";
    private static final String IS_UPGRADING = "updating";
    public static FieldDefinition IsLatestVersion = new FieldDefinition(IS_LATEST, DataType.BOOL);
    public static FieldDefinition IsUpgrading = new FieldDefinition(IS_UPGRADING, DataType.BOOL);
    private static final String LATEST_VERSION = "latest";
    public static FieldDefinition LatestVersion = new FieldDefinition(LATEST_VERSION, DataType.STRING);
    private static final String OTA_PROGRESS = "ota_progress";
    private static final String OTA_STATUS = "ota_status";
    public static FieldDefinition OtaProgress = new FieldDefinition(OTA_PROGRESS, DataType.UINT8);
    public static FieldDefinition OtaStatus = new FieldDefinition(OTA_STATUS, DataType.STRING);
}
