package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
final class C2387y7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2255m7 f4736a;

    /* renamed from: b */
    private final /* synthetic */ C2310r7 f4737b;

    C2387y7(C2310r7 r7Var, C2255m7 m7Var) {
        this.f4737b = r7Var;
        this.f4736a = m7Var;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C2273o3 k0 = this.f4737b.f4563d;
        if (k0 == null) {
            this.f4737b.mo12427b().mo13096F().mo13130a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f4736a == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f4737b.mo12428c().getPackageName();
            } else {
                j = this.f4736a.f4369c;
                str = this.f4736a.f4367a;
                str2 = this.f4736a.f4368b;
                packageName = this.f4737b.mo12428c().getPackageName();
            }
            k0.mo12672X(j, str, str2, packageName);
            this.f4737b.m7501e0();
        } catch (RemoteException e) {
            this.f4737b.mo12427b().mo13096F().mo13131b("Failed to send current screen to the service", e);
        }
    }
}
