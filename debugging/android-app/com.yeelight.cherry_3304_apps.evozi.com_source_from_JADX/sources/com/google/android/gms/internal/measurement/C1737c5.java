package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
final class C1737c5<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f3291a;

    public C1737c5(Iterator<Map.Entry<K, Object>> it) {
        this.f3291a = it;
    }

    public final boolean hasNext() {
        return this.f3291a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f3291a.next();
        return next.getValue() instanceof C2061x4 ? new C2093z4(next) : next;
    }

    public final void remove() {
        this.f3291a.remove();
    }
}
