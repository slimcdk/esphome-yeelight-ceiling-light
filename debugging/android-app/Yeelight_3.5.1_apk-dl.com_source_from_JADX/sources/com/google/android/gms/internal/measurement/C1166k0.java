package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
public final class C1166k0 extends C1369x {
    protected C1166k0() {
        this.f1702a.add(zzbl.ADD);
        this.f1702a.add(zzbl.DIVIDE);
        this.f1702a.add(zzbl.MODULUS);
        this.f1702a.add(zzbl.MULTIPLY);
        this.f1702a.add(zzbl.NEGATE);
        this.f1702a.add(zzbl.POST_DECREMENT);
        this.f1702a.add(zzbl.POST_INCREMENT);
        this.f1702a.add(zzbl.PRE_DECREMENT);
        this.f1702a.add(zzbl.PRE_INCREMENT);
        this.f1702a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C1267q5.m2512e(str).ordinal();
        if (ordinal == 0) {
            C1267q5.m2515h(zzbl.name(), 2, list);
            C1261q b = p4Var.mo13062b((C1261q) list.get(0));
            C1261q b2 = p4Var.mo13062b((C1261q) list.get(1));
            return ((b instanceof C1197m) || (b instanceof C1324u) || (b2 instanceof C1197m) || (b2 instanceof C1324u)) ? new C1324u(String.valueOf(b.mo12762d()).concat(String.valueOf(b2.mo12762d()))) : new C1133i(Double.valueOf(b.mo12761c().doubleValue() + b2.mo12761c().doubleValue()));
        } else if (ordinal == 21) {
            C1267q5.m2515h(zzbl.DIVIDE.name(), 2, list);
            return new C1133i(Double.valueOf(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue() / p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()));
        } else if (ordinal == 59) {
            C1267q5.m2515h(zzbl.SUBTRACT.name(), 2, list);
            return new C1133i(Double.valueOf(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue() + new C1133i(Double.valueOf(-p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue())).mo12761c().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C1267q5.m2515h(str, 2, list);
            C1261q b3 = p4Var.mo13062b((C1261q) list.get(0));
            p4Var.mo13062b((C1261q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C1267q5.m2515h(str, 1, list);
            return p4Var.mo13062b((C1261q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C1267q5.m2515h(zzbl.MODULUS.name(), 2, list);
                    return new C1133i(Double.valueOf(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue() % p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()));
                case 45:
                    C1267q5.m2515h(zzbl.MULTIPLY.name(), 2, list);
                    return new C1133i(Double.valueOf(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue() * p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()));
                case 46:
                    C1267q5.m2515h(zzbl.NEGATE.name(), 1, list);
                    return new C1133i(Double.valueOf(-p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()));
                default:
                    return super.mo13469b(str);
            }
        }
    }
}
