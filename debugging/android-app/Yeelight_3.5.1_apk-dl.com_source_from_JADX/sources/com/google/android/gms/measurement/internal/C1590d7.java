package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C1590d7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1119h1 f2036a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f2037b;

    C1590d7(AppMeasurementDynamiteService appMeasurementDynamiteService, C1119h1 h1Var) {
        this.f2037b = appMeasurementDynamiteService;
        this.f2036a = h1Var;
    }

    public final void run() {
        this.f2037b.f1908a.mo14380L().mo14274R(this.f2036a);
    }
}
