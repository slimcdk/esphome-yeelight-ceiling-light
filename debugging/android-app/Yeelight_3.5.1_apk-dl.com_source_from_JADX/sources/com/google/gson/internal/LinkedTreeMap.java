package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C2489a();
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    final C2495e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    int modCount;
    C2495e<K, V> root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    static class C2489a implements Comparator<Comparable> {
        C2489a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    class C2490b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$a */
        class C2491a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            C2491a(C2490b bVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo19354a();
            }
        }

        C2490b() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2491a(this);
        }

        public boolean remove(Object obj) {
            C2495e findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    final class C2492c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$c$a */
        class C2493a extends LinkedTreeMap<K, V>.d<K> {
            C2493a(C2492c cVar) {
                super();
            }

            public K next() {
                return mo19354a().f4231f;
            }
        }

        C2492c() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C2493a(this);
        }

        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    private abstract class C2494d<T> implements Iterator<T> {

        /* renamed from: a */
        C2495e<K, V> f4222a;

        /* renamed from: b */
        C2495e<K, V> f4223b = null;

        /* renamed from: c */
        int f4224c;

        C2494d() {
            this.f4222a = LinkedTreeMap.this.header.f4229d;
            this.f4224c = LinkedTreeMap.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C2495e<K, V> mo19354a() {
            C2495e<K, V> eVar = this.f4222a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == this.f4224c) {
                this.f4222a = eVar.f4229d;
                this.f4223b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4222a != LinkedTreeMap.this.header;
        }

        public final void remove() {
            C2495e<K, V> eVar = this.f4223b;
            if (eVar != null) {
                LinkedTreeMap.this.removeInternal(eVar, true);
                this.f4223b = null;
                this.f4224c = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$e */
    static final class C2495e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C2495e<K, V> f4226a;

        /* renamed from: b */
        C2495e<K, V> f4227b;

        /* renamed from: c */
        C2495e<K, V> f4228c;

        /* renamed from: d */
        C2495e<K, V> f4229d;

        /* renamed from: e */
        C2495e<K, V> f4230e;

        /* renamed from: f */
        final K f4231f;

        /* renamed from: g */
        V f4232g;

        /* renamed from: h */
        int f4233h;

        C2495e() {
            this.f4231f = null;
            this.f4230e = this;
            this.f4229d = this;
        }

        C2495e(C2495e<K, V> eVar, K k, C2495e<K, V> eVar2, C2495e<K, V> eVar3) {
            this.f4226a = eVar;
            this.f4231f = k;
            this.f4233h = 1;
            this.f4229d = eVar2;
            this.f4230e = eVar3;
            eVar3.f4229d = this;
            eVar2.f4230e = this;
        }

        /* renamed from: a */
        public C2495e<K, V> mo19357a() {
            C2495e<K, V> eVar = this;
            for (C2495e<K, V> eVar2 = this.f4227b; eVar2 != null; eVar2 = eVar2.f4227b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C2495e<K, V> mo19358b() {
            C2495e<K, V> eVar = this;
            for (C2495e<K, V> eVar2 = this.f4228c; eVar2 != null; eVar2 = eVar2.f4228c) {
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
                K r0 = r3.f4231f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f4232g
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.C2495e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4231f;
        }

        public V getValue() {
            return this.f4232g;
        }

        public int hashCode() {
            K k = this.f4231f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f4232g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f4232g;
            this.f4232g = v;
            return v2;
        }

        public String toString() {
            return this.f4231f + "=" + this.f4232g;
        }
    }

    static {
        Class<LinkedTreeMap> cls = LinkedTreeMap.class;
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.header = new C2495e<>();
        this.comparator = comparator2 == null ? NATURAL_ORDER : comparator2;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(C2495e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C2495e<K, V> eVar2 = eVar.f4227b;
            C2495e<K, V> eVar3 = eVar.f4228c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f4233h : 0;
            int i3 = eVar3 != null ? eVar3.f4233h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C2495e<K, V> eVar4 = eVar3.f4227b;
                C2495e<K, V> eVar5 = eVar3.f4228c;
                int i5 = eVar5 != null ? eVar5.f4233h : 0;
                if (eVar4 != null) {
                    i = eVar4.f4233h;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    rotateRight(eVar3);
                }
                rotateLeft(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C2495e<K, V> eVar6 = eVar2.f4227b;
                C2495e<K, V> eVar7 = eVar2.f4228c;
                int i7 = eVar7 != null ? eVar7.f4233h : 0;
                if (eVar6 != null) {
                    i = eVar6.f4233h;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(eVar2);
                }
                rotateRight(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f4233h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4233h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4226a;
        }
    }

    private void replaceInParent(C2495e<K, V> eVar, C2495e<K, V> eVar2) {
        C2495e<K, V> eVar3 = eVar.f4226a;
        eVar.f4226a = null;
        if (eVar2 != null) {
            eVar2.f4226a = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f4227b == eVar) {
            eVar3.f4227b = eVar2;
        } else {
            eVar3.f4228c = eVar2;
        }
    }

    private void rotateLeft(C2495e<K, V> eVar) {
        C2495e<K, V> eVar2 = eVar.f4227b;
        C2495e<K, V> eVar3 = eVar.f4228c;
        C2495e<K, V> eVar4 = eVar3.f4227b;
        C2495e<K, V> eVar5 = eVar3.f4228c;
        eVar.f4228c = eVar4;
        if (eVar4 != null) {
            eVar4.f4226a = eVar;
        }
        replaceInParent(eVar, eVar3);
        eVar3.f4227b = eVar;
        eVar.f4226a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f4233h : 0, eVar4 != null ? eVar4.f4233h : 0) + 1;
        eVar.f4233h = max;
        if (eVar5 != null) {
            i = eVar5.f4233h;
        }
        eVar3.f4233h = Math.max(max, i) + 1;
    }

    private void rotateRight(C2495e<K, V> eVar) {
        C2495e<K, V> eVar2 = eVar.f4227b;
        C2495e<K, V> eVar3 = eVar.f4228c;
        C2495e<K, V> eVar4 = eVar2.f4227b;
        C2495e<K, V> eVar5 = eVar2.f4228c;
        eVar.f4227b = eVar5;
        if (eVar5 != null) {
            eVar5.f4226a = eVar;
        }
        replaceInParent(eVar, eVar2);
        eVar2.f4228c = eVar;
        eVar.f4226a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f4233h : 0, eVar5 != null ? eVar5.f4233h : 0) + 1;
        eVar.f4233h = max;
        if (eVar4 != null) {
            i = eVar4.f4233h;
        }
        eVar2.f4233h = Math.max(max, i) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C2495e<K, V> eVar = this.header;
        eVar.f4230e = eVar;
        eVar.f4229d = eVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new C2490b();
        this.entrySet = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public C2495e<K, V> find(K k, boolean z) {
        int i;
        C2495e<K, V> eVar;
        Comparator<? super K> comparator2 = this.comparator;
        C2495e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f4231f;
                i = comparable != null ? comparable.compareTo(k2) : comparator2.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C2495e<K, V> eVar3 = i < 0 ? eVar2.f4227b : eVar2.f4228c;
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
        C2495e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new C2495e<>(eVar2, k, eVar4, eVar4.f4230e);
            if (i < 0) {
                eVar2.f4227b = eVar;
            } else {
                eVar2.f4228c = eVar;
            }
            rebalance(eVar2, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            eVar = new C2495e<>(eVar2, k, eVar4, eVar4.f4230e);
            this.root = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public C2495e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        C2495e<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.f4232g, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C2495e<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C2495e findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f4232g;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new C2492c();
        this.keySet = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C2495e find = find(k, true);
        V v2 = find.f4232g;
        find.f4232g = v;
        return v2;
    }

    public V remove(Object obj) {
        C2495e removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f4232g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C2495e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C2495e<K, V> eVar2 = eVar.f4230e;
            eVar2.f4229d = eVar.f4229d;
            eVar.f4229d.f4230e = eVar2;
        }
        C2495e<K, V> eVar3 = eVar.f4227b;
        C2495e<K, V> eVar4 = eVar.f4228c;
        C2495e<K, V> eVar5 = eVar.f4226a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                replaceInParent(eVar, eVar3);
                eVar.f4227b = null;
            } else if (eVar4 != null) {
                replaceInParent(eVar, eVar4);
                eVar.f4228c = null;
            } else {
                replaceInParent(eVar, (C2495e<K, V>) null);
            }
            rebalance(eVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        C2495e<K, V> b = eVar3.f4233h > eVar4.f4233h ? eVar3.mo19358b() : eVar4.mo19357a();
        removeInternal(b, false);
        C2495e<K, V> eVar6 = eVar.f4227b;
        if (eVar6 != null) {
            i = eVar6.f4233h;
            b.f4227b = eVar6;
            eVar6.f4226a = b;
            eVar.f4227b = null;
        } else {
            i = 0;
        }
        C2495e<K, V> eVar7 = eVar.f4228c;
        if (eVar7 != null) {
            i2 = eVar7.f4233h;
            b.f4228c = eVar7;
            eVar7.f4226a = b;
            eVar.f4228c = null;
        }
        b.f4233h = Math.max(i, i2) + 1;
        replaceInParent(eVar, b);
    }

    /* access modifiers changed from: package-private */
    public C2495e<K, V> removeInternalByKey(Object obj) {
        C2495e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }
}
