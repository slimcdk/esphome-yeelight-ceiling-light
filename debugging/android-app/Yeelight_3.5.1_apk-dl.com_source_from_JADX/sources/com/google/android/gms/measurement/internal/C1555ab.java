package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.ab */
final class C1555ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1119h1 f1936a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f1937b;

    C1555ab(AppMeasurementDynamiteService appMeasurementDynamiteService, C1119h1 h1Var) {
        this.f1937b = appMeasurementDynamiteService;
        this.f1936a = h1Var;
    }

    public final void run() {
        this.f1937b.f1908a.mo14382N().mo14647D(this.f1936a, this.f1937b.f1908a.mo14394n());
    }
}
