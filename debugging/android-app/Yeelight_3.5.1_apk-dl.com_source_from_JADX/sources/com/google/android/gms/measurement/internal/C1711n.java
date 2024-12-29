package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n */
final class C1711n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1667j6 f2315a;

    /* renamed from: b */
    final /* synthetic */ C1723o f2316b;

    C1711n(C1723o oVar, C1667j6 j6Var) {
        this.f2316b = oVar;
        this.f2315a = j6Var;
    }

    public final void run() {
        this.f2315a.mo14230d();
        if (C1569c.m4075a()) {
            this.f2315a.mo14227a().mo14310z(this);
            return;
        }
        boolean e = this.f2316b.mo14408e();
        this.f2316b.f2386c = 0;
        if (e) {
            this.f2316b.mo14029c();
        }
    }
}
