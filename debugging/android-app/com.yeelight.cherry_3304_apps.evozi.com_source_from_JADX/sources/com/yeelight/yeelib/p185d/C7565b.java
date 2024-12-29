package com.yeelight.yeelib.p185d;

import androidx.core.p005os.EnvironmentCompat;

/* renamed from: com.yeelight.yeelib.d.b */
public enum C7565b {
    DEVICE_EVENT_OPEN(1),
    DEVICE_EVENT_CLOSE(2),
    DEVICE_EVENT_MODE_CHANGE(4),
    DEVICE_EVENT_BRIGHT_CHANGE(8),
    DEVICE_EVENT_COLOR_CHANGE(16),
    DEVICE_EVENT_COLOR_TEMPERATURE_CHANGE(32),
    DEVICE_EVENT_FIRMWARE_CHANGE(64),
    DEVICE_EVENT_NAME_CHANGE(128);
    

    /* renamed from: a */
    private int f15286a;

    private C7565b(int i) {
        this.f15286a = 0;
        this.f15286a = i;
    }

    /* renamed from: a */
    public int mo28971a() {
        return this.f15286a;
    }

    public String toString() {
        int a = mo28971a();
        return a != 1 ? a != 2 ? a != 4 ? a != 8 ? a != 16 ? a != 32 ? a != 64 ? a != 128 ? EnvironmentCompat.MEDIA_UNKNOWN : "name changed" : "firmware upgraded" : "color temperature changed" : "color changed" : "bright changed" : "mode changed" : "closed" : "opened";
    }
}
