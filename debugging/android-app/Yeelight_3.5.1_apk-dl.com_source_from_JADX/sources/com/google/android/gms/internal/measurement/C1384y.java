package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C1384y {

    /* renamed from: a */
    final Map f1721a = new HashMap();

    /* renamed from: b */
    final C1182l0 f1722b = new C1182l0();

    public C1384y() {
        mo13503b(new C1354w());
        mo13503b(new C1399z());
        mo13503b(new C1006a0());
        mo13503b(new C1070e0());
        mo13503b(new C1150j0());
        mo13503b(new C1166k0());
        mo13503b(new C1198m0());
    }

    /* renamed from: a */
    public final C1261q mo13502a(C1250p4 p4Var, C1261q qVar) {
        C1267q5.m2510c(p4Var);
        if (!(qVar instanceof C1277r)) {
            return qVar;
        }
        C1277r rVar = (C1277r) qVar;
        ArrayList f = rVar.mo13119f();
        String a = rVar.mo13117a();
        return (this.f1721a.containsKey(a) ? (C1369x) this.f1721a.get(a) : this.f1722b).mo12511a(a, p4Var, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13503b(C1369x xVar) {
        for (zzbl zzb : xVar.f1702a) {
            this.f1721a.put(zzb.zzb().toString(), xVar);
        }
    }
}
