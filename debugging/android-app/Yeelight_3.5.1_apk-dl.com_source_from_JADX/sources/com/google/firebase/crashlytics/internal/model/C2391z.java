package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C2323a0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.z */
final class C2391z extends C2323a0.C2326c {

    /* renamed from: a */
    private final String f3990a;

    /* renamed from: b */
    private final String f3991b;

    /* renamed from: c */
    private final boolean f3992c;

    C2391z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f3990a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f3991b = str2;
        this.f3992c = z;
    }

    /* renamed from: b */
    public boolean mo18886b() {
        return this.f3992c;
    }

    /* renamed from: c */
    public String mo18887c() {
        return this.f3991b;
    }

    /* renamed from: d */
    public String mo18888d() {
        return this.f3990a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2323a0.C2326c)) {
            return false;
        }
        C2323a0.C2326c cVar = (C2323a0.C2326c) obj;
        return this.f3990a.equals(cVar.mo18888d()) && this.f3991b.equals(cVar.mo18887c()) && this.f3992c == cVar.mo18886b();
    }

    public int hashCode() {
        return ((((this.f3990a.hashCode() ^ 1000003) * 1000003) ^ this.f3991b.hashCode()) * 1000003) ^ (this.f3992c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f3990a + ", osCodeName=" + this.f3991b + ", isRooted=" + this.f3992c + "}";
    }
}
