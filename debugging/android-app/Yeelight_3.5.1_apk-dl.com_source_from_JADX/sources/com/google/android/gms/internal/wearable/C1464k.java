package com.google.android.gms.internal.wearable;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.k */
final class C1464k extends C1444g<Boolean> implements RandomAccess, C1515u0 {

    /* renamed from: d */
    private static final C1464k f1805d;

    /* renamed from: b */
    private boolean[] f1806b;

    /* renamed from: c */
    private int f1807c;

    static {
        C1464k kVar = new C1464k(new boolean[0], 0);
        f1805d = kVar;
        kVar.mo13628D();
    }

    C1464k() {
        this(new boolean[10], 0);
    }

    private C1464k(boolean[] zArr, int i) {
        this.f1806b = zArr;
        this.f1807c = i;
    }

    /* renamed from: g */
    private final void m3579g(int i) {
        if (i < 0 || i >= this.f1807c) {
            throw new IndexOutOfBoundsException(m3580j(i));
        }
    }

    /* renamed from: j */
    private final String m3580j(int i) {
        int i2 = this.f1807c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13630b();
        if (i < 0 || i > (i2 = this.f1807c)) {
            throw new IndexOutOfBoundsException(m3580j(i));
        }
        boolean[] zArr = this.f1806b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f1806b, i, zArr2, i + 1, this.f1807c - i);
            this.f1806b = zArr2;
        }
        this.f1806b[i] = booleanValue;
        this.f1807c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13673e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo13630b();
        C1524w0.m3857a(collection);
        if (!(collection instanceof C1464k)) {
            return super.addAll(collection);
        }
        C1464k kVar = (C1464k) collection;
        int i = kVar.f1807c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1807c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f1806b;
            if (i3 > zArr.length) {
                this.f1806b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(kVar.f1806b, 0, this.f1806b, this.f1807c, kVar.f1807c);
            this.f1807c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13673e(boolean z) {
        mo13630b();
        int i = this.f1807c;
        boolean[] zArr = this.f1806b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f1806b = zArr2;
        }
        boolean[] zArr3 = this.f1806b;
        int i2 = this.f1807c;
        this.f1807c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464k)) {
            return super.equals(obj);
        }
        C1464k kVar = (C1464k) obj;
        if (this.f1807c != kVar.f1807c) {
            return false;
        }
        boolean[] zArr = kVar.f1806b;
        for (int i = 0; i < this.f1807c; i++) {
            if (this.f1806b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m3579g(i);
        return Boolean.valueOf(this.f1806b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1515u0 mo13609h(int i) {
        if (i >= this.f1807c) {
            return new C1464k(Arrays.copyOf(this.f1806b, i), this.f1807c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1807c; i2++) {
            i = (i * 31) + C1524w0.m3862f(this.f1806b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f1807c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1806b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13630b();
        m3579g(i);
        boolean[] zArr = this.f1806b;
        boolean z = zArr[i];
        int i2 = this.f1807c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f1807c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13630b();
        if (i2 >= i) {
            boolean[] zArr = this.f1806b;
            System.arraycopy(zArr, i2, zArr, i, this.f1807c - i2);
            this.f1807c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo13630b();
        m3579g(i);
        boolean[] zArr = this.f1806b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f1807c;
    }
}
