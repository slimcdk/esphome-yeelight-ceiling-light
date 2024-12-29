package com.google.p017ar.sceneform.lullmodel;

/* renamed from: com.google.ar.sceneform.lullmodel.TextureFiltering */
public final class TextureFiltering {
    public static final short Linear = 1;
    public static final short LinearMipmapLinear = 5;
    public static final short LinearMipmapNearest = 3;
    public static final short Nearest = 0;
    public static final short NearestMipmapLinear = 4;
    public static final short NearestMipmapNearest = 2;
    public static final String[] names = {"Nearest", "Linear", "NearestMipmapNearest", "LinearMipmapNearest", "NearestMipmapLinear", "LinearMipmapLinear"};

    private TextureFiltering() {
    }

    public static String name(int i) {
        return names[i];
    }
}
