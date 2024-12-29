package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
final class C1631g9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1657i9 f2120a;

    C1631g9(C1657i9 i9Var) {
        this.f2120a = i9Var;
    }

    public final void run() {
        C1670j9 j9Var = this.f2120a.f2168c;
        Context f = j9Var.f2143a.mo14231f();
        this.f2120a.f2168c.f2143a.mo14230d();
        C1670j9.m4349M(j9Var, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
