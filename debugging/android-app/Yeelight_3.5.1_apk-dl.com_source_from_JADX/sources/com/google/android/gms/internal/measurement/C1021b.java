package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C1021b {

    /* renamed from: a */
    private String f1239a;

    /* renamed from: b */
    private final long f1240b;

    /* renamed from: c */
    private final Map f1241c;

    public C1021b(String str, long j, Map map) {
        this.f1239a = str;
        this.f1240b = j;
        HashMap hashMap = new HashMap();
        this.f1241c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo12550a() {
        return this.f1240b;
    }

    /* renamed from: b */
    public final C1021b clone() {
        return new C1021b(this.f1239a, this.f1240b, new HashMap(this.f1241c));
    }

    /* renamed from: c */
    public final Object mo12552c(String str) {
        if (this.f1241c.containsKey(str)) {
            return this.f1241c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo12554d() {
        return this.f1239a;
    }

    /* renamed from: e */
    public final Map mo12555e() {
        return this.f1241c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1021b)) {
            return false;
        }
        C1021b bVar = (C1021b) obj;
        if (this.f1240b == bVar.f1240b && this.f1239a.equals(bVar.f1239a)) {
            return this.f1241c.equals(bVar.f1241c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo12557f(String str) {
        this.f1239a = str;
    }

    /* renamed from: g */
    public final void mo12558g(String str, Object obj) {
        if (obj == null) {
            this.f1241c.remove(str);
        } else {
            this.f1241c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f1239a.hashCode();
        long j = this.f1240b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f1241c.hashCode();
    }

    public final String toString() {
        String str = this.f1239a;
        long j = this.f1240b;
        String obj = this.f1241c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
