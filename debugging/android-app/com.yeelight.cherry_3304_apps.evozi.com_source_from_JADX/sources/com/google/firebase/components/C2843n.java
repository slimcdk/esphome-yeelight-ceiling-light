package com.google.firebase.components;

/* renamed from: com.google.firebase.components.n */
public final class C2843n {

    /* renamed from: a */
    private final Class<?> f5477a;

    /* renamed from: b */
    private final int f5478b;

    /* renamed from: c */
    private final int f5479c;

    private C2843n(Class<?> cls, int i, int i2) {
        C2850u.m8661c(cls, "Null dependency anInterface.");
        this.f5477a = cls;
        this.f5478b = i;
        this.f5479c = i2;
    }

    /* renamed from: e */
    public static C2843n m8644e(Class<?> cls) {
        return new C2843n(cls, 0, 0);
    }

    /* renamed from: f */
    public static C2843n m8645f(Class<?> cls) {
        return new C2843n(cls, 1, 0);
    }

    /* renamed from: g */
    public static C2843n m8646g(Class<?> cls) {
        return new C2843n(cls, 1, 1);
    }

    /* renamed from: h */
    public static C2843n m8647h(Class<?> cls) {
        return new C2843n(cls, 2, 0);
    }

    /* renamed from: a */
    public Class<?> mo17104a() {
        return this.f5477a;
    }

    /* renamed from: b */
    public boolean mo17105b() {
        return this.f5479c == 0;
    }

    /* renamed from: c */
    public boolean mo17106c() {
        return this.f5478b == 1;
    }

    /* renamed from: d */
    public boolean mo17107d() {
        return this.f5478b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2843n)) {
            return false;
        }
        C2843n nVar = (C2843n) obj;
        return this.f5477a == nVar.f5477a && this.f5478b == nVar.f5478b && this.f5479c == nVar.f5479c;
    }

    public int hashCode() {
        return ((((this.f5477a.hashCode() ^ 1000003) * 1000003) ^ this.f5478b) * 1000003) ^ this.f5479c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5477a);
        sb.append(", type=");
        int i = this.f5478b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f5479c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
