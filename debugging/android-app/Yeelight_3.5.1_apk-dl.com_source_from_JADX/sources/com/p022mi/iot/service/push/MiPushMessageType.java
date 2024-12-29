package com.p022mi.iot.service.push;

/* renamed from: com.mi.iot.service.push.MiPushMessageType */
public enum MiPushMessageType {
    PROPERTY,
    EVENT,
    DEVICE,
    HOME;
    
    static final String TYPE_EVENT = "events-occured";
    static final String TYPE_ROPERTY = "properties-changed";

    public static MiPushMessageType create(String str) {
        str.hashCode();
        if (str.equals(TYPE_EVENT)) {
            return EVENT;
        }
        if (!str.equals(TYPE_ROPERTY)) {
            return null;
        }
        return PROPERTY;
    }
}
