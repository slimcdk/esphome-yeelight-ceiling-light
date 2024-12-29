package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.id */
public class C4781id implements C4798iu<C4781id, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8894a = new C4809jc("", (byte) 12, 2);

    /* renamed from: a */
    private static final C4817jk f8895a = new C4817jk("XmPushActionCommand");

    /* renamed from: b */
    private static final C4809jc f8896b = new C4809jc("", (byte) 11, 3);

    /* renamed from: c */
    private static final C4809jc f8897c = new C4809jc("", (byte) 11, 4);

    /* renamed from: d */
    private static final C4809jc f8898d = new C4809jc("", (byte) 11, 5);

    /* renamed from: e */
    private static final C4809jc f8899e = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 6);

    /* renamed from: f */
    private static final C4809jc f8900f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f8901g = new C4809jc("", (byte) 11, 9);

    /* renamed from: h */
    private static final C4809jc f8902h = new C4809jc("", (byte) 2, 10);

    /* renamed from: i */
    private static final C4809jc f8903i = new C4809jc("", (byte) 2, 11);

    /* renamed from: j */
    private static final C4809jc f8904j = new C4809jc("", (byte) 10, 12);

    /* renamed from: a */
    public long f8905a;

    /* renamed from: a */
    public C4775hy f8906a;

    /* renamed from: a */
    public String f8907a;

    /* renamed from: a */
    private BitSet f8908a = new BitSet(3);

    /* renamed from: a */
    public List<String> f8909a;

    /* renamed from: a */
    public boolean f8910a = false;

    /* renamed from: b */
    public String f8911b;

    /* renamed from: b */
    public boolean f8912b = true;

    /* renamed from: c */
    public String f8913c;

    /* renamed from: d */
    public String f8914d;

    /* renamed from: e */
    public String f8915e;

    /* renamed from: a */
    public int compareTo(C4781id idVar) {
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
        if (!getClass().equals(idVar.getClass())) {
            return getClass().getName().compareTo(idVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29519a()).compareTo(Boolean.valueOf(idVar.mo29519a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29519a() && (a10 = C4799iv.m14840a((Comparable) this.f8906a, (Comparable) idVar.f8906a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo29523b()).compareTo(Boolean.valueOf(idVar.mo29523b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29523b() && (a9 = C4799iv.m14841a(this.f8907a, idVar.f8907a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo29526c()).compareTo(Boolean.valueOf(idVar.mo29526c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29526c() && (a8 = C4799iv.m14841a(this.f8911b, idVar.f8911b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo29529d()).compareTo(Boolean.valueOf(idVar.mo29529d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29529d() && (a7 = C4799iv.m14841a(this.f8913c, idVar.f8913c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo29531e()).compareTo(Boolean.valueOf(idVar.mo29531e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29531e() && (a6 = C4799iv.m14843a((List) this.f8909a, (List) idVar.f8909a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo29533f()).compareTo(Boolean.valueOf(idVar.mo29533f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29533f() && (a5 = C4799iv.m14841a(this.f8914d, idVar.f8914d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo29534g()).compareTo(Boolean.valueOf(idVar.mo29534g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29534g() && (a4 = C4799iv.m14841a(this.f8915e, idVar.f8915e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo29535h()).compareTo(Boolean.valueOf(idVar.mo29535h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29535h() && (a3 = C4799iv.m14847a(this.f8910a, idVar.f8910a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo29537i()).compareTo(Boolean.valueOf(idVar.mo29537i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29537i() && (a2 = C4799iv.m14847a(this.f8912b, idVar.f8912b)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo29538j()).compareTo(Boolean.valueOf(idVar.mo29538j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo29538j() || (a = C4799iv.m14839a(this.f8905a, idVar.f8905a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4781id mo29518a(String str) {
        this.f8907a = str;
        return this;
    }

    /* renamed from: a */
    public String mo29519a() {
        return this.f8913c;
    }

    /* renamed from: a */
    public void m14461a() {
        if (this.f8907a == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f8911b == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f8913c == null) {
            throw new C4813jg("Required field 'cmdName' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0012
            r6.mo29868f()
            r5.mo29519a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 2
            r3 = 1
            r4 = 11
            switch(r0) {
                case 2: goto L_0x009b;
                case 3: goto L_0x0092;
                case 4: goto L_0x0089;
                case 5: goto L_0x0080;
                case 6: goto L_0x005a;
                case 7: goto L_0x0051;
                case 8: goto L_0x001b;
                case 9: goto L_0x0048;
                case 10: goto L_0x003c;
                case 11: goto L_0x002f;
                case 12: goto L_0x0020;
                default: goto L_0x001b;
            }
        L_0x001b:
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x00a9
        L_0x0020:
            r0 = 10
            if (r1 != r0) goto L_0x001b
            long r0 = r6.mo29850a()
            r5.f8905a = r0
            r5.mo29525c((boolean) r3)
            goto L_0x00a9
        L_0x002f:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo29850a()
            r5.f8912b = r0
            r5.mo29522b((boolean) r3)
            goto L_0x00a9
        L_0x003c:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo29850a()
            r5.f8910a = r0
            r5.mo29520a((boolean) r3)
            goto L_0x00a9
        L_0x0048:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8915e = r0
            goto L_0x00a9
        L_0x0051:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8914d = r0
            goto L_0x00a9
        L_0x005a:
            r0 = 15
            if (r1 != r0) goto L_0x001b
            com.xiaomi.push.jd r0 = r6.mo29850a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9293a
            r1.<init>(r2)
            r5.f8909a = r1
            r1 = 0
        L_0x006c:
            int r2 = r0.f9293a
            if (r1 >= r2) goto L_0x007c
            java.lang.String r2 = r6.mo29850a()
            java.util.List<java.lang.String> r3 = r5.f8909a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x006c
        L_0x007c:
            r6.mo29871i()
            goto L_0x00a9
        L_0x0080:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8913c = r0
            goto L_0x00a9
        L_0x0089:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8911b = r0
            goto L_0x00a9
        L_0x0092:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8907a = r0
            goto L_0x00a9
        L_0x009b:
            r0 = 12
            if (r1 != r0) goto L_0x001b
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r5.f8906a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
        L_0x00a9:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4781id.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void m14463a(String str) {
        if (this.f8909a == null) {
            this.f8909a = new ArrayList();
        }
        this.f8909a.add(str);
    }

    /* renamed from: a */
    public void mo29520a(boolean z) {
        this.f8908a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14465a() {
        return this.f8906a != null;
    }

    /* renamed from: a */
    public boolean m14466a(C4781id idVar) {
        if (idVar == null) {
            return false;
        }
        boolean a = mo29519a();
        boolean a2 = idVar.mo29519a();
        if ((a || a2) && (!a || !a2 || !this.f8906a.compareTo(idVar.f8906a))) {
            return false;
        }
        boolean b = mo29523b();
        boolean b2 = idVar.mo29523b();
        if ((b || b2) && (!b || !b2 || !this.f8907a.equals(idVar.f8907a))) {
            return false;
        }
        boolean c = mo29526c();
        boolean c2 = idVar.mo29526c();
        if ((c || c2) && (!c || !c2 || !this.f8911b.equals(idVar.f8911b))) {
            return false;
        }
        boolean d = mo29529d();
        boolean d2 = idVar.mo29529d();
        if ((d || d2) && (!d || !d2 || !this.f8913c.equals(idVar.f8913c))) {
            return false;
        }
        boolean e = mo29531e();
        boolean e2 = idVar.mo29531e();
        if ((e || e2) && (!e || !e2 || !this.f8909a.equals(idVar.f8909a))) {
            return false;
        }
        boolean f = mo29533f();
        boolean f2 = idVar.mo29533f();
        if ((f || f2) && (!f || !f2 || !this.f8914d.equals(idVar.f8914d))) {
            return false;
        }
        boolean g = mo29534g();
        boolean g2 = idVar.mo29534g();
        if ((g || g2) && (!g || !g2 || !this.f8915e.equals(idVar.f8915e))) {
            return false;
        }
        boolean h = mo29535h();
        boolean h2 = idVar.mo29535h();
        if ((h || h2) && (!h || !h2 || this.f8910a != idVar.f8910a)) {
            return false;
        }
        boolean i = mo29537i();
        boolean i2 = idVar.mo29537i();
        if ((i || i2) && (!i || !i2 || this.f8912b != idVar.f8912b)) {
            return false;
        }
        boolean j = mo29538j();
        boolean j2 = idVar.mo29538j();
        if (j || j2) {
            return j && j2 && this.f8905a == idVar.f8905a;
        }
        return true;
    }

    /* renamed from: b */
    public C4781id mo29521b(String str) {
        this.f8911b = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29519a();
        jfVar.mo29857a(f8895a);
        if (this.f8906a != null && mo29519a()) {
            jfVar.mo29854a(f8894a);
            this.f8906a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8907a != null) {
            jfVar.mo29854a(f8896b);
            jfVar.mo29858a(this.f8907a);
            jfVar.mo29862b();
        }
        if (this.f8911b != null) {
            jfVar.mo29854a(f8897c);
            jfVar.mo29858a(this.f8911b);
            jfVar.mo29862b();
        }
        if (this.f8913c != null) {
            jfVar.mo29854a(f8898d);
            jfVar.mo29858a(this.f8913c);
            jfVar.mo29862b();
        }
        if (this.f8909a != null && mo29531e()) {
            jfVar.mo29854a(f8899e);
            jfVar.mo29855a(new C4810jd((byte) 11, this.f8909a.size()));
            for (String a : this.f8909a) {
                jfVar.mo29858a(a);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        if (this.f8914d != null && mo29533f()) {
            jfVar.mo29854a(f8900f);
            jfVar.mo29858a(this.f8914d);
            jfVar.mo29862b();
        }
        if (this.f8915e != null && mo29534g()) {
            jfVar.mo29854a(f8901g);
            jfVar.mo29858a(this.f8915e);
            jfVar.mo29862b();
        }
        if (mo29535h()) {
            jfVar.mo29854a(f8902h);
            jfVar.mo29861a(this.f8910a);
            jfVar.mo29862b();
        }
        if (mo29537i()) {
            jfVar.mo29854a(f8903i);
            jfVar.mo29861a(this.f8912b);
            jfVar.mo29862b();
        }
        if (mo29538j()) {
            jfVar.mo29854a(f8904j);
            jfVar.mo29853a(this.f8905a);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29522b(boolean z) {
        this.f8908a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29523b() {
        return this.f8907a != null;
    }

    /* renamed from: c */
    public C4781id mo29524c(String str) {
        this.f8913c = str;
        return this;
    }

    /* renamed from: c */
    public void mo29525c(boolean z) {
        this.f8908a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo29526c() {
        return this.f8911b != null;
    }

    /* renamed from: d */
    public C4781id mo29528d(String str) {
        this.f8914d = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29529d() {
        return this.f8913c != null;
    }

    /* renamed from: e */
    public C4781id mo29530e(String str) {
        this.f8915e = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo29531e() {
        return this.f8909a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4781id)) {
            return compareTo((C4781id) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29533f() {
        return this.f8914d != null;
    }

    /* renamed from: g */
    public boolean mo29534g() {
        return this.f8915e != null;
    }

    /* renamed from: h */
    public boolean mo29535h() {
        return this.f8908a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29537i() {
        return this.f8908a.get(1);
    }

    /* renamed from: j */
    public boolean mo29538j() {
        return this.f8908a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (mo29519a()) {
            sb.append("target:");
            C4775hy hyVar = this.f8906a;
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
        String str = this.f8907a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f8911b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f8913c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo29531e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f8909a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo29533f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f8914d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29534g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f8915e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29535h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f8910a);
        }
        if (mo29537i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f8912b);
        }
        if (mo29538j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f8905a);
        }
        sb.append(")");
        return sb.toString();
    }
}
