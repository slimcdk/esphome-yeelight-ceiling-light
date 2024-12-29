package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.wearable.o2 */
public final class C1487o2 {

    /* renamed from: f */
    private static final C1487o2 f1826f = new C1487o2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f1827a;

    /* renamed from: b */
    private int[] f1828b;

    /* renamed from: c */
    private Object[] f1829c;

    /* renamed from: d */
    private int f1830d;

    /* renamed from: e */
    private boolean f1831e;

    private C1487o2() {
        this(0, new int[8], new Object[8], true);
    }

    private C1487o2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f1830d = -1;
        this.f1827a = i;
        this.f1828b = iArr;
        this.f1829c = objArr;
        this.f1831e = z;
    }

    /* renamed from: a */
    public static C1487o2 m3661a() {
        return f1826f;
    }

    /* renamed from: b */
    static C1487o2 m3662b() {
        return new C1487o2(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    static C1487o2 m3663c(C1487o2 o2Var, C1487o2 o2Var2) {
        int i = o2Var.f1827a + o2Var2.f1827a;
        int[] copyOf = Arrays.copyOf(o2Var.f1828b, i);
        System.arraycopy(o2Var2.f1828b, 0, copyOf, o2Var.f1827a, o2Var2.f1827a);
        Object[] copyOf2 = Arrays.copyOf(o2Var.f1829c, i);
        System.arraycopy(o2Var2.f1829c, 0, copyOf2, o2Var.f1827a, o2Var2.f1827a);
        return new C1487o2(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public final void mo13742d() {
        this.f1831e = false;
    }

    /* renamed from: e */
    public final int mo13743e() {
        int i = this.f1830d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1827a; i3++) {
            int i4 = this.f1828b[i3];
            int A = C1527x.m3873A(8);
            int zzc = ((zzau) this.f1829c[i3]).zzc();
            i2 += A + A + C1527x.m3873A(16) + C1527x.m3873A(i4 >>> 3) + C1527x.m3873A(24) + C1527x.m3873A(zzc) + zzc;
        }
        this.f1830d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1487o2)) {
            return false;
        }
        C1487o2 o2Var = (C1487o2) obj;
        int i = this.f1827a;
        if (i == o2Var.f1827a) {
            int[] iArr = this.f1828b;
            int[] iArr2 = o2Var.f1828b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f1829c;
                    Object[] objArr2 = o2Var.f1829c;
                    int i3 = this.f1827a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo13745f() {
        int i;
        int i2;
        int i3;
        int i4 = this.f1830d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1827a; i6++) {
            int i7 = this.f1828b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f1829c[i6]).longValue();
                    i = C1527x.m3873A(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int A = C1527x.m3873A(i8 << 3);
                    int zzc = ((zzau) this.f1829c[i6]).zzc();
                    i5 += A + C1527x.m3873A(zzc) + zzc;
                } else if (i9 == 3) {
                    int y = C1527x.m3882y(i8);
                    i3 = y + y;
                    i2 = ((C1487o2) this.f1829c[i6]).mo13745f();
                } else if (i9 == 5) {
                    ((Integer) this.f1829c[i6]).intValue();
                    i = C1527x.m3873A(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzcc.zze());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f1829c[i6]).longValue();
                i3 = C1527x.m3873A(i8 << 3);
                i2 = C1527x.m3874B(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f1830d = i5;
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13746g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f1827a; i2++) {
            C1496q1.m3728b(sb, i, String.valueOf(this.f1828b[i2] >>> 3), this.f1829c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13747h(int i, Object obj) {
        if (this.f1831e) {
            int i2 = this.f1827a;
            int[] iArr = this.f1828b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f1828b = Arrays.copyOf(iArr, i3);
                this.f1829c = Arrays.copyOf(this.f1829c, i3);
            }
            int[] iArr2 = this.f1828b;
            int i4 = this.f1827a;
            iArr2[i4] = i;
            this.f1829c[i4] = obj;
            this.f1827a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f1827a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f1828b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f1829c;
        int i7 = this.f1827a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo13749i(C1531y yVar) {
        if (this.f1827a != 0) {
            for (int i = 0; i < this.f1827a; i++) {
                int i2 = this.f1828b[i];
                Object obj = this.f1829c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    yVar.mo13876n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    yVar.mo13883u(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    yVar.mo13887y(i3, (zzau) obj);
                } else if (i4 == 3) {
                    yVar.mo13857E(i3);
                    ((C1487o2) obj).mo13749i(yVar);
                    yVar.mo13858F(i3);
                } else if (i4 == 5) {
                    yVar.mo13884v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzcc.zze());
                }
            }
        }
    }
}
