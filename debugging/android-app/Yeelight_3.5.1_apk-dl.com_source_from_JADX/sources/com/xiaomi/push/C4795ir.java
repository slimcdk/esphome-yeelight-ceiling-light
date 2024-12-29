package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.xiaomi.push.ir */
public class C4795ir implements C4798iu<C4795ir, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9221a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9222a = new C4817jk("XmPushActionUnSubscription");

    /* renamed from: b */
    private static final C4809jc f9223b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9224c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9225d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9226e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f9227f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f9228g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f9229h = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 8);

    /* renamed from: a */
    public C4775hy f9230a;

    /* renamed from: a */
    public String f9231a;

    /* renamed from: a */
    public List<String> f9232a;

    /* renamed from: b */
    public String f9233b;

    /* renamed from: c */
    public String f9234c;

    /* renamed from: d */
    public String f9235d;

    /* renamed from: e */
    public String f9236e;

    /* renamed from: f */
    public String f9237f;

    /* renamed from: a */
    public int compareTo(C4795ir irVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29815a()).compareTo(Boolean.valueOf(irVar.mo29815a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29815a() && (a8 = C4799iv.m14841a(this.f9231a, irVar.f9231a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo29817b()).compareTo(Boolean.valueOf(irVar.mo29817b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29817b() && (a7 = C4799iv.m14840a((Comparable) this.f9230a, (Comparable) irVar.f9230a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo29819c()).compareTo(Boolean.valueOf(irVar.mo29819c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29819c() && (a6 = C4799iv.m14841a(this.f9233b, irVar.f9233b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo29822d()).compareTo(Boolean.valueOf(irVar.mo29822d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29822d() && (a5 = C4799iv.m14841a(this.f9234c, irVar.f9234c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo29824e()).compareTo(Boolean.valueOf(irVar.mo29824e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29824e() && (a4 = C4799iv.m14841a(this.f9235d, irVar.f9235d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo29826f()).compareTo(Boolean.valueOf(irVar.mo29826f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29826f() && (a3 = C4799iv.m14841a(this.f9236e, irVar.f9236e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo29827g()).compareTo(Boolean.valueOf(irVar.mo29827g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29827g() && (a2 = C4799iv.m14841a(this.f9237f, irVar.f9237f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo29828h()).compareTo(Boolean.valueOf(irVar.mo29828h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo29828h() || (a = C4799iv.m14843a((List) this.f9232a, (List) irVar.f9232a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4795ir mo29814a(String str) {
        this.f9233b = str;
        return this;
    }

    /* renamed from: a */
    public void mo29815a() {
        if (this.f9233b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9234c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9235d == null) {
            throw new C4813jg("Required field 'topic' was not present! Struct: " + toString());
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
            r4.mo29815a()
            return
        L_0x0012:
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r5, r1)
            goto L_0x0088
        L_0x001e:
            r0 = 15
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.jd r0 = r5.mo29850a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9293a
            r1.<init>(r2)
            r4.f9232a = r1
            r1 = 0
        L_0x0030:
            int r2 = r0.f9293a
            if (r1 >= r2) goto L_0x0040
            java.lang.String r2 = r5.mo29850a()
            java.util.List<java.lang.String> r3 = r4.f9232a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0040:
            r5.mo29871i()
            goto L_0x0088
        L_0x0044:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9237f = r0
            goto L_0x0088
        L_0x004d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9236e = r0
            goto L_0x0088
        L_0x0056:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9235d = r0
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9234c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9233b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r4.f9230a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r5)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9231a = r0
        L_0x0088:
            r5.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4795ir.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public boolean m14799a() {
        return this.f9231a != null;
    }

    /* renamed from: a */
    public boolean m14800a(C4795ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean a = mo29815a();
        boolean a2 = irVar.mo29815a();
        if ((a || a2) && (!a || !a2 || !this.f9231a.equals(irVar.f9231a))) {
            return false;
        }
        boolean b = mo29817b();
        boolean b2 = irVar.mo29817b();
        if ((b || b2) && (!b || !b2 || !this.f9230a.compareTo(irVar.f9230a))) {
            return false;
        }
        boolean c = mo29819c();
        boolean c2 = irVar.mo29819c();
        if ((c || c2) && (!c || !c2 || !this.f9233b.equals(irVar.f9233b))) {
            return false;
        }
        boolean d = mo29822d();
        boolean d2 = irVar.mo29822d();
        if ((d || d2) && (!d || !d2 || !this.f9234c.equals(irVar.f9234c))) {
            return false;
        }
        boolean e = mo29824e();
        boolean e2 = irVar.mo29824e();
        if ((e || e2) && (!e || !e2 || !this.f9235d.equals(irVar.f9235d))) {
            return false;
        }
        boolean f = mo29826f();
        boolean f2 = irVar.mo29826f();
        if ((f || f2) && (!f || !f2 || !this.f9236e.equals(irVar.f9236e))) {
            return false;
        }
        boolean g = mo29827g();
        boolean g2 = irVar.mo29827g();
        if ((g || g2) && (!g || !g2 || !this.f9237f.equals(irVar.f9237f))) {
            return false;
        }
        boolean h = mo29828h();
        boolean h2 = irVar.mo29828h();
        if (h || h2) {
            return h && h2 && this.f9232a.equals(irVar.f9232a);
        }
        return true;
    }

    /* renamed from: b */
    public C4795ir mo29816b(String str) {
        this.f9234c = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29815a();
        jfVar.mo29857a(f9222a);
        if (this.f9231a != null && mo29815a()) {
            jfVar.mo29854a(f9221a);
            jfVar.mo29858a(this.f9231a);
            jfVar.mo29862b();
        }
        if (this.f9230a != null && mo29817b()) {
            jfVar.mo29854a(f9223b);
            this.f9230a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9233b != null) {
            jfVar.mo29854a(f9224c);
            jfVar.mo29858a(this.f9233b);
            jfVar.mo29862b();
        }
        if (this.f9234c != null) {
            jfVar.mo29854a(f9225d);
            jfVar.mo29858a(this.f9234c);
            jfVar.mo29862b();
        }
        if (this.f9235d != null) {
            jfVar.mo29854a(f9226e);
            jfVar.mo29858a(this.f9235d);
            jfVar.mo29862b();
        }
        if (this.f9236e != null && mo29826f()) {
            jfVar.mo29854a(f9227f);
            jfVar.mo29858a(this.f9236e);
            jfVar.mo29862b();
        }
        if (this.f9237f != null && mo29827g()) {
            jfVar.mo29854a(f9228g);
            jfVar.mo29858a(this.f9237f);
            jfVar.mo29862b();
        }
        if (this.f9232a != null && mo29828h()) {
            jfVar.mo29854a(f9229h);
            jfVar.mo29855a(new C4810jd((byte) 11, this.f9232a.size()));
            for (String a : this.f9232a) {
                jfVar.mo29858a(a);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29817b() {
        return this.f9230a != null;
    }

    /* renamed from: c */
    public C4795ir mo29818c(String str) {
        this.f9235d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo29819c() {
        return this.f9233b != null;
    }

    /* renamed from: d */
    public C4795ir mo29821d(String str) {
        this.f9236e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29822d() {
        return this.f9234c != null;
    }

    /* renamed from: e */
    public C4795ir mo29823e(String str) {
        this.f9237f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo29824e() {
        return this.f9235d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4795ir)) {
            return compareTo((C4795ir) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29826f() {
        return this.f9236e != null;
    }

    /* renamed from: g */
    public boolean mo29827g() {
        return this.f9237f != null;
    }

    /* renamed from: h */
    public boolean mo29828h() {
        return this.f9232a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (mo29815a()) {
            sb.append("debug:");
            String str = this.f9231a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29817b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9230a;
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
        String str2 = this.f9233b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9234c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f9235d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo29826f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9236e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29827g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f9237f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29828h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f9232a;
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
