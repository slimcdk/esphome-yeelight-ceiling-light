package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
final class C1825w5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2744a;

    /* renamed from: b */
    final /* synthetic */ C1628g6 f2745b;

    C1825w5(C1628g6 g6Var, zzq zzq) {
        this.f2745b = g6Var;
        this.f2744a = zzq;
    }

    public final void run() {
        this.f2745b.f2110a.mo14474e();
        C1770ra T = this.f2745b.f2110a;
        zzq zzq = this.f2744a;
        T.mo14227a().mo14009h();
        T.mo14476g();
        C0917i.m1415f(zzq.f2866a);
        T.mo14462R(zzq);
    }
}
