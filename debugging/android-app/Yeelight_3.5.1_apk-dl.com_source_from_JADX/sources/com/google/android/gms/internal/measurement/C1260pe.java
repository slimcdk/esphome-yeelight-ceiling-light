package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.pe */
public final class C1260pe extends C1149j {

    /* renamed from: c */
    private final C1173k7 f1534c;

    /* renamed from: d */
    final Map f1535d = new HashMap();

    public C1260pe(C1173k7 k7Var) {
        super("require");
        this.f1534c = k7Var;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        C1261q qVar;
        C1267q5.m2515h("require", 1, list);
        String d = p4Var.mo13062b((C1261q) list.get(0)).mo12762d();
        if (this.f1535d.containsKey(d)) {
            return (C1261q) this.f1535d.get(d);
        }
        C1173k7 k7Var = this.f1534c;
        if (k7Var.f1392a.containsKey(d)) {
            try {
                qVar = (C1261q) ((Callable) k7Var.f1392a.get(d)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(d)));
            }
        } else {
            qVar = C1261q.f1536D;
        }
        if (qVar instanceof C1149j) {
            this.f1535d.put(d, (C1149j) qVar);
        }
        return qVar;
    }
}
