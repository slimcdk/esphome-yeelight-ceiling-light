package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.za */
final class C1866za implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1119h1 f2839a;

    /* renamed from: b */
    final /* synthetic */ String f2840b;

    /* renamed from: c */
    final /* synthetic */ String f2841c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f2842d;

    C1866za(AppMeasurementDynamiteService appMeasurementDynamiteService, C1119h1 h1Var, String str, String str2) {
        this.f2842d = appMeasurementDynamiteService;
        this.f2839a = h1Var;
        this.f2840b = str;
        this.f2841c = str2;
    }

    public final void run() {
        this.f2842d.f1908a.mo14380L().mo14276T(this.f2839a, this.f2840b, this.f2841c);
    }
}
