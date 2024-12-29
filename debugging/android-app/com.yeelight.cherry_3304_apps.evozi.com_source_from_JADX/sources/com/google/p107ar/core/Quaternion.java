package com.google.p107ar.core;

import com.google.p107ar.core.annotations.UsedByNative;

@UsedByNative("session_jni_wrapper.cc")
/* renamed from: com.google.ar.core.Quaternion */
class Quaternion {

    /* renamed from: a */
    public static final Quaternion f5039a = new Quaternion();
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: w */
    private float f5040w = 1.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: x */
    private float f5041x = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: y */
    private float f5042y = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: z */
    private float f5043z = 0.0f;

    public Quaternion() {
        m8146d(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f, float f2, float f3, float f4) {
        m8146d(f, f2, f3, f4);
    }

    private Quaternion(Quaternion quaternion) {
        m8146d(quaternion.f5041x, quaternion.f5042y, quaternion.f5043z, quaternion.f5040w);
    }

    /* renamed from: c */
    public static Quaternion m8145c(Quaternion quaternion, Quaternion quaternion2, float f) {
        float f2;
        Quaternion quaternion3 = new Quaternion();
        float f3 = (quaternion.f5041x * quaternion2.f5041x) + (quaternion.f5042y * quaternion2.f5042y) + (quaternion.f5043z * quaternion2.f5043z) + (quaternion.f5040w * quaternion2.f5040w);
        if (f3 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f3 = -f3;
            quaternion4.f5041x = -quaternion4.f5041x;
            quaternion4.f5042y = -quaternion4.f5042y;
            quaternion4.f5043z = -quaternion4.f5043z;
            quaternion4.f5040w = -quaternion4.f5040w;
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
        float f5 = (quaternion.f5041x * f2) + (quaternion2.f5041x * f);
        quaternion3.f5041x = f5;
        float f6 = (quaternion.f5042y * f2) + (quaternion2.f5042y * f);
        quaternion3.f5042y = f6;
        float f7 = (quaternion.f5043z * f2) + (quaternion2.f5043z * f);
        quaternion3.f5043z = f7;
        float f8 = (f2 * quaternion.f5040w) + (f * quaternion2.f5040w);
        quaternion3.f5040w = f8;
        float sqrt2 = (float) (1.0d / Math.sqrt((double) ((((f5 * f5) + (f6 * f6)) + (f7 * f7)) + (f8 * f8))));
        quaternion3.f5041x *= sqrt2;
        quaternion3.f5042y *= sqrt2;
        quaternion3.f5043z *= sqrt2;
        quaternion3.f5040w *= sqrt2;
        return quaternion3;
    }

    /* renamed from: d */
    private final void m8146d(float f, float f2, float f3, float f4) {
        this.f5041x = f;
        this.f5042y = f2;
        this.f5043z = f3;
        this.f5040w = f4;
    }

    /* renamed from: e */
    public static void m8147e(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.f5041x;
        float f5 = quaternion.f5042y;
        float f6 = quaternion.f5043z;
        float f7 = quaternion.f5040w;
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
    public final float mo15127a() {
        return this.f5041x;
    }

    /* renamed from: b */
    public final Quaternion mo15128b(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f = this.f5041x;
        float f2 = quaternion.f5040w;
        float f3 = this.f5042y;
        float f4 = quaternion.f5043z;
        float f5 = this.f5043z;
        float f6 = quaternion.f5042y;
        float f7 = this.f5040w;
        quaternion2.f5041x = (((f * f2) + (f3 * f4)) - (f5 * f6)) + (quaternion.f5041x * f7);
        float f8 = this.f5041x;
        float f9 = ((-f8) * f4) + (f3 * f2);
        float f10 = quaternion.f5041x;
        quaternion2.f5042y = f9 + (f5 * f10) + (f6 * f7);
        float f11 = quaternion.f5042y;
        float f12 = this.f5042y;
        quaternion2.f5043z = ((f8 * f11) - (f12 * f10)) + (f5 * f2) + (f4 * f7);
        quaternion2.f5040w = ((((-f8) * f10) - (f12 * f11)) - (this.f5043z * quaternion.f5043z)) + (f7 * f2);
        return quaternion2;
    }

    /* renamed from: f */
    public final void mo15129f(float[] fArr, int i) {
        fArr[i] = this.f5041x;
        fArr[i + 1] = this.f5042y;
        fArr[i + 2] = this.f5043z;
        fArr[i + 3] = this.f5040w;
    }

    /* renamed from: g */
    public final void mo15130g(float[] fArr, int i, int i2) {
        float f = this.f5041x;
        float f2 = this.f5042y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f5043z;
        float f5 = f3 + (f4 * f4);
        float f6 = this.f5040w;
        float f7 = f5 + (f6 * f6);
        float f8 = 0.0f;
        if (f7 > 0.0f) {
            f8 = 2.0f / f7;
        }
        float f9 = this.f5041x;
        float f10 = f9 * f8;
        float f11 = this.f5042y;
        float f12 = f11 * f8;
        float f13 = this.f5043z;
        float f14 = f8 * f13;
        float f15 = this.f5040w;
        float f16 = f15 * f10;
        float f17 = f15 * f12;
        float f18 = f15 * f14;
        float f19 = f10 * f9;
        float f20 = f9 * f12;
        float f21 = f9 * f14;
        float f22 = f12 * f11;
        float f23 = f11 * f14;
        float f24 = f13 * f14;
        fArr[i] = 1.0f - (f22 + f24);
        fArr[i + 4] = f20 - f18;
        fArr[i + 8] = f21 + f17;
        int i3 = i + 1;
        fArr[i3] = f20 + f18;
        fArr[i3 + 4] = 1.0f - (f24 + f19);
        fArr[i3 + 8] = f23 - f16;
        int i4 = i + 2;
        fArr[i4] = f21 - f17;
        fArr[i4 + 4] = f23 + f16;
        fArr[i4 + 8] = 1.0f - (f19 + f22);
    }

    /* renamed from: h */
    public final float mo15131h() {
        return this.f5042y;
    }

    /* renamed from: i */
    public final float mo15132i() {
        return this.f5043z;
    }

    /* renamed from: j */
    public final float mo15133j() {
        return this.f5040w;
    }

    /* renamed from: k */
    public final Quaternion mo15134k() {
        return new Quaternion(-this.f5041x, -this.f5042y, -this.f5043z, this.f5040w);
    }

    public String toString() {
        return String.format("[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f5041x), Float.valueOf(this.f5042y), Float.valueOf(this.f5043z), Float.valueOf(this.f5040w)});
    }
}
