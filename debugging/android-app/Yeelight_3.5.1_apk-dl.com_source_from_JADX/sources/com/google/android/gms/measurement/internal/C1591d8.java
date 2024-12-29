package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
final class C1591d8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1552a8 f2038a;

    /* renamed from: b */
    final /* synthetic */ C1552a8 f2039b;

    /* renamed from: c */
    final /* synthetic */ long f2040c;

    /* renamed from: d */
    final /* synthetic */ boolean f2041d;

    /* renamed from: e */
    final /* synthetic */ C1669j8 f2042e;

    C1591d8(C1669j8 j8Var, C1552a8 a8Var, C1552a8 a8Var2, long j, boolean z) {
        this.f2042e = j8Var;
        this.f2038a = a8Var;
        this.f2039b = a8Var2;
        this.f2040c = j;
        this.f2041d = z;
    }

    public final void run() {
        this.f2042e.m4321p(this.f2038a, this.f2039b, this.f2040c, this.f2041d, (Bundle) null);
    }
}
