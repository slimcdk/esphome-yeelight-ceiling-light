package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
final class C1605e9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1119h1 f2063a;

    /* renamed from: b */
    final /* synthetic */ String f2064b;

    /* renamed from: c */
    final /* synthetic */ String f2065c;

    /* renamed from: d */
    final /* synthetic */ boolean f2066d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f2067e;

    C1605e9(AppMeasurementDynamiteService appMeasurementDynamiteService, C1119h1 h1Var, String str, String str2, boolean z) {
        this.f2067e = appMeasurementDynamiteService;
        this.f2063a = h1Var;
        this.f2064b = str;
        this.f2065c = str2;
        this.f2066d = z;
    }

    public final void run() {
        this.f2067e.f1908a.mo14380L().mo14278V(this.f2063a, this.f2064b, this.f2065c, this.f2066d);
    }
}
