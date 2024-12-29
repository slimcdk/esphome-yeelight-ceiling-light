package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.push.service.C4902bd;
import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ik */
public class C4788ik implements C4798iu<C4788ik, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9054a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9055a = new C4817jk("XmPushActionRegistrationResult");

    /* renamed from: b */
    private static final C4809jc f9056b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9057c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9058d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9059e = new C4809jc("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4809jc f9060f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f9061g = new C4809jc("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4809jc f9062h = new C4809jc("", (byte) 11, 9);

    /* renamed from: i */
    private static final C4809jc f9063i = new C4809jc("", (byte) 11, 10);

    /* renamed from: j */
    private static final C4809jc f9064j = new C4809jc("", (byte) 10, 11);

    /* renamed from: k */
    private static final C4809jc f9065k = new C4809jc("", (byte) 11, 12);

    /* renamed from: l */
    private static final C4809jc f9066l = new C4809jc("", (byte) 11, 13);

    /* renamed from: m */
    private static final C4809jc f9067m = new C4809jc("", (byte) 10, 14);

    /* renamed from: n */
    private static final C4809jc f9068n = new C4809jc("", (byte) 11, 15);

    /* renamed from: o */
    private static final C4809jc f9069o = new C4809jc("", (byte) 8, 16);

    /* renamed from: p */
    private static final C4809jc f9070p = new C4809jc("", (byte) 11, 17);

    /* renamed from: q */
    private static final C4809jc f9071q = new C4809jc("", (byte) 8, 18);

    /* renamed from: r */
    private static final C4809jc f9072r = new C4809jc("", (byte) 11, 19);

    /* renamed from: s */
    private static final C4809jc f9073s = new C4809jc("", (byte) 2, 20);

    /* renamed from: t */
    private static final C4809jc f9074t = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 21);

    /* renamed from: a */
    public int f9075a;

    /* renamed from: a */
    public long f9076a;

    /* renamed from: a */
    public C4775hy f9077a;

    /* renamed from: a */
    public String f9078a;

    /* renamed from: a */
    private BitSet f9079a = new BitSet(6);

    /* renamed from: a */
    public List<String> f9080a;

    /* renamed from: a */
    public boolean f9081a = false;

    /* renamed from: b */
    public int f9082b;

    /* renamed from: b */
    public long f9083b;

    /* renamed from: b */
    public String f9084b;

    /* renamed from: c */
    public long f9085c;

    /* renamed from: c */
    public String f9086c;

    /* renamed from: d */
    public String f9087d;

    /* renamed from: e */
    public String f9088e;

    /* renamed from: f */
    public String f9089f;

    /* renamed from: g */
    public String f9090g;

    /* renamed from: h */
    public String f9091h;

    /* renamed from: i */
    public String f9092i;

    /* renamed from: j */
    public String f9093j;

    /* renamed from: k */
    public String f9094k;

    /* renamed from: l */
    public String f9095l;

    /* renamed from: a */
    public int compareTo(C4788ik ikVar) {
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
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29678a()).compareTo(Boolean.valueOf(ikVar.mo29678a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29678a() && (a20 = C4799iv.m14841a(this.f9078a, ikVar.f9078a)) != 0) {
            return a20;
        }
        int compareTo2 = Boolean.valueOf(mo29680b()).compareTo(Boolean.valueOf(ikVar.mo29680b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29680b() && (a19 = C4799iv.m14840a((Comparable) this.f9077a, (Comparable) ikVar.f9077a)) != 0) {
            return a19;
        }
        int compareTo3 = Boolean.valueOf(mo29682c()).compareTo(Boolean.valueOf(ikVar.mo29682c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29682c() && (a18 = C4799iv.m14841a(this.f9084b, ikVar.f9084b)) != 0) {
            return a18;
        }
        int compareTo4 = Boolean.valueOf(mo29686d()).compareTo(Boolean.valueOf(ikVar.mo29686d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29686d() && (a17 = C4799iv.m14841a(this.f9086c, ikVar.f9086c)) != 0) {
            return a17;
        }
        int compareTo5 = Boolean.valueOf(mo29688e()).compareTo(Boolean.valueOf(ikVar.mo29688e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29688e() && (a16 = C4799iv.m14839a(this.f9076a, ikVar.f9076a)) != 0) {
            return a16;
        }
        int compareTo6 = Boolean.valueOf(mo29691f()).compareTo(Boolean.valueOf(ikVar.mo29691f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29691f() && (a15 = C4799iv.m14841a(this.f9087d, ikVar.f9087d)) != 0) {
            return a15;
        }
        int compareTo7 = Boolean.valueOf(mo29692g()).compareTo(Boolean.valueOf(ikVar.mo29692g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29692g() && (a14 = C4799iv.m14841a(this.f9088e, ikVar.f9088e)) != 0) {
            return a14;
        }
        int compareTo8 = Boolean.valueOf(mo29693h()).compareTo(Boolean.valueOf(ikVar.mo29693h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29693h() && (a13 = C4799iv.m14841a(this.f9089f, ikVar.f9089f)) != 0) {
            return a13;
        }
        int compareTo9 = Boolean.valueOf(mo29695i()).compareTo(Boolean.valueOf(ikVar.mo29695i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29695i() && (a12 = C4799iv.m14841a(this.f9090g, ikVar.f9090g)) != 0) {
            return a12;
        }
        int compareTo10 = Boolean.valueOf(mo29696j()).compareTo(Boolean.valueOf(ikVar.mo29696j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29696j() && (a11 = C4799iv.m14839a(this.f9083b, ikVar.f9083b)) != 0) {
            return a11;
        }
        int compareTo11 = Boolean.valueOf(mo29697k()).compareTo(Boolean.valueOf(ikVar.mo29697k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29697k() && (a10 = C4799iv.m14841a(this.f9091h, ikVar.f9091h)) != 0) {
            return a10;
        }
        int compareTo12 = Boolean.valueOf(mo29698l()).compareTo(Boolean.valueOf(ikVar.mo29698l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo29698l() && (a9 = C4799iv.m14841a(this.f9092i, ikVar.f9092i)) != 0) {
            return a9;
        }
        int compareTo13 = Boolean.valueOf(mo29699m()).compareTo(Boolean.valueOf(ikVar.mo29699m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo29699m() && (a8 = C4799iv.m14839a(this.f9085c, ikVar.f9085c)) != 0) {
            return a8;
        }
        int compareTo14 = Boolean.valueOf(mo29700n()).compareTo(Boolean.valueOf(ikVar.mo29700n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo29700n() && (a7 = C4799iv.m14841a(this.f9093j, ikVar.f9093j)) != 0) {
            return a7;
        }
        int compareTo15 = Boolean.valueOf(mo29701o()).compareTo(Boolean.valueOf(ikVar.mo29701o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (mo29701o() && (a6 = C4799iv.m14838a(this.f9075a, ikVar.f9075a)) != 0) {
            return a6;
        }
        int compareTo16 = Boolean.valueOf(mo29702p()).compareTo(Boolean.valueOf(ikVar.mo29702p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (mo29702p() && (a5 = C4799iv.m14841a(this.f9094k, ikVar.f9094k)) != 0) {
            return a5;
        }
        int compareTo17 = Boolean.valueOf(mo29703q()).compareTo(Boolean.valueOf(ikVar.mo29703q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (mo29703q() && (a4 = C4799iv.m14838a(this.f9082b, ikVar.f9082b)) != 0) {
            return a4;
        }
        int compareTo18 = Boolean.valueOf(mo29704r()).compareTo(Boolean.valueOf(ikVar.mo29704r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (mo29704r() && (a3 = C4799iv.m14841a(this.f9095l, ikVar.f9095l)) != 0) {
            return a3;
        }
        int compareTo19 = Boolean.valueOf(mo29705s()).compareTo(Boolean.valueOf(ikVar.mo29705s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (mo29705s() && (a2 = C4799iv.m14847a(this.f9081a, ikVar.f9081a)) != 0) {
            return a2;
        }
        int compareTo20 = Boolean.valueOf(mo29706t()).compareTo(Boolean.valueOf(ikVar.mo29706t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!mo29706t() || (a = C4799iv.m14843a((List) this.f9080a, (List) ikVar.f9080a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long mo29678a() {
        return this.f9076a;
    }

    /* renamed from: a */
    public String m14645a() {
        return this.f9084b;
    }

    /* renamed from: a */
    public List<String> m14646a() {
        return this.f9080a;
    }

    /* renamed from: a */
    public void m14647a() {
        if (this.f9084b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9086c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r7) {
        /*
            r6 = this;
            r7.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r7.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0033
            r7.mo29868f()
            boolean r7 = r6.mo29688e()
            if (r7 == 0) goto L_0x0018
            r6.mo29678a()
            return
        L_0x0018:
            com.xiaomi.push.jg r7 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0033:
            short r0 = r0.f9291a
            r2 = 8
            r3 = 10
            r4 = 1
            r5 = 11
            switch(r0) {
                case 1: goto L_0x012f;
                case 2: goto L_0x0120;
                case 3: goto L_0x0117;
                case 4: goto L_0x010e;
                case 5: goto L_0x003f;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f9;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00e7;
                case 10: goto L_0x00de;
                case 11: goto L_0x00d2;
                case 12: goto L_0x00c8;
                case 13: goto L_0x00be;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00a7;
                case 16: goto L_0x009a;
                case 17: goto L_0x0090;
                case 18: goto L_0x0083;
                case 19: goto L_0x0079;
                case 20: goto L_0x006b;
                case 21: goto L_0x0044;
                default: goto L_0x003f;
            }
        L_0x003f:
            com.xiaomi.push.C4815ji.m14965a(r7, r1)
            goto L_0x0137
        L_0x0044:
            r0 = 15
            if (r1 != r0) goto L_0x003f
            com.xiaomi.push.jd r0 = r7.mo29850a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9293a
            r1.<init>(r2)
            r6.f9080a = r1
            r1 = 0
        L_0x0056:
            int r2 = r0.f9293a
            if (r1 >= r2) goto L_0x0066
            java.lang.String r2 = r7.mo29850a()
            java.util.List<java.lang.String> r3 = r6.f9080a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0056
        L_0x0066:
            r7.mo29871i()
            goto L_0x0137
        L_0x006b:
            r0 = 2
            if (r1 != r0) goto L_0x003f
            boolean r0 = r7.mo29850a()
            r6.f9081a = r0
            r6.mo29690f(r4)
            goto L_0x0137
        L_0x0079:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9095l = r0
            goto L_0x0137
        L_0x0083:
            if (r1 != r2) goto L_0x003f
            int r0 = r7.mo29850a()
            r6.f9082b = r0
            r6.mo29687e(r4)
            goto L_0x0137
        L_0x0090:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9094k = r0
            goto L_0x0137
        L_0x009a:
            if (r1 != r2) goto L_0x003f
            int r0 = r7.mo29850a()
            r6.f9075a = r0
            r6.mo29685d(r4)
            goto L_0x0137
        L_0x00a7:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9093j = r0
            goto L_0x0137
        L_0x00b1:
            if (r1 != r3) goto L_0x003f
            long r0 = r7.mo29850a()
            r6.f9085c = r0
            r6.mo29683c(r4)
            goto L_0x0137
        L_0x00be:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9092i = r0
            goto L_0x0137
        L_0x00c8:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9091h = r0
            goto L_0x0137
        L_0x00d2:
            if (r1 != r3) goto L_0x003f
            long r0 = r7.mo29850a()
            r6.f9083b = r0
            r6.mo29681b((boolean) r4)
            goto L_0x0137
        L_0x00de:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9090g = r0
            goto L_0x0137
        L_0x00e7:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9089f = r0
            goto L_0x0137
        L_0x00f0:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9088e = r0
            goto L_0x0137
        L_0x00f9:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9087d = r0
            goto L_0x0137
        L_0x0102:
            if (r1 != r3) goto L_0x003f
            long r0 = r7.mo29850a()
            r6.f9076a = r0
            r6.mo29679a((boolean) r4)
            goto L_0x0137
        L_0x010e:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9086c = r0
            goto L_0x0137
        L_0x0117:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9084b = r0
            goto L_0x0137
        L_0x0120:
            r0 = 12
            if (r1 != r0) goto L_0x003f
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r6.f9077a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r7)
            goto L_0x0137
        L_0x012f:
            if (r1 != r5) goto L_0x003f
            java.lang.String r0 = r7.mo29850a()
            r6.f9078a = r0
        L_0x0137:
            r7.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4788ik.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29679a(boolean z) {
        this.f9079a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14650a() {
        return this.f9078a != null;
    }

    /* renamed from: a */
    public boolean m14651a(C4788ik ikVar) {
        if (ikVar == null) {
            return false;
        }
        boolean a = mo29678a();
        boolean a2 = ikVar.mo29678a();
        if ((a || a2) && (!a || !a2 || !this.f9078a.equals(ikVar.f9078a))) {
            return false;
        }
        boolean b = mo29680b();
        boolean b2 = ikVar.mo29680b();
        if ((b || b2) && (!b || !b2 || !this.f9077a.compareTo(ikVar.f9077a))) {
            return false;
        }
        boolean c = mo29682c();
        boolean c2 = ikVar.mo29682c();
        if ((c || c2) && (!c || !c2 || !this.f9084b.equals(ikVar.f9084b))) {
            return false;
        }
        boolean d = mo29686d();
        boolean d2 = ikVar.mo29686d();
        if (((d || d2) && (!d || !d2 || !this.f9086c.equals(ikVar.f9086c))) || this.f9076a != ikVar.f9076a) {
            return false;
        }
        boolean f = mo29691f();
        boolean f2 = ikVar.mo29691f();
        if ((f || f2) && (!f || !f2 || !this.f9087d.equals(ikVar.f9087d))) {
            return false;
        }
        boolean g = mo29692g();
        boolean g2 = ikVar.mo29692g();
        if ((g || g2) && (!g || !g2 || !this.f9088e.equals(ikVar.f9088e))) {
            return false;
        }
        boolean h = mo29693h();
        boolean h2 = ikVar.mo29693h();
        if ((h || h2) && (!h || !h2 || !this.f9089f.equals(ikVar.f9089f))) {
            return false;
        }
        boolean i = mo29695i();
        boolean i2 = ikVar.mo29695i();
        if ((i || i2) && (!i || !i2 || !this.f9090g.equals(ikVar.f9090g))) {
            return false;
        }
        boolean j = mo29696j();
        boolean j2 = ikVar.mo29696j();
        if ((j || j2) && (!j || !j2 || this.f9083b != ikVar.f9083b)) {
            return false;
        }
        boolean k = mo29697k();
        boolean k2 = ikVar.mo29697k();
        if ((k || k2) && (!k || !k2 || !this.f9091h.equals(ikVar.f9091h))) {
            return false;
        }
        boolean l = mo29698l();
        boolean l2 = ikVar.mo29698l();
        if ((l || l2) && (!l || !l2 || !this.f9092i.equals(ikVar.f9092i))) {
            return false;
        }
        boolean m = mo29699m();
        boolean m2 = ikVar.mo29699m();
        if ((m || m2) && (!m || !m2 || this.f9085c != ikVar.f9085c)) {
            return false;
        }
        boolean n = mo29700n();
        boolean n2 = ikVar.mo29700n();
        if ((n || n2) && (!n || !n2 || !this.f9093j.equals(ikVar.f9093j))) {
            return false;
        }
        boolean o = mo29701o();
        boolean o2 = ikVar.mo29701o();
        if ((o || o2) && (!o || !o2 || this.f9075a != ikVar.f9075a)) {
            return false;
        }
        boolean p = mo29702p();
        boolean p2 = ikVar.mo29702p();
        if ((p || p2) && (!p || !p2 || !this.f9094k.equals(ikVar.f9094k))) {
            return false;
        }
        boolean q = mo29703q();
        boolean q2 = ikVar.mo29703q();
        if ((q || q2) && (!q || !q2 || this.f9082b != ikVar.f9082b)) {
            return false;
        }
        boolean r = mo29704r();
        boolean r2 = ikVar.mo29704r();
        if ((r || r2) && (!r || !r2 || !this.f9095l.equals(ikVar.f9095l))) {
            return false;
        }
        boolean s = mo29705s();
        boolean s2 = ikVar.mo29705s();
        if ((s || s2) && (!s || !s2 || this.f9081a != ikVar.f9081a)) {
            return false;
        }
        boolean t = mo29706t();
        boolean t2 = ikVar.mo29706t();
        if (t || t2) {
            return t && t2 && this.f9080a.equals(ikVar.f9080a);
        }
        return true;
    }

    /* renamed from: b */
    public String mo29680b() {
        return this.f9089f;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29678a();
        jfVar.mo29857a(f9055a);
        if (this.f9078a != null && mo29678a()) {
            jfVar.mo29854a(f9054a);
            jfVar.mo29858a(this.f9078a);
            jfVar.mo29862b();
        }
        if (this.f9077a != null && mo29680b()) {
            jfVar.mo29854a(f9056b);
            this.f9077a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9084b != null) {
            jfVar.mo29854a(f9057c);
            jfVar.mo29858a(this.f9084b);
            jfVar.mo29862b();
        }
        if (this.f9086c != null) {
            jfVar.mo29854a(f9058d);
            jfVar.mo29858a(this.f9086c);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f9059e);
        jfVar.mo29853a(this.f9076a);
        jfVar.mo29862b();
        if (this.f9087d != null && mo29691f()) {
            jfVar.mo29854a(f9060f);
            jfVar.mo29858a(this.f9087d);
            jfVar.mo29862b();
        }
        if (this.f9088e != null && mo29692g()) {
            jfVar.mo29854a(f9061g);
            jfVar.mo29858a(this.f9088e);
            jfVar.mo29862b();
        }
        if (this.f9089f != null && mo29693h()) {
            jfVar.mo29854a(f9062h);
            jfVar.mo29858a(this.f9089f);
            jfVar.mo29862b();
        }
        if (this.f9090g != null && mo29695i()) {
            jfVar.mo29854a(f9063i);
            jfVar.mo29858a(this.f9090g);
            jfVar.mo29862b();
        }
        if (mo29696j()) {
            jfVar.mo29854a(f9064j);
            jfVar.mo29853a(this.f9083b);
            jfVar.mo29862b();
        }
        if (this.f9091h != null && mo29697k()) {
            jfVar.mo29854a(f9065k);
            jfVar.mo29858a(this.f9091h);
            jfVar.mo29862b();
        }
        if (this.f9092i != null && mo29698l()) {
            jfVar.mo29854a(f9066l);
            jfVar.mo29858a(this.f9092i);
            jfVar.mo29862b();
        }
        if (mo29699m()) {
            jfVar.mo29854a(f9067m);
            jfVar.mo29853a(this.f9085c);
            jfVar.mo29862b();
        }
        if (this.f9093j != null && mo29700n()) {
            jfVar.mo29854a(f9068n);
            jfVar.mo29858a(this.f9093j);
            jfVar.mo29862b();
        }
        if (mo29701o()) {
            jfVar.mo29854a(f9069o);
            jfVar.mo29851a(this.f9075a);
            jfVar.mo29862b();
        }
        if (this.f9094k != null && mo29702p()) {
            jfVar.mo29854a(f9070p);
            jfVar.mo29858a(this.f9094k);
            jfVar.mo29862b();
        }
        if (mo29703q()) {
            jfVar.mo29854a(f9071q);
            jfVar.mo29851a(this.f9082b);
            jfVar.mo29862b();
        }
        if (this.f9095l != null && mo29704r()) {
            jfVar.mo29854a(f9072r);
            jfVar.mo29858a(this.f9095l);
            jfVar.mo29862b();
        }
        if (mo29705s()) {
            jfVar.mo29854a(f9073s);
            jfVar.mo29861a(this.f9081a);
            jfVar.mo29862b();
        }
        if (this.f9080a != null && mo29706t()) {
            jfVar.mo29854a(f9074t);
            jfVar.mo29855a(new C4810jd((byte) 11, this.f9080a.size()));
            for (String a : this.f9080a) {
                jfVar.mo29858a(a);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29681b(boolean z) {
        this.f9079a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14655b() {
        return this.f9077a != null;
    }

    /* renamed from: c */
    public String mo29682c() {
        return this.f9090g;
    }

    /* renamed from: c */
    public void mo29683c(boolean z) {
        this.f9079a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14658c() {
        return this.f9084b != null;
    }

    /* renamed from: d */
    public void mo29685d(boolean z) {
        this.f9079a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo29686d() {
        return this.f9086c != null;
    }

    /* renamed from: e */
    public void mo29687e(boolean z) {
        this.f9079a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo29688e() {
        return this.f9079a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4788ik)) {
            return compareTo((C4788ik) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo29690f(boolean z) {
        this.f9079a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo29691f() {
        return this.f9087d != null;
    }

    /* renamed from: g */
    public boolean mo29692g() {
        return this.f9088e != null;
    }

    /* renamed from: h */
    public boolean mo29693h() {
        return this.f9089f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29695i() {
        return this.f9090g != null;
    }

    /* renamed from: j */
    public boolean mo29696j() {
        return this.f9079a.get(1);
    }

    /* renamed from: k */
    public boolean mo29697k() {
        return this.f9091h != null;
    }

    /* renamed from: l */
    public boolean mo29698l() {
        return this.f9092i != null;
    }

    /* renamed from: m */
    public boolean mo29699m() {
        return this.f9079a.get(2);
    }

    /* renamed from: n */
    public boolean mo29700n() {
        return this.f9093j != null;
    }

    /* renamed from: o */
    public boolean mo29701o() {
        return this.f9079a.get(3);
    }

    /* renamed from: p */
    public boolean mo29702p() {
        return this.f9094k != null;
    }

    /* renamed from: q */
    public boolean mo29703q() {
        return this.f9079a.get(4);
    }

    /* renamed from: r */
    public boolean mo29704r() {
        return this.f9095l != null;
    }

    /* renamed from: s */
    public boolean mo29705s() {
        return this.f9079a.get(5);
    }

    /* renamed from: t */
    public boolean mo29706t() {
        return this.f9080a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (mo29678a()) {
            sb.append("debug:");
            String str = this.f9078a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29680b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9077a;
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
        String str2 = this.f9084b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(C4902bd.m15381a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9086c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9076a);
        if (mo29691f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9087d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29692g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f9088e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29695i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9090g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29696j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f9083b);
        }
        if (mo29697k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f9091h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29698l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f9092i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo29699m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f9085c);
        }
        if (mo29700n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f9093j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo29701o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f9075a);
        }
        if (mo29702p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f9094k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (mo29703q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f9082b);
        }
        if (mo29704r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f9095l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (mo29705s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f9081a);
        }
        if (mo29706t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f9080a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
