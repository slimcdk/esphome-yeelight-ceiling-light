package com.telink.bluetooth.light;

public enum Manufacture$UUIDType {
    SERVICE("SERVICE_UUID"),
    PAIR("PAIR_UUID"),
    COMMAND("COMMAND_UUID"),
    OTA("OTA_UUID"),
    NOTIFY("NOTIFY_UUID");
    
    private final String key;

    private Manufacture$UUIDType(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
