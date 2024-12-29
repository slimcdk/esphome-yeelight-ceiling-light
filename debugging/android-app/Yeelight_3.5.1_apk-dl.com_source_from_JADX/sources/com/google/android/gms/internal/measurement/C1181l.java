package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
final class C1181l implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f1402a;

    C1181l(Iterator it) {
        this.f1402a = it;
    }

    public final boolean hasNext() {
        return this.f1402a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C1324u((String) this.f1402a.next());
    }
}
