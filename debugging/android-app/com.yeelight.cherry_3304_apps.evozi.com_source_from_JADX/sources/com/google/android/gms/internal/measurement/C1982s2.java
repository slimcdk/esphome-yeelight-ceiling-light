package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
final class C1982s2 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f3708a;

    public C1982s2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f3708a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C1982s2.class) {
            if (this == obj) {
                return true;
            }
            C1982s2 s2Var = (C1982s2) obj;
            return this.f3708a == s2Var.f3708a && get() == s2Var.get();
        }
    }

    public final int hashCode() {
        return this.f3708a;
    }
}
