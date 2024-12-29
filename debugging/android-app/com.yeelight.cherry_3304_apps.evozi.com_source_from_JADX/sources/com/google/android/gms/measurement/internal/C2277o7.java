package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
final class C2277o7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2255m7 f4407a;

    /* renamed from: b */
    private final /* synthetic */ C2255m7 f4408b;

    /* renamed from: c */
    private final /* synthetic */ long f4409c;

    /* renamed from: d */
    private final /* synthetic */ boolean f4410d;

    /* renamed from: e */
    private final /* synthetic */ C2243l7 f4411e;

    C2277o7(C2243l7 l7Var, C2255m7 m7Var, C2255m7 m7Var2, long j, boolean z) {
        this.f4411e = l7Var;
        this.f4407a = m7Var;
        this.f4408b = m7Var2;
        this.f4409c = j;
        this.f4410d = z;
    }

    public final void run() {
        this.f4411e.m7204N(this.f4407a, this.f4408b, this.f4409c, this.f4410d, (Bundle) null);
    }
}
