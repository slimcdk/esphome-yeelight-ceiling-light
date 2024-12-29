package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
final class C1603e7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2055a;

    /* renamed from: b */
    final /* synthetic */ String f2056b;

    /* renamed from: c */
    final /* synthetic */ String f2057c;

    /* renamed from: d */
    final /* synthetic */ C1791t7 f2058d;

    C1603e7(C1791t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f2058d = t7Var;
        this.f2055a = atomicReference;
        this.f2056b = str2;
        this.f2057c = str3;
    }

    public final void run() {
        this.f2058d.f2143a.mo14380L().mo14277U(this.f2055a, (String) null, this.f2056b, this.f2057c);
    }
}
