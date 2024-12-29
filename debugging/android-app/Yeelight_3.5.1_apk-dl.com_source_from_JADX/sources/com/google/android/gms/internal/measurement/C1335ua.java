package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ua */
final class C1335ua extends C1365wa {
    C1335ua(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo13410a(Object obj, long j) {
        return Double.longBitsToDouble(mo13461k(obj, j));
    }

    /* renamed from: b */
    public final float mo13411b(Object obj, long j) {
        return Float.intBitsToFloat(mo13460j(obj, j));
    }

    /* renamed from: c */
    public final void mo13412c(Object obj, long j, boolean z) {
        if (C1380xa.f1717h) {
            C1380xa.m3260d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C1380xa.m3261e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo13413d(Object obj, long j, byte b) {
        if (C1380xa.f1717h) {
            C1380xa.m3260d(obj, j, b);
        } else {
            C1380xa.m3261e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo13414e(Object obj, long j, double d) {
        mo13465o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo13415f(Object obj, long j, float f) {
        mo13464n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo13416g(Object obj, long j) {
        return C1380xa.f1717h ? C1380xa.m3281y(obj, j) : C1380xa.m3282z(obj, j);
    }
}
