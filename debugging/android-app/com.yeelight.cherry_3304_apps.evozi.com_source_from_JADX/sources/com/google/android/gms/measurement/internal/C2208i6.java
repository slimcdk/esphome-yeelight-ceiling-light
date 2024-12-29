package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
final class C2208i6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4193a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4194b;

    C2208i6(C2196h6 h6Var, AtomicReference atomicReference) {
        this.f4194b = h6Var;
        this.f4193a = atomicReference;
    }

    public final void run() {
        synchronized (this.f4193a) {
            try {
                this.f4193a.set(Boolean.valueOf(this.f4194b.mo13112m().mo12462H(this.f4194b.mo12571q().mo12982C())));
                this.f4193a.notify();
            } catch (Throwable th) {
                this.f4193a.notify();
                throw th;
            }
        }
    }
}
