package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
final class C1592d9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f2043a;

    /* renamed from: b */
    final /* synthetic */ C1657i9 f2044b;

    C1592d9(C1657i9 i9Var, ComponentName componentName) {
        this.f2044b = i9Var;
        this.f2043a = componentName;
    }

    public final void run() {
        C1670j9.m4349M(this.f2044b.f2168c, this.f2043a);
    }
}
