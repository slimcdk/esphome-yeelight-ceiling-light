package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* renamed from: com.google.android.gms.common.data.c */
public class C1524c<T> implements Iterator<T> {

    /* renamed from: a */
    protected final C1523b<T> f2893a;

    /* renamed from: b */
    protected int f2894b = -1;

    public C1524c(C1523b<T> bVar) {
        C1609u.m4475k(bVar);
        this.f2893a = bVar;
    }

    public boolean hasNext() {
        return this.f2894b < this.f2893a.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            C1523b<T> bVar = this.f2893a;
            int i = this.f2894b + 1;
            this.f2894b = i;
            return bVar.get(i);
        }
        int i2 = this.f2894b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
