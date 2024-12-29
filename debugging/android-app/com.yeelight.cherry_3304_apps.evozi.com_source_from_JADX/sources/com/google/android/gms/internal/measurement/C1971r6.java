package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.r6 */
class C1971r6<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f3697a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C2048w6> f3698b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f3699c;

    /* renamed from: d */
    private boolean f3700d;

    /* renamed from: e */
    private volatile C2080y6 f3701e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f3702f;

    /* renamed from: g */
    private volatile C1986s6 f3703g;

    private C1971r6(int i) {
        this.f3697a = i;
        this.f3698b = Collections.emptyList();
        this.f3699c = Collections.emptyMap();
        this.f3702f = Collections.emptyMap();
    }

    /* synthetic */ C1971r6(int i, C1955q6 q6Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m5892a(K k) {
        int size = this.f3698b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f3698b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f3698b.get(i2).getKey());
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

    /* renamed from: b */
    static <FieldDescriptorType extends C1811h4<FieldDescriptorType>> C1971r6<FieldDescriptorType, Object> m5893b(int i) {
        return new C1955q6(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final V m5897k(int i) {
        m5900p();
        V value = this.f3698b.remove(i).getValue();
        if (!this.f3699c.isEmpty()) {
            Iterator it = m5901q().entrySet().iterator();
            this.f3698b.add(new C2048w6(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m5900p() {
        if (this.f3700d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q */
    private final SortedMap<K, V> m5901q() {
        m5900p();
        if (this.f3699c.isEmpty() && !(this.f3699c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3699c = treeMap;
            this.f3702f = treeMap.descendingMap();
        }
        return (SortedMap) this.f3699c;
    }

    public void clear() {
        m5900p();
        if (!this.f3698b.isEmpty()) {
            this.f3698b.clear();
        }
        if (!this.f3699c.isEmpty()) {
            this.f3699c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m5892a(comparable) >= 0 || this.f3699c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        m5900p();
        int a = m5892a(k);
        if (a >= 0) {
            return this.f3698b.get(a).setValue(v);
        }
        m5900p();
        if (this.f3698b.isEmpty() && !(this.f3698b instanceof ArrayList)) {
            this.f3698b = new ArrayList(this.f3697a);
        }
        int i = -(a + 1);
        if (i >= this.f3697a) {
            return m5901q().put(k, v);
        }
        int size = this.f3698b.size();
        int i2 = this.f3697a;
        if (size == i2) {
            C2048w6 remove = this.f3698b.remove(i2 - 1);
            m5901q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f3698b.add(i, new C2048w6(this, k, v));
        return null;
    }

    /* renamed from: e */
    public void mo11961e() {
        if (!this.f3700d) {
            this.f3699c = this.f3699c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3699c);
            this.f3702f = this.f3702f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3702f);
            this.f3700d = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3701e == null) {
            this.f3701e = new C2080y6(this, (C1955q6) null);
        }
        return this.f3701e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1971r6)) {
            return super.equals(obj);
        }
        C1971r6 r6Var = (C1971r6) obj;
        int size = size();
        if (size != r6Var.size()) {
            return false;
        }
        int j = mo11998j();
        if (j != r6Var.mo11998j()) {
            return entrySet().equals(r6Var.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!mo11995h(i).equals(r6Var.mo11995h(i))) {
                return false;
            }
        }
        if (j != size) {
            return this.f3699c.equals(r6Var.f3699c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m5892a(comparable);
        return a >= 0 ? this.f3698b.get(a).getValue() : this.f3699c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo11995h(int i) {
        return this.f3698b.get(i);
    }

    public int hashCode() {
        int j = mo11998j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += this.f3698b.get(i2).hashCode();
        }
        return this.f3699c.size() > 0 ? i + this.f3699c.hashCode() : i;
    }

    /* renamed from: i */
    public final boolean mo11997i() {
        return this.f3700d;
    }

    /* renamed from: j */
    public final int mo11998j() {
        return this.f3698b.size();
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> mo11999m() {
        return this.f3699c.isEmpty() ? C2033v6.m6230a() : this.f3699c.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Set<Map.Entry<K, V>> mo12000o() {
        if (this.f3703g == null) {
            this.f3703g = new C1986s6(this, (C1955q6) null);
        }
        return this.f3703g;
    }

    public V remove(Object obj) {
        m5900p();
        Comparable comparable = (Comparable) obj;
        int a = m5892a(comparable);
        if (a >= 0) {
            return m5897k(a);
        }
        if (this.f3699c.isEmpty()) {
            return null;
        }
        return this.f3699c.remove(comparable);
    }

    public int size() {
        return this.f3698b.size() + this.f3699c.size();
    }
}
