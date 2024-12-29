package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C1643h8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1552a8 f2145a;

    /* renamed from: b */
    final /* synthetic */ long f2146b;

    /* renamed from: c */
    final /* synthetic */ C1669j8 f2147c;

    C1643h8(C1669j8 j8Var, C1552a8 a8Var, long j) {
        this.f2147c = j8Var;
        this.f2145a = a8Var;
        this.f2146b = j;
    }

    public final void run() {
        this.f2147c.m4322q(this.f2145a, false, this.f2146b);
        C1669j8 j8Var = this.f2147c;
        j8Var.f2194e = null;
        j8Var.f2143a.mo14380L().mo14286u((C1552a8) null);
    }
}
