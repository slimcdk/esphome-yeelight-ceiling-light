package com.google.android.gms.internal.wearable;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.j2 */
final class C1462j2 extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ C1467k2 f1804a;

    /* synthetic */ C1462j2(C1467k2 k2Var, C1432d2 d2Var) {
        this.f1804a = k2Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f1804a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f1804a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f1804a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C1457i2(this.f1804a, (C1432d2) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f1804a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f1804a.size();
    }
}
