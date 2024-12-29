package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
public final class C1150j0 extends C1369x {
    protected C1150j0() {
        this.f1702a.add(zzbl.FOR_IN);
        this.f1702a.add(zzbl.FOR_IN_CONST);
        this.f1702a.add(zzbl.FOR_IN_LET);
        this.f1702a.add(zzbl.FOR_LET);
        this.f1702a.add(zzbl.FOR_OF);
        this.f1702a.add(zzbl.FOR_OF_CONST);
        this.f1702a.add(zzbl.FOR_OF_LET);
        this.f1702a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    private static C1261q m2106c(C1118h0 h0Var, Iterator it, C1261q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C1261q c = h0Var.mo12781a((C1261q) it.next()).mo13063c((C1085f) qVar);
                if (c instanceof C1117h) {
                    C1117h hVar = (C1117h) c;
                    if ("break".equals(hVar.mo12849f())) {
                        return C1261q.f1536D;
                    }
                    if ("return".equals(hVar.mo12849f())) {
                        return hVar;
                    }
                }
            }
        }
        return C1261q.f1536D;
    }

    /* renamed from: d */
    private static C1261q m2107d(C1118h0 h0Var, C1261q qVar, C1261q qVar2) {
        return m2106c(h0Var, qVar.mo12765g(), qVar2);
    }

    /* renamed from: e */
    private static C1261q m2108e(C1118h0 h0Var, C1261q qVar, C1261q qVar2) {
        if (qVar instanceof Iterable) {
            return m2106c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C1267q5.m2512e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C1267q5.m2515h(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d = ((C1261q) list.get(0)).mo12762d();
                        return m2107d(new C1134i0(p4Var, d), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C1267q5.m2515h(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d2 = ((C1261q) list.get(0)).mo12762d();
                        return m2107d(new C1086f0(p4Var, d2), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C1267q5.m2515h(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d3 = ((C1261q) list.get(0)).mo12762d();
                        return m2107d(new C1102g0(p4Var, d3), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C1267q5.m2515h(zzbl.FOR_LET.name(), 4, list);
                    C1261q b = p4Var.mo13062b((C1261q) list.get(0));
                    if (b instanceof C1085f) {
                        C1085f fVar = (C1085f) b;
                        C1261q qVar = (C1261q) list.get(1);
                        C1261q qVar2 = (C1261q) list.get(2);
                        C1261q b2 = p4Var.mo13062b((C1261q) list.get(3));
                        C1250p4 a = p4Var.mo13061a();
                        for (int i = 0; i < fVar.mo12772r(); i++) {
                            String d4 = fVar.mo12773t(i).mo12762d();
                            a.mo13067g(d4, p4Var.mo13064d(d4));
                        }
                        while (p4Var.mo13062b(qVar).mo12763e().booleanValue()) {
                            C1261q c = p4Var.mo13063c((C1085f) b2);
                            if (c instanceof C1117h) {
                                C1117h hVar = (C1117h) c;
                                if ("break".equals(hVar.mo12849f())) {
                                    return C1261q.f1536D;
                                }
                                if ("return".equals(hVar.mo12849f())) {
                                    return hVar;
                                }
                            }
                            C1250p4 a2 = p4Var.mo13061a();
                            for (int i2 = 0; i2 < fVar.mo12772r(); i2++) {
                                String d5 = fVar.mo12773t(i2).mo12762d();
                                a2.mo13067g(d5, a.mo13064d(d5));
                            }
                            a2.mo13062b(qVar2);
                            a = a2;
                        }
                        return C1261q.f1536D;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C1267q5.m2515h(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d6 = ((C1261q) list.get(0)).mo12762d();
                        return m2108e(new C1134i0(p4Var, d6), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C1267q5.m2515h(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d7 = ((C1261q) list.get(0)).mo12762d();
                        return m2108e(new C1086f0(p4Var, d7), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C1267q5.m2515h(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C1324u) {
                        String d8 = ((C1261q) list.get(0)).mo12762d();
                        return m2108e(new C1102g0(p4Var, d8), p4Var.mo13062b((C1261q) list.get(1)), p4Var.mo13062b((C1261q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo13469b(str);
            }
        } else {
            C1267q5.m2515h(zzbl.WHILE.name(), 4, list);
            C1261q qVar3 = (C1261q) list.get(0);
            C1261q qVar4 = (C1261q) list.get(1);
            C1261q b3 = p4Var.mo13062b((C1261q) list.get(3));
            if (p4Var.mo13062b((C1261q) list.get(2)).mo12763e().booleanValue()) {
                C1261q c2 = p4Var.mo13063c((C1085f) b3);
                if (c2 instanceof C1117h) {
                    C1117h hVar2 = (C1117h) c2;
                    if (!"break".equals(hVar2.mo12849f())) {
                        if ("return".equals(hVar2.mo12849f())) {
                            return hVar2;
                        }
                    }
                    return C1261q.f1536D;
                }
            }
            while (p4Var.mo13062b(qVar3).mo12763e().booleanValue()) {
                C1261q c3 = p4Var.mo13063c((C1085f) b3);
                if (c3 instanceof C1117h) {
                    C1117h hVar3 = (C1117h) c3;
                    if ("break".equals(hVar3.mo12849f())) {
                        break;
                    } else if ("return".equals(hVar3.mo12849f())) {
                        return hVar3;
                    }
                }
                p4Var.mo13062b(qVar4);
            }
            return C1261q.f1536D;
        }
    }
}
