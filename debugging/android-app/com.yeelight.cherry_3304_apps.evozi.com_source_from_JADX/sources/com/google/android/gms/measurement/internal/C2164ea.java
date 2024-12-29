package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1775f0;

/* renamed from: com.google.android.gms.measurement.internal.ea */
final class C2164ea extends C2152da {

    /* renamed from: g */
    private C1775f0 f4099g;

    /* renamed from: h */
    private final /* synthetic */ C2116aa f4100h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2164ea(C2116aa aaVar, String str, int i, C1775f0 f0Var) {
        super(str, i);
        this.f4100h = aaVar;
        this.f4099g = f0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12646a() {
        return this.f4099g.mo11620F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo12647i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo12648j() {
        return this.f4099g.mo11624K();
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r4.booleanValue() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r7 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        r4.mo13131b(r8, r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0394 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0395  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12658k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C1994t0 r18, long r19, com.google.android.gms.measurement.internal.C2247m r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.C1847j9.m5293a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.aa r1 = r0.f4100h
            com.google.android.gms.measurement.internal.b r1 = r1.mo13112m()
            java.lang.String r4 = r0.f4071a
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2302r.f4516h0
            boolean r1 = r1.mo12480y(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            com.google.android.gms.internal.measurement.f0 r4 = r0.f4099g
            boolean r4 = r4.mo11629Q()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f4347e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.aa r6 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            r7 = 2
            boolean r6 = r6.mo13095B(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.aa r6 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            int r8 = r0.f4072b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.f0 r9 = r0.f4099g
            boolean r9 = r9.mo11619E()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.f0 r9 = r0.f4099g
            int r9 = r9.mo11620F()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.aa r10 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r10 = r10.mo13109j()
            com.google.android.gms.internal.measurement.f0 r11 = r0.f4099g
            java.lang.String r11 = r11.mo11621G()
            java.lang.String r10 = r10.mo12995v(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.mo13133d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.aa r6 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.p9 r8 = r8.mo12778n()
            com.google.android.gms.internal.measurement.f0 r9 = r0.f4099g
            java.lang.String r8 = r8.mo12896z(r9)
            java.lang.String r9 = "Filter definition"
            r6.mo13131b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.f0 r6 = r0.f4099g
            boolean r6 = r6.mo11619E()
            if (r6 == 0) goto L_0x03da
            com.google.android.gms.internal.measurement.f0 r6 = r0.f4099g
            int r6 = r6.mo11620F()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03da
        L_0x00a1:
            com.google.android.gms.internal.measurement.f0 r6 = r0.f4099g
            boolean r6 = r6.mo11626N()
            com.google.android.gms.internal.measurement.f0 r8 = r0.f4099g
            boolean r8 = r8.mo11627O()
            com.google.android.gms.internal.measurement.f0 r9 = r0.f4099g
            boolean r9 = r9.mo11629Q()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.aa r1 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            int r2 = r0.f4072b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.f0 r4 = r0.f4099g
            boolean r4 = r4.mo11619E()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.f0 r4 = r0.f4099g
            int r4 = r4.mo11620F()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo13132c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.f0 r8 = r0.f4099g
            java.lang.String r9 = r18.mo12065U()
            boolean r10 = r8.mo11624K()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.h0 r10 = r8.mo11625L()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2152da.m6987c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x037d
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
        L_0x0107:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x037d
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.mo11622H()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.g0 r10 = (com.google.android.gms.internal.measurement.C1790g0) r10
            java.lang.String r11 = r10.mo11677J()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
        L_0x0144:
            r4.mo13131b(r8, r5)
            goto L_0x037d
        L_0x0149:
            java.lang.String r10 = r10.mo11677J()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.util.List r10 = r18.mo12073z()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01e3
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.v0 r11 = (com.google.android.gms.internal.measurement.C2024v0) r11
            java.lang.String r12 = r11.mo12104L()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.mo12107W()
            if (r12 == 0) goto L_0x018f
            java.lang.String r12 = r11.mo12104L()
            boolean r13 = r11.mo12107W()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.mo12108X()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01b6
        L_0x018d:
            r11 = r7
            goto L_0x01b6
        L_0x018f:
            boolean r12 = r11.mo12109Y()
            if (r12 == 0) goto L_0x01a8
            java.lang.String r12 = r11.mo12104L()
            boolean r13 = r11.mo12109Y()
            if (r13 == 0) goto L_0x018d
            double r13 = r11.mo12110Z()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01b6
        L_0x01a8:
            boolean r12 = r11.mo12105R()
            if (r12 == 0) goto L_0x01ba
            java.lang.String r12 = r11.mo12104L()
            java.lang.String r11 = r11.mo12106T()
        L_0x01b6:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01ba:
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r9 = r11.mo12104L()
            java.lang.String r8 = r8.mo12996y(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
        L_0x01de:
            r4.mo13132c(r9, r5, r8)
            goto L_0x037d
        L_0x01e3:
            java.util.List r4 = r8.mo11622H()
            java.util.Iterator r4 = r4.iterator()
        L_0x01eb:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x037b
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.g0 r8 = (com.google.android.gms.internal.measurement.C1790g0) r8
            boolean r10 = r8.mo11674F()
            if (r10 == 0) goto L_0x0205
            boolean r10 = r8.mo11675G()
            if (r10 == 0) goto L_0x0205
            r10 = 1
            goto L_0x0206
        L_0x0205:
            r10 = 0
        L_0x0206:
            java.lang.String r11 = r8.mo11677J()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0228
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            java.lang.String r8 = "Event has empty param name. event"
            goto L_0x0144
        L_0x0228:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0271
            boolean r13 = r8.mo11672D()
            if (r13 != 0) goto L_0x0257
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r8 = r8.mo12996y(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            goto L_0x01de
        L_0x0257:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.h0 r8 = r8.mo11673E()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C2152da.m6987c(r11, r8)
            if (r8 != 0) goto L_0x0269
            goto L_0x037d
        L_0x0269:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x0271:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02b7
            boolean r13 = r8.mo11672D()
            if (r13 != 0) goto L_0x029d
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r8 = r8.mo12996y(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            goto L_0x01de
        L_0x029d:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.h0 r8 = r8.mo11673E()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C2152da.m6986b(r11, r8)
            if (r8 != 0) goto L_0x02af
            goto L_0x037d
        L_0x02af:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02b7:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0338
            boolean r13 = r8.mo11670A()
            if (r13 == 0) goto L_0x02d2
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.j0 r8 = r8.mo11671B()
            com.google.android.gms.measurement.internal.aa r11 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r11 = r11.mo12427b()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C2152da.m6991g(r12, r8, r11)
            goto L_0x02e8
        L_0x02d2:
            boolean r13 = r8.mo11672D()
            if (r13 == 0) goto L_0x0316
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C2290p9.m7348S(r12)
            if (r13 == 0) goto L_0x02f4
            com.google.android.gms.internal.measurement.h0 r8 = r8.mo11673E()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C2152da.m6989e(r12, r8)
        L_0x02e8:
            if (r8 != 0) goto L_0x02ec
            goto L_0x037d
        L_0x02ec:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02f4:
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r8 = r8.mo12996y(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            goto L_0x01de
        L_0x0316:
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r8 = r8.mo12996y(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            goto L_0x01de
        L_0x0338:
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            if (r12 != 0) goto L_0x035f
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13104O()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r7 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo13109j()
            java.lang.String r7 = r7.mo12996y(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.mo13132c(r8, r5, r7)
            goto L_0x0107
        L_0x035f:
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()
            com.google.android.gms.measurement.internal.aa r5 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo13109j()
            java.lang.String r5 = r5.mo12995v(r9)
            com.google.android.gms.measurement.internal.aa r8 = r0.f4100h
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo13109j()
            java.lang.String r8 = r8.mo12996y(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            goto L_0x01de
        L_0x037b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x037d:
            com.google.android.gms.measurement.internal.aa r4 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13104O()
            if (r7 != 0) goto L_0x038c
            java.lang.String r5 = "null"
            goto L_0x038d
        L_0x038c:
            r5 = r7
        L_0x038d:
            java.lang.String r8 = "Event filter result"
            r4.mo13131b(r8, r5)
            if (r7 != 0) goto L_0x0395
            return r2
        L_0x0395:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f4073c = r2
            boolean r2 = r7.booleanValue()
            if (r2 != 0) goto L_0x03a0
            return r3
        L_0x03a0:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f4074d = r2
            if (r6 == 0) goto L_0x03d9
            boolean r2 = r18.mo12066V()
            if (r2 == 0) goto L_0x03d9
            long r4 = r18.mo12067W()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.f0 r4 = r0.f4099g
            boolean r4 = r4.mo11627O()
            if (r4 == 0) goto L_0x03cb
            if (r1 == 0) goto L_0x03c8
            com.google.android.gms.internal.measurement.f0 r1 = r0.f4099g
            boolean r1 = r1.mo11624K()
            if (r1 == 0) goto L_0x03c8
            r2 = r16
        L_0x03c8:
            r0.f4076f = r2
            goto L_0x03d9
        L_0x03cb:
            if (r1 == 0) goto L_0x03d7
            com.google.android.gms.internal.measurement.f0 r1 = r0.f4099g
            boolean r1 = r1.mo11624K()
            if (r1 == 0) goto L_0x03d7
            r2 = r17
        L_0x03d7:
            r0.f4075e = r2
        L_0x03d9:
            return r3
        L_0x03da:
            com.google.android.gms.measurement.internal.aa r1 = r0.f4100h
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13099J()
            java.lang.String r4 = r0.f4071a
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r4)
            com.google.android.gms.internal.measurement.f0 r5 = r0.f4099g
            boolean r5 = r5.mo11619E()
            if (r5 == 0) goto L_0x03fc
            com.google.android.gms.internal.measurement.f0 r5 = r0.f4099g
            int r5 = r5.mo11620F()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
        L_0x03fc:
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r6 = "Invalid event filter ID. appId, id"
            r1.mo13132c(r6, r4, r5)
            com.google.android.gms.measurement.internal.aa r1 = r0.f4100h
            com.google.android.gms.measurement.internal.b r1 = r1.mo13112m()
            java.lang.String r4 = r0.f4071a
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2302r.f4510e0
            boolean r1 = r1.mo12480y(r4, r5)
            if (r1 == 0) goto L_0x0416
            return r2
        L_0x0416:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2164ea.mo12658k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.t0, long, com.google.android.gms.measurement.internal.m, boolean):boolean");
    }
}
