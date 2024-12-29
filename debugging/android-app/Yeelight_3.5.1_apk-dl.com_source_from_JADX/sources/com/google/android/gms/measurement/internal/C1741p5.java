package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
final class C1741p5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzac f2513a;

    /* renamed from: b */
    final /* synthetic */ zzq f2514b;

    /* renamed from: c */
    final /* synthetic */ C1628g6 f2515c;

    C1741p5(C1628g6 g6Var, zzac zzac, zzq zzq) {
        this.f2515c = g6Var;
        this.f2513a = zzac;
        this.f2514b = zzq;
    }

    public final void run() {
        this.f2515c.f2110a.mo14474e();
        if (this.f2513a.f2845c.mo14714V() == null) {
            this.f2515c.f2110a.mo14492s(this.f2513a, this.f2514b);
        } else {
            this.f2515c.f2110a.mo14498y(this.f2513a, this.f2514b);
        }
    }
}
