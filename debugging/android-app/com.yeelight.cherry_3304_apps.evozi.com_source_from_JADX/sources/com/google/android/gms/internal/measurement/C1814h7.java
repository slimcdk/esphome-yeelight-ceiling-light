package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
public final class C1814h7 {

    /* renamed from: f */
    private static final C1814h7 f3457f = new C1814h7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f3458a;

    /* renamed from: b */
    private int[] f3459b;

    /* renamed from: c */
    private Object[] f3460c;

    /* renamed from: d */
    private int f3461d;

    /* renamed from: e */
    private boolean f3462e;

    private C1814h7() {
        this(0, new int[8], new Object[8], true);
    }

    private C1814h7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3461d = -1;
        this.f3458a = i;
        this.f3459b = iArr;
        this.f3460c = objArr;
        this.f3462e = z;
    }

    /* renamed from: a */
    public static C1814h7 m5204a() {
        return f3457f;
    }

    /* renamed from: b */
    static C1814h7 m5205b(C1814h7 h7Var, C1814h7 h7Var2) {
        int i = h7Var.f3458a + h7Var2.f3458a;
        int[] copyOf = Arrays.copyOf(h7Var.f3459b, i);
        System.arraycopy(h7Var2.f3459b, 0, copyOf, h7Var.f3458a, h7Var2.f3458a);
        Object[] copyOf2 = Arrays.copyOf(h7Var.f3460c, i);
        System.arraycopy(h7Var2.f3460c, 0, copyOf2, h7Var.f3458a, h7Var2.f3458a);
        return new C1814h7(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    private static void m5206d(int i, Object obj, C1723b8 b8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            b8Var.mo11510v(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            b8Var.mo11484K(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            b8Var.mo11475B(i2, (C1779f3) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                b8Var.mo11483J(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C2046w4.m6268d());
        } else if (b8Var.mo11476C() == C1889m4.C1894e.f3579k) {
            b8Var.mo11489a(i2);
            ((C1814h7) obj).mo11719h(b8Var);
            b8Var.mo11490b(i2);
        } else {
            b8Var.mo11490b(i2);
            ((C1814h7) obj).mo11719h(b8Var);
            b8Var.mo11489a(i2);
        }
    }

    /* renamed from: g */
    static C1814h7 m5207g() {
        return new C1814h7();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11715c(int i, Object obj) {
        if (this.f3462e) {
            int i2 = this.f3458a;
            if (i2 == this.f3459b.length) {
                int i3 = this.f3458a + (i2 < 4 ? 8 : i2 >> 1);
                this.f3459b = Arrays.copyOf(this.f3459b, i3);
                this.f3460c = Arrays.copyOf(this.f3460c, i3);
            }
            int[] iArr = this.f3459b;
            int i4 = this.f3458a;
            iArr[i4] = i;
            this.f3460c[i4] = obj;
            this.f3458a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11716e(C1723b8 b8Var) {
        if (b8Var.mo11476C() == C1889m4.C1894e.f3580l) {
            for (int i = this.f3458a - 1; i >= 0; i--) {
                b8Var.mo11501m(this.f3459b[i] >>> 3, this.f3460c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f3458a; i2++) {
            b8Var.mo11501m(this.f3459b[i2] >>> 3, this.f3460c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1814h7)) {
            return false;
        }
        C1814h7 h7Var = (C1814h7) obj;
        int i = this.f3458a;
        if (i == h7Var.f3458a) {
            int[] iArr = this.f3459b;
            int[] iArr2 = h7Var.f3459b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f3460c;
                Object[] objArr2 = h7Var.f3460c;
                int i3 = this.f3458a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11718f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f3458a; i2++) {
            C2079y5.m6607d(sb, i, String.valueOf(this.f3459b[i2] >>> 3), this.f3460c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo11719h(C1723b8 b8Var) {
        if (this.f3458a != 0) {
            if (b8Var.mo11476C() == C1889m4.C1894e.f3579k) {
                for (int i = 0; i < this.f3458a; i++) {
                    m5206d(this.f3459b[i], this.f3460c[i], b8Var);
                }
                return;
            }
            for (int i2 = this.f3458a - 1; i2 >= 0; i2--) {
                m5206d(this.f3459b[i2], this.f3460c[i2], b8Var);
            }
        }
    }

    public final int hashCode() {
        int i = this.f3458a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f3459b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f3460c;
        int i7 = this.f3458a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo11721i() {
        this.f3462e = false;
    }

    /* renamed from: j */
    public final int mo11722j() {
        int i = this.f3461d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3458a; i3++) {
            i2 += C2028v3.m6145d0(this.f3459b[i3] >>> 3, (C1779f3) this.f3460c[i3]);
        }
        this.f3461d = i2;
        return i2;
    }

    /* renamed from: k */
    public final int mo11723k() {
        int i;
        int i2 = this.f3461d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3458a; i4++) {
            int i5 = this.f3459b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C2028v3.m6150i0(i6, ((Long) this.f3460c[i4]).longValue());
            } else if (i7 == 1) {
                i = C2028v3.m6158r0(i6, ((Long) this.f3460c[i4]).longValue());
            } else if (i7 == 2) {
                i = C2028v3.m6138U(i6, (C1779f3) this.f3460c[i4]);
            } else if (i7 == 3) {
                i = (C2028v3.m6149h0(i6) << 1) + ((C1814h7) this.f3460c[i4]).mo11723k();
            } else if (i7 == 5) {
                i = C2028v3.m6165y0(i6, ((Integer) this.f3460c[i4]).intValue());
            } else {
                throw new IllegalStateException(C2046w4.m6268d());
            }
            i3 += i;
        }
        this.f3461d = i3;
        return i3;
    }
}
