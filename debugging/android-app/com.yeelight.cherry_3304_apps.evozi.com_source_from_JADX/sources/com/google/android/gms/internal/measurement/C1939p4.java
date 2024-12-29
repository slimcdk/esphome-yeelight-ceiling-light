package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
final class C1939p4 extends C2091z2<Integer> implements C1969r4, C1858k6, RandomAccess {

    /* renamed from: d */
    private static final C1939p4 f3667d;

    /* renamed from: b */
    private int[] f3668b;

    /* renamed from: c */
    private int f3669c;

    static {
        C1939p4 p4Var = new C1939p4(new int[0], 0);
        f3667d = p4Var;
        p4Var.mo12092t();
    }

    C1939p4() {
        this(new int[10], 0);
    }

    private C1939p4(int[] iArr, int i) {
        this.f3668b = iArr;
        this.f3669c = i;
    }

    /* renamed from: e */
    public static C1939p4 m5757e() {
        return f3667d;
    }

    /* renamed from: g */
    private final void m5758g(int i) {
        if (i < 0 || i >= this.f3669c) {
            throw new IndexOutOfBoundsException(m5759h(i));
        }
    }

    /* renamed from: h */
    private final String m5759h(int i) {
        int i2 = this.f3669c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo12352c();
        if (i < 0 || i > (i2 = this.f3669c)) {
            throw new IndexOutOfBoundsException(m5759h(i));
        }
        int[] iArr = this.f3668b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f3668b, i, iArr2, i + 1, this.f3669c - i);
            this.f3668b = iArr2;
        }
        this.f3668b[i] = intValue;
        this.f3669c++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo11940f(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo12352c();
        C1925o4.m5642d(collection);
        if (!(collection instanceof C1939p4)) {
            return super.addAll(collection);
        }
        C1939p4 p4Var = (C1939p4) collection;
        int i = p4Var.f3669c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3669c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f3668b;
            if (i3 > iArr.length) {
                this.f3668b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(p4Var.f3668b, 0, this.f3668b, this.f3669c, p4Var.f3669c);
            this.f3669c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final C1969r4 mo11562a(int i) {
        if (i >= this.f3669c) {
            return new C1939p4(Arrays.copyOf(this.f3668b, i), this.f3669c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int mo11939d(int i) {
        m5758g(i);
        return this.f3668b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1939p4)) {
            return super.equals(obj);
        }
        C1939p4 p4Var = (C1939p4) obj;
        if (this.f3669c != p4Var.f3669c) {
            return false;
        }
        int[] iArr = p4Var.f3668b;
        for (int i = 0; i < this.f3669c; i++) {
            if (this.f3668b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo11940f(int i) {
        mo12352c();
        int i2 = this.f3669c;
        int[] iArr = this.f3668b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3668b = iArr2;
        }
        int[] iArr3 = this.f3668b;
        int i3 = this.f3669c;
        this.f3669c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo11939d(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3669c; i2++) {
            i = (i * 31) + this.f3668b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f3668b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12352c();
        m5758g(i);
        int[] iArr = this.f3668b;
        int i2 = iArr[i];
        int i3 = this.f3669c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f3669c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo12352c();
        for (int i = 0; i < this.f3669c; i++) {
            if (obj.equals(Integer.valueOf(this.f3668b[i]))) {
                int[] iArr = this.f3668b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f3669c - i) - 1);
                this.f3669c--;
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
            int[] iArr = this.f3668b;
            System.arraycopy(iArr, i2, iArr, i, this.f3669c - i2);
            this.f3669c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo12352c();
        m5758g(i);
        int[] iArr = this.f3668b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f3669c;
    }
}
