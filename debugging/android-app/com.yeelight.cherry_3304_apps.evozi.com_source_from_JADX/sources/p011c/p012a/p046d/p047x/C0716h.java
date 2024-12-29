package p011c.p012a.p046d.p047x;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: c.a.d.x.h */
public final class C0716h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h */
    private static final Comparator<Comparable> f456h = new C0717a();

    /* renamed from: a */
    Comparator<? super K> f457a;

    /* renamed from: b */
    C0723e<K, V> f458b;

    /* renamed from: c */
    int f459c;

    /* renamed from: d */
    int f460d;

    /* renamed from: e */
    final C0723e<K, V> f461e;

    /* renamed from: f */
    private C0716h<K, V>.b f462f;

    /* renamed from: g */
    private C0716h<K, V>.c f463g;

    /* renamed from: c.a.d.x.h$a */
    static class C0717a implements Comparator<Comparable> {
        C0717a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: c.a.d.x.h$b */
    class C0718b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: c.a.d.x.h$b$a */
        class C0719a extends C0716h<K, V>.d<Map.Entry<K, V>> {
            C0719a(C0718b bVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo8830a();
            }
        }

        C0718b() {
        }

        public void clear() {
            C0716h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C0716h.this.mo8803c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0719a(this);
        }

        public boolean remove(Object obj) {
            C0723e c;
            if (!(obj instanceof Map.Entry) || (c = C0716h.this.mo8803c((Map.Entry) obj)) == null) {
                return false;
            }
            C0716h.this.mo8808f(c, true);
            return true;
        }

        public int size() {
            return C0716h.this.f459c;
        }
    }

    /* renamed from: c.a.d.x.h$c */
    final class C0720c extends AbstractSet<K> {

        /* renamed from: c.a.d.x.h$c$a */
        class C0721a extends C0716h<K, V>.d<K> {
            C0721a(C0720c cVar) {
                super();
            }

            public K next() {
                return mo8830a().f475f;
            }
        }

        C0720c() {
        }

        public void clear() {
            C0716h.this.clear();
        }

        public boolean contains(Object obj) {
            return C0716h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C0721a(this);
        }

        public boolean remove(Object obj) {
            return C0716h.this.mo8809g(obj) != null;
        }

        public int size() {
            return C0716h.this.f459c;
        }
    }

    /* renamed from: c.a.d.x.h$d */
    private abstract class C0722d<T> implements Iterator<T> {

        /* renamed from: a */
        C0723e<K, V> f466a;

        /* renamed from: b */
        C0723e<K, V> f467b = null;

        /* renamed from: c */
        int f468c;

        C0722d() {
            C0716h hVar = C0716h.this;
            this.f466a = hVar.f461e.f473d;
            this.f468c = hVar.f460d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C0723e<K, V> mo8830a() {
            C0723e<K, V> eVar = this.f466a;
            C0716h hVar = C0716h.this;
            if (eVar == hVar.f461e) {
                throw new NoSuchElementException();
            } else if (hVar.f460d == this.f468c) {
                this.f466a = eVar.f473d;
                this.f467b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f466a != C0716h.this.f461e;
        }

        public final void remove() {
            C0723e<K, V> eVar = this.f467b;
            if (eVar != null) {
                C0716h.this.mo8808f(eVar, true);
                this.f467b = null;
                this.f468c = C0716h.this.f460d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: c.a.d.x.h$e */
    static final class C0723e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C0723e<K, V> f470a;

        /* renamed from: b */
        C0723e<K, V> f471b;

        /* renamed from: c */
        C0723e<K, V> f472c;

        /* renamed from: d */
        C0723e<K, V> f473d;

        /* renamed from: e */
        C0723e<K, V> f474e;

        /* renamed from: f */
        final K f475f;

        /* renamed from: g */
        V f476g;

        /* renamed from: h */
        int f477h;

        C0723e() {
            this.f475f = null;
            this.f474e = this;
            this.f473d = this;
        }

        C0723e(C0723e<K, V> eVar, K k, C0723e<K, V> eVar2, C0723e<K, V> eVar3) {
            this.f470a = eVar;
            this.f475f = k;
            this.f477h = 1;
            this.f473d = eVar2;
            this.f474e = eVar3;
            eVar3.f473d = this;
            eVar2.f474e = this;
        }

        /* renamed from: a */
        public C0723e<K, V> mo8833a() {
            C0723e<K, V> eVar = this;
            for (C0723e<K, V> eVar2 = this.f471b; eVar2 != null; eVar2 = eVar2.f471b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C0723e<K, V> mo8834b() {
            C0723e<K, V> eVar = this;
            for (C0723e<K, V> eVar2 = this.f472c; eVar2 != null; eVar2 = eVar2.f472c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f475f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f476g
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p047x.C0716h.C0723e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f475f;
        }

        public V getValue() {
            return this.f476g;
        }

        public int hashCode() {
            K k = this.f475f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f476g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f476g;
            this.f476g = v;
            return v2;
        }

        public String toString() {
            return this.f475f + "=" + this.f476g;
        }
    }

    static {
        Class<C0716h> cls = C0716h.class;
    }

    public C0716h() {
        this(f456h);
    }

    public C0716h(Comparator<? super K> comparator) {
        this.f459c = 0;
        this.f460d = 0;
        this.f461e = new C0723e<>();
        this.f457a = comparator == null ? f456h : comparator;
    }

    /* renamed from: a */
    private boolean m762a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m763e(C0723e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C0723e<K, V> eVar2 = eVar.f471b;
            C0723e<K, V> eVar3 = eVar.f472c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f477h : 0;
            int i3 = eVar3 != null ? eVar3.f477h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C0723e<K, V> eVar4 = eVar3.f471b;
                C0723e<K, V> eVar5 = eVar3.f472c;
                int i5 = eVar5 != null ? eVar5.f477h : 0;
                if (eVar4 != null) {
                    i = eVar4.f477h;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m766j(eVar3);
                }
                m765i(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C0723e<K, V> eVar6 = eVar2.f471b;
                C0723e<K, V> eVar7 = eVar2.f472c;
                int i7 = eVar7 != null ? eVar7.f477h : 0;
                if (eVar6 != null) {
                    i = eVar6.f477h;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m765i(eVar2);
                }
                m766j(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f477h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f477h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f470a;
        }
    }

    /* renamed from: h */
    private void m764h(C0723e<K, V> eVar, C0723e<K, V> eVar2) {
        C0723e<K, V> eVar3 = eVar.f470a;
        eVar.f470a = null;
        if (eVar2 != null) {
            eVar2.f470a = eVar3;
        }
        if (eVar3 == null) {
            this.f458b = eVar2;
        } else if (eVar3.f471b == eVar) {
            eVar3.f471b = eVar2;
        } else {
            eVar3.f472c = eVar2;
        }
    }

    /* renamed from: i */
    private void m765i(C0723e<K, V> eVar) {
        C0723e<K, V> eVar2 = eVar.f471b;
        C0723e<K, V> eVar3 = eVar.f472c;
        C0723e<K, V> eVar4 = eVar3.f471b;
        C0723e<K, V> eVar5 = eVar3.f472c;
        eVar.f472c = eVar4;
        if (eVar4 != null) {
            eVar4.f470a = eVar;
        }
        m764h(eVar, eVar3);
        eVar3.f471b = eVar;
        eVar.f470a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f477h : 0, eVar4 != null ? eVar4.f477h : 0) + 1;
        eVar.f477h = max;
        if (eVar5 != null) {
            i = eVar5.f477h;
        }
        eVar3.f477h = Math.max(max, i) + 1;
    }

    /* renamed from: j */
    private void m766j(C0723e<K, V> eVar) {
        C0723e<K, V> eVar2 = eVar.f471b;
        C0723e<K, V> eVar3 = eVar.f472c;
        C0723e<K, V> eVar4 = eVar2.f471b;
        C0723e<K, V> eVar5 = eVar2.f472c;
        eVar.f471b = eVar5;
        if (eVar5 != null) {
            eVar5.f470a = eVar;
        }
        m764h(eVar, eVar2);
        eVar2.f472c = eVar;
        eVar.f470a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f477h : 0, eVar5 != null ? eVar5.f477h : 0) + 1;
        eVar.f477h = max;
        if (eVar4 != null) {
            i = eVar4.f477h;
        }
        eVar2.f477h = Math.max(max, i) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0723e<K, V> mo8802b(K k, boolean z) {
        int i;
        C0723e<K, V> eVar;
        Comparator<? super K> comparator = this.f457a;
        C0723e<K, V> eVar2 = this.f458b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f456h ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f475f;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C0723e<K, V> eVar3 = i < 0 ? eVar2.f471b : eVar2.f472c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C0723e<K, V> eVar4 = this.f461e;
        if (eVar2 != null) {
            eVar = new C0723e<>(eVar2, k, eVar4, eVar4.f474e);
            if (i < 0) {
                eVar2.f471b = eVar;
            } else {
                eVar2.f472c = eVar;
            }
            m763e(eVar2, true);
        } else if (comparator != f456h || (k instanceof Comparable)) {
            eVar = new C0723e<>(eVar2, k, eVar4, eVar4.f474e);
            this.f458b = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f459c++;
        this.f460d++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0723e<K, V> mo8803c(Map.Entry<?, ?> entry) {
        C0723e<K, V> d = mo8806d(entry.getKey());
        if (d != null && m762a(d.f476g, entry.getValue())) {
            return d;
        }
        return null;
    }

    public void clear() {
        this.f458b = null;
        this.f459c = 0;
        this.f460d++;
        C0723e<K, V> eVar = this.f461e;
        eVar.f474e = eVar;
        eVar.f473d = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo8806d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0723e<K, V> mo8806d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo8802b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C0716h<K, V>.b bVar = this.f462f;
        if (bVar != null) {
            return bVar;
        }
        C0716h<K, V>.b bVar2 = new C0718b();
        this.f462f = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8808f(C0723e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C0723e<K, V> eVar2 = eVar.f474e;
            eVar2.f473d = eVar.f473d;
            eVar.f473d.f474e = eVar2;
        }
        C0723e<K, V> eVar3 = eVar.f471b;
        C0723e<K, V> eVar4 = eVar.f472c;
        C0723e<K, V> eVar5 = eVar.f470a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m764h(eVar, eVar3);
                eVar.f471b = null;
            } else if (eVar4 != null) {
                m764h(eVar, eVar4);
                eVar.f472c = null;
            } else {
                m764h(eVar, (C0723e<K, V>) null);
            }
            m763e(eVar5, false);
            this.f459c--;
            this.f460d++;
            return;
        }
        C0723e<K, V> b = eVar3.f477h > eVar4.f477h ? eVar3.mo8834b() : eVar4.mo8833a();
        mo8808f(b, false);
        C0723e<K, V> eVar6 = eVar.f471b;
        if (eVar6 != null) {
            i = eVar6.f477h;
            b.f471b = eVar6;
            eVar6.f470a = b;
            eVar.f471b = null;
        } else {
            i = 0;
        }
        C0723e<K, V> eVar7 = eVar.f472c;
        if (eVar7 != null) {
            i2 = eVar7.f477h;
            b.f472c = eVar7;
            eVar7.f470a = b;
            eVar.f472c = null;
        }
        b.f477h = Math.max(i, i2) + 1;
        m764h(eVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0723e<K, V> mo8809g(Object obj) {
        C0723e<K, V> d = mo8806d(obj);
        if (d != null) {
            mo8808f(d, true);
        }
        return d;
    }

    public V get(Object obj) {
        C0723e d = mo8806d(obj);
        if (d != null) {
            return d.f476g;
        }
        return null;
    }

    public Set<K> keySet() {
        C0716h<K, V>.c cVar = this.f463g;
        if (cVar != null) {
            return cVar;
        }
        C0716h<K, V>.c cVar2 = new C0720c();
        this.f463g = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C0723e b = mo8802b(k, true);
            V v2 = b.f476g;
            b.f476g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C0723e g = mo8809g(obj);
        if (g != null) {
            return g.f476g;
        }
        return null;
    }

    public int size() {
        return this.f459c;
    }
}
