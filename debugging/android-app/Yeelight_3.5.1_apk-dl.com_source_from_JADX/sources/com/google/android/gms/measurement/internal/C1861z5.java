package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
final class C1861z5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzaw f2822a;

    /* renamed from: b */
    final /* synthetic */ String f2823b;

    /* renamed from: c */
    final /* synthetic */ C1628g6 f2824c;

    C1861z5(C1628g6 g6Var, zzaw zzaw, String str) {
        this.f2824c = g6Var;
        this.f2822a = zzaw;
        this.f2823b = str;
    }

    public final void run() {
        this.f2824c.f2110a.mo14474e();
        this.f2824c.f2110a.mo14482j(this.f2822a, this.f2823b);
    }
}
