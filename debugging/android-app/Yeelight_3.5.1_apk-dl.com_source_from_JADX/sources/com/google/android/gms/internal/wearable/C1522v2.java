package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.v2 */
final class C1522v2 extends C1530x2 {
    C1522v2(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo13826a(Object obj, long j, byte b) {
        if (C1534y2.f1892i) {
            C1534y2.m3980d(obj, j, b);
        } else {
            C1534y2.m3981e(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo13827b(Object obj, long j) {
        return C1534y2.f1892i ? C1534y2.m3972A(obj, j) : C1534y2.m3973B(obj, j);
    }

    /* renamed from: c */
    public final void mo13828c(Object obj, long j, boolean z) {
        if (C1534y2.f1892i) {
            C1534y2.m3980d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C1534y2.m3981e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo13829d(Object obj, long j) {
        return Float.intBitsToFloat(mo13847k(obj, j));
    }

    /* renamed from: e */
    public final void mo13830e(Object obj, long j, float f) {
        mo13848l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo13831f(Object obj, long j) {
        return Double.longBitsToDouble(mo13849m(obj, j));
    }

    /* renamed from: g */
    public final void mo13832g(Object obj, long j, double d) {
        mo13850n(obj, j, Double.doubleToLongBits(d));
    }
}
