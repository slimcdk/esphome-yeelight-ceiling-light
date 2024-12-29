package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
final class C1780s8 extends C1723o {

    /* renamed from: e */
    final /* synthetic */ C1670j9 f2663e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1780s8(C1670j9 j9Var, C1667j6 j6Var) {
        super(j6Var);
        this.f2663e = j9Var;
    }

    /* renamed from: c */
    public final void mo14029c() {
        C1670j9 j9Var = this.f2663e;
        j9Var.mo14009h();
        if (j9Var.mo14291z()) {
            j9Var.f2143a.mo14228b().mo14039v().mo14693a("Inactivity, disconnecting from the service");
            j9Var.mo14273Q();
        }
    }
}
