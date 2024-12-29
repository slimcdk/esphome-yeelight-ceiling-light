package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
public final class C1970r5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C1970r5 f3695b;

    /* renamed from: a */
    private boolean f3696a = true;

    static {
        C1970r5 r5Var = new C1970r5();
        f3695b = r5Var;
        r5Var.f3696a = false;
    }

    private C1970r5() {
    }

    private C1970r5(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    private static int m5885a(Object obj) {
        if (obj instanceof byte[]) {
            return C1925o4.m5648j((byte[]) obj);
        }
        if (!(obj instanceof C1953q4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public static <K, V> C1970r5<K, V> m5886b() {
        return f3695b;
    }

    /* renamed from: j */
    private final void m5887j() {
        if (!this.f3696a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final void mo11978c(C1970r5<K, V> r5Var) {
        m5887j();
        if (!r5Var.isEmpty()) {
            putAll(r5Var);
        }
    }

    public final void clear() {
        m5887j();
        super.clear();
    }

    /* renamed from: d */
    public final C1970r5<K, V> mo11980d() {
        return isEmpty() ? new C1970r5<>() : new C1970r5<>(this);
    }

    /* renamed from: e */
    public final void mo11981e() {
        this.f3696a = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1970r5.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo11984f() {
        return this.f3696a;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m5885a(entry.getValue()) ^ m5885a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m5887j();
        C1925o4.m5642d(k);
        C1925o4.m5642d(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m5887j();
        for (Object next : map.keySet()) {
            C1925o4.m5642d(next);
            C1925o4.m5642d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m5887j();
        return super.remove(obj);
    }
}
