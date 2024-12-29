package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992sc;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
final class C2163e9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1992sc f4094a;

    /* renamed from: b */
    private final /* synthetic */ String f4095b;

    /* renamed from: c */
    private final /* synthetic */ String f4096c;

    /* renamed from: d */
    private final /* synthetic */ boolean f4097d;

    /* renamed from: e */
    private final /* synthetic */ AppMeasurementDynamiteService f4098e;

    C2163e9(AppMeasurementDynamiteService appMeasurementDynamiteService, C1992sc scVar, String str, String str2, boolean z) {
        this.f4098e = appMeasurementDynamiteService;
        this.f4094a = scVar;
        this.f4095b = str;
        this.f4096c = str2;
        this.f4097d = z;
    }

    public final void run() {
        this.f4098e.f3892a.mo12422Q().mo12910J(this.f4094a, this.f4095b, this.f4096c, this.f4097d);
    }
}
