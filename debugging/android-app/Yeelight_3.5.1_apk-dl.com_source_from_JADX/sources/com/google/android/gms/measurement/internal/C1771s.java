package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C1771s implements Iterator {

    /* renamed from: a */
    final Iterator f2633a;

    /* renamed from: b */
    final /* synthetic */ zzau f2634b;

    C1771s(zzau zzau) {
        this.f2634b = zzau;
        this.f2633a = zzau.f2854a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f2633a.next();
    }

    public final boolean hasNext() {
        return this.f2633a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
