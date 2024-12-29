package com.google.p107ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.r0 */
final class C2661r0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f5146a;

    /* renamed from: b */
    final /* synthetic */ C2656o0 f5147b;

    /* renamed from: c */
    final /* synthetic */ C2652m0 f5148c;

    C2661r0(C2652m0 m0Var, Activity activity, C2656o0 o0Var) {
        this.f5148c = m0Var;
        this.f5146a = activity;
        this.f5147b = o0Var;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f5148c.f5125d.mo8387o0(this.f5146a.getApplicationInfo().packageName, Collections.singletonList(C2652m0.m8195l()), new Bundle(), new C2667u0(this, atomicBoolean));
            new Handler().postDelayed(new C2665t0(this, atomicBoolean), 3000);
        } catch (RemoteException unused) {
            C2652m0.m8197n(this.f5146a, this.f5147b);
        }
    }
}
