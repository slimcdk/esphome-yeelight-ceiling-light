package com.google.android.gms.internal.wearable;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.wearable.k2 */
class C1467k2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f1813a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C1452h2> f1814b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f1815c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f1816d;

    /* renamed from: e */
    private volatile C1462j2 f1817e;

    /* renamed from: f */
    private Map<K, V> f1818f = Collections.emptyMap();

    /* synthetic */ C1467k2(int i, C1432d2 d2Var) {
        this.f1813a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final V m3598k(int i) {
        m3600m();
        V value = this.f1814b.remove(i).getValue();
        if (!this.f1815c.isEmpty()) {
            Iterator it = m3601n().entrySet().iterator();
            List<C1452h2> list = this.f1814b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1452h2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: l */
    private final int m3599l(K k) {
        int size = this.f1814b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f1814b.get(size).mo13644a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f1814b.get(i2).mo13644a());
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
    /* renamed from: m */
    public final void m3600m() {
        if (this.f1816d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    private final SortedMap<K, V> m3601n() {
        m3600m();
        if (this.f1815c.isEmpty() && !(this.f1815c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1815c = treeMap;
            this.f1818f = treeMap.descendingMap();
        }
        return (SortedMap) this.f1815c;
    }

    /* renamed from: a */
    public void mo13599a() {
        if (!this.f1816d) {
            this.f1815c = this.f1815c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1815c);
            this.f1818f = this.f1818f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1818f);
            this.f1816d = true;
        }
    }

    /* renamed from: b */
    public final boolean mo13687b() {
        return this.f1816d;
    }

    /* renamed from: c */
    public final int mo13688c() {
        return this.f1814b.size();
    }

    public final void clear() {
        m3600m();
        if (!this.f1814b.isEmpty()) {
            this.f1814b.clear();
        }
        if (!this.f1815c.isEmpty()) {
            this.f1815c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3599l(comparable) >= 0 || this.f1815c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo13691d(int i) {
        return this.f1814b.get(i);
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo13692e() {
        return this.f1815c.isEmpty() ? C1447g2.m3537a() : this.f1815c.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f1817e == null) {
            this.f1817e = new C1462j2(this, (C1432d2) null);
        }
        return this.f1817e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1467k2)) {
            return super.equals(obj);
        }
        C1467k2 k2Var = (C1467k2) obj;
        int size = size();
        if (size != k2Var.size()) {
            return false;
        }
        int c = mo13688c();
        if (c != k2Var.mo13688c()) {
            return entrySet().equals(k2Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo13691d(i).equals(k2Var.mo13691d(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f1815c.equals(k2Var.f1815c);
        }
        return true;
    }

    /* renamed from: f */
    public final V put(K k, V v) {
        m3600m();
        int l = m3599l(k);
        if (l >= 0) {
            return this.f1814b.get(l).setValue(v);
        }
        m3600m();
        if (this.f1814b.isEmpty() && !(this.f1814b instanceof ArrayList)) {
            this.f1814b = new ArrayList(this.f1813a);
        }
        int i = -(l + 1);
        if (i >= this.f1813a) {
            return m3601n().put(k, v);
        }
        int size = this.f1814b.size();
        int i2 = this.f1813a;
        if (size == i2) {
            C1452h2 remove = this.f1814b.remove(i2 - 1);
            m3601n().put(remove.mo13644a(), remove.getValue());
        }
        this.f1814b.add(i, new C1452h2(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m3599l(comparable);
        return l >= 0 ? this.f1814b.get(l).getValue() : this.f1815c.get(comparable);
    }

    public final int hashCode() {
        int c = mo13688c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f1814b.get(i2).hashCode();
        }
        return this.f1815c.size() > 0 ? i + this.f1815c.hashCode() : i;
    }

    public final V remove(Object obj) {
        m3600m();
        Comparable comparable = (Comparable) obj;
        int l = m3599l(comparable);
        if (l >= 0) {
            return m3598k(l);
        }
        if (this.f1815c.isEmpty()) {
            return null;
        }
        return this.f1815c.remove(comparable);
    }

    public final int size() {
        return this.f1814b.size() + this.f1815c.size();
    }
}
