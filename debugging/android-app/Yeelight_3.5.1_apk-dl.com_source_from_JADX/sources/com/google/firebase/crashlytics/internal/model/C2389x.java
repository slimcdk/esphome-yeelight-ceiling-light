package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C2323a0;
import java.util.Objects;
import p118y0.C3913e;

/* renamed from: com.google.firebase.crashlytics.internal.model.x */
final class C2389x extends C2323a0.C2324a {

    /* renamed from: a */
    private final String f3975a;

    /* renamed from: b */
    private final String f3976b;

    /* renamed from: c */
    private final String f3977c;

    /* renamed from: d */
    private final String f3978d;

    /* renamed from: e */
    private final int f3979e;

    /* renamed from: f */
    private final C3913e f3980f;

    C2389x(String str, String str2, String str3, String str4, int i, C3913e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f3975a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f3976b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f3977c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f3978d = str4;
        this.f3979e = i;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f3980f = eVar;
    }

    /* renamed from: a */
    public String mo18871a() {
        return this.f3975a;
    }

    /* renamed from: c */
    public int mo18872c() {
        return this.f3979e;
    }

    /* renamed from: d */
    public C3913e mo18873d() {
        return this.f3980f;
    }

    /* renamed from: e */
    public String mo18874e() {
        return this.f3978d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2323a0.C2324a)) {
            return false;
        }
        C2323a0.C2324a aVar = (C2323a0.C2324a) obj;
        return this.f3975a.equals(aVar.mo18871a()) && this.f3976b.equals(aVar.mo18875f()) && this.f3977c.equals(aVar.mo18876g()) && this.f3978d.equals(aVar.mo18874e()) && this.f3979e == aVar.mo18872c() && this.f3980f.equals(aVar.mo18873d());
    }

    /* renamed from: f */
    public String mo18875f() {
        return this.f3976b;
    }

    /* renamed from: g */
    public String mo18876g() {
        return this.f3977c;
    }

    public int hashCode() {
        return ((((((((((this.f3975a.hashCode() ^ 1000003) * 1000003) ^ this.f3976b.hashCode()) * 1000003) ^ this.f3977c.hashCode()) * 1000003) ^ this.f3978d.hashCode()) * 1000003) ^ this.f3979e) * 1000003) ^ this.f3980f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f3975a + ", versionCode=" + this.f3976b + ", versionName=" + this.f3977c + ", installUuid=" + this.f3978d + ", deliveryMechanism=" + this.f3979e + ", developmentPlatformProvider=" + this.f3980f + "}";
    }
}
