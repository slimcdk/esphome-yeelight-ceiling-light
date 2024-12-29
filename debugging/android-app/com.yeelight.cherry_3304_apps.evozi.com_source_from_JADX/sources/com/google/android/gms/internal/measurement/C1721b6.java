package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
final class C1721b6<T> implements C1912n6<T> {

    /* renamed from: q */
    private static final int[] f3242q = new int[0];

    /* renamed from: r */
    private static final Unsafe f3243r = C1859k7.m5346t();

    /* renamed from: a */
    private final int[] f3244a;

    /* renamed from: b */
    private final Object[] f3245b;

    /* renamed from: c */
    private final int f3246c;

    /* renamed from: d */
    private final int f3247d;

    /* renamed from: e */
    private final C2062x5 f3248e;

    /* renamed from: f */
    private final boolean f3249f;

    /* renamed from: g */
    private final boolean f3250g;

    /* renamed from: h */
    private final boolean f3251h;

    /* renamed from: i */
    private final int[] f3252i;

    /* renamed from: j */
    private final int f3253j;

    /* renamed from: k */
    private final int f3254k;

    /* renamed from: l */
    private final C1797g6 f3255l;

    /* renamed from: m */
    private final C1812h5 f3256m;

    /* renamed from: n */
    private final C1768e7<?, ?> f3257n;

    /* renamed from: o */
    private final C1704a4<?> f3258o;

    /* renamed from: p */
    private final C1954q5 f3259p;

    private C1721b6(int[] iArr, Object[] objArr, int i, int i2, C2062x5 x5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C1797g6 g6Var, C1812h5 h5Var, C1768e7<?, ?> e7Var, C1704a4<?> a4Var, C1954q5 q5Var) {
        this.f3244a = iArr;
        this.f3245b = objArr;
        this.f3246c = i;
        this.f3247d = i2;
        boolean z3 = x5Var instanceof C1889m4;
        this.f3250g = z;
        this.f3249f = a4Var != null && a4Var.mo11426e(x5Var);
        this.f3251h = false;
        this.f3252i = iArr2;
        this.f3253j = i3;
        this.f3254k = i4;
        this.f3255l = g6Var;
        this.f3256m = h5Var;
        this.f3257n = e7Var;
        this.f3258o = a4Var;
        this.f3248e = x5Var;
        this.f3259p = q5Var;
    }

    /* renamed from: A */
    private final boolean m4792A(T t, int i, int i2) {
        return C1859k7.m5328b(t, (long) (m4807Q(i2) & 1048575)) == i;
    }

