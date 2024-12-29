package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
final class C1777s5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f2655a;

    /* renamed from: b */
    final /* synthetic */ String f2656b;

    /* renamed from: c */
    final /* synthetic */ String f2657c;

    /* renamed from: d */
    final /* synthetic */ C1628g6 f2658d;

    C1777s5(C1628g6 g6Var, String str, String str2, String str3) {
        this.f2658d = g6Var;
        this.f2655a = str;
        this.f2656b = str2;
        this.f2657c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f2658d.f2110a.mo14474e();
        return this.f2658d.f2110a.mo14466V().mo14333d0(this.f2655a, this.f2656b, this.f2657c);
    }
}
