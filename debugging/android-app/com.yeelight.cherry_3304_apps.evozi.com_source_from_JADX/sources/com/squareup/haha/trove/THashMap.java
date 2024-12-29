package com.squareup.haha.trove;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class THashMap<K, V> extends TObjectHash<K> implements Map<K, V> {
    protected transient V[] _values;

    final class Entry implements Map.Entry<K, V> {
        private final int index;
        private final K key;
        private V val;

        Entry(K k, V v, int i) {
            this.key = k;
            this.val = v;
            this.index = i;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.val;
        }

        public final V setValue(V v) {
            V[] vArr = THashMap.this._values;
            int i = this.index;
            V v2 = vArr[i];
            V v3 = this.val;
            if (v2 == v3) {
                vArr[i] = v;
                this.val = v;
                return v3;
            }
            throw new ConcurrentModificationException();
        }
    }

    public class EntryView extends MapBackedView {

        final class EntryIterator extends THashIterator<Map.Entry<K, V>> {
            EntryIterator(THashMap<K, V> tHashMap) {
                super(tHashMap);
            }

            public final /* bridge */ /* synthetic */ Object objectAtIndex(int i) {
                THashMap tHashMap = THashMap.this;
                return new Entry(tHashMap._set[i], tHashMap._values[i], i);
            }
        }

        EntryView() {
            super();
        }

        public final /* bridge */ /* synthetic */ boolean containsElement(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = THashMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (value != obj2) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(THashMap.this);
        }

        public final /* bridge */ /* synthetic */ boolean removeElement(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int index = THashMap.this.index(entry.getKey());
            if (index < 0) {
                return false;
            }
            V value = entry.getValue();
            V[] vArr = THashMap.this._values;
            if (value != vArr[index] && (value == null || !value.equals(vArr[index]))) {
                return false;
            }
            THashMap.this.removeAt(index);
            return true;
        }
    }

    static final class EqProcedure<K, V> implements TObjectObjectProcedure<K, V> {
        private final Map<K, V> _otherMap;

        EqProcedure(Map<K, V> map) {
            this._otherMap = map;
        }

        public final boolean execute(K k, V v) {
            V v2 = this._otherMap.get(k);
            if (v2 != v) {
                return v2 != null && v2.equals(v);
            }
            return true;
        }
    }

    final class HashProcedure implements TObjectObjectProcedure<K, V> {

        /* renamed from: h */
        int f6717h;

        HashProcedure() {
        }

        public final boolean execute(K k, V v) {
            this.f6717h += THashMap.this._hashingStrategy.computeHashCode(k) ^ (v == null ? 0 : v.hashCode());
            return true;
        }
    }

    public class KeyView extends MapBackedView {
        KeyView() {
            super();
        }

        public final boolean containsElement(K k) {
            return THashMap.this.contains(k);
        }

        public final Iterator<K> iterator() {
            return new TObjectHashIterator(THashMap.this);
        }

        public final boolean removeElement(K k) {
            return THashMap.this.remove(k) != null;
        }
    }

    abstract class MapBackedView<E> implements Set<E> {
        MapBackedView() {
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            THashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return containsElement(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public abstract boolean containsElement(E e);

        public boolean isEmpty() {
            return THashMap.this.isEmpty();
        }

        public abstract Iterator<E> iterator();

        public boolean remove(Object obj) {
            return removeElement(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            boolean z = false;
            for (Object remove : collection) {
                if (remove(remove)) {
                    z = true;
                }
            }
            return z;
        }

        public abstract boolean removeElement(E e);

        public boolean retainAll(Collection<?> collection) {
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            return THashMap.this.size();
        }

        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                objArr[i] = it.next();
                i++;
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
            }
            Iterator it = iterator();
            for (int i = 0; i < size; i++) {
                tArr[i] = it.next();
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public class ValueView extends MapBackedView {
        protected ValueView() {
            super();
        }

        public final boolean containsElement(V v) {
            return THashMap.this.containsValue(v);
        }

        public final Iterator<V> iterator() {
            return new THashIterator<V>(THashMap.this) {
                /* access modifiers changed from: protected */
                public final V objectAtIndex(int i) {
                    return THashMap.this._values[i];
                }
            };
        }

        public final boolean removeElement(V v) {
            THashMap tHashMap = THashMap.this;
            V[] vArr = tHashMap._values;
            Object[] objArr = tHashMap._set;
            int length = vArr.length;
            boolean z = false;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return z;
                }
                if (!(objArr[i] == null || objArr[i] == TObjectHash.REMOVED || v != vArr[i]) || (vArr[i] != null && vArr[i].equals(v))) {
                    THashMap.this.removeAt(i);
                    z = true;
                }
                length = i;
            }
        }
    }

    /* access modifiers changed from: private */
    public THashMap<K, V> clone() {
        THashMap<K, V> tHashMap = (THashMap) super.clone();
        tHashMap._values = (Object[]) this._values.clone();
        return tHashMap;
    }

    private boolean forEachEntry(TObjectObjectProcedure<K, V> tObjectObjectProcedure) {
        Object[] objArr = this._set;
        V[] vArr = this._values;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (objArr[i] != null && objArr[i] != TObjectHash.REMOVED && !tObjectObjectProcedure.execute(objArr[i], vArr[i])) {
                return false;
            }
            length = i;
        }
    }

    public final void clear() {
        if (size() != 0) {
            super.clear();
            Object[] objArr = this._set;
            V[] vArr = this._values;
            int length = objArr.length;
            while (true) {
                int i = length - 1;
                if (length > 0) {
                    objArr[i] = null;
                    vArr[i] = null;
                    length = i;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        return contains(obj);
    }

    public final boolean containsValue(Object obj) {
        Object[] objArr = this._set;
        V[] vArr = this._values;
        int length = vArr.length;
        if (obj == null) {
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return false;
                }
                if (objArr[i] != null && objArr[i] != TObjectHash.REMOVED && obj == vArr[i]) {
                    return true;
                }
                length = i;
            }
        } else {
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    return false;
                }
                if (objArr[i2] == null || objArr[i2] == TObjectHash.REMOVED || (obj != vArr[i2] && !obj.equals(vArr[i2]))) {
                    length = i2;
                }
            }
            return true;
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntryView();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        return forEachEntry(new EqProcedure(map));
    }

    public final V get(Object obj) {
        int index = index(obj);
        if (index < 0) {
            return null;
        }
        return this._values[index];
    }

    public final int hashCode() {
        HashProcedure hashProcedure = new HashProcedure();
        forEachEntry(hashProcedure);
        return hashProcedure.f6717h;
    }

    public final Set<K> keySet() {
        return new KeyView();
    }

    public final V put(K k, V v) {
        if (k != null) {
            V v2 = null;
            int insertionIndex = insertionIndex(k);
            boolean z = false;
            boolean z2 = insertionIndex < 0;
            if (z2) {
                insertionIndex = (-insertionIndex) - 1;
                v2 = this._values[insertionIndex];
            }
            Object[] objArr = this._set;
            Object obj = objArr[insertionIndex];
            objArr[insertionIndex] = k;
            this._values[insertionIndex] = v;
            if (!z2) {
                if (obj == null) {
                    z = true;
                }
                postInsertHook(z);
            }
            return v2;
        }
        throw new NullPointerException("null keys not supported");
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void rehash(int i) {
        Object[] objArr = this._set;
        int length = objArr.length;
        V[] vArr = this._values;
        this._set = new Object[i];
        this._values = new Object[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                if (!(objArr[i2] == null || objArr[i2] == TObjectHash.REMOVED)) {
                    Object obj = objArr[i2];
                    int insertionIndex = insertionIndex(obj);
                    if (insertionIndex < 0) {
                        throwObjectContractViolation(this._set[(-insertionIndex) - 1], obj);
                    }
                    this._set[insertionIndex] = obj;
                    this._values[insertionIndex] = vArr[i2];
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public final V remove(Object obj) {
        int index = index(obj);
        if (index < 0) {
            return null;
        }
        V v = this._values[index];
        removeAt(index);
        return v;
    }

    /* access modifiers changed from: protected */
    public final void removeAt(int i) {
        this._values[i] = null;
        super.removeAt(i);
    }

    /* access modifiers changed from: protected */
    public final int setUp(int i) {
        int up = super.setUp(i);
        this._values = new Object[up];
        return up;
    }

    public final Collection<V> values() {
        return new ValueView();
    }
}
