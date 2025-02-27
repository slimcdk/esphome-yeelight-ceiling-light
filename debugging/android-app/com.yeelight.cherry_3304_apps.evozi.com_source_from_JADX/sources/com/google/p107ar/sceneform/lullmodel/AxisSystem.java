package com.google.p107ar.sceneform.lullmodel;

/* renamed from: com.google.ar.sceneform.lullmodel.AxisSystem */
public final class AxisSystem {
    public static final int Unspecified = -1;
    public static final int XUp_YBack_ZLeft = 2;
    public static final int XUp_YBack_ZRight = 3;
    public static final int XUp_YFront_ZLeft = 0;
    public static final int XUp_YFront_ZRight = 1;
    public static final int XUp_ZBack_YLeft = 6;
    public static final int XUp_ZBack_YRight = 7;
    public static final int XUp_ZFront_YLeft = 4;
    public static final int XUp_ZFront_YRight = 5;
    public static final int YUp_XBack_ZLeft = 10;
    public static final int YUp_XBack_ZRight = 11;
    public static final int YUp_XFront_ZLeft = 8;
    public static final int YUp_XFront_ZRight = 9;
    public static final int YUp_ZBack_XLeft = 14;
    public static final int YUp_ZBack_XRight = 15;
    public static final int YUp_ZFront_XLeft = 12;
    public static final int YUp_ZFront_XRight = 13;
    public static final int ZUp_XBack_YLeft = 18;
    public static final int ZUp_XBack_YRight = 19;
    public static final int ZUp_XFront_YLeft = 16;
    public static final int ZUp_XFront_YRight = 17;
    public static final int ZUp_YBack_XLeft = 22;
    public static final int ZUp_YBack_XRight = 23;
    public static final int ZUp_YFront_XLeft = 20;
    public static final int ZUp_YFront_XRight = 21;
    public static final String[] names = {"Unspecified", "XUp_YFront_ZLeft", "XUp_YFront_ZRight", "XUp_YBack_ZLeft", "XUp_YBack_ZRight", "XUp_ZFront_YLeft", "XUp_ZFront_YRight", "XUp_ZBack_YLeft", "XUp_ZBack_YRight", "YUp_XFront_ZLeft", "YUp_XFront_ZRight", "YUp_XBack_ZLeft", "YUp_XBack_ZRight", "YUp_ZFront_XLeft", "YUp_ZFront_XRight", "YUp_ZBack_XLeft", "YUp_ZBack_XRight", "ZUp_XFront_YLeft", "ZUp_XFront_YRight", "ZUp_XBack_YLeft", "ZUp_XBack_YRight", "ZUp_YFront_XLeft", "ZUp_YFront_XRight", "ZUp_YBack_XLeft", "ZUp_YBack_XRight"};

    private AxisSystem() {
    }

    public static String name(int i) {
        return names[i + 1];
    }
}
