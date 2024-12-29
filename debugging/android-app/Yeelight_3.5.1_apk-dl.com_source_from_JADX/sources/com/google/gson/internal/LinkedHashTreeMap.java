package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new C2480a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final C2488g<K, V> header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    C2488g<K, V>[] table;
    int threshold;

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$a */
    static class C2480a implements Comparator<Comparable> {
        C2480a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$b */
    static final class C2481b<K, V> {

        /* renamed from: a */
        private C2488g<K, V> f4200a;

        /* renamed from: b */
        private int f4201b;

        /* renamed from: c */
        private int f4202c;

        /* renamed from: d */
        private int f4203d;

        C2481b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19297a(C2488g<K, V> gVar) {
            gVar.f4213c = null;
            gVar.f4211a = null;
            gVar.f4212b = null;
            gVar.f4219i = 1;
            int i = this.f4201b;
            if (i > 0) {
                int i2 = this.f4203d;
                if ((i2 & 1) == 0) {
                    this.f4203d = i2 + 1;
                    this.f4201b = i - 1;
                    this.f4202c++;
                }
            }
            gVar.f4211a = this.f4200a;
            this.f4200a = gVar;
            int i3 = this.f4203d + 1;
            this.f4203d = i3;
            int i4 = this.f4201b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f4203d = i3 + 1;
                this.f4201b = i4 - 1;
                this.f4202c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f4203d & i6) == i6) {
                    int i7 = this.f4202c;
                    if (i7 == 0) {
                        C2488g<K, V> gVar2 = this.f4200a;
                        C2488g<K, V> gVar3 = gVar2.f4211a;
                        C2488g<K, V> gVar4 = gVar3.f4211a;
                        gVar3.f4211a = gVar4.f4211a;
                        this.f4200a = gVar3;
                        gVar3.f4212b = gVar4;
                        gVar3.f4213c = gVar2;
                        gVar3.f4219i = gVar2.f4219i + 1;
                        gVar4.f4211a = gVar3;
                        gVar2.f4211a = gVar3;
                    } else {
                        if (i7 == 1) {
                            C2488g<K, V> gVar5 = this.f4200a;
                            C2488g<K, V> gVar6 = gVar5.f4211a;
                            this.f4200a = gVar6;
                            gVar6.f4213c = gVar5;
                            gVar6.f4219i = gVar5.f4219i + 1;
                            gVar5.f4211a = gVar6;
                        } else if (i7 != 2) {
                        }
                        this.f4202c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo19298b(int i) {
            this.f4201b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f4203d = 0;
            this.f4202c = 0;
            this.f4200a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2488g<K, V> mo19299c() {
            C2488g<K, V> gVar = this.f4200a;
            if (gVar.f4211a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$c */
    static class C2482c<K, V> {

        /* renamed from: a */
        private C2488g<K, V> f4204a;

        C2482c() {
        }

        /* renamed from: a */
        public C2488g<K, V> mo19300a() {
            C2488g<K, V> gVar = this.f4204a;
            if (gVar == null) {
                return null;
            }
            C2488g<K, V> gVar2 = gVar.f4211a;
            gVar.f4211a = null;
            C2488g<K, V> gVar3 = gVar.f4213c;
            while (true) {
                C2488g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C2488g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f4211a = gVar5;
                    gVar3 = gVar2.f4212b;
                } else {
                    this.f4204a = gVar5;
                    return gVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo19301b(C2488g<K, V> gVar) {
            C2488g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f4211a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f4212b;
            }
            this.f4204a = gVar2;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d */
    final class C2483d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d$a */
        class C2484a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            C2484a(C2483d dVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo19315a();
            }
        }

        C2483d() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2484a(this);
        }

        public boolean remove(Object obj) {
            C2488g findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$e */
    final class C2485e extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedHashTreeMap$e$a */
        class C2486a extends LinkedHashTreeMap<K, V>.f<K> {
            C2486a(C2485e eVar) {
                super();
            }

            public K next() {
                return mo19315a().f4216f;
            }
        }

        C2485e() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C2486a(this);
        }

        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$f */
    private abstract class C2487f<T> implements Iterator<T> {

        /* renamed from: a */
        C2488g<K, V> f4207a;

        /* renamed from: b */
        C2488g<K, V> f4208b = null;

        /* renamed from: c */
        int f4209c;

        C2487f() {
            this.f4207a = LinkedHashTreeMap.this.header.f4214d;
            this.f4209c = LinkedHashTreeMap.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C2488g<K, V> mo19315a() {
            C2488g<K, V> gVar = this.f4207a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f4209c) {
                this.f4207a = gVar.f4214d;
                this.f4208b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4207a != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C2488g<K, V> gVar = this.f4208b;
            if (gVar != null) {
                LinkedHashTreeMap.this.removeInternal(gVar, true);
                this.f4208b = null;
                this.f4209c = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$g */
    static final class C2488g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C2488g<K, V> f4211a;

        /* renamed from: b */
        C2488g<K, V> f4212b;

        /* renamed from: c */
        C2488g<K, V> f4213c;

        /* renamed from: d */
        C2488g<K, V> f4214d;

        /* renamed from: e */
        C2488g<K, V> f4215e;

        /* renamed from: f */
        final K f4216f;

        /* renamed from: g */
        final int f4217g;

        /* renamed from: h */
        V f4218h;

        /* renamed from: i */
        int f4219i;

        C2488g() {
            this.f4216f = null;
            this.f4217g = -1;
            this.f4215e = this;
            this.f4214d = this;
        }

        C2488g(C2488g<K, V> gVar, K k, int i, C2488g<K, V> gVar2, C2488g<K, V> gVar3) {
            this.f4211a = gVar;
            this.f4216f = k;
            this.f4217g = i;
            this.f4219i = 1;
            this.f4214d = gVar2;
            this.f4215e = gVar3;
            gVar3.f4214d = this;
            gVar2.f4215e = this;
        }

        /* renamed from: a */
        public C2488g<K, V> mo19318a() {
            C2488g<K, V> gVar = this;
            for (C2488g<K, V> gVar2 = this.f4212b; gVar2 != null; gVar2 = gVar2.f4212b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C2488g<K, V> mo19319b() {
            C2488g<K, V> gVar = this;
            for (C2488g<K, V> gVar2 = this.f4213c; gVar2 != null; gVar2 = gVar2.f4213c) {
                gVar = gVar2;
            }
            return gVar;
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
                K r0 = r3.f4216f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f4218h
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.C2488g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4216f;
        }

        public V getValue() {
            return this.f4218h;
        }

        public int hashCode() {
            K k = this.f4216f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f4218h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f4218h;
            this.f4218h = v;
            return v2;
        }

        public String toString() {
            return this.f4216f + "=" + this.f4218h;
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? NATURAL_ORDER : comparator2;
        this.header = new C2488g<>();
        C2488g<K, V>[] gVarArr = new C2488g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    private void doubleCapacity() {
        C2488g<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    static <K, V> C2488g<K, V>[] doubleCapacity(C2488g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C2488g<K, V>[] gVarArr2 = new C2488g[(length * 2)];
        C2482c cVar = new C2482c();
        C2481b bVar = new C2481b();
        C2481b bVar2 = new C2481b();
        for (int i = 0; i < length; i++) {
            C2488g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo19301b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C2488g a = cVar.mo19300a();
                    if (a == null) {
                        break;
                    } else if ((a.f4217g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo19298b(i2);
                bVar2.mo19298b(i3);
                cVar.mo19301b(gVar);
                while (true) {
                    C2488g a2 = cVar.mo19300a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f4217g & length) == 0) {
                        bVar.mo19297a(a2);
                    } else {
                        bVar2.mo19297a(a2);
                    }
                }
                C2488g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo19299c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo19299c();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(C2488g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C2488g<K, V> gVar2 = gVar.f4212b;
            C2488g<K, V> gVar3 = gVar.f4213c;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f4219i : 0;
            int i3 = gVar3 != null ? gVar3.f4219i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C2488g<K, V> gVar4 = gVar3.f4212b;
                C2488g<K, V> gVar5 = gVar3.f4213c;
                int i5 = gVar5 != null ? gVar5.f4219i : 0;
                if (gVar4 != null) {
                    i = gVar4.f4219i;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    rotateRight(gVar3);
                }
                rotateLeft(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C2488g<K, V> gVar6 = gVar2.f4212b;
                C2488g<K, V> gVar7 = gVar2.f4213c;
                int i7 = gVar7 != null ? gVar7.f4219i : 0;
                if (gVar6 != null) {
                    i = gVar6.f4219i;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    rotateLeft(gVar2);
                }
                rotateRight(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f4219i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f4219i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f4211a;
        }
    }

    private void replaceInParent(C2488g<K, V> gVar, C2488g<K, V> gVar2) {
        C2488g<K, V> gVar3 = gVar.f4211a;
        gVar.f4211a = null;
        if (gVar2 != null) {
            gVar2.f4211a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f4217g;
            C2488g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f4212b == gVar) {
            gVar3.f4212b = gVar2;
        } else {
            gVar3.f4213c = gVar2;
        }
    }

    private void rotateLeft(C2488g<K, V> gVar) {
        C2488g<K, V> gVar2 = gVar.f4212b;
        C2488g<K, V> gVar3 = gVar.f4213c;
        C2488g<K, V> gVar4 = gVar3.f4212b;
        C2488g<K, V> gVar5 = gVar3.f4213c;
        gVar.f4213c = gVar4;
        if (gVar4 != null) {
            gVar4.f4211a = gVar;
        }
        replaceInParent(gVar, gVar3);
        gVar3.f4212b = gVar;
        gVar.f4211a = gVar3;
        int i = 0;
        int max = Math.max(gVar2 != null ? gVar2.f4219i : 0, gVar4 != null ? gVar4.f4219i : 0) + 1;
        gVar.f4219i = max;
        if (gVar5 != null) {
            i = gVar5.f4219i;
        }
        gVar3.f4219i = Math.max(max, i) + 1;
    }

    private void rotateRight(C2488g<K, V> gVar) {
        C2488g<K, V> gVar2 = gVar.f4212b;
        C2488g<K, V> gVar3 = gVar.f4213c;
        C2488g<K, V> gVar4 = gVar2.f4212b;
        C2488g<K, V> gVar5 = gVar2.f4213c;
        gVar.f4212b = gVar5;
        if (gVar5 != null) {
            gVar5.f4211a = gVar;
        }
        replaceInParent(gVar, gVar2);
        gVar2.f4213c = gVar;
        gVar.f4211a = gVar2;
        int i = 0;
        int max = Math.max(gVar3 != null ? gVar3.f4219i : 0, gVar5 != null ? gVar5.f4219i : 0) + 1;
        gVar.f4219i = max;
        if (gVar4 != null) {
            i = gVar4.f4219i;
        }
        gVar2.f4219i = Math.max(max, i) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C2488g<K, V> gVar = this.header;
        C2488g<K, V> gVar2 = gVar.f4214d;
        while (gVar2 != gVar) {
            C2488g<K, V> gVar3 = gVar2.f4214d;
            gVar2.f4215e = null;
            gVar2.f4214d = null;
            gVar2 = gVar3;
        }
        gVar.f4215e = gVar;
        gVar.f4214d = gVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new C2483d();
        this.entrySet = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    public C2488g<K, V> find(K k, boolean z) {
        int i;
        C2488g<K, V> gVar;
        C2488g<K, V> gVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C2488g<K, V>[] gVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (gVarArr.length - 1) & secondaryHash;
        C2488g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator2 == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                K k2 = gVar3.f4216f;
                int compareTo = comparable != null ? comparable.compareTo(k2) : comparator2.compare(k, k2);
                if (compareTo == 0) {
                    return gVar3;
                }
                C2488g<K, V> gVar4 = compareTo < 0 ? gVar3.f4212b : gVar3.f4213c;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = compareTo;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C2488g<K, V> gVar5 = this.header;
        if (gVar != null) {
            gVar2 = new C2488g<>(gVar, k, secondaryHash, gVar5, gVar5.f4215e);
            if (i < 0) {
                gVar.f4212b = gVar2;
            } else {
                gVar.f4213c = gVar2;
            }
            rebalance(gVar, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            gVar2 = new C2488g<>(gVar, k, secondaryHash, gVar5, gVar5.f4215e);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    public C2488g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        C2488g<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.f4218h, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C2488g<K, V> findByObject(Object obj) {
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
        C2488g findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f4218h;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new C2485e();
        this.keySet = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C2488g find = find(k, true);
        V v2 = find.f4218h;
        find.f4218h = v;
        return v2;
    }

    public V remove(Object obj) {
        C2488g removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f4218h;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C2488g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C2488g<K, V> gVar2 = gVar.f4215e;
            gVar2.f4214d = gVar.f4214d;
            gVar.f4214d.f4215e = gVar2;
            gVar.f4215e = null;
            gVar.f4214d = null;
        }
        C2488g<K, V> gVar3 = gVar.f4212b;
        C2488g<K, V> gVar4 = gVar.f4213c;
        C2488g<K, V> gVar5 = gVar.f4211a;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                replaceInParent(gVar, gVar3);
                gVar.f4212b = null;
            } else if (gVar4 != null) {
                replaceInParent(gVar, gVar4);
                gVar.f4213c = null;
            } else {
                replaceInParent(gVar, (C2488g<K, V>) null);
            }
            rebalance(gVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        C2488g<K, V> b = gVar3.f4219i > gVar4.f4219i ? gVar3.mo19319b() : gVar4.mo19318a();
        removeInternal(b, false);
        C2488g<K, V> gVar6 = gVar.f4212b;
        if (gVar6 != null) {
            i = gVar6.f4219i;
            b.f4212b = gVar6;
            gVar6.f4211a = b;
            gVar.f4212b = null;
        } else {
            i = 0;
        }
        C2488g<K, V> gVar7 = gVar.f4213c;
        if (gVar7 != null) {
            i2 = gVar7.f4219i;
            b.f4213c = gVar7;
            gVar7.f4211a = b;
            gVar.f4213c = null;
        }
        b.f4219i = Math.max(i, i2) + 1;
        replaceInParent(gVar, b);
    }

    /* access modifiers changed from: package-private */
    public C2488g<K, V> removeInternalByKey(Object obj) {
        C2488g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }
}
