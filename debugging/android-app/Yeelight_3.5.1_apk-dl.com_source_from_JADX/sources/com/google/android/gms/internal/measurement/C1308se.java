package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.se */
public final class C1308se {

    /* renamed from: a */
    final TreeMap f1641a = new TreeMap();

    /* renamed from: b */
    final TreeMap f1642b = new TreeMap();

    /* renamed from: c */
    private static final int m2980c(C1250p4 p4Var, C1245p pVar, C1261q qVar) {
        C1261q a = pVar.mo12586a(p4Var, Collections.singletonList(qVar));
        if (a instanceof C1133i) {
            return C1267q5.m2509b(a.mo12761c().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo13365a(String str, int i, C1245p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f1642b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f1641a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo13366b(C1250p4 p4Var, C1037c cVar) {
        C1047c9 c9Var = new C1047c9(cVar);
        for (Integer num : this.f1641a.keySet()) {
            C1021b b = cVar.mo12593b().clone();
            int c = m2980c(p4Var, (C1245p) this.f1641a.get(num), c9Var);
            if (c == 2 || c == -1) {
                cVar.mo12598f(b);
            }
        }
        for (Integer num2 : this.f1642b.keySet()) {
            m2980c(p4Var, (C1245p) this.f1642b.get(num2), c9Var);
        }
    }
}
