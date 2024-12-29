package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.xiaomi.push.iq */
public class C4770iq implements C4777ix<C4770iq, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9673a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9674a = new C4799jn("XmPushActionSubscription");

    /* renamed from: b */
    private static final C4791jf f9675b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9676c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9677d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9678e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9679f = new C4791jf("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4791jf f9680g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9681h = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 8);

    /* renamed from: a */
    public C4755ib f9682a;

    /* renamed from: a */
    public String f9683a;

    /* renamed from: a */
    public List<String> f9684a;

    /* renamed from: b */
    public String f9685b;

    /* renamed from: c */
    public String f9686c;

    /* renamed from: d */
    public String f9687d;

    /* renamed from: e */
    public String f9688e;

    /* renamed from: f */
    public String f9689f;

    /* renamed from: a */
    public int compareTo(C4770iq iqVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4770iq.class.equals(iqVar.getClass())) {
            return C4770iq.class.getName().compareTo(iqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25701a()).compareTo(Boolean.valueOf(iqVar.mo25701a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25701a() && (a8 = C4778iy.m15232a(this.f9683a, iqVar.f9683a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo25703b()).compareTo(Boolean.valueOf(iqVar.mo25703b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25703b() && (a7 = C4778iy.m15231a((Comparable) this.f9682a, (Comparable) iqVar.f9682a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo25705c()).compareTo(Boolean.valueOf(iqVar.mo25705c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25705c() && (a6 = C4778iy.m15232a(this.f9685b, iqVar.f9685b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo25708d()).compareTo(Boolean.valueOf(iqVar.mo25708d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25708d() && (a5 = C4778iy.m15232a(this.f9686c, iqVar.f9686c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo25710e()).compareTo(Boolean.valueOf(iqVar.mo25710e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25710e() && (a4 = C4778iy.m15232a(this.f9687d, iqVar.f9687d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo25712f()).compareTo(Boolean.valueOf(iqVar.mo25712f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25712f() && (a3 = C4778iy.m15232a(this.f9688e, iqVar.f9688e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo25713g()).compareTo(Boolean.valueOf(iqVar.mo25713g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25713g() && (a2 = C4778iy.m15232a(this.f9689f, iqVar.f9689f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo25714h()).compareTo(Boolean.valueOf(iqVar.mo25714h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo25714h() || (a = C4778iy.m15234a((List) this.f9684a, (List) iqVar.f9684a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4770iq mo25700a(String str) {
        this.f9685b = str;
        return this;
    }

    /* renamed from: a */
    public void mo25701a() {
        if (this.f9685b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9686c == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9687d == null) {
            throw new C4795jj("Required field 'topic' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r5) {
        /*
            r4 = this;
            r5.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r5.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0012
            r5.mo25834f()
            r4.mo25701a()
            return
        L_0x0012:
            short r0 = r0.f9822a
            r2 = 11
            switch(r0) {
                case 1: goto L_0x0080;
                case 2: goto L_0x0071;
                case 3: goto L_0x0068;
                case 4: goto L_0x005f;
                case 5: goto L_0x0056;
                case 6: goto L_0x004d;
                case 7: goto L_0x0044;
                case 8: goto L_0x001e;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.xiaomi.push.C4797jl.m15328a(r5, r1)
            goto L_0x0088
        L_0x001e:
            r0 = 15
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.jg r0 = r5.mo25816a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9824a
            r1.<init>(r2)
            r4.f9684a = r1
            r1 = 0
        L_0x0030:
            int r2 = r0.f9824a
            if (r1 >= r2) goto L_0x0040
            java.lang.String r2 = r5.mo25816a()
            java.util.List<java.lang.String> r3 = r4.f9684a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0040:
            r5.mo25837i()
            goto L_0x0088
        L_0x0044:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9689f = r0
            goto L_0x0088
        L_0x004d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9688e = r0
            goto L_0x0088
        L_0x0056:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9687d = r0
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9686c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9685b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r4.f9682a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r5)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9683a = r0
        L_0x0088:
            r5.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4770iq.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public boolean m15115a() {
        return this.f9683a != null;
    }

    /* renamed from: a */
    public boolean m15116a(C4770iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean a = mo25701a();
        boolean a2 = iqVar.mo25701a();
        if ((a || a2) && (!a || !a2 || !this.f9683a.equals(iqVar.f9683a))) {
            return false;
        }
        boolean b = mo25703b();
        boolean b2 = iqVar.mo25703b();
        if ((b || b2) && (!b || !b2 || !this.f9682a.compareTo(iqVar.f9682a))) {
            return false;
        }
        boolean c = mo25705c();
        boolean c2 = iqVar.mo25705c();
        if ((c || c2) && (!c || !c2 || !this.f9685b.equals(iqVar.f9685b))) {
            return false;
        }
        boolean d = mo25708d();
        boolean d2 = iqVar.mo25708d();
        if ((d || d2) && (!d || !d2 || !this.f9686c.equals(iqVar.f9686c))) {
            return false;
        }
        boolean e = mo25710e();
        boolean e2 = iqVar.mo25710e();
        if ((e || e2) && (!e || !e2 || !this.f9687d.equals(iqVar.f9687d))) {
            return false;
        }
        boolean f = mo25712f();
        boolean f2 = iqVar.mo25712f();
        if ((f || f2) && (!f || !f2 || !this.f9688e.equals(iqVar.f9688e))) {
            return false;
        }
        boolean g = mo25713g();
        boolean g2 = iqVar.mo25713g();
        if ((g || g2) && (!g || !g2 || !this.f9689f.equals(iqVar.f9689f))) {
            return false;
        }
        boolean h = mo25714h();
        boolean h2 = iqVar.mo25714h();
        if (h || h2) {
            return h && h2 && this.f9684a.equals(iqVar.f9684a);
        }
        return true;
    }

    /* renamed from: b */
    public C4770iq mo25702b(String str) {
        this.f9686c = str;
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25701a();
        jiVar.mo25823a(f9674a);
        if (this.f9683a != null && mo25701a()) {
            jiVar.mo25820a(f9673a);
            jiVar.mo25824a(this.f9683a);
            jiVar.mo25828b();
        }
        if (this.f9682a != null && mo25703b()) {
            jiVar.mo25820a(f9675b);
            this.f9682a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9685b != null) {
            jiVar.mo25820a(f9676c);
            jiVar.mo25824a(this.f9685b);
            jiVar.mo25828b();
        }
        if (this.f9686c != null) {
            jiVar.mo25820a(f9677d);
            jiVar.mo25824a(this.f9686c);
            jiVar.mo25828b();
        }
        if (this.f9687d != null) {
            jiVar.mo25820a(f9678e);
            jiVar.mo25824a(this.f9687d);
            jiVar.mo25828b();
        }
        if (this.f9688e != null && mo25712f()) {
            jiVar.mo25820a(f9679f);
            jiVar.mo25824a(this.f9688e);
            jiVar.mo25828b();
        }
        if (this.f9689f != null && mo25713g()) {
            jiVar.mo25820a(f9680g);
            jiVar.mo25824a(this.f9689f);
            jiVar.mo25828b();
        }
        if (this.f9684a != null && mo25714h()) {
            jiVar.mo25820a(f9681h);
            jiVar.mo25821a(new C4792jg((byte) 11, this.f9684a.size()));
            for (String a : this.f9684a) {
                jiVar.mo25824a(a);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25703b() {
        return this.f9682a != null;
    }

    /* renamed from: c */
    public C4770iq mo25704c(String str) {
        this.f9687d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo25705c() {
        return this.f9685b != null;
    }

    /* renamed from: d */
    public C4770iq mo25707d(String str) {
        this.f9688e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo25708d() {
        return this.f9686c != null;
    }

    /* renamed from: e */
    public C4770iq mo25709e(String str) {
        this.f9689f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo25710e() {
        return this.f9687d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4770iq)) {
            return compareTo((C4770iq) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25712f() {
        return this.f9688e != null;
    }

    /* renamed from: g */
    public boolean mo25713g() {
        return this.f9689f != null;
    }

    /* renamed from: h */
    public boolean mo25714h() {
        return this.f9684a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (mo25701a()) {
            sb.append("debug:");
            String str = this.f9683a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25703b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9682a;
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
        String str2 = this.f9685b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9686c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f9687d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo25712f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9688e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25713g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f9689f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25714h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f9684a;
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
