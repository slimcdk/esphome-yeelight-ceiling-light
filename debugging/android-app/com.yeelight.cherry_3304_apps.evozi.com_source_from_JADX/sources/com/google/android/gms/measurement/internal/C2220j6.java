package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
final /* synthetic */ class C2220j6 implements Runnable {

    /* renamed from: a */
    private final C2196h6 f4248a;

    C2220j6(C2196h6 h6Var) {
        this.f4248a = h6Var;
    }

    public final void run() {
        C2196h6 h6Var = this.f4248a;
        h6Var.mo12567h();
        if (h6Var.mo13111l().f4242y.mo12796b()) {
            h6Var.mo12427b().mo13103N().mo13130a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = h6Var.mo13111l().f4243z.mo12849a();
        h6Var.mo13111l().f4243z.mo12850b(1 + a);
        if (a >= 5) {
            h6Var.mo12427b().mo13099J().mo13130a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h6Var.mo13111l().f4242y.mo12795a(true);
            return;
        }
        h6Var.f4689a.mo12442v();
    }
}
