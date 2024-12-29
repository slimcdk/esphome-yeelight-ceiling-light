package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
final class C1801u5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f2704a;

    /* renamed from: b */
    final /* synthetic */ String f2705b;

    /* renamed from: c */
    final /* synthetic */ String f2706c;

    /* renamed from: d */
    final /* synthetic */ C1628g6 f2707d;

    C1801u5(C1628g6 g6Var, String str, String str2, String str3) {
        this.f2707d = g6Var;
        this.f2704a = str;
        this.f2705b = str2;
        this.f2706c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f2707d.f2110a.mo14474e();
        return this.f2707d.f2110a.mo14466V().mo14330a0(this.f2704a, this.f2705b, this.f2706c);
    }
}
