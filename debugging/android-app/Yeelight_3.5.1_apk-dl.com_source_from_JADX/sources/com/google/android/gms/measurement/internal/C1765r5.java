package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
final class C1765r5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f2582a;

    /* renamed from: b */
    final /* synthetic */ String f2583b;

    /* renamed from: c */
    final /* synthetic */ String f2584c;

    /* renamed from: d */
    final /* synthetic */ C1628g6 f2585d;

    C1765r5(C1628g6 g6Var, String str, String str2, String str3) {
        this.f2585d = g6Var;
        this.f2582a = str;
        this.f2583b = str2;
        this.f2584c = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f2585d.f2110a.mo14474e();
        return this.f2585d.f2110a.mo14466V().mo14333d0(this.f2582a, this.f2583b, this.f2584c);
    }
}
