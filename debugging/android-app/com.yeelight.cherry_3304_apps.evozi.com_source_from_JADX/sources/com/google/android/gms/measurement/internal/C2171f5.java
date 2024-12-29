package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
final class C2171f5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f4116a;

    /* renamed from: b */
    private final /* synthetic */ C2183g5 f4117b;

    C2171f5(C2183g5 g5Var, zzm zzm) {
        this.f4117b = g5Var;
        this.f4116a = zzm;
    }

    public final void run() {
        this.f4117b.f4129a.mo12827d0();
        C2245l9 c = this.f4117b.f4129a;
        zzm zzm = this.f4116a;
        c.mo12426a().mo12567h();
        c.mo12825b0();
        C1609u.m4471g(zzm.f4777a);
        c.mo12816R(zzm);
    }
}
