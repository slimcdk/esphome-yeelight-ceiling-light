package com.google.android.gms.internal.wearable;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.h2 */
final class C1452h2 implements Map.Entry, Comparable<C1452h2> {

    /* renamed from: a */
    private final Comparable f1789a;

    /* renamed from: b */
    private Object f1790b;

    /* renamed from: c */
    final /* synthetic */ C1467k2 f1791c;

    C1452h2(C1467k2 k2Var, Comparable comparable, Object obj) {
        this.f1791c = k2Var;
        this.f1789a = comparable;
        this.f1790b = obj;
    }

    /* renamed from: b */
    private static final boolean m3546b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo13644a() {
        return this.f1789a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f1789a.compareTo(((C1452h2) obj).f1789a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m3546b(this.f1789a, entry.getKey()) && m3546b(this.f1790b, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f1789a;
    }

    public final Object getValue() {
        return this.f1790b;
    }

    public final int hashCode() {
        Comparable comparable = this.f1789a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1790b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f1791c.m3600m();
        Object obj2 = this.f1790b;
        this.f1790b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1789a);
        String valueOf2 = String.valueOf(this.f1790b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
