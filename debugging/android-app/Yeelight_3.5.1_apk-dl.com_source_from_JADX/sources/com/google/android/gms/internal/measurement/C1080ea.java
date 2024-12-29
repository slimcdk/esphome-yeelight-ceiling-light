package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ea */
final class C1080ea implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f1304a;

    /* renamed from: b */
    private Object f1305b;

    /* renamed from: c */
    final /* synthetic */ C1176ka f1306c;

    C1080ea(C1176ka kaVar, Comparable comparable, Object obj) {
        this.f1306c = kaVar;
        this.f1304a = comparable;
        this.f1305b = obj;
    }

    /* renamed from: b */
    private static final boolean m1898b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo12746a() {
        return this.f1304a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f1304a.compareTo(((C1080ea) obj).f1304a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m1898b(this.f1304a, entry.getKey()) && m1898b(this.f1305b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f1304a;
    }

    public final Object getValue() {
        return this.f1305b;
    }

    public final int hashCode() {
        Comparable comparable = this.f1304a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1305b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f1306c.m2176n();
        Object obj2 = this.f1305b;
        this.f1305b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1304a);
        String valueOf2 = String.valueOf(this.f1305b);
        return valueOf + "=" + valueOf2;
    }
}
