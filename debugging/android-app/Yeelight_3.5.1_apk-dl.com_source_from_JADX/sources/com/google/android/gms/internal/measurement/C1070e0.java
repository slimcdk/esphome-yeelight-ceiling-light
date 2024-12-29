package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
public final class C1070e0 extends C1369x {
    protected C1070e0() {
        this.f1702a.add(zzbl.AND);
        this.f1702a.add(zzbl.NOT);
        this.f1702a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C1267q5.m2512e(str).ordinal();
        if (ordinal == 1) {
            C1267q5.m2515h(zzbl.AND.name(), 2, list);
            C1261q b = p4Var.mo13062b((C1261q) list.get(0));
            if (!b.mo12763e().booleanValue()) {
                return b;
            }
        } else if (ordinal == 47) {
            C1267q5.m2515h(zzbl.NOT.name(), 1, list);
            return new C1101g(Boolean.valueOf(!p4Var.mo13062b((C1261q) list.get(0)).mo12763e().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo13469b(str);
        } else {
            C1267q5.m2515h(zzbl.OR.name(), 2, list);
            C1261q b2 = p4Var.mo13062b((C1261q) list.get(0));
            if (b2.mo12763e().booleanValue()) {
                return b2;
            }
        }
        return p4Var.mo13062b((C1261q) list.get(1));
    }
}
