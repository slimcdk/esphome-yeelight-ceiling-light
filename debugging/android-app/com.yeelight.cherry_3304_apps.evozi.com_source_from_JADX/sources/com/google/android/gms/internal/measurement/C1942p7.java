package com.google.android.gms.internal.measurement;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
final class C1942p7 {
    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m5772f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m5781o(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m5781o(b3) || m5781o(b4)) {
            throw C2046w4.m6270f();
        }
        byte b5 = ((b & 7) << ParameterInitDefType.DoubleVec2Init) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m5773g(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m5781o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5781o(b3)))) {
            throw C2046w4.m6270f();
        }
        cArr[i] = (char) (((b & ParameterInitDefType.CubemapSamplerInit) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m5774h(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m5781o(b2)) {
            throw C2046w4.m6270f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m5775i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m5778l(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m5779m(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m5780n(byte b) {
        return b < -16;
    }

    /* renamed from: o */
    private static boolean m5781o(byte b) {
        return b > -65;
    }
}
