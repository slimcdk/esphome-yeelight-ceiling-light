package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.e1 */
final class C1436e1 extends C1444g<Long> implements RandomAccess, C1510t0, C1525w1 {

    /* renamed from: d */
    private static final C1436e1 f1769d;

    /* renamed from: b */
    private long[] f1770b;

    /* renamed from: c */
    private int f1771c;

    static {
        C1436e1 e1Var = new C1436e1(new long[0], 0);
        f1769d = e1Var;
        e1Var.mo13628D();
    }

    C1436e1() {
        this(new long[10], 0);
    }

    private C1436e1(long[] jArr, int i) {
        this.f1770b = jArr;
        this.f1771c = i;
    }

    /* renamed from: e */
    public static C1436e1 m3514e() {
        return f1769d;
    }

    /* renamed from: l */
    private final void m3515l(int i) {
        if (i < 0 || i >= this.f1771c) {
            throw new IndexOutOfBoundsException(m3516m(i));
        }
    }

    /* renamed from: m */
    private final String m3516m(int i) {
        int i2 = this.f1771c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo13630b();
        if (i < 0 || i > (i2 = this.f1771c)) {
            throw new IndexOutOfBoundsException(m3516m(i));
        }
        long[] jArr = this.f1770b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f1770b, i, jArr2, i + 1, this.f1771c - i);
            this.f1770b = jArr2;
        }
        this.f1770b[i] = longValue;
        this.f1771c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13612j(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo13630b();
        C1524w0.m3857a(collection);
        if (!(collection instanceof C1436e1)) {
            return super.addAll(collection);
        }
        C1436e1 e1Var = (C1436e1) collection;
        int i = e1Var.f1771c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1771c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f1770b;
            if (i3 > jArr.length) {
                this.f1770b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(e1Var.f1770b, 0, this.f1770b, this.f1771c, e1Var.f1771c);
            this.f1771c = i3;
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
        if (!(obj instanceof C1436e1)) {
            return super.equals(obj);
        }
        C1436e1 e1Var = (C1436e1) obj;
        if (this.f1771c != e1Var.f1771c) {
            return false;
        }
        long[] jArr = e1Var.f1770b;
        for (int i = 0; i < this.f1771c; i++) {
            if (this.f1770b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final long mo13607g(int i) {
        m3515l(i);
        return this.f1770b[i];
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m3515l(i);
        return Long.valueOf(this.f1770b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1771c; i2++) {
            i = (i * 31) + C1524w0.m3861e(this.f1770b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f1771c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1770b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo13612j(long j) {
        mo13630b();
        int i = this.f1771c;
        long[] jArr = this.f1770b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f1770b = jArr2;
        }
        long[] jArr3 = this.f1770b;
        int i2 = this.f1771c;
        this.f1771c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: k */
    public final C1510t0 mo13609h(int i) {
        if (i >= this.f1771c) {
            return new C1436e1(Arrays.copyOf(this.f1770b, i), this.f1771c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        m3515l(i);
        long[] jArr = this.f1770b;
        long j = jArr[i];
        int i2 = this.f1771c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f1771c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13630b();
        if (i2 >= i) {
            long[] jArr = this.f1770b;
            System.arraycopy(jArr, i2, jArr, i, this.f1771c - i2);
            this.f1771c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13630b();
        m3515l(i);
        long[] jArr = this.f1770b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f1771c;
    }
}
