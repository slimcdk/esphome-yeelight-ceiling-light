package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i8 */
public final class C1142i8 extends C1149j {

    /* renamed from: c */
    private final C1037c f1375c;

    public C1142i8(C1037c cVar) {
        super("internal.eventLogger");
        this.f1375c = cVar;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        C1267q5.m2515h(this.f1380a, 3, list);
        String d = p4Var.mo13062b((C1261q) list.get(0)).mo12762d();
        long a = (long) C1267q5.m2508a(p4Var.mo13062b((C1261q) list.get(1)).mo12761c().doubleValue());
        C1261q b = p4Var.mo13062b((C1261q) list.get(2));
        this.f1375c.mo12597e(d, a, b instanceof C1213n ? C1267q5.m2514g((C1213n) b) : new HashMap());
        return C1261q.f1536D;
    }
}
