package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z4 */
final class C2093z4<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    private Map.Entry<K, C2061x4> f3863a;

    private C2093z4(Map.Entry<K, C2061x4> entry) {
        this.f3863a = entry;
    }

    /* renamed from: a */
    public final C2061x4 mo12355a() {
        return this.f3863a.getValue();
    }

    public final K getKey() {
        return this.f3863a.getKey();
    }

    public final Object getValue() {
        if (this.f3863a.getValue() == null) {
            return null;
        }
        C2061x4.m6564e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C2062x5) {
            return this.f3863a.getValue().mo11456a((C2062x5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
