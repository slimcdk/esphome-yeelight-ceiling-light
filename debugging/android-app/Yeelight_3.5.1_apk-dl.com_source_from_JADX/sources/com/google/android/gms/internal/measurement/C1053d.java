package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
final class C1053d implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f1274a;

    /* renamed from: b */
    final /* synthetic */ Iterator f1275b;

    C1053d(C1085f fVar, Iterator it, Iterator it2) {
        this.f1274a = it;
        this.f1275b = it2;
    }

    public final boolean hasNext() {
        if (this.f1274a.hasNext()) {
            return true;
        }
        return this.f1275b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f1274a.hasNext()) {
            return new C1324u(((Integer) this.f1274a.next()).toString());
        }
        if (this.f1275b.hasNext()) {
            return new C1324u((String) this.f1275b.next());
        }
        throw new NoSuchElementException();
    }
}
