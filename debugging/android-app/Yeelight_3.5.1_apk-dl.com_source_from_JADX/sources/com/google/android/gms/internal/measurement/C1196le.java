package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.le */
final class C1196le extends C1149j {

    /* renamed from: c */
    final boolean f1414c;

    /* renamed from: d */
    final boolean f1415d;

    /* renamed from: e */
    final /* synthetic */ C1212me f1416e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1196le(C1212me meVar, boolean z, boolean z2) {
        super("log");
        this.f1416e = meVar;
        this.f1414c = z;
        this.f1415d = z2;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        List arrayList;
        C1180ke h;
        C1267q5.m2516i("log", 1, list);
        if (list.size() == 1) {
            this.f1416e.f1431c.mo12941a(3, p4Var.mo13062b((C1261q) list.get(0)).mo12762d(), Collections.emptyList(), this.f1414c, this.f1415d);
        } else {
            int b = C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue());
            int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
            String d = p4Var.mo13062b((C1261q) list.get(1)).mo12762d();
            if (list.size() == 2) {
                h = this.f1416e.f1431c;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(p4Var.mo13062b((C1261q) list.get(i2)).mo12762d());
                }
                h = this.f1416e.f1431c;
            }
            h.mo12941a(i, d, arrayList, this.f1414c, this.f1415d);
        }
        return C1261q.f1536D;
    }
}
