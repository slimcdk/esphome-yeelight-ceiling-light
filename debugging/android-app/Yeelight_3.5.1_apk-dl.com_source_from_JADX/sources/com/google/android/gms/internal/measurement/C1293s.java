package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
final class C1293s implements Iterator {

    /* renamed from: a */
    private int f1579a = 0;

    /* renamed from: b */
    final /* synthetic */ C1324u f1580b;

    C1293s(C1324u uVar) {
        this.f1580b = uVar;
    }

    public final boolean hasNext() {
        return this.f1579a < this.f1580b.f1656a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f1579a;
        if (i < this.f1580b.f1656a.length()) {
            this.f1579a = i + 1;
            return new C1324u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
