package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.SamplerMagFilter */
public final class SamplerMagFilter {
    public static final short Linear = 1;
    public static final short Nearest = 0;
    public static final String[] names = {"Nearest", "Linear"};

    private SamplerMagFilter() {
    }

    public static String name(int i) {
        return names[i];
    }
}
