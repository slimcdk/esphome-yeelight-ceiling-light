package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C1354w extends C1369x {
    public C1354w() {
        this.f1702a.add(zzbl.BITWISE_AND);
        this.f1702a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f1702a.add(zzbl.BITWISE_NOT);
        this.f1702a.add(zzbl.BITWISE_OR);
        this.f1702a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f1702a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f1702a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        switch (C1267q5.m2512e(str).ordinal()) {
            case 4:
                C1267q5.m2515h(zzbl.BITWISE_AND.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) & C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()))));
            case 5:
                C1267q5.m2515h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) << ((int) (C1267q5.m2511d(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()) & 31)))));
            case 6:
                C1267q5.m2515h(zzbl.BITWISE_NOT.name(), 1, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) ^ -1)));
            case 7:
                C1267q5.m2515h(zzbl.BITWISE_OR.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) | C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()))));
            case 8:
                C1267q5.m2515h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) >> ((int) (C1267q5.m2511d(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()) & 31)))));
            case 9:
                C1267q5.m2515h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2511d(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) >>> ((int) (C1267q5.m2511d(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()) & 31)))));
            case 10:
                C1267q5.m2515h(zzbl.BITWISE_XOR.name(), 2, list);
                return new C1133i(Double.valueOf((double) (C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(0)).mo12761c().doubleValue()) ^ C1267q5.m2509b(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue()))));
            default:
                return super.mo13469b(str);
        }
    }
}
