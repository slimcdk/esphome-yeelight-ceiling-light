package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
final /* synthetic */ class C2399z8 implements Runnable {

    /* renamed from: a */
    private final C2115a9 f4762a;

    C2399z8(C2115a9 a9Var) {
        this.f4762a = a9Var;
    }

    public final void run() {
        C2115a9 a9Var = this.f4762a;
        C2377x8 x8Var = a9Var.f3950c;
        long j = a9Var.f3948a;
        long j2 = a9Var.f3949b;
        x8Var.f4721b.mo12567h();
        x8Var.f4721b.mo12427b().mo13103N().mo13130a("Application going to the background");
        if (x8Var.f4721b.mo13112m().mo12474s(C2302r.f4466E0)) {
            x8Var.f4721b.mo13111l().f4241x.mo12795a(true);
        }
        if (!x8Var.f4721b.mo13112m().mo12465L().booleanValue()) {
            x8Var.f4721b.f4697e.mo12561f(j2);
            x8Var.f4721b.mo13115E(false, false, j2);
        }
        x8Var.f4721b.mo12570p().mo12707P("auto", "_ab", j, new Bundle());
    }
}
