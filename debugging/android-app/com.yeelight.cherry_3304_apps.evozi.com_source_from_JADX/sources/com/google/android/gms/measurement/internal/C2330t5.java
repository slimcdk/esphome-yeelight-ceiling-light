package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t5 */
final class C2330t5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzy f4614a;

    /* renamed from: b */
    private final /* synthetic */ zzm f4615b;

    /* renamed from: c */
    private final /* synthetic */ C2183g5 f4616c;

    C2330t5(C2183g5 g5Var, zzy zzy, zzm zzm) {
        this.f4616c = g5Var;
        this.f4614a = zzy;
        this.f4615b = zzm;
    }

    public final void run() {
        this.f4616c.f4129a.mo12827d0();
        if (this.f4614a.f4801c.mo13160Q() == null) {
            this.f4616c.f4129a.mo12814P(this.f4614a, this.f4615b);
        } else {
            this.f4616c.f4129a.mo12838x(this.f4614a, this.f4615b);
        }
    }
}
