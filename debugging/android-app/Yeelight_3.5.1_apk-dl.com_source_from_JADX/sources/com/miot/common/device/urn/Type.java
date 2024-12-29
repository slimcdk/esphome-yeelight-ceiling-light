package com.miot.common.device.urn;

public enum Type {
    device,
    service,
    property,
    action;

    public static Type parse(String str) {
        try {
            return valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
