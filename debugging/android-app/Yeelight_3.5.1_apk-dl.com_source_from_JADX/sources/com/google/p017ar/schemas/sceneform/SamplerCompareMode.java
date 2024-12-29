package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.SamplerCompareMode */
public final class SamplerCompareMode {
    public static final short CompareToTexture = 1;
    public static final short None = 0;
    public static final String[] names = {"None", "CompareToTexture"};

    private SamplerCompareMode() {
    }

    public static String name(int i) {
        return names[i];
    }
}
