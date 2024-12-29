package com.google.firebase.p138k;

import javax.annotation.Nonnull;

/* renamed from: com.google.firebase.k.a */
final class C3310a extends C3315f {

    /* renamed from: a */
    private final String f6414a;

    /* renamed from: b */
    private final String f6415b;

    C3310a(String str, String str2) {
        if (str != null) {
            this.f6414a = str;
            if (str2 != null) {
                this.f6415b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    /* renamed from: b */
    public String mo17966b() {
        return this.f6414a;
    }

    @Nonnull
    /* renamed from: c */
    public String mo17967c() {
        return this.f6415b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3315f)) {
            return false;
        }
        C3315f fVar = (C3315f) obj;
        return this.f6414a.equals(fVar.mo17966b()) && this.f6415b.equals(fVar.mo17967c());
    }

    public int hashCode() {
        return ((this.f6414a.hashCode() ^ 1000003) * 1000003) ^ this.f6415b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f6414a + ", version=" + this.f6415b + "}";
    }
}
