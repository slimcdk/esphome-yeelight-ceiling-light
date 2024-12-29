package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
final class C1578c8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f1984a;

    /* renamed from: b */
    final /* synthetic */ C1552a8 f1985b;

    /* renamed from: c */
    final /* synthetic */ C1552a8 f1986c;

    /* renamed from: d */
    final /* synthetic */ long f1987d;

    /* renamed from: e */
    final /* synthetic */ C1669j8 f1988e;

    C1578c8(C1669j8 j8Var, Bundle bundle, C1552a8 a8Var, C1552a8 a8Var2, long j) {
        this.f1988e = j8Var;
        this.f1984a = bundle;
        this.f1985b = a8Var;
        this.f1986c = a8Var2;
        this.f1987d = j;
    }

    public final void run() {
        C1669j8.m4326x(this.f1988e, this.f1984a, this.f1985b, this.f1986c, this.f1987d);
    }
}
