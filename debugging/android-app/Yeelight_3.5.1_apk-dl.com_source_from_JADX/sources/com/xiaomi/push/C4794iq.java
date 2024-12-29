package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.iq */
public class C4794iq implements C4798iu<C4794iq, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9201a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9202a = new C4817jk("XmPushActionUnRegistrationResult");

    /* renamed from: b */
    private static final C4809jc f9203b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9204c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9205d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9206e = new C4809jc("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4809jc f9207f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f9208g = new C4809jc("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4809jc f9209h = new C4809jc("", (byte) 10, 9);

    /* renamed from: i */
    private static final C4809jc f9210i = new C4809jc("", (byte) 10, 10);

    /* renamed from: a */
    public long f9211a;

    /* renamed from: a */
    public C4775hy f9212a;

    /* renamed from: a */
    public String f9213a;

    /* renamed from: a */
    private BitSet f9214a = new BitSet(3);

    /* renamed from: b */
    public long f9215b;

    /* renamed from: b */
    public String f9216b;

    /* renamed from: c */
    public long f9217c;

    /* renamed from: c */
    public String f9218c;

    /* renamed from: d */
    public String f9219d;

    /* renamed from: e */
    public String f9220e;

    /* renamed from: a */
    public int compareTo(C4794iq iqVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(iqVar.getClass())) {
            return getClass().getName().compareTo(iqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29797a()).compareTo(Boolean.valueOf(iqVar.mo29797a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29797a() && (a9 = C4799iv.m14841a(this.f9213a, iqVar.f9213a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo29800b()).compareTo(Boolean.valueOf(iqVar.mo29800b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29800b() && (a8 = C4799iv.m14840a((Comparable) this.f9212a, (Comparable) iqVar.f9212a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo29802c()).compareTo(Boolean.valueOf(iqVar.mo29802c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29802c() && (a7 = C4799iv.m14841a(this.f9216b, iqVar.f9216b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo29804d()).compareTo(Boolean.valueOf(iqVar.mo29804d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29804d() && (a6 = C4799iv.m14841a(this.f9218c, iqVar.f9218c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo29805e()).compareTo(Boolean.valueOf(iqVar.mo29805e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29805e() && (a5 = C4799iv.m14839a(this.f9211a, iqVar.f9211a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo29807f()).compareTo(Boolean.valueOf(iqVar.mo29807f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29807f() && (a4 = C4799iv.m14841a(this.f9219d, iqVar.f9219d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo29808g()).compareTo(Boolean.valueOf(iqVar.mo29808g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29808g() && (a3 = C4799iv.m14841a(this.f9220e, iqVar.f9220e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo29809h()).compareTo(Boolean.valueOf(iqVar.mo29809h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29809h() && (a2 = C4799iv.m14839a(this.f9215b, iqVar.f9215b)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo29811i()).compareTo(Boolean.valueOf(iqVar.mo29811i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo29811i() || (a = C4799iv.m14839a(this.f9217c, iqVar.f9217c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo29797a() {
        return this.f9220e;
    }

    /* renamed from: a */
    public void m14779a() {
        if (this.f9216b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9218c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r6) {
        /*
            r5 = this;
            r6.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r6.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0033
            r6.mo29868f()
            boolean r6 = r5.mo29805e()
            if (r6 == 0) goto L_0x0018
            r5.mo29797a()
            return
        L_0x0018:
            com.xiaomi.push.jg r6 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0033:
            short r0 = r0.f9291a
            r2 = 1
            r3 = 10
            r4 = 11
            switch(r0) {
                case 1: goto L_0x0098;
                case 2: goto L_0x0089;
                case 3: goto L_0x0080;
                case 4: goto L_0x0077;
                case 5: goto L_0x003d;
                case 6: goto L_0x006b;
                case 7: goto L_0x0062;
                case 8: goto L_0x0059;
                case 9: goto L_0x004d;
                case 10: goto L_0x0041;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x00a0
        L_0x0041:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo29850a()
            r5.f9217c = r0
            r5.mo29801c(r2)
            goto L_0x00a0
        L_0x004d:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo29850a()
            r5.f9215b = r0
            r5.mo29799b((boolean) r2)
            goto L_0x00a0
        L_0x0059:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo29850a()
            r5.f9220e = r0
            goto L_0x00a0
        L_0x0062:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo29850a()
            r5.f9219d = r0
            goto L_0x00a0
        L_0x006b:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo29850a()
            r5.f9211a = r0
            r5.mo29798a((boolean) r2)
            goto L_0x00a0
        L_0x0077:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo29850a()
            r5.f9218c = r0
            goto L_0x00a0
        L_0x0080:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo29850a()
            r5.f9216b = r0
            goto L_0x00a0
        L_0x0089:
            r0 = 12
            if (r1 != r0) goto L_0x003d
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r5.f9212a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
            goto L_0x00a0
        L_0x0098:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo29850a()
            r5.f9213a = r0
        L_0x00a0:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4794iq.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29798a(boolean z) {
        this.f9214a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14782a() {
        return this.f9213a != null;
    }

    /* renamed from: a */
    public boolean m14783a(C4794iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean a = mo29797a();
        boolean a2 = iqVar.mo29797a();
        if ((a || a2) && (!a || !a2 || !this.f9213a.equals(iqVar.f9213a))) {
            return false;
        }
        boolean b = mo29800b();
        boolean b2 = iqVar.mo29800b();
        if ((b || b2) && (!b || !b2 || !this.f9212a.compareTo(iqVar.f9212a))) {
            return false;
        }
        boolean c = mo29802c();
        boolean c2 = iqVar.mo29802c();
        if ((c || c2) && (!c || !c2 || !this.f9216b.equals(iqVar.f9216b))) {
            return false;
        }
        boolean d = mo29804d();
        boolean d2 = iqVar.mo29804d();
        if (((d || d2) && (!d || !d2 || !this.f9218c.equals(iqVar.f9218c))) || this.f9211a != iqVar.f9211a) {
            return false;
        }
        boolean f = mo29807f();
        boolean f2 = iqVar.mo29807f();
        if ((f || f2) && (!f || !f2 || !this.f9219d.equals(iqVar.f9219d))) {
            return false;
        }
        boolean g = mo29808g();
        boolean g2 = iqVar.mo29808g();
        if ((g || g2) && (!g || !g2 || !this.f9220e.equals(iqVar.f9220e))) {
            return false;
        }
        boolean h = mo29809h();
        boolean h2 = iqVar.mo29809h();
        if ((h || h2) && (!h || !h2 || this.f9215b != iqVar.f9215b)) {
            return false;
        }
        boolean i = mo29811i();
        boolean i2 = iqVar.mo29811i();
        if (i || i2) {
            return i && i2 && this.f9217c == iqVar.f9217c;
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29797a();
        jfVar.mo29857a(f9202a);
        if (this.f9213a != null && mo29797a()) {
            jfVar.mo29854a(f9201a);
            jfVar.mo29858a(this.f9213a);
            jfVar.mo29862b();
        }
        if (this.f9212a != null && mo29800b()) {
            jfVar.mo29854a(f9203b);
            this.f9212a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9216b != null) {
            jfVar.mo29854a(f9204c);
            jfVar.mo29858a(this.f9216b);
            jfVar.mo29862b();
        }
        if (this.f9218c != null) {
            jfVar.mo29854a(f9205d);
            jfVar.mo29858a(this.f9218c);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f9206e);
        jfVar.mo29853a(this.f9211a);
        jfVar.mo29862b();
        if (this.f9219d != null && mo29807f()) {
            jfVar.mo29854a(f9207f);
            jfVar.mo29858a(this.f9219d);
            jfVar.mo29862b();
        }
        if (this.f9220e != null && mo29808g()) {
            jfVar.mo29854a(f9208g);
            jfVar.mo29858a(this.f9220e);
            jfVar.mo29862b();
        }
        if (mo29809h()) {
            jfVar.mo29854a(f9209h);
            jfVar.mo29853a(this.f9215b);
            jfVar.mo29862b();
        }
        if (mo29811i()) {
            jfVar.mo29854a(f9210i);
            jfVar.mo29853a(this.f9217c);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29799b(boolean z) {
        this.f9214a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29800b() {
        return this.f9212a != null;
    }

    /* renamed from: c */
    public void mo29801c(boolean z) {
        this.f9214a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo29802c() {
        return this.f9216b != null;
    }

    /* renamed from: d */
    public boolean mo29804d() {
        return this.f9218c != null;
    }

    /* renamed from: e */
    public boolean mo29805e() {
        return this.f9214a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4794iq)) {
            return compareTo((C4794iq) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29807f() {
        return this.f9219d != null;
    }

    /* renamed from: g */
    public boolean mo29808g() {
        return this.f9220e != null;
    }

    /* renamed from: h */
    public boolean mo29809h() {
        return this.f9214a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29811i() {
        return this.f9214a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (mo29797a()) {
            sb.append("debug:");
            String str = this.f9213a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29800b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9212a;
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
        String str2 = this.f9216b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9218c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9211a);
        if (mo29807f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9219d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29808g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9220e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29809h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f9215b);
        }
        if (mo29811i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f9217c);
        }
        sb.append(")");
        return sb.toString();
    }
}
