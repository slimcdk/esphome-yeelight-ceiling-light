package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
final /* synthetic */ class C2322s8 implements Runnable {

    /* renamed from: a */
    private final C2289p8 f4588a;

    /* renamed from: b */
    private final int f4589b;

    /* renamed from: c */
    private final C2361w3 f4590c;

    /* renamed from: d */
    private final Intent f4591d;

    C2322s8(C2289p8 p8Var, int i, C2361w3 w3Var, Intent intent) {
        this.f4588a = p8Var;
        this.f4589b = i;
        this.f4590c = w3Var;
        this.f4591d = intent;
    }

    public final void run() {
        this.f4588a.mo12877d(this.f4589b, this.f4590c, this.f4591d);
    }
}
