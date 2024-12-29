package com.google.android.gms.internal.wearable;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.wearable.q2 */
final class C1497q2 implements ListIterator<String> {

    /* renamed from: a */
    final ListIterator<String> f1832a;

    /* renamed from: b */
    final /* synthetic */ int f1833b;

    /* renamed from: c */
    final /* synthetic */ C1512t2 f1834c;

    C1497q2(C1512t2 t2Var, int i) {
        this.f1834c = t2Var;
        this.f1833b = i;
        this.f1832a = t2Var.f1861a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f1832a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f1832a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f1832a.next();
    }

    public final int nextIndex() {
        return this.f1832a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f1832a.previous();
    }

    public final int previousIndex() {
        return this.f1832a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
