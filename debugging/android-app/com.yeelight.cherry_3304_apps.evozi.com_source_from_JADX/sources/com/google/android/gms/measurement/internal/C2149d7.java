package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C2149d7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1992sc f4063a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f4064b;

    C2149d7(AppMeasurementDynamiteService appMeasurementDynamiteService, C1992sc scVar) {
        this.f4064b = appMeasurementDynamiteService;
        this.f4063a = scVar;
    }

    public final void run() {
        this.f4064b.f3892a.mo12422Q().mo12907F(this.f4063a);
    }
}
