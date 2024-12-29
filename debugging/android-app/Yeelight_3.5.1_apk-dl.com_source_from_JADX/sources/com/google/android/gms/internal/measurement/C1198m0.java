package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
public final class C1198m0 extends C1369x {
    protected C1198m0() {
        this.f1702a.add(zzbl.ASSIGN);
        this.f1702a.add(zzbl.CONST);
        this.f1702a.add(zzbl.CREATE_ARRAY);
        this.f1702a.add(zzbl.CREATE_OBJECT);
        this.f1702a.add(zzbl.EXPRESSION_LIST);
        this.f1702a.add(zzbl.GET);
        this.f1702a.add(zzbl.GET_INDEX);
        this.f1702a.add(zzbl.GET_PROPERTY);
        this.f1702a.add(zzbl.NULL);
        this.f1702a.add(zzbl.SET_PROPERTY);
        this.f1702a.add(zzbl.TYPEOF);
        this.f1702a.add(zzbl.UNDEFINED);
        this.f1702a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = C1267q5.m2512e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C1267q5.m2515h(zzbl.ASSIGN.name(), 2, list);
            C1261q b = p4Var.mo13062b((C1261q) list.get(0));
            if (!(b instanceof C1324u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (p4Var.mo13068h(b.mo12762d())) {
                C1261q b2 = p4Var.mo13062b((C1261q) list.get(1));
                p4Var.mo13067g(b.mo12762d(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo12762d()}));
            }
        } else if (ordinal == 14) {
            C1267q5.m2516i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C1261q b3 = p4Var.mo13062b((C1261q) list.get(i2));
                    if (b3 instanceof C1324u) {
                        p4Var.mo13066f(b3.mo12762d(), p4Var.mo13062b((C1261q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C1261q.f1536D;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C1267q5.m2516i(zzbl.EXPRESSION_LIST.name(), 1, list);
            C1261q qVar = C1261q.f1536D;
            while (i < list.size()) {
                qVar = p4Var.mo13062b((C1261q) list.get(i));
                if (!(qVar instanceof C1117h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C1267q5.m2515h(zzbl.GET.name(), 1, list);
            C1261q b4 = p4Var.mo13062b((C1261q) list.get(0));
            if (b4 instanceof C1324u) {
                return p4Var.mo13064d(b4.mo12762d());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C1267q5.m2515h(zzbl.NULL.name(), 0, list);
            return C1261q.f1537E;
        } else if (ordinal == 58) {
            C1267q5.m2515h(zzbl.SET_PROPERTY.name(), 3, list);
            C1261q b5 = p4Var.mo13062b((C1261q) list.get(0));
            C1261q b6 = p4Var.mo13062b((C1261q) list.get(1));
            C1261q b7 = p4Var.mo13062b((C1261q) list.get(2));
            if (b5 == C1261q.f1536D || b5 == C1261q.f1537E) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo12762d(), b5.mo12762d()}));
            }
            if ((b5 instanceof C1085f) && (b6 instanceof C1133i)) {
                ((C1085f) b5).mo12758A(b6.mo12761c().intValue(), b7);
            } else if (b5 instanceof C1197m) {
                ((C1197m) b5).mo12769m(b6.mo12762d(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C1267q5.m2515h(zzbl.GET_PROPERTY.name(), 2, list);
                    C1261q b8 = p4Var.mo13062b((C1261q) list.get(0));
                    C1261q b9 = p4Var.mo13062b((C1261q) list.get(1));
                    if ((b8 instanceof C1085f) && C1267q5.m2518k(b9)) {
                        return ((C1085f) b8).mo12773t(b9.mo12761c().intValue());
                    }
                    if (b8 instanceof C1197m) {
                        return ((C1197m) b8).mo12770n(b9.mo12762d());
                    }
                    if (b8 instanceof C1324u) {
                        if ("length".equals(b9.mo12762d())) {
                            return new C1133i(Double.valueOf((double) b8.mo12762d().length()));
                        }
                        if (C1267q5.m2518k(b9) && b9.mo12761c().doubleValue() < ((double) b8.mo12762d().length())) {
                            return new C1324u(String.valueOf(b8.mo12762d().charAt(b9.mo12761c().intValue())));
                        }
                    }
                    return C1261q.f1536D;
                }
                switch (ordinal) {
                    case 62:
                        C1267q5.m2515h(zzbl.TYPEOF.name(), 1, list);
                        C1261q b10 = p4Var.mo13062b((C1261q) list.get(0));
                        if (b10 instanceof C1339v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C1101g) {
                            str2 = TypedValues.Custom.S_BOOLEAN;
                        } else if (b10 instanceof C1133i) {
                            str2 = "number";
                        } else if (b10 instanceof C1324u) {
                            str2 = TypedValues.Custom.S_STRING;
                        } else if (b10 instanceof C1245p) {
                            str2 = "function";
                        } else if ((b10 instanceof C1277r) || (b10 instanceof C1117h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C1324u(str2);
                    case 63:
                        C1267q5.m2515h(zzbl.UNDEFINED.name(), 0, list);
                        return C1261q.f1536D;
                    case 64:
                        C1267q5.m2516i(zzbl.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C1261q b11 = p4Var.mo13062b((C1261q) it.next());
                            if (b11 instanceof C1324u) {
                                p4Var.mo13065e(b11.mo12762d(), C1261q.f1536D);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C1261q.f1536D;
                    default:
                        return super.mo13469b(str);
                }
            } else if (list.isEmpty()) {
                return new C1213n();
            } else {
                if (list.size() % 2 == 0) {
                    C1213n nVar = new C1213n();
                    while (i < list.size() - 1) {
                        C1261q b12 = p4Var.mo13062b((C1261q) list.get(i));
                        C1261q b13 = p4Var.mo13062b((C1261q) list.get(i + 1));
                        if ((b12 instanceof C1117h) || (b13 instanceof C1117h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo12769m(b12.mo12762d(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C1085f();
        } else {
            C1085f fVar = new C1085f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1261q b14 = p4Var.mo13062b((C1261q) it2.next());
                if (!(b14 instanceof C1117h)) {
                    fVar.mo12758A(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
