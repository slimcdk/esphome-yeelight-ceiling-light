package com.google.p017ar.core;

import com.google.p017ar.core.annotations.UsedByNative;

@UsedByNative("session_jni_wrapper.cc")
/* renamed from: com.google.ar.core.Quaternion */
class Quaternion {

    /* renamed from: a */
    public static final Quaternion f3113a = new Quaternion();
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: w */
    private float f3114w = 1.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: x */
    private float f3115x = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: y */
    private float f3116y = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: z */
    private float f3117z = 0.0f;

    public Quaternion() {
        m5099d(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f, float f2, float f3, float f4) {
        m5099d(f, f2, f3, f4);
    }

    private Quaternion(Quaternion quaternion) {
        m5099d(quaternion.f3115x, quaternion.f3116y, quaternion.f3117z, quaternion.f3114w);
    }

    /* renamed from: c */
    public static Quaternion m5098c(Quaternion quaternion, Quaternion quaternion2, float f) {
        float f2;
        Quaternion quaternion3 = new Quaternion();
        float f3 = (quaternion.f3115x * quaternion2.f3115x) + (quaternion.f3116y * quaternion2.f3116y) + (quaternion.f3117z * quaternion2.f3117z) + (quaternion.f3114w * quaternion2.f3114w);
        if (f3 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f3 = -f3;
            quaternion4.f3115x = -quaternion4.f3115x;
            quaternion4.f3116y = -quaternion4.f3116y;
            quaternion4.f3117z = -quaternion4.f3117z;
            quaternion4.f3114w = -quaternion4.f3114w;
            quaternion2 = quaternion4;
        }
        float acos = (float) Math.acos((double) f3);
        float sqrt = (float) Math.sqrt((double) (1.0f - (f3 * f3)));
        if (((double) Math.abs(sqrt)) > 0.001d) {
            float f4 = 1.0f / sqrt;
            f2 = ((float) Math.sin((double) ((1.0f - f) * acos))) * f4;
            f = ((float) Math.sin((double) (f * acos))) * f4;
        } else {
            f2 = 1.0f - f;
        }
        float f5 = (quaternion.f3115x * f2) + (quaternion2.f3115x * f);
        quaternion3.f3115x = f5;
        float f6 = (quaternion.f3116y * f2) + (quaternion2.f3116y * f);
        quaternion3.f3116y = f6;
        float f7 = (quaternion.f3117z * f2) + (quaternion2.f3117z * f);
        quaternion3.f3117z = f7;
        float f8 = (f2 * quaternion.f3114w) + (f * quaternion2.f3114w);
        quaternion3.f3114w = f8;
        float sqrt2 = (float) (1.0d / Math.sqrt((double) ((((f5 * f5) + (f6 * f6)) + (f7 * f7)) + (f8 * f8))));
        quaternion3.f3115x *= sqrt2;
        quaternion3.f3116y *= sqrt2;
        quaternion3.f3117z *= sqrt2;
        quaternion3.f3114w *= sqrt2;
        return quaternion3;
    }

    /* renamed from: d */
    private final void m5099d(float f, float f2, float f3, float f4) {
        this.f3115x = f;
        this.f3116y = f2;
        this.f3117z = f3;
        this.f3114w = f4;
    }

    /* renamed from: e */
    public static void m5100e(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.f3115x;
        float f5 = quaternion.f3116y;
        float f6 = quaternion.f3117z;
        float f7 = quaternion.f3114w;
        float f8 = ((f7 * f) + (f5 * f3)) - (f6 * f2);
        float f9 = ((f7 * f2) + (f6 * f)) - (f4 * f3);
        float f10 = ((f7 * f3) + (f4 * f2)) - (f5 * f);
        float f11 = -f4;
        float f12 = ((f * f11) - (f2 * f5)) - (f3 * f6);
        float f13 = -f6;
        float f14 = -f5;
        fArr2[i2] = (((f8 * f7) + (f12 * f11)) + (f9 * f13)) - (f10 * f14);
        fArr2[i2 + 1] = (((f9 * f7) + (f12 * f14)) + (f10 * f11)) - (f8 * f13);
        fArr2[i2 + 2] = (((f10 * f7) + (f12 * f13)) + (f8 * f14)) - (f9 * f11);
    }

    /* renamed from: a */
    public final float mo16577a() {
        return this.f3115x;
    }

    /* renamed from: b */
    public final Quaternion mo16578b(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f = this.f3115x;
        float f2 = quaternion.f3114w;
        float f3 = this.f3116y;
        float f4 = quaternion.f3117z;
        float f5 = this.f3117z;
        float f6 = quaternion.f3116y;
        float f7 = this.f3114w;
        quaternion2.f3115x = (((f * f2) + (f3 * f4)) - (f5 * f6)) + (quaternion.f3115x * f7);
        float f8 = this.f3115x;
        float f9 = ((-f8) * f4) + (f3 * f2);
        float f10 = quaternion.f3115x;
        quaternion2.f3116y = f9 + (f5 * f10) + (f6 * f7);
        float f11 = quaternion.f3116y;
        float f12 = this.f3116y;
        quaternion2.f3117z = ((f8 * f11) - (f12 * f10)) + (f5 * f2) + (f4 * f7);
        quaternion2.f3114w = ((((-f8) * f10) - (f12 * f11)) - (this.f3117z * quaternion.f3117z)) + (f7 * f2);
        return quaternion2;
    }

    /* renamed from: f */
    public final void mo16579f(float[] fArr, int i) {
        fArr[i] = this.f3115x;
        fArr[i + 1] = this.f3116y;
        fArr[i + 2] = this.f3117z;
        fArr[i + 3] = this.f3114w;
    }

    /* renamed from: g */
    public final void mo16580g(float[] fArr, int i, int i2) {
        float f = this.f3115x;
        float f2 = this.f3116y;
        float f3 = this.f3117z;
        float f4 = this.f3114w;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f6 = 2.0f / f5;
        }
        float f7 = f * f6;
        float f8 = f2 * f6;
        float f9 = f6 * f3;
        float f10 = f4 * f7;
        float f11 = f4 * f8;
        float f12 = f4 * f9;
        float f13 = f7 * f;
        float f14 = f * f8;
        float f15 = f * f9;
        float f16 = f8 * f2;
        float f17 = f2 * f9;
        float f18 = f3 * f9;
        fArr[i] = 1.0f - (f16 + f18);
        fArr[i + 4] = f14 - f12;
        fArr[i + 8] = f15 + f11;
        int i3 = i + 1;
        fArr[i3] = f14 + f12;
        fArr[i3 + 4] = 1.0f - (f18 + f13);
        fArr[i3 + 8] = f17 - f10;
        int i4 = i + 2;
        fArr[i4] = f15 - f11;
        fArr[i4 + 4] = f17 + f10;
        fArr[i4 + 8] = 1.0f - (f13 + f16);
    }

    /* renamed from: h */
    public final float mo16581h() {
        return this.f3116y;
    }

    /* renamed from: i */
    public final float mo16582i() {
        return this.f3117z;
    }

    /* renamed from: j */
    public final float mo16583j() {
        return this.f3114w;
    }

    /* renamed from: k */
    public final Quaternion mo16584k() {
        return new Quaternion(-this.f3115x, -this.f3116y, -this.f3117z, this.f3114w);
    }

    public String toString() {
        return String.format("[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f3115x), Float.valueOf(this.f3116y), Float.valueOf(this.f3117z), Float.valueOf(this.f3114w)});
    }
}
