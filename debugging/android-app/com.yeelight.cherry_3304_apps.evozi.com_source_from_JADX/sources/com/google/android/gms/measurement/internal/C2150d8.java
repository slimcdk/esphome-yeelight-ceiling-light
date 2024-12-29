package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
final class C2150d8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1992sc f4065a;

    /* renamed from: b */
    private final /* synthetic */ String f4066b;

    /* renamed from: c */
    private final /* synthetic */ String f4067c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f4068d;

    C2150d8(AppMeasurementDynamiteService appMeasurementDynamiteService, C1992sc scVar, String str, String str2) {
        this.f4068d = appMeasurementDynamiteService;
        this.f4065a = scVar;
        this.f4066b = str;
        this.f4067c = str2;
    }

    public final void run() {
        this.f4068d.f3892a.mo12422Q().mo12909H(this.f4065a, this.f4066b, this.f4067c);
    }
}
