package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d3 */
final class C1749d3 extends C2091z2<Boolean> implements C1999t4<Boolean>, C1858k6, RandomAccess {

    /* renamed from: b */
    private boolean[] f3301b;

    /* renamed from: c */
    private int f3302c;

    static {
        new C1749d3(new boolean[0], 0).mo12092t();
    }

    C1749d3() {
        this(new boolean[10], 0);
    }

    private C1749d3(boolean[] zArr, int i) {
        this.f3301b = zArr;
        this.f3302c = i;
    }

    /* renamed from: e */
    private final void m4964e(int i) {
        if (i < 0 || i >= this.f3302c) {
            throw new IndexOutOfBoundsException(m4965f(i));
        }
    }

    /* renamed from: f */
    private final String m4965f(int i) {
        int i2 = this.f3302c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C1999t4 mo11562a(int i) {
        if (i >= this.f3302c) {
            return new C1749d3(Arrays.copyOf(this.f3301b, i), this.f3302c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12352c();
        if (i < 0 || i > (i2 = this.f3302c)) {
            throw new IndexOutOfBoundsException(m4965f(i));
        }
        boolean[] zArr = this.f3301b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f3301b, i, zArr2, i + 1, this.f3302c - i);
            this.f3301b = zArr2;
        }
        this.f3301b[i] = booleanValue;
        this.f3302c++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo11567d(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo12352c();
        C1925o4.m5642d(collection);
        if (!(collection instanceof C1749d3)) {
            return super.addAll(collection);
        }
        C1749d3 d3Var = (C1749d3) collection;
        int i = d3Var.f3302c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3302c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f3301b;
            if (i3 > zArr.length) {
                this.f3301b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(d3Var.f3301b, 0, this.f3301b, this.f3302c, d3Var.f3302c);
            this.f3302c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo11567d(boolean z) {
        mo12352c();
        int i = this.f3302c;
        boolean[] zArr = this.f3301b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f3301b = zArr2;
        }
        boolean[] zArr3 = this.f3301b;
        int i2 = this.f3302c;
        this.f3302c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749d3)) {
            return super.equals(obj);
        }
        C1749d3 d3Var = (C1749d3) obj;
        if (this.f3302c != d3Var.f3302c) {
            return false;
        }
        boolean[] zArr = d3Var.f3301b;
        for (int i = 0; i < this.f3302c; i++) {
            if (this.f3301b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m4964e(i);
        return Boolean.valueOf(this.f3301b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3302c; i2++) {
            i = (i * 31) + C1925o4.m5641c(this.f3301b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f3301b[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        m4964e(i);
        boolean[] zArr = this.f3301b;
        boolean z = zArr[i];
        int i2 = this.f3302c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f3302c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo12352c();
        for (int i = 0; i < this.f3302c; i++) {
            if (obj.equals(Boolean.valueOf(this.f3301b[i]))) {
                boolean[] zArr = this.f3301b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f3302c - i) - 1);
                this.f3302c--;
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
            boolean[] zArr = this.f3301b;
            System.arraycopy(zArr, i2, zArr, i, this.f3302c - i2);
            this.f3302c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12352c();
        m4964e(i);
        boolean[] zArr = this.f3301b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3302c;
    }
}
