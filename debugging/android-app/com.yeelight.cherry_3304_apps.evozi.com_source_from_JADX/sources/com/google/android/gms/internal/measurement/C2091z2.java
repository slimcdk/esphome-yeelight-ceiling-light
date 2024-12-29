package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
abstract class C2091z2<E> extends AbstractList<E> implements C1999t4<E> {

    /* renamed from: a */
    private boolean f3862a = true;

    C2091z2() {
    }

    /* renamed from: C */
    public boolean mo12091C() {
        return this.f3862a;
    }

    public boolean add(E e) {
        mo12352c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo12352c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo12352c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12352c() {
        if (!this.f3862a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo12352c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo12352c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo12352c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo12352c();
        return super.retainAll(collection);
    }

    /* renamed from: t */
    public final void mo12092t() {
        this.f3862a = false;
    }
}
