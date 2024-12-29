package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.y1 */
final class C1533y1<E> extends C1444g<E> implements RandomAccess {

    /* renamed from: d */
    private static final C1533y1<Object> f1881d;

    /* renamed from: b */
    private E[] f1882b;

    /* renamed from: c */
    private int f1883c;

    static {
        C1533y1<Object> y1Var = new C1533y1<>(new Object[0], 0);
        f1881d = y1Var;
        y1Var.mo13628D();
    }

    private C1533y1(E[] eArr, int i) {
        this.f1882b = eArr;
        this.f1883c = i;
    }

    /* renamed from: e */
    public static <E> C1533y1<E> m3968e() {
        return f1881d;
    }

    /* renamed from: g */
    private final void m3969g(int i) {
        if (i < 0 || i >= this.f1883c) {
            throw new IndexOutOfBoundsException(m3970j(i));
        }
    }

    /* renamed from: j */
    private final String m3970j(int i) {
        int i2 = this.f1883c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void add(int i, E e) {
        int i2;
        mo13630b();
        if (i < 0 || i > (i2 = this.f1883c)) {
            throw new IndexOutOfBoundsException(m3970j(i));
        }
        E[] eArr = this.f1882b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f1882b, i, eArr2, i + 1, this.f1883c - i);
            this.f1882b = eArr2;
        }
        this.f1882b[i] = e;
        this.f1883c++;
        this.modCount++;
    }

    public final boolean add(E e) {
        mo13630b();
        int i = this.f1883c;
        E[] eArr = this.f1882b;
        if (i == eArr.length) {
            this.f1882b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f1882b;
        int i2 = this.f1883c;
        this.f1883c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        m3969g(i);
        return this.f1882b[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1515u0 mo13609h(int i) {
        if (i >= this.f1883c) {
            return new C1533y1(Arrays.copyOf(this.f1882b, i), this.f1883c);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo13630b();
        m3969g(i);
        E[] eArr = this.f1882b;
        E e = eArr[i];
        int i2 = this.f1883c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f1883c--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo13630b();
        m3969g(i);
        E[] eArr = this.f1882b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f1883c;
    }
}
