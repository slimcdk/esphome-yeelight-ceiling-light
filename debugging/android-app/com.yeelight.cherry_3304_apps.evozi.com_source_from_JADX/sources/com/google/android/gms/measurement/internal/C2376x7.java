package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
final class C2376x7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4717a;

    /* renamed from: b */
    private final /* synthetic */ zzm f4718b;

    /* renamed from: c */
    private final /* synthetic */ C2310r7 f4719c;

    C2376x7(C2310r7 r7Var, AtomicReference atomicReference, zzm zzm) {
        this.f4719c = r7Var;
        this.f4717a = atomicReference;
        this.f4718b = zzm;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f4717a) {
            try {
                C2273o3 k0 = this.f4719c.f4563d;
                if (k0 == null) {
                    this.f4719c.mo12427b().mo13096F().mo13130a("Failed to get app instance id");
                    this.f4717a.notify();
                    return;
                }
                this.f4717a.set(k0.mo12677u0(this.f4718b));
                String str = (String) this.f4717a.get();
                if (str != null) {
                    this.f4719c.mo12570p().mo12706O(str);
                    this.f4719c.mo13111l().f4229l.mo12870b(str);
                }
                this.f4719c.m7501e0();
                atomicReference = this.f4717a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f4719c.mo12427b().mo13096F().mo13131b("Failed to get app instance id", e);
                    atomicReference = this.f4717a;
                } catch (Throwable th) {
                    this.f4717a.notify();
                    throw th;
                }
            }
        }
    }
}
