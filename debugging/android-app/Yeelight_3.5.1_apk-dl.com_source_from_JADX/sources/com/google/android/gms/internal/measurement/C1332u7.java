package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u7 */
final class C1332u7 extends C1406z6 implements RandomAccess, C1303s9 {

    /* renamed from: d */
    private static final C1332u7 f1663d;

    /* renamed from: b */
    private double[] f1664b;

    /* renamed from: c */
    private int f1665c;

    static {
        C1332u7 u7Var = new C1332u7(new double[0], 0);
        f1663d = u7Var;
        u7Var.mo13071D();
    }

    C1332u7() {
        this(new double[10], 0);
    }

    private C1332u7(double[] dArr, int i) {
        this.f1664b = dArr;
        this.f1665c = i;
    }

    /* renamed from: g */
    private final String m3067g(int i) {
        int i2 = this.f1665c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m3068j(int i) {
        if (i < 0 || i >= this.f1665c) {
            throw new IndexOutOfBoundsException(m3067g(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo13526b();
        if (i < 0 || i > (i2 = this.f1665c)) {
            throw new IndexOutOfBoundsException(m3067g(i));
        }
        double[] dArr = this.f1664b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f1664b, i, dArr2, i + 1, this.f1665c - i);
            this.f1664b = dArr2;
        }
        this.f1664b[i] = doubleValue;
        this.f1665c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13400e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo13526b();
        C1270q8.m2546e(collection);
        if (!(collection instanceof C1332u7)) {
            return super.addAll(collection);
        }
        C1332u7 u7Var = (C1332u7) collection;
        int i = u7Var.f1665c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1665c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f1664b;
            if (i3 > dArr.length) {
                this.f1664b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(u7Var.f1664b, 0, this.f1664b, this.f1665c, u7Var.f1665c);
            this.f1665c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13400e(double d) {
        mo13526b();
        int i = this.f1665c;
        double[] dArr = this.f1664b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f1664b = dArr2;
        }
        double[] dArr3 = this.f1664b;
        int i2 = this.f1665c;
        this.f1665c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1332u7)) {
            return super.equals(obj);
        }
        C1332u7 u7Var = (C1332u7) obj;
        if (this.f1665c != u7Var.f1665c) {
            return false;
        }
        double[] dArr = u7Var.f1664b;
        for (int i = 0; i < this.f1665c; i++) {
            if (Double.doubleToLongBits(this.f1664b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m3068j(i);
        return Double.valueOf(this.f1664b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1665c; i2++) {
            i = (i * 31) + C1270q8.m2544c(Double.doubleToLongBits(this.f1664b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f1665c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1664b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        m3068j(i);
        double[] dArr = this.f1664b;
        double d = dArr[i];
        int i2 = this.f1665c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f1665c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13526b();
        if (i2 >= i) {
            double[] dArr = this.f1664b;
            System.arraycopy(dArr, i2, dArr, i, this.f1665c - i2);
            this.f1665c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C1254p8 mo12539s(int i) {
        if (i >= this.f1665c) {
            return new C1332u7(Arrays.copyOf(this.f1664b, i), this.f1665c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo13526b();
        m3068j(i);
        double[] dArr = this.f1664b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f1665c;
    }
}
