package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r6 */
public final class C1284r6 {
    /* renamed from: a */
    public static C1261q m2683a(C1219n5 n5Var) {
        if (n5Var == null) {
            return C1261q.f1536D;
        }
        int H = n5Var.mo13014H() - 1;
        if (H == 1) {
            return n5Var.mo13013G() ? new C1324u(n5Var.mo13008A()) : C1261q.f1543K;
        }
        if (H == 2) {
            return n5Var.mo13012F() ? new C1133i(Double.valueOf(n5Var.mo13015x())) : new C1133i((Double) null);
        }
        if (H == 3) {
            return n5Var.mo13011E() ? new C1101g(Boolean.valueOf(n5Var.mo13010D())) : new C1101g((Boolean) null);
        }
        if (H == 4) {
            List<C1219n5> C = n5Var.mo13009C();
            ArrayList arrayList = new ArrayList();
            for (C1219n5 a : C) {
                arrayList.add(m2683a(a));
            }
            return new C1277r(n5Var.mo13016z(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    /* renamed from: b */
    public static C1261q m2684b(Object obj) {
        if (obj == null) {
            return C1261q.f1537E;
        }
        if (obj instanceof String) {
            return new C1324u((String) obj);
        }
        if (obj instanceof Double) {
            return new C1133i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1133i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1133i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1101g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C1213n nVar = new C1213n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C1261q b = m2684b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo12769m((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C1085f fVar = new C1085f();
            for (Object b2 : (List) obj) {
                fVar.mo12758A(fVar.mo12772r(), m2684b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
