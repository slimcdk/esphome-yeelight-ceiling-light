package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
final class C2162e8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f4092a;

    /* renamed from: b */
    private final /* synthetic */ C2310r7 f4093b;

    C2162e8(C2310r7 r7Var, zzm zzm) {
        this.f4093b = r7Var;
        this.f4092a = zzm;
    }

    public final void run() {
        C2273o3 k0 = this.f4093b.f4563d;
        if (k0 == null) {
            this.f4093b.mo12427b().mo13096F().mo13130a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            k0.mo12676k0(this.f4092a);
            this.f4093b.m7501e0();
        } catch (RemoteException e) {
            this.f4093b.mo12427b().mo13096F().mo13131b("Failed to send measurementEnabled to the service", e);
        }
    }
}
