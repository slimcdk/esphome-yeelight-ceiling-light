package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ir */
public class C4771ir implements C4777ix<C4771ir, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9690a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9691a = new C4799jn("XmPushActionSubscriptionResult");

    /* renamed from: b */
    private static final C4791jf f9692b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9693c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9694d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9695e = new C4791jf("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4791jf f9696f = new C4791jf("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4791jf f9697g = new C4791jf("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4791jf f9698h = new C4791jf("", (byte) 11, 9);

    /* renamed from: i */
    private static final C4791jf f9699i = new C4791jf("", (byte) 11, 10);

    /* renamed from: a */
    public long f9700a;

    /* renamed from: a */
    public C4755ib f9701a;

    /* renamed from: a */
    public String f9702a;

    /* renamed from: a */
    private BitSet f9703a = new BitSet(1);

    /* renamed from: b */
    public String f9704b;

    /* renamed from: c */
    public String f9705c;

    /* renamed from: d */
    public String f9706d;

    /* renamed from: e */
    public String f9707e;

    /* renamed from: f */
    public String f9708f;

    /* renamed from: g */
    public String f9709g;

    /* renamed from: a */
    public int compareTo(C4771ir irVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4771ir.class.equals(irVar.getClass())) {
            return C4771ir.class.getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25718a()).compareTo(Boolean.valueOf(irVar.mo25718a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25718a() && (a9 = C4778iy.m15232a(this.f9702a, irVar.f9702a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo25720b()).compareTo(Boolean.valueOf(irVar.mo25720b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25720b() && (a8 = C4778iy.m15231a((Comparable) this.f9701a, (Comparable) irVar.f9701a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo25721c()).compareTo(Boolean.valueOf(irVar.mo25721c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25721c() && (a7 = C4778iy.m15232a(this.f9704b, irVar.f9704b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo25723d()).compareTo(Boolean.valueOf(irVar.mo25723d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25723d() && (a6 = C4778iy.m15232a(this.f9705c, irVar.f9705c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo25724e()).compareTo(Boolean.valueOf(irVar.mo25724e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25724e() && (a5 = C4778iy.m15230a(this.f9700a, irVar.f9700a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo25726f()).compareTo(Boolean.valueOf(irVar.mo25726f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25726f() && (a4 = C4778iy.m15232a(this.f9706d, irVar.f9706d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo25727g()).compareTo(Boolean.valueOf(irVar.mo25727g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25727g() && (a3 = C4778iy.m15232a(this.f9707e, irVar.f9707e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo25728h()).compareTo(Boolean.valueOf(irVar.mo25728h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25728h() && (a2 = C4778iy.m15232a(this.f9708f, irVar.f9708f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo25730i()).compareTo(Boolean.valueOf(irVar.mo25730i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo25730i() || (a = C4778iy.m15232a(this.f9709g, irVar.f9709g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo25718a() {
        return this.f9707e;
    }

    /* renamed from: a */
    public void m15131a() {
        if (this.f9704b == null) {
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
            r3.mo25718a()
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
            r3.f9709g = r0
            goto L_0x0079
        L_0x0026:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9708f = r0
            goto L_0x0079
        L_0x002f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9707e = r0
            goto L_0x0079
        L_0x0038:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9706d = r0
            goto L_0x0079
        L_0x0041:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r4.mo25816a()
            r3.f9700a = r0
            r0 = 1
            r3.mo25719a((boolean) r0)
            goto L_0x0079
        L_0x0050:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9705c = r0
            goto L_0x0079
        L_0x0059:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9704b = r0
            goto L_0x0079
        L_0x0062:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r3.f9701a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r4)
            goto L_0x0079
        L_0x0071:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo25816a()
            r3.f9702a = r0
        L_0x0079:
            r4.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4771ir.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25719a(boolean z) {
        this.f9703a.set(0, z);
    }

    /* renamed from: a */
    public boolean m15134a() {
        return this.f9702a != null;
    }

    /* renamed from: a */
    public boolean m15135a(C4771ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean a = mo25718a();
        boolean a2 = irVar.mo25718a();
        if ((a || a2) && (!a || !a2 || !this.f9702a.equals(irVar.f9702a))) {
            return false;
        }
        boolean b = mo25720b();
        boolean b2 = irVar.mo25720b();
        if ((b || b2) && (!b || !b2 || !this.f9701a.compareTo(irVar.f9701a))) {
            return false;
        }
        boolean c = mo25721c();
        boolean c2 = irVar.mo25721c();
        if ((c || c2) && (!c || !c2 || !this.f9704b.equals(irVar.f9704b))) {
            return false;
        }
        boolean d = mo25723d();
        boolean d2 = irVar.mo25723d();
        if ((d || d2) && (!d || !d2 || !this.f9705c.equals(irVar.f9705c))) {
            return false;
        }
        boolean e = mo25724e();
        boolean e2 = irVar.mo25724e();
        if ((e || e2) && (!e || !e2 || this.f9700a != irVar.f9700a)) {
            return false;
        }
        boolean f = mo25726f();
        boolean f2 = irVar.mo25726f();
        if ((f || f2) && (!f || !f2 || !this.f9706d.equals(irVar.f9706d))) {
            return false;
        }
        boolean g = mo25727g();
        boolean g2 = irVar.mo25727g();
        if ((g || g2) && (!g || !g2 || !this.f9707e.equals(irVar.f9707e))) {
            return false;
        }
        boolean h = mo25728h();
        boolean h2 = irVar.mo25728h();
        if ((h || h2) && (!h || !h2 || !this.f9708f.equals(irVar.f9708f))) {
            return false;
        }
        boolean i = mo25730i();
        boolean i2 = irVar.mo25730i();
        if (i || i2) {
            return i && i2 && this.f9709g.equals(irVar.f9709g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo25720b() {
        return this.f9709g;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25718a();
        jiVar.mo25823a(f9691a);
        if (this.f9702a != null && mo25718a()) {
            jiVar.mo25820a(f9690a);
            jiVar.mo25824a(this.f9702a);
            jiVar.mo25828b();
        }
        if (this.f9701a != null && mo25720b()) {
            jiVar.mo25820a(f9692b);
            this.f9701a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9704b != null) {
            jiVar.mo25820a(f9693c);
            jiVar.mo25824a(this.f9704b);
            jiVar.mo25828b();
        }
        if (this.f9705c != null && mo25723d()) {
            jiVar.mo25820a(f9694d);
            jiVar.mo25824a(this.f9705c);
            jiVar.mo25828b();
        }
        if (mo25724e()) {
            jiVar.mo25820a(f9695e);
            jiVar.mo25819a(this.f9700a);
            jiVar.mo25828b();
        }
        if (this.f9706d != null && mo25726f()) {
            jiVar.mo25820a(f9696f);
            jiVar.mo25824a(this.f9706d);
            jiVar.mo25828b();
        }
        if (this.f9707e != null && mo25727g()) {
            jiVar.mo25820a(f9697g);
            jiVar.mo25824a(this.f9707e);
            jiVar.mo25828b();
        }
        if (this.f9708f != null && mo25728h()) {
            jiVar.mo25820a(f9698h);
            jiVar.mo25824a(this.f9708f);
            jiVar.mo25828b();
        }
        if (this.f9709g != null && mo25730i()) {
            jiVar.mo25820a(f9699i);
            jiVar.mo25824a(this.f9709g);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean m15138b() {
        return this.f9701a != null;
    }

    /* renamed from: c */
    public boolean mo25721c() {
        return this.f9704b != null;
    }

    /* renamed from: d */
    public boolean mo25723d() {
        return this.f9705c != null;
    }

    /* renamed from: e */
    public boolean mo25724e() {
        return this.f9703a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4771ir)) {
            return compareTo((C4771ir) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25726f() {
        return this.f9706d != null;
    }

    /* renamed from: g */
    public boolean mo25727g() {
        return this.f9707e != null;
    }

    /* renamed from: h */
    public boolean mo25728h() {
        return this.f9708f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25730i() {
        return this.f9709g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (mo25718a()) {
            sb.append("debug:");
            String str = this.f9702a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25720b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9701a;
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
        String str2 = this.f9704b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo25723d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9705c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25724e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f9700a);
        }
        if (mo25726f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9706d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25727g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f9707e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25728h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9708f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25730i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9709g;
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
