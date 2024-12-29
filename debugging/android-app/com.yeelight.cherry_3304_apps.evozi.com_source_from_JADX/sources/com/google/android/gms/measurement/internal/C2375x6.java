package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
final class C2375x6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4715a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4716b;

    C2375x6(C2196h6 h6Var, AtomicReference atomicReference) {
        this.f4716b = h6Var;
        this.f4715a = atomicReference;
    }

    public final void run() {
        synchronized (this.f4715a) {
            try {
                this.f4715a.set(Double.valueOf(this.f4716b.mo13112m().mo12477v(this.f4716b.mo12571q().mo12982C(), C2302r.f4485O)));
                this.f4715a.notify();
            } catch (Throwable th) {
                this.f4715a.notify();
                throw th;
            }
        }
    }
}
