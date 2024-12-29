package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
final class C1816v8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2726a;

    /* renamed from: b */
    final /* synthetic */ C1670j9 f2727b;

    C1816v8(C1670j9 j9Var, zzq zzq) {
        this.f2727b = j9Var;
        this.f2726a = zzq;
    }

    public final void run() {
        C1670j9 j9Var = this.f2727b;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C0917i.m1419j(this.f2726a);
            H.mo14197i(this.f2726a);
            this.f2727b.m4342E();
        } catch (RemoteException e) {
            this.f2727b.f2143a.mo14228b().mo14035r().mo14694b("Failed to send measurementEnabled to the service", e);
        }
    }
}