    /* renamed from: B */
    private final boolean m4793B(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m4828z(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: D */
    private static boolean m4794D(Object obj, int i, C1912n6 n6Var) {
        return n6Var.mo11463b(C1859k7.m5317F(obj, (long) (i & 1048575)));
    }

    /* renamed from: E */
    private static <T> double m4795E(T t, long j) {
        return ((Double) C1859k7.m5317F(t, j)).doubleValue();
    }

    /* renamed from: F */
    private final int m4796F(int i, int i2) {
        int length = (this.f3244a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f3244a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: G */
    private final Object m4797G(int i) {
        return this.f3245b[(i / 3) << 1];
    }

    /* renamed from: H */
    private final void m4798H(T t, int i) {
        int Q = m4807Q(i);
        long j = (long) (1048575 & Q);
        if (j != 1048575) {
            C1859k7.m5334h(t, j, (1 << (Q >>> 20)) | C1859k7.m5328b(t, j));
        }
    }

    /* renamed from: I */
    private final void m4799I(T t, int i, int i2) {
        C1859k7.m5334h(t, (long) (m4807Q(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4800J(T r17, com.google.android.gms.internal.measurement.C1723b8 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f3249f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.measurement.a4<?> r3 = r0.f3258o
            com.google.android.gms.internal.measurement.f4 r3 = r3.mo11423b(r1)
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r5 = r3.f3345a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo11657p()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.f3244a
            int r5 = r5.length
            sun.misc.Unsafe r6 = f3243r
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046b
            int r12 = r0.m4805O(r9)
            int[] r13 = r0.f3244a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f3250g
            r8 = 1
            if (r4 != 0) goto L_0x005c
            r4 = 17
            if (r15 > r4) goto L_0x005c
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0464
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03f5;
                case 9: goto L_0x03e4;
                case 10: goto L_0x03d5;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03bb;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a1;
                case 15: goto L_0x0394;
                case 16: goto L_0x0387;
                case 17: goto L_0x0376;
                case 18: goto L_0x0366;
                case 19: goto L_0x0356;
                case 20: goto L_0x0346;
                case 21: goto L_0x0336;
                case 22: goto L_0x0326;
                case 23: goto L_0x0316;
                case 24: goto L_0x0306;
                case 25: goto L_0x02f6;
                case 26: goto L_0x02e7;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02c5;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0295;
                case 32: goto L_0x0285;
                case 33: goto L_0x0275;
                case 34: goto L_0x0265;
                case 35: goto L_0x0256;
                case 36: goto L_0x0247;
                case 37: goto L_0x0238;
                case 38: goto L_0x0229;
                case 39: goto L_0x021a;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cf;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0193;
                case 49: goto L_0x0180;
                case 50: goto L_0x0177;
                case 51: goto L_0x0168;
                case 52: goto L_0x0159;
                case 53: goto L_0x014a;
                case 54: goto L_0x013b;
                case 55: goto L_0x012c;
                case 56: goto L_0x011d;
                case 57: goto L_0x010e;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00dd;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0095;
                case 66: goto L_0x0087;
                case 67: goto L_0x0079;
                case 68: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            r15 = 0
            goto L_0x0460
        L_0x0067:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.n6 r8 = r0.m4819q(r9)
            r2.mo11503o(r14, r4, r8)
            goto L_0x0064
        L_0x0079:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m4808R(r1, r12)
            r2.mo11487N(r14, r12)
            goto L_0x0064
        L_0x0087:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11514z(r14, r4)
            goto L_0x0064
        L_0x0095:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m4808R(r1, r12)
            r2.mo11494f(r14, r12)
            goto L_0x0064
        L_0x00a3:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11509u(r14, r4)
            goto L_0x0064
        L_0x00b1:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11496h(r14, r4)
            goto L_0x0064
        L_0x00bf:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11486M(r14, r4)
            goto L_0x0064
        L_0x00cd:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C1779f3) r4
            r2.mo11475B(r14, r4)
            goto L_0x0064
        L_0x00dd:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.n6 r8 = r0.m4819q(r9)
            r2.mo11477D(r14, r4, r8)
            goto L_0x0064
        L_0x00f0:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            m4824v(r14, r4, r2)
            goto L_0x0064
        L_0x00ff:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            boolean r4 = m4810T(r1, r12)
            r2.mo11492d(r14, r4)
            goto L_0x0064
        L_0x010e:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11483J(r14, r4)
            goto L_0x0064
        L_0x011d:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m4808R(r1, r12)
            r2.mo11484K(r14, r12)
            goto L_0x0064
        L_0x012c:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = m4806P(r1, r12)
            r2.mo11499k(r14, r4)
            goto L_0x0064
        L_0x013b:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m4808R(r1, r12)
            r2.mo11500l(r14, r12)
            goto L_0x0064
        L_0x014a:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = m4808R(r1, r12)
            r2.mo11510v(r14, r12)
            goto L_0x0064
        L_0x0159:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            float r4 = m4802L(r1, r12)
            r2.mo11512x(r14, r4)
            goto L_0x0064
        L_0x0168:
            boolean r4 = r0.m4792A(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            double r12 = m4795E(r1, r12)
            r2.mo11511w(r14, r12)
            goto L_0x0064
        L_0x0177:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.m4826x(r2, r14, r4, r9)
            goto L_0x0064
        L_0x0180:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.n6 r12 = r0.m4819q(r9)
            com.google.android.gms.internal.measurement.C1927o6.m5702x(r4, r8, r2, r12)
            goto L_0x0064
        L_0x0193:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01a2:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01b1:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01c0:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01cf:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01de:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01ed:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01fc:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r4, r12, r2, r8)
            goto L_0x0064
        L_0x020b:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r4, r12, r2, r8)
            goto L_0x0064
        L_0x021a:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0229:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0238:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0247:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0256:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0265:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0275:
            r14 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0285:
            r14 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0295:
            r14 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02a5:
            r14 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02b5:
            r14 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02c5:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5701w(r4, r8, r2)
            goto L_0x0064
        L_0x02d4:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.n6 r12 = r0.m4819q(r9)
            com.google.android.gms.internal.measurement.C1927o6.m5689k(r4, r8, r2, r12)
            goto L_0x0064
        L_0x02e7:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5688j(r4, r8, r2)
            goto L_0x0064
        L_0x02f6:
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0306:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0316:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0326:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0336:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0346:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0356:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0366:
            r15 = 0
            int[] r4 = r0.f3244a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0376:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.n6 r8 = r0.m4819q(r9)
            r2.mo11503o(r14, r4, r8)
            goto L_0x0460
        L_0x0387:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo11487N(r14, r12)
            goto L_0x0460
        L_0x0394:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11514z(r14, r4)
            goto L_0x0460
        L_0x03a1:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo11494f(r14, r12)
            goto L_0x0460
        L_0x03ae:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11509u(r14, r4)
            goto L_0x0460
        L_0x03bb:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11496h(r14, r4)
            goto L_0x0460
        L_0x03c8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11486M(r14, r4)
            goto L_0x0460
        L_0x03d5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C1779f3) r4
            r2.mo11475B(r14, r4)
            goto L_0x0460
        L_0x03e4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.measurement.n6 r8 = r0.m4819q(r9)
            r2.mo11477D(r14, r4, r8)
            goto L_0x0460
        L_0x03f5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            m4824v(r14, r4, r2)
            goto L_0x0460
        L_0x0401:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            boolean r4 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r1, r12)
            r2.mo11492d(r14, r4)
            goto L_0x0460
        L_0x040d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11483J(r14, r4)
            goto L_0x0460
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo11484K(r14, r12)
            goto L_0x0460
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.mo11499k(r14, r4)
            goto L_0x0460
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo11500l(r14, r12)
            goto L_0x0460
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.mo11510v(r14, r12)
            goto L_0x0460
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            float r4 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r1, r12)
            r2.mo11512x(r14, r4)
            goto L_0x0460
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            double r12 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r1, r12)
            r2.mo11511w(r14, r12)
        L_0x0460:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0464:
            com.google.android.gms.internal.measurement.a4<?> r1 = r0.f3258o
            r1.mo11422a(r3)
            r4 = 0
            throw r4
        L_0x046b:
            r4 = 0
            if (r3 != 0) goto L_0x0474
            com.google.android.gms.internal.measurement.e7<?, ?> r3 = r0.f3257n
            m4825w(r3, r1, r2)
            return
        L_0x0474:
            com.google.android.gms.internal.measurement.a4<?> r1 = r0.f3258o
            r1.mo11425d(r2, r3)
            goto L_0x047b
        L_0x047a:
            throw r4
        L_0x047b:
            goto L_0x047a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4800J(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
    }

    /* renamed from: K */
    private final void m4801K(T t, T t2, int i) {
        int O = m4805O(i);
        int i2 = this.f3244a[i];
        long j = (long) (O & 1048575);
        if (m4792A(t2, i2, i)) {
            Object F = C1859k7.m5317F(t, j);
            Object F2 = C1859k7.m5317F(t2, j);
            if (F != null && F2 != null) {
                C1859k7.m5336j(t, j, C1925o4.m5643e(F, F2));
                m4799I(t, i2, i);
            } else if (F2 != null) {
                C1859k7.m5336j(t, j, F2);
                m4799I(t, i2, i);
            }
        }
    }

    /* renamed from: L */
    private static <T> float m4802L(T t, long j) {
        return ((Float) C1859k7.m5317F(t, j)).floatValue();
    }

    /* renamed from: M */
    private final C1984s4 m4803M(int i) {
        return (C1984s4) this.f3245b[((i / 3) << 1) + 1];
    }

    /* renamed from: N */
    private final boolean m4804N(T t, T t2, int i) {
        return m4828z(t, i) == m4828z(t2, i);
    }

    /* renamed from: O */
    private final int m4805O(int i) {
        return this.f3244a[i + 1];
    }

    /* renamed from: P */
    private static <T> int m4806P(T t, long j) {
        return ((Integer) C1859k7.m5317F(t, j)).intValue();
    }

    /* renamed from: Q */
    private final int m4807Q(int i) {
        return this.f3244a[i + 2];
    }

    /* renamed from: R */
    private static <T> long m4808R(T t, long j) {
        return ((Long) C1859k7.m5317F(t, j)).longValue();
    }

    /* renamed from: S */
    private static C1814h7 m4809S(Object obj) {
        C1889m4 m4Var = (C1889m4) obj;
        C1814h7 h7Var = m4Var.zzb;
        if (h7Var != C1814h7.m5204a()) {
            return h7Var;
        }
        C1814h7 g = C1814h7.m5207g();
        m4Var.zzb = g;
        return g;
    }

    /* renamed from: T */
    private static <T> boolean m4810T(T t, long j) {
        return ((Boolean) C1859k7.m5317F(t, j)).booleanValue();
    }

    /* renamed from: U */
    private final int m4811U(int i) {
        if (i < this.f3246c || i > this.f3247d) {
            return -1;
        }
        return m4796F(i, 0);
    }

    /* renamed from: i */
    private final int m4812i(int i, int i2) {
        if (i < this.f3246c || i > this.f3247d) {
            return -1;
        }
        return m4796F(i, i2);
    }

    /* renamed from: j */
    private static <UT, UB> int m4813j(C1768e7<UT, UB> e7Var, T t) {
        return e7Var.mo11614l(e7Var.mo11608f(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0133, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0163, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0168, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m4814k(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.C1764e3 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f3243r
            int[] r7 = r0.f3244a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0158;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0138;
                case 55: goto L_0x012b;
                case 56: goto L_0x011f;
                case 57: goto L_0x0114;
                case 58: goto L_0x00fe;
                case 59: goto L_0x00d0;
                case 60: goto L_0x00ac;
                case 61: goto L_0x00a2;
                case 62: goto L_0x012b;
                case 63: goto L_0x0074;
                case 64: goto L_0x0114;
                case 65: goto L_0x011f;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x016c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x016c
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.measurement.n6 r2 = r0.m4819q(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4773f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f3323c
            if (r15 != 0) goto L_0x0052
            goto L_0x0144
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1925o4.m5643e(r15, r3)
            goto L_0x0144
        L_0x0058:
            if (r5 != 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r11)
            long r3 = r11.f3322b
            long r3 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r3)
            goto L_0x0140
        L_0x0066:
            if (r5 != 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r11)
            int r3 = r11.f3321a
            int r3 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r3)
            goto L_0x0133
        L_0x0074:
            if (r5 != 0) goto L_0x016c
            int r3 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r11)
            int r4 = r11.f3321a
            com.google.android.gms.internal.measurement.s4 r5 = r0.m4803M(r6)
            if (r5 == 0) goto L_0x0098
            boolean r5 = r5.mo11560a(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            com.google.android.gms.internal.measurement.h7 r1 = m4809S(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo11715c(r2, r4)
            r2 = r3
            goto L_0x016d
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0168
        L_0x00a2:
            if (r5 != r15) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4784q(r3, r4, r11)
            java.lang.Object r3 = r11.f3323c
            goto L_0x0144
        L_0x00ac:
            if (r5 != r15) goto L_0x016c
            com.google.android.gms.internal.measurement.n6 r2 = r0.m4819q(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4774g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c3
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c4
        L_0x00c3:
            r15 = 0
        L_0x00c4:
            java.lang.Object r3 = r11.f3323c
            if (r15 != 0) goto L_0x00ca
            goto L_0x0144
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1925o4.m5643e(r15, r3)
            goto L_0x0144
        L_0x00d0:
            if (r5 != r15) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r11)
            int r4 = r11.f3321a
            if (r4 != 0) goto L_0x00dd
            java.lang.String r3 = ""
            goto L_0x0144
        L_0x00dd:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f1
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.C1913n7.m5604g(r3, r2, r5)
            if (r5 == 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6270f()
            throw r1
        L_0x00f1:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.C1925o4.f3609a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0168
        L_0x00fe:
            if (r5 != 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r11)
            long r3 = r11.f3322b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010e
            r15 = 1
            goto L_0x010f
        L_0x010e:
            r15 = 0
        L_0x010f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0144
        L_0x0114:
            if (r5 != r7) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0152
        L_0x011f:
            r2 = 1
            if (r5 != r2) goto L_0x016c
            long r2 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0163
        L_0x012b:
            if (r5 != 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r11)
            int r3 = r11.f3321a
        L_0x0133:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0144
        L_0x0138:
            if (r5 != 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r11)
            long r3 = r11.f3322b
        L_0x0140:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0144:
            r12.putObject(r1, r9, r3)
            goto L_0x0168
        L_0x0148:
            if (r5 != r7) goto L_0x016c
            float r2 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0152:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0168
        L_0x0158:
            r2 = 1
            if (r5 != r2) goto L_0x016c
            double r2 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0163:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0168:
            r12.putInt(r1, r13, r8)
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4814k(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.e3):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        if (r7.f3322b != 0) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0270, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0272, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0273, code lost:
        r11.mo11567d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0276, code lost:
        if (r4 >= r5) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0278, code lost:
        r6 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027e, code lost:
        if (r2 != r7.f3321a) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0280, code lost:
        r4 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0288, code lost:
        if (r7.f3322b == 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r4 == 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r11.add(com.google.android.gms.internal.measurement.C1779f3.f3341b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r11.add(com.google.android.gms.internal.measurement.C1779f3.m5074h(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        if (r2 != r7.f3321a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7);
        r4 = r7.f3321a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0160, code lost:
        if (r4 < 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r4 != 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        throw com.google.android.gms.internal.measurement.C2046w4.m6265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw com.google.android.gms.internal.measurement.C2046w4.m6266b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m4815l(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.C1764e3 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f3243r
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.t4 r11 = (com.google.android.gms.internal.measurement.C1999t4) r11
            boolean r12 = r11.mo12091C()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.measurement.t4 r11 = r11.mo11562a(r12)
            sun.misc.Unsafe r12 = f3243r
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x0399;
                case 19: goto L_0x035b;
                case 20: goto L_0x0323;
                case 21: goto L_0x0323;
                case 22: goto L_0x0309;
                case 23: goto L_0x02ca;
                case 24: goto L_0x028b;
                case 25: goto L_0x023a;
                case 26: goto L_0x0197;
                case 27: goto L_0x017d;
                case 28: goto L_0x0132;
                case 29: goto L_0x0309;
                case 30: goto L_0x00fa;
                case 31: goto L_0x028b;
                case 32: goto L_0x02ca;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x0399;
                case 36: goto L_0x035b;
                case 37: goto L_0x0323;
                case 38: goto L_0x0323;
                case 39: goto L_0x0309;
                case 40: goto L_0x02ca;
                case 41: goto L_0x028b;
                case 42: goto L_0x023a;
                case 43: goto L_0x0309;
                case 44: goto L_0x00fa;
                case 45: goto L_0x028b;
                case 46: goto L_0x02ca;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03d7
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x03d7
            com.google.android.gms.internal.measurement.n6 r1 = r0.m4819q(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4773f(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.f3323c
            r11.add(r8)
            if (r4 >= r5) goto L_0x03d7
            int r8 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r9 = r7.f3321a
            if (r2 != r9) goto L_0x03d7
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4773f(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r1, r7)
            long r4 = r7.f3322b
            long r4 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r4)
            r11.mo11805d(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x03d8
        L_0x0099:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
        L_0x00a2:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r7)
            long r8 = r7.f3322b
            long r8 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r8)
            r11.mo11805d(r8)
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.C1939p4) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r4 = r7.f3321a
            int r4 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r4)
            r11.mo11940f(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x03d8
        L_0x00d9:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.C1939p4) r11
        L_0x00e2:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r4 = r7.f3321a
            int r4 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r4)
            r11.mo11940f(r4)
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4777j(r3, r4, r11, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x03d7
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4769b(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1
            com.google.android.gms.internal.measurement.h7 r3 = r1.zzb
            com.google.android.gms.internal.measurement.h7 r4 = com.google.android.gms.internal.measurement.C1814h7.m5204a()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.measurement.s4 r4 = r0.m4803M(r8)
            com.google.android.gms.internal.measurement.e7<?, ?> r5 = r0.f3257n
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1927o6.m5687i(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.measurement.h7 r3 = (com.google.android.gms.internal.measurement.C1814h7) r3
            if (r3 == 0) goto L_0x012f
            r1.zzb = r3
        L_0x012f:
            r1 = r2
            goto L_0x03d8
        L_0x0132:
            if (r6 != r10) goto L_0x03d7
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r4 = r7.f3321a
            if (r4 < 0) goto L_0x0178
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0173
            if (r4 != 0) goto L_0x0148
        L_0x0142:
            com.google.android.gms.internal.measurement.f3 r4 = com.google.android.gms.internal.measurement.C1779f3.f3341b
            r11.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.measurement.f3 r6 = com.google.android.gms.internal.measurement.C1779f3.m5074h(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r4 = r7.f3321a
            if (r4 < 0) goto L_0x016e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0169
            if (r4 != 0) goto L_0x0148
            goto L_0x0142
        L_0x0169:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x016e:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x0173:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x0178:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x017d:
            if (r6 != r10) goto L_0x03d7
            com.google.android.gms.internal.measurement.n6 r1 = r0.m4819q(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4772e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03d8
        L_0x0197:
            if (r6 != r10) goto L_0x03d7
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            if (r6 != 0) goto L_0x01e4
            int r6 = r7.f3321a
            if (r6 < 0) goto L_0x01df
            if (r6 != 0) goto L_0x01b2
        L_0x01ae:
            r11.add(r1)
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C1925o4.f3609a
            r8.<init>(r3, r4, r6, r9)
        L_0x01b9:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x01bd:
            if (r4 >= r5) goto L_0x03d7
            int r6 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r8 = r7.f3321a
            if (r2 != r8) goto L_0x03d7
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r6, r7)
            int r6 = r7.f3321a
            if (r6 < 0) goto L_0x01da
            if (r6 != 0) goto L_0x01d2
            goto L_0x01ae
        L_0x01d2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C1925o4.f3609a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01b9
        L_0x01da:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x01df:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x01e4:
            int r6 = r7.f3321a
            if (r6 < 0) goto L_0x0235
            if (r6 != 0) goto L_0x01ee
        L_0x01ea:
            r11.add(r1)
            goto L_0x0201
        L_0x01ee:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C1913n7.m5604g(r3, r4, r8)
            if (r9 == 0) goto L_0x0230
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C1925o4.f3609a
            r9.<init>(r3, r4, r6, r10)
        L_0x01fd:
            r11.add(r9)
            r4 = r8
        L_0x0201:
            if (r4 >= r5) goto L_0x03d7
            int r6 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r8 = r7.f3321a
            if (r2 != r8) goto L_0x03d7
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r6, r7)
            int r6 = r7.f3321a
            if (r6 < 0) goto L_0x022b
            if (r6 != 0) goto L_0x0216
            goto L_0x01ea
        L_0x0216:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C1913n7.m5604g(r3, r4, r8)
            if (r9 == 0) goto L_0x0226
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C1925o4.f3609a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01fd
        L_0x0226:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6270f()
            throw r1
        L_0x022b:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x0230:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6270f()
            throw r1
        L_0x0235:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6266b()
            throw r1
        L_0x023a:
            r1 = 0
            if (r6 != r10) goto L_0x0262
            com.google.android.gms.internal.measurement.d3 r11 = (com.google.android.gms.internal.measurement.C1749d3) r11
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r4 = r7.f3321a
            int r4 = r4 + r2
        L_0x0246:
            if (r2 >= r4) goto L_0x0259
            int r2 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r2, r7)
            long r5 = r7.f3322b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0254
            r5 = 1
            goto L_0x0255
        L_0x0254:
            r5 = 0
        L_0x0255:
            r11.mo11567d(r5)
            goto L_0x0246
        L_0x0259:
            if (r2 != r4) goto L_0x025d
            goto L_0x012f
        L_0x025d:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x0262:
            if (r6 != 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.d3 r11 = (com.google.android.gms.internal.measurement.C1749d3) r11
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r7)
            long r8 = r7.f3322b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0272
        L_0x0270:
            r6 = 1
            goto L_0x0273
        L_0x0272:
            r6 = 0
        L_0x0273:
            r11.mo11567d(r6)
            if (r4 >= r5) goto L_0x03d7
            int r6 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r8 = r7.f3321a
            if (r2 != r8) goto L_0x03d7
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r6, r7)
            long r8 = r7.f3322b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0272
            goto L_0x0270
        L_0x028b:
            if (r6 != r10) goto L_0x02ab
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.C1939p4) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x0296:
            if (r1 >= r2) goto L_0x02a2
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r3, r1)
            r11.mo11940f(r4)
            int r1 = r1 + 4
            goto L_0x0296
        L_0x02a2:
            if (r1 != r2) goto L_0x02a6
            goto L_0x03d8
        L_0x02a6:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x02ab:
            if (r6 != r9) goto L_0x03d7
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.C1939p4) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r18, r19)
            r11.mo11940f(r1)
        L_0x02b6:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r3, r4)
            r11.mo11940f(r1)
            goto L_0x02b6
        L_0x02ca:
            if (r6 != r10) goto L_0x02ea
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            long r4 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r3, r1)
            r11.mo11805d(r4)
            int r1 = r1 + 8
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x03d8
        L_0x02e5:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x02ea:
            if (r6 != r13) goto L_0x03d7
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
            long r8 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r18, r19)
            r11.mo11805d(r8)
        L_0x02f5:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            long r8 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r3, r4)
            r11.mo11805d(r8)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r10) goto L_0x0311
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4777j(r3, r4, r11, r7)
            goto L_0x03d8
        L_0x0311:
            if (r6 != 0) goto L_0x03d7
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4769b(r21, r22, r23, r24, r25, r26)
            goto L_0x03d8
        L_0x0323:
            if (r6 != r10) goto L_0x0343
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x032e:
            if (r1 >= r2) goto L_0x033a
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r1, r7)
            long r4 = r7.f3322b
            r11.mo11805d(r4)
            goto L_0x032e
        L_0x033a:
            if (r1 != r2) goto L_0x033e
            goto L_0x03d8
        L_0x033e:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x0343:
            if (r6 != 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.l5 r11 = (com.google.android.gms.internal.measurement.C1875l5) r11
        L_0x0347:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r3, r4, r7)
            long r8 = r7.f3322b
            r11.mo11805d(r8)
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            goto L_0x0347
        L_0x035b:
            if (r6 != r10) goto L_0x037a
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1874l4) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x0366:
            if (r1 >= r2) goto L_0x0372
            float r4 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r3, r1)
            r11.mo11795d(r4)
            int r1 = r1 + 4
            goto L_0x0366
        L_0x0372:
            if (r1 != r2) goto L_0x0375
            goto L_0x03d8
        L_0x0375:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x037a:
            if (r6 != r9) goto L_0x03d7
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1874l4) r11
            float r1 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r18, r19)
            r11.mo11795d(r1)
        L_0x0385:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            float r1 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r3, r4)
            r11.mo11795d(r1)
            goto L_0x0385
        L_0x0399:
            if (r6 != r10) goto L_0x03b8
            com.google.android.gms.internal.measurement.w3 r11 = (com.google.android.gms.internal.measurement.C2045w3) r11
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r4, r7)
            int r2 = r7.f3321a
            int r2 = r2 + r1
        L_0x03a4:
            if (r1 >= r2) goto L_0x03b0
            double r4 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r3, r1)
            r11.mo12171d(r4)
            int r1 = r1 + 8
            goto L_0x03a4
        L_0x03b0:
            if (r1 != r2) goto L_0x03b3
            goto L_0x03d8
        L_0x03b3:
            com.google.android.gms.internal.measurement.w4 r1 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            throw r1
        L_0x03b8:
            if (r6 != r13) goto L_0x03d7
            com.google.android.gms.internal.measurement.w3 r11 = (com.google.android.gms.internal.measurement.C2045w3) r11
            double r8 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r18, r19)
            r11.mo12171d(r8)
        L_0x03c3:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r3, r1, r7)
            int r6 = r7.f3321a
            if (r2 != r6) goto L_0x03d8
            double r8 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r3, r4)
            r11.mo12171d(r8)
            goto L_0x03c3
        L_0x03d7:
            r1 = r4
        L_0x03d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4815l(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.e3):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m4816m(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.measurement.C1764e3 r15) {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f3243r
            java.lang.Object r12 = r7.m4797G(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.measurement.q5 r2 = r7.f3259p
            boolean r2 = r2.mo11955c(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.q5 r2 = r7.f3259p
            java.lang.Object r2 = r2.mo11959g(r12)
            com.google.android.gms.internal.measurement.q5 r3 = r7.f3259p
            r3.mo11957e(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.measurement.q5 r8 = r7.f3259p
            com.google.android.gms.internal.measurement.o5 r8 = r8.mo11958f(r12)
            com.google.android.gms.internal.measurement.q5 r12 = r7.f3259p
            java.util.Map r12 = r12.mo11953a(r1)
            int r10 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r9, r10, r15)
            int r13 = r15.f3321a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f3612b
            V r0 = r8.f3614d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4771d(r10, r9, r1, r15)
            int r10 = r15.f3321a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.measurement.v7 r1 = r8.f3613c
            int r1 = r1.mo12161b()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.v7 r4 = r8.f3613c
            V r10 = r8.f3614d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m4817o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f3323c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.measurement.v7 r1 = r8.f3611a
            int r1 = r1.mo12161b()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.v7 r4 = r8.f3611a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m4817o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f3323c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.measurement.C1718b3.m4768a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.measurement.w4 r8 = com.google.android.gms.internal.measurement.C2046w4.m6269e()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.measurement.w4 r8 = com.google.android.gms.internal.measurement.C2046w4.m6265a()
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4816m(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.measurement.e3):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r6.f3323c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6.f3323c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.f3323c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m4817o(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.C2034v7 r4, java.lang.Class<?> r5, com.google.android.gms.internal.measurement.C1764e3 r6) {
        /*
            int[] r0 = com.google.android.gms.internal.measurement.C1706a6.f3226a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4783p(r1, r2, r6)
            goto L_0x0099
        L_0x0019:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r1, r2, r6)
            long r2 = r6.f3322b
            long r2 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r2)
            goto L_0x0042
        L_0x0024:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r1, r2, r6)
            int r2 = r6.f3321a
            int r2 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r2)
            goto L_0x004d
        L_0x002f:
            com.google.android.gms.internal.measurement.j6 r4 = com.google.android.gms.internal.measurement.C1844j6.m5284a()
            com.google.android.gms.internal.measurement.n6 r4 = r4.mo11762b(r5)
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4774g(r4, r1, r2, r3, r6)
            goto L_0x0099
        L_0x003c:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r1, r2, r6)
            long r2 = r6.f3322b
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0051
        L_0x0047:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r1, r2, r6)
            int r2 = r6.f3321a
        L_0x004d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0051:
            r6.f3323c = r2
            goto L_0x0099
        L_0x0054:
            float r1 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x006e
        L_0x005d:
            long r3 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x007b
        L_0x0066:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x006e:
            r6.f3323c = r1
            int r1 = r2 + 4
            goto L_0x0099
        L_0x0073:
            double r3 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
        L_0x007b:
            r6.f3323c = r1
            int r1 = r2 + 8
            goto L_0x0099
        L_0x0080:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4784q(r1, r2, r6)
            goto L_0x0099
        L_0x0085:
            int r1 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r1, r2, r6)
            long r2 = r6.f3322b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0051
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4817o(byte[], int, int, com.google.android.gms.internal.measurement.v7, java.lang.Class, com.google.android.gms.internal.measurement.e3):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C1721b6<T> m4818p(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.C2032v5 r34, com.google.android.gms.internal.measurement.C1797g6 r35, com.google.android.gms.internal.measurement.C1812h5 r36, com.google.android.gms.internal.measurement.C1768e7<?, ?> r37, com.google.android.gms.internal.measurement.C1704a4<?> r38, com.google.android.gms.internal.measurement.C1954q5 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1876l6
            if (r1 == 0) goto L_0x040f
            com.google.android.gms.internal.measurement.l6 r0 = (com.google.android.gms.internal.measurement.C1876l6) r0
            int r1 = r0.mo11471C()
            int r2 = com.google.android.gms.internal.measurement.C1889m4.C1894e.f3578j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.mo11813a()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = f3242q
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = f3243r
            java.lang.Object[] r16 = r0.mo11814b()
            com.google.android.gms.internal.measurement.x5 r17 = r0.mo11473E()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m4822t(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m4822t(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m4822t(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m4822t(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            com.google.android.gms.internal.measurement.b6 r2 = new com.google.android.gms.internal.measurement.b6
            com.google.android.gms.internal.measurement.x5 r10 = r0.mo11473E()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            com.google.android.gms.internal.measurement.b7 r0 = (com.google.android.gms.internal.measurement.C1722b7) r0
            r0.mo11471C()
            r0 = 0
            goto L_0x0417
        L_0x0416:
            throw r0
        L_0x0417:
            goto L_0x0416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.m4818p(java.lang.Class, com.google.android.gms.internal.measurement.v5, com.google.android.gms.internal.measurement.g6, com.google.android.gms.internal.measurement.h5, com.google.android.gms.internal.measurement.e7, com.google.android.gms.internal.measurement.a4, com.google.android.gms.internal.measurement.q5):com.google.android.gms.internal.measurement.b6");
    }

    /* renamed from: q */
    private final C1912n6 m4819q(int i) {
        int i2 = (i / 3) << 1;
        C1912n6 n6Var = (C1912n6) this.f3245b[i2];
        if (n6Var != null) {
            return n6Var;
        }
        C1912n6 b = C1844j6.m5284a().mo11762b((Class) this.f3245b[i2 + 1]);
        this.f3245b[i2] = b;
        return b;
    }

    /* renamed from: r */
    private final <K, V, UT, UB> UB m4820r(int i, int i2, Map<K, V> map, C1984s4 s4Var, UB ub, C1768e7<UT, UB> e7Var) {
        C1926o5<?, ?> f = this.f3259p.mo11958f(m4797G(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!s4Var.mo11560a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = e7Var.mo11603a();
                }
                C1888m3 n = C1779f3.m5076n(C1940p5.m5764a(f, next.getKey(), next.getValue()));
                try {
                    C1940p5.m5765b(n.mo11837b(), f, next.getKey(), next.getValue());
                    e7Var.mo11605c(ub, i2, n.mo11836a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: s */
    private final <UT, UB> UB m4821s(Object obj, int i, UB ub, C1768e7<UT, UB> e7Var) {
        C1984s4 M;
        int i2 = this.f3244a[i];
        Object F = C1859k7.m5317F(obj, (long) (m4805O(i) & 1048575));
        if (F == null || (M = m4803M(i)) == null) {
            return ub;
        }
        return m4820r(i, i2, this.f3259p.mo11953a(F), M, ub, e7Var);
    }

    /* renamed from: t */
    private static Field m4822t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: u */
    private static List<?> m4823u(Object obj, long j) {
        return (List) C1859k7.m5317F(obj, j);
    }

    /* renamed from: v */
    private static void m4824v(int i, Object obj, C1723b8 b8Var) {
        if (obj instanceof String) {
            b8Var.mo11506r(i, (String) obj);
        } else {
            b8Var.mo11475B(i, (C1779f3) obj);
        }
    }

    /* renamed from: w */
    private static <UT, UB> void m4825w(C1768e7<UT, UB> e7Var, T t, C1723b8 b8Var) {
        e7Var.mo11606d(e7Var.mo11608f(t), b8Var);
    }

    /* renamed from: x */
    private final <K, V> void m4826x(C1723b8 b8Var, int i, Object obj, int i2) {
        if (obj != null) {
            b8Var.mo11480G(i, this.f3259p.mo11958f(m4797G(i2)), this.f3259p.mo11956d(obj));
        }
    }

    /* renamed from: y */
    private final void m4827y(T t, T t2, int i) {
        long O = (long) (m4805O(i) & 1048575);
        if (m4828z(t2, i)) {
            Object F = C1859k7.m5317F(t, O);
            Object F2 = C1859k7.m5317F(t2, O);
            if (F != null && F2 != null) {
                C1859k7.m5336j(t, O, C1925o4.m5643e(F, F2));
                m4798H(t, i);
            } else if (F2 != null) {
                C1859k7.m5336j(t, O, F2);
                m4798H(t, i);
            }
        }
    }

    /* renamed from: z */
    private final boolean m4828z(T t, int i) {
        int Q = m4807Q(i);
        long j = (long) (Q & 1048575);
        if (j == 1048575) {
            int O = m4805O(i);
            long j2 = (long) (O & 1048575);
            switch ((O & 267386880) >>> 20) {
                case 0:
                    return C1859k7.m5314C(t, j2) != 0.0d;
                case 1:
                    return C1859k7.m5350x(t, j2) != 0.0f;
                case 2:
                    return C1859k7.m5341o(t, j2) != 0;
                case 3:
                    return C1859k7.m5341o(t, j2) != 0;
                case 4:
                    return C1859k7.m5328b(t, j2) != 0;
                case 5:
                    return C1859k7.m5341o(t, j2) != 0;
                case 6:
                    return C1859k7.m5328b(t, j2) != 0;
                case 7:
                    return C1859k7.m5349w(t, j2);
                case 8:
                    Object F = C1859k7.m5317F(t, j2);
                    if (F instanceof String) {
                        return !((String) F).isEmpty();
                    }
                    if (F instanceof C1779f3) {
                        return !C1779f3.f3341b.equals(F);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C1859k7.m5317F(t, j2) != null;
                case 10:
                    return !C1779f3.f3341b.equals(C1859k7.m5317F(t, j2));
                case 11:
                    return C1859k7.m5328b(t, j2) != 0;
                case 12:
                    return C1859k7.m5328b(t, j2) != 0;
                case 13:
                    return C1859k7.m5328b(t, j2) != 0;
                case 14:
                    return C1859k7.m5341o(t, j2) != 0;
                case 15:
                    return C1859k7.m5328b(t, j2) != 0;
                case 16:
                    return C1859k7.m5341o(t, j2) != 0;
                case 17:
                    return C1859k7.m5317F(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C1859k7.m5328b(t, j) & (1 << (Q >>> 20))) != 0;
        }
    }

    /* renamed from: C */
    public final T mo11461C() {
        return this.f3255l.mo11668a(this.f3248e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m4806P(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m4808R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.measurement.C1925o4.m5641c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.measurement.C1925o4.m5640b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11462a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f3244a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m4805O(r1)
            int[] r4 = r8.f3244a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m4810T(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m4806P(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m4808R(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m4802L(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m4792A(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m4795E(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.measurement.C1925o4.m5641c(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.measurement.C1925o4.m5640b(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.e7<?, ?> r0 = r8.f3257n
            java.lang.Object r0 = r0.mo11608f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f3249f
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.a4<?> r0 = r8.f3258o
            com.google.android.gms.internal.measurement.f4 r9 = r0.mo11423b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11462a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final boolean mo11463b(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.f3253j) {
                return !this.f3249f || this.f3258o.mo11423b(t2).mo11659r();
            }
            int i6 = this.f3252i[i5];
            int i7 = this.f3244a[i6];
            int O = m4805O(i6);
            int i8 = this.f3244a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f3243r.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if (((268435456 & O) != 0) && !m4793B(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (267386880 & O) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (m4792A(t2, i7, i6) && !m4794D(t2, O, m4819q(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> d = this.f3259p.mo11956d(C1859k7.m5317F(t2, (long) (O & 1048575)));
                            if (!d.isEmpty()) {
                                if (this.f3259p.mo11958f(m4797G(i6)).f3613c.mo12160a() == C2081y7.MESSAGE) {
                                    C1912n6<?> n6Var = null;
                                    Iterator<?> it = d.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (n6Var == null) {
                                            n6Var = C1844j6.m5284a().mo11762b(next.getClass());
                                        }
                                        if (!n6Var.mo11463b(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C1859k7.m5317F(t2, (long) (O & 1048575));
                if (!list.isEmpty()) {
                    C1912n6 q = m4819q(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!q.mo11463b(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m4793B(t, i6, i2, i, i10) && !m4794D(t2, O, m4819q(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
    }

    /* renamed from: c */
    public final void mo11464c(T t) {
        int i;
        int i2 = this.f3253j;
        while (true) {
            i = this.f3254k;
            if (i2 >= i) {
                break;
            }
            long O = (long) (m4805O(this.f3252i[i2]) & 1048575);
            Object F = C1859k7.m5317F(t, O);
            if (F != null) {
                C1859k7.m5336j(t, O, this.f3259p.mo11954b(F));
            }
            i2++;
        }
        int length = this.f3252i.length;
        while (i < length) {
            this.f3256m.mo11714d(t, (long) this.f3252i[i]);
            i++;
        }
        this.f3257n.mo11612j(t);
        if (this.f3249f) {
            this.f3258o.mo11428g(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.measurement.C2028v3.m6149h0(r3) + com.google.android.gms.internal.measurement.C2028v3.m6156p0(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6139V(r3, (com.google.android.gms.internal.measurement.C2062x5) com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5), m4819q(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6154n0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6161u0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6162v0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6122B0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6126D0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6157q0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6138U(r3, (com.google.android.gms.internal.measurement.C1779f3) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.measurement.C1927o6.m5675a(r3, com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5), m4819q(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.measurement.C1779f3) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6131G(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6132H(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6165y0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6158r0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6153m0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6150i0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6143c0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6123C(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.measurement.C2028v3.m6121B(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 3;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0416, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x06b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0436, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043e, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x045e, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0466, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x0724;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0476, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.C1779f3) != false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x047e, code lost:
        if (m4792A(r1, r15, r3) != false) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0516, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0528, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x053a, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x054c, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055e, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0570, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0582, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0594, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a5, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b6, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c7, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d8, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e9, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05fa, code lost:
        if (r0.f3251h != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fc, code lost:
        r2.putInt(r1, (long) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0600, code lost:
        r9 = (com.google.android.gms.internal.measurement.C2028v3.m6149h0(r15) + com.google.android.gms.internal.measurement.C2028v3.m6156p0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06ab, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06ad, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b6, code lost:
        if ((r12 & r18) != 0) goto L_0x06b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b8, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6139V(r15, (com.google.android.gms.internal.measurement.C2062x5) r2.getObject(r1, r10), m4819q(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06cf, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6154n0(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06dc, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6161u0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e3, code lost:
        if ((r12 & r18) != 0) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e5, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6162v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06ee, code lost:
        if ((r12 & r18) != 0) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06f0, code lost:
        r9 = com.google.android.gms.internal.measurement.C2028v3.m6122B0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f5, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06ff, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6126D0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x070c, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6157q0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0713, code lost:
        if ((r12 & r18) != 0) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0715, code lost:
        r4 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0719, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6138U(r15, (com.google.android.gms.internal.measurement.C1779f3) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0722, code lost:
        if ((r12 & r18) != 0) goto L_0x0724;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0724, code lost:
        r4 = com.google.android.gms.internal.measurement.C1927o6.m5675a(r15, r2.getObject(r1, r10), m4819q(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x073c, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.C1779f3) != false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.measurement.C1779f3) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073f, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6131G(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0749, code lost:
        if ((r12 & r18) != 0) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074b, code lost:
        r4 = com.google.android.gms.internal.measurement.C2028v3.m6132H(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0798, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07ba, code lost:
        r3 = r3 + 3;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f3251h != false) goto L_0x020d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11465d(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f3250g
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f3243r
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f3244a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.m4805O(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f3244a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.g4 r14 = com.google.android.gms.internal.measurement.C1795g4.DOUBLE_LIST_PACKED
            int r14 = r14.mo11680C()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.g4 r14 = com.google.android.gms.internal.measurement.C1795g4.SINT64_LIST_PACKED
            int r14 = r14.mo11680C()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f3244a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m4808R(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m4806P(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m4806P(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m4806P(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m4806P(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m4808R(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.m4792A(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m4808R(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.m4792A(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            com.google.android.gms.internal.measurement.q5 r14 = r0.f3259p
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
            java.lang.Object r6 = r0.m4797G(r12)
            int r3 = r14.mo11960h(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m4823u(r1, r5)
            com.google.android.gms.internal.measurement.n6 r6 = r0.m4819q(r12)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5697s(r3, r5, r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5649A(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5664P(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5653E(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5661M(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5673Y(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5657I(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5699u(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5683e(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f3251h
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6149h0(r3)
            int r6 = com.google.android.gms.internal.measurement.C2028v3.m6156p0(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5704z(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5663O(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5652D(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5660L(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5696r(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m4823u(r1, r5)
            com.google.android.gms.internal.measurement.n6 r6 = r0.m4819q(r12)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5679c(r3, r5, r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5677b(r3, r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5672X(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5656H(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5698t(r3, r5, r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5681d(r3, r5, r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5666R(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m4823u(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5669U(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
            com.google.android.gms.internal.measurement.x5 r5 = (com.google.android.gms.internal.measurement.C2062x5) r5
            com.google.android.gms.internal.measurement.n6 r6 = r0.m4819q(r12)
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6139V(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6154n0(r3, r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r1, r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6161u0(r3, r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6162v0(r3, r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6122B0(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r1, r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6126D0(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6157q0(r3, r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.measurement.f3 r5 = (com.google.android.gms.internal.measurement.C1779f3) r5
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6138U(r3, r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
            com.google.android.gms.internal.measurement.n6 r6 = r0.m4819q(r12)
            int r3 = com.google.android.gms.internal.measurement.C1927o6.m5675a(r3, r5, r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6131G(r3, r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6132H(r3, r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6165y0(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6158r0(r3, r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r1, r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6153m0(r3, r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6150i0(r3, r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.m4828z(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6143c0(r3, r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6123C(r3, r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.m4828z(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.C2028v3.m6121B(r3, r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            com.google.android.gms.internal.measurement.e7<?, ?> r2 = r0.f3257n
            int r1 = m4813j(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f3243r
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x03c0:
            int[] r13 = r0.f3244a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x07c1
            int r13 = r0.m4805O(r3)
            int[] r14 = r0.f3244a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03eb
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x03e9
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r6 = r14
        L_0x03e9:
            r9 = r11
            goto L_0x040a
        L_0x03eb:
            boolean r9 = r0.f3251h
            if (r9 == 0) goto L_0x0407
            com.google.android.gms.internal.measurement.g4 r9 = com.google.android.gms.internal.measurement.C1795g4.DOUBLE_LIST_PACKED
            int r9 = r9.mo11680C()
            if (r4 < r9) goto L_0x0407
            com.google.android.gms.internal.measurement.g4 r9 = com.google.android.gms.internal.measurement.C1795g4.SINT64_LIST_PACKED
            int r9 = r9.mo11680C()
            if (r4 > r9) goto L_0x0407
            int[] r9 = r0.f3244a
            int r10 = r3 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0408
        L_0x0407:
            r9 = 0
        L_0x0408:
            r18 = 0
        L_0x040a:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x07ab;
                case 1: goto L_0x079b;
                case 2: goto L_0x0789;
                case 3: goto L_0x0779;
                case 4: goto L_0x0769;
                case 5: goto L_0x075d;
                case 6: goto L_0x0751;
                case 7: goto L_0x0747;
                case 8: goto L_0x0732;
                case 9: goto L_0x0720;
                case 10: goto L_0x0711;
                case 11: goto L_0x0704;
                case 12: goto L_0x06f7;
                case 13: goto L_0x06ec;
                case 14: goto L_0x06e1;
                case 15: goto L_0x06d4;
                case 16: goto L_0x06c7;
                case 17: goto L_0x06b4;
                case 18: goto L_0x06a0;
                case 19: goto L_0x0694;
                case 20: goto L_0x0688;
                case 21: goto L_0x067c;
                case 22: goto L_0x0670;
                case 23: goto L_0x06a0;
                case 24: goto L_0x0694;
                case 25: goto L_0x0664;
                case 26: goto L_0x0659;
                case 27: goto L_0x064a;
                case 28: goto L_0x063f;
                case 29: goto L_0x0633;
                case 30: goto L_0x0626;
                case 31: goto L_0x0694;
                case 32: goto L_0x06a0;
                case 33: goto L_0x0619;
                case 34: goto L_0x060c;
                case 35: goto L_0x05ec;
                case 36: goto L_0x05db;
                case 37: goto L_0x05ca;
                case 38: goto L_0x05b9;
                case 39: goto L_0x05a8;
                case 40: goto L_0x0597;
                case 41: goto L_0x0586;
                case 42: goto L_0x0574;
                case 43: goto L_0x0562;
                case 44: goto L_0x0550;
                case 45: goto L_0x053e;
                case 46: goto L_0x052c;
                case 47: goto L_0x051a;
                case 48: goto L_0x0508;
                case 49: goto L_0x04f8;
                case 50: goto L_0x04e8;
                case 51: goto L_0x04da;
                case 52: goto L_0x04cd;
                case 53: goto L_0x04bd;
                case 54: goto L_0x04ad;
                case 55: goto L_0x049d;
                case 56: goto L_0x048f;
                case 57: goto L_0x0482;
                case 58: goto L_0x047a;
                case 59: goto L_0x046a;
                case 60: goto L_0x0462;
                case 61: goto L_0x045a;
                case 62: goto L_0x044e;
                case 63: goto L_0x0442;
                case 64: goto L_0x043a;
                case 65: goto L_0x0432;
                case 66: goto L_0x0426;
                case 67: goto L_0x041a;
                case 68: goto L_0x0412;
                default: goto L_0x0410;
            }
        L_0x0410:
            goto L_0x06ac
        L_0x0412:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x06b8
        L_0x041a:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            long r9 = m4808R(r1, r10)
            goto L_0x06cf
        L_0x0426:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            int r4 = m4806P(r1, r10)
            goto L_0x06dc
        L_0x0432:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x06e5
        L_0x043a:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x06f0
        L_0x0442:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            int r4 = m4806P(r1, r10)
            goto L_0x06ff
        L_0x044e:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            int r4 = m4806P(r1, r10)
            goto L_0x070c
        L_0x045a:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x0715
        L_0x0462:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x0724
        L_0x046a:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r9 == 0) goto L_0x073f
            goto L_0x073e
        L_0x047a:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            goto L_0x074b
        L_0x0482:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6165y0(r15, r4)
            goto L_0x06f5
        L_0x048f:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6158r0(r15, r9)
            goto L_0x06ab
        L_0x049d:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            int r4 = m4806P(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6153m0(r15, r4)
            goto L_0x06ab
        L_0x04ad:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            long r9 = m4808R(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6150i0(r15, r9)
            goto L_0x06ab
        L_0x04bd:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            long r9 = m4808R(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6143c0(r15, r9)
            goto L_0x06ab
        L_0x04cd:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6123C(r15, r4)
            goto L_0x06f5
        L_0x04da:
            boolean r4 = r0.m4792A(r1, r15, r3)
            if (r4 == 0) goto L_0x06ac
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6121B(r15, r9)
            goto L_0x06ab
        L_0x04e8:
            com.google.android.gms.internal.measurement.q5 r4 = r0.f3259p
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.m4797G(r3)
            int r4 = r4.mo11960h(r15, r9, r10)
            goto L_0x06ab
        L_0x04f8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.n6 r9 = r0.m4819q(r3)
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5697s(r15, r4, r9)
            goto L_0x06ab
        L_0x0508:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5649A(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x051a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5664P(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x052c:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x053e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x0550:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5653E(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x0562:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5661M(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x0574:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5673Y(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x0586:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x0597:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x05a8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5657I(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x05b9:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5699u(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x05ca:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5683e(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x05db:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5667S(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
            goto L_0x05fc
        L_0x05ec:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5670V(r4)
            if (r4 <= 0) goto L_0x06ac
            boolean r10 = r0.f3251h
            if (r10 == 0) goto L_0x0600
        L_0x05fc:
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0600:
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6149h0(r15)
            int r10 = com.google.android.gms.internal.measurement.C2028v3.m6156p0(r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x06f5
        L_0x060c:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5704z(r15, r4, r9)
            goto L_0x06ab
        L_0x0619:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5663O(r15, r4, r9)
            goto L_0x06ab
        L_0x0626:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5652D(r15, r4, r9)
            goto L_0x06ab
        L_0x0633:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5660L(r15, r4, r9)
            goto L_0x06ab
        L_0x063f:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5696r(r15, r4)
            goto L_0x06ab
        L_0x064a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.n6 r9 = r0.m4819q(r3)
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5679c(r15, r4, r9)
            goto L_0x06ab
        L_0x0659:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5677b(r15, r4)
            goto L_0x06ab
        L_0x0664:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5672X(r15, r4, r9)
            goto L_0x06ab
        L_0x0670:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5656H(r15, r4, r9)
            goto L_0x06ab
        L_0x067c:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5698t(r15, r4, r9)
            goto L_0x06ab
        L_0x0688:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5681d(r15, r4, r9)
            goto L_0x06ab
        L_0x0694:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5666R(r15, r4, r9)
            goto L_0x06ab
        L_0x06a0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5669U(r15, r4, r9)
        L_0x06ab:
            int r5 = r5 + r4
        L_0x06ac:
            r4 = 0
        L_0x06ad:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07ba
        L_0x06b4:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x06b8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.x5 r4 = (com.google.android.gms.internal.measurement.C2062x5) r4
            com.google.android.gms.internal.measurement.n6 r9 = r0.m4819q(r3)
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6139V(r15, r4, r9)
            goto L_0x06ab
        L_0x06c7:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            long r9 = r2.getLong(r1, r10)
        L_0x06cf:
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6154n0(r15, r9)
            goto L_0x06ab
        L_0x06d4:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            int r4 = r2.getInt(r1, r10)
        L_0x06dc:
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6161u0(r15, r4)
            goto L_0x06ab
        L_0x06e1:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x06e5:
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6162v0(r15, r9)
            goto L_0x06ab
        L_0x06ec:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x06f0:
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6122B0(r15, r4)
        L_0x06f5:
            int r5 = r5 + r9
            goto L_0x06ac
        L_0x06f7:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            int r4 = r2.getInt(r1, r10)
        L_0x06ff:
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6126D0(r15, r4)
            goto L_0x06ab
        L_0x0704:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            int r4 = r2.getInt(r1, r10)
        L_0x070c:
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6157q0(r15, r4)
            goto L_0x06ab
        L_0x0711:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x0715:
            java.lang.Object r4 = r2.getObject(r1, r10)
        L_0x0719:
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C1779f3) r4
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6138U(r15, r4)
            goto L_0x06ab
        L_0x0720:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x0724:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.n6 r9 = r0.m4819q(r3)
            int r4 = com.google.android.gms.internal.measurement.C1927o6.m5675a(r15, r4, r9)
            goto L_0x06ab
        L_0x0732:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r9 == 0) goto L_0x073f
        L_0x073e:
            goto L_0x0719
        L_0x073f:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6131G(r15, r4)
            goto L_0x06ab
        L_0x0747:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
        L_0x074b:
            int r4 = com.google.android.gms.internal.measurement.C2028v3.m6132H(r15, r7)
            goto L_0x06ab
        L_0x0751:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ac
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6165y0(r15, r4)
            int r5 = r5 + r9
            goto L_0x06ad
        L_0x075d:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0799
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6158r0(r15, r13)
            goto L_0x0798
        L_0x0769:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0799
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6153m0(r15, r9)
            goto L_0x0798
        L_0x0779:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0799
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6150i0(r15, r9)
            goto L_0x0798
        L_0x0789:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0799
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.C2028v3.m6143c0(r15, r9)
        L_0x0798:
            int r5 = r5 + r9
        L_0x0799:
            r9 = 0
            goto L_0x07a8
        L_0x079b:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0799
            r9 = 0
            int r10 = com.google.android.gms.internal.measurement.C2028v3.m6123C(r15, r9)
            int r5 = r5 + r10
        L_0x07a8:
            r10 = 0
            goto L_0x07ba
        L_0x07ab:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x07a8
            r10 = 0
            int r15 = com.google.android.gms.internal.measurement.C2028v3.m6121B(r15, r10)
            int r5 = r5 + r15
        L_0x07ba:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x03c0
        L_0x07c1:
            r4 = 0
            com.google.android.gms.internal.measurement.e7<?, ?> r2 = r0.f3257n
            int r2 = m4813j(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f3249f
            if (r2 == 0) goto L_0x081b
            com.google.android.gms.internal.measurement.a4<?> r2 = r0.f3258o
            com.google.android.gms.internal.measurement.f4 r1 = r2.mo11423b(r1)
            r11 = 0
        L_0x07d4:
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r2 = r1.f3345a
            int r2 = r2.mo11998j()
            if (r11 >= r2) goto L_0x07f4
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r2 = r1.f3345a
            java.util.Map$Entry r2 = r2.mo11995h(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.h4 r3 = (com.google.android.gms.internal.measurement.C1811h4) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.C1780f4.m5087a(r3, r2)
            int r4 = r4 + r2
            int r11 = r11 + 1
            goto L_0x07d4
        L_0x07f4:
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r1 = r1.f3345a
            java.lang.Iterable r1 = r1.mo11999m()
            java.util.Iterator r1 = r1.iterator()
        L_0x07fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x081a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.h4 r3 = (com.google.android.gms.internal.measurement.C1811h4) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.C1780f4.m5087a(r3, r2)
            int r4 = r4 + r2
            goto L_0x07fe
        L_0x081a:
            int r5 = r5 + r4
        L_0x081b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11465d(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.measurement.C1927o6.m5695q(com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6), com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.measurement.C1927o6.m5695q(com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6), com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.measurement.C1927o6.m5695q(com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6), com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.measurement.C1927o6.m5695q(com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6), com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5349w(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5349w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6) == com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C1859k7.m5350x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C1859k7.m5350x(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C1859k7.m5314C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C1859k7.m5314C(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C1927o6.m5695q(com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6), com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)) != false) goto L_0x01b3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11466e(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f3244a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.m4805O(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.m4807Q(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r3, r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C1927o6.m5695q(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.m4804N(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.measurement.e7<?, ?> r0 = r9.f3257n
            java.lang.Object r0 = r0.mo11608f(r10)
            com.google.android.gms.internal.measurement.e7<?, ?> r2 = r9.f3257n
            java.lang.Object r2 = r2.mo11608f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.f3249f
            if (r0 == 0) goto L_0x01e2
            com.google.android.gms.internal.measurement.a4<?> r0 = r9.f3258o
            com.google.android.gms.internal.measurement.f4 r10 = r0.mo11423b(r10)
            com.google.android.gms.internal.measurement.a4<?> r0 = r9.f3258o
            com.google.android.gms.internal.measurement.f4 r11 = r0.mo11423b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11466e(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0345, code lost:
        r14.mo11487N(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0356, code lost:
        r14.mo11514z(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
        r14.mo11494f(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0378, code lost:
        r14.mo11509u(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r14.mo11496h(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        r14.mo11486M(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a5, code lost:
        r14.mo11475B(r9, (com.google.android.gms.internal.measurement.C1779f3) com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        r14.mo11477D(r9, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r7 & 1048575)), m4819q(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cd, code lost:
        m4824v(r9, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e4, code lost:
        r14.mo11492d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f5, code lost:
        r14.mo11483J(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r14.mo11484K(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0415, code lost:
        r14.mo11499k(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0425, code lost:
        r14.mo11500l(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0435, code lost:
        r14.mo11510v(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r14.mo11512x(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0455, code lost:
        r14.mo11511w(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0783, code lost:
        r14.mo11503o(r10, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r8 & 1048575)), m4819q(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079e, code lost:
        r14.mo11487N(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07af, code lost:
        r14.mo11514z(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c0, code lost:
        r14.mo11494f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07d1, code lost:
        r14.mo11509u(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07e2, code lost:
        r14.mo11496h(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07f3, code lost:
        r14.mo11486M(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fe, code lost:
        r14.mo11475B(r10, (com.google.android.gms.internal.measurement.C1779f3) com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0811, code lost:
        r14.mo11477D(r10, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r8 & 1048575)), m4819q(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0826, code lost:
        m4824v(r10, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083d, code lost:
        r14.mo11492d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084e, code lost:
        r14.mo11483J(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085e, code lost:
        r14.mo11484K(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086e, code lost:
        r14.mo11499k(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        r14.mo11500l(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088e, code lost:
        r14.mo11510v(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089e, code lost:
        r14.mo11512x(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ae, code lost:
        r14.mo11511w(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
        r14.mo11503o(r9, com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, (long) (r7 & 1048575)), m4819q(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11467f(T r13, com.google.android.gms.internal.measurement.C1723b8 r14) {
        /*
            r12 = this;
            int r0 = r14.mo11476C()
            int r1 = com.google.android.gms.internal.measurement.C1889m4.C1894e.f3580l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x046b
            com.google.android.gms.internal.measurement.e7<?, ?> r0 = r12.f3257n
            m4825w(r0, r13, r14)
            boolean r0 = r12.f3249f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.a4<?> r0 = r12.f3258o
            com.google.android.gms.internal.measurement.f4 r0 = r0.mo11423b(r13)
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r1 = r0.f3345a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo11658q()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f3244a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x0462
            int r7 = r12.m4805O(r1)
            int[] r8 = r12.f3244a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x045c
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0449;
                case 1: goto L_0x0439;
                case 2: goto L_0x0429;
                case 3: goto L_0x0419;
                case 4: goto L_0x0409;
                case 5: goto L_0x03f9;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03d8;
                case 8: goto L_0x03c7;
                case 9: goto L_0x03b2;
                case 10: goto L_0x039f;
                case 11: goto L_0x038e;
                case 12: goto L_0x037d;
                case 13: goto L_0x036c;
                case 14: goto L_0x035b;
                case 15: goto L_0x034a;
                case 16: goto L_0x0339;
                case 17: goto L_0x0324;
                case 18: goto L_0x0315;
                case 19: goto L_0x0306;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02bb;
                case 25: goto L_0x02ac;
                case 26: goto L_0x029d;
                case 27: goto L_0x028a;
                case 28: goto L_0x027b;
                case 29: goto L_0x026c;
                case 30: goto L_0x025d;
                case 31: goto L_0x024e;
                case 32: goto L_0x023f;
                case 33: goto L_0x0230;
                case 34: goto L_0x0221;
                case 35: goto L_0x0212;
                case 36: goto L_0x0203;
                case 37: goto L_0x01f4;
                case 38: goto L_0x01e5;
                case 39: goto L_0x01d6;
                case 40: goto L_0x01c7;
                case 41: goto L_0x01b8;
                case 42: goto L_0x01a9;
                case 43: goto L_0x019a;
                case 44: goto L_0x018b;
                case 45: goto L_0x017c;
                case 46: goto L_0x016d;
                case 47: goto L_0x015e;
                case 48: goto L_0x014f;
                case 49: goto L_0x013c;
                case 50: goto L_0x0131;
                case 51: goto L_0x0123;
                case 52: goto L_0x0115;
                case 53: goto L_0x0107;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00eb;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a9;
                case 62: goto L_0x009b;
                case 63: goto L_0x008d;
                case 64: goto L_0x007f;
                case 65: goto L_0x0071;
                case 66: goto L_0x0063;
                case 67: goto L_0x0055;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0458
        L_0x004d:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x032a
        L_0x0055:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m4808R(r13, r7)
            goto L_0x0345
        L_0x0063:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x0356
        L_0x0071:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m4808R(r13, r7)
            goto L_0x0367
        L_0x007f:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x0378
        L_0x008d:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x0389
        L_0x009b:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x039a
        L_0x00a9:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03a5
        L_0x00b1:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03b8
        L_0x00b9:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03cd
        L_0x00c1:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m4810T(r13, r7)
            goto L_0x03e4
        L_0x00cf:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x03f5
        L_0x00dd:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m4808R(r13, r7)
            goto L_0x0405
        L_0x00eb:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m4806P(r13, r7)
            goto L_0x0415
        L_0x00f9:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m4808R(r13, r7)
            goto L_0x0425
        L_0x0107:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m4808R(r13, r7)
            goto L_0x0435
        L_0x0115:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m4802L(r13, r7)
            goto L_0x0445
        L_0x0123:
            boolean r8 = r12.m4792A(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m4795E(r13, r7)
            goto L_0x0455
        L_0x0131:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r7)
            r12.m4826x(r14, r9, r7, r1)
            goto L_0x0458
        L_0x013c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.n6 r9 = r12.m4819q(r1)
            com.google.android.gms.internal.measurement.C1927o6.m5702x(r8, r7, r14, r9)
            goto L_0x0458
        L_0x014f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r8, r7, r14, r4)
            goto L_0x0458
        L_0x015e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r8, r7, r14, r4)
            goto L_0x0458
        L_0x016d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r8, r7, r14, r4)
            goto L_0x0458
        L_0x017c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x018b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x019a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01a9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01b8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01c7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01d6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01e5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01f4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0203:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0212:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0221:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0230:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r8, r7, r14, r5)
            goto L_0x0458
        L_0x023f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r8, r7, r14, r5)
            goto L_0x0458
        L_0x024e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x025d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x026c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r8, r7, r14, r5)
            goto L_0x0458
        L_0x027b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5701w(r8, r7, r14)
            goto L_0x0458
        L_0x028a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.n6 r9 = r12.m4819q(r1)
            com.google.android.gms.internal.measurement.C1927o6.m5689k(r8, r7, r14, r9)
            goto L_0x0458
        L_0x029d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5688j(r8, r7, r14)
            goto L_0x0458
        L_0x02ac:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02bb:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02ca:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02d9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02e8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02f7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0306:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0315:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0324:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x032a:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r7)
            com.google.android.gms.internal.measurement.n6 r8 = r12.m4819q(r1)
            r14.mo11503o(r9, r7, r8)
            goto L_0x0458
        L_0x0339:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r7)
        L_0x0345:
            r14.mo11487N(r9, r7)
            goto L_0x0458
        L_0x034a:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x0356:
            r14.mo11514z(r9, r7)
            goto L_0x0458
        L_0x035b:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r7)
        L_0x0367:
            r14.mo11494f(r9, r7)
            goto L_0x0458
        L_0x036c:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x0378:
            r14.mo11509u(r9, r7)
            goto L_0x0458
        L_0x037d:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x0389:
            r14.mo11496h(r9, r7)
            goto L_0x0458
        L_0x038e:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x039a:
            r14.mo11486M(r9, r7)
            goto L_0x0458
        L_0x039f:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03a5:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r7)
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.C1779f3) r7
            r14.mo11475B(r9, r7)
            goto L_0x0458
        L_0x03b2:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03b8:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r7)
            com.google.android.gms.internal.measurement.n6 r8 = r12.m4819q(r1)
            r14.mo11477D(r9, r7, r8)
            goto L_0x0458
        L_0x03c7:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03cd:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r7)
            m4824v(r9, r7, r14)
            goto L_0x0458
        L_0x03d8:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r13, r7)
        L_0x03e4:
            r14.mo11492d(r9, r7)
            goto L_0x0458
        L_0x03e9:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x03f5:
            r14.mo11483J(r9, r7)
            goto L_0x0458
        L_0x03f9:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r7)
        L_0x0405:
            r14.mo11484K(r9, r7)
            goto L_0x0458
        L_0x0409:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r7)
        L_0x0415:
            r14.mo11499k(r9, r7)
            goto L_0x0458
        L_0x0419:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r7)
        L_0x0425:
            r14.mo11500l(r9, r7)
            goto L_0x0458
        L_0x0429:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r7)
        L_0x0435:
            r14.mo11510v(r9, r7)
            goto L_0x0458
        L_0x0439:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r13, r7)
        L_0x0445:
            r14.mo11512x(r9, r7)
            goto L_0x0458
        L_0x0449:
            boolean r8 = r12.m4828z(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r13, r7)
        L_0x0455:
            r14.mo11511w(r9, r7)
        L_0x0458:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x045c:
            com.google.android.gms.internal.measurement.a4<?> r13 = r12.f3258o
            r13.mo11422a(r0)
            throw r3
        L_0x0462:
            if (r0 != 0) goto L_0x0465
            return
        L_0x0465:
            com.google.android.gms.internal.measurement.a4<?> r13 = r12.f3258o
            r13.mo11425d(r14, r0)
            throw r3
        L_0x046b:
            boolean r0 = r12.f3250g
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r12.f3249f
            if (r0 == 0) goto L_0x048c
            com.google.android.gms.internal.measurement.a4<?> r0 = r12.f3258o
            com.google.android.gms.internal.measurement.f4 r0 = r0.mo11423b(r13)
            com.google.android.gms.internal.measurement.r6<T, java.lang.Object> r1 = r0.f3345a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x048c
            java.util.Iterator r0 = r0.mo11657p()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x048d
        L_0x048c:
            r0 = r3
        L_0x048d:
            int[] r1 = r12.f3244a
            int r1 = r1.length
            r7 = 0
        L_0x0491:
            if (r7 >= r1) goto L_0x08bb
            int r8 = r12.m4805O(r7)
            int[] r9 = r12.f3244a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x08b5
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x08a2;
                case 1: goto L_0x0892;
                case 2: goto L_0x0882;
                case 3: goto L_0x0872;
                case 4: goto L_0x0862;
                case 5: goto L_0x0852;
                case 6: goto L_0x0842;
                case 7: goto L_0x0831;
                case 8: goto L_0x0820;
                case 9: goto L_0x080b;
                case 10: goto L_0x07f8;
                case 11: goto L_0x07e7;
                case 12: goto L_0x07d6;
                case 13: goto L_0x07c5;
                case 14: goto L_0x07b4;
                case 15: goto L_0x07a3;
                case 16: goto L_0x0792;
                case 17: goto L_0x077d;
                case 18: goto L_0x076e;
                case 19: goto L_0x075f;
                case 20: goto L_0x0750;
                case 21: goto L_0x0741;
                case 22: goto L_0x0732;
                case 23: goto L_0x0723;
                case 24: goto L_0x0714;
                case 25: goto L_0x0705;
                case 26: goto L_0x06f6;
                case 27: goto L_0x06e3;
                case 28: goto L_0x06d4;
                case 29: goto L_0x06c5;
                case 30: goto L_0x06b6;
                case 31: goto L_0x06a7;
                case 32: goto L_0x0698;
                case 33: goto L_0x0689;
                case 34: goto L_0x067a;
                case 35: goto L_0x066b;
                case 36: goto L_0x065c;
                case 37: goto L_0x064d;
                case 38: goto L_0x063e;
                case 39: goto L_0x062f;
                case 40: goto L_0x0620;
                case 41: goto L_0x0611;
                case 42: goto L_0x0602;
                case 43: goto L_0x05f3;
                case 44: goto L_0x05e4;
                case 45: goto L_0x05d5;
                case 46: goto L_0x05c6;
                case 47: goto L_0x05b7;
                case 48: goto L_0x05a8;
                case 49: goto L_0x0595;
                case 50: goto L_0x058a;
                case 51: goto L_0x057c;
                case 52: goto L_0x056e;
                case 53: goto L_0x0560;
                case 54: goto L_0x0552;
                case 55: goto L_0x0544;
                case 56: goto L_0x0536;
                case 57: goto L_0x0528;
                case 58: goto L_0x051a;
                case 59: goto L_0x0512;
                case 60: goto L_0x050a;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x04a6;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x08b1
        L_0x04a6:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0783
        L_0x04ae:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m4808R(r13, r8)
            goto L_0x079e
        L_0x04bc:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x07af
        L_0x04ca:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m4808R(r13, r8)
            goto L_0x07c0
        L_0x04d8:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x07d1
        L_0x04e6:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x07e2
        L_0x04f4:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x07f3
        L_0x0502:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x07fe
        L_0x050a:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0811
        L_0x0512:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0826
        L_0x051a:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m4810T(r13, r8)
            goto L_0x083d
        L_0x0528:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x084e
        L_0x0536:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m4808R(r13, r8)
            goto L_0x085e
        L_0x0544:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m4806P(r13, r8)
            goto L_0x086e
        L_0x0552:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m4808R(r13, r8)
            goto L_0x087e
        L_0x0560:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m4808R(r13, r8)
            goto L_0x088e
        L_0x056e:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m4802L(r13, r8)
            goto L_0x089e
        L_0x057c:
            boolean r9 = r12.m4792A(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m4795E(r13, r8)
            goto L_0x08ae
        L_0x058a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r8)
            r12.m4826x(r14, r10, r8, r7)
            goto L_0x08b1
        L_0x0595:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.n6 r10 = r12.m4819q(r7)
            com.google.android.gms.internal.measurement.C1927o6.m5702x(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x05a8:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05b7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05c6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05d5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05e4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05f3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0602:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0611:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0620:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x062f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x063e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x064d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x065c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x066b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x067a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5659K(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0689:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5674Z(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0698:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5665Q(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06a7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5678b0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06b6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5680c0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06c5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5671W(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06d4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5701w(r9, r8, r14)
            goto L_0x08b1
        L_0x06e3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.n6 r10 = r12.m4819q(r7)
            com.google.android.gms.internal.measurement.C1927o6.m5689k(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x06f6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5688j(r9, r8, r14)
            goto L_0x08b1
        L_0x0705:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5682d0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0714:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5676a0(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0723:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5662N(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0732:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5668T(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0741:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5655G(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0750:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5651C(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x075f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5703y(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x076e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C1927o6.m5690l(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x077d:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0783:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r8)
            com.google.android.gms.internal.measurement.n6 r9 = r12.m4819q(r7)
            r14.mo11503o(r10, r8, r9)
            goto L_0x08b1
        L_0x0792:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r8)
        L_0x079e:
            r14.mo11487N(r10, r8)
            goto L_0x08b1
        L_0x07a3:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x07af:
            r14.mo11514z(r10, r8)
            goto L_0x08b1
        L_0x07b4:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r8)
        L_0x07c0:
            r14.mo11494f(r10, r8)
            goto L_0x08b1
        L_0x07c5:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x07d1:
            r14.mo11509u(r10, r8)
            goto L_0x08b1
        L_0x07d6:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x07e2:
            r14.mo11496h(r10, r8)
            goto L_0x08b1
        L_0x07e7:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x07f3:
            r14.mo11486M(r10, r8)
            goto L_0x08b1
        L_0x07f8:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x07fe:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r8)
            com.google.android.gms.internal.measurement.f3 r8 = (com.google.android.gms.internal.measurement.C1779f3) r8
            r14.mo11475B(r10, r8)
            goto L_0x08b1
        L_0x080b:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0811:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r8)
            com.google.android.gms.internal.measurement.n6 r9 = r12.m4819q(r7)
            r14.mo11477D(r10, r8, r9)
            goto L_0x08b1
        L_0x0820:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0826:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r13, r8)
            m4824v(r10, r8, r14)
            goto L_0x08b1
        L_0x0831:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r13, r8)
        L_0x083d:
            r14.mo11492d(r10, r8)
            goto L_0x08b1
        L_0x0842:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x084e:
            r14.mo11483J(r10, r8)
            goto L_0x08b1
        L_0x0852:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r8)
        L_0x085e:
            r14.mo11484K(r10, r8)
            goto L_0x08b1
        L_0x0862:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r13, r8)
        L_0x086e:
            r14.mo11499k(r10, r8)
            goto L_0x08b1
        L_0x0872:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r8)
        L_0x087e:
            r14.mo11500l(r10, r8)
            goto L_0x08b1
        L_0x0882:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r13, r8)
        L_0x088e:
            r14.mo11510v(r10, r8)
            goto L_0x08b1
        L_0x0892:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r13, r8)
        L_0x089e:
            r14.mo11512x(r10, r8)
            goto L_0x08b1
        L_0x08a2:
            boolean r9 = r12.m4828z(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r13, r8)
        L_0x08ae:
            r14.mo11511w(r10, r8)
        L_0x08b1:
            int r7 = r7 + 3
            goto L_0x0491
        L_0x08b5:
            com.google.android.gms.internal.measurement.a4<?> r13 = r12.f3258o
            r13.mo11422a(r0)
            throw r3
        L_0x08bb:
            if (r0 != 0) goto L_0x08c3
            com.google.android.gms.internal.measurement.e7<?, ?> r0 = r12.f3257n
            m4825w(r0, r13, r14)
            return
        L_0x08c3:
            com.google.android.gms.internal.measurement.a4<?> r13 = r12.f3258o
            r13.mo11425d(r14, r0)
            throw r3
        L_0x08c9:
            r12.m4800J(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11467f(java.lang.Object, com.google.android.gms.internal.measurement.b8):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c6, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030d, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        if (r0 == r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0330, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        r1 = r11.f3323c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        r7.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c8, code lost:
        r1 = r11.f3321a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021e, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0223, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11468g(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C1764e3 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f3250g
            if (r0 == 0) goto L_0x0375
            sun.misc.Unsafe r9 = f3243r
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0358
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4771d(r0, r12, r3, r11)
            int r3 = r11.f3321a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.m4812i(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.m4811U(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r18 = 0
        L_0x004e:
            r20 = -1
            goto L_0x0332
        L_0x0052:
            int[] r0 = r15.f3244a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x022c
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0207;
                case 1: goto L_0x01f0;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01b7;
                case 5: goto L_0x0195;
                case 6: goto L_0x017e;
                case 7: goto L_0x015e;
                case 8: goto L_0x0141;
                case 9: goto L_0x011c;
                case 10: goto L_0x0104;
                case 11: goto L_0x01b7;
                case 12: goto L_0x00f2;
                case 13: goto L_0x017e;
                case 14: goto L_0x0195;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x0223
        L_0x00a5:
            if (r3 != 0) goto L_0x00cc
            int r10 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r4, r11)
            long r0 = r11.f3322b
            long r17 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x0276
        L_0x00cc:
            r25 = r33
            r8 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0223
        L_0x00da:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r4, r11)
            int r1 = r11.f3321a
            int r1 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r1)
            goto L_0x01ca
        L_0x00f2:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r4, r11)
            goto L_0x01c8
        L_0x0104:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4784q(r12, r4, r11)
        L_0x0115:
            java.lang.Object r1 = r11.f3323c
        L_0x0117:
            r7.putObject(r14, r8, r1)
            goto L_0x021e
        L_0x011c:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            com.google.android.gms.internal.measurement.n6 r0 = r15.m4819q(r10)
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4774g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x013a
            java.lang.Object r1 = r11.f3323c
            goto L_0x0117
        L_0x013a:
            java.lang.Object r2 = r11.f3323c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1925o4.m5643e(r1, r2)
            goto L_0x0117
        L_0x0141:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0159
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4781n(r12, r4, r11)
            goto L_0x0115
        L_0x0159:
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4783p(r12, r4, r11)
            goto L_0x0115
        L_0x015e:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r4, r11)
            long r1 = r11.f3322b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0178
            r1 = 1
            goto L_0x0179
        L_0x0178:
            r1 = 0
        L_0x0179:
            com.google.android.gms.internal.measurement.C1859k7.m5337k(r14, r8, r1)
            goto L_0x021e
        L_0x017e:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x021e
        L_0x0195:
            r25 = r33
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01b4
            long r17 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x021e
        L_0x01b4:
            r5 = r4
            goto L_0x0223
        L_0x01b7:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0223
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r5, r11)
        L_0x01c8:
            int r1 = r11.f3321a
        L_0x01ca:
            r7.putInt(r14, r8, r1)
            goto L_0x021e
        L_0x01ce:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0223
            int r17 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r5, r11)
            long r4 = r11.f3322b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x0276
        L_0x01f0:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0223
            float r0 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r12, r5)
            com.google.android.gms.internal.measurement.C1859k7.m5333g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x021e
        L_0x0207:
            r25 = r33
            r5 = r4
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0223
            double r0 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r12, r5)
            com.google.android.gms.internal.measurement.C1859k7.m5332f(r14, r8, r0)
            int r0 = r5 + 8
        L_0x021e:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x0276
        L_0x0223:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            goto L_0x004e
        L_0x022c:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x0289
            r0 = 2
            if (r3 != r0) goto L_0x027c
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.t4 r0 = (com.google.android.gms.internal.measurement.C1999t4) r0
            boolean r1 = r0.mo12091C()
            if (r1 != 0) goto L_0x025c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0253
            r1 = 10
            goto L_0x0255
        L_0x0253:
            int r1 = r1 << 1
        L_0x0255:
            com.google.android.gms.internal.measurement.t4 r0 = r0.mo11562a(r1)
            r7.putObject(r14, r8, r0)
        L_0x025c:
            r8 = r0
            com.google.android.gms.internal.measurement.n6 r0 = r15.m4819q(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4772e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x0276:
            r7 = r20
            r1 = r25
            goto L_0x0352
        L_0x027c:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x0310
        L_0x0289:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02de
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.m4815l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02ca
            goto L_0x0330
        L_0x02ca:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0350
        L_0x02de:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            r7 = r33
            if (r9 != r0) goto L_0x0316
            r0 = 2
            if (r7 != r0) goto L_0x0310
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.m4816m(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02ca
            goto L_0x0330
        L_0x0310:
            r2 = r15
        L_0x0311:
            r6 = r27
            r7 = r28
            goto L_0x0332
        L_0x0316:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.m4814k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02ca
        L_0x0330:
            r2 = r0
            goto L_0x0311
        L_0x0332:
            com.google.android.gms.internal.measurement.h7 r4 = m4809S(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4770c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
        L_0x0350:
            r9 = r29
        L_0x0352:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x0358:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x036b
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x036b:
            r4 = r34
            if (r0 != r4) goto L_0x0370
            return
        L_0x0370:
            com.google.android.gms.internal.measurement.w4 r0 = com.google.android.gms.internal.measurement.C2046w4.m6269e()
            throw r0
        L_0x0375:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo11470n(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11468g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e3):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.measurement.C1859k7.m5336j(r7, r2, com.google.android.gms.internal.measurement.C1859k7.m5317F(r8, r2));
        m4799I(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.measurement.C1859k7.m5336j(r7, r2, com.google.android.gms.internal.measurement.C1859k7.m5317F(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.measurement.C1859k7.m5334h(r7, r2, com.google.android.gms.internal.measurement.C1859k7.m5328b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.measurement.C1859k7.m5335i(r7, r2, com.google.android.gms.internal.measurement.C1859k7.m5341o(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        m4798H(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11469h(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0101
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f3244a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m4805O(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f3244a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m4792A(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m4801K(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m4792A(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5336j(r7, r2, r1)
            r6.m4799I(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.measurement.q5 r1 = r6.f3259p
            com.google.android.gms.internal.measurement.C1927o6.m5692n(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.measurement.h5 r1 = r6.f3256m
            r1.mo11713b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m4827y(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1859k7.m5317F(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5336j(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.measurement.C1859k7.m5349w(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5337k(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.measurement.C1859k7.m5328b(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5334h(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.measurement.C1859k7.m5341o(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5335i(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.measurement.C1859k7.m5350x(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5333g(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m4828z(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.measurement.C1859k7.m5314C(r8, r2)
            com.google.android.gms.internal.measurement.C1859k7.m5332f(r7, r2, r4)
        L_0x00eb:
            r6.m4798H(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00f2:
            com.google.android.gms.internal.measurement.e7<?, ?> r0 = r6.f3257n
            com.google.android.gms.internal.measurement.C1927o6.m5693o(r0, r7, r8)
            boolean r0 = r6.f3249f
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.measurement.a4<?> r0 = r6.f3258o
            com.google.android.gms.internal.measurement.C1927o6.m5691m(r0, r7, r8)
        L_0x0100:
            return
        L_0x0101:
            r7 = 0
            goto L_0x0104
        L_0x0103:
            throw r7
        L_0x0104:
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11469h(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a4, code lost:
        if (r0 == r15) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e7, code lost:
        if (r0 == r15) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f5, code lost:
        r10.putObject(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0243, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0247, code lost:
        r3 = r8;
        r1 = r9;
        r9 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x028d, code lost:
        r10.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b2, code lost:
        r0.putLong(r1, r2, r4);
        r5 = r6 | r22;
        r6 = r30;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f3, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f7, code lost:
        r3 = r8;
        r1 = r9;
        r2 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fb, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        r7 = r32;
        r2 = r3;
        r22 = r6;
        r26 = r10;
        r17 = r11;
        r6 = r30;
        r30 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11470n(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.C1764e3 r33) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = f3243r
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x04b4
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4771d(r0, r12, r3, r9)
            int r3 = r9.f3321a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.m4812i(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.m4811U(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r30 = r0
            r2 = r3
            r8 = r4
            r22 = r5
            r26 = r10
            r7 = r11
            r17 = 0
            r18 = -1
            goto L_0x0411
        L_0x004f:
            int[] r1 = r15.f3244a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r8
            if (r11 > r4) goto L_0x030e
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0085
            if (r6 == r4) goto L_0x007e
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x007e:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x0086
        L_0x0085:
            r8 = r6
        L_0x0086:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02d7;
                case 1: goto L_0x02bb;
                case 2: goto L_0x0292;
                case 3: goto L_0x0292;
                case 4: goto L_0x0275;
                case 5: goto L_0x024e;
                case 6: goto L_0x0226;
                case 7: goto L_0x01f9;
                case 8: goto L_0x01cf;
                case 9: goto L_0x019c;
                case 10: goto L_0x017e;
                case 11: goto L_0x0275;
                case 12: goto L_0x0143;
                case 13: goto L_0x0226;
                case 14: goto L_0x024e;
                case 15: goto L_0x0125;
                case 16: goto L_0x00f4;
                case 17: goto L_0x009c;
                default: goto L_0x008b;
            }
        L_0x008b:
            r12 = r29
            r13 = r33
            r9 = r0
            r11 = r2
            r30 = r8
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ff
        L_0x009c:
            r5 = 3
            if (r7 != r5) goto L_0x00e2
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.measurement.n6 r1 = r15.m4819q(r2)
            r9 = r0
            r0 = r1
            r18 = -1
            r1 = r29
            r11 = r2
            r2 = r3
            r3 = r31
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4773f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            r4 = r33
            if (r1 != 0) goto L_0x00c6
            java.lang.Object r1 = r4.f3323c
            goto L_0x00d0
        L_0x00c6:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.f3323c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1925o4.m5643e(r1, r2)
        L_0x00d0:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r22
            r12 = r29
            r13 = r31
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r32
            r9 = r4
            goto L_0x0019
        L_0x00e2:
            r9 = r0
            r11 = r2
            r7 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r30 = r8
            r8 = r7
            goto L_0x02ff
        L_0x00f4:
            r4 = r33
            r9 = r0
            r11 = r2
            r5 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x011d
            r1 = r12
            r12 = r29
            int r7 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r3, r4)
            r20 = r1
            long r0 = r4.f3322b
            long r23 = com.google.android.gms.internal.measurement.C1952q3.m5833a(r0)
            r0 = r10
            r2 = r20
            r1 = r28
            r13 = r4
            r30 = r8
            r8 = r5
            r4 = r23
            goto L_0x02b2
        L_0x011d:
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r5
            goto L_0x02ff
        L_0x0125:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r3, r13)
            int r1 = r13.f3321a
            int r1 = com.google.android.gms.internal.measurement.C1952q3.m5835c(r1)
            goto L_0x028d
        L_0x0143:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r3, r13)
            int r1 = r13.f3321a
            com.google.android.gms.internal.measurement.s4 r2 = r15.m4803M(r11)
            if (r2 == 0) goto L_0x028d
            boolean r2 = r2.mo11560a(r1)
            if (r2 == 0) goto L_0x0169
            goto L_0x028d
        L_0x0169:
            com.google.android.gms.internal.measurement.h7 r2 = m4809S(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo11715c(r8, r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r30
            goto L_0x02fb
        L_0x017e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4784q(r12, r3, r13)
            java.lang.Object r1 = r13.f3323c
            r10.putObject(r14, r4, r1)
            goto L_0x02f3
        L_0x019c:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x01cb
            com.google.android.gms.internal.measurement.n6 r0 = r15.m4819q(r11)
            r2 = r31
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4774g(r0, r12, r3, r2, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01c0
            java.lang.Object r1 = r13.f3323c
            goto L_0x01f5
        L_0x01c0:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.f3323c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1925o4.m5643e(r1, r3)
            goto L_0x01f5
        L_0x01cb:
            r2 = r31
            goto L_0x02ff
        L_0x01cf:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01ef
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4781n(r12, r3, r13)
            goto L_0x01f3
        L_0x01ef:
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4783p(r12, r3, r13)
        L_0x01f3:
            java.lang.Object r1 = r13.f3323c
        L_0x01f5:
            r10.putObject(r14, r4, r1)
            goto L_0x0243
        L_0x01f9:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r3, r13)
            r3 = r0
            long r0 = r13.f3322b
            r20 = 0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x021c
            r0 = 1
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            com.google.android.gms.internal.measurement.C1859k7.m5337k(r14, r4, r0)
            r5 = r6 | r22
            r6 = r30
            r0 = r3
            goto L_0x0247
        L_0x0226:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r1) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4775h(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0243:
            r5 = r6 | r22
            r6 = r30
        L_0x0247:
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            goto L_0x04b0
        L_0x024e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            long r20 = com.google.android.gms.internal.measurement.C1718b3.m4779l(r12, r3)
            r0 = r10
            r1 = r28
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02f3
        L_0x0275:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r12, r3, r13)
            int r1 = r13.f3321a
        L_0x028d:
            r10.putInt(r14, r4, r1)
            goto L_0x02f3
        L_0x0292:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x02ff
            int r7 = com.google.android.gms.internal.measurement.C1718b3.m4778k(r12, r3, r13)
            long r2 = r13.f3322b
            r0 = r10
            r1 = r28
            r20 = r2
            r2 = r4
            r4 = r20
        L_0x02b2:
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            goto L_0x02f7
        L_0x02bb:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r1) goto L_0x02ff
            float r0 = com.google.android.gms.internal.measurement.C1718b3.m4782o(r12, r3)
            com.google.android.gms.internal.measurement.C1859k7.m5333g(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x02f3
        L_0x02d7:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x02ff
            double r0 = com.google.android.gms.internal.measurement.C1718b3.m4780m(r12, r3)
            com.google.android.gms.internal.measurement.C1859k7.m5332f(r14, r4, r0)
            int r0 = r3 + 8
        L_0x02f3:
            r5 = r6 | r22
            r6 = r30
        L_0x02f7:
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
        L_0x02fb:
            r13 = r31
            goto L_0x04b0
        L_0x02ff:
            r7 = r32
            r2 = r3
            r22 = r6
            r26 = r10
            r17 = r11
            r6 = r30
            r30 = r9
            goto L_0x0411
        L_0x030e:
            r4 = r2
            r1 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x0375
            r0 = 2
            if (r7 != r0) goto L_0x0366
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.measurement.t4 r0 = (com.google.android.gms.internal.measurement.C1999t4) r0
            boolean r7 = r0.mo12091C()
            if (r7 != 0) goto L_0x0340
            int r7 = r0.size()
            if (r7 != 0) goto L_0x0337
            r7 = 10
            goto L_0x0339
        L_0x0337:
            int r7 = r7 << 1
        L_0x0339:
            com.google.android.gms.internal.measurement.t4 r0 = r0.mo11562a(r7)
            r10.putObject(r14, r1, r0)
        L_0x0340:
            r7 = r0
            com.google.android.gms.internal.measurement.n6 r0 = r15.m4819q(r4)
            r1 = r8
            r2 = r29
            r17 = r4
            r4 = r31
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4772e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r32
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r17
            r5 = r22
            r6 = r23
            r13 = r31
            goto L_0x0019
        L_0x0366:
            r17 = r4
            r22 = r5
            r23 = r6
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            goto L_0x03ea
        L_0x0375:
            r17 = r4
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03c2
            r6 = r20
            long r5 = (long) r6
            r0 = r27
            r24 = r1
            r1 = r28
            r2 = r29
            r4 = r3
            r15 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r9
            r19 = r8
            r8 = r17
            r30 = r9
            r26 = r10
            r9 = r20
            r12 = r24
            r14 = r33
            int r0 = r0.m4815l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x03a8
            goto L_0x040d
        L_0x03a8:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x0019
        L_0x03c2:
            r24 = r1
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03f2
            r0 = 2
            if (r7 != r0) goto L_0x03ea
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r24
            r8 = r33
            int r0 = r0.m4816m(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x03a8
            goto L_0x040d
        L_0x03ea:
            r7 = r32
            r2 = r15
        L_0x03ed:
            r8 = r19
            r6 = r23
            goto L_0x0411
        L_0x03f2:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r8 = r6
            r6 = r30
            r9 = r11
            r10 = r24
            r12 = r17
            r13 = r33
            int r0 = r0.m4814k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0498
        L_0x040d:
            r7 = r32
            r2 = r0
            goto L_0x03ed
        L_0x0411:
            if (r8 != r7) goto L_0x0420
            if (r7 != 0) goto L_0x0416
            goto L_0x0420
        L_0x0416:
            r9 = r27
            r12 = r28
            r0 = r2
            r3 = r8
            r5 = r22
            goto L_0x04bd
        L_0x0420:
            r9 = r27
            boolean r0 = r9.f3249f
            if (r0 == 0) goto L_0x0471
            r10 = r33
            com.google.android.gms.internal.measurement.y3 r0 = r10.f3324d
            com.google.android.gms.internal.measurement.y3 r1 = com.google.android.gms.internal.measurement.C2076y3.m6600a()
            if (r0 == r1) goto L_0x046c
            com.google.android.gms.internal.measurement.x5 r0 = r9.f3248e
            com.google.android.gms.internal.measurement.y3 r1 = r10.f3324d
            r11 = r30
            com.google.android.gms.internal.measurement.m4$f r0 = r1.mo12323b(r0, r11)
            if (r0 != 0) goto L_0x045c
            com.google.android.gms.internal.measurement.h7 r4 = m4809S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4770c(r0, r1, r2, r3, r4, r5)
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r17
            r5 = r22
            r10 = r26
            goto L_0x0495
        L_0x045c:
            r12 = r28
            r0 = r12
            com.google.android.gms.internal.measurement.m4$d r0 = (com.google.android.gms.internal.measurement.C1889m4.C1893d) r0
            r0.mo11862y()
            com.google.android.gms.internal.measurement.f4<com.google.android.gms.internal.measurement.m4$c> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x046c:
            r12 = r28
            r11 = r30
            goto L_0x0477
        L_0x0471:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x0477:
            com.google.android.gms.internal.measurement.h7 r4 = m4809S(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C1718b3.m4770c(r0, r1, r2, r3, r4, r5)
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r10 = r26
            r12 = r29
        L_0x0495:
            r11 = r7
            goto L_0x0019
        L_0x0498:
            r11 = r30
            r8 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r9 = r33
            r3 = r8
            r1 = r11
            r2 = r17
            r5 = r22
            r6 = r23
            r10 = r26
        L_0x04b0:
            r11 = r32
            goto L_0x0019
        L_0x04b4:
            r22 = r5
            r23 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x04bd:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x04c8
            long r1 = (long) r6
            r4 = r26
            r4.putInt(r12, r1, r5)
        L_0x04c8:
            r1 = 0
            int r2 = r9.f3253j
        L_0x04cb:
            int r4 = r9.f3254k
            if (r2 >= r4) goto L_0x04de
            int[] r4 = r9.f3252i
            r4 = r4[r2]
            com.google.android.gms.internal.measurement.e7<?, ?> r5 = r9.f3257n
            java.lang.Object r1 = r9.m4821s(r12, r4, r1, r5)
            com.google.android.gms.internal.measurement.h7 r1 = (com.google.android.gms.internal.measurement.C1814h7) r1
            int r2 = r2 + 1
            goto L_0x04cb
        L_0x04de:
            if (r1 == 0) goto L_0x04e5
            com.google.android.gms.internal.measurement.e7<?, ?> r2 = r9.f3257n
            r2.mo11610h(r12, r1)
        L_0x04e5:
            r1 = r31
            if (r7 != 0) goto L_0x04f1
            if (r0 != r1) goto L_0x04ec
            goto L_0x04f5
        L_0x04ec:
            com.google.android.gms.internal.measurement.w4 r0 = com.google.android.gms.internal.measurement.C2046w4.m6269e()
            throw r0
        L_0x04f1:
            if (r0 > r1) goto L_0x04f6
            if (r3 != r7) goto L_0x04f6
        L_0x04f5:
            return r0
        L_0x04f6:
            com.google.android.gms.internal.measurement.w4 r0 = com.google.android.gms.internal.measurement.C2046w4.m6269e()
            goto L_0x04fc
        L_0x04fb:
            throw r0
        L_0x04fc:
            goto L_0x04fb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1721b6.mo11470n(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.e3):int");
    }
}
