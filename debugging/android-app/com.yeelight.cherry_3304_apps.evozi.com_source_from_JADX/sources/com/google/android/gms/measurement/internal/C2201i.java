package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i */
final class C2201i implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2385y5 f4179a;

    /* renamed from: b */
    private final /* synthetic */ C2213j f4180b;

    C2201i(C2213j jVar, C2385y5 y5Var) {
        this.f4180b = jVar;
        this.f4179a = y5Var;
    }

    public final void run() {
        this.f4179a.mo12414I();
        if (C2176fa.m7021a()) {
            this.f4179a.mo12426a().mo13122y(this);
            return;
        }
        boolean d = this.f4180b.mo12752d();
        long unused = this.f4180b.f4210c = 0;
        if (d) {
            this.f4180b.mo12451b();
        }
    }
}
