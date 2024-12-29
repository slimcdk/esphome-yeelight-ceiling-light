package com.google.p107ar.core;

import android.content.Context;
import android.os.RemoteException;
import com.google.p107ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.q0 */
final class C2660q0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f5143a;

    /* renamed from: b */
    final /* synthetic */ ArCoreApk.C2618a f5144b;

    /* renamed from: c */
    private final /* synthetic */ C2652m0 f5145c;

    C2660q0(C2652m0 m0Var, Context context, ArCoreApk.C2618a aVar) {
        this.f5145c = m0Var;
        this.f5143a = context;
        this.f5144b = aVar;
    }

    public final void run() {
        try {
            this.f5145c.f5125d.mo8386m(this.f5143a.getApplicationInfo().packageName, C2652m0.m8195l(), new C2658p0(this));
        } catch (RemoteException unused) {
            this.f5144b.mo14945a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
