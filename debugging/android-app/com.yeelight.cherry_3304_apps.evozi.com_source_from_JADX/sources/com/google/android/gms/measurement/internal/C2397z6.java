package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C2397z6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f4758a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4759b;

    C2397z6(C2196h6 h6Var, boolean z) {
        this.f4759b = h6Var;
        this.f4758a = z;
    }

    public final void run() {
        boolean p = this.f4759b.f4689a.mo12436p();
        boolean o = this.f4759b.f4689a.mo12435o();
        this.f4759b.f4689a.mo12434n(this.f4758a);
        if (o == this.f4758a) {
            this.f4759b.f4689a.mo12427b().mo13104O().mo13131b("Default data collection state already set to", Boolean.valueOf(this.f4758a));
        }
        if (this.f4759b.f4689a.mo12436p() == p || this.f4759b.f4689a.mo12436p() != this.f4759b.f4689a.mo12435o()) {
            this.f4759b.f4689a.mo12427b().mo13101L().mo13132c("Default data collection is different than actual status", Boolean.valueOf(this.f4758a), Boolean.valueOf(p));
        }
        this.f4759b.m7075l0();
    }
}
