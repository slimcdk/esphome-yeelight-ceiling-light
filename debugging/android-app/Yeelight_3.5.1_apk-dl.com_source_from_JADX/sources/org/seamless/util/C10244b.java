package org.seamless.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: org.seamless.util.b */
public abstract class C10244b<E> implements Iterator<E> {

    /* renamed from: a */
    final Iterator<E> f19033a;

    /* renamed from: b */
    int f19034b = 0;

    /* renamed from: c */
    boolean f19035c = false;

    public C10244b(Collection<E> collection) {
        this.f19033a = new CopyOnWriteArrayList(collection).iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40765a(int i);

    public boolean hasNext() {
        return this.f19033a.hasNext();
    }

    public E next() {
        this.f19035c = false;
        this.f19034b++;
        return this.f19033a.next();
    }

    public void remove() {
        int i = this.f19034b;
        if (i == 0) {
            throw new IllegalStateException("Call next() first");
        } else if (!this.f19035c) {
            mo40765a(i - 1);
            this.f19035c = true;
        } else {
            throw new IllegalStateException("Already removed current, call next()");
        }
    }
}
