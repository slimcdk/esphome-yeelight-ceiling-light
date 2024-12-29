package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1821i0;

/* renamed from: com.google.android.gms.measurement.internal.ga */
final class C2188ga extends C2152da {

    /* renamed from: g */
    private C1821i0 f4143g;

    /* renamed from: h */
    private final /* synthetic */ C2116aa f4144h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2188ga(C2116aa aaVar, String str, int i, C1821i0 i0Var) {
        super(str, i);
        this.f4144h = aaVar;
        this.f4143g = i0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12646a() {
        return this.f4143g.mo11726B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo12647i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo12648j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12687k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C1715b1 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.C1847j9.m5293a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.aa r0 = r10.f4144h
            com.google.android.gms.measurement.internal.b r0 = r0.mo13112m()
            java.lang.String r3 = r10.f4071a
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2302r.f4512f0
            boolean r0 = r0.mo12480y(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.gms.internal.measurement.i0 r3 = r10.f4143g
            boolean r3 = r3.mo11729F()
            com.google.android.gms.internal.measurement.i0 r4 = r10.f4143g
            boolean r4 = r4.mo11730G()
            com.google.android.gms.internal.measurement.i0 r5 = r10.f4143g
            boolean r5 = r5.mo11732J()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.aa r11 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r11 = r11.mo12427b()
            com.google.android.gms.measurement.internal.y3 r11 = r11.mo13104O()
            int r12 = r10.f4072b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.i0 r13 = r10.f4143g
            boolean r13 = r13.mo11725A()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.i0 r13 = r10.f4143g
            int r13 = r13.mo11726B()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo13132c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.i0 r6 = r10.f4143g
            com.google.android.gms.internal.measurement.g0 r6 = r6.mo11728E()
            boolean r7 = r6.mo11675G()
            boolean r8 = r13.mo11440U()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo11672D()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13099J()
            com.google.android.gms.measurement.internal.aa r7 = r10.f4144h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r8 = r13.mo11437P()
            java.lang.String r7 = r7.mo12997z(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo13131b(r8, r7)
            goto L_0x0175
        L_0x0099:
            long r8 = r13.mo11441V()
            com.google.android.gms.internal.measurement.h0 r4 = r6.mo11673E()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6987c(r8, r4)
        L_0x00a5:
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6988d(r4, r7)
            goto L_0x0175
        L_0x00ab:
            boolean r8 = r13.mo11442W()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.mo11672D()
            if (r8 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13099J()
            com.google.android.gms.measurement.internal.aa r7 = r10.f4144h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r8 = r13.mo11437P()
            java.lang.String r7 = r7.mo12997z(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d2:
            double r8 = r13.mo11443X()
            com.google.android.gms.internal.measurement.h0 r4 = r6.mo11673E()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6986b(r8, r4)
            goto L_0x00a5
        L_0x00df:
            boolean r8 = r13.mo11438R()
            if (r8 == 0) goto L_0x0159
            boolean r8 = r6.mo11670A()
            if (r8 != 0) goto L_0x0145
            boolean r8 = r6.mo11672D()
            if (r8 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13099J()
            com.google.android.gms.measurement.internal.aa r7 = r10.f4144h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r8 = r13.mo11437P()
            java.lang.String r7 = r7.mo12997z(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x010c:
            java.lang.String r8 = r13.mo11439T()
            boolean r8 = com.google.android.gms.measurement.internal.C2290p9.m7348S(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = r13.mo11439T()
            com.google.android.gms.internal.measurement.h0 r6 = r6.mo11673E()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6989e(r4, r6)
            goto L_0x00a5
        L_0x0123:
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13099J()
            com.google.android.gms.measurement.internal.aa r7 = r10.f4144h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r8 = r13.mo11437P()
            java.lang.String r7 = r7.mo12997z(r8)
            java.lang.String r8 = r13.mo11439T()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo13132c(r9, r7, r8)
            goto L_0x0175
        L_0x0145:
            java.lang.String r4 = r13.mo11439T()
            com.google.android.gms.internal.measurement.j0 r6 = r6.mo11671B()
            com.google.android.gms.measurement.internal.aa r8 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r8 = r8.mo12427b()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6991g(r4, r6, r8)
            goto L_0x00a5
        L_0x0159:
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13099J()
            com.google.android.gms.measurement.internal.aa r7 = r10.f4144h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r8 = r13.mo11437P()
            java.lang.String r7 = r7.mo12997z(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0175:
            com.google.android.gms.measurement.internal.aa r6 = r10.f4144h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            if (r4 != 0) goto L_0x0184
            java.lang.String r7 = "null"
            goto L_0x0185
        L_0x0184:
            r7 = r4
        L_0x0185:
            java.lang.String r8 = "Property filter result"
            r6.mo13131b(r8, r7)
            if (r4 != 0) goto L_0x018d
            return r1
        L_0x018d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f4073c = r1
            if (r5 == 0) goto L_0x019a
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x019a
            return r2
        L_0x019a:
            if (r14 == 0) goto L_0x01a4
            com.google.android.gms.internal.measurement.i0 r14 = r10.f4143g
            boolean r14 = r14.mo11729F()
            if (r14 == 0) goto L_0x01a6
        L_0x01a4:
            r10.f4074d = r4
        L_0x01a6:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01eb
            if (r3 == 0) goto L_0x01eb
            boolean r14 = r13.mo11435G()
            if (r14 == 0) goto L_0x01eb
            long r13 = r13.mo11436H()
            if (r11 == 0) goto L_0x01be
            long r13 = r11.longValue()
        L_0x01be:
            if (r0 == 0) goto L_0x01d6
            com.google.android.gms.internal.measurement.i0 r11 = r10.f4143g
            boolean r11 = r11.mo11729F()
            if (r11 == 0) goto L_0x01d6
            com.google.android.gms.internal.measurement.i0 r11 = r10.f4143g
            boolean r11 = r11.mo11730G()
            if (r11 != 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            long r13 = r12.longValue()
        L_0x01d6:
            com.google.android.gms.internal.measurement.i0 r11 = r10.f4143g
            boolean r11 = r11.mo11730G()
            if (r11 == 0) goto L_0x01e5
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f4076f = r11
            goto L_0x01eb
        L_0x01e5:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f4075e = r11
        L_0x01eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2188ga.mo12687k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.b1, boolean):boolean");
    }
}
