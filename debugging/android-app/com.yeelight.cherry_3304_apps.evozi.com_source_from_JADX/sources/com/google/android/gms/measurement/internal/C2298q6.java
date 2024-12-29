package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
final class C2298q6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4452a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4453b;

    C2298q6(C2196h6 h6Var, AtomicReference atomicReference) {
        this.f4453b = h6Var;
        this.f4452a = atomicReference;
    }

    public final void run() {
        synchronized (this.f4452a) {
            try {
                this.f4452a.set(this.f4453b.mo13112m().mo12464K(this.f4453b.mo12571q().mo12982C()));
                this.f4452a.notify();
            } catch (Throwable th) {
                this.f4452a.notify();
                throw th;
            }
        }
    }
}
