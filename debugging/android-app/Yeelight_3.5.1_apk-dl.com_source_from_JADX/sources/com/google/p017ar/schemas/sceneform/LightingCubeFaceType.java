package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.LightingCubeFaceType */
public final class LightingCubeFaceType {
    public static final String[] names = {"nx", "ny", "nz", "px", "py", "pz"};

    /* renamed from: nx */
    public static final int f3474nx = 0;

    /* renamed from: ny */
    public static final int f3475ny = 1;

    /* renamed from: nz */
    public static final int f3476nz = 2;

    /* renamed from: px */
    public static final int f3477px = 3;

    /* renamed from: py */
    public static final int f3478py = 4;

    /* renamed from: pz */
    public static final int f3479pz = 5;

    private LightingCubeFaceType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
