package com.google.p017ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.ar.core.g0 */
final class C2032g0 implements ServiceConnection {

    /* renamed from: a */
    private final /* synthetic */ C2030f0 f3180a;

    C2032g0(C2030f0 f0Var) {
        this.f3180a = f0Var;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3180a.m5126f(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3180a.m5137q();
    }
}
