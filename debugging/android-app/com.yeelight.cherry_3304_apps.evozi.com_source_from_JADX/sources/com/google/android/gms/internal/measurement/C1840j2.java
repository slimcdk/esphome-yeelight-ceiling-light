package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
public abstract class C1840j2<T> implements Serializable {
    C1840j2() {
    }

    /* renamed from: a */
    public static <T> C1840j2<T> m5276a(T t) {
        C1824i2.m5242a(t);
        return new C1872l2(t);
    }

    /* renamed from: d */
    public static <T> C1840j2<T> m5277d() {
        return C1809h2.f3451a;
    }

    /* renamed from: b */
    public abstract boolean mo11699b();

    /* renamed from: c */
    public abstract T mo11700c();
}
