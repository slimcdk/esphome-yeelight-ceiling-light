package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
final class C1551a7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f1921a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f1922b;

    C1551a7(C1791t7 t7Var, long j) {
        this.f1922b = t7Var;
        this.f1921a = j;
    }

    public final void run() {
        this.f1922b.mo14535A(this.f1921a, true);
        this.f1922b.f2143a.mo14380L().mo14275S(new AtomicReference());
    }
}
