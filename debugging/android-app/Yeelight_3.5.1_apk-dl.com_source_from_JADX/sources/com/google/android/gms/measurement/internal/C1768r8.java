package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
final class C1768r8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2596a;

    /* renamed from: b */
    final /* synthetic */ Bundle f2597b;

    /* renamed from: c */
    final /* synthetic */ C1670j9 f2598c;

    C1768r8(C1670j9 j9Var, zzq zzq, Bundle bundle) {
        this.f2598c = j9Var;
        this.f2596a = zzq;
        this.f2597b = bundle;
    }

    public final void run() {
        C1670j9 j9Var = this.f2598c;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to send default event parameters to service");
            return;
        }
        try {
            C0917i.m1419j(this.f2596a);
            H.mo14198k(this.f2597b, this.f2596a);
        } catch (RemoteException e) {
            this.f2598c.f2143a.mo14228b().mo14035r().mo14694b("Failed to send default event parameters to service", e);
        }
    }
}
