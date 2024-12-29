package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.wa */
abstract class C1365wa {

    /* renamed from: a */
    final Unsafe f1697a;

    C1365wa(Unsafe unsafe) {
        this.f1697a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo13410a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo13411b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo13412c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo13413d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo13414e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo13415f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo13416g(Object obj, long j);

    /* renamed from: h */
    public final int mo13458h(Class cls) {
        return this.f1697a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo13459i(Class cls) {
        return this.f1697a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo13460j(Object obj, long j) {
        return this.f1697a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo13461k(Object obj, long j) {
        return this.f1697a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo13462l(Field field) {
        return this.f1697a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo13463m(Object obj, long j) {
        return this.f1697a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo13464n(Object obj, long j, int i) {
        this.f1697a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo13465o(Object obj, long j, long j2) {
        this.f1697a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo13466p(Object obj, long j, Object obj2) {
        this.f1697a.putObject(obj, j, obj2);
    }
}
