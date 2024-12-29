package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.i0 */
final class C1455i0 extends C1444g<Float> implements RandomAccess, C1505s0, C1525w1 {

    /* renamed from: d */
    private static final C1455i0 f1796d;

    /* renamed from: b */
    private float[] f1797b;

    /* renamed from: c */
    private int f1798c;

    static {
        C1455i0 i0Var = new C1455i0(new float[0], 0);
        f1796d = i0Var;
        i0Var.mo13628D();
    }

    C1455i0() {
        this(new float[10], 0);
    }

    private C1455i0(float[] fArr, int i) {
        this.f1797b = fArr;
        this.f1798c = i;
    }

    /* renamed from: e */
    public static C1455i0 m3552e() {
        return f1796d;
    }

    /* renamed from: j */
    private final void m3553j(int i) {
        if (i < 0 || i >= this.f1798c) {
            throw new IndexOutOfBoundsException(m3554l(i));
        }
    }

    /* renamed from: l */
    private final String m3554l(int i) {
        int i2 = this.f1798c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo13630b();
        if (i < 0 || i > (i2 = this.f1798c)) {
            throw new IndexOutOfBoundsException(m3554l(i));
        }
        float[] fArr = this.f1797b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f1797b, i, fArr2, i + 1, this.f1798c - i);
            this.f1797b = fArr2;
        }
        this.f1797b[i] = floatValue;
        this.f1798c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13654g(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo13630b();
        C1524w0.m3857a(collection);
        if (!(collection instanceof C1455i0)) {
            return super.addAll(collection);
        }
        C1455i0 i0Var = (C1455i0) collection;
        int i = i0Var.f1798c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1798c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f1797b;
            if (i3 > fArr.length) {
                this.f1797b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(i0Var.f1797b, 0, this.f1797b, this.f1798c, i0Var.f1798c);
            this.f1798c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1455i0)) {
            return super.equals(obj);
        }
        C1455i0 i0Var = (C1455i0) obj;
        if (this.f1798c != i0Var.f1798c) {
            return false;
        }
        float[] fArr = i0Var.f1797b;
        for (int i = 0; i < this.f1798c; i++) {
            if (Float.floatToIntBits(this.f1797b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo13654g(float f) {
        mo13630b();
        int i = this.f1798c;
        float[] fArr = this.f1797b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f1797b = fArr2;
        }
        float[] fArr3 = this.f1797b;
        int i2 = this.f1798c;
        this.f1798c = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m3553j(i);
        return Float.valueOf(this.f1797b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1798c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f1797b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C1505s0 mo13609h(int i) {
        if (i >= this.f1798c) {
            return new C1455i0(Arrays.copyOf(this.f1797b, i), this.f1798c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f1798c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1797b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        m3553j(i);
        float[] fArr = this.f1797b;
        float f = fArr[i];
        int i2 = this.f1798c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f1798c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13630b();
        if (i2 >= i) {
            float[] fArr = this.f1797b;
            System.arraycopy(fArr, i2, fArr, i, this.f1798c - i2);
            this.f1798c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo13630b();
        m3553j(i);
        float[] fArr = this.f1797b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f1798c;
    }
}
