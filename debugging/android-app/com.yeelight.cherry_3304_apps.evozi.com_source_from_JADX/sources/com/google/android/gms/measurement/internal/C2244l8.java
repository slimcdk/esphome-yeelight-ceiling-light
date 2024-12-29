package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
final class C2244l8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f4313a;

    /* renamed from: b */
    private final /* synthetic */ C2222j8 f4314b;

    C2244l8(C2222j8 j8Var, ComponentName componentName) {
        this.f4314b = j8Var;
        this.f4313a = componentName;
    }

    public final void run() {
        this.f4314b.f4251c.m7497E(this.f4313a);
    }
}
