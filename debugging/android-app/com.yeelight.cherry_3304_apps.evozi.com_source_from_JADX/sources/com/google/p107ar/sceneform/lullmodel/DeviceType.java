package com.google.p107ar.sceneform.lullmodel;

/* renamed from: com.google.ar.sceneform.lullmodel.DeviceType */
public final class DeviceType {
    public static final int Controller = 3;
    public static final int Controller2 = 4;
    public static final int Hand = 5;
    public static final int Hmd = 0;
    public static final int Keyboard = 2;
    public static final int Mouse = 1;
    public static final String[] names = {"Hmd", "Mouse", "Keyboard", "Controller", "Controller2", "Hand"};

    private DeviceType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
