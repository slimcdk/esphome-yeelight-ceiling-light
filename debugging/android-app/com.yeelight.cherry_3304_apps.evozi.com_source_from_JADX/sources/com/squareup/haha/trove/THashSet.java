package com.squareup.haha.trove;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class THashSet<E> extends TObjectHash<E> implements Set<E> {

    final class HashProcedure implements TObjectProcedure<E> {

        /* renamed from: h */
        int f6718h;

        HashProcedure() {
        }

        public final boolean execute(E e) {
            this.f6718h += THashSet.this._hashingStrategy.computeHashCode(e);
            return true;
        }
    }

    public final boolean add(E e) {
        int insertionIndex = insertionIndex(e);
        boolean z = false;
        if (insertionIndex < 0) {
            return false;
        }
        Object[] objArr = this._set;
        Object obj = objArr[insertionIndex];
        objArr[insertionIndex] = e;
        if (obj == null) {
            z = true;
        }
        postInsertHook(z);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        ensureCapacity(size);
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (add(it.next())) {
                z = true;
            }
            size = i;
        }
    }

    public final void clear() {
        super.clear();
        Object[] objArr = this._set;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length > 0) {
                objArr[i] = null;
                length = i;
            } else {
                return;
            }
        }
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        return containsAll(set);
    }

    public final int hashCode() {
        HashProcedure hashProcedure = new HashProcedure();
        forEach(hashProcedure);
        return hashProcedure.f6718h;
    }

    public final Iterator<E> iterator() {
        return new TObjectHashIterator(this);
    }

    /* access modifiers changed from: protected */
    public final void rehash(int i) {
        Object[] objArr = this._set;
        int length = objArr.length;
        this._set = new Object[i];
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
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public final boolean remove(Object obj) {
        int index = index(obj);
        if (index < 0) {
            return false;
        }
        removeAt(index);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        int size = collection.size();
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (remove(it.next())) {
                z = true;
            }
            size = i;
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int size = size();
        Iterator it = iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
            size = i;
        }
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        forEach(new ToObjectArrayProcedure(objArr));
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
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
