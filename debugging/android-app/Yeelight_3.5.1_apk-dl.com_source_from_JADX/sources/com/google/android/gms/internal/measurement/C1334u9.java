package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u9 */
final class C1334u9 extends C1406z6 implements RandomAccess {

    /* renamed from: d */
    private static final C1334u9 f1666d;

    /* renamed from: b */
    private Object[] f1667b;

    /* renamed from: c */
    private int f1668c;

    static {
        C1334u9 u9Var = new C1334u9(new Object[0], 0);
        f1666d = u9Var;
        u9Var.mo13071D();
    }

    private C1334u9(Object[] objArr, int i) {
        this.f1667b = objArr;
        this.f1668c = i;
    }

    /* renamed from: e */
    public static C1334u9 m3071e() {
        return f1666d;
    }

    /* renamed from: g */
    private final String m3072g(int i) {
        int i2 = this.f1668c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m3073j(int i) {
        if (i < 0 || i >= this.f1668c) {
            throw new IndexOutOfBoundsException(m3072g(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo13526b();
        if (i < 0 || i > (i2 = this.f1668c)) {
            throw new IndexOutOfBoundsException(m3072g(i));
        }
        Object[] objArr = this.f1667b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f1667b, i, objArr2, i + 1, this.f1668c - i);
            this.f1667b = objArr2;
        }
        this.f1667b[i] = obj;
        this.f1668c++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        mo13526b();
        int i = this.f1668c;
        Object[] objArr = this.f1667b;
        if (i == objArr.length) {
            this.f1667b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1667b;
        int i2 = this.f1668c;
        this.f1668c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    public final Object get(int i) {
        m3073j(i);
        return this.f1667b[i];
    }

    public final Object remove(int i) {
        mo13526b();
        m3073j(i);
        Object[] objArr = this.f1667b;
        Object obj = objArr[i];
        int i2 = this.f1668c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f1668c--;
        this.modCount++;
        return obj;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C1254p8 mo12539s(int i) {
        if (i >= this.f1668c) {
            return new C1334u9(Arrays.copyOf(this.f1667b, i), this.f1668c);
        }
        throw new IllegalArgumentException();
    }

    public final Object set(int i, Object obj) {
        mo13526b();
        m3073j(i);
        Object[] objArr = this.f1667b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f1668c;
    }
}
