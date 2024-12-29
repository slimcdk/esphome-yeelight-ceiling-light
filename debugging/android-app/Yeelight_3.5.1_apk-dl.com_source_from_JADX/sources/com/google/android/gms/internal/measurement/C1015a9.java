package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
final class C1015a9 extends C1406z6 implements RandomAccess, C1238o8, C1303s9 {

    /* renamed from: d */
    private static final C1015a9 f1233d;

    /* renamed from: b */
    private long[] f1234b;

    /* renamed from: c */
    private int f1235c;

    static {
        C1015a9 a9Var = new C1015a9(new long[0], 0);
        f1233d = a9Var;
        a9Var.mo13071D();
    }

    C1015a9() {
        this(new long[10], 0);
    }

    private C1015a9(long[] jArr, int i) {
        this.f1234b = jArr;
        this.f1235c = i;
    }

    /* renamed from: e */
    public static C1015a9 m1685e() {
        return f1233d;
    }

    /* renamed from: j */
    private final String m1686j(int i) {
        int i2 = this.f1235c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: l */
    private final void m1687l(int i) {
        if (i < 0 || i >= this.f1235c) {
            throw new IndexOutOfBoundsException(m1686j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo13526b();
        if (i < 0 || i > (i2 = this.f1235c)) {
            throw new IndexOutOfBoundsException(m1686j(i));
        }
        long[] jArr = this.f1234b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f1234b, i, jArr2, i + 1, this.f1235c - i);
            this.f1234b = jArr2;
        }
        this.f1234b[i] = longValue;
        this.f1235c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12532g(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo13526b();
        C1270q8.m2546e(collection);
        if (!(collection instanceof C1015a9)) {
            return super.addAll(collection);
        }
        C1015a9 a9Var = (C1015a9) collection;
        int i = a9Var.f1235c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1235c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f1234b;
            if (i3 > jArr.length) {
                this.f1234b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(a9Var.f1234b, 0, this.f1234b, this.f1235c, a9Var.f1235c);
            this.f1235c = i3;
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
        if (!(obj instanceof C1015a9)) {
            return super.equals(obj);
        }
        C1015a9 a9Var = (C1015a9) obj;
        if (this.f1235c != a9Var.f1235c) {
            return false;
        }
        long[] jArr = a9Var.f1234b;
        for (int i = 0; i < this.f1235c; i++) {
            if (this.f1234b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo12531f(int i) {
        m1687l(i);
        return this.f1234b[i];
    }

    /* renamed from: g */
    public final void mo12532g(long j) {
        mo13526b();
        int i = this.f1235c;
        long[] jArr = this.f1234b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f1234b = jArr2;
        }
        long[] jArr3 = this.f1234b;
        int i2 = this.f1235c;
        this.f1235c = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m1687l(i);
        return Long.valueOf(this.f1234b[i]);
    }

    /* renamed from: h */
    public final C1238o8 mo12539s(int i) {
        if (i >= this.f1235c) {
            return new C1015a9(Arrays.copyOf(this.f1234b, i), this.f1235c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1235c; i2++) {
            i = (i * 31) + C1270q8.m2544c(this.f1234b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f1235c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1234b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13526b();
        m1687l(i);
        long[] jArr = this.f1234b;
        long j = jArr[i];
        int i2 = this.f1235c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f1235c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13526b();
        if (i2 >= i) {
            long[] jArr = this.f1234b;
            System.arraycopy(jArr, i2, jArr, i, this.f1235c - i2);
            this.f1235c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13526b();
        m1687l(i);
        long[] jArr = this.f1234b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f1235c;
    }
}
