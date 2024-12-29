package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
final class C1756q8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1552a8 f2541a;

    /* renamed from: b */
    final /* synthetic */ C1670j9 f2542b;

    C1756q8(C1670j9 j9Var, C1552a8 a8Var) {
        this.f2542b = j9Var;
        this.f2541a = a8Var;
    }

    public final void run() {
        C1670j9 j9Var = this.f2542b;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to send current screen to service");
            return;
        }
        try {
            C1552a8 a8Var = this.f2541a;
            if (a8Var == null) {
                H.mo14194b0(0, (String) null, (String) null, j9Var.f2143a.mo14231f().getPackageName());
            } else {
                H.mo14194b0(a8Var.f1925c, a8Var.f1923a, a8Var.f1924b, j9Var.f2143a.mo14231f().getPackageName());
            }
            this.f2542b.m4342E();
        } catch (RemoteException e) {
            this.f2542b.f2143a.mo14228b().mo14035r().mo14694b("Failed to send current screen to the service", e);
        }
    }
}
