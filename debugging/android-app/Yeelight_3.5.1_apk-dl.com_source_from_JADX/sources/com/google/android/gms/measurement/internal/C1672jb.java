package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1372x2;

/* renamed from: com.google.android.gms.measurement.internal.jb */
final class C1672jb extends C1685kb {

    /* renamed from: g */
    private final C1372x2 f2211g;

    /* renamed from: h */
    final /* synthetic */ C1556b f2212h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1672jb(C1556b bVar, String str, int i, C1372x2 x2Var) {
        super(str, i);
        this.f2212h = bVar;
        this.f2211g = x2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14292a() {
        return this.f2211g.mo13481y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14293b() {
        return this.f2211g.mo13477L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14294c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (r2.booleanValue() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0152, code lost:
        r2.mo14694b(r7, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d4  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14295k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C1122h4 r18, long r19, com.google.android.gms.measurement.internal.C1759r r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C1162jc.m2121b()
            com.google.android.gms.measurement.internal.b r1 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14402z()
            java.lang.String r2 = r0.f2243a
            com.google.android.gms.measurement.internal.n3 r3 = com.google.android.gms.measurement.internal.C1727o3.f2427Y
            boolean r1 = r1.mo14163B(r2, r3)
            com.google.android.gms.internal.measurement.x2 r2 = r0.f2211g
            boolean r2 = r2.mo13476K()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f2550e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.b r4 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            java.lang.String r4 = r4.mo14031C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.b r4 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14039v()
            int r6 = r0.f2244b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.x2 r7 = r0.f2211g
            boolean r7 = r7.mo13478M()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.x2 r7 = r0.f2211g
            int r7 = r7.mo13481y()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.b r8 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r8 = r8.f2143a
            com.google.android.gms.measurement.internal.w3 r8 = r8.mo14373D()
            com.google.android.gms.internal.measurement.x2 r9 = r0.f2211g
            java.lang.String r9 = r9.mo13472E()
            java.lang.String r8 = r8.mo14617d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo14696d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.b r4 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14039v()
            com.google.android.gms.measurement.internal.b r6 = r0.f2212h
            com.google.android.gms.measurement.internal.ra r6 = r6.f2045b
            com.google.android.gms.measurement.internal.ta r6 = r6.mo14475f0()
            com.google.android.gms.internal.measurement.x2 r7 = r0.f2211g
            java.lang.String r6 = r6.mo14580E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo14694b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.x2 r4 = r0.f2211g
            boolean r4 = r4.mo13478M()
            r6 = 0
            if (r4 == 0) goto L_0x0418
            com.google.android.gms.internal.measurement.x2 r4 = r0.f2211g
            int r4 = r4.mo13481y()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x0418
        L_0x00a8:
            com.google.android.gms.internal.measurement.x2 r4 = r0.f2211g
            boolean r4 = r4.mo13474I()
            com.google.android.gms.internal.measurement.x2 r7 = r0.f2211g
            boolean r7 = r7.mo13475J()
            com.google.android.gms.internal.measurement.x2 r8 = r0.f2211g
            boolean r8 = r8.mo13476K()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.b r1 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            int r2 = r0.f2244b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.x2 r3 = r0.f2211g
            boolean r3 = r3.mo13478M()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.x2 r3 = r0.f2211g
            int r3 = r3.mo13481y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo14695c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.x2 r7 = r0.f2211g
            java.lang.String r8 = r18.mo12854F()
            boolean r10 = r7.mo13477L()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.e3 r10 = r7.mo13471D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C1685kb.m4409h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03ba
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
        L_0x0111:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03ba
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo13473F()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.z2 r10 = (com.google.android.gms.internal.measurement.C1402z2) r10
            java.lang.String r11 = r10.mo13514C()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
        L_0x0152:
            r2.mo14694b(r7, r3)
            goto L_0x03ba
        L_0x0157:
            java.lang.String r10 = r10.mo13514C()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.List r10 = r18.mo12855G()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01f7
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1186l4) r11
            java.lang.String r12 = r11.mo12953E()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo12958T()
            if (r12 == 0) goto L_0x019d
            java.lang.String r12 = r11.mo12953E()
            boolean r13 = r11.mo12958T()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo12952A()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01c4
        L_0x019b:
            r11 = r5
            goto L_0x01c4
        L_0x019d:
            boolean r12 = r11.mo12956R()
            if (r12 == 0) goto L_0x01b6
            java.lang.String r12 = r11.mo12953E()
            boolean r13 = r11.mo12956R()
            if (r13 == 0) goto L_0x019b
            double r13 = r11.mo12961x()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01c4
        L_0x01b6:
            boolean r12 = r11.mo12960V()
            if (r12 == 0) goto L_0x01c8
            java.lang.String r12 = r11.mo12953E()
            java.lang.String r11 = r11.mo12954F()
        L_0x01c4:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01c8:
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r8 = r11.mo12953E()
            java.lang.String r7 = r7.mo14618e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
        L_0x01f2:
            r2.mo14695c(r8, r3, r7)
            goto L_0x03ba
        L_0x01f7:
            java.util.List r2 = r7.mo13473F()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ff:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03b8
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.z2 r7 = (com.google.android.gms.internal.measurement.C1402z2) r7
            boolean r10 = r7.mo13516F()
            if (r10 == 0) goto L_0x0219
            boolean r10 = r7.mo13515E()
            if (r10 == 0) goto L_0x0219
            r10 = 1
            goto L_0x021a
        L_0x0219:
            r10 = 0
        L_0x021a:
            java.lang.String r11 = r7.mo13514C()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0240
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            goto L_0x0152
        L_0x0240:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0290
            boolean r13 = r7.mo13517G()
            if (r13 != 0) goto L_0x0276
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r7 = r7.mo14618e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            goto L_0x01f2
        L_0x0276:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.e3 r7 = r7.mo13520z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C1685kb.m4409h(r11, r7)
            if (r7 != 0) goto L_0x0288
            goto L_0x03ba
        L_0x0288:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x0290:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02dc
            boolean r13 = r7.mo13517G()
            if (r13 != 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r7 = r7.mo14618e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            goto L_0x01f2
        L_0x02c2:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.e3 r7 = r7.mo13520z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C1685kb.m4408g(r11, r7)
            if (r7 != 0) goto L_0x02d4
            goto L_0x03ba
        L_0x02d4:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x02dc:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x036b
            boolean r13 = r7.mo13519I()
            if (r13 == 0) goto L_0x02f9
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.l3 r7 = r7.mo13513A()
            com.google.android.gms.measurement.internal.b r11 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r11 = r11.f2143a
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo14228b()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C1685kb.m4407f(r12, r7, r11)
            goto L_0x030f
        L_0x02f9:
            boolean r13 = r7.mo13517G()
            if (r13 == 0) goto L_0x0343
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C1794ta.m4745N(r12)
            if (r13 == 0) goto L_0x031b
            com.google.android.gms.internal.measurement.e3 r7 = r7.mo13520z()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C1685kb.m4410i(r12, r7)
        L_0x030f:
            if (r7 != 0) goto L_0x0313
            goto L_0x03ba
        L_0x0313:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x031b:
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r7 = r7.mo14618e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            goto L_0x01f2
        L_0x0343:
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r7 = r7.mo14618e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            goto L_0x01f2
        L_0x036b:
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            if (r12 != 0) goto L_0x0398
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r5 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()
            java.lang.String r5 = r5.mo14618e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo14695c(r7, r3, r5)
            goto L_0x0111
        L_0x0398:
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()
            com.google.android.gms.measurement.internal.b r3 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo14373D()
            java.lang.String r3 = r3.mo14617d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo14373D()
            java.lang.String r7 = r7.mo14618e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            goto L_0x01f2
        L_0x03b8:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03ba:
            com.google.android.gms.measurement.internal.b r2 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()
            if (r5 != 0) goto L_0x03cb
            java.lang.String r3 = "null"
            goto L_0x03cc
        L_0x03cb:
            r3 = r5
        L_0x03cc:
            java.lang.String r7 = "Event filter result"
            r2.mo14694b(r7, r3)
            if (r5 != 0) goto L_0x03d4
            return r6
        L_0x03d4:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f2245c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x03df
            return r9
        L_0x03df:
            r0.f2246d = r2
            if (r4 == 0) goto L_0x0417
            boolean r2 = r18.mo12858R()
            if (r2 == 0) goto L_0x0417
            long r2 = r18.mo12852A()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.x2 r3 = r0.f2211g
            boolean r3 = r3.mo13475J()
            if (r3 == 0) goto L_0x0409
            if (r1 == 0) goto L_0x0406
            com.google.android.gms.internal.measurement.x2 r1 = r0.f2211g
            boolean r1 = r1.mo13477L()
            if (r1 != 0) goto L_0x0404
            goto L_0x0406
        L_0x0404:
            r2 = r16
        L_0x0406:
            r0.f2248f = r2
            goto L_0x0417
        L_0x0409:
            if (r1 == 0) goto L_0x0415
            com.google.android.gms.internal.measurement.x2 r1 = r0.f2211g
            boolean r1 = r1.mo13477L()
            if (r1 == 0) goto L_0x0415
            r2 = r17
        L_0x0415:
            r0.f2247e = r2
        L_0x0417:
            return r9
        L_0x0418:
            com.google.android.gms.measurement.internal.b r1 = r0.f2212h
            com.google.android.gms.measurement.internal.n5 r1 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14040w()
            java.lang.String r2 = r0.f2243a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r2)
            com.google.android.gms.internal.measurement.x2 r3 = r0.f2211g
            boolean r3 = r3.mo13478M()
            if (r3 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.x2 r3 = r0.f2211g
            int r3 = r3.mo13481y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x043c:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo14695c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1672jb.mo14295k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.h4, long, com.google.android.gms.measurement.internal.r, boolean):boolean");
    }
}
