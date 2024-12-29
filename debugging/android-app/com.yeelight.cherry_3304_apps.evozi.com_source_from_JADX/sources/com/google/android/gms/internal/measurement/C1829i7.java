package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
final class C1829i7 implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f3480a = this.f3482c.f3505a.listIterator(this.f3481b);

    /* renamed from: b */
    private final /* synthetic */ int f3481b;

    /* renamed from: c */
    private final /* synthetic */ C1845j7 f3482c;

    C1829i7(C1845j7 j7Var, int i) {
        this.f3482c = j7Var;
        this.f3481b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3480a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f3480a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f3480a.next();
    }

    public final int nextIndex() {
        return this.f3480a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f3480a.previous();
    }

    public final int previousIndex() {
        return this.f3480a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
