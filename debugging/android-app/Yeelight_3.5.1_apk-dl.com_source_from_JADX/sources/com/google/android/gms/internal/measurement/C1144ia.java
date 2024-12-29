package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ia */
final class C1144ia extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C1176ka f1376a;

    /* synthetic */ C1144ia(C1176ka kaVar, C1128ha haVar) {
        this.f1376a = kaVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f1376a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f1376a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f1376a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new C1112ga(this.f1376a, (C1096fa) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f1376a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f1376a.size();
    }
}
