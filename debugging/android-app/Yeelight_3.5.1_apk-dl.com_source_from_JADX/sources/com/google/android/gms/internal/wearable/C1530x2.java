package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.x2 */
abstract class C1530x2 {

    /* renamed from: a */
    final Unsafe f1877a;

    C1530x2(Unsafe unsafe) {
        this.f1877a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo13826a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo13827b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo13828c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo13829d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo13830e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo13831f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo13832g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo13844h(Field field) {
        return this.f1877a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo13845i(Class<?> cls) {
        return this.f1877a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo13846j(Class<?> cls) {
        return this.f1877a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo13847k(Object obj, long j) {
        return this.f1877a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo13848l(Object obj, long j, int i) {
        this.f1877a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo13849m(Object obj, long j) {
        return this.f1877a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo13850n(Object obj, long j, long j2) {
        this.f1877a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo13851o(Object obj, long j) {
        return this.f1877a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo13852p(Object obj, long j, Object obj2) {
        this.f1877a.putObject(obj, j, obj2);
    }
}
