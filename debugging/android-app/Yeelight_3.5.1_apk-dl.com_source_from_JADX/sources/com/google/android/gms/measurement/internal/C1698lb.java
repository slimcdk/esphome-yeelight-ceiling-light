package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1105g3;

/* renamed from: com.google.android.gms.measurement.internal.lb */
final class C1698lb extends C1685kb {

    /* renamed from: g */
    private final C1105g3 f2292g;

    /* renamed from: h */
    final /* synthetic */ C1556b f2293h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1698lb(C1556b bVar, String str, int i, C1105g3 g3Var) {
        super(str, i);
        this.f2293h = bVar;
        this.f2292g = g3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14292a() {
        return this.f2292g.mo12807x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14293b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14294c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14358k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C1027b5 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C1162jc.m2121b()
            com.google.android.gms.measurement.internal.b r0 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()
            java.lang.String r1 = r10.f2243a
            com.google.android.gms.measurement.internal.n3 r2 = com.google.android.gms.measurement.internal.C1727o3.f2425W
            boolean r0 = r0.mo14163B(r1, r2)
            com.google.android.gms.internal.measurement.g3 r1 = r10.f2292g
            boolean r1 = r1.mo12802E()
            com.google.android.gms.internal.measurement.g3 r2 = r10.f2292g
            boolean r2 = r2.mo12803F()
            com.google.android.gms.internal.measurement.g3 r3 = r10.f2292g
            boolean r3 = r3.mo12804G()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.b r11 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r11 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo14228b()
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo14039v()
            int r12 = r10.f2244b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.g3 r13 = r10.f2292g
            boolean r13 = r13.mo12805H()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.g3 r13 = r10.f2292g
            int r13 = r13.mo12807x()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo14695c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.g3 r6 = r10.f2292g
            com.google.android.gms.internal.measurement.z2 r6 = r6.mo12808y()
            boolean r7 = r6.mo13515E()
            boolean r8 = r13.mo12573O()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo13517G()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14040w()
            com.google.android.gms.measurement.internal.b r7 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r13.mo12570D()
            java.lang.String r7 = r7.mo14619f(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo14694b(r8, r7)
            goto L_0x0188
        L_0x0099:
            long r8 = r13.mo12577y()
            com.google.android.gms.internal.measurement.e3 r2 = r6.mo13520z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4409h(r8, r2)
        L_0x00a5:
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4411j(r2, r7)
            goto L_0x0188
        L_0x00ab:
            boolean r8 = r13.mo12572N()
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r6.mo13517G()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14040w()
            com.google.android.gms.measurement.internal.b r7 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r13.mo12570D()
            java.lang.String r7 = r7.mo14619f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d6:
            double r8 = r13.mo12576x()
            com.google.android.gms.internal.measurement.e3 r2 = r6.mo13520z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4408g(r8, r2)
            goto L_0x00a5
        L_0x00e3:
            boolean r8 = r13.mo12575Q()
            if (r8 == 0) goto L_0x0168
            boolean r8 = r6.mo13519I()
            if (r8 != 0) goto L_0x0152
            boolean r8 = r6.mo13517G()
            if (r8 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14040w()
            com.google.android.gms.measurement.internal.b r7 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r13.mo12570D()
            java.lang.String r7 = r7.mo14619f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x0114:
            java.lang.String r8 = r13.mo12571E()
            boolean r8 = com.google.android.gms.measurement.internal.C1794ta.m4745N(r8)
            if (r8 == 0) goto L_0x012c
            java.lang.String r2 = r13.mo12571E()
            com.google.android.gms.internal.measurement.e3 r6 = r6.mo13520z()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4410i(r2, r6)
            goto L_0x00a5
        L_0x012c:
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14040w()
            com.google.android.gms.measurement.internal.b r7 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r13.mo12570D()
            java.lang.String r7 = r7.mo14619f(r8)
            java.lang.String r8 = r13.mo12571E()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo14695c(r9, r7, r8)
            goto L_0x0188
        L_0x0152:
            java.lang.String r2 = r13.mo12571E()
            com.google.android.gms.internal.measurement.l3 r6 = r6.mo13513A()
            com.google.android.gms.measurement.internal.b r8 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r8 = r8.f2143a
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo14228b()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4407f(r2, r6, r8)
            goto L_0x00a5
        L_0x0168:
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14040w()
            com.google.android.gms.measurement.internal.b r7 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r13.mo12570D()
            java.lang.String r7 = r7.mo14619f(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0188:
            com.google.android.gms.measurement.internal.b r6 = r10.f2293h
            com.google.android.gms.measurement.internal.n5 r6 = r6.f2143a
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14039v()
            if (r2 != 0) goto L_0x0199
            java.lang.String r7 = "null"
            goto L_0x019a
        L_0x0199:
            r7 = r2
        L_0x019a:
            java.lang.String r8 = "Property filter result"
            r6.mo14694b(r8, r7)
            if (r2 != 0) goto L_0x01a2
            return r4
        L_0x01a2:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f2245c = r4
            if (r3 == 0) goto L_0x01b0
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            return r5
        L_0x01b0:
            if (r14 == 0) goto L_0x01ba
            com.google.android.gms.internal.measurement.g3 r14 = r10.f2292g
            boolean r14 = r14.mo12802E()
            if (r14 == 0) goto L_0x01bc
        L_0x01ba:
            r10.f2246d = r2
        L_0x01bc:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0201
            if (r1 == 0) goto L_0x0201
            boolean r14 = r13.mo12574P()
            if (r14 == 0) goto L_0x0201
            long r13 = r13.mo12578z()
            if (r11 == 0) goto L_0x01d4
            long r13 = r11.longValue()
        L_0x01d4:
            if (r0 == 0) goto L_0x01ec
            com.google.android.gms.internal.measurement.g3 r11 = r10.f2292g
            boolean r11 = r11.mo12802E()
            if (r11 == 0) goto L_0x01ec
            com.google.android.gms.internal.measurement.g3 r11 = r10.f2292g
            boolean r11 = r11.mo12803F()
            if (r11 != 0) goto L_0x01ec
            if (r12 == 0) goto L_0x01ec
            long r13 = r12.longValue()
        L_0x01ec:
            com.google.android.gms.internal.measurement.g3 r11 = r10.f2292g
            boolean r11 = r11.mo12803F()
            if (r11 == 0) goto L_0x01fb
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f2248f = r11
            goto L_0x0201
        L_0x01fb:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f2247e = r11
        L_0x0201:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1698lb.mo14358k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.b5, boolean):boolean");
    }
}
