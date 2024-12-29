package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C2323a0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.w */
final class C2388w extends C2323a0 {

    /* renamed from: a */
    private final C2323a0.C2324a f3972a;

    /* renamed from: b */
    private final C2323a0.C2326c f3973b;

    /* renamed from: c */
    private final C2323a0.C2325b f3974c;

    C2388w(C2323a0.C2324a aVar, C2323a0.C2326c cVar, C2323a0.C2325b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f3972a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f3973b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f3974c = bVar;
    }

    /* renamed from: a */
    public C2323a0.C2324a mo18868a() {
        return this.f3972a;
    }

    /* renamed from: c */
    public C2323a0.C2325b mo18869c() {
        return this.f3974c;
    }

    /* renamed from: d */
    public C2323a0.C2326c mo18870d() {
        return this.f3973b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2323a0)) {
            return false;
        }
        C2323a0 a0Var = (C2323a0) obj;
        return this.f3972a.equals(a0Var.mo18868a()) && this.f3973b.equals(a0Var.mo18870d()) && this.f3974c.equals(a0Var.mo18869c());
    }

    public int hashCode() {
        return ((((this.f3972a.hashCode() ^ 1000003) * 1000003) ^ this.f3973b.hashCode()) * 1000003) ^ this.f3974c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f3972a + ", osData=" + this.f3973b + ", deviceData=" + this.f3974c + "}";
    }
}
