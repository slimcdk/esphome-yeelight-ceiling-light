package com.yeelight.yeelib.nativelib;

public class NativeLightMix {
    static {
        try {
            System.loadLibrary("light_mix");
        } catch (Throwable unused) {
        }
    }

    public static native int color_rgb_trans(char c, char c2, char c3);
}
