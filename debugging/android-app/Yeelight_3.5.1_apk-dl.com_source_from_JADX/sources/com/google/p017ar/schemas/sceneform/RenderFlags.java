package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.RenderFlags */
public final class RenderFlags {
    public static final byte DisableFrustumCulling = 4;
    public static final byte DoNotCastShadows = 1;
    public static final byte DoNotReceiveShadows = 2;
    public static final String[] names = {"DoNotCastShadows", "DoNotReceiveShadows", "", "DisableFrustumCulling"};

    private RenderFlags() {
    }

    public static String name(int i) {
        return names[i - 1];
    }
}
