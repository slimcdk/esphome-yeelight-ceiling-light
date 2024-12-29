package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.qa */
final class C1272qa implements ListIterator {

    /* renamed from: a */
    final ListIterator f1557a;

    /* renamed from: b */
    final /* synthetic */ int f1558b;

    /* renamed from: c */
    final /* synthetic */ C1304sa f1559c;

    C1272qa(C1304sa saVar, int i) {
        this.f1559c = saVar;
        this.f1558b = i;
        this.f1557a = saVar.f1602a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f1557a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f1557a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f1557a.next();
    }

    public final int nextIndex() {
        return this.f1557a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f1557a.previous();
    }

    public final int previousIndex() {
        return this.f1557a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
