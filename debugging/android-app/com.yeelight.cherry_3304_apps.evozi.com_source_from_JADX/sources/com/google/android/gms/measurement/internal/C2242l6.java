package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
final class C2242l6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f4302a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4303b;

    C2242l6(C2196h6 h6Var, long j) {
        this.f4303b = h6Var;
        this.f4302a = j;
    }

    public final void run() {
        this.f4303b.mo13111l().f4234q.mo12850b(this.f4302a);
        this.f4303b.mo12427b().mo13103N().mo13131b("Session timeout duration set", Long.valueOf(this.f4302a));
    }
}
