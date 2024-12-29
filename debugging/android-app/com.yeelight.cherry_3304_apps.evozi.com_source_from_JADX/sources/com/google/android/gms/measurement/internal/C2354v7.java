package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
final class C2354v7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f4668a;

    /* renamed from: b */
    private final /* synthetic */ C2310r7 f4669b;

    C2354v7(C2310r7 r7Var, zzm zzm) {
        this.f4669b = r7Var;
        this.f4668a = zzm;
    }

    public final void run() {
        C2273o3 k0 = this.f4669b.f4563d;
        if (k0 == null) {
            this.f4669b.mo12427b().mo13096F().mo13130a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            k0.mo12666K(this.f4668a);
        } catch (RemoteException e) {
            this.f4669b.mo12427b().mo13096F().mo13131b("Failed to reset data on the service: remote exception", e);
        }
        this.f4669b.m7501e0();
    }
}
