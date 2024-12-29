package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
final class C1720n8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2376a;

    /* renamed from: b */
    final /* synthetic */ zzq f2377b;

    /* renamed from: c */
    final /* synthetic */ C1670j9 f2378c;

    C1720n8(C1670j9 j9Var, AtomicReference atomicReference, zzq zzq) {
        this.f2378c = j9Var;
        this.f2376a = atomicReference;
        this.f2377b = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f2376a) {
            try {
                if (!this.f2378c.f2143a.mo14375F().mo14447q().mo14221i(zzah.ANALYTICS_STORAGE)) {
                    this.f2378c.f2143a.mo14228b().mo14041x().mo14693a("Analytics storage consent denied; will not get app instance id");
                    this.f2378c.f2143a.mo14377I().mo14538D((String) null);
                    this.f2378c.f2143a.mo14375F().f2565g.mo14427b((String) null);
                    this.f2376a.set((Object) null);
                    this.f2376a.notify();
                    return;
                }
                C1670j9 j9Var = this.f2378c;
                C1763r3 H = j9Var.f2204d;
                if (H == null) {
                    j9Var.f2143a.mo14228b().mo14035r().mo14693a("Failed to get app instance id");
                    this.f2376a.notify();
                    return;
                }
                C0917i.m1419j(this.f2377b);
                this.f2376a.set(H.mo14207t(this.f2377b));
                String str = (String) this.f2376a.get();
                if (str != null) {
                    this.f2378c.f2143a.mo14377I().mo14538D(str);
                    this.f2378c.f2143a.mo14375F().f2565g.mo14427b(str);
                }
                this.f2378c.m4342E();
                atomicReference = this.f2376a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f2378c.f2143a.mo14228b().mo14035r().mo14694b("Failed to get app instance id", e);
                    atomicReference = this.f2376a;
                } catch (Throwable th) {
                    this.f2376a.notify();
                    throw th;
                }
            }
        }
    }
}
