package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ca */
final class C1048ca extends C1149j {

    /* renamed from: c */
    final /* synthetic */ C1018ac f1268c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1048ca(C1033bb bbVar, String str, C1018ac acVar) {
        super("getValue");
        this.f1268c = acVar;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        C1267q5.m2515h("getValue", 2, list);
        C1261q b = p4Var.mo13062b((C1261q) list.get(0));
        C1261q b2 = p4Var.mo13062b((C1261q) list.get(1));
        String a = this.f1268c.mo12546a(b.mo12762d());
        return a != null ? new C1324u(a) : b2;
    }
}
