package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
final class C1190l8 extends C1406z6 implements RandomAccess, C1222n8, C1303s9 {

    /* renamed from: d */
    private static final C1190l8 f1406d;

    /* renamed from: b */
    private int[] f1407b;

    /* renamed from: c */
    private int f1408c;

    static {
        C1190l8 l8Var = new C1190l8(new int[0], 0);
        f1406d = l8Var;
        l8Var.mo13071D();
    }

    C1190l8() {
        this(new int[10], 0);
    }

    private C1190l8(int[] iArr, int i) {
        this.f1407b = iArr;
        this.f1408c = i;
    }

    /* renamed from: g */
    public static C1190l8 m2230g() {
        return f1406d;
    }

    /* renamed from: l */
    private final String m2231l(int i) {
        int i2 = this.f1408c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: m */
    private final void m2232m(int i) {
        if (i < 0 || i >= this.f1408c) {
            throw new IndexOutOfBoundsException(m2231l(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo13526b();
        if (i < 0 || i > (i2 = this.f1408c)) {
            throw new IndexOutOfBoundsException(m2231l(i));
        }
        int[] iArr = this.f1407b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f1407b, i, iArr2, i + 1, this.f1408c - i);
            this.f1407b = iArr2;
        }
        this.f1407b[i] = intValue;
        this.f1408c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12969j(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo13526b();
        C1270q8.m2546e(collection);
        if (!(collection instanceof C1190l8)) {
            return super.addAll(collection);
        }
        C1190l8 l8Var = (C1190l8) collection;
        int i = l8Var.f1408c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1408c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f1407b;
            if (i3 > iArr.length) {
                this.f1407b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(l8Var.f1407b, 0, this.f1407b, this.f1408c, l8Var.f1408c);
            this.f1408c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo12966e(int i) {
        m2232m(i);
        return this.f1407b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190l8)) {
            return super.equals(obj);
        }
        C1190l8 l8Var = (C1190l8) obj;
        if (this.f1408c != l8Var.f1408c) {
            return false;
        }
        int[] iArr = l8Var.f1407b;
        for (int i = 0; i < this.f1408c; i++) {
            if (this.f1407b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m2232m(i);
        return Integer.valueOf(this.f1407b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1408c; i2++) {
            i = (i * 31) + this.f1407b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f1408c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1407b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo12969j(int i) {
        mo13526b();
        int i2 = this.f1408c;
        int[] iArr = this.f1407b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f1407b = iArr2;
        }
        int[] iArr3 = this.f1407b;
        int i3 = this.f1408c;
        this.f1408c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: p */
    public final C1222n8 mo12539s(int i) {
        if (i >= this.f1408c) {
            return new C1190l8(Arrays.copyOf(this.f1407b, i), this.f1408c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        m2232m(i);
        int[] iArr = this.f1407b;
        int i2 = iArr[i];
        int i3 = this.f1408c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f1408c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13526b();
        if (i2 >= i) {
            int[] iArr = this.f1407b;
            System.arraycopy(iArr, i2, iArr, i, this.f1408c - i2);
            this.f1408c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13526b();
        m2232m(i);
        int[] iArr = this.f1407b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f1408c;
    }
}
