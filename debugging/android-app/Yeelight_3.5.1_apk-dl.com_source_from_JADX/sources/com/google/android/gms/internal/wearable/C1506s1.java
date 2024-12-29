package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.s1 */
final class C1506s1<T> implements C1417a2<T> {

    /* renamed from: o */
    private static final int[] f1839o = new int[0];

    /* renamed from: p */
    private static final Unsafe f1840p = C1534y2.m3998v();

    /* renamed from: a */
    private final int[] f1841a;

    /* renamed from: b */
    private final Object[] f1842b;

    /* renamed from: c */
    private final int f1843c;

    /* renamed from: d */
    private final int f1844d;

    /* renamed from: e */
    private final C1486o1 f1845e;

    /* renamed from: f */
    private final boolean f1846f;

    /* renamed from: g */
    private final boolean f1847g;

    /* renamed from: h */
    private final int[] f1848h;

    /* renamed from: i */
    private final int f1849i;

    /* renamed from: j */
    private final int f1850j;

    /* renamed from: k */
    private final C1431d1 f1851k;

    /* renamed from: l */
    private final C1482n2<?, ?> f1852l;

    /* renamed from: m */
    private final C1430d0<?> f1853m;

    /* renamed from: n */
    private final C1461j1 f1854n;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.wearable.o1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.wearable.j1} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.wearable.d0<?>, com.google.android.gms.internal.wearable.d0] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.google.android.gms.internal.wearable.d1] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.wearable.n2<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1506s1(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.wearable.C1486o1 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.wearable.C1516u1 r17, com.google.android.gms.internal.wearable.C1431d1 r18, com.google.android.gms.internal.wearable.C1482n2<?, ?> r19, com.google.android.gms.internal.wearable.C1430d0<?> r20, com.google.android.gms.internal.wearable.C1461j1 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f1841a = r3
            r3 = r7
            r0.f1842b = r3
            r3 = r8
            r0.f1843c = r3
            r3 = r9
            r0.f1844d = r3
            r3 = r11
            r0.f1847g = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.mo13596a(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.f1846f = r3
            r3 = r13
            r0.f1848h = r3
            r3 = r14
            r0.f1849i = r3
            r3 = r15
            r0.f1850j = r3
            r3 = r17
            r0.f1851k = r3
            r3 = r18
            r0.f1852l = r3
            r0.f1853m = r2
            r0.f1845e = r1
            r1 = r20
            r0.f1854n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.wearable.o1, boolean, boolean, int[], int, int, com.google.android.gms.internal.wearable.u1, com.google.android.gms.internal.wearable.d1, com.google.android.gms.internal.wearable.n2, com.google.android.gms.internal.wearable.d0, com.google.android.gms.internal.wearable.j1, byte[]):void");
    }

    /* renamed from: A */
    private final <K, V> void m3750A(C1531y yVar, int i, Object obj, int i2) {
        if (obj != null) {
            C1456i1 i1Var = (C1456i1) m3764P(i2);
            throw null;
        }
    }

    /* renamed from: B */
    private static final void m3751B(int i, Object obj, C1531y yVar) {
        if (obj instanceof String) {
            yVar.mo13886x(i, (String) obj);
        } else {
            yVar.mo13887y(i, (zzau) obj);
        }
    }

    /* renamed from: C */
    static C1487o2 m3752C(Object obj) {
        C1480n0 n0Var = (C1480n0) obj;
        C1487o2 o2Var = n0Var.zzc;
        if (o2Var != C1487o2.m3661a()) {
            return o2Var;
        }
        C1487o2 b = C1487o2.m3662b();
        n0Var.zzc = b;
        return b;
    }

    /* renamed from: E */
    static <T> C1506s1<T> m3753E(Class<T> cls, C1471l1 l1Var, C1516u1 u1Var, C1431d1 d1Var, C1482n2<?, ?> n2Var, C1430d0<?> d0Var, C1461j1 j1Var) {
        if (l1Var instanceof C1537z1) {
            return m3754F((C1537z1) l1Var, u1Var, d1Var, n2Var, d0Var, j1Var);
        }
        C1472l2 l2Var = (C1472l2) l1Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.wearable.C1506s1<T> m3754F(com.google.android.gms.internal.wearable.C1537z1 r34, com.google.android.gms.internal.wearable.C1516u1 r35, com.google.android.gms.internal.wearable.C1431d1 r36, com.google.android.gms.internal.wearable.C1482n2<?, ?> r37, com.google.android.gms.internal.wearable.C1430d0<?> r38, com.google.android.gms.internal.wearable.C1461j1 r39) {
        /*
            int r0 = r34.mo13704E()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo13906a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f1839o
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f1840p
            java.lang.Object[] r17 = r34.mo13907b()
            com.google.android.gms.internal.wearable.o1 r18 = r34.mo13703D()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m3755G(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m3755G(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m3755G(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m3755G(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.wearable.s1 r0 = new com.google.android.gms.internal.wearable.s1
            r4 = r0
            com.google.android.gms.internal.wearable.o1 r9 = r34.mo13703D()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3754F(com.google.android.gms.internal.wearable.z1, com.google.android.gms.internal.wearable.u1, com.google.android.gms.internal.wearable.d1, com.google.android.gms.internal.wearable.n2, com.google.android.gms.internal.wearable.d0, com.google.android.gms.internal.wearable.j1):com.google.android.gms.internal.wearable.s1");
    }

    /* renamed from: G */
    private static Field m3755G(Class<?> cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: H */
    private final void m3756H(T t, T t2, int i) {
        long i2 = (long) (m3768i(i) & 1048575);
        if (m3778s(t2, i)) {
            Object s = C1534y2.m3995s(t, i2);
            Object s2 = C1534y2.m3995s(t2, i2);
            if (s != null && s2 != null) {
                s2 = C1524w0.m3865i(s, s2);
            } else if (s2 == null) {
                return;
            }
            C1534y2.m3996t(t, i2, s2);
            m3779t(t, i);
        }
    }

    /* renamed from: I */
    private final void m3757I(T t, T t2, int i) {
        int i2 = m3768i(i);
        int i3 = this.f1841a[i];
        long j = (long) (i2 & 1048575);
        if (m3780u(t2, i3, i)) {
            Object s = m3780u(t, i3, i) ? C1534y2.m3995s(t, j) : null;
            Object s2 = C1534y2.m3995s(t2, j);
            if (s != null && s2 != null) {
                s2 = C1524w0.m3865i(s, s2);
            } else if (s2 == null) {
                return;
            }
            C1534y2.m3996t(t, j, s2);
            m3781v(t, i3, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026a, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3879e(r8, (com.google.android.gms.internal.wearable.C1486o1) r0.getObject(r15, r12), m3763O(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0281, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
        r7 = com.google.android.gms.internal.wearable.C1527x.m3874B((r9 >> 63) ^ (r9 + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
        r7 = (r7 >> 31) ^ (r7 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cf, code lost:
        r7 = r0.getObject(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d3, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
        r7 = ((com.google.android.gms.internal.wearable.zzau) r7).zzc();
        r8 = r8 + (com.google.android.gms.internal.wearable.C1527x.m3873A(r7) + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        r7 = com.google.android.gms.internal.wearable.C1427c2.m3463Y(r8, r0.getObject(r15, r12), m3763O(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0302, code lost:
        if ((r7 instanceof com.google.android.gms.internal.wearable.zzau) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0305, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
        r7 = com.google.android.gms.internal.wearable.C1527x.m3875C((java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0316, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032d, code lost:
        r7 = r0.getInt(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0331, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3);
        r7 = com.google.android.gms.internal.wearable.C1527x.m3883z(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x033b, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x033c, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0347, code lost:
        r9 = r0.getLong(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034b, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3) + com.google.android.gms.internal.wearable.C1527x.m3874B(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035c, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036a, code lost:
        r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0374, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if ((r7 instanceof com.google.android.gms.internal.wearable.zzau) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r7 = m3773n(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r9 = m3774o(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c3, code lost:
        r8 = com.google.android.gms.internal.wearable.C1527x.m3882y(r8) + com.google.android.gms.internal.wearable.C1527x.m3873A(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        r4 = r4 + r7;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3758J(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f1840p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.f1841a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0378
            int r7 = r14.m3768i(r3)
            int[] r8 = r14.f1841a
            r8 = r8[r3]
            int r9 = m3770k(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.f1841a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0366;
                case 1: goto L_0x0358;
                case 2: goto L_0x0343;
                case 3: goto L_0x033e;
                case 4: goto L_0x0329;
                case 5: goto L_0x0324;
                case 6: goto L_0x031f;
                case 7: goto L_0x0312;
                case 8: goto L_0x02f8;
                case 9: goto L_0x02e6;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02b7;
                case 12: goto L_0x02b1;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a5;
                case 15: goto L_0x0291;
                case 16: goto L_0x0279;
                case 17: goto L_0x0266;
                case 18: goto L_0x0259;
                case 19: goto L_0x024e;
                case 20: goto L_0x0243;
                case 21: goto L_0x0238;
                case 22: goto L_0x022d;
                case 23: goto L_0x0259;
                case 24: goto L_0x024e;
                case 25: goto L_0x0222;
                case 26: goto L_0x0217;
                case 27: goto L_0x0208;
                case 28: goto L_0x01fd;
                case 29: goto L_0x01f2;
                case 30: goto L_0x01e6;
                case 31: goto L_0x024e;
                case 32: goto L_0x0259;
                case 33: goto L_0x01da;
                case 34: goto L_0x01ce;
                case 35: goto L_0x01b7;
                case 36: goto L_0x01aa;
                case 37: goto L_0x019d;
                case 38: goto L_0x0190;
                case 39: goto L_0x0183;
                case 40: goto L_0x0176;
                case 41: goto L_0x0169;
                case 42: goto L_0x015c;
                case 43: goto L_0x014e;
                case 44: goto L_0x0140;
                case 45: goto L_0x0132;
                case 46: goto L_0x0124;
                case 47: goto L_0x0116;
                case 48: goto L_0x0108;
                case 49: goto L_0x00f8;
                case 50: goto L_0x00eb;
                case 51: goto L_0x00e3;
                case 52: goto L_0x00db;
                case 53: goto L_0x00cf;
                case 54: goto L_0x00c8;
                case 55: goto L_0x00bc;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00ac;
                case 58: goto L_0x00a4;
                case 59: goto L_0x0094;
                case 60: goto L_0x008c;
                case 61: goto L_0x0084;
                case 62: goto L_0x0078;
                case 63: goto L_0x0071;
                case 64: goto L_0x0069;
                case 65: goto L_0x0061;
                case 66: goto L_0x0055;
                case 67: goto L_0x0049;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0374
        L_0x0041:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x026a
        L_0x0049:
            boolean r9 = r14.m3780u(r15, r8, r3)
            if (r9 == 0) goto L_0x0374
            long r9 = m3774o(r15, r12)
            goto L_0x0281
        L_0x0055:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = m3773n(r15, r12)
            goto L_0x0299
        L_0x0061:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x0069:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x0071:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00c2
        L_0x0078:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = m3773n(r15, r12)
            goto L_0x02bf
        L_0x0084:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02cf
        L_0x008c:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02ea
        L_0x0094:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.wearable.zzau
            if (r9 == 0) goto L_0x0305
            goto L_0x0304
        L_0x00a4:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x0316
        L_0x00ac:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00b4:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00bc:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00c2:
            int r7 = m3773n(r15, r12)
            goto L_0x0331
        L_0x00c8:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00d5
        L_0x00cf:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00d5:
            long r9 = m3774o(r15, r12)
            goto L_0x034b
        L_0x00db:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00e3:
            boolean r7 = r14.m3780u(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00eb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m3764P(r3)
            com.google.android.gms.internal.wearable.C1461j1.m3576a(r8, r7, r9)
            goto L_0x0374
        L_0x00f8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.wearable.a2 r9 = r14.m3763O(r3)
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3468b0(r8, r7, r9)
            goto L_0x0263
        L_0x0108:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3446H(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0116:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3454P(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0124:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0132:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0140:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3448J(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x014e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3452N(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x015c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3460V(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0169:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0176:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0183:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3450L(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0190:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3444F(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x019d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3442D(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01aa:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r7)
            if (r7 <= 0) goto L_0x0374
        L_0x01c3:
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3882y(r8)
            int r9 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r8 = r8 + r9
            goto L_0x033b
        L_0x01ce:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3447I(r8, r7, r2)
            goto L_0x0263
        L_0x01da:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3455Q(r8, r7, r2)
            goto L_0x0263
        L_0x01e6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3449K(r8, r7, r2)
            goto L_0x0263
        L_0x01f2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3453O(r8, r7, r2)
            goto L_0x0263
        L_0x01fd:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3466a0(r8, r7)
            goto L_0x0263
        L_0x0208:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.wearable.a2 r9 = r14.m3763O(r3)
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3464Z(r8, r7, r9)
            goto L_0x0263
        L_0x0217:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3462X(r8, r7)
            goto L_0x0263
        L_0x0222:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3461W(r8, r7, r2)
            goto L_0x0263
        L_0x022d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3451M(r8, r7, r2)
            goto L_0x0263
        L_0x0238:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3445G(r8, r7, r2)
            goto L_0x0263
        L_0x0243:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3443E(r8, r7, r2)
            goto L_0x0263
        L_0x024e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3457S(r8, r7, r2)
            goto L_0x0263
        L_0x0259:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3459U(r8, r7, r2)
        L_0x0263:
            int r4 = r4 + r7
            goto L_0x0374
        L_0x0266:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x026a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.wearable.o1 r7 = (com.google.android.gms.internal.wearable.C1486o1) r7
            com.google.android.gms.internal.wearable.a2 r9 = r14.m3763O(r3)
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3879e(r8, r7, r9)
            goto L_0x0263
        L_0x0279:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0374
            long r9 = r0.getLong(r15, r12)
        L_0x0281:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3874B(r9)
            goto L_0x033b
        L_0x0291:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            int r7 = r0.getInt(r15, r12)
        L_0x0299:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            goto L_0x02c5
        L_0x02a5:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x02ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x02b1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x032d
        L_0x02b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            int r7 = r0.getInt(r15, r12)
        L_0x02bf:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
        L_0x02c5:
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            goto L_0x033b
        L_0x02cb:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02cf:
            java.lang.Object r7 = r0.getObject(r15, r12)
        L_0x02d3:
            com.google.android.gms.internal.wearable.zzau r7 = (com.google.android.gms.internal.wearable.zzau) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x033c
        L_0x02e6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02ea:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.wearable.a2 r9 = r14.m3763O(r3)
            int r7 = com.google.android.gms.internal.wearable.C1427c2.m3463Y(r8, r7, r9)
            goto L_0x0263
        L_0x02f8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.wearable.zzau
            if (r9 == 0) goto L_0x0305
        L_0x0304:
            goto L_0x02d3
        L_0x0305:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3875C(r7)
            goto L_0x033b
        L_0x0312:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x0316:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r7 = r7 + r11
            goto L_0x0263
        L_0x031f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x0324:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x0329:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x032d:
            int r7 = r0.getInt(r15, r12)
        L_0x0331:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3873A(r8)
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3883z(r7)
        L_0x033b:
            int r8 = r8 + r7
        L_0x033c:
            int r4 = r4 + r8
            goto L_0x0374
        L_0x033e:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x0347
        L_0x0343:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x0347:
            long r9 = r0.getLong(r15, r12)
        L_0x034b:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r8 = com.google.android.gms.internal.wearable.C1527x.m3874B(r9)
            int r7 = r7 + r8
            goto L_0x0263
        L_0x0358:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x035c:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r7 = r7 + 4
            goto L_0x0263
        L_0x0366:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x036a:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.wearable.C1527x.m3873A(r7)
            int r7 = r7 + 8
            goto L_0x0263
        L_0x0374:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0378:
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r14.f1852l
            java.lang.Object r1 = r0.mo13724d(r15)
            int r0 = r0.mo13728h(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f1846f
            if (r0 != 0) goto L_0x0388
            return r4
        L_0x0388:
            com.google.android.gms.internal.wearable.d0<?> r0 = r14.f1853m
            r0.mo13597b(r15)
            r15 = 0
            goto L_0x0390
        L_0x038f:
            throw r15
        L_0x0390:
            goto L_0x038f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3758J(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r4 = com.google.android.gms.internal.wearable.C1527x.m3879e(r6, (com.google.android.gms.internal.wearable.C1486o1) com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7), m3763O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
        r4 = com.google.android.gms.internal.wearable.C1527x.m3874B((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0297, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
        r4 = ((com.google.android.gms.internal.wearable.zzau) r4).zzc();
        r5 = r5 + (com.google.android.gms.internal.wearable.C1527x.m3873A(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r4 = com.google.android.gms.internal.wearable.C1427c2.m3463Y(r6, com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7), m3763O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.wearable.zzau) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0311, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
        r4 = com.google.android.gms.internal.wearable.C1527x.m3875C((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3);
        r4 = com.google.android.gms.internal.wearable.C1527x.m3883z(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0360, code lost:
        r4 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r3 = r3 + (com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3) + com.google.android.gms.internal.wearable.C1527x.m3874B(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.wearable.zzau) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = m3773n(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = m3774o(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r5 = com.google.android.gms.internal.wearable.C1527x.m3882y(r6) + com.google.android.gms.internal.wearable.C1527x.m3873A(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r3 = r3 + r4;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3759K(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f1840p
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f1841a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0395
            int r4 = r11.m3768i(r2)
            int r5 = m3770k(r4)
            int[] r6 = r11.f1841a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.wearable.zzbm r4 = com.google.android.gms.internal.wearable.zzbm.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.wearable.zzbm r4 = com.google.android.gms.internal.wearable.zzbm.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f1841a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0381;
                case 1: goto L_0x0371;
                case 2: goto L_0x035a;
                case 3: goto L_0x0353;
                case 4: goto L_0x033c;
                case 5: goto L_0x0335;
                case 6: goto L_0x032e;
                case 7: goto L_0x031e;
                case 8: goto L_0x0302;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02d1;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02b3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028d;
                case 16: goto L_0x0272;
                case 17: goto L_0x025d;
                case 18: goto L_0x0250;
                case 19: goto L_0x0245;
                case 20: goto L_0x023a;
                case 21: goto L_0x022f;
                case 22: goto L_0x0224;
                case 23: goto L_0x0250;
                case 24: goto L_0x0245;
                case 25: goto L_0x0219;
                case 26: goto L_0x020e;
                case 27: goto L_0x01ff;
                case 28: goto L_0x01f4;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01dd;
                case 31: goto L_0x0245;
                case 32: goto L_0x0250;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01c5;
                case 35: goto L_0x01ae;
                case 36: goto L_0x01a1;
                case 37: goto L_0x0194;
                case 38: goto L_0x0187;
                case 39: goto L_0x017a;
                case 40: goto L_0x016d;
                case 41: goto L_0x0160;
                case 42: goto L_0x0153;
                case 43: goto L_0x0145;
                case 44: goto L_0x0137;
                case 45: goto L_0x0129;
                case 46: goto L_0x011b;
                case 47: goto L_0x010d;
                case 48: goto L_0x00ff;
                case 49: goto L_0x00ef;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00da;
                case 52: goto L_0x00d2;
                case 53: goto L_0x00c6;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ab;
                case 57: goto L_0x00a3;
                case 58: goto L_0x009b;
                case 59: goto L_0x008b;
                case 60: goto L_0x0083;
                case 61: goto L_0x007b;
                case 62: goto L_0x006f;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0391
        L_0x0038:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0263
        L_0x0040:
            boolean r5 = r11.m3780u(r12, r6, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = m3774o(r12, r7)
            goto L_0x027c
        L_0x004c:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m3773n(r12, r7)
            goto L_0x0297
        L_0x0058:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x0060:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0068:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = m3773n(r12, r7)
            goto L_0x02c5
        L_0x007b:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02d7
        L_0x0083:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02f4
        L_0x008b:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.wearable.zzau
            if (r5 == 0) goto L_0x0311
            goto L_0x0310
        L_0x009b:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0324
        L_0x00a3:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00ab:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00b3:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00b9:
            int r4 = m3773n(r12, r7)
            goto L_0x0346
        L_0x00bf:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00cc:
            long r4 = m3774o(r12, r7)
            goto L_0x0364
        L_0x00d2:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00da:
            boolean r4 = r11.m3780u(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00e2:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.lang.Object r5 = r11.m3764P(r2)
            com.google.android.gms.internal.wearable.C1461j1.m3576a(r6, r4, r5)
            goto L_0x0391
        L_0x00ef:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.wearable.a2 r5 = r11.m3763O(r2)
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3468b0(r6, r4, r5)
            goto L_0x025a
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3446H(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3454P(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3448J(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3452N(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3460V(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0160:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x016d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x017a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3450L(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0187:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3444F(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0194:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3442D(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3456R(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01ae:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3458T(r4)
            if (r4 <= 0) goto L_0x0391
        L_0x01ba:
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3882y(r6)
            int r6 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            int r5 = r5 + r6
            goto L_0x0350
        L_0x01c5:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3447I(r6, r4, r1)
            goto L_0x025a
        L_0x01d1:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3455Q(r6, r4, r1)
            goto L_0x025a
        L_0x01dd:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3449K(r6, r4, r1)
            goto L_0x025a
        L_0x01e9:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3453O(r6, r4, r1)
            goto L_0x025a
        L_0x01f4:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3466a0(r6, r4)
            goto L_0x025a
        L_0x01ff:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.wearable.a2 r5 = r11.m3763O(r2)
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3464Z(r6, r4, r5)
            goto L_0x025a
        L_0x020e:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3462X(r6, r4)
            goto L_0x025a
        L_0x0219:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3461W(r6, r4, r1)
            goto L_0x025a
        L_0x0224:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3451M(r6, r4, r1)
            goto L_0x025a
        L_0x022f:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3445G(r6, r4, r1)
            goto L_0x025a
        L_0x023a:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3443E(r6, r4, r1)
            goto L_0x025a
        L_0x0245:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3457S(r6, r4, r1)
            goto L_0x025a
        L_0x0250:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3459U(r6, r4, r1)
        L_0x025a:
            int r3 = r3 + r4
            goto L_0x0391
        L_0x025d:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0263:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            com.google.android.gms.internal.wearable.o1 r4 = (com.google.android.gms.internal.wearable.C1486o1) r4
            com.google.android.gms.internal.wearable.a2 r5 = r11.m3763O(r2)
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3879e(r6, r4, r5)
            goto L_0x025a
        L_0x0272:
            boolean r5 = r11.m3778s(r12, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r12, r7)
        L_0x027c:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3874B(r6)
            goto L_0x0350
        L_0x028d:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r12, r7)
        L_0x0297:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02cb
        L_0x02a3:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x02ab:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x02b3:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0342
        L_0x02bb:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r12, r7)
        L_0x02c5:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
        L_0x02cb:
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            goto L_0x0350
        L_0x02d1:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02d7:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
        L_0x02db:
            com.google.android.gms.internal.wearable.zzau r4 = (com.google.android.gms.internal.wearable.zzau) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x0351
        L_0x02ee:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02f4:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            com.google.android.gms.internal.wearable.a2 r5 = r11.m3763O(r2)
            int r4 = com.google.android.gms.internal.wearable.C1427c2.m3463Y(r6, r4, r5)
            goto L_0x025a
        L_0x0302:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.wearable.zzau
            if (r5 == 0) goto L_0x0311
        L_0x0310:
            goto L_0x02db
        L_0x0311:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3875C(r4)
            goto L_0x0350
        L_0x031e:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0324:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            int r4 = r4 + 1
            goto L_0x025a
        L_0x032e:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0335:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x033c:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0342:
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r12, r7)
        L_0x0346:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.C1527x.m3873A(r5)
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3883z(r4)
        L_0x0350:
            int r5 = r5 + r4
        L_0x0351:
            int r3 = r3 + r5
            goto L_0x0391
        L_0x0353:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0360
        L_0x035a:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0360:
            long r4 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r12, r7)
        L_0x0364:
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.wearable.C1527x.m3873A(r6)
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3874B(r4)
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0391
        L_0x0371:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0377:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            int r4 = r4 + 4
            goto L_0x025a
        L_0x0381:
            boolean r4 = r11.m3778s(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0387:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.C1527x.m3873A(r4)
            int r4 = r4 + 8
            goto L_0x025a
        L_0x0391:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0395:
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r11.f1852l
            java.lang.Object r12 = r0.mo13724d(r12)
            int r12 = r0.mo13728h(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3759K(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0254, code lost:
        if (r7.f1793b != 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0258, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0259, code lost:
        r12.mo13673e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025c, code lost:
        if (r4 >= r5) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025e, code lost:
        r6 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        if (r2 == r7.f1792a) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r4 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026f, code lost:
        if (r7.f1793b == 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (r4 == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r12.add(com.google.android.gms.internal.wearable.zzau.zzb);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(com.google.android.gms.internal.wearable.zzau.zzk(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.f1792a) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7);
        r4 = r7.f1792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r4 != 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        throw com.google.android.gms.internal.wearable.zzcc.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw com.google.android.gms.internal.wearable.zzcc.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3760L(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.wearable.C1454i r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f1840p
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.wearable.u0 r12 = (com.google.android.gms.internal.wearable.C1515u0) r12
            boolean r13 = r12.zza()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.wearable.u0 r12 = r12.mo13609h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0388;
                case 19: goto L_0x0342;
                case 20: goto L_0x030a;
                case 21: goto L_0x030a;
                case 22: goto L_0x02ef;
                case 23: goto L_0x02b1;
                case 24: goto L_0x0273;
                case 25: goto L_0x021f;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02ef;
                case 30: goto L_0x00dc;
                case 31: goto L_0x0273;
                case 32: goto L_0x02b1;
                case 33: goto L_0x009c;
                case 34: goto L_0x005c;
                case 35: goto L_0x0388;
                case 36: goto L_0x0342;
                case 37: goto L_0x030a;
                case 38: goto L_0x030a;
                case 39: goto L_0x02ef;
                case 40: goto L_0x02b1;
                case 41: goto L_0x0273;
                case 42: goto L_0x021f;
                case 43: goto L_0x02ef;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0273;
                case 46: goto L_0x02b1;
                case 47: goto L_0x009c;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03eb
            com.google.android.gms.internal.wearable.a2 r1 = r15.m3763O(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3568j(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.f1794c
            r12.add(r8)
            goto L_0x03cd
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r1, r7)
            long r4 = r7.f1793b
            long r4 = com.google.android.gms.internal.wearable.C1509t.m3802b(r4)
            r12.mo13612j(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03ec
        L_0x007b:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
        L_0x0084:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r7)
            long r8 = r7.f1793b
            long r8 = com.google.android.gms.internal.wearable.C1509t.m3802b(r8)
            r12.mo13612j(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            com.google.android.gms.internal.wearable.o0 r12 = (com.google.android.gms.internal.wearable.C1485o0) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r4 = r7.f1792a
            int r4 = com.google.android.gms.internal.wearable.C1509t.m3801a(r4)
            r12.mo13736g(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03ec
        L_0x00bb:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.wearable.o0 r12 = (com.google.android.gms.internal.wearable.C1485o0) r12
        L_0x00c4:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r4 = r7.f1792a
            int r4 = com.google.android.gms.internal.wearable.C1509t.m3801a(r4)
            r12.mo13736g(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3570l(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03eb
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3569k(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            com.google.android.gms.internal.wearable.n0 r1 = (com.google.android.gms.internal.wearable.C1480n0) r1
            com.google.android.gms.internal.wearable.o2 r3 = r1.zzc
            com.google.android.gms.internal.wearable.o2 r4 = com.google.android.gms.internal.wearable.C1487o2.m3661a()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            com.google.android.gms.internal.wearable.r0 r4 = r15.m3765Q(r8)
            com.google.android.gms.internal.wearable.n2<?, ?> r5 = r0.f1852l
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1427c2.m3473g(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0240
        L_0x010f:
            com.google.android.gms.internal.wearable.o2 r3 = (com.google.android.gms.internal.wearable.C1487o2) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03eb
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r4 = r7.f1792a
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            com.google.android.gms.internal.wearable.zzau r4 = com.google.android.gms.internal.wearable.zzau.zzb
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            com.google.android.gms.internal.wearable.zzau r6 = com.google.android.gms.internal.wearable.zzau.zzk(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r4 = r7.f1792a
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x0151:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x015c:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            com.google.android.gms.internal.wearable.a2 r1 = r15.m3763O(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3571m(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            if (r6 != 0) goto L_0x01c9
            int r6 = r7.f1792a
            if (r6 < 0) goto L_0x01c4
            if (r6 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r1)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.wearable.C1524w0.f1867a
            r8.<init>(r3, r4, r6, r9)
        L_0x019e:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x01a2:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r8 = r7.f1792a
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r6, r7)
            int r6 = r7.f1792a
            if (r6 < 0) goto L_0x01bf
            if (r6 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.wearable.C1524w0.f1867a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x019e
        L_0x01bf:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x01c4:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x01c9:
            int r6 = r7.f1792a
            if (r6 < 0) goto L_0x021a
            if (r6 != 0) goto L_0x01d3
        L_0x01cf:
            r12.add(r1)
            goto L_0x01e6
        L_0x01d3:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.wearable.C1428c3.m3494b(r3, r4, r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.wearable.C1524w0.f1867a
            r9.<init>(r3, r4, r6, r10)
        L_0x01e2:
            r12.add(r9)
            r4 = r8
        L_0x01e6:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r8 = r7.f1792a
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r6, r7)
            int r6 = r7.f1792a
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x01fb
            goto L_0x01cf
        L_0x01fb:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.wearable.C1428c3.m3494b(r3, r4, r8)
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.wearable.C1524w0.f1867a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01e2
        L_0x020b:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzg()
            throw r1
        L_0x0210:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzg()
            throw r1
        L_0x021a:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzc()
            throw r1
        L_0x021f:
            r1 = 0
            if (r6 != r14) goto L_0x0248
            com.google.android.gms.internal.wearable.k r12 = (com.google.android.gms.internal.wearable.C1464k) r12
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r4 = r7.f1792a
            int r4 = r4 + r2
        L_0x022b:
            if (r2 >= r4) goto L_0x023e
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r2, r7)
            long r5 = r7.f1793b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0239
            r5 = 1
            goto L_0x023a
        L_0x0239:
            r5 = 0
        L_0x023a:
            r12.mo13673e(r5)
            goto L_0x022b
        L_0x023e:
            if (r2 != r4) goto L_0x0243
        L_0x0240:
            r1 = r2
            goto L_0x03ec
        L_0x0243:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x0248:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.wearable.k r12 = (com.google.android.gms.internal.wearable.C1464k) r12
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r7)
            long r8 = r7.f1793b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
        L_0x0256:
            r6 = 1
            goto L_0x0259
        L_0x0258:
            r6 = 0
        L_0x0259:
            r12.mo13673e(r6)
            if (r4 >= r5) goto L_0x0272
            int r6 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r8 = r7.f1792a
            if (r2 == r8) goto L_0x0267
            goto L_0x0272
        L_0x0267:
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r6, r7)
            long r8 = r7.f1793b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
            goto L_0x0256
        L_0x0272:
            return r4
        L_0x0273:
            if (r6 != r14) goto L_0x0293
            com.google.android.gms.internal.wearable.o0 r12 = (com.google.android.gms.internal.wearable.C1485o0) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x027e:
            if (r1 >= r2) goto L_0x028a
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3562d(r3, r1)
            r12.mo13736g(r4)
            int r1 = r1 + 4
            goto L_0x027e
        L_0x028a:
            if (r1 != r2) goto L_0x028e
            goto L_0x03ec
        L_0x028e:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x0293:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.wearable.o0 r12 = (com.google.android.gms.internal.wearable.C1485o0) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3562d(r17, r18)
        L_0x029b:
            r12.mo13736g(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b0
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3562d(r3, r4)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02d1
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x02bc:
            if (r1 >= r2) goto L_0x02c8
            long r4 = com.google.android.gms.internal.wearable.C1459j.m3563e(r3, r1)
            r12.mo13612j(r4)
            int r1 = r1 + 8
            goto L_0x02bc
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x03ec
        L_0x02cc:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x02d1:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
            long r8 = com.google.android.gms.internal.wearable.C1459j.m3563e(r17, r18)
        L_0x02d9:
            r12.mo13612j(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02ee
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            long r8 = com.google.android.gms.internal.wearable.C1459j.m3563e(r3, r4)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x02f7
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3570l(r3, r4, r12, r7)
            goto L_0x03ec
        L_0x02f7:
            if (r6 == 0) goto L_0x02fb
            goto L_0x03eb
        L_0x02fb:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3569k(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030a:
            if (r6 != r14) goto L_0x032a
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x0315:
            if (r1 >= r2) goto L_0x0321
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r1, r7)
            long r4 = r7.f1793b
            r12.mo13612j(r4)
            goto L_0x0315
        L_0x0321:
            if (r1 != r2) goto L_0x0325
            goto L_0x03ec
        L_0x0325:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x032a:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.wearable.e1 r12 = (com.google.android.gms.internal.wearable.C1436e1) r12
        L_0x032e:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r7)
            long r8 = r7.f1793b
            r12.mo13612j(r8)
            if (r1 >= r5) goto L_0x0341
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x032e
        L_0x0341:
            return r1
        L_0x0342:
            if (r6 != r14) goto L_0x0366
            com.google.android.gms.internal.wearable.i0 r12 = (com.google.android.gms.internal.wearable.C1455i0) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3562d(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo13654g(r4)
            int r1 = r1 + 4
            goto L_0x034d
        L_0x035d:
            if (r1 != r2) goto L_0x0361
            goto L_0x03ec
        L_0x0361:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x0366:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.wearable.i0 r12 = (com.google.android.gms.internal.wearable.C1455i0) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3562d(r17, r18)
        L_0x036e:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo13654g(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0387
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3562d(r3, r4)
            goto L_0x036e
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ab
            com.google.android.gms.internal.wearable.z r12 = (com.google.android.gms.internal.wearable.C1535z) r12
            int r1 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r2 = r7.f1792a
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            long r4 = com.google.android.gms.internal.wearable.C1459j.m3563e(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo13900e(r4)
            int r1 = r1 + 8
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a6
            goto L_0x03ec
        L_0x03a6:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzb()
            throw r1
        L_0x03ab:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.wearable.z r12 = (com.google.android.gms.internal.wearable.C1535z) r12
            long r8 = com.google.android.gms.internal.wearable.C1459j.m3563e(r17, r18)
        L_0x03b3:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo13900e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03cc
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r1, r7)
            int r6 = r7.f1792a
            if (r2 == r6) goto L_0x03c7
            goto L_0x03cc
        L_0x03c7:
            long r8 = com.google.android.gms.internal.wearable.C1459j.m3563e(r3, r4)
            goto L_0x03b3
        L_0x03cc:
            return r1
        L_0x03cd:
            if (r4 >= r5) goto L_0x03ea
            int r8 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r7)
            int r9 = r7.f1792a
            if (r2 == r9) goto L_0x03d8
            goto L_0x03ea
        L_0x03d8:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.wearable.C1459j.m3568j(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3760L(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.wearable.i):int");
    }

    /* renamed from: M */
    private final <K, V> int m3761M(T t, byte[] bArr, int i, int i2, int i3, long j, C1454i iVar) {
        Unsafe unsafe = f1840p;
        Object P = m3764P(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zzcr) object).zze()) {
            zzcr zzc = zzcr.zza().zzc();
            C1461j1.m3577b(zzc, object);
            unsafe.putObject(t, j, zzc);
        }
        C1456i1 i1Var = (C1456i1) P;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r2;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3762N(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.wearable.C1454i r29) {
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
            sun.misc.Unsafe r12 = f1840p
            int[] r7 = r0.f1841a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0183;
                case 52: goto L_0x016b;
                case 53: goto L_0x0160;
                case 54: goto L_0x0160;
                case 55: goto L_0x0155;
                case 56: goto L_0x0140;
                case 57: goto L_0x012b;
                case 58: goto L_0x0114;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x0155;
                case 63: goto L_0x0084;
                case 64: goto L_0x012b;
                case 65: goto L_0x0140;
                case 66: goto L_0x0071;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x019c
            com.google.android.gms.internal.wearable.a2 r5 = r0.m3763O(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3568j(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f1794c
            if (r15 != 0) goto L_0x0052
            goto L_0x00ec
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1524w0.m3865i(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r11)
            long r3 = r11.f1793b
            long r3 = com.google.android.gms.internal.wearable.C1509t.m3802b(r3)
        L_0x0066:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x006a:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0071:
            if (r5 == 0) goto L_0x0075
            goto L_0x019c
        L_0x0075:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r11)
            int r3 = r11.f1792a
            int r3 = com.google.android.gms.internal.wearable.C1509t.m3801a(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r11)
            int r4 = r11.f1792a
            com.google.android.gms.internal.wearable.r0 r5 = r0.m3765Q(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.mo13730f(r4)
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            com.google.android.gms.internal.wearable.o2 r1 = m3752C(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo13747h(r2, r4)
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00b0:
            r2 = r3
            goto L_0x019d
        L_0x00b3:
            if (r5 == r15) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3566h(r3, r4, r11)
            java.lang.Object r3 = r11.f1794c
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            com.google.android.gms.internal.wearable.a2 r2 = r0.m3763O(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3567i(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d5
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            java.lang.Object r3 = r11.f1794c
            if (r15 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1524w0.m3865i(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r11)
            int r4 = r11.f1792a
            if (r4 != 0) goto L_0x00f0
            java.lang.String r3 = ""
        L_0x00ec:
            r12.putObject(r1, r9, r3)
            goto L_0x010f
        L_0x00f0:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0104
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.wearable.C1428c3.m3494b(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            com.google.android.gms.internal.wearable.zzcc r1 = com.google.android.gms.internal.wearable.zzcc.zzg()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.wearable.C1524w0.f1867a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r11)
            long r3 = r11.f1793b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0124
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x006a
        L_0x012b:
            if (r5 == r7) goto L_0x012f
            goto L_0x019c
        L_0x012f:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3562d(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0140:
            r2 = 1
            if (r5 == r2) goto L_0x0144
            goto L_0x019c
        L_0x0144:
            long r2 = com.google.android.gms.internal.wearable.C1459j.m3563e(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3559a(r3, r4, r11)
            int r3 = r11.f1792a
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3561c(r3, r4, r11)
            long r3 = r11.f1793b
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = com.google.android.gms.internal.wearable.C1459j.m3562d(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0183:
            r2 = 1
            if (r5 == r2) goto L_0x0187
            goto L_0x019c
        L_0x0187:
            long r2 = com.google.android.gms.internal.wearable.C1459j.m3563e(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x019c:
            r2 = r4
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3762N(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.wearable.i):int");
    }

    /* renamed from: O */
    private final C1417a2 m3763O(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C1417a2 a2Var = (C1417a2) this.f1842b[i3];
        if (a2Var != null) {
            return a2Var;
        }
        C1417a2 b = C1529x1.m3906a().mo13843b((Class) this.f1842b[i3 + 1]);
        this.f1842b[i3] = b;
        return b;
    }

    /* renamed from: P */
    private final Object m3764P(int i) {
        int i2 = i / 3;
        return this.f1842b[i2 + i2];
    }

    /* renamed from: Q */
    private final C1500r0 m3765Q(int i) {
        int i2 = i / 3;
        return (C1500r0) this.f1842b[i2 + i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028e, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a4, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d7, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f8, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        if (r3 == 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        r10.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r20;
        r8 = 1048575;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0196, code lost:
        if (r3 == 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0198, code lost:
        r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r4, r11);
        r1 = r11.f1792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        r10.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b5, code lost:
        r0.putLong(r1, r2, r4);
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ed, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f0, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3766R(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.wearable.C1454i r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f1840p
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0321
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3560b(r0, r12, r3, r11)
            int r3 = r11.f1792a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m3783x(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m3782w(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x02fb
        L_0x004e:
            int[] r0 = r15.f1841a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m3770k(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x01f9
            int[] r10 = r15.f1841a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r20 = r2
            if (r10 == r7) goto L_0x0090
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0092
        L_0x0090:
            r10 = r19
        L_0x0092:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01a2;
                case 3: goto L_0x01a2;
                case 4: goto L_0x018f;
                case 5: goto L_0x0173;
                case 6: goto L_0x014f;
                case 7: goto L_0x0132;
                case 8: goto L_0x0111;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d4;
                case 11: goto L_0x018f;
                case 12: goto L_0x00cc;
                case 13: goto L_0x014f;
                case 14: goto L_0x0173;
                case 15: goto L_0x00ba;
                case 16: goto L_0x009f;
                default: goto L_0x0096;
            }
        L_0x0096:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x01f0
        L_0x009f:
            if (r3 != 0) goto L_0x00b5
            int r17 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r4, r11)
            long r0 = r11.f1793b
            long r4 = com.google.android.gms.internal.wearable.C1509t.m3802b(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            goto L_0x01b5
        L_0x00b5:
            r13 = r20
            r20 = r33
            goto L_0x010c
        L_0x00ba:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x010c
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r4, r11)
            int r1 = r11.f1792a
            int r1 = com.google.android.gms.internal.wearable.C1509t.m3801a(r1)
            goto L_0x019e
        L_0x00cc:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x010c
            goto L_0x0198
        L_0x00d4:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x010c
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3566h(r12, r4, r11)
            java.lang.Object r1 = r11.f1794c
            r10.putObject(r14, r8, r1)
            goto L_0x01ed
        L_0x00e6:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x010a
            com.google.android.gms.internal.wearable.a2 r0 = r15.m3763O(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3567i(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0103
            java.lang.Object r1 = r11.f1794c
            goto L_0x012e
        L_0x0103:
            java.lang.Object r3 = r11.f1794c
            java.lang.Object r1 = com.google.android.gms.internal.wearable.C1524w0.m3865i(r1, r3)
            goto L_0x012e
        L_0x010a:
            r2 = r34
        L_0x010c:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01f0
        L_0x0111:
            r2 = r34
            r13 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r0) goto L_0x01f0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0128
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3564f(r12, r4, r11)
            goto L_0x012c
        L_0x0128:
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3565g(r12, r4, r11)
        L_0x012c:
            java.lang.Object r1 = r11.f1794c
        L_0x012e:
            r10.putObject(r14, r8, r1)
            goto L_0x0163
        L_0x0132:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x01f0
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r4, r11)
            long r3 = r11.f1793b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r5 = 0
        L_0x014b:
            com.google.android.gms.internal.wearable.C1534y2.m3990n(r14, r8, r5)
            goto L_0x0163
        L_0x014f:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x01f0
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3562d(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0163:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x0173:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x01f0
            long r22 = com.google.android.gms.internal.wearable.C1459j.m3563e(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01ed
        L_0x018f:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x01f0
        L_0x0198:
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r4, r11)
            int r1 = r11.f1792a
        L_0x019e:
            r10.putInt(r14, r8, r1)
            goto L_0x01ed
        L_0x01a2:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x01f0
            int r17 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r4, r11)
            long r4 = r11.f1793b
            r0 = r10
            r1 = r31
            r2 = r8
        L_0x01b5:
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x023d
        L_0x01c0:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x01f0
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3562d(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.wearable.C1534y2.m3992p(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01ed
        L_0x01d7:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x01f0
            long r0 = com.google.android.gms.internal.wearable.C1459j.m3563e(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.wearable.C1534y2.m3994r(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01ed:
            r6 = r6 | r21
            goto L_0x023b
        L_0x01f0:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02fb
        L_0x01f9:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0254
            r1 = 2
            if (r3 != r1) goto L_0x0247
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.wearable.u0 r0 = (com.google.android.gms.internal.wearable.C1515u0) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0227
            int r1 = r0.size()
            if (r1 != 0) goto L_0x021f
            r1 = 10
            goto L_0x0220
        L_0x021f:
            int r1 = r1 + r1
        L_0x0220:
            com.google.android.gms.internal.wearable.u0 r0 = r0.mo13609h(r1)
            r10.putObject(r14, r8, r0)
        L_0x0227:
            r5 = r0
            com.google.android.gms.internal.wearable.a2 r0 = r15.m3763O(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3571m(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x023b:
            r9 = r10
            r2 = r13
        L_0x023d:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0247:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02da
        L_0x0254:
            r1 = 49
            if (r0 > r1) goto L_0x02a6
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m3760L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02a4
        L_0x0290:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x0319
        L_0x02a4:
            r2 = r0
            goto L_0x02db
        L_0x02a6:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            r7 = r33
            if (r9 != r0) goto L_0x02e0
            r0 = 2
            if (r7 != r0) goto L_0x02da
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.m3761M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02a4
            goto L_0x0290
        L_0x02da:
            r2 = r15
        L_0x02db:
            r6 = r24
            r7 = r25
            goto L_0x02fb
        L_0x02e0:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.m3762N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02a4
            goto L_0x0290
        L_0x02fb:
            com.google.android.gms.internal.wearable.o2 r4 = m3752C(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3572n(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
        L_0x0319:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x0321:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0334
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0334:
            r1 = r34
            if (r0 != r1) goto L_0x0339
            return r0
        L_0x0339:
            com.google.android.gms.internal.wearable.zzcc r0 = com.google.android.gms.internal.wearable.zzcc.zzf()
            goto L_0x033f
        L_0x033e:
            throw r0
        L_0x033f:
            goto L_0x033e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.m3766R(java.lang.Object, byte[], int, int, com.google.android.gms.internal.wearable.i):int");
    }

    /* renamed from: S */
    private static boolean m3767S(Object obj, int i, C1417a2 a2Var) {
        return a2Var.mo13583e(C1534y2.m3995s(obj, (long) (i & 1048575)));
    }

    /* renamed from: i */
    private final int m3768i(int i) {
        return this.f1841a[i + 1];
    }

    /* renamed from: j */
    private final int m3769j(int i) {
        return this.f1841a[i + 2];
    }

    /* renamed from: k */
    private static int m3770k(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: l */
    private static <T> double m3771l(T t, long j) {
        return ((Double) C1534y2.m3995s(t, j)).doubleValue();
    }

    /* renamed from: m */
    private static <T> float m3772m(T t, long j) {
        return ((Float) C1534y2.m3995s(t, j)).floatValue();
    }

    /* renamed from: n */
    private static <T> int m3773n(T t, long j) {
        return ((Integer) C1534y2.m3995s(t, j)).intValue();
    }

    /* renamed from: o */
    private static <T> long m3774o(T t, long j) {
        return ((Long) C1534y2.m3995s(t, j)).longValue();
    }

    /* renamed from: p */
    private static <T> boolean m3775p(T t, long j) {
        return ((Boolean) C1534y2.m3995s(t, j)).booleanValue();
    }

    /* renamed from: q */
    private final boolean m3776q(T t, T t2, int i) {
        return m3778s(t, i) == m3778s(t2, i);
    }

    /* renamed from: r */
    private final boolean m3777r(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m3778s(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: s */
    private final boolean m3778s(T t, int i) {
        int j = m3769j(i);
        long j2 = (long) (j & 1048575);
        if (j2 != 1048575) {
            return (C1534y2.m3985i(t, j2) & (1 << (j >>> 20))) != 0;
        }
        int i2 = m3768i(i);
        long j3 = (long) (i2 & 1048575);
        switch (m3770k(i2)) {
            case 0:
                return C1534y2.m3993q(t, j3) != 0.0d;
            case 1:
                return C1534y2.m3991o(t, j3) != 0.0f;
            case 2:
                return C1534y2.m3987k(t, j3) != 0;
            case 3:
                return C1534y2.m3987k(t, j3) != 0;
            case 4:
                return C1534y2.m3985i(t, j3) != 0;
            case 5:
                return C1534y2.m3987k(t, j3) != 0;
            case 6:
                return C1534y2.m3985i(t, j3) != 0;
            case 7:
                return C1534y2.m3989m(t, j3);
            case 8:
                Object s = C1534y2.m3995s(t, j3);
                if (s instanceof String) {
                    return !((String) s).isEmpty();
                }
                if (s instanceof zzau) {
                    return !zzau.zzb.equals(s);
                }
                throw new IllegalArgumentException();
            case 9:
                return C1534y2.m3995s(t, j3) != null;
            case 10:
                return !zzau.zzb.equals(C1534y2.m3995s(t, j3));
            case 11:
                return C1534y2.m3985i(t, j3) != 0;
            case 12:
                return C1534y2.m3985i(t, j3) != 0;
            case 13:
                return C1534y2.m3985i(t, j3) != 0;
            case 14:
                return C1534y2.m3987k(t, j3) != 0;
            case 15:
                return C1534y2.m3985i(t, j3) != 0;
            case 16:
                return C1534y2.m3987k(t, j3) != 0;
            case 17:
                return C1534y2.m3995s(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: t */
    private final void m3779t(T t, int i) {
        int j = m3769j(i);
        long j2 = (long) (1048575 & j);
        if (j2 != 1048575) {
            C1534y2.m3986j(t, j2, (1 << (j >>> 20)) | C1534y2.m3985i(t, j2));
        }
    }

    /* renamed from: u */
    private final boolean m3780u(T t, int i, int i2) {
        return C1534y2.m3985i(t, (long) (m3769j(i2) & 1048575)) == i;
    }

    /* renamed from: v */
    private final void m3781v(T t, int i, int i2) {
        C1534y2.m3986j(t, (long) (m3769j(i2) & 1048575), i);
    }

    /* renamed from: w */
    private final int m3782w(int i) {
        if (i < this.f1843c || i > this.f1844d) {
            return -1;
        }
        return m3784y(i, 0);
    }

    /* renamed from: x */
    private final int m3783x(int i, int i2) {
        if (i < this.f1843c || i > this.f1844d) {
            return -1;
        }
        return m3784y(i, i2);
    }

    /* renamed from: y */
    private final int m3784y(int i, int i2) {
        int length = (this.f1841a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f1841a[i4];
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

    /* renamed from: z */
    private final void m3785z(T t, C1531y yVar) {
        int i;
        T t2 = t;
        C1531y yVar2 = yVar;
        if (!this.f1846f) {
            int length = this.f1841a.length;
            Unsafe unsafe = f1840p;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int i6 = m3768i(i3);
                int i7 = this.f1841a[i3];
                int k = m3770k(i6);
                if (k <= 17) {
                    int i8 = this.f1841a[i3 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i5) {
                        i4 = unsafe.getInt(t2, (long) i9);
                        i5 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (i6 & i2);
                switch (k) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            yVar2.mo13879q(i7, C1534y2.m3993q(t2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            yVar2.mo13878p(i7, C1534y2.m3991o(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            yVar2.mo13876n(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            yVar2.mo13881s(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            yVar2.mo13882t(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            yVar2.mo13883u(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            yVar2.mo13884v(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            yVar2.mo13885w(i7, C1534y2.m3989m(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m3751B(i7, unsafe.getObject(t2, j), yVar2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            yVar2.mo13855C(i7, unsafe.getObject(t2, j), m3763O(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            yVar2.mo13887y(i7, (zzau) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            yVar2.mo13888z(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            yVar2.mo13880r(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            yVar2.mo13875m(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            yVar2.mo13877o(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            yVar2.mo13853A(i7, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            yVar2.mo13854B(i7, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            yVar2.mo13856D(i7, unsafe.getObject(t2, j), m3763O(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C1427c2.m3476j(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 19:
                        C1427c2.m3477k(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 20:
                        C1427c2.m3478l(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 21:
                        C1427c2.m3479m(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 22:
                        C1427c2.m3483q(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 23:
                        C1427c2.m3481o(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 24:
                        C1427c2.m3486t(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 25:
                        C1427c2.m3489w(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        continue;
                    case 26:
                        C1427c2.m3490x(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2);
                        break;
                    case 27:
                        C1427c2.m3492z(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, m3763O(i3));
                        break;
                    case 28:
                        C1427c2.m3491y(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2);
                        break;
                    case 29:
                        C1427c2.m3484r(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 30:
                        C1427c2.m3488v(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 31:
                        C1427c2.m3487u(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 32:
                        C1427c2.m3482p(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 33:
                        C1427c2.m3485s(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 34:
                        C1427c2.m3480n(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, false);
                        break;
                    case 35:
                        C1427c2.m3476j(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 36:
                        C1427c2.m3477k(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 37:
                        C1427c2.m3478l(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 38:
                        C1427c2.m3479m(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 39:
                        C1427c2.m3483q(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 40:
                        C1427c2.m3481o(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 41:
                        C1427c2.m3486t(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 42:
                        C1427c2.m3489w(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 43:
                        C1427c2.m3484r(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 44:
                        C1427c2.m3488v(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 45:
                        C1427c2.m3487u(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 46:
                        C1427c2.m3482p(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 47:
                        C1427c2.m3485s(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 48:
                        C1427c2.m3480n(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, true);
                        break;
                    case 49:
                        C1427c2.m3440B(this.f1841a[i3], (List) unsafe.getObject(t2, j), yVar2, m3763O(i3));
                        break;
                    case 50:
                        m3750A(yVar2, i7, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13879q(i7, m3771l(t2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13878p(i7, m3772m(t2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13876n(i7, m3774o(t2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13881s(i7, m3774o(t2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13882t(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13883u(i7, m3774o(t2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13884v(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13885w(i7, m3775p(t2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m3780u(t2, i7, i3)) {
                            m3751B(i7, unsafe.getObject(t2, j), yVar2);
                            break;
                        }
                        break;
                    case 60:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13855C(i7, unsafe.getObject(t2, j), m3763O(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13887y(i7, (zzau) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13888z(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13880r(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13875m(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13877o(i7, m3774o(t2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13853A(i7, m3773n(t2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13854B(i7, m3774o(t2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m3780u(t2, i7, i3)) {
                            yVar2.mo13856D(i7, unsafe.getObject(t2, j), m3763O(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            C1482n2<?, ?> n2Var = this.f1852l;
            n2Var.mo13729i(n2Var.mo13724d(t2), yVar2);
            return;
        }
        this.f1853m.mo13597b(t2);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f6, code lost:
        if (r0 != r15) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0312, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0340, code lost:
        if (r0 != r15) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0362, code lost:
        if (r0 != r15) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0133, code lost:
        r1 = r9.f1794c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0135, code lost:
        r10.putObject(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c5, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d8, code lost:
        r10.putInt(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f4, code lost:
        r0.putLong(r1, r2, r4);
        r5 = r6 | r23;
        r6 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022d, code lost:
        r5 = r6 | r23;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0231, code lost:
        r3 = r8;
        r1 = r11;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024d, code lost:
        r7 = r33;
        r18 = r8;
        r26 = r10;
        r8 = r11;
        r27 = r6;
        r6 = r31;
        r31 = r20;
        r20 = r27;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13793D(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.wearable.C1454i r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f1840p
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x03d3
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3560b(r0, r12, r1, r9)
            int r1 = r9.f1792a
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r8
            int r2 = r15.m3783x(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m3782w(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r31 = r0
            r2 = r1
            r8 = r4
            r20 = r5
            r26 = r10
            r7 = r11
            r18 = 0
            r25 = -1
            goto L_0x0365
        L_0x0050:
            int[] r3 = r15.f1841a
            int r20 = r2 + 1
            r3 = r3[r20]
            int r8 = m3770k(r3)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r8 > r0) goto L_0x0260
            int[] r0 = r15.f1841a
            int r23 = r2 + 2
            r0 = r0[r23]
            int r23 = r0 >>> 20
            r11 = 1
            int r23 = r11 << r23
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0088
            if (r6 == r11) goto L_0x0081
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0081:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r11 = r0
            goto L_0x0089
        L_0x0088:
            r11 = r6
        L_0x0089:
            r6 = r5
            r0 = 5
            r12 = r30
            switch(r8) {
                case 0: goto L_0x0215;
                case 1: goto L_0x01fd;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01dc;
                case 4: goto L_0x01c8;
                case 5: goto L_0x01a9;
                case 6: goto L_0x0195;
                case 7: goto L_0x0178;
                case 8: goto L_0x015e;
                case 9: goto L_0x013a;
                case 10: goto L_0x0125;
                case 11: goto L_0x01c8;
                case 12: goto L_0x00f3;
                case 13: goto L_0x0195;
                case 14: goto L_0x01a9;
                case 15: goto L_0x00de;
                case 16: goto L_0x00b7;
                default: goto L_0x0090;
            }
        L_0x0090:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 3
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x024d
            com.google.android.gms.internal.wearable.a2 r0 = r15.m3763O(r8)
            int r1 = r20 << 3
            r5 = r1 | 4
            r1 = r30
            r12 = r3
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3568j(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0237
            java.lang.Object r1 = r9.f1794c
            goto L_0x0241
        L_0x00b7:
            if (r7 != 0) goto L_0x00d5
            int r7 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r1, r9)
            long r0 = r9.f1793b
            long r24 = com.google.android.gms.internal.wearable.C1509t.m3802b(r0)
            r8 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r19 = -1
            r2 = r3
            r31 = r11
            r11 = r21
            r8 = r5
            r4 = r24
            goto L_0x01f4
        L_0x00d5:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            goto L_0x01c5
        L_0x00de:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r1, r9)
            int r1 = r9.f1792a
            int r1 = com.google.android.gms.internal.wearable.C1509t.m3801a(r1)
            goto L_0x01d8
        L_0x00f3:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r1, r9)
            int r1 = r9.f1792a
            com.google.android.gms.internal.wearable.r0 r2 = r15.m3765Q(r8)
            if (r2 == 0) goto L_0x01d8
            boolean r2 = r2.mo13730f(r1)
            if (r2 == 0) goto L_0x0110
            goto L_0x01d8
        L_0x0110:
            com.google.android.gms.internal.wearable.o2 r2 = m3752C(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo13747h(r11, r1)
            r5 = r6
            r3 = r8
            r1 = r11
            r2 = r20
            r6 = r31
            goto L_0x02af
        L_0x0125:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3566h(r12, r1, r9)
        L_0x0133:
            java.lang.Object r1 = r9.f1794c
        L_0x0135:
            r10.putObject(r14, r3, r1)
            goto L_0x022d
        L_0x013a:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01c5
            com.google.android.gms.internal.wearable.a2 r0 = r15.m3763O(r8)
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3567i(r0, r12, r1, r13, r9)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0153
            java.lang.Object r1 = r9.f1794c
            goto L_0x0135
        L_0x0153:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.f1794c
            java.lang.Object r1 = com.google.android.gms.internal.wearable.C1524w0.m3865i(r1, r2)
            goto L_0x0135
        L_0x015e:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01c5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0173
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3564f(r12, r1, r9)
            goto L_0x0133
        L_0x0173:
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3565g(r12, r1, r9)
            goto L_0x0133
        L_0x0178:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r1, r9)
            long r1 = r9.f1793b
            r21 = 0
            int r5 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x018f
            r1 = 1
            goto L_0x0190
        L_0x018f:
            r1 = 0
        L_0x0190:
            com.google.android.gms.internal.wearable.C1534y2.m3990n(r14, r3, r1)
            goto L_0x022d
        L_0x0195:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3562d(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
            goto L_0x022d
        L_0x01a9:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 1
            r19 = -1
            if (r7 != r0) goto L_0x01c5
            long r21 = com.google.android.gms.internal.wearable.C1459j.m3563e(r12, r1)
            r0 = r10
            r7 = r1
            r1 = r29
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x022d
        L_0x01c5:
            r2 = r1
            goto L_0x024d
        L_0x01c8:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != 0) goto L_0x024d
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3559a(r12, r2, r9)
            int r1 = r9.f1792a
        L_0x01d8:
            r10.putInt(r14, r3, r1)
            goto L_0x022d
        L_0x01dc:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != 0) goto L_0x024d
            int r7 = com.google.android.gms.internal.wearable.C1459j.m3561c(r12, r2, r9)
            long r1 = r9.f1793b
            r0 = r10
            r21 = r1
            r1 = r29
            r2 = r3
            r4 = r21
        L_0x01f4:
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r0 = r7
            goto L_0x0231
        L_0x01fd:
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x024d
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3562d(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.wearable.C1534y2.m3992p(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x022d
        L_0x0215:
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 1
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x024d
            long r0 = com.google.android.gms.internal.wearable.C1459j.m3563e(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.wearable.C1534y2.m3994r(r14, r3, r0)
            int r0 = r2 + 8
        L_0x022d:
            r5 = r6 | r23
            r6 = r31
        L_0x0231:
            r3 = r8
            r1 = r11
            r2 = r20
            goto L_0x02af
        L_0x0237:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f1794c
            java.lang.Object r1 = com.google.android.gms.internal.wearable.C1524w0.m3865i(r1, r2)
        L_0x0241:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r23
            r12 = r30
            r6 = r31
            r13 = r32
            goto L_0x0231
        L_0x024d:
            r7 = r33
            r18 = r8
            r26 = r10
            r8 = r11
            r25 = -1
            r27 = r6
            r6 = r31
            r31 = r20
            r20 = r27
            goto L_0x0365
        L_0x0260:
            r12 = r3
            r3 = r8
            r4 = r20
            r11 = r21
            r19 = -1
            r8 = r2
            r2 = r1
            r0 = 27
            if (r3 != r0) goto L_0x02c4
            r0 = 2
            if (r7 != r0) goto L_0x02b3
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.wearable.u0 r0 = (com.google.android.gms.internal.wearable.C1515u0) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x028e
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0286
            r1 = 10
            goto L_0x0287
        L_0x0286:
            int r1 = r1 + r1
        L_0x0287:
            com.google.android.gms.internal.wearable.u0 r0 = r0.mo13609h(r1)
            r10.putObject(r14, r12, r0)
        L_0x028e:
            r7 = r0
            com.google.android.gms.internal.wearable.a2 r0 = r15.m3763O(r8)
            r1 = r11
            r3 = r2
            r2 = r30
            r12 = r4
            r4 = r32
            r20 = r5
            r5 = r7
            r21 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3571m(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r3 = r8
            r2 = r12
            r5 = r20
            r6 = r21
            r12 = r30
        L_0x02af:
            r11 = r33
            goto L_0x0019
        L_0x02b3:
            r20 = r5
            r21 = r6
            r15 = r2
            r31 = r4
            r18 = r8
            r26 = r10
            r22 = r11
            r25 = -1
            goto L_0x0343
        L_0x02c4:
            r20 = r5
            r21 = r6
            r5 = r2
            r6 = r4
            r0 = 49
            if (r3 > r0) goto L_0x0316
            r4 = r22
            long r1 = (long) r4
            r0 = r28
            r22 = r1
            r1 = r29
            r2 = r30
            r24 = r3
            r3 = r5
            r4 = r32
            r15 = r5
            r5 = r11
            r31 = r6
            r18 = r8
            r19 = r24
            r25 = -1
            r26 = r10
            r9 = r22
            r22 = r11
            r11 = r19
            r14 = r34
            int r0 = r0.m3760L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0312
        L_0x02f8:
            r15 = r28
            r14 = r29
            r12 = r30
            r2 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r3 = r18
            r5 = r20
            r6 = r21
            r1 = r22
            r10 = r26
            goto L_0x0019
        L_0x0312:
            r7 = r33
            r2 = r0
            goto L_0x0346
        L_0x0316:
            r19 = r3
            r15 = r5
            r31 = r6
            r18 = r8
            r26 = r10
            r4 = r22
            r25 = -1
            r22 = r11
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x034b
            r0 = 2
            if (r7 != r0) goto L_0x0343
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r12
            r8 = r34
            int r0 = r0.m3761M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0312
            goto L_0x02f8
        L_0x0343:
            r7 = r33
            r2 = r15
        L_0x0346:
            r6 = r21
            r8 = r22
            goto L_0x0365
        L_0x034b:
            r0 = r28
            r1 = r29
            r2 = r30
            r8 = r4
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r31
            r10 = r12
            r12 = r18
            r13 = r34
            int r0 = r0.m3762N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0312
            goto L_0x02f8
        L_0x0365:
            if (r8 != r7) goto L_0x0373
            if (r7 == 0) goto L_0x0373
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r20
            goto L_0x03dc
        L_0x0373:
            r9 = r28
            boolean r0 = r9.f1846f
            if (r0 == 0) goto L_0x03ac
            r10 = r34
            com.google.android.gms.internal.wearable.c0 r0 = r10.f1795d
            com.google.android.gms.internal.wearable.c0 r1 = com.google.android.gms.internal.wearable.C1425c0.m3435a()
            if (r0 == r1) goto L_0x03a7
            com.google.android.gms.internal.wearable.o1 r0 = r9.f1845e
            com.google.android.gms.internal.wearable.c0 r1 = r10.f1795d
            r11 = r31
            com.google.android.gms.internal.wearable.m0 r0 = r1.mo13595b(r0, r11)
            if (r0 != 0) goto L_0x03a1
            com.google.android.gms.internal.wearable.o2 r4 = m3752C(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3572n(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03c1
        L_0x03a1:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.wearable.l0 r0 = (com.google.android.gms.internal.wearable.C1470l0) r0
            throw r17
        L_0x03a7:
            r12 = r29
            r11 = r31
            goto L_0x03b2
        L_0x03ac:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03b2:
            com.google.android.gms.internal.wearable.o2 r4 = m3752C(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.wearable.C1459j.m3572n(r0, r1, r2, r3, r4, r5)
        L_0x03c1:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r18
            r5 = r20
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x03d3:
            r20 = r5
            r21 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x03dc:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x03e7
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x03e7:
            int r3 = r9.f1849i
        L_0x03e9:
            int r4 = r9.f1850j
            if (r3 >= r4) goto L_0x0414
            int[] r4 = r9.f1848h
            r4 = r4[r3]
            int[] r5 = r9.f1841a
            r5 = r5[r4]
            int r5 = r9.m3768i(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r12, r5)
            if (r5 != 0) goto L_0x0402
            goto L_0x0408
        L_0x0402:
            com.google.android.gms.internal.wearable.r0 r6 = r9.m3765Q(r4)
            if (r6 != 0) goto L_0x040b
        L_0x0408:
            int r3 = r3 + 1
            goto L_0x03e9
        L_0x040b:
            com.google.android.gms.internal.wearable.zzcr r5 = (com.google.android.gms.internal.wearable.zzcr) r5
            java.lang.Object r0 = r9.m3764P(r4)
            com.google.android.gms.internal.wearable.i1 r0 = (com.google.android.gms.internal.wearable.C1456i1) r0
            throw r17
        L_0x0414:
            r2 = r32
            if (r7 != 0) goto L_0x0420
            if (r0 != r2) goto L_0x041b
            goto L_0x0424
        L_0x041b:
            com.google.android.gms.internal.wearable.zzcc r0 = com.google.android.gms.internal.wearable.zzcc.zzf()
            throw r0
        L_0x0420:
            if (r0 > r2) goto L_0x0425
            if (r1 != r7) goto L_0x0425
        L_0x0424:
            return r0
        L_0x0425:
            com.google.android.gms.internal.wearable.zzcc r0 = com.google.android.gms.internal.wearable.zzcc.zzf()
            goto L_0x042b
        L_0x042a:
            throw r0
        L_0x042b:
            goto L_0x042a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.mo13793D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.wearable.i):int");
    }

    /* renamed from: a */
    public final int mo13579a(T t) {
        return this.f1847g ? m3759K(t) : m3758J(t);
    }

    /* renamed from: b */
    public final void mo13580b(T t, byte[] bArr, int i, int i2, C1454i iVar) {
        if (this.f1847g) {
            m3766R(t, bArr, i, i2, iVar);
        } else {
            mo13793D(t, bArr, i, i2, 0, iVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.google.android.gms.internal.wearable.C1534y2.m3996t(r7, r2, com.google.android.gms.internal.wearable.C1534y2.m3995s(r8, r2));
        m3781v(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        com.google.android.gms.internal.wearable.C1534y2.m3996t(r7, r2, com.google.android.gms.internal.wearable.C1534y2.m3995s(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        com.google.android.gms.internal.wearable.C1534y2.m3986j(r7, r2, com.google.android.gms.internal.wearable.C1534y2.m3985i(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        com.google.android.gms.internal.wearable.C1534y2.m3988l(r7, r2, com.google.android.gms.internal.wearable.C1534y2.m3987k(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        m3779t(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13581c(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f1841a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m3768i(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f1841a
            r4 = r4[r0]
            int r1 = m3770k(r1)
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
            boolean r1 = r6.m3780u(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m3757I(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m3780u(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3996t(r7, r2, r1)
            r6.m3781v(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.wearable.j1 r1 = r6.f1854n
            com.google.android.gms.internal.wearable.C1427c2.m3475i(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.wearable.d1 r1 = r6.f1851k
            r1.mo13593b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m3756H(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3996t(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.wearable.C1534y2.m3989m(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3990n(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3986j(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3988l(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.wearable.C1534y2.m3991o(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3992p(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m3778s(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.wearable.C1534y2.m3993q(r8, r2)
            com.google.android.gms.internal.wearable.C1534y2.m3994r(r7, r2, r4)
        L_0x00eb:
            r6.m3779t(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r6.f1852l
            com.google.android.gms.internal.wearable.C1427c2.m3472f(r0, r7, r8)
            boolean r0 = r6.f1846f
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.wearable.d0<?> r0 = r6.f1853m
            com.google.android.gms.internal.wearable.C1427c2.m3471e(r0, r7, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.mo13581c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = m3773n(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = m3774o(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = com.google.android.gms.internal.wearable.C1524w0.m3862f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = com.google.android.gms.internal.wearable.C1524w0.m3861e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13582d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f1841a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0128
            int r3 = r8.m3768i(r1)
            int[] r4 = r8.f1841a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m3770k(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0124
        L_0x001f:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x004b:
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            boolean r3 = m3775p(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x008d:
            int r2 = r2 * 53
            int r3 = m3773n(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = m3774o(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            float r3 = m3772m(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.m3780u(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            double r3 = m3771l(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0124
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.wearable.C1534y2.m3989m(r9, r5)
        L_0x00f7:
            int r3 = com.google.android.gms.internal.wearable.C1524w0.m3862f(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.wearable.C1534y2.m3991o(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.wearable.C1534y2.m3993q(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = com.google.android.gms.internal.wearable.C1524w0.m3861e(r3)
        L_0x0123:
            int r2 = r2 + r3
        L_0x0124:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0128:
            int r2 = r2 * 53
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r8.f1852l
            java.lang.Object r0 = r0.mo13724d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f1846f
            if (r0 != 0) goto L_0x013a
            return r2
        L_0x013a:
            com.google.android.gms.internal.wearable.d0<?> r0 = r8.f1853m
            r0.mo13597b(r9)
            r9 = 0
            goto L_0x0142
        L_0x0141:
            throw r9
        L_0x0142:
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.mo13582d(java.lang.Object):int");
    }

    /* renamed from: e */
    public final boolean mo13583e(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f1849i) {
            int i6 = this.f1848h[i5];
            int i7 = this.f1841a[i6];
            int i8 = m3768i(i6);
            int i9 = this.f1841a[i6 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i3) {
                if (i10 != 1048575) {
                    i4 = f1840p.getInt(t2, (long) i10);
                }
                i = i4;
                i2 = i10;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & i8) != 0 && !m3777r(t, i6, i2, i, i11)) {
                return false;
            }
            int k = m3770k(i8);
            if (k != 9 && k != 17) {
                if (k != 27) {
                    if (k == 60 || k == 68) {
                        if (m3780u(t2, i7, i6) && !m3767S(t2, i8, m3763O(i6))) {
                            return false;
                        }
                    } else if (k != 49) {
                        if (k == 50 && !((zzcr) C1534y2.m3995s(t2, (long) (i8 & 1048575))).isEmpty()) {
                            C1456i1 i1Var = (C1456i1) m3764P(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C1534y2.m3995s(t2, (long) (i8 & 1048575));
                if (!list.isEmpty()) {
                    C1417a2 O = m3763O(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!O.mo13583e(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m3777r(t, i6, i2, i, i11) && !m3767S(t2, i8, m3763O(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f1846f) {
            return true;
        }
        this.f1853m.mo13597b(t2);
        throw null;
    }

    /* renamed from: f */
    public final void mo13584f(T t) {
        int i;
        int i2 = this.f1849i;
        while (true) {
            i = this.f1850j;
            if (i2 >= i) {
                break;
            }
            long i3 = (long) (m3768i(this.f1848h[i2]) & 1048575);
            Object s = C1534y2.m3995s(t, i3);
            if (s != null) {
                ((zzcr) s).zzd();
                C1534y2.m3996t(t, i3, s);
            }
            i2++;
        }
        int length = this.f1848h.length;
        while (i < length) {
            this.f1851k.mo13592a(t, (long) this.f1848h[i]);
            i++;
        }
        this.f1852l.mo13725e(t);
        if (this.f1846f) {
            this.f1853m.mo13598c(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x036d, code lost:
        r11.mo13853A(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x037e, code lost:
        r11.mo13877o(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038f, code lost:
        r11.mo13875m(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a0, code lost:
        r11.mo13880r(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03b1, code lost:
        r11.mo13888z(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03bc, code lost:
        r11.mo13887y(r4, (com.google.android.gms.internal.wearable.zzau) com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03cf, code lost:
        r11.mo13855C(r4, com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, (long) (r3 & 1048575)), m3763O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e4, code lost:
        m3751B(r4, com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, (long) (r3 & 1048575)), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03fb, code lost:
        r11.mo13885w(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x040c, code lost:
        r11.mo13884v(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x041c, code lost:
        r11.mo13883u(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042c, code lost:
        r11.mo13882t(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043c, code lost:
        r11.mo13881s(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x044c, code lost:
        r11.mo13876n(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x045c, code lost:
        r11.mo13878p(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x046c, code lost:
        r11.mo13879q(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0341, code lost:
        r11.mo13856D(r4, com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, (long) (r3 & 1048575)), m3763O(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035c, code lost:
        r11.mo13854B(r4, r5);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13585g(T r10, com.google.android.gms.internal.wearable.C1531y r11) {
        /*
            r9 = this;
            boolean r0 = r9.f1847g
            if (r0 == 0) goto L_0x0484
            boolean r0 = r9.f1846f
            if (r0 != 0) goto L_0x047d
            int[] r0 = r9.f1841a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0473
            int r3 = r9.m3768i(r2)
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            int r5 = m3770k(r3)
            r6 = 1
            r7 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0460;
                case 1: goto L_0x0450;
                case 2: goto L_0x0440;
                case 3: goto L_0x0430;
                case 4: goto L_0x0420;
                case 5: goto L_0x0410;
                case 6: goto L_0x0400;
                case 7: goto L_0x03ef;
                case 8: goto L_0x03de;
                case 9: goto L_0x03c9;
                case 10: goto L_0x03b6;
                case 11: goto L_0x03a5;
                case 12: goto L_0x0394;
                case 13: goto L_0x0383;
                case 14: goto L_0x0372;
                case 15: goto L_0x0361;
                case 16: goto L_0x0350;
                case 17: goto L_0x033b;
                case 18: goto L_0x032a;
                case 19: goto L_0x0319;
                case 20: goto L_0x0308;
                case 21: goto L_0x02f7;
                case 22: goto L_0x02e6;
                case 23: goto L_0x02d5;
                case 24: goto L_0x02c4;
                case 25: goto L_0x02b3;
                case 26: goto L_0x02a2;
                case 27: goto L_0x028d;
                case 28: goto L_0x027c;
                case 29: goto L_0x026b;
                case 30: goto L_0x025a;
                case 31: goto L_0x0249;
                case 32: goto L_0x0238;
                case 33: goto L_0x0227;
                case 34: goto L_0x0216;
                case 35: goto L_0x0205;
                case 36: goto L_0x01f4;
                case 37: goto L_0x01e3;
                case 38: goto L_0x01d2;
                case 39: goto L_0x01c1;
                case 40: goto L_0x01b0;
                case 41: goto L_0x019f;
                case 42: goto L_0x018e;
                case 43: goto L_0x017d;
                case 44: goto L_0x016c;
                case 45: goto L_0x015b;
                case 46: goto L_0x014a;
                case 47: goto L_0x0139;
                case 48: goto L_0x0128;
                case 49: goto L_0x0113;
                case 50: goto L_0x0108;
                case 51: goto L_0x00fa;
                case 52: goto L_0x00ec;
                case 53: goto L_0x00de;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c2;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00a6;
                case 58: goto L_0x0098;
                case 59: goto L_0x0090;
                case 60: goto L_0x0088;
                case 61: goto L_0x0080;
                case 62: goto L_0x0072;
                case 63: goto L_0x0064;
                case 64: goto L_0x0056;
                case 65: goto L_0x0048;
                case 66: goto L_0x003a;
                case 67: goto L_0x002c;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x046f
        L_0x0024:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x0341
        L_0x002c:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m3774o(r10, r5)
            goto L_0x035c
        L_0x003a:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x036d
        L_0x0048:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m3774o(r10, r5)
            goto L_0x037e
        L_0x0056:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x038f
        L_0x0064:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x03a0
        L_0x0072:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x03b1
        L_0x0080:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03bc
        L_0x0088:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03cf
        L_0x0090:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03e4
        L_0x0098:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = m3775p(r10, r5)
            goto L_0x03fb
        L_0x00a6:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x040c
        L_0x00b4:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m3774o(r10, r5)
            goto L_0x041c
        L_0x00c2:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = m3773n(r10, r5)
            goto L_0x042c
        L_0x00d0:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m3774o(r10, r5)
            goto L_0x043c
        L_0x00de:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = m3774o(r10, r5)
            goto L_0x044c
        L_0x00ec:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = m3772m(r10, r5)
            goto L_0x045c
        L_0x00fa:
            boolean r5 = r9.m3780u(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = m3771l(r10, r5)
            goto L_0x046c
        L_0x0108:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            r9.m3750A(r11, r4, r3, r2)
            goto L_0x046f
        L_0x0113:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.a2 r5 = r9.m3763O(r2)
            com.google.android.gms.internal.wearable.C1427c2.m3440B(r4, r3, r11, r5)
            goto L_0x046f
        L_0x0128:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3480n(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0139:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3485s(r4, r3, r11, r6)
            goto L_0x046f
        L_0x014a:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3482p(r4, r3, r11, r6)
            goto L_0x046f
        L_0x015b:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3487u(r4, r3, r11, r6)
            goto L_0x046f
        L_0x016c:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3488v(r4, r3, r11, r6)
            goto L_0x046f
        L_0x017d:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3484r(r4, r3, r11, r6)
            goto L_0x046f
        L_0x018e:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3489w(r4, r3, r11, r6)
            goto L_0x046f
        L_0x019f:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3486t(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01b0:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3481o(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01c1:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3483q(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01d2:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3479m(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01e3:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3478l(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01f4:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3477k(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0205:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3476j(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0216:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3480n(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0227:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3485s(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0238:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3482p(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0249:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3487u(r4, r3, r11, r1)
            goto L_0x046f
        L_0x025a:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3488v(r4, r3, r11, r1)
            goto L_0x046f
        L_0x026b:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3484r(r4, r3, r11, r1)
            goto L_0x046f
        L_0x027c:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3491y(r4, r3, r11)
            goto L_0x046f
        L_0x028d:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.a2 r5 = r9.m3763O(r2)
            com.google.android.gms.internal.wearable.C1427c2.m3492z(r4, r3, r11, r5)
            goto L_0x046f
        L_0x02a2:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3490x(r4, r3, r11)
            goto L_0x046f
        L_0x02b3:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3489w(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02c4:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3486t(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02d5:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3481o(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02e6:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3483q(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02f7:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3479m(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0308:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3478l(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0319:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3477k(r4, r3, r11, r1)
            goto L_0x046f
        L_0x032a:
            int[] r4 = r9.f1841a
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.C1427c2.m3476j(r4, r3, r11, r1)
            goto L_0x046f
        L_0x033b:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x0341:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            com.google.android.gms.internal.wearable.a2 r5 = r9.m3763O(r2)
            r11.mo13856D(r4, r3, r5)
            goto L_0x046f
        L_0x0350:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
        L_0x035c:
            r11.mo13854B(r4, r5)
            goto L_0x046f
        L_0x0361:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x036d:
            r11.mo13853A(r4, r3)
            goto L_0x046f
        L_0x0372:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
        L_0x037e:
            r11.mo13877o(r4, r5)
            goto L_0x046f
        L_0x0383:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x038f:
            r11.mo13875m(r4, r3)
            goto L_0x046f
        L_0x0394:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x03a0:
            r11.mo13880r(r4, r3)
            goto L_0x046f
        L_0x03a5:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x03b1:
            r11.mo13888z(r4, r3)
            goto L_0x046f
        L_0x03b6:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03bc:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            com.google.android.gms.internal.wearable.zzau r3 = (com.google.android.gms.internal.wearable.zzau) r3
            r11.mo13887y(r4, r3)
            goto L_0x046f
        L_0x03c9:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03cf:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            com.google.android.gms.internal.wearable.a2 r5 = r9.m3763O(r2)
            r11.mo13855C(r4, r3, r5)
            goto L_0x046f
        L_0x03de:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03e4:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            m3751B(r4, r3, r11)
            goto L_0x046f
        L_0x03ef:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = com.google.android.gms.internal.wearable.C1534y2.m3989m(r10, r5)
        L_0x03fb:
            r11.mo13885w(r4, r3)
            goto L_0x046f
        L_0x0400:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x040c:
            r11.mo13884v(r4, r3)
            goto L_0x046f
        L_0x0410:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
        L_0x041c:
            r11.mo13883u(r4, r5)
            goto L_0x046f
        L_0x0420:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
        L_0x042c:
            r11.mo13882t(r4, r3)
            goto L_0x046f
        L_0x0430:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
        L_0x043c:
            r11.mo13881s(r4, r5)
            goto L_0x046f
        L_0x0440:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
        L_0x044c:
            r11.mo13876n(r4, r5)
            goto L_0x046f
        L_0x0450:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = com.google.android.gms.internal.wearable.C1534y2.m3991o(r10, r5)
        L_0x045c:
            r11.mo13878p(r4, r3)
            goto L_0x046f
        L_0x0460:
            boolean r5 = r9.m3778s(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = com.google.android.gms.internal.wearable.C1534y2.m3993q(r10, r5)
        L_0x046c:
            r11.mo13879q(r4, r5)
        L_0x046f:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0473:
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r9.f1852l
            java.lang.Object r10 = r0.mo13724d(r10)
            r0.mo13729i(r10, r11)
            return
        L_0x047d:
            com.google.android.gms.internal.wearable.d0<?> r11 = r9.f1853m
            r11.mo13597b(r10)
            r10 = 0
            throw r10
        L_0x0484:
            r9.m3785z(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.mo13585g(java.lang.Object, com.google.android.gms.internal.wearable.y):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13586h(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.f1841a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.m3768i(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = m3770k(r3)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
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
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.m3769j(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r3)
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.wearable.C1534y2.m3995s(r10, r5)
            boolean r3 = com.google.android.gms.internal.wearable.C1427c2.m3470d(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.google.android.gms.internal.wearable.C1534y2.m3989m(r9, r5)
            boolean r4 = com.google.android.gms.internal.wearable.C1534y2.m3989m(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r9, r5)
            int r4 = com.google.android.gms.internal.wearable.C1534y2.m3985i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r9, r5)
            long r5 = com.google.android.gms.internal.wearable.C1534y2.m3987k(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.google.android.gms.internal.wearable.C1534y2.m3991o(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.wearable.C1534y2.m3991o(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.m3776q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.google.android.gms.internal.wearable.C1534y2.m3993q(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.wearable.C1534y2.m3993q(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.wearable.n2<?, ?> r0 = r8.f1852l
            java.lang.Object r0 = r0.mo13724d(r9)
            com.google.android.gms.internal.wearable.n2<?, ?> r2 = r8.f1852l
            java.lang.Object r2 = r2.mo13724d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f1846f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            com.google.android.gms.internal.wearable.d0<?> r0 = r8.f1853m
            r0.mo13597b(r9)
            com.google.android.gms.internal.wearable.d0<?> r9 = r8.f1853m
            r9.mo13597b(r10)
            r9 = 0
            goto L_0x01e0
        L_0x01df:
            throw r9
        L_0x01e0:
            goto L_0x01df
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1506s1.mo13586h(java.lang.Object, java.lang.Object):boolean");
    }

    public final T zza() {
        return ((C1480n0) this.f1845e).mo13717j(4, (Object) null, (Object) null);
    }
}
