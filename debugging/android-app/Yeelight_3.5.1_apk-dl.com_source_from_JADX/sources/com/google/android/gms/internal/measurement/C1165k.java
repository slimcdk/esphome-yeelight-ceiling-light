package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final /* synthetic */ class C1165k {
    /* renamed from: a */
    public static C1261q m2126a(C1197m mVar, C1261q qVar, C1250p4 p4Var, List list) {
        if (mVar.mo12768j(qVar.mo12762d())) {
            C1261q n = mVar.mo12770n(qVar.mo12762d());
            if (n instanceof C1149j) {
                return ((C1149j) n).mo12586a(p4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo12762d()}));
        } else if ("hasOwnProperty".equals(qVar.mo12762d())) {
            C1267q5.m2515h("hasOwnProperty", 1, list);
            return mVar.mo12768j(p4Var.mo13062b((C1261q) list.get(0)).mo12762d()) ? C1261q.f1541I : C1261q.f1542J;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo12762d()}));
        }
    }

    /* renamed from: b */
    public static Iterator m2127b(Map map) {
        return new C1181l(map.keySet().iterator());
    }
}
