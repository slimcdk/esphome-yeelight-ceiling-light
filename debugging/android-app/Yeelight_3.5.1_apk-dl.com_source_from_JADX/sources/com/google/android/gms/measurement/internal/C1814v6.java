package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
public final /* synthetic */ class C1814v6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1791t7 f2720a;

    public /* synthetic */ C1814v6(C1791t7 t7Var) {
        this.f2720a = t7Var;
    }

    public final void run() {
        C1791t7 t7Var = this.f2720a;
        t7Var.mo14009h();
        if (!t7Var.f2143a.mo14375F().f2576r.mo14351b()) {
            long a = t7Var.f2143a.mo14375F().f2577s.mo14368a();
            t7Var.f2143a.mo14375F().f2577s.mo14369b(1 + a);
            t7Var.f2143a.mo14402z();
            if (a >= 5) {
                t7Var.f2143a.mo14228b().mo14040w().mo14693a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                t7Var.f2143a.mo14375F().f2576r.mo14350a(true);
                return;
            }
            t7Var.f2143a.mo14390j();
            return;
        }
        t7Var.f2143a.mo14228b().mo14034q().mo14693a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
