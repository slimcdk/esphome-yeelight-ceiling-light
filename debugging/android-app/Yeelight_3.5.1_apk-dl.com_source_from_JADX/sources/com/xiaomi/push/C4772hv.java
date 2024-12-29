package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hv */
public class C4772hv implements C4798iu<C4772hv, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8735a = new C4809jc("", (byte) 12, 1);

    /* renamed from: a */
    private static final C4817jk f8736a = new C4817jk("PushMessage");

    /* renamed from: b */
    private static final C4809jc f8737b = new C4809jc("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4809jc f8738c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8739d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8740e = new C4809jc("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4809jc f8741f = new C4809jc("", (byte) 10, 6);

    /* renamed from: g */
    private static final C4809jc f8742g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8743h = new C4809jc("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4809jc f8744i = new C4809jc("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4809jc f8745j = new C4809jc("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4809jc f8746k = new C4809jc("", (byte) 11, 11);

    /* renamed from: l */
    private static final C4809jc f8747l = new C4809jc("", (byte) 12, 12);

    /* renamed from: m */
    private static final C4809jc f8748m = new C4809jc("", (byte) 11, 13);

    /* renamed from: n */
    private static final C4809jc f8749n = new C4809jc("", (byte) 2, 14);

    /* renamed from: o */
    private static final C4809jc f8750o = new C4809jc("", (byte) 11, 15);

    /* renamed from: p */
    private static final C4809jc f8751p = new C4809jc("", (byte) 10, 16);

    /* renamed from: q */
    private static final C4809jc f8752q = new C4809jc("", (byte) 11, 20);

    /* renamed from: r */
    private static final C4809jc f8753r = new C4809jc("", (byte) 11, 21);

    /* renamed from: a */
    public long f8754a;

    /* renamed from: a */
    public C4773hw f8755a;

    /* renamed from: a */
    public C4775hy f8756a;

    /* renamed from: a */
    public String f8757a;

    /* renamed from: a */
    private BitSet f8758a = new BitSet(4);

    /* renamed from: a */
    public boolean f8759a = false;

    /* renamed from: b */
    public long f8760b;

    /* renamed from: b */
    public String f8761b;

    /* renamed from: c */
    public long f8762c;

    /* renamed from: c */
    public String f8763c;

    /* renamed from: d */
    public String f8764d;

    /* renamed from: e */
    public String f8765e;

    /* renamed from: f */
    public String f8766f;

    /* renamed from: g */
    public String f8767g;

    /* renamed from: h */
    public String f8768h;

    /* renamed from: i */
    public String f8769i;

    /* renamed from: j */
    public String f8770j;

    /* renamed from: k */
    public String f8771k;

    /* renamed from: l */
    public String f8772l;

    /* renamed from: a */
    public int compareTo(C4772hv hvVar) {
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
        if (!getClass().equals(hvVar.getClass())) {
            return getClass().getName().compareTo(hvVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29366a()).compareTo(Boolean.valueOf(hvVar.mo29366a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29366a() && (a18 = C4799iv.m14840a((Comparable) this.f8756a, (Comparable) hvVar.f8756a)) != 0) {
            return a18;
        }
        int compareTo2 = Boolean.valueOf(mo29368b()).compareTo(Boolean.valueOf(hvVar.mo29368b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29368b() && (a17 = C4799iv.m14841a(this.f8757a, hvVar.f8757a)) != 0) {
            return a17;
        }
        int compareTo3 = Boolean.valueOf(mo29370c()).compareTo(Boolean.valueOf(hvVar.mo29370c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29370c() && (a16 = C4799iv.m14841a(this.f8761b, hvVar.f8761b)) != 0) {
            return a16;
        }
        int compareTo4 = Boolean.valueOf(mo29374d()).compareTo(Boolean.valueOf(hvVar.mo29374d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29374d() && (a15 = C4799iv.m14841a(this.f8763c, hvVar.f8763c)) != 0) {
            return a15;
        }
        int compareTo5 = Boolean.valueOf(mo29375e()).compareTo(Boolean.valueOf(hvVar.mo29375e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29375e() && (a14 = C4799iv.m14839a(this.f8754a, hvVar.f8754a)) != 0) {
            return a14;
        }
        int compareTo6 = Boolean.valueOf(mo29377f()).compareTo(Boolean.valueOf(hvVar.mo29377f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29377f() && (a13 = C4799iv.m14839a(this.f8760b, hvVar.f8760b)) != 0) {
            return a13;
        }
        int compareTo7 = Boolean.valueOf(mo29378g()).compareTo(Boolean.valueOf(hvVar.mo29378g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29378g() && (a12 = C4799iv.m14841a(this.f8764d, hvVar.f8764d)) != 0) {
            return a12;
        }
        int compareTo8 = Boolean.valueOf(mo29379h()).compareTo(Boolean.valueOf(hvVar.mo29379h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29379h() && (a11 = C4799iv.m14841a(this.f8765e, hvVar.f8765e)) != 0) {
            return a11;
        }
        int compareTo9 = Boolean.valueOf(mo29381i()).compareTo(Boolean.valueOf(hvVar.mo29381i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29381i() && (a10 = C4799iv.m14841a(this.f8766f, hvVar.f8766f)) != 0) {
            return a10;
        }
        int compareTo10 = Boolean.valueOf(mo29382j()).compareTo(Boolean.valueOf(hvVar.mo29382j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29382j() && (a9 = C4799iv.m14841a(this.f8767g, hvVar.f8767g)) != 0) {
            return a9;
        }
        int compareTo11 = Boolean.valueOf(mo29383k()).compareTo(Boolean.valueOf(hvVar.mo29383k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29383k() && (a8 = C4799iv.m14841a(this.f8768h, hvVar.f8768h)) != 0) {
            return a8;
        }
        int compareTo12 = Boolean.valueOf(mo29384l()).compareTo(Boolean.valueOf(hvVar.mo29384l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo29384l() && (a7 = C4799iv.m14840a((Comparable) this.f8755a, (Comparable) hvVar.f8755a)) != 0) {
            return a7;
        }
        int compareTo13 = Boolean.valueOf(mo29385m()).compareTo(Boolean.valueOf(hvVar.mo29385m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo29385m() && (a6 = C4799iv.m14841a(this.f8769i, hvVar.f8769i)) != 0) {
            return a6;
        }
        int compareTo14 = Boolean.valueOf(mo29386n()).compareTo(Boolean.valueOf(hvVar.mo29386n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo29386n() && (a5 = C4799iv.m14847a(this.f8759a, hvVar.f8759a)) != 0) {
            return a5;
        }
        int compareTo15 = Boolean.valueOf(mo29387o()).compareTo(Boolean.valueOf(hvVar.mo29387o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (mo29387o() && (a4 = C4799iv.m14841a(this.f8770j, hvVar.f8770j)) != 0) {
            return a4;
        }
        int compareTo16 = Boolean.valueOf(mo29388p()).compareTo(Boolean.valueOf(hvVar.mo29388p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (mo29388p() && (a3 = C4799iv.m14839a(this.f8762c, hvVar.f8762c)) != 0) {
            return a3;
        }
        int compareTo17 = Boolean.valueOf(mo29389q()).compareTo(Boolean.valueOf(hvVar.mo29389q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (mo29389q() && (a2 = C4799iv.m14841a(this.f8771k, hvVar.f8771k)) != 0) {
            return a2;
        }
        int compareTo18 = Boolean.valueOf(mo29390r()).compareTo(Boolean.valueOf(hvVar.mo29390r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!mo29390r() || (a = C4799iv.m14841a(this.f8772l, hvVar.f8772l)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long mo29366a() {
        return this.f8754a;
    }

    /* renamed from: a */
    public String m14286a() {
        return this.f8757a;
    }

    /* renamed from: a */
    public void m14287a() {
        if (this.f8757a == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f8761b == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f8763c == null) {
            throw new C4813jg("Required field 'payload' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0012
            r7.mo29868f()
            r6.mo29366a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 20
            r3 = 11
            if (r0 == r2) goto L_0x00e1
            r2 = 21
            if (r0 == r2) goto L_0x00d8
            r2 = 12
            r4 = 10
            r5 = 1
            switch(r0) {
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00a4;
                case 6: goto L_0x0098;
                case 7: goto L_0x008f;
                case 8: goto L_0x0086;
                case 9: goto L_0x007c;
                case 10: goto L_0x0072;
                case 11: goto L_0x0068;
                case 12: goto L_0x005a;
                case 13: goto L_0x0050;
                case 14: goto L_0x0042;
                case 15: goto L_0x0038;
                case 16: goto L_0x002b;
                default: goto L_0x0026;
            }
        L_0x0026:
            com.xiaomi.push.C4815ji.m14965a(r7, r1)
            goto L_0x00e9
        L_0x002b:
            if (r1 != r4) goto L_0x0026
            long r0 = r7.mo29850a()
            r6.f8762c = r0
            r6.mo29373d(r5)
            goto L_0x00e9
        L_0x0038:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8770j = r0
            goto L_0x00e9
        L_0x0042:
            r0 = 2
            if (r1 != r0) goto L_0x0026
            boolean r0 = r7.mo29850a()
            r6.f8759a = r0
            r6.mo29371c(r5)
            goto L_0x00e9
        L_0x0050:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8769i = r0
            goto L_0x00e9
        L_0x005a:
            if (r1 != r2) goto L_0x0026
            com.xiaomi.push.hw r0 = new com.xiaomi.push.hw
            r0.<init>()
            r6.f8755a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r7)
            goto L_0x00e9
        L_0x0068:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8768h = r0
            goto L_0x00e9
        L_0x0072:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8767g = r0
            goto L_0x00e9
        L_0x007c:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8766f = r0
            goto L_0x00e9
        L_0x0086:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8765e = r0
            goto L_0x00e9
        L_0x008f:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8764d = r0
            goto L_0x00e9
        L_0x0098:
            if (r1 != r4) goto L_0x0026
            long r0 = r7.mo29850a()
            r6.f8760b = r0
            r6.mo29369b((boolean) r5)
            goto L_0x00e9
        L_0x00a4:
            if (r1 != r4) goto L_0x0026
            long r0 = r7.mo29850a()
            r6.f8754a = r0
            r6.mo29367a((boolean) r5)
            goto L_0x00e9
        L_0x00b0:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8763c = r0
            goto L_0x00e9
        L_0x00b9:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8761b = r0
            goto L_0x00e9
        L_0x00c2:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8757a = r0
            goto L_0x00e9
        L_0x00cb:
            if (r1 != r2) goto L_0x0026
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r6.f8756a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r7)
            goto L_0x00e9
        L_0x00d8:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8772l = r0
            goto L_0x00e9
        L_0x00e1:
            if (r1 != r3) goto L_0x0026
            java.lang.String r0 = r7.mo29850a()
            r6.f8771k = r0
        L_0x00e9:
            r7.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4772hv.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29367a(boolean z) {
        this.f8758a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14290a() {
        return this.f8756a != null;
    }

    /* renamed from: a */
    public boolean m14291a(C4772hv hvVar) {
        if (hvVar == null) {
            return false;
        }
        boolean a = mo29366a();
        boolean a2 = hvVar.mo29366a();
        if ((a || a2) && (!a || !a2 || !this.f8756a.compareTo(hvVar.f8756a))) {
            return false;
        }
        boolean b = mo29368b();
        boolean b2 = hvVar.mo29368b();
        if ((b || b2) && (!b || !b2 || !this.f8757a.equals(hvVar.f8757a))) {
            return false;
        }
        boolean c = mo29370c();
        boolean c2 = hvVar.mo29370c();
        if ((c || c2) && (!c || !c2 || !this.f8761b.equals(hvVar.f8761b))) {
            return false;
        }
        boolean d = mo29374d();
        boolean d2 = hvVar.mo29374d();
        if ((d || d2) && (!d || !d2 || !this.f8763c.equals(hvVar.f8763c))) {
            return false;
        }
        boolean e = mo29375e();
        boolean e2 = hvVar.mo29375e();
        if ((e || e2) && (!e || !e2 || this.f8754a != hvVar.f8754a)) {
            return false;
        }
        boolean f = mo29377f();
        boolean f2 = hvVar.mo29377f();
        if ((f || f2) && (!f || !f2 || this.f8760b != hvVar.f8760b)) {
            return false;
        }
        boolean g = mo29378g();
        boolean g2 = hvVar.mo29378g();
        if ((g || g2) && (!g || !g2 || !this.f8764d.equals(hvVar.f8764d))) {
            return false;
        }
        boolean h = mo29379h();
        boolean h2 = hvVar.mo29379h();
        if ((h || h2) && (!h || !h2 || !this.f8765e.equals(hvVar.f8765e))) {
            return false;
        }
        boolean i = mo29381i();
        boolean i2 = hvVar.mo29381i();
        if ((i || i2) && (!i || !i2 || !this.f8766f.equals(hvVar.f8766f))) {
            return false;
        }
        boolean j = mo29382j();
        boolean j2 = hvVar.mo29382j();
        if ((j || j2) && (!j || !j2 || !this.f8767g.equals(hvVar.f8767g))) {
            return false;
        }
        boolean k = mo29383k();
        boolean k2 = hvVar.mo29383k();
        if ((k || k2) && (!k || !k2 || !this.f8768h.equals(hvVar.f8768h))) {
            return false;
        }
        boolean l = mo29384l();
        boolean l2 = hvVar.mo29384l();
        if ((l || l2) && (!l || !l2 || !this.f8755a.compareTo(hvVar.f8755a))) {
            return false;
        }
        boolean m = mo29385m();
        boolean m2 = hvVar.mo29385m();
        if ((m || m2) && (!m || !m2 || !this.f8769i.equals(hvVar.f8769i))) {
            return false;
        }
        boolean n = mo29386n();
        boolean n2 = hvVar.mo29386n();
        if ((n || n2) && (!n || !n2 || this.f8759a != hvVar.f8759a)) {
            return false;
        }
        boolean o = mo29387o();
        boolean o2 = hvVar.mo29387o();
        if ((o || o2) && (!o || !o2 || !this.f8770j.equals(hvVar.f8770j))) {
            return false;
        }
        boolean p = mo29388p();
        boolean p2 = hvVar.mo29388p();
        if ((p || p2) && (!p || !p2 || this.f8762c != hvVar.f8762c)) {
            return false;
        }
        boolean q = mo29389q();
        boolean q2 = hvVar.mo29389q();
        if ((q || q2) && (!q || !q2 || !this.f8771k.equals(hvVar.f8771k))) {
            return false;
        }
        boolean r = mo29390r();
        boolean r2 = hvVar.mo29390r();
        if (r || r2) {
            return r && r2 && this.f8772l.equals(hvVar.f8772l);
        }
        return true;
    }

    /* renamed from: b */
    public String mo29368b() {
        return this.f8761b;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29366a();
        jfVar.mo29857a(f8736a);
        if (this.f8756a != null && mo29366a()) {
            jfVar.mo29854a(f8735a);
            this.f8756a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8757a != null) {
            jfVar.mo29854a(f8737b);
            jfVar.mo29858a(this.f8757a);
            jfVar.mo29862b();
        }
        if (this.f8761b != null) {
            jfVar.mo29854a(f8738c);
            jfVar.mo29858a(this.f8761b);
            jfVar.mo29862b();
        }
        if (this.f8763c != null) {
            jfVar.mo29854a(f8739d);
            jfVar.mo29858a(this.f8763c);
            jfVar.mo29862b();
        }
        if (mo29375e()) {
            jfVar.mo29854a(f8740e);
            jfVar.mo29853a(this.f8754a);
            jfVar.mo29862b();
        }
        if (mo29377f()) {
            jfVar.mo29854a(f8741f);
            jfVar.mo29853a(this.f8760b);
            jfVar.mo29862b();
        }
        if (this.f8764d != null && mo29378g()) {
            jfVar.mo29854a(f8742g);
            jfVar.mo29858a(this.f8764d);
            jfVar.mo29862b();
        }
        if (this.f8765e != null && mo29379h()) {
            jfVar.mo29854a(f8743h);
            jfVar.mo29858a(this.f8765e);
            jfVar.mo29862b();
        }
        if (this.f8766f != null && mo29381i()) {
            jfVar.mo29854a(f8744i);
            jfVar.mo29858a(this.f8766f);
            jfVar.mo29862b();
        }
        if (this.f8767g != null && mo29382j()) {
            jfVar.mo29854a(f8745j);
            jfVar.mo29858a(this.f8767g);
            jfVar.mo29862b();
        }
        if (this.f8768h != null && mo29383k()) {
            jfVar.mo29854a(f8746k);
            jfVar.mo29858a(this.f8768h);
            jfVar.mo29862b();
        }
        if (this.f8755a != null && mo29384l()) {
            jfVar.mo29854a(f8747l);
            this.f8755a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8769i != null && mo29385m()) {
            jfVar.mo29854a(f8748m);
            jfVar.mo29858a(this.f8769i);
            jfVar.mo29862b();
        }
        if (mo29386n()) {
            jfVar.mo29854a(f8749n);
            jfVar.mo29861a(this.f8759a);
            jfVar.mo29862b();
        }
        if (this.f8770j != null && mo29387o()) {
            jfVar.mo29854a(f8750o);
            jfVar.mo29858a(this.f8770j);
            jfVar.mo29862b();
        }
        if (mo29388p()) {
            jfVar.mo29854a(f8751p);
            jfVar.mo29853a(this.f8762c);
            jfVar.mo29862b();
        }
        if (this.f8771k != null && mo29389q()) {
            jfVar.mo29854a(f8752q);
            jfVar.mo29858a(this.f8771k);
            jfVar.mo29862b();
        }
        if (this.f8772l != null && mo29390r()) {
            jfVar.mo29854a(f8753r);
            jfVar.mo29858a(this.f8772l);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29369b(boolean z) {
        this.f8758a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14295b() {
        return this.f8757a != null;
    }

    /* renamed from: c */
    public String mo29370c() {
        return this.f8763c;
    }

    /* renamed from: c */
    public void mo29371c(boolean z) {
        this.f8758a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14298c() {
        return this.f8761b != null;
    }

    /* renamed from: d */
    public void mo29373d(boolean z) {
        this.f8758a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo29374d() {
        return this.f8763c != null;
    }

    /* renamed from: e */
    public boolean mo29375e() {
        return this.f8758a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4772hv)) {
            return compareTo((C4772hv) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29377f() {
        return this.f8758a.get(1);
    }

    /* renamed from: g */
    public boolean mo29378g() {
        return this.f8764d != null;
    }

    /* renamed from: h */
    public boolean mo29379h() {
        return this.f8765e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29381i() {
        return this.f8766f != null;
    }

    /* renamed from: j */
    public boolean mo29382j() {
        return this.f8767g != null;
    }

    /* renamed from: k */
    public boolean mo29383k() {
        return this.f8768h != null;
    }

    /* renamed from: l */
    public boolean mo29384l() {
        return this.f8755a != null;
    }

    /* renamed from: m */
    public boolean mo29385m() {
        return this.f8769i != null;
    }

    /* renamed from: n */
    public boolean mo29386n() {
        return this.f8758a.get(2);
    }

    /* renamed from: o */
    public boolean mo29387o() {
        return this.f8770j != null;
    }

    /* renamed from: p */
    public boolean mo29388p() {
        return this.f8758a.get(3);
    }

    /* renamed from: q */
    public boolean mo29389q() {
        return this.f8771k != null;
    }

    /* renamed from: r */
    public boolean mo29390r() {
        return this.f8772l != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (mo29366a()) {
            sb.append("to:");
            C4775hy hyVar = this.f8756a;
            if (hyVar == null) {
                sb.append("null");
            } else {
                sb.append(hyVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f8757a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f8761b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f8763c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo29375e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f8754a);
        }
        if (mo29377f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f8760b);
        }
        if (mo29378g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f8764d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29379h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f8765e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29381i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f8766f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29382j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f8767g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29383k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f8768h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo29384l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C4773hw hwVar = this.f8755a;
            if (hwVar == null) {
                sb.append("null");
            } else {
                sb.append(hwVar);
            }
        }
        if (mo29385m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f8769i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo29386n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f8759a);
        }
        if (mo29387o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f8770j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (mo29388p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f8762c);
        }
        if (mo29389q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f8771k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (mo29390r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f8772l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
