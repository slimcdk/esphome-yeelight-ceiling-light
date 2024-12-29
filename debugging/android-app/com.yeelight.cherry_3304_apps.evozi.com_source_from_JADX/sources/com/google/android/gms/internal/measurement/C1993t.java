package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.internal.measurement.C1728c;
import com.google.android.gms.measurement.internal.C2172f6;

/* renamed from: com.google.android.gms.internal.measurement.t */
final class C1993t extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ C2172f6 f3722e;

    /* renamed from: f */
    private final /* synthetic */ C1728c f3723f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1993t(C1728c cVar, C2172f6 f6Var) {
        super(cVar);
        this.f3723f = cVar;
        this.f3722e = f6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        for (int i = 0; i < this.f3723f.f3276d.size(); i++) {
            if (this.f3722e.equals(((Pair) this.f3723f.f3276d.get(i)).first)) {
                String unused = this.f3723f.f3273a;
                return;
            }
        }
        C1728c.C1730b bVar = new C1728c.C1730b(this.f3722e);
        this.f3723f.f3276d.add(new Pair(this.f3722e, bVar));
        this.f3723f.f3279g.registerOnMeasurementEventListener(bVar);
    }
}
