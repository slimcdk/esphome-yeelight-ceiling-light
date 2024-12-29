package com.yeelight.yeelib.interaction;

import androidx.core.p007os.EnvironmentCompat;

public enum DeviceEvent {
    DEVICE_EVENT_OPEN(1),
    DEVICE_EVENT_CLOSE(2),
    DEVICE_EVENT_MODE_CHANGE(4),
    DEVICE_EVENT_BRIGHT_CHANGE(8),
    DEVICE_EVENT_COLOR_CHANGE(16),
    DEVICE_EVENT_COLOR_TEMPERATURE_CHANGE(32),
    DEVICE_EVENT_FIRMWARE_CHANGE(64),
    DEVICE_EVENT_NAME_CHANGE(128);
    
    public static final int DEVICE_EVENT_UNKNOWN = 0;
    private int mValue;

    private DeviceEvent(int i) {
        this.mValue = 0;
        this.mValue = i;
    }

    public int getValue() {
        return this.mValue;
    }

    public String toString() {
        int value = getValue();
        return value != 1 ? value != 2 ? value != 4 ? value != 8 ? value != 16 ? value != 32 ? value != 64 ? value != 128 ? EnvironmentCompat.MEDIA_UNKNOWN : "name changed" : "firmware upgraded" : "color temperature changed" : "color changed" : "bright changed" : "mode changed" : "closed" : "opened";
    }
}
