package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
final class C2398z7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzm f4760a;

    /* renamed from: b */
    private final /* synthetic */ C2310r7 f4761b;

    C2398z7(C2310r7 r7Var, zzm zzm) {
        this.f4761b = r7Var;
        this.f4760a = zzm;
    }

    public final void run() {
        C2273o3 k0 = this.f4761b.f4563d;
        if (k0 == null) {
            this.f4761b.mo12427b().mo13096F().mo13130a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            k0.mo12665I0(this.f4760a);
            this.f4761b.mo12574t().mo12937K();
            this.f4761b.mo12913M(k0, (AbstractSafeParcelable) null, this.f4760a);
            this.f4761b.m7501e0();
        } catch (RemoteException e) {
            this.f4761b.mo12427b().mo13096F().mo13131b("Failed to send app launch to the service", e);
        }
    }
}
