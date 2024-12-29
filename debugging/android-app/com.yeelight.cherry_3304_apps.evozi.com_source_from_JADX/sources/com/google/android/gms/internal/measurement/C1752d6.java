package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
final class C1752d6<T> implements C1912n6<T> {

    /* renamed from: a */
    private final C2062x5 f3303a;

    /* renamed from: b */
    private final C1768e7<?, ?> f3304b;

    /* renamed from: c */
    private final boolean f3305c;

    /* renamed from: d */
    private final C1704a4<?> f3306d;

    private C1752d6(C1768e7<?, ?> e7Var, C1704a4<?> a4Var, C2062x5 x5Var) {
        this.f3304b = e7Var;
        this.f3305c = a4Var.mo11426e(x5Var);
        this.f3306d = a4Var;
        this.f3303a = x5Var;
    }

    /* renamed from: i */
    static <T> C1752d6<T> m4970i(C1768e7<?, ?> e7Var, C1704a4<?> a4Var, C2062x5 x5Var) {
        return new C1752d6<>(e7Var, a4Var, x5Var);
    }

    /* renamed from: C */
    public final T mo11461C() {
        return this.f3303a.mo11838a().mo11852M();
    }

    /* renamed from: a */
    public final int mo11462a(T t) {
        int hashCode = this.f3304b.mo11608f(t).hashCode();
        return this.f3305c ? (hashCode * 53) + this.f3306d.mo11423b(t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final boolean mo11463b(T t) {
        return this.f3306d.mo11423b(t).mo11659r();
    }

    /* renamed from: c */
    public final void mo11464c(T t) {
        this.f3304b.mo11612j(t);
        this.f3306d.mo11428g(t);
    }

    /* renamed from: d */
    public final int mo11465d(T t) {
        C1768e7<?, ?> e7Var = this.f3304b;
        int k = e7Var.mo11613k(e7Var.mo11608f(t)) + 0;
        return this.f3305c ? k + this.f3306d.mo11423b(t).mo11660s() : k;
    }

    /* renamed from: e */
    public final boolean mo11466e(T t, T t2) {
        if (!this.f3304b.mo11608f(t).equals(this.f3304b.mo11608f(t2))) {
            return false;
        }
        if (this.f3305c) {
            return this.f3306d.mo11423b(t).equals(this.f3306d.mo11423b(t2));
        }
        return true;
    }

    /* renamed from: f */
    public final void mo11467f(T t, C1723b8 b8Var) {
        Iterator<Map.Entry<?, Object>> p = this.f3306d.mo11423b(t).mo11657p();
        while (p.hasNext()) {
            Map.Entry next = p.next();
            C1811h4 h4Var = (C1811h4) next.getKey();
            if (h4Var.mo11708E() != C2081y7.MESSAGE || h4Var.mo11709F() || h4Var.mo11710G()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            b8Var.mo11501m(h4Var.mo11706C(), next instanceof C2093z4 ? ((C2093z4) next).mo12355a().mo11458d() : next.getValue());
        }
        C1768e7<?, ?> e7Var = this.f3304b;
        e7Var.mo11609g(e7Var.mo11608f(t), b8Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.m4$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11468g(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.C1764e3 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.m4 r0 = (com.google.android.gms.internal.measurement.C1889m4) r0
            com.google.android.gms.internal.measurement.h7 r1 = r0.zzb
            com.google.android.gms.internal.measurement.h7 r2 = com.google.android.gms.internal.measurement.C1814h7.m5204a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.h7 r1 = com.google.android.gms.internal.measurement.C1814h7.m5207g()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.m4$d r10 = (com.google.android.gms.internal.measurement.C1889m4.C1893d) r10
            r10.mo11862y()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r11, r12, r14)
            int r2 = r14.f3321a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.a4<?> r12 = r9.f3306d
            com.google.android.gms.internal.measurement.y3 r0 = r14.f3324d
            com.google.android.gms.internal.measurement.x5 r3 = r9.f3303a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo11424c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.m4$f r0 = (com.google.android.gms.internal.measurement.C1889m4.C1895f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.C1718b3.m4770c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.C1844j6.m5284a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.C1718b3.m4768a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r11, r4, r14)
            int r5 = r14.f3321a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4784q(r11, r4, r14)
            java.lang.Object r2 = r14.f3323c
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.C1779f3) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.C1844j6.m5284a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4776i(r11, r4, r14)
            int r12 = r14.f3321a
            com.google.android.gms.internal.measurement.a4<?> r0 = r9.f3306d
            com.google.android.gms.internal.measurement.y3 r5 = r14.f3324d
            com.google.android.gms.internal.measurement.x5 r6 = r9.f3303a
            java.lang.Object r0 = r0.mo11424c(r5, r6, r12)
            com.google.android.gms.internal.measurement.m4$f r0 = (com.google.android.gms.internal.measurement.C1889m4.C1895f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.C1718b3.m4768a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.mo11715c(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.w4 r10 = com.google.android.gms.internal.measurement.C2046w4.m6269e()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1752d6.mo11468g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e3):void");
    }

    /* renamed from: h */
    public final void mo11469h(T t, T t2) {
        C1927o6.m5693o(this.f3304b, t, t2);
        if (this.f3305c) {
            C1927o6.m5691m(this.f3306d, t, t2);
        }
    }
}
