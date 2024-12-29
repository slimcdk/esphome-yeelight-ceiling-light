package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.s7 */
public abstract class C1301s7 extends C1077e7 {

    /* renamed from: b */
    private static final Logger f1597b = Logger.getLogger(C1301s7.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f1598c = C1380xa.m3254C();

    /* renamed from: a */
    C1317t7 f1599a;

    private C1301s7() {
    }

    /* synthetic */ C1301s7(C1285r7 r7Var) {
    }

    /* renamed from: A */
    public static int m2900A(C1286r8 r8Var) {
        int a = r8Var.mo13207a();
        return m2904a(a) + a;
    }

    /* renamed from: B */
    static int m2901B(C1191l9 l9Var, C1364w9 w9Var) {
        C1391y6 y6Var = (C1391y6) l9Var;
        int g = y6Var.mo12912g();
        if (g == -1) {
            g = w9Var.mo13046f(y6Var);
            y6Var.mo12914i(g);
        }
        return m2904a(g) + g;
    }

    /* renamed from: C */
    public static int m2902C(String str) {
        int i;
        try {
            i = C1049cb.m1776c(str);
        } catch (zzmz unused) {
            i = str.getBytes(C1270q8.f1555a).length;
        }
        return m2904a(i) + i;
    }

    /* renamed from: D */
    public static int m2903D(int i) {
        return m2904a(i << 3);
    }

    /* renamed from: a */
    public static int m2904a(int i) {
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

    /* renamed from: b */
    public static int m2905b(long j) {
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

    /* renamed from: c */
    public static C1301s7 m2906c(byte[] bArr) {
        return new C1269q7(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m2908x(zzjb zzjb) {
        int zzd = zzjb.zzd();
        return m2904a(zzd) + zzd;
    }

    @Deprecated
    /* renamed from: y */
    static int m2909y(int i, C1191l9 l9Var, C1364w9 w9Var) {
        int a = m2904a(i << 3);
        int i2 = a + a;
        C1391y6 y6Var = (C1391y6) l9Var;
        int g = y6Var.mo12912g();
        if (g == -1) {
            g = w9Var.mo13046f(y6Var);
            y6Var.mo12914i(g);
        }
        return i2 + g;
    }

    /* renamed from: z */
    public static int m2910z(int i) {
        if (i >= 0) {
            return m2904a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo13345d() {
        if (mo13088g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo13346e(String str, zzmz zzmz) {
        f1597b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmz);
        byte[] bytes = str.getBytes(C1270q8.f1555a);
        try {
            int length = bytes.length;
            mo13102u(length);
            mo13098q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(e);
        }
    }

    /* renamed from: g */
    public abstract int mo13088g();

    /* renamed from: h */
    public abstract void mo13089h(byte b);

    /* renamed from: i */
    public abstract void mo13090i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo13091j(int i, zzjb zzjb);

    /* renamed from: k */
    public abstract void mo13092k(int i, int i2);

    /* renamed from: l */
    public abstract void mo13093l(int i);

    /* renamed from: m */
    public abstract void mo13094m(int i, long j);

    /* renamed from: n */
    public abstract void mo13095n(long j);

    /* renamed from: o */
    public abstract void mo13096o(int i, int i2);

    /* renamed from: p */
    public abstract void mo13097p(int i);

    /* renamed from: q */
    public abstract void mo13098q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo13099r(int i, String str);

    /* renamed from: s */
    public abstract void mo13100s(int i, int i2);

    /* renamed from: t */
    public abstract void mo13101t(int i, int i2);

    /* renamed from: u */
    public abstract void mo13102u(int i);

    /* renamed from: v */
    public abstract void mo13103v(int i, long j);

    /* renamed from: w */
    public abstract void mo13104w(long j);
}
