package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
final class C1069e implements Iterator {

    /* renamed from: a */
    private int f1294a = 0;

    /* renamed from: b */
    final /* synthetic */ C1085f f1295b;

    C1069e(C1085f fVar) {
        this.f1295b = fVar;
    }

    public final boolean hasNext() {
        return this.f1294a < this.f1295b.mo12772r();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f1294a < this.f1295b.mo12772r()) {
            C1085f fVar = this.f1295b;
            int i = this.f1294a;
            this.f1294a = i + 1;
            return fVar.mo12773t(i);
        }
        int i2 = this.f1294a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
