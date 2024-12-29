package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ie */
public class C4782ie implements C4798iu<C4782ie, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8916a = new C4809jc("", (byte) 12, 2);

    /* renamed from: a */
    private static final C4817jk f8917a = new C4817jk("XmPushActionCommandResult");

    /* renamed from: b */
    private static final C4809jc f8918b = new C4809jc("", (byte) 11, 3);

    /* renamed from: c */
    private static final C4809jc f8919c = new C4809jc("", (byte) 11, 4);

    /* renamed from: d */
    private static final C4809jc f8920d = new C4809jc("", (byte) 11, 5);

    /* renamed from: e */
    private static final C4809jc f8921e = new C4809jc("", (byte) 10, 7);

    /* renamed from: f */
    private static final C4809jc f8922f = new C4809jc("", (byte) 11, 8);

    /* renamed from: g */
    private static final C4809jc f8923g = new C4809jc("", (byte) 11, 9);

    /* renamed from: h */
    private static final C4809jc f8924h = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 10);

    /* renamed from: i */
    private static final C4809jc f8925i = new C4809jc("", (byte) 11, 12);

    /* renamed from: j */
    private static final C4809jc f8926j = new C4809jc("", (byte) 2, 13);

    /* renamed from: a */
    public long f8927a;

    /* renamed from: a */
    public C4775hy f8928a;

    /* renamed from: a */
    public String f8929a;

    /* renamed from: a */
    private BitSet f8930a = new BitSet(2);

    /* renamed from: a */
    public List<String> f8931a;

    /* renamed from: a */
    public boolean f8932a = true;

    /* renamed from: b */
    public String f8933b;

    /* renamed from: c */
    public String f8934c;

    /* renamed from: d */
    public String f8935d;

    /* renamed from: e */
    public String f8936e;

    /* renamed from: f */
    public String f8937f;

    /* renamed from: a */
    public int compareTo(C4782ie ieVar) {
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
        if (!getClass().equals(ieVar.getClass())) {
            return getClass().getName().compareTo(ieVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29541a()).compareTo(Boolean.valueOf(ieVar.mo29541a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29541a() && (a10 = C4799iv.m14840a((Comparable) this.f8928a, (Comparable) ieVar.f8928a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo29543b()).compareTo(Boolean.valueOf(ieVar.mo29543b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29543b() && (a9 = C4799iv.m14841a(this.f8929a, ieVar.f8929a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo29545c()).compareTo(Boolean.valueOf(ieVar.mo29545c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29545c() && (a8 = C4799iv.m14841a(this.f8933b, ieVar.f8933b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo29547d()).compareTo(Boolean.valueOf(ieVar.mo29547d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29547d() && (a7 = C4799iv.m14841a(this.f8934c, ieVar.f8934c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo29548e()).compareTo(Boolean.valueOf(ieVar.mo29548e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29548e() && (a6 = C4799iv.m14839a(this.f8927a, ieVar.f8927a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo29550f()).compareTo(Boolean.valueOf(ieVar.mo29550f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29550f() && (a5 = C4799iv.m14841a(this.f8935d, ieVar.f8935d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo29551g()).compareTo(Boolean.valueOf(ieVar.mo29551g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29551g() && (a4 = C4799iv.m14841a(this.f8936e, ieVar.f8936e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo29552h()).compareTo(Boolean.valueOf(ieVar.mo29552h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29552h() && (a3 = C4799iv.m14843a((List) this.f8931a, (List) ieVar.f8931a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo29554i()).compareTo(Boolean.valueOf(ieVar.mo29554i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29554i() && (a2 = C4799iv.m14841a(this.f8937f, ieVar.f8937f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo29555j()).compareTo(Boolean.valueOf(ieVar.mo29555j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo29555j() || (a = C4799iv.m14847a(this.f8932a, ieVar.f8932a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo29541a() {
        return this.f8929a;
    }

    /* renamed from: a */
    public List<String> m14485a() {
        return this.f8931a;
    }

    /* renamed from: a */
    public void m14486a() {
        if (this.f8929a == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f8933b == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f8934c == null) {
            throw new C4813jg("Required field 'cmdName' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0033
            r5.mo29868f()
            boolean r5 = r4.mo29548e()
            if (r5 == 0) goto L_0x0018
            r4.mo29541a()
            return
        L_0x0018:
            com.xiaomi.push.jg r5 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0033:
            short r0 = r0.f9291a
            r2 = 1
            r3 = 11
            switch(r0) {
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00a7;
                case 5: goto L_0x009e;
                case 6: goto L_0x003b;
                case 7: goto L_0x0090;
                case 8: goto L_0x0087;
                case 9: goto L_0x007e;
                case 10: goto L_0x0058;
                case 11: goto L_0x003b;
                case 12: goto L_0x004e;
                case 13: goto L_0x0040;
                default: goto L_0x003b;
            }
        L_0x003b:
            com.xiaomi.push.C4815ji.m14965a(r5, r1)
            goto L_0x00c7
        L_0x0040:
            r0 = 2
            if (r1 != r0) goto L_0x003b
            boolean r0 = r5.mo29850a()
            r4.f8932a = r0
            r4.mo29544b((boolean) r2)
            goto L_0x00c7
        L_0x004e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8937f = r0
            goto L_0x00c7
        L_0x0058:
            r0 = 15
            if (r1 != r0) goto L_0x003b
            com.xiaomi.push.jd r0 = r5.mo29850a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9293a
            r1.<init>(r2)
            r4.f8931a = r1
            r1 = 0
        L_0x006a:
            int r2 = r0.f9293a
            if (r1 >= r2) goto L_0x007a
            java.lang.String r2 = r5.mo29850a()
            java.util.List<java.lang.String> r3 = r4.f8931a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x006a
        L_0x007a:
            r5.mo29871i()
            goto L_0x00c7
        L_0x007e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8936e = r0
            goto L_0x00c7
        L_0x0087:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8935d = r0
            goto L_0x00c7
        L_0x0090:
            r0 = 10
            if (r1 != r0) goto L_0x003b
            long r0 = r5.mo29850a()
            r4.f8927a = r0
            r4.mo29542a((boolean) r2)
            goto L_0x00c7
        L_0x009e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8934c = r0
            goto L_0x00c7
        L_0x00a7:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8933b = r0
            goto L_0x00c7
        L_0x00b0:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo29850a()
            r4.f8929a = r0
            goto L_0x00c7
        L_0x00b9:
            r0 = 12
            if (r1 != r0) goto L_0x003b
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r4.f8928a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r5)
        L_0x00c7:
            r5.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4782ie.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29542a(boolean z) {
        this.f8930a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14489a() {
        return this.f8928a != null;
    }

    /* renamed from: a */
    public boolean m14490a(C4782ie ieVar) {
        if (ieVar == null) {
            return false;
        }
        boolean a = mo29541a();
        boolean a2 = ieVar.mo29541a();
        if ((a || a2) && (!a || !a2 || !this.f8928a.compareTo(ieVar.f8928a))) {
            return false;
        }
        boolean b = mo29543b();
        boolean b2 = ieVar.mo29543b();
        if ((b || b2) && (!b || !b2 || !this.f8929a.equals(ieVar.f8929a))) {
            return false;
        }
        boolean c = mo29545c();
        boolean c2 = ieVar.mo29545c();
        if ((c || c2) && (!c || !c2 || !this.f8933b.equals(ieVar.f8933b))) {
            return false;
        }
        boolean d = mo29547d();
        boolean d2 = ieVar.mo29547d();
        if (((d || d2) && (!d || !d2 || !this.f8934c.equals(ieVar.f8934c))) || this.f8927a != ieVar.f8927a) {
            return false;
        }
        boolean f = mo29550f();
        boolean f2 = ieVar.mo29550f();
        if ((f || f2) && (!f || !f2 || !this.f8935d.equals(ieVar.f8935d))) {
            return false;
        }
        boolean g = mo29551g();
        boolean g2 = ieVar.mo29551g();
        if ((g || g2) && (!g || !g2 || !this.f8936e.equals(ieVar.f8936e))) {
            return false;
        }
        boolean h = mo29552h();
        boolean h2 = ieVar.mo29552h();
        if ((h || h2) && (!h || !h2 || !this.f8931a.equals(ieVar.f8931a))) {
            return false;
        }
        boolean i = mo29554i();
        boolean i2 = ieVar.mo29554i();
        if ((i || i2) && (!i || !i2 || !this.f8937f.equals(ieVar.f8937f))) {
            return false;
        }
        boolean j = mo29555j();
        boolean j2 = ieVar.mo29555j();
        if (j || j2) {
            return j && j2 && this.f8932a == ieVar.f8932a;
        }
        return true;
    }

    /* renamed from: b */
    public String mo29543b() {
        return this.f8934c;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29541a();
        jfVar.mo29857a(f8917a);
        if (this.f8928a != null && mo29541a()) {
            jfVar.mo29854a(f8916a);
            this.f8928a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8929a != null) {
            jfVar.mo29854a(f8918b);
            jfVar.mo29858a(this.f8929a);
            jfVar.mo29862b();
        }
        if (this.f8933b != null) {
            jfVar.mo29854a(f8919c);
            jfVar.mo29858a(this.f8933b);
            jfVar.mo29862b();
        }
        if (this.f8934c != null) {
            jfVar.mo29854a(f8920d);
            jfVar.mo29858a(this.f8934c);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f8921e);
        jfVar.mo29853a(this.f8927a);
        jfVar.mo29862b();
        if (this.f8935d != null && mo29550f()) {
            jfVar.mo29854a(f8922f);
            jfVar.mo29858a(this.f8935d);
            jfVar.mo29862b();
        }
        if (this.f8936e != null && mo29551g()) {
            jfVar.mo29854a(f8923g);
            jfVar.mo29858a(this.f8936e);
            jfVar.mo29862b();
        }
        if (this.f8931a != null && mo29552h()) {
            jfVar.mo29854a(f8924h);
            jfVar.mo29855a(new C4810jd((byte) 11, this.f8931a.size()));
            for (String a : this.f8931a) {
                jfVar.mo29858a(a);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        if (this.f8937f != null && mo29554i()) {
            jfVar.mo29854a(f8925i);
            jfVar.mo29858a(this.f8937f);
            jfVar.mo29862b();
        }
        if (mo29555j()) {
            jfVar.mo29854a(f8926j);
            jfVar.mo29861a(this.f8932a);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29544b(boolean z) {
        this.f8930a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14494b() {
        return this.f8929a != null;
    }

    /* renamed from: c */
    public String mo29545c() {
        return this.f8937f;
    }

    /* renamed from: c */
    public boolean m14496c() {
        return this.f8933b != null;
    }

    /* renamed from: d */
    public boolean mo29547d() {
        return this.f8934c != null;
    }

    /* renamed from: e */
    public boolean mo29548e() {
        return this.f8930a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4782ie)) {
            return compareTo((C4782ie) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29550f() {
        return this.f8935d != null;
    }

    /* renamed from: g */
    public boolean mo29551g() {
        return this.f8936e != null;
    }

    /* renamed from: h */
    public boolean mo29552h() {
        return this.f8931a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29554i() {
        return this.f8937f != null;
    }

    /* renamed from: j */
    public boolean mo29555j() {
        return this.f8930a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (mo29541a()) {
            sb.append("target:");
            C4775hy hyVar = this.f8928a;
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
        String str = this.f8929a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f8933b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f8934c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f8927a);
        if (mo29550f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f8935d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29551g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f8936e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29552h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f8931a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo29554i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f8937f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29555j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f8932a);
        }
        sb.append(")");
        return sb.toString();
    }
}
