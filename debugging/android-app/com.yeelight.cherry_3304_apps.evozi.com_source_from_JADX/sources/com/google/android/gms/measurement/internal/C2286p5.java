package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
final class C2286p5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzkn f4431a;

    /* renamed from: b */
    private final /* synthetic */ zzm f4432b;

    /* renamed from: c */
    private final /* synthetic */ C2183g5 f4433c;

    C2286p5(C2183g5 g5Var, zzkn zzkn, zzm zzm) {
        this.f4433c = g5Var;
        this.f4431a = zzkn;
        this.f4432b = zzm;
    }

    public final void run() {
        this.f4433c.f4129a.mo12827d0();
        if (this.f4431a.mo13160Q() == null) {
            this.f4433c.f4129a.mo12811M(this.f4431a, this.f4432b);
        } else {
            this.f4433c.f4129a.mo12835u(this.f4431a, this.f4432b);
        }
    }
}
