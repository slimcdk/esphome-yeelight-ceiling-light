package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.hz */
public class C4776hz implements C4798iu<C4776hz, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8820a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8821a = new C4817jk("XmPushActionAckMessage");

    /* renamed from: b */
    private static final C4809jc f8822b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f8823c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8824d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8825e = new C4809jc("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4809jc f8826f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f8827g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8828h = new C4809jc("", (byte) 12, 8);

    /* renamed from: i */
    private static final C4809jc f8829i = new C4809jc("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4809jc f8830j = new C4809jc("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4809jc f8831k = new C4809jc("", (byte) 2, 11);

    /* renamed from: l */
    private static final C4809jc f8832l = new C4809jc("", (byte) 11, 12);

    /* renamed from: m */
    private static final C4809jc f8833m = new C4809jc("", (byte) 11, 13);

    /* renamed from: n */
    private static final C4809jc f8834n = new C4809jc("", (byte) 11, 14);

    /* renamed from: o */
    private static final C4809jc f8835o = new C4809jc("", (byte) 6, 15);

    /* renamed from: p */
    private static final C4809jc f8836p = new C4809jc("", (byte) 6, 16);

    /* renamed from: q */
    private static final C4809jc f8837q = new C4809jc("", (byte) 11, 20);

    /* renamed from: r */
    private static final C4809jc f8838r = new C4809jc("", (byte) 11, 21);

    /* renamed from: s */
    private static final C4809jc f8839s = new C4809jc("", (byte) 8, 22);

    /* renamed from: t */
    private static final C4809jc f8840t = new C4809jc("", ParameterInitDefType.IntVec3Init, 23);

    /* renamed from: a */
    public int f8841a;

    /* renamed from: a */
    public long f8842a;

    /* renamed from: a */
    public C4775hy f8843a;

    /* renamed from: a */
    public C4790im f8844a;

    /* renamed from: a */
    public String f8845a;

    /* renamed from: a */
    private BitSet f8846a = new BitSet(5);

    /* renamed from: a */
    public Map<String, String> f8847a;

    /* renamed from: a */
    public short f8848a;

    /* renamed from: a */
    public boolean f8849a = false;

    /* renamed from: b */
    public String f8850b;

    /* renamed from: b */
    public short f8851b;

    /* renamed from: c */
    public String f8852c;

    /* renamed from: d */
    public String f8853d;

    /* renamed from: e */
    public String f8854e;

    /* renamed from: f */
    public String f8855f;

    /* renamed from: g */
    public String f8856g;

    /* renamed from: h */
    public String f8857h;

    /* renamed from: i */
    public String f8858i;

    /* renamed from: j */
    public String f8859j;

    /* renamed from: k */
    public String f8860k;

    /* renamed from: l */
    public String f8861l;

    /* renamed from: a */
    public int compareTo(C4776hz hzVar) {
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
        if (!getClass().equals(hzVar.getClass())) {
            return getClass().getName().compareTo(hzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29444a()).compareTo(Boolean.valueOf(hzVar.mo29444a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29444a() && (a20 = C4799iv.m14841a(this.f8845a, hzVar.f8845a)) != 0) {
            return a20;
        }
        int compareTo2 = Boolean.valueOf(mo29448b()).compareTo(Boolean.valueOf(hzVar.mo29448b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29448b() && (a19 = C4799iv.m14840a((Comparable) this.f8843a, (Comparable) hzVar.f8843a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(mo29451c()).compareTo(Boolean.valueOf(hzVar.mo29451c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29451c() && (a18 = C4799iv.m14841a(this.f8850b, hzVar.f8850b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(mo29455d()).compareTo(Boolean.valueOf(hzVar.mo29455d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29455d() && (a17 = C4799iv.m14841a(this.f8852c, hzVar.f8852c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(mo29457e()).compareTo(Boolean.valueOf(hzVar.mo29457e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29457e() && (a16 = C4799iv.m14839a(this.f8842a, hzVar.f8842a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(mo29459f()).compareTo(Boolean.valueOf(hzVar.mo29459f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29459f() && (a15 = C4799iv.m14841a(this.f8853d, hzVar.f8853d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(mo29460g()).compareTo(Boolean.valueOf(hzVar.mo29460g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29460g() && (a14 = C4799iv.m14841a(this.f8854e, hzVar.f8854e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(mo29461h()).compareTo(Boolean.valueOf(hzVar.mo29461h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29461h() && (a13 = C4799iv.m14840a((Comparable) this.f8844a, (Comparable) hzVar.f8844a)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(mo29463i()).compareTo(Boolean.valueOf(hzVar.mo29463i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29463i() && (a12 = C4799iv.m14841a(this.f8855f, hzVar.f8855f)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(mo29464j()).compareTo(Boolean.valueOf(hzVar.mo29464j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29464j() && (a11 = C4799iv.m14841a(this.f8856g, hzVar.f8856g)) != 0) {
            return a11;
        }
        int compareTo11 = Boolean.valueOf(mo29465k()).compareTo(Boolean.valueOf(hzVar.mo29465k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29465k() && (a10 = C4799iv.m14847a(this.f8849a, hzVar.f8849a)) != 0) {
            return a10;
        }
        int compareTo12 = Boolean.valueOf(mo29466l()).compareTo(Boolean.valueOf(hzVar.mo29466l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo29466l() && (a9 = C4799iv.m14841a(this.f8857h, hzVar.f8857h)) != 0) {
            return a9;
        }
        int compareTo13 = Boolean.valueOf(mo29467m()).compareTo(Boolean.valueOf(hzVar.mo29467m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo29467m() && (a8 = C4799iv.m14841a(this.f8858i, hzVar.f8858i)) != 0) {
            return a8;
        }
        int compareTo14 = Boolean.valueOf(mo29468n()).compareTo(Boolean.valueOf(hzVar.mo29468n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo29468n() && (a7 = C4799iv.m14841a(this.f8859j, hzVar.f8859j)) != 0) {
            return a7;
        }
        int compareTo15 = Boolean.valueOf(mo29469o()).compareTo(Boolean.valueOf(hzVar.mo29469o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (mo29469o() && (a6 = C4799iv.m14846a(this.f8848a, hzVar.f8848a)) != 0) {
            return a6;
        }
        int compareTo16 = Boolean.valueOf(mo29470p()).compareTo(Boolean.valueOf(hzVar.mo29470p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (mo29470p() && (a5 = C4799iv.m14846a(this.f8851b, hzVar.f8851b)) != 0) {
            return a5;
        }
        int compareTo17 = Boolean.valueOf(mo29471q()).compareTo(Boolean.valueOf(hzVar.mo29471q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (mo29471q() && (a4 = C4799iv.m14841a(this.f8860k, hzVar.f8860k)) != 0) {
            return a4;
        }
        int compareTo18 = Boolean.valueOf(mo29472r()).compareTo(Boolean.valueOf(hzVar.mo29472r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (mo29472r() && (a3 = C4799iv.m14841a(this.f8861l, hzVar.f8861l)) != 0) {
            return a3;
        }
        int compareTo19 = Boolean.valueOf(mo29473s()).compareTo(Boolean.valueOf(hzVar.mo29473s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (mo29473s() && (a2 = C4799iv.m14838a(this.f8841a, hzVar.f8841a)) != 0) {
            return a2;
        }
        int compareTo20 = Boolean.valueOf(mo29474t()).compareTo(Boolean.valueOf(hzVar.mo29474t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!mo29474t() || (a = C4799iv.m14844a((Map) this.f8847a, (Map) hzVar.f8847a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4776hz mo29441a(long j) {
        this.f8842a = j;
        mo29445a(true);
        return this;
    }

    /* renamed from: a */
    public C4776hz mo29442a(String str) {
        this.f8850b = str;
        return this;
    }

    /* renamed from: a */
    public C4776hz mo29443a(short s) {
        this.f8848a = s;
        mo29450c(true);
        return this;
    }

    /* renamed from: a */
    public void mo29444a() {
        if (this.f8850b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f8852c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r8) {
        /*
            r7 = this;
            r8.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r8.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0033
            r8.mo29868f()
            boolean r8 = r7.mo29457e()
            if (r8 == 0) goto L_0x0018
            r7.mo29444a()
            return
        L_0x0018:
            com.xiaomi.push.jg r8 = new com.xiaomi.push.jg
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
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r8, r1)
            goto L_0x013f
        L_0x0044:
            r0 = 13
            if (r1 != r0) goto L_0x003f
            com.xiaomi.push.je r0 = r8.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f9295a
            int r2 = r2 * 2
            r1.<init>(r2)
            r7.f8847a = r1
            r1 = 0
        L_0x0058:
            int r2 = r0.f9295a
            if (r1 >= r2) goto L_0x006c
            java.lang.String r2 = r8.mo29850a()
            java.lang.String r3 = r8.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f8847a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0058
        L_0x006c:
            r8.mo29870h()
            goto L_0x013f
        L_0x0071:
            r0 = 8
            if (r1 != r0) goto L_0x003f
            int r0 = r8.mo29850a()
            r7.f8841a = r0
            r7.mo29456e(r5)
            goto L_0x013f
        L_0x0080:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8861l = r0
            goto L_0x013f
        L_0x008a:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8860k = r0
            goto L_0x013f
        L_0x0094:
            if (r1 != r2) goto L_0x003f
            short r0 = r8.mo29850a()
            r7.f8851b = r0
            r7.mo29454d((boolean) r5)
            goto L_0x013f
        L_0x00a1:
            if (r1 != r2) goto L_0x003f
            short r0 = r8.mo29850a()
            r7.f8848a = r0
            r7.mo29450c((boolean) r5)
            goto L_0x013f
        L_0x00ae:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8859j = r0
            goto L_0x013f
        L_0x00b8:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8858i = r0
            goto L_0x013f
        L_0x00c2:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8857h = r0
            goto L_0x013f
        L_0x00cc:
            if (r1 != r3) goto L_0x003f
            boolean r0 = r8.mo29850a()
            r7.f8849a = r0
            r7.mo29447b((boolean) r5)
            goto L_0x013f
        L_0x00d9:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8856g = r0
            goto L_0x013f
        L_0x00e2:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8855f = r0
            goto L_0x013f
        L_0x00eb:
            if (r1 != r4) goto L_0x003f
            com.xiaomi.push.im r0 = new com.xiaomi.push.im
            r0.<init>()
            r7.f8844a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r8)
            goto L_0x013f
        L_0x00f8:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8854e = r0
            goto L_0x013f
        L_0x0101:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8853d = r0
            goto L_0x013f
        L_0x010a:
            r0 = 10
            if (r1 != r0) goto L_0x003f
            long r0 = r8.mo29850a()
            r7.f8842a = r0
            r7.mo29445a((boolean) r5)
            goto L_0x013f
        L_0x0118:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8852c = r0
            goto L_0x013f
        L_0x0121:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8850b = r0
            goto L_0x013f
        L_0x012a:
            if (r1 != r4) goto L_0x003f
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r7.f8843a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r8)
            goto L_0x013f
        L_0x0137:
            if (r1 != r6) goto L_0x003f
            java.lang.String r0 = r8.mo29850a()
            r7.f8845a = r0
        L_0x013f:
            r8.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4776hz.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29445a(boolean z) {
        this.f8846a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14382a() {
        return this.f8845a != null;
    }

    /* renamed from: a */
    public boolean m14383a(C4776hz hzVar) {
        if (hzVar == null) {
            return false;
        }
        boolean a = mo29444a();
        boolean a2 = hzVar.mo29444a();
        if ((a || a2) && (!a || !a2 || !this.f8845a.equals(hzVar.f8845a))) {
            return false;
        }
        boolean b = mo29448b();
        boolean b2 = hzVar.mo29448b();
        if ((b || b2) && (!b || !b2 || !this.f8843a.compareTo(hzVar.f8843a))) {
            return false;
        }
        boolean c = mo29451c();
        boolean c2 = hzVar.mo29451c();
        if ((c || c2) && (!c || !c2 || !this.f8850b.equals(hzVar.f8850b))) {
            return false;
        }
        boolean d = mo29455d();
        boolean d2 = hzVar.mo29455d();
        if (((d || d2) && (!d || !d2 || !this.f8852c.equals(hzVar.f8852c))) || this.f8842a != hzVar.f8842a) {
            return false;
        }
        boolean f = mo29459f();
        boolean f2 = hzVar.mo29459f();
        if ((f || f2) && (!f || !f2 || !this.f8853d.equals(hzVar.f8853d))) {
            return false;
        }
        boolean g = mo29460g();
        boolean g2 = hzVar.mo29460g();
        if ((g || g2) && (!g || !g2 || !this.f8854e.equals(hzVar.f8854e))) {
            return false;
        }
        boolean h = mo29461h();
        boolean h2 = hzVar.mo29461h();
        if ((h || h2) && (!h || !h2 || !this.f8844a.compareTo(hzVar.f8844a))) {
            return false;
        }
        boolean i = mo29463i();
        boolean i2 = hzVar.mo29463i();
        if ((i || i2) && (!i || !i2 || !this.f8855f.equals(hzVar.f8855f))) {
            return false;
        }
        boolean j = mo29464j();
        boolean j2 = hzVar.mo29464j();
        if ((j || j2) && (!j || !j2 || !this.f8856g.equals(hzVar.f8856g))) {
            return false;
        }
        boolean k = mo29465k();
        boolean k2 = hzVar.mo29465k();
        if ((k || k2) && (!k || !k2 || this.f8849a != hzVar.f8849a)) {
            return false;
        }
        boolean l = mo29466l();
        boolean l2 = hzVar.mo29466l();
        if ((l || l2) && (!l || !l2 || !this.f8857h.equals(hzVar.f8857h))) {
            return false;
        }
        boolean m = mo29467m();
        boolean m2 = hzVar.mo29467m();
        if ((m || m2) && (!m || !m2 || !this.f8858i.equals(hzVar.f8858i))) {
            return false;
        }
        boolean n = mo29468n();
        boolean n2 = hzVar.mo29468n();
        if ((n || n2) && (!n || !n2 || !this.f8859j.equals(hzVar.f8859j))) {
            return false;
        }
        boolean o = mo29469o();
        boolean o2 = hzVar.mo29469o();
        if ((o || o2) && (!o || !o2 || this.f8848a != hzVar.f8848a)) {
            return false;
        }
        boolean p = mo29470p();
        boolean p2 = hzVar.mo29470p();
        if ((p || p2) && (!p || !p2 || this.f8851b != hzVar.f8851b)) {
            return false;
        }
        boolean q = mo29471q();
        boolean q2 = hzVar.mo29471q();
        if ((q || q2) && (!q || !q2 || !this.f8860k.equals(hzVar.f8860k))) {
            return false;
        }
        boolean r = mo29472r();
        boolean r2 = hzVar.mo29472r();
        if ((r || r2) && (!r || !r2 || !this.f8861l.equals(hzVar.f8861l))) {
            return false;
        }
        boolean s = mo29473s();
        boolean s2 = hzVar.mo29473s();
        if ((s || s2) && (!s || !s2 || this.f8841a != hzVar.f8841a)) {
            return false;
        }
        boolean t = mo29474t();
        boolean t2 = hzVar.mo29474t();
        if (t || t2) {
            return t && t2 && this.f8847a.equals(hzVar.f8847a);
        }
        return true;
    }

    /* renamed from: b */
    public C4776hz mo29446b(String str) {
        this.f8852c = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29444a();
        jfVar.mo29857a(f8821a);
        if (this.f8845a != null && mo29444a()) {
            jfVar.mo29854a(f8820a);
            jfVar.mo29858a(this.f8845a);
            jfVar.mo29862b();
        }
        if (this.f8843a != null && mo29448b()) {
            jfVar.mo29854a(f8822b);
            this.f8843a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8850b != null) {
            jfVar.mo29854a(f8823c);
            jfVar.mo29858a(this.f8850b);
            jfVar.mo29862b();
        }
        if (this.f8852c != null) {
            jfVar.mo29854a(f8824d);
            jfVar.mo29858a(this.f8852c);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f8825e);
        jfVar.mo29853a(this.f8842a);
        jfVar.mo29862b();
        if (this.f8853d != null && mo29459f()) {
            jfVar.mo29854a(f8826f);
            jfVar.mo29858a(this.f8853d);
            jfVar.mo29862b();
        }
        if (this.f8854e != null && mo29460g()) {
            jfVar.mo29854a(f8827g);
            jfVar.mo29858a(this.f8854e);
            jfVar.mo29862b();
        }
        if (this.f8844a != null && mo29461h()) {
            jfVar.mo29854a(f8828h);
            this.f8844a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8855f != null && mo29463i()) {
            jfVar.mo29854a(f8829i);
            jfVar.mo29858a(this.f8855f);
            jfVar.mo29862b();
        }
        if (this.f8856g != null && mo29464j()) {
            jfVar.mo29854a(f8830j);
            jfVar.mo29858a(this.f8856g);
            jfVar.mo29862b();
        }
        if (mo29465k()) {
            jfVar.mo29854a(f8831k);
            jfVar.mo29861a(this.f8849a);
            jfVar.mo29862b();
        }
        if (this.f8857h != null && mo29466l()) {
            jfVar.mo29854a(f8832l);
            jfVar.mo29858a(this.f8857h);
            jfVar.mo29862b();
        }
        if (this.f8858i != null && mo29467m()) {
            jfVar.mo29854a(f8833m);
            jfVar.mo29858a(this.f8858i);
            jfVar.mo29862b();
        }
        if (this.f8859j != null && mo29468n()) {
            jfVar.mo29854a(f8834n);
            jfVar.mo29858a(this.f8859j);
            jfVar.mo29862b();
        }
        if (mo29469o()) {
            jfVar.mo29854a(f8835o);
            jfVar.mo29860a(this.f8848a);
            jfVar.mo29862b();
        }
        if (mo29470p()) {
            jfVar.mo29854a(f8836p);
            jfVar.mo29860a(this.f8851b);
            jfVar.mo29862b();
        }
        if (this.f8860k != null && mo29471q()) {
            jfVar.mo29854a(f8837q);
            jfVar.mo29858a(this.f8860k);
            jfVar.mo29862b();
        }
        if (this.f8861l != null && mo29472r()) {
            jfVar.mo29854a(f8838r);
            jfVar.mo29858a(this.f8861l);
            jfVar.mo29862b();
        }
        if (mo29473s()) {
            jfVar.mo29854a(f8839s);
            jfVar.mo29851a(this.f8841a);
            jfVar.mo29862b();
        }
        if (this.f8847a != null && mo29474t()) {
            jfVar.mo29854a(f8840t);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8847a.size()));
            for (Map.Entry next : this.f8847a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29447b(boolean z) {
        this.f8846a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29448b() {
        return this.f8843a != null;
    }

    /* renamed from: c */
    public C4776hz mo29449c(String str) {
        this.f8853d = str;
        return this;
    }

    /* renamed from: c */
    public void mo29450c(boolean z) {
        this.f8846a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo29451c() {
        return this.f8850b != null;
    }

    /* renamed from: d */
    public C4776hz mo29453d(String str) {
        this.f8854e = str;
        return this;
    }

    /* renamed from: d */
    public void mo29454d(boolean z) {
        this.f8846a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo29455d() {
        return this.f8852c != null;
    }

    /* renamed from: e */
    public void mo29456e(boolean z) {
        this.f8846a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo29457e() {
        return this.f8846a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4776hz)) {
            return compareTo((C4776hz) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29459f() {
        return this.f8853d != null;
    }

    /* renamed from: g */
    public boolean mo29460g() {
        return this.f8854e != null;
    }

    /* renamed from: h */
    public boolean mo29461h() {
        return this.f8844a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29463i() {
        return this.f8855f != null;
    }

    /* renamed from: j */
    public boolean mo29464j() {
        return this.f8856g != null;
    }

    /* renamed from: k */
    public boolean mo29465k() {
        return this.f8846a.get(1);
    }

    /* renamed from: l */
    public boolean mo29466l() {
        return this.f8857h != null;
    }

    /* renamed from: m */
    public boolean mo29467m() {
        return this.f8858i != null;
    }

    /* renamed from: n */
    public boolean mo29468n() {
        return this.f8859j != null;
    }

    /* renamed from: o */
    public boolean mo29469o() {
        return this.f8846a.get(2);
    }

    /* renamed from: p */
    public boolean mo29470p() {
        return this.f8846a.get(3);
    }

    /* renamed from: q */
    public boolean mo29471q() {
        return this.f8860k != null;
    }

    /* renamed from: r */
    public boolean mo29472r() {
        return this.f8861l != null;
    }

    /* renamed from: s */
    public boolean mo29473s() {
        return this.f8846a.get(4);
    }

    /* renamed from: t */
    public boolean mo29474t() {
        return this.f8847a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (mo29444a()) {
            sb.append("debug:");
            String str = this.f8845a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29448b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f8843a;
            if (hyVar == null) {
                sb.append("null");
            } else {
                sb.append(hyVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f8850b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f8852c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f8842a);
        if (mo29459f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f8853d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29460g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f8854e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29461h()) {
            sb.append(", ");
            sb.append("request:");
            C4790im imVar = this.f8844a;
            if (imVar == null) {
                sb.append("null");
            } else {
                sb.append(imVar);
            }
        }
        if (mo29463i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f8855f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29464j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f8856g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29465k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f8849a);
        }
        if (mo29466l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f8857h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo29467m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f8858i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo29468n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f8859j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (mo29469o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append(this.f8848a);
        }
        if (mo29470p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append(this.f8851b);
        }
        if (mo29471q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f8860k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (mo29472r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f8861l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (mo29473s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f8841a);
        }
        if (mo29474t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f8847a;
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
