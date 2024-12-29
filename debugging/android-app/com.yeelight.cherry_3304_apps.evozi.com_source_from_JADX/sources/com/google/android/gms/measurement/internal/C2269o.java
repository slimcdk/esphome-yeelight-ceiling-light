package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.o */
final class C2269o implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f4392a = this.f4393b.f4765a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzal f4393b;

    C2269o(zzal zzal) {
        this.f4393b = zzal;
    }

    public final boolean hasNext() {
        return this.f4392a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f4392a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
