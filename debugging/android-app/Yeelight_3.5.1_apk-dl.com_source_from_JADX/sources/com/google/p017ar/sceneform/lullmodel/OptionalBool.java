package com.google.p017ar.sceneform.lullmodel;

/* renamed from: com.google.ar.sceneform.lullmodel.OptionalBool */
public final class OptionalBool {
    public static final int False = 2;
    public static final int True = 1;
    public static final int Unset = 0;
    public static final String[] names = {"Unset", "True", "False"};

    private OptionalBool() {
    }

    public static String name(int i) {
        return names[i];
    }
}
