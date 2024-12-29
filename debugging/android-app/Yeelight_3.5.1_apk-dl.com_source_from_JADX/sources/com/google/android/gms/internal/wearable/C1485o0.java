package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.o0 */
final class C1485o0 extends C1444g<Integer> implements RandomAccess, C1515u0 {

    /* renamed from: d */
    private static final C1485o0 f1823d;

    /* renamed from: b */
    private int[] f1824b;

    /* renamed from: c */
    private int f1825c;

    static {
        C1485o0 o0Var = new C1485o0(new int[0], 0);
        f1823d = o0Var;
        o0Var.mo13628D();
    }

    C1485o0() {
        this(new int[10], 0);
    }

    private C1485o0(int[] iArr, int i) {
        this.f1824b = iArr;
        this.f1825c = i;
    }

    /* renamed from: j */
    private final void m3651j(int i) {
        if (i < 0 || i >= this.f1825c) {
            throw new IndexOutOfBoundsException(m3652l(i));
        }
    }

    /* renamed from: l */
    private final String m3652l(int i) {
        int i2 = this.f1825c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo13630b();
        if (i < 0 || i > (i2 = this.f1825c)) {
            throw new IndexOutOfBoundsException(m3652l(i));
        }
        int[] iArr = this.f1824b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f1824b, i, iArr2, i + 1, this.f1825c - i);
            this.f1824b = iArr2;
        }
        this.f1824b[i] = intValue;
        this.f1825c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13736g(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo13630b();
        C1524w0.m3857a(collection);
        if (!(collection instanceof C1485o0)) {
            return super.addAll(collection);
        }
        C1485o0 o0Var = (C1485o0) collection;
        int i = o0Var.f1825c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1825c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f1824b;
            if (i3 > iArr.length) {
                this.f1824b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(o0Var.f1824b, 0, this.f1824b, this.f1825c, o0Var.f1825c);
            this.f1825c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo13735e(int i) {
        m3651j(i);
        return this.f1824b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1485o0)) {
            return super.equals(obj);
        }
        C1485o0 o0Var = (C1485o0) obj;
        if (this.f1825c != o0Var.f1825c) {
            return false;
        }
        int[] iArr = o0Var.f1824b;
        for (int i = 0; i < this.f1825c; i++) {
            if (this.f1824b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo13736g(int i) {
        mo13630b();
        int i2 = this.f1825c;
        int[] iArr = this.f1824b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f1824b = iArr2;
        }
        int[] iArr3 = this.f1824b;
        int i3 = this.f1825c;
        this.f1825c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m3651j(i);
        return Integer.valueOf(this.f1824b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1515u0 mo13609h(int i) {
        if (i >= this.f1825c) {
            return new C1485o0(Arrays.copyOf(this.f1824b, i), this.f1825c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1825c; i2++) {
            i = (i * 31) + this.f1824b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f1825c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1824b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        m3651j(i);
        int[] iArr = this.f1824b;
        int i2 = iArr[i];
        int i3 = this.f1825c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f1825c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13630b();
        if (i2 >= i) {
            int[] iArr = this.f1824b;
            System.arraycopy(iArr, i2, iArr, i, this.f1825c - i2);
            this.f1825c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13630b();
        m3651j(i);
        int[] iArr = this.f1824b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f1825c;
    }
}
