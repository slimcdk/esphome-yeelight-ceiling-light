package com.google.p017ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.k0 */
final class C2040k0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f3192a;

    /* renamed from: b */
    final /* synthetic */ C2034h0 f3193b;

    /* renamed from: c */
    final /* synthetic */ C2030f0 f3194c;

    C2040k0(C2030f0 f0Var, Activity activity, C2034h0 h0Var) {
        this.f3194c = f0Var;
        this.f3192a = activity;
        this.f3193b = h0Var;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f3194c.f3175d.mo23624C0(this.f3192a.getApplicationInfo().packageName, Collections.singletonList(C2030f0.m5132l()), new Bundle(), new C2046n0(this, atomicBoolean));
            new Handler().postDelayed(new C2044m0(this, atomicBoolean), 3000);
        } catch (RemoteException unused) {
            C2030f0.m5134n(this.f3192a, this.f3193b);
        }
    }
}
