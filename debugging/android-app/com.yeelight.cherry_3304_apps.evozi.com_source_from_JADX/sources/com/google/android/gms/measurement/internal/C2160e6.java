package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
final class C2160e6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1992sc f4083a;

    /* renamed from: b */
    private final /* synthetic */ zzaq f4084b;

    /* renamed from: c */
    private final /* synthetic */ String f4085c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f4086d;

    C2160e6(AppMeasurementDynamiteService appMeasurementDynamiteService, C1992sc scVar, zzaq zzaq, String str) {
        this.f4086d = appMeasurementDynamiteService;
        this.f4083a = scVar;
        this.f4084b = zzaq;
        this.f4085c = str;
    }

    public final void run() {
        this.f4086d.f3892a.mo12422Q().mo12908G(this.f4083a, this.f4084b, this.f4085c);
    }
}
