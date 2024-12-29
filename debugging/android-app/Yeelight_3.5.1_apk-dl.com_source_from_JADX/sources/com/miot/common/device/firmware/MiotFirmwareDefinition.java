package com.miot.common.device.firmware;

import com.miot.common.field.FieldDefinition;
import com.miot.common.property.DataType;

public class MiotFirmwareDefinition {
    private static final String CURRENT_VERSION = "curr";
    public static FieldDefinition CurrentVersion = null;
    private static final String DESCRIPTION = "description";
    public static FieldDefinition Description = null;
    private static final String IS_LATEST = "isLatest";
    private static final String IS_UPGRADING = "updating";
    public static FieldDefinition IsLatestVersion = null;
    public static FieldDefinition IsUpgrading = null;
    private static final String LATEST_VERSION = "latest";
    public static FieldDefinition LatestVersion = null;
    private static final String OTA_PROGRESS = "ota_progress";
    private static final String OTA_STATUS = "ota_status";
    public static FieldDefinition OtaProgress = new FieldDefinition(OTA_PROGRESS, DataType.UINT8);
    public static FieldDefinition OtaStatus;

    static {
        DataType dataType = DataType.BOOL;
        IsUpgrading = new FieldDefinition(IS_UPGRADING, dataType);
        DataType dataType2 = DataType.STRING;
        CurrentVersion = new FieldDefinition(CURRENT_VERSION, dataType2);
        LatestVersion = new FieldDefinition(LATEST_VERSION, dataType2);
        IsLatestVersion = new FieldDefinition(IS_LATEST, dataType);
        Description = new FieldDefinition("description", dataType2);
        OtaStatus = new FieldDefinition(OTA_STATUS, dataType2);
    }
}
