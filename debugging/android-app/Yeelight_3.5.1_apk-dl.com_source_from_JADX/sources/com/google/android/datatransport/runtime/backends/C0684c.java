package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import p083q.C3604a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C0684c extends C0687e {

    /* renamed from: a */
    private final Context f429a;

    /* renamed from: b */
    private final C3604a f430b;

    /* renamed from: c */
    private final C3604a f431c;

    /* renamed from: d */
    private final String f432d;

    C0684c(Context context, C3604a aVar, C3604a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f429a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f430b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f431c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f432d = str;
    }

    /* renamed from: b */
    public Context mo11223b() {
        return this.f429a;
    }

    @NonNull
    /* renamed from: c */
    public String mo11224c() {
        return this.f432d;
    }

    /* renamed from: d */
    public C3604a mo11225d() {
        return this.f431c;
    }

    /* renamed from: e */
    public C3604a mo11226e() {
        return this.f430b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0687e)) {
            return false;
        }
        C0687e eVar = (C0687e) obj;
        return this.f429a.equals(eVar.mo11223b()) && this.f430b.equals(eVar.mo11226e()) && this.f431c.equals(eVar.mo11225d()) && this.f432d.equals(eVar.mo11224c());
    }

    public int hashCode() {
        return ((((((this.f429a.hashCode() ^ 1000003) * 1000003) ^ this.f430b.hashCode()) * 1000003) ^ this.f431c.hashCode()) * 1000003) ^ this.f432d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f429a + ", wallClock=" + this.f430b + ", monotonicClock=" + this.f431c + ", backendName=" + this.f432d + "}";
    }
}
