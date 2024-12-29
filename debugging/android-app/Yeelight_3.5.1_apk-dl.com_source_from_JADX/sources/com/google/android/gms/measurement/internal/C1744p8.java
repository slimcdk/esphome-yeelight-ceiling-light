package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
final class C1744p8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2518a;

    /* renamed from: b */
    final /* synthetic */ C1670j9 f2519b;

    C1744p8(C1670j9 j9Var, zzq zzq) {
        this.f2519b = j9Var;
        this.f2518a = zzq;
    }

    public final void run() {
        C1670j9 j9Var = this.f2519b;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C0917i.m1419j(this.f2518a);
            H.mo14192V(this.f2518a);
            this.f2519b.f2143a.mo14372C().mo14598t();
            this.f2519b.mo14283r(H, (AbstractSafeParcelable) null, this.f2518a);
            this.f2519b.m4342E();
        } catch (RemoteException e) {
            this.f2519b.f2143a.mo14228b().mo14035r().mo14694b("Failed to send app launch to the service", e);
        }
    }
}
