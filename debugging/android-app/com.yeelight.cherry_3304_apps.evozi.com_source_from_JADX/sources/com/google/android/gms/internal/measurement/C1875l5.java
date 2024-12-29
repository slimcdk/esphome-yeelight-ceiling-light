package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
final class C1875l5 extends C2091z2<Long> implements C2014u4, C1858k6, RandomAccess {

    /* renamed from: d */
    private static final C1875l5 f3542d;

    /* renamed from: b */
    private long[] f3543b;

    /* renamed from: c */
    private int f3544c;

    static {
        C1875l5 l5Var = new C1875l5(new long[0], 0);
        f3542d = l5Var;
        l5Var.mo12092t();
    }

    C1875l5() {
        this(new long[10], 0);
    }

    private C1875l5(long[] jArr, int i) {
        this.f3543b = jArr;
        this.f3544c = i;
    }

    /* renamed from: e */
    public static C1875l5 m5412e() {
        return f3542d;
    }

    /* renamed from: f */
    private final void m5413f(int i) {
        if (i < 0 || i >= this.f3544c) {
            throw new IndexOutOfBoundsException(m5414g(i));
        }
    }

    /* renamed from: g */
    private final String m5414g(int i) {
        int i2 = this.f3544c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo12352c();
        if (i < 0 || i > (i2 = this.f3544c)) {
            throw new IndexOutOfBoundsException(m5414g(i));
        }
        long[] jArr = this.f3543b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f3543b, i, jArr2, i + 1, this.f3544c - i);
            this.f3543b = jArr2;
        }
        this.f3543b[i] = longValue;
        this.f3544c++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo11805d(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo12352c();
        C1925o4.m5642d(collection);
        if (!(collection instanceof C1875l5)) {
            return super.addAll(collection);
        }
        C1875l5 l5Var = (C1875l5) collection;
        int i = l5Var.f3544c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3544c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f3543b;
            if (i3 > jArr.length) {
                this.f3543b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(l5Var.f3543b, 0, this.f3543b, this.f3544c, l5Var.f3544c);
            this.f3544c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long mo11803b(int i) {
        m5413f(i);
        return this.f3543b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo11805d(long j) {
        mo12352c();
        int i = this.f3544c;
        long[] jArr = this.f3543b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f3543b = jArr2;
        }
        long[] jArr3 = this.f3543b;
        int i2 = this.f3544c;
        this.f3544c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: d0 */
    public final C2014u4 mo11562a(int i) {
        if (i >= this.f3544c) {
            return new C1875l5(Arrays.copyOf(this.f3543b, i), this.f3544c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875l5)) {
            return super.equals(obj);
        }
        C1875l5 l5Var = (C1875l5) obj;
        if (this.f3544c != l5Var.f3544c) {
            return false;
        }
        long[] jArr = l5Var.f3543b;
        for (int i = 0; i < this.f3544c; i++) {
            if (this.f3543b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo11803b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3544c; i2++) {
            i = (i * 31) + C1925o4.m5640b(this.f3543b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f3543b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        m5413f(i);
        long[] jArr = this.f3543b;
        long j = jArr[i];
        int i2 = this.f3544c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f3544c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo12352c();
        for (int i = 0; i < this.f3544c; i++) {
            if (obj.equals(Long.valueOf(this.f3543b[i]))) {
                long[] jArr = this.f3543b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f3544c - i) - 1);
                this.f3544c--;
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
            long[] jArr = this.f3543b;
            System.arraycopy(jArr, i2, jArr, i, this.f3544c - i2);
            this.f3544c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo12352c();
        m5413f(i);
        long[] jArr = this.f3543b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f3544c;
    }
}
