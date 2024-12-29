package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
final class C2342u6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4646a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4647b;

    C2342u6(C2196h6 h6Var, AtomicReference atomicReference) {
        this.f4647b = h6Var;
        this.f4646a = atomicReference;
    }

    public final void run() {
        synchronized (this.f4646a) {
            try {
                this.f4646a.set(Integer.valueOf(this.f4647b.mo13112m().mo12476u(this.f4647b.mo12571q().mo12982C(), C2302r.f4483N)));
                this.f4646a.notify();
            } catch (Throwable th) {
                this.f4646a.notify();
                throw th;
            }
        }
    }
}
