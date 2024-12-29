package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.SamplerWrapMode */
public final class SamplerWrapMode {
    public static final short ClampToEdge = 0;
    public static final short MirroredRepeat = 2;
    public static final short Repeat = 1;
    public static final String[] names = {"ClampToEdge", "Repeat", "MirroredRepeat"};

    private SamplerWrapMode() {
    }

    public static String name(int i) {
        return names[i];
    }
}
