package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.h3 */
final class C1810h3 extends C1841j3 {

    /* renamed from: a */
    private int f3452a = 0;

    /* renamed from: b */
    private final int f3453b = this.f3454c.mo11638d();

    /* renamed from: c */
    private final /* synthetic */ C1779f3 f3454c;

    C1810h3(C1779f3 f3Var) {
        this.f3454c = f3Var;
    }

    /* renamed from: C */
    public final byte mo11704C() {
        int i = this.f3452a;
        if (i < this.f3453b) {
            this.f3452a = i + 1;
            return this.f3454c.mo11646k(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f3452a < this.f3453b;
    }
}
