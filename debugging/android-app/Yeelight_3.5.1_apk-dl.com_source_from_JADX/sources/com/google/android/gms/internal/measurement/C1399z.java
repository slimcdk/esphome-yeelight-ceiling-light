package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
public final class C1399z extends C1369x {
    public C1399z() {
        this.f1702a.add(zzbl.EQUALS);
        this.f1702a.add(zzbl.GREATER_THAN);
        this.f1702a.add(zzbl.GREATER_THAN_EQUALS);
        this.f1702a.add(zzbl.IDENTITY_EQUALS);
        this.f1702a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f1702a.add(zzbl.LESS_THAN);
        this.f1702a.add(zzbl.LESS_THAN_EQUALS);
        this.f1702a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m3371c(C1261q qVar, C1261q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C1339v) || (qVar instanceof C1229o)) {
                return true;
            }
            return qVar instanceof C1133i ? !Double.isNaN(qVar.mo12761c().doubleValue()) && !Double.isNaN(qVar2.mo12761c().doubleValue()) && qVar.mo12761c().doubleValue() == qVar2.mo12761c().doubleValue() : qVar instanceof C1324u ? qVar.mo12762d().equals(qVar2.mo12762d()) : qVar instanceof C1101g ? qVar.mo12763e().equals(qVar2.mo12763e()) : qVar == qVar2;
        } else if (((qVar instanceof C1339v) || (qVar instanceof C1229o)) && ((qVar2 instanceof C1339v) || (qVar2 instanceof C1229o))) {
            return true;
        } else {
            boolean z = qVar instanceof C1133i;
            if (z && (qVar2 instanceof C1324u)) {
                return m3371c(qVar, new C1133i(qVar2.mo12761c()));
            }
            boolean z2 = qVar instanceof C1324u;
            if (z2 && (qVar2 instanceof C1133i)) {
                return m3371c(new C1133i(qVar.mo12761c()), qVar2);
            }
            if (qVar instanceof C1101g) {
                return m3371c(new C1133i(qVar.mo12761c()), qVar2);
            }
            if (qVar2 instanceof C1101g) {
                return m3371c(qVar, new C1133i(qVar2.mo12761c()));
            }
            if ((z2 || z) && (qVar2 instanceof C1197m)) {
                return m3371c(qVar, new C1324u(qVar2.mo12762d()));
            }
            if (!(qVar instanceof C1197m) || (!(qVar2 instanceof C1324u) && !(qVar2 instanceof C1133i))) {
                return false;
            }
            return m3371c(new C1324u(qVar.mo12762d()), qVar2);
        }
    }

    /* renamed from: d */
    private static boolean m3372d(C1261q qVar, C1261q qVar2) {
        if (qVar instanceof C1197m) {
            qVar = new C1324u(qVar.mo12762d());
        }
        if (qVar2 instanceof C1197m) {
            qVar2 = new C1324u(qVar2.mo12762d());
        }
        if ((qVar instanceof C1324u) && (qVar2 instanceof C1324u)) {
            return qVar.mo12762d().compareTo(qVar2.mo12762d()) < 0;
        }
        double doubleValue = qVar.mo12761c().doubleValue();
        double doubleValue2 = qVar2.mo12761c().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == 0.0d) && (!(doubleValue == 0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    /* renamed from: e */
    private static boolean m3373e(C1261q qVar, C1261q qVar2) {
        if (qVar instanceof C1197m) {
            qVar = new C1324u(qVar.mo12762d());
        }
        if (qVar2 instanceof C1197m) {
            qVar2 = new C1324u(qVar2.mo12762d());
        }
        return (((qVar instanceof C1324u) && (qVar2 instanceof C1324u)) || (!Double.isNaN(qVar.mo12761c().doubleValue()) && !Double.isNaN(qVar2.mo12761c().doubleValue()))) && !m3372d(qVar2, qVar);
    }

    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        boolean z;
        boolean c;
        C1267q5.m2515h(C1267q5.m2512e(str).name(), 2, list);
        C1261q b = p4Var.mo13062b((C1261q) list.get(0));
        C1261q b2 = p4Var.mo13062b((C1261q) list.get(1));
        int ordinal = C1267q5.m2512e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m3371c(b, b2);
            } else if (ordinal == 42) {
                z = m3372d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m3372d(b2, b);
                        break;
                    case 38:
                        z = m3373e(b2, b);
                        break;
                    case 39:
                        z = C1267q5.m2519l(b, b2);
                        break;
                    case 40:
                        c = C1267q5.m2519l(b, b2);
                        break;
                    default:
                        return super.mo13469b(str);
                }
            } else {
                z = m3373e(b, b2);
            }
            z = !c;
        } else {
            z = m3371c(b, b2);
        }
        return z ? C1261q.f1541I : C1261q.f1542J;
    }
}
