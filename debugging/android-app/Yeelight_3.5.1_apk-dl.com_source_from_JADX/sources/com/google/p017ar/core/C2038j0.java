package com.google.p017ar.core;

import android.content.Context;
import android.os.RemoteException;
import com.google.p017ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.j0 */
final class C2038j0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f3188a;

    /* renamed from: b */
    final /* synthetic */ ArCoreApk.C2003a f3189b;

    /* renamed from: c */
    private final /* synthetic */ C2030f0 f3190c;

    C2038j0(C2030f0 f0Var, Context context, ArCoreApk.C2003a aVar) {
        this.f3190c = f0Var;
        this.f3188a = context;
        this.f3189b = aVar;
    }

    public final void run() {
        try {
            this.f3190c.f3175d.mo23625x0(this.f3188a.getApplicationInfo().packageName, C2030f0.m5132l(), new C2036i0(this));
        } catch (RemoteException unused) {
            this.f3189b.mo16395a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
