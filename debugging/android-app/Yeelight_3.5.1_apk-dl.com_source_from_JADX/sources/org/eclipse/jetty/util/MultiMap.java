package org.eclipse.jetty.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class MultiMap<K> implements ConcurrentMap<K, Object>, Serializable {
    private static final long serialVersionUID = -6878723138353851005L;
    ConcurrentMap<K, Object> _cmap;
    Map<K, Object> _map;

    public MultiMap() {
        this._map = new HashMap();
    }

    public MultiMap(int i) {
        this._map = new HashMap(i);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<K, java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiMap(java.util.Map<K, java.lang.Object> r2) {
        /*
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof java.util.concurrent.ConcurrentMap
            if (r0 == 0) goto L_0x000f
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r2)
            r1._cmap = r0
            goto L_0x0014
        L_0x000f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
        L_0x0014:
            r1._map = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.MultiMap.<init>(java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<K, java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiMap(org.eclipse.jetty.util.MultiMap<K> r2) {
        /*
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r2._cmap
            if (r0 == 0) goto L_0x0011
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r2._cmap
            r0.<init>(r2)
            r1._cmap = r0
            goto L_0x0018
        L_0x0011:
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<K, java.lang.Object> r2 = r2._map
            r0.<init>(r2)
        L_0x0018:
            r1._map = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.MultiMap.<init>(org.eclipse.jetty.util.MultiMap):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<K, java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiMap(boolean r1) {
        /*
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L_0x000d
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0._cmap = r1
            goto L_0x0012
        L_0x000d:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0012:
            r0._map = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.MultiMap.<init>(boolean):void");
    }

    public void add(K k, Object obj) {
        Object obj2 = this._map.get(k);
        Object add = LazyList.add(obj2, obj);
        if (obj2 != add) {
            this._map.put(k, add);
        }
    }

    public void addValues(K k, List<? extends Object> list) {
        Object obj = this._map.get(k);
        Object addCollection = LazyList.addCollection(obj, list);
        if (obj != addCollection) {
            this._map.put(k, addCollection);
        }
    }

    public void addValues(K k, String[] strArr) {
        Object obj = this._map.get(k);
        Object addCollection = LazyList.addCollection(obj, Arrays.asList(strArr));
        if (obj != addCollection) {
            this._map.put(k, addCollection);
        }
    }

    public void clear() {
        this._map.clear();
    }

    public boolean containsKey(Object obj) {
        return this._map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this._map.containsValue(obj);
    }

    public Set<Map.Entry<K, Object>> entrySet() {
        return this._map.entrySet();
    }

    public boolean equals(Object obj) {
        return this._map.equals(obj);
    }

    public Object get(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size != 0) {
            return size != 1 ? LazyList.getList(obj2, true) : LazyList.get(obj2, 0);
        }
        return null;
    }

    public String getString(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            StringBuilder sb = new StringBuilder(128);
            for (int i = 0; i < LazyList.size(obj2); i++) {
                Object obj3 = LazyList.get(obj2, i);
                if (obj3 != null) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(obj3.toString());
                }
            }
            return sb.toString();
        }
        Object obj4 = LazyList.get(obj2, 0);
        if (obj4 == null) {
            return null;
        }
        return obj4.toString();
    }

    public Object getValue(Object obj, int i) {
        Object obj2 = this._map.get(obj);
        if (i == 0 && LazyList.size(obj2) == 0) {
            return null;
        }
        return LazyList.get(obj2, i);
    }

    public List getValues(Object obj) {
        return LazyList.getList(this._map.get(obj), true);
    }

    public int hashCode() {
        return this._map.hashCode();
    }

    public boolean isEmpty() {
        return this._map.isEmpty();
    }

    public Set<K> keySet() {
        return this._map.keySet();
    }

    public Object put(K k, Object obj) {
        return this._map.put(k, LazyList.add((Object) null, obj));
    }

    public void putAll(Map<? extends K, ? extends Object> map) {
        if (map instanceof MultiMap) {
            for (Map.Entry next : map.entrySet()) {
                this._map.put(next.getKey(), LazyList.clone(next.getValue()));
            }
            return;
        }
        this._map.putAll(map);
    }

    public Object putIfAbsent(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.putIfAbsent(k, obj);
        }
        throw new UnsupportedOperationException();
    }

    public Object putValues(K k, List<? extends Object> list) {
        return this._map.put(k, list);
    }

    public Object putValues(K k, String... strArr) {
        Object obj = null;
        for (String add : strArr) {
            obj = LazyList.add(obj, add);
        }
        return this._map.put(k, obj);
    }

    public Object remove(Object obj) {
        return this._map.remove(obj);
    }

    public boolean remove(Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.remove(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public boolean removeValue(K k, Object obj) {
        Object obj2 = this._map.get(k);
        int size = LazyList.size(obj2);
        if (size > 0) {
            obj2 = LazyList.remove(obj2, obj);
            Map<K, Object> map = this._map;
            if (obj2 == null) {
                map.remove(k);
            } else {
                map.put(k, obj2);
            }
        }
        return LazyList.size(obj2) != size;
    }

    public Object replace(K k, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj);
        }
        throw new UnsupportedOperationException();
    }

    public boolean replace(K k, Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k, obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this._map.size();
    }

    public String toString() {
        Object obj = this._cmap;
        if (obj == null) {
            obj = this._map;
        }
        return obj.toString();
    }

    public Map<K, String[]> toStringArrayMap() {
        C99731 r0 = new HashMap<K, String[]>((this._map.size() * 3) / 2) {
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append('{');
                for (Object next : keySet()) {
                    if (sb.length() > 1) {
                        sb.append(',');
                    }
                    sb.append(next);
                    sb.append('=');
                    sb.append(Arrays.asList((Object[]) get(next)));
                }
                sb.append('}');
                return sb.toString();
            }
        };
        for (Map.Entry next : this._map.entrySet()) {
            r0.put(next.getKey(), LazyList.toStringArray(next.getValue()));
        }
        return r0;
    }

    public Collection<Object> values() {
        return this._map.values();
    }
}
