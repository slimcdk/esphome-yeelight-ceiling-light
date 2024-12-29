package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
final class C1563b6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzlo f1949a;

    /* renamed from: b */
    final /* synthetic */ zzq f1950b;

    /* renamed from: c */
    final /* synthetic */ C1628g6 f1951c;

    C1563b6(C1628g6 g6Var, zzlo zzlo, zzq zzq) {
        this.f1951c = g6Var;
        this.f1949a = zzlo;
        this.f1950b = zzq;
    }

    public final void run() {
        this.f1951c.f2110a.mo14474e();
        if (this.f1949a.mo14714V() == null) {
            this.f1951c.f2110a.mo14493t(this.f1949a, this.f1950b);
        } else {
            this.f1951c.f2110a.mo14457A(this.f1949a, this.f1950b);
        }
    }
}
