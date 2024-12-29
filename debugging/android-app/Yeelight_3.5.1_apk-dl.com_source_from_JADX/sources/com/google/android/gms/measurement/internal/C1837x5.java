package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
final class C1837x5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2762a;

    /* renamed from: b */
    final /* synthetic */ C1628g6 f2763b;

    C1837x5(C1628g6 g6Var, zzq zzq) {
        this.f2763b = g6Var;
        this.f2762a = zzq;
    }

    public final void run() {
        this.f2763b.f2110a.mo14474e();
        C1770ra T = this.f2763b.f2110a;
        zzq zzq = this.f2762a;
        T.mo14227a().mo14009h();
        T.mo14476g();
        C0917i.m1415f(zzq.f2866a);
        C1634h b = C1634h.m4273b(zzq.f2887v);
        C1634h U = T.mo14465U(zzq.f2866a);
        T.mo14228b().mo14039v().mo14695c("Setting consent, package, consent", zzq.f2866a, b);
        T.mo14499z(zzq.f2866a, b);
        if (b.mo14222k(U)) {
            T.mo14494u(zzq);
        }
    }
}
