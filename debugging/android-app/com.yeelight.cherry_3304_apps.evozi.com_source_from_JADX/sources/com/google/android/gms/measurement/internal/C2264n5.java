package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
final class C2264n5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaq f4383a;

    /* renamed from: b */
    private final /* synthetic */ String f4384b;

    /* renamed from: c */
    private final /* synthetic */ C2183g5 f4385c;

    C2264n5(C2183g5 g5Var, zzaq zzaq, String str) {
        this.f4385c = g5Var;
        this.f4383a = zzaq;
        this.f4384b = str;
    }

    public final void run() {
        this.f4385c.f4129a.mo12827d0();
        this.f4385c.f4129a.mo12833p(this.f4383a, this.f4384b);
    }
}
