package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
final class C2320s6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4581a;

    /* renamed from: b */
    private final /* synthetic */ String f4582b;

    /* renamed from: c */
    private final /* synthetic */ String f4583c;

    /* renamed from: d */
    private final /* synthetic */ String f4584d;

    /* renamed from: e */
    private final /* synthetic */ boolean f4585e;

    /* renamed from: f */
    private final /* synthetic */ C2196h6 f4586f;

    C2320s6(C2196h6 h6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f4586f = h6Var;
        this.f4581a = atomicReference;
        this.f4582b = str;
        this.f4583c = str2;
        this.f4584d = str3;
        this.f4585e = z;
    }

    public final void run() {
        this.f4586f.f4689a.mo12422Q().mo12919U(this.f4581a, this.f4582b, this.f4583c, this.f4584d, this.f4585e);
    }
}
