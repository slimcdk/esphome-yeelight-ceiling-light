package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
class C2080y6 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C1971r6 f3843a;

    private C2080y6(C1971r6 r6Var) {
        this.f3843a = r6Var;
    }

    /* synthetic */ C2080y6(C1971r6 r6Var, C1955q6 q6Var) {
        this(r6Var);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f3843a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f3843a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3843a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C2095z6(this.f3843a, (C1955q6) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f3843a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f3843a.size();
    }
}
