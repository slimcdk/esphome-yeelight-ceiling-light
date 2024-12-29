package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
final class C1828w8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2751a;

    /* renamed from: b */
    final /* synthetic */ C1670j9 f2752b;

    C1828w8(C1670j9 j9Var, zzq zzq) {
        this.f2752b = j9Var;
        this.f2751a = zzq;
    }

    public final void run() {
        C1670j9 j9Var = this.f2752b;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to send consent settings to service");
            return;
        }
        try {
            C0917i.m1419j(this.f2751a);
            H.mo14199k0(this.f2751a);
            this.f2752b.m4342E();
        } catch (RemoteException e) {
            this.f2752b.f2143a.mo14228b().mo14035r().mo14694b("Failed to send consent settings to the service", e);
        }
    }
}
