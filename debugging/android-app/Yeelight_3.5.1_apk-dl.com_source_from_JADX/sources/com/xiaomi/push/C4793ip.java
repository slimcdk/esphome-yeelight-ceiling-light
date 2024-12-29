package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ip */
public class C4793ip implements C4798iu<C4793ip, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9175a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9176a = new C4817jk("XmPushActionUnRegistration");

    /* renamed from: b */
    private static final C4809jc f9177b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9178c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9179d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9180e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f9181f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f9182g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f9183h = new C4809jc("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4809jc f9184i = new C4809jc("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4809jc f9185j = new C4809jc("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4809jc f9186k = new C4809jc("", (byte) 2, 11);

    /* renamed from: l */
    private static final C4809jc f9187l = new C4809jc("", (byte) 10, 12);

    /* renamed from: a */
    public long f9188a;

    /* renamed from: a */
    public C4775hy f9189a;

    /* renamed from: a */
    public String f9190a;

    /* renamed from: a */
    private BitSet f9191a = new BitSet(2);

    /* renamed from: a */
    public boolean f9192a = true;

    /* renamed from: b */
    public String f9193b;

    /* renamed from: c */
    public String f9194c;

    /* renamed from: d */
    public String f9195d;

    /* renamed from: e */
    public String f9196e;

    /* renamed from: f */
    public String f9197f;

    /* renamed from: g */
    public String f9198g;

    /* renamed from: h */
    public String f9199h;

    /* renamed from: i */
    public String f9200i;

    /* renamed from: a */
    public int compareTo(C4793ip ipVar) {
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
        if (!getClass().equals(ipVar.getClass())) {
            return getClass().getName().compareTo(ipVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29774a()).compareTo(Boolean.valueOf(ipVar.mo29774a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29774a() && (a12 = C4799iv.m14841a(this.f9190a, ipVar.f9190a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(mo29778b()).compareTo(Boolean.valueOf(ipVar.mo29778b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29778b() && (a11 = C4799iv.m14840a((Comparable) this.f9189a, (Comparable) ipVar.f9189a)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(mo29780c()).compareTo(Boolean.valueOf(ipVar.mo29780c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29780c() && (a10 = C4799iv.m14841a(this.f9193b, ipVar.f9193b)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(mo29783d()).compareTo(Boolean.valueOf(ipVar.mo29783d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29783d() && (a9 = C4799iv.m14841a(this.f9194c, ipVar.f9194c)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(mo29785e()).compareTo(Boolean.valueOf(ipVar.mo29785e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29785e() && (a8 = C4799iv.m14841a(this.f9195d, ipVar.f9195d)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(mo29787f()).compareTo(Boolean.valueOf(ipVar.mo29787f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29787f() && (a7 = C4799iv.m14841a(this.f9196e, ipVar.f9196e)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(mo29788g()).compareTo(Boolean.valueOf(ipVar.mo29788g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29788g() && (a6 = C4799iv.m14841a(this.f9197f, ipVar.f9197f)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(mo29789h()).compareTo(Boolean.valueOf(ipVar.mo29789h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29789h() && (a5 = C4799iv.m14841a(this.f9198g, ipVar.f9198g)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(mo29791i()).compareTo(Boolean.valueOf(ipVar.mo29791i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29791i() && (a4 = C4799iv.m14841a(this.f9199h, ipVar.f9199h)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(mo29792j()).compareTo(Boolean.valueOf(ipVar.mo29792j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29792j() && (a3 = C4799iv.m14841a(this.f9200i, ipVar.f9200i)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(mo29793k()).compareTo(Boolean.valueOf(ipVar.mo29793k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29793k() && (a2 = C4799iv.m14847a(this.f9192a, ipVar.f9192a)) != 0) {
            return a2;
        }
        int compareTo12 = Boolean.valueOf(mo29794l()).compareTo(Boolean.valueOf(ipVar.mo29794l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!mo29794l() || (a = C4799iv.m14839a(this.f9188a, ipVar.f9188a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4793ip mo29773a(String str) {
        this.f9193b = str;
        return this;
    }

    /* renamed from: a */
    public void mo29774a() {
        if (this.f9193b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9194c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r5) {
        /*
            r4 = this;
            r5.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r5.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0012
            r5.mo29868f()
            r4.mo29774a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 1
            r3 = 11
            switch(r0) {
                case 1: goto L_0x0092;
                case 2: goto L_0x0083;
                case 3: goto L_0x007a;
                case 4: goto L_0x0071;
                case 5: goto L_0x0068;
                case 6: goto L_0x005f;
                case 7: goto L_0x0056;
                case 8: goto L_0x004d;
                case 9: goto L_0x0044;
                case 10: goto L_0x003b;
                case 11: goto L_0x002e;
                case 12: goto L_0x001f;
                default: goto L_0x001a;
            }
        L_0x001a:
            com.xiaomi.push.C4815ji.m14965a(r5, r1)
            goto L_0x009a
        L_0x001f:
            r0 = 10
            if (r1 != r0) goto L_0x001a
            long r0 = r5.mo29850a()
            r4.f9188a = r0
            r4.mo29777b((boolean) r2)
            goto L_0x009a
        L_0x002e:
            r0 = 2
            if (r1 != r0) goto L_0x001a
            boolean r0 = r5.mo29850a()
            r4.f9192a = r0
            r4.mo29775a((boolean) r2)
            goto L_0x009a
        L_0x003b:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9200i = r0
            goto L_0x009a
        L_0x0044:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9199h = r0
            goto L_0x009a
        L_0x004d:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9198g = r0
            goto L_0x009a
        L_0x0056:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9197f = r0
            goto L_0x009a
        L_0x005f:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9196e = r0
            goto L_0x009a
        L_0x0068:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9195d = r0
            goto L_0x009a
        L_0x0071:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9194c = r0
            goto L_0x009a
        L_0x007a:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9193b = r0
            goto L_0x009a
        L_0x0083:
            r0 = 12
            if (r1 != r0) goto L_0x001a
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r4.f9189a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r5)
            goto L_0x009a
        L_0x0092:
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.mo29850a()
            r4.f9190a = r0
        L_0x009a:
            r5.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4793ip.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29775a(boolean z) {
        this.f9191a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14758a() {
        return this.f9190a != null;
    }

    /* renamed from: a */
    public boolean m14759a(C4793ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        boolean a = mo29774a();
        boolean a2 = ipVar.mo29774a();
        if ((a || a2) && (!a || !a2 || !this.f9190a.equals(ipVar.f9190a))) {
            return false;
        }
        boolean b = mo29778b();
        boolean b2 = ipVar.mo29778b();
        if ((b || b2) && (!b || !b2 || !this.f9189a.compareTo(ipVar.f9189a))) {
            return false;
        }
        boolean c = mo29780c();
        boolean c2 = ipVar.mo29780c();
        if ((c || c2) && (!c || !c2 || !this.f9193b.equals(ipVar.f9193b))) {
            return false;
        }
        boolean d = mo29783d();
        boolean d2 = ipVar.mo29783d();
        if ((d || d2) && (!d || !d2 || !this.f9194c.equals(ipVar.f9194c))) {
            return false;
        }
        boolean e = mo29785e();
        boolean e2 = ipVar.mo29785e();
        if ((e || e2) && (!e || !e2 || !this.f9195d.equals(ipVar.f9195d))) {
            return false;
        }
        boolean f = mo29787f();
        boolean f2 = ipVar.mo29787f();
        if ((f || f2) && (!f || !f2 || !this.f9196e.equals(ipVar.f9196e))) {
            return false;
        }
        boolean g = mo29788g();
        boolean g2 = ipVar.mo29788g();
        if ((g || g2) && (!g || !g2 || !this.f9197f.equals(ipVar.f9197f))) {
            return false;
        }
        boolean h = mo29789h();
        boolean h2 = ipVar.mo29789h();
        if ((h || h2) && (!h || !h2 || !this.f9198g.equals(ipVar.f9198g))) {
            return false;
        }
        boolean i = mo29791i();
        boolean i2 = ipVar.mo29791i();
        if ((i || i2) && (!i || !i2 || !this.f9199h.equals(ipVar.f9199h))) {
            return false;
        }
        boolean j = mo29792j();
        boolean j2 = ipVar.mo29792j();
        if ((j || j2) && (!j || !j2 || !this.f9200i.equals(ipVar.f9200i))) {
            return false;
        }
        boolean k = mo29793k();
        boolean k2 = ipVar.mo29793k();
        if ((k || k2) && (!k || !k2 || this.f9192a != ipVar.f9192a)) {
            return false;
        }
        boolean l = mo29794l();
        boolean l2 = ipVar.mo29794l();
        if (l || l2) {
            return l && l2 && this.f9188a == ipVar.f9188a;
        }
        return true;
    }

    /* renamed from: b */
    public C4793ip mo29776b(String str) {
        this.f9194c = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29774a();
        jfVar.mo29857a(f9176a);
        if (this.f9190a != null && mo29774a()) {
            jfVar.mo29854a(f9175a);
            jfVar.mo29858a(this.f9190a);
            jfVar.mo29862b();
        }
        if (this.f9189a != null && mo29778b()) {
            jfVar.mo29854a(f9177b);
            this.f9189a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9193b != null) {
            jfVar.mo29854a(f9178c);
            jfVar.mo29858a(this.f9193b);
            jfVar.mo29862b();
        }
        if (this.f9194c != null) {
            jfVar.mo29854a(f9179d);
            jfVar.mo29858a(this.f9194c);
            jfVar.mo29862b();
        }
        if (this.f9195d != null && mo29785e()) {
            jfVar.mo29854a(f9180e);
            jfVar.mo29858a(this.f9195d);
            jfVar.mo29862b();
        }
        if (this.f9196e != null && mo29787f()) {
            jfVar.mo29854a(f9181f);
            jfVar.mo29858a(this.f9196e);
            jfVar.mo29862b();
        }
        if (this.f9197f != null && mo29788g()) {
            jfVar.mo29854a(f9182g);
            jfVar.mo29858a(this.f9197f);
            jfVar.mo29862b();
        }
        if (this.f9198g != null && mo29789h()) {
            jfVar.mo29854a(f9183h);
            jfVar.mo29858a(this.f9198g);
            jfVar.mo29862b();
        }
        if (this.f9199h != null && mo29791i()) {
            jfVar.mo29854a(f9184i);
            jfVar.mo29858a(this.f9199h);
            jfVar.mo29862b();
        }
        if (this.f9200i != null && mo29792j()) {
            jfVar.mo29854a(f9185j);
            jfVar.mo29858a(this.f9200i);
            jfVar.mo29862b();
        }
        if (mo29793k()) {
            jfVar.mo29854a(f9186k);
            jfVar.mo29861a(this.f9192a);
            jfVar.mo29862b();
        }
        if (mo29794l()) {
            jfVar.mo29854a(f9187l);
            jfVar.mo29853a(this.f9188a);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29777b(boolean z) {
        this.f9191a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29778b() {
        return this.f9189a != null;
    }

    /* renamed from: c */
    public C4793ip mo29779c(String str) {
        this.f9195d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo29780c() {
        return this.f9193b != null;
    }

    /* renamed from: d */
    public C4793ip mo29782d(String str) {
        this.f9197f = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29783d() {
        return this.f9194c != null;
    }

    /* renamed from: e */
    public C4793ip mo29784e(String str) {
        this.f9198g = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo29785e() {
        return this.f9195d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4793ip)) {
            return compareTo((C4793ip) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29787f() {
        return this.f9196e != null;
    }

    /* renamed from: g */
    public boolean mo29788g() {
        return this.f9197f != null;
    }

    /* renamed from: h */
    public boolean mo29789h() {
        return this.f9198g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29791i() {
        return this.f9199h != null;
    }

    /* renamed from: j */
    public boolean mo29792j() {
        return this.f9200i != null;
    }

    /* renamed from: k */
    public boolean mo29793k() {
        return this.f9191a.get(0);
    }

    /* renamed from: l */
    public boolean mo29794l() {
        return this.f9191a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (mo29774a()) {
            sb.append("debug:");
            String str = this.f9190a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29778b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9189a;
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
        String str2 = this.f9193b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9194c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo29785e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f9195d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29787f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f9196e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29788g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9197f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29789h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f9198g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29791i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f9199h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo29792j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f9200i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo29793k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f9192a);
        }
        if (mo29794l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f9188a);
        }
        sb.append(")");
        return sb.toString();
    }
}
