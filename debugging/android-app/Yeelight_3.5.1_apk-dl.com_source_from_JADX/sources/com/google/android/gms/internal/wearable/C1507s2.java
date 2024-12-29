package com.google.android.gms.internal.wearable;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.wearable.s2 */
final class C1507s2 implements Iterator<String> {

    /* renamed from: a */
    final Iterator<String> f1855a;

    /* renamed from: b */
    final /* synthetic */ C1512t2 f1856b;

    C1507s2(C1512t2 t2Var) {
        this.f1856b = t2Var;
        this.f1855a = t2Var.f1861a.iterator();
    }

    public final boolean hasNext() {
        return this.f1855a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f1855a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
