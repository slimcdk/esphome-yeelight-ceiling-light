package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
final class C2331t6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4617a;

    /* renamed from: b */
    private final /* synthetic */ String f4618b;

    /* renamed from: c */
    private final /* synthetic */ String f4619c;

    /* renamed from: d */
    private final /* synthetic */ String f4620d;

    /* renamed from: e */
    private final /* synthetic */ C2196h6 f4621e;

    C2331t6(C2196h6 h6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f4621e = h6Var;
        this.f4617a = atomicReference;
        this.f4618b = str;
        this.f4619c = str2;
        this.f4620d = str3;
    }

    public final void run() {
        this.f4621e.f4689a.mo12422Q().mo12918T(this.f4617a, this.f4618b, this.f4619c, this.f4620d);
    }
}
