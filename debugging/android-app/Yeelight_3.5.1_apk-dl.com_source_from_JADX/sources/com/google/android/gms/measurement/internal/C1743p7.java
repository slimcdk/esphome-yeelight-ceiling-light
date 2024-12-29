package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
final class C1743p7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f2516a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2517b;

    C1743p7(C1791t7 t7Var, boolean z) {
        this.f2517b = t7Var;
        this.f2516a = z;
    }

    public final void run() {
        boolean o = this.f2517b.f2143a.mo14395o();
        boolean n = this.f2517b.f2143a.mo14394n();
        this.f2517b.f2143a.mo14391k(this.f2516a);
        if (n == this.f2516a) {
            this.f2517b.f2143a.mo14228b().mo14039v().mo14694b("Default data collection state already set to", Boolean.valueOf(this.f2516a));
        }
        if (this.f2517b.f2143a.mo14395o() == o || this.f2517b.f2143a.mo14395o() != this.f2517b.f2143a.mo14394n()) {
            this.f2517b.f2143a.mo14228b().mo14041x().mo14695c("Default data collection is different than actual status", Boolean.valueOf(this.f2516a), Boolean.valueOf(o));
        }
        this.f2517b.m4696S();
    }
}
