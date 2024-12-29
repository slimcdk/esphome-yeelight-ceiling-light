package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d8 */
final class C1062d8 extends C1406z6 implements RandomAccess, C1303s9 {

    /* renamed from: d */
    private static final C1062d8 f1285d;

    /* renamed from: b */
    private float[] f1286b;

    /* renamed from: c */
    private int f1287c;

    static {
        C1062d8 d8Var = new C1062d8(new float[0], 0);
        f1285d = d8Var;
        d8Var.mo13071D();
    }

    C1062d8() {
        this(new float[10], 0);
    }

    private C1062d8(float[] fArr, int i) {
        this.f1286b = fArr;
        this.f1287c = i;
    }

    /* renamed from: g */
    private final String m1819g(int i) {
        int i2 = this.f1287c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m1820j(int i) {
        if (i < 0 || i >= this.f1287c) {
            throw new IndexOutOfBoundsException(m1819g(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo13526b();
        if (i < 0 || i > (i2 = this.f1287c)) {
            throw new IndexOutOfBoundsException(m1819g(i));
        }
        float[] fArr = this.f1286b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f1286b, i, fArr2, i + 1, this.f1287c - i);
            this.f1286b = fArr2;
        }
        this.f1286b[i] = floatValue;
        this.f1287c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12661e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo13526b();
        C1270q8.m2546e(collection);
        if (!(collection instanceof C1062d8)) {
            return super.addAll(collection);
        }
        C1062d8 d8Var = (C1062d8) collection;
        int i = d8Var.f1287c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1287c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f1286b;
            if (i3 > fArr.length) {
                this.f1286b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(d8Var.f1286b, 0, this.f1286b, this.f1287c, d8Var.f1287c);
            this.f1287c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo12661e(float f) {
        mo13526b();
        int i = this.f1287c;
        float[] fArr = this.f1286b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f1286b = fArr2;
        }
        float[] fArr3 = this.f1286b;
        int i2 = this.f1287c;
        this.f1287c = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062d8)) {
            return super.equals(obj);
        }
        C1062d8 d8Var = (C1062d8) obj;
        if (this.f1287c != d8Var.f1287c) {
            return false;
        }
        float[] fArr = d8Var.f1286b;
        for (int i = 0; i < this.f1287c; i++) {
            if (Float.floatToIntBits(this.f1286b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m1820j(i);
        return Float.valueOf(this.f1286b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1287c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f1286b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f1287c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1286b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        m1820j(i);
        float[] fArr = this.f1286b;
        float f = fArr[i];
        int i2 = this.f1287c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f1287c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13526b();
        if (i2 >= i) {
            float[] fArr = this.f1286b;
            System.arraycopy(fArr, i2, fArr, i, this.f1287c - i2);
            this.f1287c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C1254p8 mo12539s(int i) {
        if (i >= this.f1287c) {
            return new C1062d8(Arrays.copyOf(this.f1286b, i), this.f1287c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo13526b();
        m1820j(i);
        float[] fArr = this.f1286b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f1287c;
    }
}
