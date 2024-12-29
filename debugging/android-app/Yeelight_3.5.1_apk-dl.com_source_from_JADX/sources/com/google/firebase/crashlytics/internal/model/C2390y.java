package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C2323a0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.y */
final class C2390y extends C2323a0.C2325b {

    /* renamed from: a */
    private final int f3981a;

    /* renamed from: b */
    private final String f3982b;

    /* renamed from: c */
    private final int f3983c;

    /* renamed from: d */
    private final long f3984d;

    /* renamed from: e */
    private final long f3985e;

    /* renamed from: f */
    private final boolean f3986f;

    /* renamed from: g */
    private final int f3987g;

    /* renamed from: h */
    private final String f3988h;

    /* renamed from: i */
    private final String f3989i;

    C2390y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f3981a = i;
        Objects.requireNonNull(str, "Null model");
        this.f3982b = str;
        this.f3983c = i2;
        this.f3984d = j;
        this.f3985e = j2;
        this.f3986f = z;
        this.f3987g = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f3988h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f3989i = str3;
    }

    /* renamed from: a */
    public int mo18877a() {
        return this.f3981a;
    }

    /* renamed from: b */
    public int mo18878b() {
        return this.f3983c;
    }

    /* renamed from: d */
    public long mo18879d() {
        return this.f3985e;
    }

    /* renamed from: e */
    public boolean mo18880e() {
        return this.f3986f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2323a0.C2325b)) {
            return false;
        }
        C2323a0.C2325b bVar = (C2323a0.C2325b) obj;
        return this.f3981a == bVar.mo18877a() && this.f3982b.equals(bVar.mo18882g()) && this.f3983c == bVar.mo18878b() && this.f3984d == bVar.mo18885j() && this.f3985e == bVar.mo18879d() && this.f3986f == bVar.mo18880e() && this.f3987g == bVar.mo18884i() && this.f3988h.equals(bVar.mo18881f()) && this.f3989i.equals(bVar.mo18883h());
    }

    /* renamed from: f */
    public String mo18881f() {
        return this.f3988h;
    }

    /* renamed from: g */
    public String mo18882g() {
        return this.f3982b;
    }

    /* renamed from: h */
    public String mo18883h() {
        return this.f3989i;
    }

    public int hashCode() {
        long j = this.f3984d;
        long j2 = this.f3985e;
        return ((((((((((((((((this.f3981a ^ 1000003) * 1000003) ^ this.f3982b.hashCode()) * 1000003) ^ this.f3983c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f3986f ? 1231 : 1237)) * 1000003) ^ this.f3987g) * 1000003) ^ this.f3988h.hashCode()) * 1000003) ^ this.f3989i.hashCode();
    }

    /* renamed from: i */
    public int mo18884i() {
        return this.f3987g;
    }

    /* renamed from: j */
    public long mo18885j() {
        return this.f3984d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f3981a + ", model=" + this.f3982b + ", availableProcessors=" + this.f3983c + ", totalRam=" + this.f3984d + ", diskSpace=" + this.f3985e + ", isEmulator=" + this.f3986f + ", state=" + this.f3987g + ", manufacturer=" + this.f3988h + ", modelClass=" + this.f3989i + "}";
    }
}
