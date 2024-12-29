package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
final class C2353v6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f4666a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4667b;

    C2353v6(C2196h6 h6Var, AtomicReference atomicReference) {
        this.f4667b = h6Var;
        this.f4666a = atomicReference;
    }

    public final void run() {
        synchronized (this.f4666a) {
            try {
                this.f4666a.set(Long.valueOf(this.f4667b.mo13112m().mo12471p(this.f4667b.mo12571q().mo12982C(), C2302r.f4481M)));
                this.f4666a.notify();
            } catch (Throwable th) {
                this.f4666a.notify();
                throw th;
            }
        }
    }
}
