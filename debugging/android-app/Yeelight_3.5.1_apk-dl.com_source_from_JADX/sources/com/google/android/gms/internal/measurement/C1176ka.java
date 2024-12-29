package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ka */
class C1176ka extends AbstractMap {

    /* renamed from: a */
    private final int f1393a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List f1394b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map f1395c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f1396d;

    /* renamed from: e */
    private volatile C1144ia f1397e;

    /* renamed from: f */
    private Map f1398f = Collections.emptyMap();

    /* synthetic */ C1176ka(int i, C1160ja jaVar) {
        this.f1393a = i;
    }

    /* renamed from: k */
    private final int m2173k(Comparable comparable) {
        int size = this.f1394b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C1080ea) this.f1394b.get(size)).mo12746a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C1080ea) this.f1394b.get(i2)).mo12746a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final Object m2174l(int i) {
        m2176n();
        Object value = ((C1080ea) this.f1394b.remove(i)).getValue();
        if (!this.f1395c.isEmpty()) {
            Iterator it = m2175m().entrySet().iterator();
            List list = this.f1394b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1080ea(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m2175m() {
        m2176n();
        if (this.f1395c.isEmpty() && !(this.f1395c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1395c = treeMap;
            this.f1398f = treeMap.descendingMap();
        }
        return (SortedMap) this.f1395c;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m2176n() {
        if (this.f1396d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo12921a() {
        if (!this.f1396d) {
            this.f1395c = this.f1395c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1395c);
            this.f1398f = this.f1398f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1398f);
            this.f1396d = true;
        }
    }

    /* renamed from: b */
    public final int mo12922b() {
        return this.f1394b.size();
    }

    /* renamed from: c */
    public final Iterable mo12923c() {
        return this.f1395c.isEmpty() ? C1064da.m1825a() : this.f1395c.entrySet();
    }

    public final void clear() {
        m2176n();
        if (!this.f1394b.isEmpty()) {
            this.f1394b.clear();
        }
        if (!this.f1395c.isEmpty()) {
            this.f1395c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m2173k(comparable) >= 0 || this.f1395c.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m2176n();
        int k = m2173k(comparable);
        if (k >= 0) {
            return ((C1080ea) this.f1394b.get(k)).setValue(obj);
        }
        m2176n();
        if (this.f1394b.isEmpty() && !(this.f1394b instanceof ArrayList)) {
            this.f1394b = new ArrayList(this.f1393a);
        }
        int i = -(k + 1);
        if (i >= this.f1393a) {
            return m2175m().put(comparable, obj);
        }
        int size = this.f1394b.size();
        int i2 = this.f1393a;
        if (size == i2) {
            C1080ea eaVar = (C1080ea) this.f1394b.remove(i2 - 1);
            m2175m().put(eaVar.mo12746a(), eaVar.getValue());
        }
        this.f1394b.add(i, new C1080ea(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f1397e == null) {
            this.f1397e = new C1144ia(this, (C1128ha) null);
        }
        return this.f1397e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176ka)) {
            return super.equals(obj);
        }
        C1176ka kaVar = (C1176ka) obj;
        int size = size();
        if (size != kaVar.size()) {
            return false;
        }
        int b = mo12922b();
        if (b != kaVar.mo12922b()) {
            return entrySet().equals(kaVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo12929g(i).equals(kaVar.mo12929g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f1395c.equals(kaVar.f1395c);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo12929g(int i) {
        return (Map.Entry) this.f1394b.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m2173k(comparable);
        return k >= 0 ? ((C1080ea) this.f1394b.get(k)).getValue() : this.f1395c.get(comparable);
    }

    public final int hashCode() {
        int b = mo12922b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C1080ea) this.f1394b.get(i2)).hashCode();
        }
        return this.f1395c.size() > 0 ? i + this.f1395c.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo12932j() {
        return this.f1396d;
    }

    public final Object remove(Object obj) {
        m2176n();
        Comparable comparable = (Comparable) obj;
        int k = m2173k(comparable);
        if (k >= 0) {
            return m2174l(k);
        }
        if (this.f1395c.isEmpty()) {
            return null;
        }
        return this.f1395c.remove(comparable);
    }

    public final int size() {
        return this.f1394b.size() + this.f1395c.size();
    }
}
