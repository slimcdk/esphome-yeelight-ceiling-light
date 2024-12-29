package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
final class C2367w9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1992sc f4699a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f4700b;

    C2367w9(AppMeasurementDynamiteService appMeasurementDynamiteService, C1992sc scVar) {
        this.f4700b = appMeasurementDynamiteService;
        this.f4699a = scVar;
    }

    public final void run() {
        this.f4700b.f3892a.mo12412G().mo12963S(this.f4699a, this.f4700b.f3892a.mo12435o());
    }
}
