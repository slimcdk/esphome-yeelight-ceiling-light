package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.ic */
public class C4756ic implements C4777ix<C4756ic, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9362a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9363a = new C4799jn("XmPushActionAckMessage");

    /* renamed from: b */
    private static final C4791jf f9364b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9365c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9366d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9367e = new C4791jf("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4791jf f9368f = new C4791jf("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4791jf f9369g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9370h = new C4791jf("", (byte) 12, 8);

    /* renamed from: i */
    private static final C4791jf f9371i = new C4791jf("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4791jf f9372j = new C4791jf("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4791jf f9373k = new C4791jf("", (byte) 2, 11);

    /* renamed from: l */
    private static final C4791jf f9374l = new C4791jf("", (byte) 11, 12);

    /* renamed from: m */
    private static final C4791jf f9375m = new C4791jf("", (byte) 11, 13);

    /* renamed from: n */
    private static final C4791jf f9376n = new C4791jf("", (byte) 11, 14);

    /* renamed from: o */
    private static final C4791jf f9377o = new C4791jf("", (byte) 6, 15);

    /* renamed from: p */
    private static final C4791jf f9378p = new C4791jf("", (byte) 6, 16);

    /* renamed from: q */
    private static final C4791jf f9379q = new C4791jf("", (byte) 11, 20);

    /* renamed from: r */
    private static final C4791jf f9380r = new C4791jf("", (byte) 11, 21);

    /* renamed from: s */
    private static final C4791jf f9381s = new C4791jf("", (byte) 8, 22);

    /* renamed from: t */
    private static final C4791jf f9382t = new C4791jf("", ParameterInitDefType.IntVec3Init, 23);

    /* renamed from: a */
    public int f9383a;

    /* renamed from: a */
    public long f9384a;

    /* renamed from: a */
    public C4755ib f9385a;

    /* renamed from: a */
    public C4769ip f9386a;

    /* renamed from: a */
    public String f9387a;

    /* renamed from: a */
    private BitSet f9388a = new BitSet(5);

    /* renamed from: a */
    public Map<String, String> f9389a;

    /* renamed from: a */
    public short f9390a;

    /* renamed from: a */
    public boolean f9391a = false;

    /* renamed from: b */
    public String f9392b;

    /* renamed from: b */
    public short f9393b;

    /* renamed from: c */
    public String f9394c;

    /* renamed from: d */
    public String f9395d;

    /* renamed from: e */
    public String f9396e;

    /* renamed from: f */
    public String f9397f;

    /* renamed from: g */
    public String f9398g;

    /* renamed from: h */
    public String f9399h;

    /* renamed from: i */
    public String f9400i;

    /* renamed from: j */
    public String f9401j;

    /* renamed from: k */
    public String f9402k;

    /* renamed from: l */
    public String f9403l;

    /* renamed from: a */
    public int compareTo(C4756ic icVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a20;
        if (!C4756ic.class.equals(icVar.getClass())) {
            return C4756ic.class.getName().compareTo(icVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25413a()).compareTo(Boolean.valueOf(icVar.mo25413a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25413a() && (a20 = C4778iy.m15232a(this.f9387a, icVar.f9387a)) != 0) {
            return a20;
        }
        int compareTo2 = Boolean.valueOf(mo25417b()).compareTo(Boolean.valueOf(icVar.mo25417b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25417b() && (a19 = C4778iy.m15231a((Comparable) this.f9385a, (Comparable) icVar.f9385a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(mo25420c()).compareTo(Boolean.valueOf(icVar.mo25420c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25420c() && (a18 = C4778iy.m15232a(this.f9392b, icVar.f9392b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(mo25424d()).compareTo(Boolean.valueOf(icVar.mo25424d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25424d() && (a17 = C4778iy.m15232a(this.f9394c, icVar.f9394c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(mo25426e()).compareTo(Boolean.valueOf(icVar.mo25426e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25426e() && (a16 = C4778iy.m15230a(this.f9384a, icVar.f9384a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(mo25428f()).compareTo(Boolean.valueOf(icVar.mo25428f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25428f() && (a15 = C4778iy.m15232a(this.f9395d, icVar.f9395d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(mo25429g()).compareTo(Boolean.valueOf(icVar.mo25429g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25429g() && (a14 = C4778iy.m15232a(this.f9396e, icVar.f9396e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(mo25430h()).compareTo(Boolean.valueOf(icVar.mo25430h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25430h() && (a13 = C4778iy.m15231a((Comparable) this.f9386a, (Comparable) icVar.f9386a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(mo25432i()).compareTo(Boolean.valueOf(icVar.mo25432i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25432i() && (a12 = C4778iy.m15232a(this.f9397f, icVar.f9397f)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(mo25433j()).compareTo(Boolean.valueOf(icVar.mo25433j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo25433j() && (a11 = C4778iy.m15232a(this.f9398g, icVar.f9398g)) != 0) {
            return a11;
        }
        int compareTo11 = Boolean.valueOf(mo25434k()).compareTo(Boolean.valueOf(icVar.mo25434k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo25434k() && (a10 = C4778iy.m15238a(this.f9391a, icVar.f9391a)) != 0) {
            return a10;
        }
        int compareTo12 = Boolean.valueOf(mo25435l()).compareTo(Boolean.valueOf(icVar.mo25435l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo25435l() && (a9 = C4778iy.m15232a(this.f9399h, icVar.f9399h)) != 0) {
            return a9;
        }
        int compareTo13 = Boolean.valueOf(mo25436m()).compareTo(Boolean.valueOf(icVar.mo25436m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo25436m() && (a8 = C4778iy.m15232a(this.f9400i, icVar.f9400i)) != 0) {
            return a8;
        }
        int compareTo14 = Boolean.valueOf(mo25437n()).compareTo(Boolean.valueOf(icVar.mo25437n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo25437n() && (a7 = C4778iy.m15232a(this.f9401j, icVar.f9401j)) != 0) {
            return a7;
        }
        int compareTo15 = Boolean.valueOf(mo25438o()).compareTo(Boolean.valueOf(icVar.mo25438o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (mo25438o() && (a6 = C4778iy.m15237a(this.f9390a, icVar.f9390a)) != 0) {
            return a6;
        }
        int compareTo16 = Boolean.valueOf(mo25439p()).compareTo(Boolean.valueOf(icVar.mo25439p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (mo25439p() && (a5 = C4778iy.m15237a(this.f9393b, icVar.f9393b)) != 0) {
            return a5;
        }
        int compareTo17 = Boolean.valueOf(mo25440q()).compareTo(Boolean.valueOf(icVar.mo25440q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (mo25440q() && (a4 = C4778iy.m15232a(this.f9402k, icVar.f9402k)) != 0) {
            return a4;
        }
        int compareTo18 = Boolean.valueOf(mo25441r()).compareTo(Boolean.valueOf(icVar.mo25441r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (mo25441r() && (a3 = C4778iy.m15232a(this.f9403l, icVar.f9403l)) != 0) {
            return a3;
        }
        int compareTo19 = Boolean.valueOf(mo25442s()).compareTo(Boolean.valueOf(icVar.mo25442s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (mo25442s() && (a2 = C4778iy.m15229a(this.f9383a, icVar.f9383a)) != 0) {
            return a2;
        }
        int compareTo20 = Boolean.valueOf(mo25443t()).compareTo(Boolean.valueOf(icVar.mo25443t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!mo25443t() || (a = C4778iy.m15235a((Map) this.f9389a, (Map) icVar.f9389a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4756ic mo25410a(long j) {
        this.f9384a = j;
        mo25414a(true);
        return this;
    }

    /* renamed from: a */
    public C4756ic mo25411a(String str) {
        this.f9392b = str;
        return this;
    }

    /* renamed from: a */
    public C4756ic mo25412a(short s) {
        this.f9390a = s;
        mo25419c(true);
        return this;
    }

    /* renamed from: a */
    public void mo25413a() {
        if (this.f9392b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9394c == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r8) {
        /*
            r7 = this;
            r8.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r8.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0033
            r8.mo25834f()
            boolean r8 = r7.mo25426e()
            if (r8 == 0) goto L_0x0018
            r7.mo25413a()
            return
        L_0x0018:
            com.xiaomi.push.jj r8 = new com.xiaomi.push.jj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'messageTs' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r7.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0033:
            short r0 = r0.f9822a
            r2 = 6
            r3 = 2
            r4 = 12
            r5 = 1
            r6 = 11
            switch(r0) {
                case 1: goto L_0x0137;
                case 2: goto L_0x012a;
                case 3: goto L_0x0121;
                case 4: goto L_0x0118;
                case 5: goto L_0x010a;
                case 6: goto L_0x0101;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00eb;
                case 9: goto L_0x00e2;
                case 10: goto L_0x00d9;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00ae;
                case 15: goto L_0x00a1;
                case 16: goto L_0x0094;
                case 17: goto L_0x003f;
                case 18: goto L_0x003f;
                case 19: goto L_0x003f;
                case 20: goto L_0x008a;
                case 21: goto L_0x0080;
                case 22: goto L_0x0071;
                case 23: goto L_0x0044;
                default: goto L_0x003f;
            }
        L_0x003f:
            com.xiaomi.push.C4797jl.m15328a(r8, r1)
            goto L_0x013f
        L_0x0044:
            r0 = 13
            if (r1 != r0) goto L_0x003f
            com.xiaomi.push.jh r0 = r8.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f9826a
            int r2 = r2 * 2
            r1.<init>(r2)
            r7.f9389a = r1
            r1 = 0
        L_0x0058:
            int r2 = r0.f9826a
            if (r1 >= r2) goto L_0x006c
            java.lang.String r2 = r8.mo25816a()
            java.lang.String r3 = r8.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f9389a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0058
        L_0x006c:
            r8.mo25836h()
            goto L_0x013f
        L_0x0071:
            r0 = 8
            if (r1 != r0) goto L_0x003f
            int r0 = r8.mo25816a()
            r7.f9383a = r0
            r7.mo25425e(r5)
            goto L_0x013f
        L_0x0080:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9403l = r0
            goto L_0x013f
        L_0x008a:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9402k = r0
            goto L_0x013f
        L_0x0094:
            if (r1 != r2) goto L_0x003f
            short r0 = r8.mo25816a()
            r7.f9393b = r0
            r7.mo25423d((boolean) r5)
            goto L_0x013f
        L_0x00a1:
            if (r1 != r2) goto L_0x003f
            short r0 = r8.mo25816a()
            r7.f9390a = r0
            r7.mo25419c((boolean) r5)
            goto L_0x013f
        L_0x00ae:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9401j = r0
            goto L_0x013f
        L_0x00b8:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9400i = r0
            goto L_0x013f
        L_0x00c2:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9399h = r0
            goto L_0x013f
        L_0x00cc:
            if (r1 != r3) goto L_0x003f
            boolean r0 = r8.mo25816a()
            r7.f9391a = r0
            r7.mo25416b((boolean) r5)
            goto L_0x013f
        L_0x00d9:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9398g = r0
            goto L_0x013f
        L_0x00e2:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9397f = r0
            goto L_0x013f
        L_0x00eb:
            if (r1 != r4) goto L_0x003f
            com.xiaomi.push.ip r0 = new com.xiaomi.push.ip
            r0.<init>()
            r7.f9386a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r8)
            goto L_0x013f
        L_0x00f8:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9396e = r0
            goto L_0x013f
        L_0x0101:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9395d = r0
            goto L_0x013f
        L_0x010a:
            r0 = 10
            if (r1 != r0) goto L_0x003f
            long r0 = r8.mo25816a()
            r7.f9384a = r0
            r7.mo25414a((boolean) r5)
            goto L_0x013f
        L_0x0118:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9394c = r0
            goto L_0x013f
        L_0x0121:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9392b = r0
            goto L_0x013f
        L_0x012a:
            if (r1 != r4) goto L_0x003f
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r7.f9385a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r8)
            goto L_0x013f
        L_0x0137:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo25816a()
            r7.f9387a = r0
        L_0x013f:
            r8.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4756ic.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25414a(boolean z) {
        this.f9388a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14793a() {
        return this.f9387a != null;
    }

    /* renamed from: a */
    public boolean m14794a(C4756ic icVar) {
        if (icVar == null) {
            return false;
        }
        boolean a = mo25413a();
        boolean a2 = icVar.mo25413a();
        if ((a || a2) && (!a || !a2 || !this.f9387a.equals(icVar.f9387a))) {
            return false;
        }
        boolean b = mo25417b();
        boolean b2 = icVar.mo25417b();
        if ((b || b2) && (!b || !b2 || !this.f9385a.compareTo(icVar.f9385a))) {
            return false;
        }
        boolean c = mo25420c();
        boolean c2 = icVar.mo25420c();
        if ((c || c2) && (!c || !c2 || !this.f9392b.equals(icVar.f9392b))) {
            return false;
        }
        boolean d = mo25424d();
        boolean d2 = icVar.mo25424d();
        if (((d || d2) && (!d || !d2 || !this.f9394c.equals(icVar.f9394c))) || this.f9384a != icVar.f9384a) {
            return false;
        }
        boolean f = mo25428f();
        boolean f2 = icVar.mo25428f();
        if ((f || f2) && (!f || !f2 || !this.f9395d.equals(icVar.f9395d))) {
            return false;
        }
        boolean g = mo25429g();
        boolean g2 = icVar.mo25429g();
        if ((g || g2) && (!g || !g2 || !this.f9396e.equals(icVar.f9396e))) {
            return false;
        }
        boolean h = mo25430h();
        boolean h2 = icVar.mo25430h();
        if ((h || h2) && (!h || !h2 || !this.f9386a.compareTo(icVar.f9386a))) {
            return false;
        }
        boolean i = mo25432i();
        boolean i2 = icVar.mo25432i();
        if ((i || i2) && (!i || !i2 || !this.f9397f.equals(icVar.f9397f))) {
            return false;
        }
        boolean j = mo25433j();
        boolean j2 = icVar.mo25433j();
        if ((j || j2) && (!j || !j2 || !this.f9398g.equals(icVar.f9398g))) {
            return false;
        }
        boolean k = mo25434k();
        boolean k2 = icVar.mo25434k();
        if ((k || k2) && (!k || !k2 || this.f9391a != icVar.f9391a)) {
            return false;
        }
        boolean l = mo25435l();
        boolean l2 = icVar.mo25435l();
        if ((l || l2) && (!l || !l2 || !this.f9399h.equals(icVar.f9399h))) {
            return false;
        }
        boolean m = mo25436m();
        boolean m2 = icVar.mo25436m();
        if ((m || m2) && (!m || !m2 || !this.f9400i.equals(icVar.f9400i))) {
            return false;
        }
        boolean n = mo25437n();
        boolean n2 = icVar.mo25437n();
        if ((n || n2) && (!n || !n2 || !this.f9401j.equals(icVar.f9401j))) {
            return false;
        }
        boolean o = mo25438o();
        boolean o2 = icVar.mo25438o();
        if ((o || o2) && (!o || !o2 || this.f9390a != icVar.f9390a)) {
            return false;
        }
        boolean p = mo25439p();
        boolean p2 = icVar.mo25439p();
        if ((p || p2) && (!p || !p2 || this.f9393b != icVar.f9393b)) {
            return false;
        }
        boolean q = mo25440q();
        boolean q2 = icVar.mo25440q();
        if ((q || q2) && (!q || !q2 || !this.f9402k.equals(icVar.f9402k))) {
            return false;
        }
        boolean r = mo25441r();
        boolean r2 = icVar.mo25441r();
        if ((r || r2) && (!r || !r2 || !this.f9403l.equals(icVar.f9403l))) {
            return false;
        }
        boolean s = mo25442s();
        boolean s2 = icVar.mo25442s();
        if ((s || s2) && (!s || !s2 || this.f9383a != icVar.f9383a)) {
            return false;
        }
        boolean t = mo25443t();
        boolean t2 = icVar.mo25443t();
        if (t || t2) {
            return t && t2 && this.f9389a.equals(icVar.f9389a);
        }
        return true;
    }

    /* renamed from: b */
    public C4756ic mo25415b(String str) {
        this.f9394c = str;
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25413a();
        jiVar.mo25823a(f9363a);
        if (this.f9387a != null && mo25413a()) {
            jiVar.mo25820a(f9362a);
            jiVar.mo25824a(this.f9387a);
            jiVar.mo25828b();
        }
        if (this.f9385a != null && mo25417b()) {
            jiVar.mo25820a(f9364b);
            this.f9385a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9392b != null) {
            jiVar.mo25820a(f9365c);
            jiVar.mo25824a(this.f9392b);
            jiVar.mo25828b();
        }
        if (this.f9394c != null) {
            jiVar.mo25820a(f9366d);
            jiVar.mo25824a(this.f9394c);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9367e);
        jiVar.mo25819a(this.f9384a);
        jiVar.mo25828b();
        if (this.f9395d != null && mo25428f()) {
            jiVar.mo25820a(f9368f);
            jiVar.mo25824a(this.f9395d);
            jiVar.mo25828b();
        }
        if (this.f9396e != null && mo25429g()) {
            jiVar.mo25820a(f9369g);
            jiVar.mo25824a(this.f9396e);
            jiVar.mo25828b();
        }
        if (this.f9386a != null && mo25430h()) {
            jiVar.mo25820a(f9370h);
            this.f9386a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9397f != null && mo25432i()) {
            jiVar.mo25820a(f9371i);
            jiVar.mo25824a(this.f9397f);
            jiVar.mo25828b();
        }
        if (this.f9398g != null && mo25433j()) {
            jiVar.mo25820a(f9372j);
            jiVar.mo25824a(this.f9398g);
            jiVar.mo25828b();
        }
        if (mo25434k()) {
            jiVar.mo25820a(f9373k);
            jiVar.mo25827a(this.f9391a);
            jiVar.mo25828b();
        }
        if (this.f9399h != null && mo25435l()) {
            jiVar.mo25820a(f9374l);
            jiVar.mo25824a(this.f9399h);
            jiVar.mo25828b();
        }
        if (this.f9400i != null && mo25436m()) {
            jiVar.mo25820a(f9375m);
            jiVar.mo25824a(this.f9400i);
            jiVar.mo25828b();
        }
        if (this.f9401j != null && mo25437n()) {
            jiVar.mo25820a(f9376n);
            jiVar.mo25824a(this.f9401j);
            jiVar.mo25828b();
        }
        if (mo25438o()) {
            jiVar.mo25820a(f9377o);
            jiVar.mo25826a(this.f9390a);
            jiVar.mo25828b();
        }
        if (mo25439p()) {
            jiVar.mo25820a(f9378p);
            jiVar.mo25826a(this.f9393b);
            jiVar.mo25828b();
        }
        if (this.f9402k != null && mo25440q()) {
            jiVar.mo25820a(f9379q);
            jiVar.mo25824a(this.f9402k);
            jiVar.mo25828b();
        }
        if (this.f9403l != null && mo25441r()) {
            jiVar.mo25820a(f9380r);
            jiVar.mo25824a(this.f9403l);
            jiVar.mo25828b();
        }
        if (mo25442s()) {
            jiVar.mo25820a(f9381s);
            jiVar.mo25817a(this.f9383a);
            jiVar.mo25828b();
        }
        if (this.f9389a != null && mo25443t()) {
            jiVar.mo25820a(f9382t);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9389a.size()));
            for (Map.Entry next : this.f9389a.entrySet()) {
                jiVar.mo25824a((String) next.getKey());
                jiVar.mo25824a((String) next.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25416b(boolean z) {
        this.f9388a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25417b() {
        return this.f9385a != null;
    }

    /* renamed from: c */
    public C4756ic mo25418c(String str) {
        this.f9395d = str;
        return this;
    }

    /* renamed from: c */
    public void mo25419c(boolean z) {
        this.f9388a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo25420c() {
        return this.f9392b != null;
    }

    /* renamed from: d */
    public C4756ic mo25422d(String str) {
        this.f9396e = str;
        return this;
    }

    /* renamed from: d */
    public void mo25423d(boolean z) {
        this.f9388a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo25424d() {
        return this.f9394c != null;
    }

    /* renamed from: e */
    public void mo25425e(boolean z) {
        this.f9388a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo25426e() {
        return this.f9388a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4756ic)) {
            return compareTo((C4756ic) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25428f() {
        return this.f9395d != null;
    }

    /* renamed from: g */
    public boolean mo25429g() {
        return this.f9396e != null;
    }

    /* renamed from: h */
    public boolean mo25430h() {
        return this.f9386a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25432i() {
        return this.f9397f != null;
    }

    /* renamed from: j */
    public boolean mo25433j() {
        return this.f9398g != null;
    }

    /* renamed from: k */
    public boolean mo25434k() {
        return this.f9388a.get(1);
    }

    /* renamed from: l */
    public boolean mo25435l() {
        return this.f9399h != null;
    }

    /* renamed from: m */
    public boolean mo25436m() {
        return this.f9400i != null;
    }

    /* renamed from: n */
    public boolean mo25437n() {
        return this.f9401j != null;
    }

    /* renamed from: o */
    public boolean mo25438o() {
        return this.f9388a.get(2);
    }

    /* renamed from: p */
    public boolean mo25439p() {
        return this.f9388a.get(3);
    }

    /* renamed from: q */
    public boolean mo25440q() {
        return this.f9402k != null;
    }

    /* renamed from: r */
    public boolean mo25441r() {
        return this.f9403l != null;
    }

    /* renamed from: s */
    public boolean mo25442s() {
        return this.f9388a.get(4);
    }

    /* renamed from: t */
    public boolean mo25443t() {
        return this.f9389a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (mo25413a()) {
            sb.append("debug:");
            String str = this.f9387a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25417b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9385a;
            if (ibVar == null) {
                sb.append("null");
            } else {
                sb.append(ibVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f9392b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9394c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f9384a);
        if (mo25428f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f9395d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25429g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f9396e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25430h()) {
            sb.append(", ");
            sb.append("request:");
            C4769ip ipVar = this.f9386a;
            if (ipVar == null) {
                sb.append("null");
            } else {
                sb.append(ipVar);
            }
        }
        if (mo25432i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9397f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25433j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9398g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo25434k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f9391a);
        }
        if (mo25435l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f9399h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo25436m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f9400i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo25437n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f9401j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (mo25438o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append(this.f9390a);
        }
        if (mo25439p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append(this.f9393b);
        }
        if (mo25440q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f9402k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (mo25441r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f9403l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (mo25442s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f9383a);
        }
        if (mo25443t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f9389a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
