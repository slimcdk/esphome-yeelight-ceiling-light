package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
final class C1850y6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2790a;

    /* renamed from: b */
    final /* synthetic */ String f2791b;

    /* renamed from: c */
    final /* synthetic */ long f2792c;

    /* renamed from: d */
    final /* synthetic */ Bundle f2793d;

    /* renamed from: e */
    final /* synthetic */ boolean f2794e;

    /* renamed from: f */
    final /* synthetic */ boolean f2795f;

    /* renamed from: g */
    final /* synthetic */ boolean f2796g;

    /* renamed from: h */
    final /* synthetic */ String f2797h;

    /* renamed from: i */
    final /* synthetic */ C1791t7 f2798i;

    C1850y6(C1791t7 t7Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f2798i = t7Var;
        this.f2790a = str;
        this.f2791b = str2;
        this.f2792c = j;
        this.f2793d = bundle;
        this.f2794e = z;
        this.f2795f = z2;
        this.f2796g = z3;
        this.f2797h = str3;
    }

    public final void run() {
        this.f2798i.mo14572x(this.f2790a, this.f2791b, this.f2792c, this.f2793d, this.f2794e, this.f2795f, this.f2796g, this.f2797h);
    }
}
