package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
public final class C1233o3 {

    /* renamed from: a */
    final C1384y f1458a;

    /* renamed from: b */
    final C1250p4 f1459b;

    /* renamed from: c */
    final C1250p4 f1460c;

    /* renamed from: d */
    final C1173k7 f1461d;

    public C1233o3() {
        C1384y yVar = new C1384y();
        this.f1458a = yVar;
        C1250p4 p4Var = new C1250p4((C1250p4) null, yVar);
        this.f1460c = p4Var;
        this.f1459b = p4Var.mo13061a();
        C1173k7 k7Var = new C1173k7();
        this.f1461d = k7Var;
        p4Var.mo13067g("require", new C1260pe(k7Var));
        k7Var.mo12906a("internal.platform", C1216n2.f1435a);
        p4Var.mo13067g("runtime.counter", new C1133i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C1261q mo13036a(C1250p4 p4Var, C1219n5... n5VarArr) {
        C1261q qVar = C1261q.f1536D;
        for (C1219n5 a : n5VarArr) {
            qVar = C1284r6.m2683a(a);
            C1267q5.m2510c(this.f1460c);
            if ((qVar instanceof C1277r) || (qVar instanceof C1245p)) {
                qVar = this.f1458a.mo13502a(p4Var, qVar);
            }
        }
        return qVar;
    }
}
