package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.oe */
public final class C1244oe extends C1149j {

    /* renamed from: c */
    private final C1308se f1487c;

    public C1244oe(C1308se seVar) {
        super("internal.registerCallback");
        this.f1487c = seVar;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        C1267q5.m2515h(this.f1380a, 3, list);
        String d = p4Var.mo13062b((C1261q) list.get(0)).mo12762d();
        C1261q b = p4Var.mo13062b((C1261q) list.get(1));
        if (b instanceof C1245p) {
            C1261q b2 = p4Var.mo13062b((C1261q) list.get(2));
            if (b2 instanceof C1213n) {
                C1213n nVar = (C1213n) b2;
                if (nVar.mo12768j("type")) {
                    this.f1487c.mo13365a(d, nVar.mo12768j("priority") ? C1267q5.m2509b(nVar.mo12770n("priority").mo12761c().doubleValue()) : 1000, (C1245p) b, nVar.mo12770n("type").mo12762d());
                    return C1261q.f1536D;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
