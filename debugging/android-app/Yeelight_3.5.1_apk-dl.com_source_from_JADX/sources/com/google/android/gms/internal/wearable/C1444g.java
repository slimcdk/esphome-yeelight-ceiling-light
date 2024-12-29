package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.g */
abstract class C1444g<E> extends AbstractList<E> implements C1515u0<E> {

    /* renamed from: a */
    private boolean f1776a = true;

    C1444g() {
    }

    /* renamed from: D */
    public final void mo13628D() {
        this.f1776a = false;
    }

    public boolean add(E e) {
        mo13630b();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo13630b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo13630b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13630b() {
        if (!this.f1776a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo13630b();
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

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo13630b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo13630b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo13630b();
        return super.retainAll(collection);
    }

    public final boolean zza() {
        return this.f1776a;
    }
}
