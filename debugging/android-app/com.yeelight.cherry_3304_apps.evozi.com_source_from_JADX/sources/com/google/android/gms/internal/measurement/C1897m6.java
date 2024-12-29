package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
final class C1897m6<E> extends C2091z2<E> implements RandomAccess {

    /* renamed from: d */
    private static final C1897m6<Object> f3582d;

    /* renamed from: b */
    private E[] f3583b;

    /* renamed from: c */
    private int f3584c;

    static {
        C1897m6<Object> m6Var = new C1897m6<>(new Object[0], 0);
        f3582d = m6Var;
        m6Var.mo12092t();
    }

    private C1897m6(E[] eArr, int i) {
        this.f3583b = eArr;
        this.f3584c = i;
    }

    /* renamed from: d */
    private final void m5507d(int i) {
        if (i < 0 || i >= this.f3584c) {
            throw new IndexOutOfBoundsException(m5508e(i));
        }
    }

    /* renamed from: e */
    private final String m5508e(int i) {
        int i2 = this.f3584c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: f */
    public static <E> C1897m6<E> m5509f() {
        return f3582d;
    }

    /* renamed from: a */
    public final /* synthetic */ C1999t4 mo11562a(int i) {
        if (i >= this.f3584c) {
            return new C1897m6(Arrays.copyOf(this.f3583b, i), this.f3584c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        int i2;
        mo12352c();
        if (i < 0 || i > (i2 = this.f3584c)) {
            throw new IndexOutOfBoundsException(m5508e(i));
        }
        E[] eArr = this.f3583b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f3583b, i, eArr2, i + 1, this.f3584c - i);
            this.f3583b = eArr2;
        }
        this.f3583b[i] = e;
        this.f3584c++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo12352c();
        int i = this.f3584c;
        E[] eArr = this.f3583b;
        if (i == eArr.length) {
            this.f3583b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3583b;
        int i2 = this.f3584c;
        this.f3584c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        m5507d(i);
        return this.f3583b[i];
    }

    public final E remove(int i) {
        mo12352c();
        m5507d(i);
        E[] eArr = this.f3583b;
        E e = eArr[i];
        int i2 = this.f3584c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f3584c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo12352c();
        m5507d(i);
        E[] eArr = this.f3583b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f3584c;
    }
}
