package com.google.p139vr.dynamite.client;

import java.util.Objects;

/* renamed from: com.google.vr.dynamite.client.e */
final class C3328e {

    /* renamed from: a */
    private final String f6432a;

    /* renamed from: b */
    private final String f6433b;

    public C3328e(String str, String str2) {
        this.f6432a = str;
        this.f6433b = str2;
    }

    /* renamed from: a */
    public final String mo18070a() {
        return this.f6432a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3328e) {
            C3328e eVar = (C3328e) obj;
            return Objects.equals(this.f6432a, eVar.f6432a) && Objects.equals(this.f6433b, eVar.f6433b);
        }
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f6432a) * 37) + Objects.hashCode(this.f6433b);
    }

    public final String toString() {
        return "[packageName=" + this.f6432a + ",libraryName=" + this.f6433b + "]";
    }
}
