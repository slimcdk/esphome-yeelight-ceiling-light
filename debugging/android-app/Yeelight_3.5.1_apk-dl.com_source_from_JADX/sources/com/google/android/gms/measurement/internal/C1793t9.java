package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
public final /* synthetic */ class C1793t9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1805u9 f2697a;

    public /* synthetic */ C1793t9(C1805u9 u9Var) {
        this.f2697a = u9Var;
    }

    public final void run() {
        C1805u9 u9Var = this.f2697a;
        C1817v9 v9Var = u9Var.f2713c;
        long j = u9Var.f2711a;
        long j2 = u9Var.f2712b;
        v9Var.f2729b.mo14009h();
        v9Var.f2729b.f2143a.mo14228b().mo14034q().mo14693a("Application going to the background");
        v9Var.f2729b.f2143a.mo14375F().f2575q.mo14350a(true);
        Bundle bundle = new Bundle();
        if (!v9Var.f2729b.f2143a.mo14402z().mo14165D()) {
            v9Var.f2729b.f2837e.mo14632b(j2);
            v9Var.f2729b.f2837e.mo14634d(false, false, j2);
        }
        v9Var.f2729b.f2143a.mo14377I().mo14571w("auto", "_ab", j, bundle);
    }
}
