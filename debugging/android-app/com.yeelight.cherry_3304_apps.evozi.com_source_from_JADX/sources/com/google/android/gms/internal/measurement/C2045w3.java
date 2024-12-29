package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w3 */
final class C2045w3 extends C2091z2<Double> implements C1999t4<Double>, C1858k6, RandomAccess {

    /* renamed from: b */
    private double[] f3800b;

    /* renamed from: c */
    private int f3801c;

    static {
        new C2045w3(new double[0], 0).mo12092t();
    }

    C2045w3() {
        this(new double[10], 0);
    }

    private C2045w3(double[] dArr, int i) {
        this.f3800b = dArr;
        this.f3801c = i;
    }

    /* renamed from: e */
    private final void m6261e(int i) {
        if (i < 0 || i >= this.f3801c) {
            throw new IndexOutOfBoundsException(m6262f(i));
        }
    }

    /* renamed from: f */
    private final String m6262f(int i) {
        int i2 = this.f3801c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C1999t4 mo11562a(int i) {
        if (i >= this.f3801c) {
            return new C2045w3(Arrays.copyOf(this.f3800b, i), this.f3801c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo12352c();
        if (i < 0 || i > (i2 = this.f3801c)) {
            throw new IndexOutOfBoundsException(m6262f(i));
        }
        double[] dArr = this.f3800b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f3800b, i, dArr2, i + 1, this.f3801c - i);
            this.f3800b = dArr2;
        }
        this.f3800b[i] = doubleValue;
        this.f3801c++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12171d(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo12352c();
        C1925o4.m5642d(collection);
        if (!(collection instanceof C2045w3)) {
            return super.addAll(collection);
        }
        C2045w3 w3Var = (C2045w3) collection;
        int i = w3Var.f3801c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3801c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f3800b;
            if (i3 > dArr.length) {
                this.f3800b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(w3Var.f3800b, 0, this.f3800b, this.f3801c, w3Var.f3801c);
            this.f3801c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo12171d(double d) {
        mo12352c();
        int i = this.f3801c;
        double[] dArr = this.f3800b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f3800b = dArr2;
        }
        double[] dArr3 = this.f3800b;
        int i2 = this.f3801c;
        this.f3801c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2045w3)) {
            return super.equals(obj);
        }
        C2045w3 w3Var = (C2045w3) obj;
        if (this.f3801c != w3Var.f3801c) {
            return false;
        }
        double[] dArr = w3Var.f3800b;
        for (int i = 0; i < this.f3801c; i++) {
            if (Double.doubleToLongBits(this.f3800b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m6261e(i);
        return Double.valueOf(this.f3800b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3801c; i2++) {
            i = (i * 31) + C1925o4.m5640b(Double.doubleToLongBits(this.f3800b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f3800b[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        m6261e(i);
        double[] dArr = this.f3800b;
        double d = dArr[i];
        int i2 = this.f3801c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f3801c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo12352c();
        for (int i = 0; i < this.f3801c; i++) {
            if (obj.equals(Double.valueOf(this.f3800b[i]))) {
                double[] dArr = this.f3800b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f3801c - i) - 1);
                this.f3801c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo12352c();
        if (i2 >= i) {
            double[] dArr = this.f3800b;
            System.arraycopy(dArr, i2, dArr, i, this.f3801c - i2);
            this.f3801c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo12352c();
        m6261e(i);
        double[] dArr = this.f3800b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f3801c;
    }
}
