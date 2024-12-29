package com.google.p019vr.dynamite.client;

import java.util.Objects;

/* renamed from: com.google.vr.dynamite.client.e */
final class C2543e {

    /* renamed from: a */
    private final String f4291a;

    /* renamed from: b */
    private final String f4292b;

    public C2543e(String str, String str2) {
        this.f4291a = str;
        this.f4292b = str2;
    }

    /* renamed from: a */
    public final String mo19441a() {
        return this.f4291a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2543e) {
            C2543e eVar = (C2543e) obj;
            return Objects.equals(this.f4291a, eVar.f4291a) && Objects.equals(this.f4292b, eVar.f4292b);
        }
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f4291a) * 37) + Objects.hashCode(this.f4292b);
    }

    public final String toString() {
        return "[packageName=" + this.f4291a + ",libraryName=" + this.f4292b + "]";
    }
}
