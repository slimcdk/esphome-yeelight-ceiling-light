package p164h.p211a.p212a.p228h;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* renamed from: h.a.a.h.m */
public class C11129m<K> implements ConcurrentMap<K, Object>, Serializable {

    /* renamed from: a */
    Map<K, Object> f22034a;

    /* renamed from: b */
    ConcurrentMap<K, Object> f22035b;

    public C11129m() {
        this.f22034a = new HashMap();
    }

    public C11129m(int i) {
        this.f22034a = new HashMap(i);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<K, java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11129m(p164h.p211a.p212a.p228h.C11129m<K> r2) {
        /*
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r2.f22035b
            if (r0 == 0) goto L_0x0011
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r2.f22035b
            r0.<init>(r2)
            r1.f22035b = r0
            goto L_0x0018
        L_0x0011:
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<K, java.lang.Object> r2 = r2.f22034a
            r0.<init>(r2)
        L_0x0018:
            r1.f22034a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.C11129m.<init>(h.a.a.h.m):void");
    }

    /* renamed from: a */
    public void mo35384a(K k, Object obj) {
        Object obj2 = this.f22034a.get(k);
        Object b = C11126j.m28879b(obj2, obj);
        if (obj2 != b) {
            this.f22034a.put(k, b);
        }
    }

    /* renamed from: b */
    public Object mo35385b(Object obj, int i) {
        Object obj2 = this.f22034a.get(obj);
        if (i == 0 && C11126j.m28890q(obj2) == 0) {
            return null;
        }
        return C11126j.m28884j(obj2, i);
    }

    public void clear() {
        this.f22034a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f22034a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f22034a.containsValue(obj);
    }

    public Set<Map.Entry<K, Object>> entrySet() {
        return this.f22034a.entrySet();
    }

    public boolean equals(Object obj) {
        return this.f22034a.equals(obj);
    }

    public Object get(Object obj) {
        Object obj2 = this.f22034a.get(obj);
        int q = C11126j.m28890q(obj2);
        if (q != 0) {
            return q != 1 ? C11126j.m28886l(obj2, true) : C11126j.m28884j(obj2, 0);
        }
        return null;
    }

    public int hashCode() {
        return this.f22034a.hashCode();
    }

    public boolean isEmpty() {
        return this.f22034a.isEmpty();
    }

    public Set<K> keySet() {
        return this.f22034a.keySet();
    }

    public Object put(K k, Object obj) {
        return this.f22034a.put(k, C11126j.m28879b((Object) null, obj));
    }

    public void putAll(Map<? extends K, ? extends Object> map) {
        if (map instanceof C11129m) {
            for (Map.Entry next : map.entrySet()) {
                this.f22034a.put(next.getKey(), C11126j.m28882e(next.getValue()));
            }
            return;
        }
        this.f22034a.putAll(map);
    }

    public Object putIfAbsent(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this.f22035b;
        if (concurrentMap != null) {
            return concurrentMap.putIfAbsent(k, obj);
        }
        throw new UnsupportedOperationException();
    }

    public Object remove(Object obj) {
        return this.f22034a.remove(obj);
    }

    public boolean remove(Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this.f22035b;
        if (concurrentMap != null) {
            return concurrentMap.remove(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public Object replace(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this.f22035b;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj);
        }
        throw new UnsupportedOperationException();
    }

    public boolean replace(K k, Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this.f22035b;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f22034a.size();
    }

    public String toString() {
        Object obj = this.f22035b;
        if (obj == null) {
            obj = this.f22034a;
        }
        return obj.toString();
    }

    public Collection<Object> values() {
        return this.f22034a.values();
    }
}
