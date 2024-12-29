package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
final class C1309t implements Iterator {

    /* renamed from: a */
    private int f1643a = 0;

    /* renamed from: b */
    final /* synthetic */ C1324u f1644b;

    C1309t(C1324u uVar) {
        this.f1644b = uVar;
    }

    public final boolean hasNext() {
        return this.f1643a < this.f1644b.f1656a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f1643a;
        C1324u uVar = this.f1644b;
        if (i < uVar.f1656a.length()) {
            String j = uVar.f1656a;
            this.f1643a = i + 1;
            return new C1324u(String.valueOf(j.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
