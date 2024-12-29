package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.z */
final class C1535z extends C1444g<Double> implements RandomAccess, C1515u0 {

    /* renamed from: d */
    private static final C1535z f1893d;

    /* renamed from: b */
    private double[] f1894b;

    /* renamed from: c */
    private int f1895c;

    static {
        C1535z zVar = new C1535z(new double[0], 0);
        f1893d = zVar;
        zVar.mo13628D();
    }

    C1535z() {
        this(new double[10], 0);
    }

    private C1535z(double[] dArr, int i) {
        this.f1894b = dArr;
        this.f1895c = i;
    }

    /* renamed from: g */
    private final void m4003g(int i) {
        if (i < 0 || i >= this.f1895c) {
            throw new IndexOutOfBoundsException(m4004j(i));
        }
    }

    /* renamed from: j */
    private final String m4004j(int i) {
        int i2 = this.f1895c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo13630b();
        if (i < 0 || i > (i2 = this.f1895c)) {
            throw new IndexOutOfBoundsException(m4004j(i));
        }
        double[] dArr = this.f1894b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f1894b, i, dArr2, i + 1, this.f1895c - i);
            this.f1894b = dArr2;
        }
        this.f1894b[i] = doubleValue;
        this.f1895c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13900e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo13630b();
        C1524w0.m3857a(collection);
        if (!(collection instanceof C1535z)) {
            return super.addAll(collection);
        }
        C1535z zVar = (C1535z) collection;
        int i = zVar.f1895c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1895c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f1894b;
            if (i3 > dArr.length) {
                this.f1894b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zVar.f1894b, 0, this.f1894b, this.f1895c, zVar.f1895c);
            this.f1895c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13900e(double d) {
        mo13630b();
        int i = this.f1895c;
        double[] dArr = this.f1894b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f1894b = dArr2;
        }
        double[] dArr3 = this.f1894b;
        int i2 = this.f1895c;
        this.f1895c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535z)) {
            return super.equals(obj);
        }
        C1535z zVar = (C1535z) obj;
        if (this.f1895c != zVar.f1895c) {
            return false;
        }
        double[] dArr = zVar.f1894b;
        for (int i = 0; i < this.f1895c; i++) {
            if (Double.doubleToLongBits(this.f1894b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m4003g(i);
        return Double.valueOf(this.f1894b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1515u0 mo13609h(int i) {
        if (i >= this.f1895c) {
            return new C1535z(Arrays.copyOf(this.f1894b, i), this.f1895c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1895c; i2++) {
            i = (i * 31) + C1524w0.m3861e(Double.doubleToLongBits(this.f1894b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f1895c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1894b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        m4003g(i);
        double[] dArr = this.f1894b;
        double d = dArr[i];
        int i2 = this.f1895c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f1895c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13630b();
        if (i2 >= i) {
            double[] dArr = this.f1894b;
            System.arraycopy(dArr, i2, dArr, i, this.f1895c - i2);
            this.f1895c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo13630b();
        m4003g(i);
        double[] dArr = this.f1894b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f1895c;
    }
}
