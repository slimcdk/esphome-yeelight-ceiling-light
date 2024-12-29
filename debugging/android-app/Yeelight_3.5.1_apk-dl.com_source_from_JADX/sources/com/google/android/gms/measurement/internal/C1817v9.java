package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
final class C1817v9 {

    /* renamed from: a */
    private C1805u9 f2728a;

    /* renamed from: b */
    final /* synthetic */ C1865z9 f2729b;

    C1817v9(C1865z9 z9Var) {
        this.f2729b = z9Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14612a(long j) {
        this.f2728a = new C1805u9(this, this.f2729b.f2143a.mo14229c().mo11029a(), j);
        this.f2729b.f2835c.postDelayed(this.f2728a, 2000);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14613b() {
        this.f2729b.mo14009h();
        C1805u9 u9Var = this.f2728a;
        if (u9Var != null) {
            this.f2729b.f2835c.removeCallbacks(u9Var);
        }
        this.f2729b.f2143a.mo14375F().f2575q.mo14350a(false);
    }
}
