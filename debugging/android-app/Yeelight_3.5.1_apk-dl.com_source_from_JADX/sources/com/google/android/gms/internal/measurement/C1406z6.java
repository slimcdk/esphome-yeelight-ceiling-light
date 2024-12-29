package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
abstract class C1406z6 extends AbstractList implements C1254p8 {

    /* renamed from: a */
    private boolean f1740a = true;

    C1406z6() {
    }

    /* renamed from: D */
    public final void mo13071D() {
        this.f1740a = false;
    }

    /* renamed from: E */
    public final boolean mo13072E() {
        return this.f1740a;
    }

    public boolean add(Object obj) {
        mo13526b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo13526b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo13526b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13526b() {
        if (!this.f1740a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo13526b();
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

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo13526b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo13526b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo13526b();
        return super.retainAll(collection);
    }
}
