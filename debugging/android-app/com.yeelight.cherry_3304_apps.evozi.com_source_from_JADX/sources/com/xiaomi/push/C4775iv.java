package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.iv */
public class C4775iv implements C4777ix<C4775iv, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9773a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9774a = new C4799jn("XmPushActionUnSubscriptionResult");

    /* renamed from: b */
    private static final C4791jf f9775b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9776c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9777d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9778e = new C4791jf("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4791jf f9779f = new C4791jf("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4791jf f9780g = new C4791jf("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4791jf f9781h = new C4791jf("", (byte) 11, 9);

    /* renamed from: i */
    private static final C4791jf f9782i = new C4791jf("", (byte) 11, 10);

    /* renamed from: a */
    public long f9783a;

    /* renamed from: a */
    public C4755ib f9784a;

    /* renamed from: a */
    public String f9785a;

    /* renamed from: a */
    private BitSet f9786a = new BitSet(1);

    /* renamed from: b */
    public String f9787b;

    /* renamed from: c */
    public String f9788c;

    /* renamed from: d */
    public String f9789d;

    /* renamed from: e */
    public String f9790e;

    /* renamed from: f */
    public String f9791f;

    /* renamed from: g */
    public String f9792g;

    /* renamed from: a */
    public int compareTo(C4775iv ivVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4775iv.class.equals(ivVar.getClass())) {
            return C4775iv.class.getName().compareTo(ivVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25792a()).compareTo(Boolean.valueOf(ivVar.mo25792a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25792a() && (a9 = C4778iy.m15232a(this.f9785a, ivVar.f9785a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo25794b()).compareTo(Boolean.valueOf(ivVar.mo25794b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25794b() && (a8 = C4778iy.m15231a((Comparable) this.f9784a, (Comparable) ivVar.f9784a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo25795c()).compareTo(Boolean.valueOf(ivVar.mo25795c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25795c() && (a7 = C4778iy.m15232a(this.f9787b, ivVar.f9787b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo25797d()).compareTo(Boolean.valueOf(ivVar.mo25797d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25797d() && (a6 = C4778iy.m15232a(this.f9788c, ivVar.f9788c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo25798e()).compareTo(Boolean.valueOf(ivVar.mo25798e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25798e() && (a5 = C4778iy.m15230a(this.f9783a, ivVar.f9783a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo25800f()).compareTo(Boolean.valueOf(ivVar.mo25800f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25800f() && (a4 = C4778iy.m15232a(this.f9789d, ivVar.f9789d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo25801g()).compareTo(Boolean.valueOf(ivVar.mo25801g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25801g() && (a3 = C4778iy.m15232a(this.f9790e, ivVar.f9790e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo25802h()).compareTo(Boolean.valueOf(ivVar.mo25802h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25802h() && (a2 = C4778iy.m15232a(this.f9791f, ivVar.f9791f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo25804i()).compareTo(Boolean.valueOf(ivVar.mo25804i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo25804i() || (a = C4778iy.m15232a(this.f9792g, ivVar.f9792g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo25792a() {
        return this.f9790e;
    }

    /* renamed from: a */
    public void m15208a() {
        if (this.f9787b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r4) {
        /*
            r3 = this;
            r4.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r4.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0012
            r4.mo25834f()
            r3.mo25792a()
            return
        L_0x0012:
            short r0 = r0.f9822a
            r2 = 11
            switch(r0) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0062;
                case 3: goto L_0x0059;
                case 4: goto L_0x0050;
                case 5: goto L_0x0019;
                case 6: goto L_0x0041;
                case 7: goto L_0x0038;
                case 8: goto L_0x002f;
                case 9: goto L_0x0026;
                case 10: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.xiaomi.push.C4797jl.m15328a(r4, r1)
            goto L_0x0079
        L_0x001d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9792g = r0
            goto L_0x0079
        L_0x0026:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9791f = r0
            goto L_0x0079
        L_0x002f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9790e = r0
            goto L_0x0079
        L_0x0038:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9789d = r0
            goto L_0x0079
        L_0x0041:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r4.mo25816a()
            r3.f9783a = r0
            r0 = 1
            r3.mo25793a((boolean) r0)
            goto L_0x0079
        L_0x0050:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9788c = r0
            goto L_0x0079
        L_0x0059:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9787b = r0
            goto L_0x0079
        L_0x0062:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r3.f9784a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r4)
            goto L_0x0079
        L_0x0071:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9785a = r0
        L_0x0079:
            r4.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4775iv.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25793a(boolean z) {
        this.f9786a.set(0, z);
    }

    /* renamed from: a */
    public boolean m15211a() {
        return this.f9785a != null;
    }

    /* renamed from: a */
    public boolean m15212a(C4775iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean a = mo25792a();
        boolean a2 = ivVar.mo25792a();
        if ((a || a2) && (!a || !a2 || !this.f9785a.equals(ivVar.f9785a))) {
            return false;
        }
        boolean b = mo25794b();
        boolean b2 = ivVar.mo25794b();
        if ((b || b2) && (!b || !b2 || !this.f9784a.compareTo(ivVar.f9784a))) {
            return false;
        }
        boolean c = mo25795c();
        boolean c2 = ivVar.mo25795c();
        if ((c || c2) && (!c || !c2 || !this.f9787b.equals(ivVar.f9787b))) {
            return false;
        }
        boolean d = mo25797d();
        boolean d2 = ivVar.mo25797d();
        if ((d || d2) && (!d || !d2 || !this.f9788c.equals(ivVar.f9788c))) {
            return false;
        }
        boolean e = mo25798e();
        boolean e2 = ivVar.mo25798e();
        if ((e || e2) && (!e || !e2 || this.f9783a != ivVar.f9783a)) {
            return false;
        }
        boolean f = mo25800f();
        boolean f2 = ivVar.mo25800f();
        if ((f || f2) && (!f || !f2 || !this.f9789d.equals(ivVar.f9789d))) {
            return false;
        }
        boolean g = mo25801g();
        boolean g2 = ivVar.mo25801g();
        if ((g || g2) && (!g || !g2 || !this.f9790e.equals(ivVar.f9790e))) {
            return false;
        }
        boolean h = mo25802h();
        boolean h2 = ivVar.mo25802h();
        if ((h || h2) && (!h || !h2 || !this.f9791f.equals(ivVar.f9791f))) {
            return false;
        }
        boolean i = mo25804i();
        boolean i2 = ivVar.mo25804i();
        if (i || i2) {
            return i && i2 && this.f9792g.equals(ivVar.f9792g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo25794b() {
        return this.f9792g;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25792a();
        jiVar.mo25823a(f9774a);
        if (this.f9785a != null && mo25792a()) {
            jiVar.mo25820a(f9773a);
            jiVar.mo25824a(this.f9785a);
            jiVar.mo25828b();
        }
        if (this.f9784a != null && mo25794b()) {
            jiVar.mo25820a(f9775b);
            this.f9784a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9787b != null) {
            jiVar.mo25820a(f9776c);
            jiVar.mo25824a(this.f9787b);
            jiVar.mo25828b();
        }
        if (this.f9788c != null && mo25797d()) {
            jiVar.mo25820a(f9777d);
            jiVar.mo25824a(this.f9788c);
            jiVar.mo25828b();
        }
        if (mo25798e()) {
            jiVar.mo25820a(f9778e);
            jiVar.mo25819a(this.f9783a);
            jiVar.mo25828b();
        }
        if (this.f9789d != null && mo25800f()) {
            jiVar.mo25820a(f9779f);
            jiVar.mo25824a(this.f9789d);
            jiVar.mo25828b();
        }
        if (this.f9790e != null && mo25801g()) {
            jiVar.mo25820a(f9780g);
            jiVar.mo25824a(this.f9790e);
            jiVar.mo25828b();
        }
        if (this.f9791f != null && mo25802h()) {
            jiVar.mo25820a(f9781h);
            jiVar.mo25824a(this.f9791f);
            jiVar.mo25828b();
        }
        if (this.f9792g != null && mo25804i()) {
            jiVar.mo25820a(f9782i);
            jiVar.mo25824a(this.f9792g);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean m15215b() {
        return this.f9784a != null;
    }

    /* renamed from: c */
    public boolean mo25795c() {
        return this.f9787b != null;
    }

    /* renamed from: d */
    public boolean mo25797d() {
        return this.f9788c != null;
    }

    /* renamed from: e */
    public boolean mo25798e() {
        return this.f9786a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4775iv)) {
            return compareTo((C4775iv) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25800f() {
        return this.f9789d != null;
    }

    /* renamed from: g */
    public boolean mo25801g() {
        return this.f9790e != null;
    }

    /* renamed from: h */
    public boolean mo25802h() {
        return this.f9791f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25804i() {
        return this.f9792g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (mo25792a()) {
            sb.append("debug:");
            String str = this.f9785a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25794b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9784a;
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
        String str2 = this.f9787b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo25797d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9788c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25798e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f9783a);
        }
        if (mo25800f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9789d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25801g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f9790e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25802h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9791f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25804i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9792g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
