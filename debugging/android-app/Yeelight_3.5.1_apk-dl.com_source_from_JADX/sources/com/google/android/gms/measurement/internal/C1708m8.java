package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
final class C1708m8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2309a;

    /* renamed from: b */
    final /* synthetic */ C1670j9 f2310b;

    C1708m8(C1670j9 j9Var, zzq zzq) {
        this.f2310b = j9Var;
        this.f2309a = zzq;
    }

    public final void run() {
        C1670j9 j9Var = this.f2310b;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C0917i.m1419j(this.f2309a);
            H.mo14205r0(this.f2309a);
        } catch (RemoteException e) {
            this.f2310b.f2143a.mo14228b().mo14035r().mo14694b("Failed to reset data on the service: remote exception", e);
        }
        this.f2310b.m4342E();
    }
}
