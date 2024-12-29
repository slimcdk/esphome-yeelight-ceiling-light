package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
final class C1877l7 implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f3549a = this.f3550b.f3505a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C1845j7 f3550b;

    C1877l7(C1845j7 j7Var) {
        this.f3550b = j7Var;
    }

    public final boolean hasNext() {
        return this.f3549a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f3549a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
