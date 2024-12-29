package com.google.android.gms.internal.measurement;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
public abstract class C2028v3 extends C1794g3 {

    /* renamed from: b */
    private static final Logger f3761b = Logger.getLogger(C2028v3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f3762c = C1859k7.m5339m();

    /* renamed from: a */
    C2060x3 f3763a;

    /* renamed from: com.google.android.gms.internal.measurement.v3$a */
    public static class C2029a extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C2029a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2028v3.C2029a.<init>(java.lang.String, java.lang.Throwable):void");
        }

        C2029a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.v3$b */
    static class C2030b extends C2028v3 {

        /* renamed from: d */
        private final byte[] f3764d;

        /* renamed from: e */
        private final int f3765e;

        /* renamed from: f */
        private int f3766f;

        C2030b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f3764d = bArr;
                    this.f3766f = 0;
                    this.f3765e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: G0 */
        private final void m6202G0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f3764d, this.f3766f, i2);
                this.f3766f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: O */
        public final void mo12127O(int i) {
            if (!C2028v3.f3762c || C1735c3.m4943b() || mo12137b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f3764d;
                    int i2 = this.f3766f;
                    this.f3766f = i2 + 1;
                    bArr[i2] = (byte) ((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f3764d;
                    int i3 = this.f3766f;
                    this.f3766f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f3764d;
                int i4 = this.f3766f;
                this.f3766f = i4 + 1;
                C1859k7.m5338l(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f3764d;
                int i5 = this.f3766f;
                this.f3766f = i5 + 1;
                C1859k7.m5338l(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f3764d;
                    int i7 = this.f3766f;
                    this.f3766f = i7 + 1;
                    C1859k7.m5338l(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f3764d;
                int i8 = this.f3766f;
                this.f3766f = i8 + 1;
                C1859k7.m5338l(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f3764d;
                    int i10 = this.f3766f;
                    this.f3766f = i10 + 1;
                    C1859k7.m5338l(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f3764d;
                int i11 = this.f3766f;
                this.f3766f = i11 + 1;
                C1859k7.m5338l(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f3764d;
                    int i13 = this.f3766f;
                    this.f3766f = i13 + 1;
                    C1859k7.m5338l(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f3764d;
                int i14 = this.f3766f;
                this.f3766f = i14 + 1;
                C1859k7.m5338l(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f3764d;
                int i15 = this.f3766f;
                this.f3766f = i15 + 1;
                C1859k7.m5338l(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: P */
        public final void mo12128P(int i, int i2) {
            mo12147m(i, 0);
            mo12143j(i2);
        }

        /* renamed from: R */
        public final void mo12130R(int i, C1779f3 f3Var) {
            mo12147m(1, 3);
            mo12134Y(2, i);
            mo12149o(3, f3Var);
            mo12147m(1, 4);
        }

        /* renamed from: T */
        public final void mo12132T(byte[] bArr, int i, int i2) {
            mo12127O(i2);
            m6202G0(bArr, 0, i2);
        }

        /* renamed from: Y */
        public final void mo12134Y(int i, int i2) {
            mo12147m(i, 0);
            mo12127O(i2);
        }

        /* renamed from: Z */
        public final void mo12135Z(int i, long j) {
            mo12147m(i, 1);
            mo12136a0(j);
        }

        /* renamed from: a */
        public final void mo11679a(byte[] bArr, int i, int i2) {
            m6202G0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public final void mo12136a0(long j) {
            try {
                byte[] bArr = this.f3764d;
                int i = this.f3766f;
                int i2 = i + 1;
                this.f3766f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f3764d;
                int i3 = i2 + 1;
                this.f3766f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f3764d;
                int i4 = i3 + 1;
                this.f3766f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f3764d;
                int i5 = i4 + 1;
                this.f3766f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f3764d;
                int i6 = i5 + 1;
                this.f3766f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f3764d;
                int i7 = i6 + 1;
                this.f3766f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f3764d;
                int i8 = i7 + 1;
                this.f3766f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f3764d;
                this.f3766f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), 1}), e);
            }
        }

        /* renamed from: b */
        public final int mo12137b() {
            return this.f3765e - this.f3766f;
        }

        /* renamed from: f0 */
        public final void mo12138f0(int i) {
            try {
                byte[] bArr = this.f3764d;
                int i2 = this.f3766f;
                int i3 = i2 + 1;
                this.f3766f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f3764d;
                int i4 = i3 + 1;
                this.f3766f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f3764d;
                int i5 = i4 + 1;
                this.f3766f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f3764d;
                this.f3766f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), 1}), e);
            }
        }

        /* renamed from: g */
        public final void mo12139g(byte b) {
            try {
                byte[] bArr = this.f3764d;
                int i = this.f3766f;
                this.f3766f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), 1}), e);
            }
        }

        /* renamed from: j */
        public final void mo12143j(int i) {
            if (i >= 0) {
                mo12127O(i);
            } else {
                mo12154t((long) i);
            }
        }

        /* renamed from: k0 */
        public final void mo12145k0(int i, int i2) {
            mo12147m(i, 5);
            mo12138f0(i2);
        }

        /* renamed from: m */
        public final void mo12147m(int i, int i2) {
            mo12127O((i << 3) | i2);
        }

        /* renamed from: n */
        public final void mo12148n(int i, long j) {
            mo12147m(i, 0);
            mo12154t(j);
        }

        /* renamed from: o */
        public final void mo12149o(int i, C1779f3 f3Var) {
            mo12147m(i, 2);
            mo12155u(f3Var);
        }

        /* renamed from: p */
        public final void mo12150p(int i, C2062x5 x5Var) {
            mo12147m(1, 3);
            mo12134Y(2, i);
            mo12147m(3, 2);
            mo12156v(x5Var);
            mo12147m(1, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public final void mo12151q(int i, C2062x5 x5Var, C1912n6 n6Var) {
            mo12147m(i, 2);
            C2044w2 w2Var = (C2044w2) x5Var;
            int i2 = w2Var.mo11845i();
            if (i2 == -1) {
                i2 = n6Var.mo11465d(w2Var);
                w2Var.mo11847k(i2);
            }
            mo12127O(i2);
            n6Var.mo11467f(x5Var, this.f3763a);
        }

        /* renamed from: r */
        public final void mo12152r(int i, String str) {
            mo12147m(i, 2);
            mo12157w(str);
        }

        /* renamed from: s */
        public final void mo12153s(int i, boolean z) {
            mo12147m(i, 0);
            mo12139g(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public final void mo12154t(long j) {
            if (!C2028v3.f3762c || mo12137b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f3764d;
                    int i = this.f3766f;
                    this.f3766f = i + 1;
                    bArr[i] = (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f3764d;
                    int i2 = this.f3766f;
                    this.f3766f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C2029a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3766f), Integer.valueOf(this.f3765e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f3764d;
                    int i3 = this.f3766f;
                    this.f3766f = i3 + 1;
                    C1859k7.m5338l(bArr3, (long) i3, (byte) ((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f3764d;
                int i4 = this.f3766f;
                this.f3766f = i4 + 1;
                C1859k7.m5338l(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: u */
        public final void mo12155u(C1779f3 f3Var) {
            mo12127O(f3Var.mo11638d());
            f3Var.mo11645j(this);
        }

        /* renamed from: v */
        public final void mo12156v(C2062x5 x5Var) {
            mo12127O(x5Var.mo11846j());
            x5Var.mo11839b(this);
        }

        /* renamed from: w */
        public final void mo12157w(String str) {
            int i = this.f3766f;
            try {
                int p0 = C2028v3.m6156p0(str.length() * 3);
                int p02 = C2028v3.m6156p0(str.length());
                if (p02 == p0) {
                    int i2 = i + p02;
                    this.f3766f = i2;
                    int e = C1913n7.m5602e(str, this.f3764d, i2, mo12137b());
                    this.f3766f = i;
                    mo12127O((e - i) - p02);
                    this.f3766f = e;
                    return;
                }
                mo12127O(C1913n7.m5601d(str));
                this.f3766f = C1913n7.m5602e(str, this.f3764d, this.f3766f, mo12137b());
            } catch (C1956q7 e2) {
                this.f3766f = i;
                mo12158x(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C2029a(e3);
            }
        }
    }

    private C2028v3() {
    }

    /* renamed from: A */
    public static int m6119A(float f) {
        return 4;
    }

    /* renamed from: A0 */
    public static int m6120A0(int i) {
        return 4;
    }

    /* renamed from: B */
    public static int m6121B(int i, double d) {
        return m6149h0(i) + 8;
    }

    /* renamed from: B0 */
    public static int m6122B0(int i, int i2) {
        return m6149h0(i) + 4;
    }

    /* renamed from: C */
    public static int m6123C(int i, float f) {
        return m6149h0(i) + 4;
    }

    /* renamed from: C0 */
    public static int m6124C0(int i) {
        return m6152l0(i);
    }

    /* renamed from: D */
    public static int m6125D(int i, C1720b5 b5Var) {
        return (m6149h0(1) << 1) + m6157q0(2, i) + m6142c(3, b5Var);
    }

    /* renamed from: D0 */
    public static int m6126D0(int i, int i2) {
        return m6149h0(i) + m6152l0(i2);
    }

    /* renamed from: E */
    public static int m6127E(int i, C2062x5 x5Var) {
        return (m6149h0(1) << 1) + m6157q0(2, i) + m6149h0(3) + m6134J(x5Var);
    }

    @Deprecated
    /* renamed from: E0 */
    public static int m6128E0(int i) {
        return m6156p0(i);
    }

    /* renamed from: F */
    static int m6129F(int i, C2062x5 x5Var, C1912n6 n6Var) {
        return m6149h0(i) + m6146e(x5Var, n6Var);
    }

    /* renamed from: F0 */
    private static int m6130F0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: G */
    public static int m6131G(int i, String str) {
        return m6149h0(i) + m6135K(str);
    }

    /* renamed from: H */
    public static int m6132H(int i, boolean z) {
        return m6149h0(i) + 1;
    }

    /* renamed from: I */
    public static int m6133I(C1779f3 f3Var) {
        int d = f3Var.mo11638d();
        return m6156p0(d) + d;
    }

    /* renamed from: J */
    public static int m6134J(C2062x5 x5Var) {
        int j = x5Var.mo11846j();
        return m6156p0(j) + j;
    }

    /* renamed from: K */
    public static int m6135K(String str) {
        int i;
        try {
            i = C1913n7.m5601d(str);
        } catch (C1956q7 unused) {
            i = str.getBytes(C1925o4.f3609a).length;
        }
        return m6156p0(i) + i;
    }

    /* renamed from: L */
    public static int m6136L(boolean z) {
        return 1;
    }

    /* renamed from: M */
    public static int m6137M(byte[] bArr) {
        int length = bArr.length;
        return m6156p0(length) + length;
    }

    /* renamed from: U */
    public static int m6138U(int i, C1779f3 f3Var) {
        int h0 = m6149h0(i);
        int d = f3Var.mo11638d();
        return h0 + m6156p0(d) + d;
    }

    @Deprecated
    /* renamed from: V */
    static int m6139V(int i, C2062x5 x5Var, C1912n6 n6Var) {
        int h0 = m6149h0(i) << 1;
        C2044w2 w2Var = (C2044w2) x5Var;
        int i2 = w2Var.mo11845i();
        if (i2 == -1) {
            i2 = n6Var.mo11465d(w2Var);
            w2Var.mo11847k(i2);
        }
        return h0 + i2;
    }

    @Deprecated
    /* renamed from: W */
    public static int m6140W(C2062x5 x5Var) {
        return x5Var.mo11846j();
    }

    /* renamed from: c */
    public static int m6142c(int i, C1720b5 b5Var) {
        int h0 = m6149h0(i);
        int b = b5Var.mo11457b();
        return h0 + m6156p0(b) + b;
    }

    /* renamed from: c0 */
    public static int m6143c0(int i, long j) {
        return m6149h0(i) + m6151j0(j);
    }

    /* renamed from: d */
    public static int m6144d(C1720b5 b5Var) {
        int b = b5Var.mo11457b();
        return m6156p0(b) + b;
    }

    /* renamed from: d0 */
    public static int m6145d0(int i, C1779f3 f3Var) {
        return (m6149h0(1) << 1) + m6157q0(2, i) + m6138U(3, f3Var);
    }

    /* renamed from: e */
    static int m6146e(C2062x5 x5Var, C1912n6 n6Var) {
        C2044w2 w2Var = (C2044w2) x5Var;
        int i = w2Var.mo11845i();
        if (i == -1) {
            i = n6Var.mo11465d(w2Var);
            w2Var.mo11847k(i);
        }
        return m6156p0(i) + i;
    }

    /* renamed from: e0 */
    public static int m6147e0(long j) {
        return m6151j0(j);
    }

    /* renamed from: f */
    public static C2028v3 m6148f(byte[] bArr) {
        return new C2030b(bArr, 0, bArr.length);
    }

    /* renamed from: h0 */
    public static int m6149h0(int i) {
        return m6156p0(i << 3);
    }

    /* renamed from: i0 */
    public static int m6150i0(int i, long j) {
        return m6149h0(i) + m6151j0(j);
    }

    /* renamed from: j0 */
    public static int m6151j0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: l0 */
    public static int m6152l0(int i) {
        if (i >= 0) {
            return m6156p0(i);
        }
        return 10;
    }

    /* renamed from: m0 */
    public static int m6153m0(int i, int i2) {
        return m6149h0(i) + m6152l0(i2);
    }

    /* renamed from: n0 */
    public static int m6154n0(int i, long j) {
        return m6149h0(i) + m6151j0(m6167z0(j));
    }

    /* renamed from: o0 */
    public static int m6155o0(long j) {
        return m6151j0(m6167z0(j));
    }

    /* renamed from: p0 */
    public static int m6156p0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: q0 */
    public static int m6157q0(int i, int i2) {
        return m6149h0(i) + m6156p0(i2);
    }

    /* renamed from: r0 */
    public static int m6158r0(int i, long j) {
        return m6149h0(i) + 8;
    }

    /* renamed from: s0 */
    public static int m6159s0(long j) {
        return 8;
    }

    /* renamed from: t0 */
    public static int m6160t0(int i) {
        return m6156p0(m6130F0(i));
    }

    /* renamed from: u0 */
    public static int m6161u0(int i, int i2) {
        return m6149h0(i) + m6156p0(m6130F0(i2));
    }

    /* renamed from: v0 */
    public static int m6162v0(int i, long j) {
        return m6149h0(i) + 8;
    }

    /* renamed from: w0 */
    public static int m6163w0(long j) {
        return 8;
    }

    /* renamed from: x0 */
    public static int m6164x0(int i) {
        return 4;
    }

    /* renamed from: y0 */
    public static int m6165y0(int i, int i2) {
        return m6149h0(i) + 4;
    }

    /* renamed from: z */
    public static int m6166z(double d) {
        return 8;
    }

    /* renamed from: z0 */
    private static long m6167z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: N */
    public final void mo12126N() {
        if (mo12137b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: O */
    public abstract void mo12127O(int i);

    /* renamed from: P */
    public abstract void mo12128P(int i, int i2);

    /* renamed from: Q */
    public final void mo12129Q(int i, long j) {
        mo12148n(i, m6167z0(j));
    }

    /* renamed from: R */
    public abstract void mo12130R(int i, C1779f3 f3Var);

    /* renamed from: S */
    public final void mo12131S(long j) {
        mo12154t(m6167z0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract void mo12132T(byte[] bArr, int i, int i2);

    /* renamed from: X */
    public final void mo12133X(int i) {
        mo12127O(m6130F0(i));
    }

    /* renamed from: Y */
    public abstract void mo12134Y(int i, int i2);

    /* renamed from: Z */
    public abstract void mo12135Z(int i, long j);

    /* renamed from: a0 */
    public abstract void mo12136a0(long j);

    /* renamed from: b */
    public abstract int mo12137b();

    /* renamed from: f0 */
    public abstract void mo12138f0(int i);

    /* renamed from: g */
    public abstract void mo12139g(byte b);

    /* renamed from: g0 */
    public final void mo12140g0(int i, int i2) {
        mo12134Y(i, m6130F0(i2));
    }

    /* renamed from: h */
    public final void mo12141h(double d) {
        mo12136a0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo12142i(float f) {
        mo12138f0(Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo12143j(int i);

    /* renamed from: k */
    public final void mo12144k(int i, double d) {
        mo12135Z(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k0 */
    public abstract void mo12145k0(int i, int i2);

    /* renamed from: l */
    public final void mo12146l(int i, float f) {
        mo12145k0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: m */
    public abstract void mo12147m(int i, int i2);

    /* renamed from: n */
    public abstract void mo12148n(int i, long j);

    /* renamed from: o */
    public abstract void mo12149o(int i, C1779f3 f3Var);

    /* renamed from: p */
    public abstract void mo12150p(int i, C2062x5 x5Var);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract void mo12151q(int i, C2062x5 x5Var, C1912n6 n6Var);

    /* renamed from: r */
    public abstract void mo12152r(int i, String str);

    /* renamed from: s */
    public abstract void mo12153s(int i, boolean z);

    /* renamed from: t */
    public abstract void mo12154t(long j);

    /* renamed from: u */
    public abstract void mo12155u(C1779f3 f3Var);

    /* renamed from: v */
    public abstract void mo12156v(C2062x5 x5Var);

    /* renamed from: w */
    public abstract void mo12157w(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo12158x(String str, C1956q7 q7Var) {
        f3761b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", q7Var);
        byte[] bytes = str.getBytes(C1925o4.f3609a);
        try {
            mo12127O(bytes.length);
            mo11679a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C2029a(e);
        } catch (C2029a e2) {
            throw e2;
        }
    }

    /* renamed from: y */
    public final void mo12159y(boolean z) {
        mo12139g(z ? (byte) 1 : 0);
    }
}
