package com.google.p107ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.ar.core.n0 */
final class C2654n0 implements ServiceConnection {

    /* renamed from: a */
    private final /* synthetic */ C2652m0 f5132a;

    C2654n0(C2652m0 m0Var) {
        this.f5132a = m0Var;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5132a.m8189f(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5132a.m8200q();
    }
}
