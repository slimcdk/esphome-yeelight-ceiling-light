package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ra */
final class C1288ra implements Iterator {

    /* renamed from: a */
    final Iterator f1574a;

    /* renamed from: b */
    final /* synthetic */ C1304sa f1575b;

    C1288ra(C1304sa saVar) {
        this.f1575b = saVar;
        this.f1574a = saVar.f1602a.iterator();
    }

    public final boolean hasNext() {
        return this.f1574a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f1574a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
