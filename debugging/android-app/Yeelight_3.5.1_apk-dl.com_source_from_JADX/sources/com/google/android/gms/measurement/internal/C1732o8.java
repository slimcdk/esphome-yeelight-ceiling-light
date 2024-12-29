package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1119h1;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
final class C1732o8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2490a;

    /* renamed from: b */
    final /* synthetic */ C1119h1 f2491b;

    /* renamed from: c */
    final /* synthetic */ C1670j9 f2492c;

    C1732o8(C1670j9 j9Var, zzq zzq, C1119h1 h1Var) {
        this.f2492c = j9Var;
        this.f2490a = zzq;
        this.f2491b = h1Var;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f2492c.f2143a.mo14375F().mo14447q().mo14221i(zzah.ANALYTICS_STORAGE)) {
                this.f2492c.f2143a.mo14228b().mo14041x().mo14693a("Analytics storage consent denied; will not get app instance id");
                this.f2492c.f2143a.mo14377I().mo14538D((String) null);
                this.f2492c.f2143a.mo14375F().f2565g.mo14427b((String) null);
            } else {
                C1670j9 j9Var = this.f2492c;
                C1763r3 H = j9Var.f2204d;
                if (H == null) {
                    j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to get app instance id");
                } else {
                    C0917i.m1419j(this.f2490a);
                    str = H.mo14207t(this.f2490a);
                    if (str != null) {
                        this.f2492c.f2143a.mo14377I().mo14538D(str);
                        this.f2492c.f2143a.mo14375F().f2565g.mo14427b(str);
                    }
                    this.f2492c.m4342E();
                }
            }
        } catch (RemoteException e) {
            this.f2492c.f2143a.mo14228b().mo14035r().mo14694b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f2492c.f2143a.mo14382N().mo14653J(this.f2491b, (String) null);
            throw th;
        }
        this.f2492c.f2143a.mo14382N().mo14653J(this.f2491b, str);
    }
}
