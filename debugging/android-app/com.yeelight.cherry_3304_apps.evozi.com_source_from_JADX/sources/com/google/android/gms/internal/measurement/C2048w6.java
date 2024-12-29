package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
final class C2048w6 implements Comparable<C2048w6>, Map.Entry<K, V> {

    /* renamed from: a */
    private final K f3802a;

    /* renamed from: b */
    private V f3803b;

    /* renamed from: c */
    private final /* synthetic */ C1971r6 f3804c;

    C2048w6(C1971r6 r6Var, K k, V v) {
        this.f3804c = r6Var;
        this.f3802a = k;
        this.f3803b = v;
    }

    C2048w6(C1971r6 r6Var, Map.Entry<K, V> entry) {
        this(r6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m6276a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2048w6) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m6276a(this.f3802a, entry.getKey()) && m6276a(this.f3803b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f3802a;
    }

    public final V getValue() {
        return this.f3803b;
    }

    public final int hashCode() {
        K k = this.f3802a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f3803b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f3804c.m5900p();
        V v2 = this.f3803b;
        this.f3803b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3802a);
        String valueOf2 = String.valueOf(this.f3803b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
