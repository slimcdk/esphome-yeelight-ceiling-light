package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C1629g7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2113a;

    /* renamed from: b */
    final /* synthetic */ String f2114b;

    /* renamed from: c */
    final /* synthetic */ String f2115c;

    /* renamed from: d */
    final /* synthetic */ boolean f2116d;

    /* renamed from: e */
    final /* synthetic */ C1791t7 f2117e;

    C1629g7(C1791t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f2117e = t7Var;
        this.f2113a = atomicReference;
        this.f2114b = str2;
        this.f2115c = str3;
        this.f2116d = z;
    }

    public final void run() {
        this.f2117e.f2143a.mo14380L().mo14279W(this.f2113a, (String) null, this.f2114b, this.f2115c, this.f2116d);
    }
}
