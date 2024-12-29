package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C2125b7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f3970a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f3971b;

    C2125b7(C2196h6 h6Var, long j) {
        this.f3971b = h6Var;
        this.f3970a = j;
    }

    public final void run() {
        this.f3971b.mo13111l().f4233p.mo12850b(this.f3970a);
        this.f3971b.mo12427b().mo13103N().mo13131b("Minimum session duration set", Long.valueOf(this.f3970a));
    }
}
