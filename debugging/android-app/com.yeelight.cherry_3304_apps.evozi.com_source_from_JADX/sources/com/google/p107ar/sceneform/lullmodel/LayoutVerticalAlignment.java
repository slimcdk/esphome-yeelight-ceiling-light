package com.google.p107ar.sceneform.lullmodel;

/* renamed from: com.google.ar.sceneform.lullmodel.LayoutVerticalAlignment */
public final class LayoutVerticalAlignment {
    public static final int Bottom = 2;
    public static final int Center = 1;
    public static final int Top = 0;
    public static final String[] names = {"Top", "Center", "Bottom"};

    private LayoutVerticalAlignment() {
    }

    public static String name(int i) {
        return names[i];
    }
}
