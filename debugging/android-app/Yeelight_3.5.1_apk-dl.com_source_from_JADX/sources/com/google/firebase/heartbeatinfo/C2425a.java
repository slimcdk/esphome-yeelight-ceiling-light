package com.google.firebase.heartbeatinfo;

import java.util.List;
import java.util.Objects;

/* renamed from: com.google.firebase.heartbeatinfo.a */
final class C2425a extends C2428d {

    /* renamed from: a */
    private final String f4073a;

    /* renamed from: b */
    private final List<String> f4074b;

    C2425a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f4073a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f4074b = list;
    }

    /* renamed from: b */
    public List<String> mo19033b() {
        return this.f4074b;
    }

    /* renamed from: c */
    public String mo19034c() {
        return this.f4073a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2428d)) {
            return false;
        }
        C2428d dVar = (C2428d) obj;
        return this.f4073a.equals(dVar.mo19034c()) && this.f4074b.equals(dVar.mo19033b());
    }

    public int hashCode() {
        return ((this.f4073a.hashCode() ^ 1000003) * 1000003) ^ this.f4074b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f4073a + ", usedDates=" + this.f4074b + "}";
    }
}
