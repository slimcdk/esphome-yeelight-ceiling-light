package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.xiaomi.push.in */
public class C4791in implements C4798iu<C4791in, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9138a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9139a = new C4817jk("XmPushActionSubscription");

    /* renamed from: b */
    private static final C4809jc f9140b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9141c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9142d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9143e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f9144f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f9145g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f9146h = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 8);

    /* renamed from: a */
    public C4775hy f9147a;

    /* renamed from: a */
    public String f9148a;

    /* renamed from: a */
    public List<String> f9149a;

    /* renamed from: b */
    public String f9150b;

    /* renamed from: c */
    public String f9151c;

    /* renamed from: d */
    public String f9152d;

    /* renamed from: e */
    public String f9153e;

    /* renamed from: f */
    public String f9154f;

    /* renamed from: a */
    public int compareTo(C4791in inVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29741a()).compareTo(Boolean.valueOf(inVar.mo29741a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29741a() && (a8 = C4799iv.m14841a(this.f9148a, inVar.f9148a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo29743b()).compareTo(Boolean.valueOf(inVar.mo29743b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29743b() && (a7 = C4799iv.m14840a((Comparable) this.f9147a, (Comparable) inVar.f9147a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo29745c()).compareTo(Boolean.valueOf(inVar.mo29745c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29745c() && (a6 = C4799iv.m14841a(this.f9150b, inVar.f9150b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo29748d()).compareTo(Boolean.valueOf(inVar.mo29748d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29748d() && (a5 = C4799iv.m14841a(this.f9151c, inVar.f9151c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo29750e()).compareTo(Boolean.valueOf(inVar.mo29750e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29750e() && (a4 = C4799iv.m14841a(this.f9152d, inVar.f9152d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo29752f()).compareTo(Boolean.valueOf(inVar.mo29752f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29752f() && (a3 = C4799iv.m14841a(this.f9153e, inVar.f9153e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo29753g()).compareTo(Boolean.valueOf(inVar.mo29753g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29753g() && (a2 = C4799iv.m14841a(this.f9154f, inVar.f9154f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo29754h()).compareTo(Boolean.valueOf(inVar.mo29754h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo29754h() || (a = C4799iv.m14843a((List) this.f9149a, (List) inVar.f9149a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4791in mo29740a(String str) {
        this.f9150b = str;
        return this;
    }

    /* renamed from: a */
    public void mo29741a() {
        if (this.f9150b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9151c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9152d == null) {
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
            r4.mo29741a()
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
            r4.f9149a = r1
            r1 = 0
        L_0x0030:
            int r2 = r0.f9293a
            if (r1 >= r2) goto L_0x0040
            java.lang.String r2 = r5.mo29850a()
            java.util.List<java.lang.String> r3 = r4.f9149a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0040:
            r5.mo29871i()
            goto L_0x0088
        L_0x0044:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9154f = r0
            goto L_0x0088
        L_0x004d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9153e = r0
            goto L_0x0088
        L_0x0056:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9152d = r0
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9151c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9150b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r4.f9147a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r5)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo29850a()
            r4.f9148a = r0
        L_0x0088:
            r5.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4791in.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public boolean m14721a() {
        return this.f9148a != null;
    }

    /* renamed from: a */
    public boolean m14722a(C4791in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean a = mo29741a();
        boolean a2 = inVar.mo29741a();
        if ((a || a2) && (!a || !a2 || !this.f9148a.equals(inVar.f9148a))) {
            return false;
        }
        boolean b = mo29743b();
        boolean b2 = inVar.mo29743b();
        if ((b || b2) && (!b || !b2 || !this.f9147a.compareTo(inVar.f9147a))) {
            return false;
        }
        boolean c = mo29745c();
        boolean c2 = inVar.mo29745c();
        if ((c || c2) && (!c || !c2 || !this.f9150b.equals(inVar.f9150b))) {
            return false;
        }
        boolean d = mo29748d();
        boolean d2 = inVar.mo29748d();
        if ((d || d2) && (!d || !d2 || !this.f9151c.equals(inVar.f9151c))) {
            return false;
        }
        boolean e = mo29750e();
        boolean e2 = inVar.mo29750e();
        if ((e || e2) && (!e || !e2 || !this.f9152d.equals(inVar.f9152d))) {
            return false;
        }
        boolean f = mo29752f();
        boolean f2 = inVar.mo29752f();
        if ((f || f2) && (!f || !f2 || !this.f9153e.equals(inVar.f9153e))) {
            return false;
        }
        boolean g = mo29753g();
        boolean g2 = inVar.mo29753g();
        if ((g || g2) && (!g || !g2 || !this.f9154f.equals(inVar.f9154f))) {
            return false;
        }
        boolean h = mo29754h();
        boolean h2 = inVar.mo29754h();
        if (h || h2) {
            return h && h2 && this.f9149a.equals(inVar.f9149a);
        }
        return true;
    }

    /* renamed from: b */
    public C4791in mo29742b(String str) {
        this.f9151c = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29741a();
        jfVar.mo29857a(f9139a);
        if (this.f9148a != null && mo29741a()) {
            jfVar.mo29854a(f9138a);
            jfVar.mo29858a(this.f9148a);
            jfVar.mo29862b();
        }
        if (this.f9147a != null && mo29743b()) {
            jfVar.mo29854a(f9140b);
            this.f9147a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9150b != null) {
            jfVar.mo29854a(f9141c);
            jfVar.mo29858a(this.f9150b);
            jfVar.mo29862b();
        }
        if (this.f9151c != null) {
            jfVar.mo29854a(f9142d);
            jfVar.mo29858a(this.f9151c);
            jfVar.mo29862b();
        }
        if (this.f9152d != null) {
            jfVar.mo29854a(f9143e);
            jfVar.mo29858a(this.f9152d);
            jfVar.mo29862b();
        }
        if (this.f9153e != null && mo29752f()) {
            jfVar.mo29854a(f9144f);
            jfVar.mo29858a(this.f9153e);
            jfVar.mo29862b();
        }
        if (this.f9154f != null && mo29753g()) {
            jfVar.mo29854a(f9145g);
            jfVar.mo29858a(this.f9154f);
            jfVar.mo29862b();
        }
        if (this.f9149a != null && mo29754h()) {
            jfVar.mo29854a(f9146h);
            jfVar.mo29855a(new C4810jd((byte) 11, this.f9149a.size()));
            for (String a : this.f9149a) {
                jfVar.mo29858a(a);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29743b() {
        return this.f9147a != null;
    }

    /* renamed from: c */
    public C4791in mo29744c(String str) {
        this.f9152d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo29745c() {
        return this.f9150b != null;
    }

    /* renamed from: d */
    public C4791in mo29747d(String str) {
        this.f9153e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29748d() {
        return this.f9151c != null;
    }

    /* renamed from: e */
    public C4791in mo29749e(String str) {
        this.f9154f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo29750e() {
        return this.f9152d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4791in)) {
            return compareTo((C4791in) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29752f() {
        return this.f9153e != null;
    }

    /* renamed from: g */
    public boolean mo29753g() {
        return this.f9154f != null;
    }

    /* renamed from: h */
    public boolean mo29754h() {
        return this.f9149a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (mo29741a()) {
            sb.append("debug:");
            String str = this.f9148a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29743b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9147a;
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
        String str2 = this.f9150b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9151c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f9152d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo29752f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9153e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29753g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f9154f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29754h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f9149a;
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
