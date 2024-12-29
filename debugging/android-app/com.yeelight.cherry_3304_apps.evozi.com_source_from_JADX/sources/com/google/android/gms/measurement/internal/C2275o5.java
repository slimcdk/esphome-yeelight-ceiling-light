package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
final class C2275o5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaq f4402a;

    /* renamed from: b */
    private final /* synthetic */ zzm f4403b;

    /* renamed from: c */
    private final /* synthetic */ C2183g5 f4404c;

    C2275o5(C2183g5 g5Var, zzaq zzaq, zzm zzm) {
        this.f4404c = g5Var;
        this.f4402a = zzaq;
        this.f4403b = zzm;
    }

    public final void run() {
        zzaq O0 = this.f4404c.mo12669O0(this.f4402a, this.f4403b);
        this.f4404c.f4129a.mo12827d0();
        this.f4404c.f4129a.mo12832o(O0, this.f4403b);
    }
}
