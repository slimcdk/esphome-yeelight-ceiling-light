package com.google.android.gms.internal.wearable;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.wearable.x */
public abstract class C1527x extends C1469l {

    /* renamed from: b */
    private static final Logger f1869b = Logger.getLogger(C1527x.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f1870c = C1534y2.m3982f();

    /* renamed from: a */
    C1531y f1871a;

    private C1527x() {
    }

    /* synthetic */ C1527x(C1514u uVar) {
    }

    /* renamed from: A */
    public static int m3873A(int i) {
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

    /* renamed from: B */
    public static int m3874B(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: C */
    public static int m3875C(String str) {
        int i;
        try {
            i = C1428c3.m3495c(str);
        } catch (zzek unused) {
            i = str.getBytes(C1524w0.f1867a).length;
        }
        return m3873A(i) + i;
    }

    /* renamed from: D */
    public static int m3876D(C1528x0 x0Var) {
        int a = x0Var.mo13838a();
        return m3873A(a) + a;
    }

    /* renamed from: a */
    public static int m3877a(zzau zzau) {
        int zzc = zzau.zzc();
        return m3873A(zzc) + zzc;
    }

    /* renamed from: b */
    static int m3878b(C1486o1 o1Var, C1417a2 a2Var) {
        C1439f fVar = (C1439f) o1Var;
        int g = fVar.mo13623g();
        if (g == -1) {
            g = a2Var.mo13579a(fVar);
            fVar.mo13624h(g);
        }
        return m3873A(g) + g;
    }

    @Deprecated
    /* renamed from: e */
    static int m3879e(int i, C1486o1 o1Var, C1417a2 a2Var) {
        int A = m3873A(i << 3);
        int i2 = A + A;
        C1439f fVar = (C1439f) o1Var;
        int g = fVar.mo13623g();
        if (g == -1) {
            g = a2Var.mo13579a(fVar);
            fVar.mo13624h(g);
        }
        return i2 + g;
    }

    /* renamed from: x */
    public static C1527x m3881x(byte[] bArr) {
        return new C1519v(bArr, 0, bArr.length);
    }

    /* renamed from: y */
    public static int m3882y(int i) {
        return m3873A(i << 3);
    }

    /* renamed from: z */
    public static int m3883z(int i) {
        if (i >= 0) {
            return m3873A(i);
        }
        return 10;
    }

    /* renamed from: c */
    public final void mo13836c() {
        if (mo13825w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo13837d(String str, zzek zzek) {
        f1869b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzek);
        byte[] bytes = str.getBytes(C1524w0.f1867a);
        try {
            int length = bytes.length;
            mo13820r(length);
            mo13824v(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzba(e);
        } catch (zzba e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract void mo13809g(int i, int i2);

    /* renamed from: h */
    public abstract void mo13810h(int i, int i2);

    /* renamed from: i */
    public abstract void mo13811i(int i, int i2);

    /* renamed from: j */
    public abstract void mo13812j(int i, int i2);

    /* renamed from: k */
    public abstract void mo13813k(int i, long j);

    /* renamed from: l */
    public abstract void mo13814l(int i, long j);

    /* renamed from: m */
    public abstract void mo13815m(int i, boolean z);

    /* renamed from: n */
    public abstract void mo13816n(int i, String str);

    /* renamed from: o */
    public abstract void mo13817o(int i, zzau zzau);

    /* renamed from: p */
    public abstract void mo13818p(byte b);

    /* renamed from: q */
    public abstract void mo13819q(int i);

    /* renamed from: r */
    public abstract void mo13820r(int i);

    /* renamed from: s */
    public abstract void mo13821s(int i);

    /* renamed from: t */
    public abstract void mo13822t(long j);

    /* renamed from: u */
    public abstract void mo13823u(long j);

    /* renamed from: v */
    public abstract void mo13824v(byte[] bArr, int i, int i2);

    /* renamed from: w */
    public abstract int mo13825w();
}
