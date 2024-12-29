package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
final class C1061d7 extends C1406z6 implements RandomAccess, C1303s9 {

    /* renamed from: d */
    private static final C1061d7 f1282d;

    /* renamed from: b */
    private boolean[] f1283b;

    /* renamed from: c */
    private int f1284c;

    static {
        C1061d7 d7Var = new C1061d7(new boolean[0], 0);
        f1282d = d7Var;
        d7Var.mo13071D();
    }

    C1061d7() {
        this(new boolean[10], 0);
    }

    private C1061d7(boolean[] zArr, int i) {
        this.f1283b = zArr;
        this.f1284c = i;
    }

    /* renamed from: g */
    private final String m1815g(int i) {
        int i2 = this.f1284c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m1816j(int i) {
        if (i < 0 || i >= this.f1284c) {
            throw new IndexOutOfBoundsException(m1815g(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13526b();
        if (i < 0 || i > (i2 = this.f1284c)) {
            throw new IndexOutOfBoundsException(m1815g(i));
        }
        boolean[] zArr = this.f1283b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f1283b, i, zArr2, i + 1, this.f1284c - i);
            this.f1283b = zArr2;
        }
        this.f1283b[i] = booleanValue;
        this.f1284c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12653e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo13526b();
        C1270q8.m2546e(collection);
        if (!(collection instanceof C1061d7)) {
            return super.addAll(collection);
        }
        C1061d7 d7Var = (C1061d7) collection;
        int i = d7Var.f1284c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1284c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f1283b;
            if (i3 > zArr.length) {
                this.f1283b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(d7Var.f1283b, 0, this.f1283b, this.f1284c, d7Var.f1284c);
            this.f1284c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo12653e(boolean z) {
        mo13526b();
        int i = this.f1284c;
        boolean[] zArr = this.f1283b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f1283b = zArr2;
        }
        boolean[] zArr3 = this.f1283b;
        int i2 = this.f1284c;
        this.f1284c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1061d7)) {
            return super.equals(obj);
        }
        C1061d7 d7Var = (C1061d7) obj;
        if (this.f1284c != d7Var.f1284c) {
            return false;
        }
        boolean[] zArr = d7Var.f1283b;
        for (int i = 0; i < this.f1284c; i++) {
            if (this.f1283b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m1816j(i);
        return Boolean.valueOf(this.f1283b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1284c; i2++) {
            i = (i * 31) + C1270q8.m2542a(this.f1283b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f1284c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1283b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        m1816j(i);
        boolean[] zArr = this.f1283b;
        boolean z = zArr[i];
        int i2 = this.f1284c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f1284c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13526b();
        if (i2 >= i) {
            boolean[] zArr = this.f1283b;
            System.arraycopy(zArr, i2, zArr, i, this.f1284c - i2);
            this.f1284c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C1254p8 mo12539s(int i) {
        if (i >= this.f1284c) {
            return new C1061d7(Arrays.copyOf(this.f1283b, i), this.f1284c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13526b();
        m1816j(i);
        boolean[] zArr = this.f1283b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f1284c;
    }
}
