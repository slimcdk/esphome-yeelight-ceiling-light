package com.google.p107ar.schemas.sceneform;

import com.yeelight.yeelib.service.UpnpDeviceCherry;

/* renamed from: com.google.ar.schemas.sceneform.SamplerUsageType */
public final class SamplerUsageType {
    public static final short Color = 0;
    public static final short Data = 2;
    public static final short Lookup = 3;
    public static final short Normal = 1;
    public static final String[] names = {UpnpDeviceCherry.sColorChangeEventName, "Normal", "Data", "Lookup"};

    private SamplerUsageType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
