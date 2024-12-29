package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
final class C2267n8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2222j8 f4389a;

    C2267n8(C2222j8 j8Var) {
        this.f4389a = j8Var;
    }

    public final void run() {
        C2310r7 r7Var = this.f4389a.f4251c;
        Context c = this.f4389a.f4251c.mo12428c();
        this.f4389a.f4251c.mo12414I();
        r7Var.m7497E(new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
