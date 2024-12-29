package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
final class C1874l4 extends C2091z2<Float> implements C1999t4<Float>, C1858k6, RandomAccess {

    /* renamed from: b */
    private float[] f3540b;

    /* renamed from: c */
    private int f3541c;

    static {
        new C1874l4(new float[0], 0).mo12092t();
    }

    C1874l4() {
        this(new float[10], 0);
    }

    private C1874l4(float[] fArr, int i) {
        this.f3540b = fArr;
        this.f3541c = i;
    }

    /* renamed from: e */
    private final void m5408e(int i) {
        if (i < 0 || i >= this.f3541c) {
            throw new IndexOutOfBoundsException(m5409f(i));
        }
    }

    /* renamed from: f */
    private final String m5409f(int i) {
        int i2 = this.f3541c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C1999t4 mo11562a(int i) {
        if (i >= this.f3541c) {
            return new C1874l4(Arrays.copyOf(this.f3540b, i), this.f3541c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo12352c();
        if (i < 0 || i > (i2 = this.f3541c)) {
            throw new IndexOutOfBoundsException(m5409f(i));
        }
        float[] fArr = this.f3540b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f3540b, i, fArr2, i + 1, this.f3541c - i);
            this.f3540b = fArr2;
        }
        this.f3540b[i] = floatValue;
        this.f3541c++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo11795d(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo12352c();
        C1925o4.m5642d(collection);
        if (!(collection instanceof C1874l4)) {
            return super.addAll(collection);
        }
        C1874l4 l4Var = (C1874l4) collection;
        int i = l4Var.f3541c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3541c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f3540b;
            if (i3 > fArr.length) {
                this.f3540b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(l4Var.f3540b, 0, this.f3540b, this.f3541c, l4Var.f3541c);
            this.f3541c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo11795d(float f) {
        mo12352c();
        int i = this.f3541c;
        float[] fArr = this.f3540b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f3540b = fArr2;
        }
        float[] fArr3 = this.f3540b;
        int i2 = this.f3541c;
        this.f3541c = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1874l4)) {
            return super.equals(obj);
        }
        C1874l4 l4Var = (C1874l4) obj;
        if (this.f3541c != l4Var.f3541c) {
            return false;
        }
        float[] fArr = l4Var.f3540b;
        for (int i = 0; i < this.f3541c; i++) {
            if (Float.floatToIntBits(this.f3540b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m5408e(i);
        return Float.valueOf(this.f3540b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3541c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f3540b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f3540b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        m5408e(i);
        float[] fArr = this.f3540b;
        float f = fArr[i];
        int i2 = this.f3541c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f3541c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo12352c();
        for (int i = 0; i < this.f3541c; i++) {
            if (obj.equals(Float.valueOf(this.f3540b[i]))) {
                float[] fArr = this.f3540b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f3541c - i) - 1);
                this.f3541c--;
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
            float[] fArr = this.f3540b;
            System.arraycopy(fArr, i2, fArr, i, this.f3541c - i2);
            this.f3541c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo12352c();
        m5408e(i);
        float[] fArr = this.f3540b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f3541c;
    }
}
