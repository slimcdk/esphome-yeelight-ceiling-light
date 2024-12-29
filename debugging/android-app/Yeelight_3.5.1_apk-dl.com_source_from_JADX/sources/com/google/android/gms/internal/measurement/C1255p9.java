package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
final class C1255p9 implements C1364w9 {

    /* renamed from: a */
    private final C1191l9 f1527a;

    /* renamed from: b */
    private final C1224na f1528b;

    /* renamed from: c */
    private final boolean f1529c;

    /* renamed from: d */
    private final C1392y7 f1530d;

    private C1255p9(C1224na naVar, C1392y7 y7Var, C1191l9 l9Var) {
        this.f1528b = naVar;
        this.f1529c = y7Var.mo13510c(l9Var);
        this.f1530d = y7Var;
        this.f1527a = l9Var;
    }

    /* renamed from: j */
    static C1255p9 m2461j(C1224na naVar, C1392y7 y7Var, C1191l9 l9Var) {
        return new C1255p9(naVar, y7Var, l9Var);
    }

    /* renamed from: a */
    public final Object mo13041a() {
        return this.f1527a.mo12907b().mo12829V0();
    }

    /* renamed from: b */
    public final void mo13042b(Object obj) {
        this.f1528b.mo13026g(obj);
        this.f1530d.mo13509b(obj);
    }

    /* renamed from: c */
    public final void mo13043c(Object obj, byte[] bArr, int i, int i2, C1029b7 b7Var) {
        C1174k8 k8Var = (C1174k8) obj;
        if (k8Var.zzc == C1240oa.m2413c()) {
            k8Var.zzc = C1240oa.m2415e();
        }
        C1126h8 h8Var = (C1126h8) obj;
        throw null;
    }

    /* renamed from: d */
    public final boolean mo13044d(Object obj) {
        this.f1530d.mo13508a(obj);
        throw null;
    }

    /* renamed from: e */
    public final int mo13045e(Object obj) {
        int hashCode = this.f1528b.mo13022c(obj).hashCode();
        if (!this.f1529c) {
            return hashCode;
        }
        this.f1530d.mo13508a(obj);
        throw null;
    }

    /* renamed from: f */
    public final int mo13046f(Object obj) {
        C1224na naVar = this.f1528b;
        int b = naVar.mo13021b(naVar.mo13022c(obj));
        if (!this.f1529c) {
            return b;
        }
        this.f1530d.mo13508a(obj);
        throw null;
    }

    /* renamed from: g */
    public final void mo13047g(Object obj, Object obj2) {
        C1394y9.m3339f(this.f1528b, obj, obj2);
        if (this.f1529c) {
            C1394y9.m3338e(this.f1530d, obj, obj2);
        }
    }

    /* renamed from: h */
    public final void mo13048h(Object obj, C1065db dbVar) {
        this.f1530d.mo13508a(obj);
        throw null;
    }

    /* renamed from: i */
    public final boolean mo13049i(Object obj, Object obj2) {
        if (!this.f1528b.mo13022c(obj).equals(this.f1528b.mo13022c(obj2))) {
            return false;
        }
        if (!this.f1529c) {
            return true;
        }
        this.f1530d.mo13508a(obj);
        this.f1530d.mo13508a(obj2);
        throw null;
    }
}
