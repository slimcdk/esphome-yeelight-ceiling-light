package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.im */
public class C4790im implements C4798iu<C4790im, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9112a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9113a = new C4817jk("XmPushActionSendMessage");

    /* renamed from: b */
    private static final C4809jc f9114b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9115c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9116d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9117e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f9118f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f9119g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f9120h = new C4809jc("", (byte) 12, 8);

    /* renamed from: i */
    private static final C4809jc f9121i = new C4809jc("", (byte) 2, 9);

    /* renamed from: j */
    private static final C4809jc f9122j = new C4809jc("", ParameterInitDefType.IntVec3Init, 10);

    /* renamed from: k */
    private static final C4809jc f9123k = new C4809jc("", (byte) 11, 11);

    /* renamed from: l */
    private static final C4809jc f9124l = new C4809jc("", (byte) 11, 12);

    /* renamed from: a */
    public C4772hv f9125a;

    /* renamed from: a */
    public C4775hy f9126a;

    /* renamed from: a */
    public String f9127a;

    /* renamed from: a */
    private BitSet f9128a = new BitSet(1);

    /* renamed from: a */
    public Map<String, String> f9129a;

    /* renamed from: a */
    public boolean f9130a = true;

    /* renamed from: b */
    public String f9131b;

    /* renamed from: c */
    public String f9132c;

    /* renamed from: d */
    public String f9133d;

    /* renamed from: e */
    public String f9134e;

    /* renamed from: f */
    public String f9135f;

    /* renamed from: g */
    public String f9136g;

    /* renamed from: h */
    public String f9137h;

    /* renamed from: a */
    public int compareTo(C4790im imVar) {
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
        if (!getClass().equals(imVar.getClass())) {
            return getClass().getName().compareTo(imVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29722a()).compareTo(Boolean.valueOf(imVar.mo29722a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29722a() && (a12 = C4799iv.m14841a(this.f9127a, imVar.f9127a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(mo29724b()).compareTo(Boolean.valueOf(imVar.mo29724b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29724b() && (a11 = C4799iv.m14840a((Comparable) this.f9126a, (Comparable) imVar.f9126a)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(mo29725c()).compareTo(Boolean.valueOf(imVar.mo29725c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29725c() && (a10 = C4799iv.m14841a(this.f9131b, imVar.f9131b)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(mo29727d()).compareTo(Boolean.valueOf(imVar.mo29727d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29727d() && (a9 = C4799iv.m14841a(this.f9132c, imVar.f9132c)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(mo29728e()).compareTo(Boolean.valueOf(imVar.mo29728e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29728e() && (a8 = C4799iv.m14841a(this.f9133d, imVar.f9133d)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(mo29730f()).compareTo(Boolean.valueOf(imVar.mo29730f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29730f() && (a7 = C4799iv.m14841a(this.f9134e, imVar.f9134e)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(mo29731g()).compareTo(Boolean.valueOf(imVar.mo29731g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29731g() && (a6 = C4799iv.m14841a(this.f9135f, imVar.f9135f)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(mo29732h()).compareTo(Boolean.valueOf(imVar.mo29732h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29732h() && (a5 = C4799iv.m14840a((Comparable) this.f9125a, (Comparable) imVar.f9125a)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(mo29734i()).compareTo(Boolean.valueOf(imVar.mo29734i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29734i() && (a4 = C4799iv.m14847a(this.f9130a, imVar.f9130a)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(mo29735j()).compareTo(Boolean.valueOf(imVar.mo29735j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29735j() && (a3 = C4799iv.m14844a((Map) this.f9129a, (Map) imVar.f9129a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(mo29736k()).compareTo(Boolean.valueOf(imVar.mo29736k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29736k() && (a2 = C4799iv.m14841a(this.f9136g, imVar.f9136g)) != 0) {
            return a2;
        }
        int compareTo12 = Boolean.valueOf(mo29737l()).compareTo(Boolean.valueOf(imVar.mo29737l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!mo29737l() || (a = C4799iv.m14841a(this.f9137h, imVar.f9137h)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4772hv mo29722a() {
        return this.f9125a;
    }

    /* renamed from: a */
    public String m14694a() {
        return this.f9131b;
    }

    /* renamed from: a */
    public void m14695a() {
        if (this.f9131b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9132c == null) {
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
            if (r1 != 0) goto L_0x0012
            r6.mo29868f()
            r5.mo29722a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 2
            r3 = 12
            r4 = 11
            switch(r0) {
                case 1: goto L_0x00b5;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009f;
                case 4: goto L_0x0096;
                case 5: goto L_0x008d;
                case 6: goto L_0x0084;
                case 7: goto L_0x007b;
                case 8: goto L_0x006e;
                case 9: goto L_0x0061;
                case 10: goto L_0x0035;
                case 11: goto L_0x002b;
                case 12: goto L_0x0021;
                default: goto L_0x001c;
            }
        L_0x001c:
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x00bd
        L_0x0021:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9137h = r0
            goto L_0x00bd
        L_0x002b:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9136g = r0
            goto L_0x00bd
        L_0x0035:
            r0 = 13
            if (r1 != r0) goto L_0x001c
            com.xiaomi.push.je r0 = r6.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r5.f9129a = r1
            r1 = 0
        L_0x0049:
            int r2 = r0.f9295a
            if (r1 >= r2) goto L_0x005d
            java.lang.String r2 = r6.mo29850a()
            java.lang.String r3 = r6.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f9129a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x005d:
            r6.mo29870h()
            goto L_0x00bd
        L_0x0061:
            if (r1 != r2) goto L_0x001c
            boolean r0 = r6.mo29850a()
            r5.f9130a = r0
            r0 = 1
            r5.mo29723a((boolean) r0)
            goto L_0x00bd
        L_0x006e:
            if (r1 != r3) goto L_0x001c
            com.xiaomi.push.hv r0 = new com.xiaomi.push.hv
            r0.<init>()
            r5.f9125a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
            goto L_0x00bd
        L_0x007b:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9135f = r0
            goto L_0x00bd
        L_0x0084:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9134e = r0
            goto L_0x00bd
        L_0x008d:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9133d = r0
            goto L_0x00bd
        L_0x0096:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9132c = r0
            goto L_0x00bd
        L_0x009f:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9131b = r0
            goto L_0x00bd
        L_0x00a8:
            if (r1 != r3) goto L_0x001c
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r5.f9126a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
            goto L_0x00bd
        L_0x00b5:
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.mo29850a()
            r5.f9127a = r0
        L_0x00bd:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4790im.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29723a(boolean z) {
        this.f9128a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14698a() {
        return this.f9127a != null;
    }

    /* renamed from: a */
    public boolean m14699a(C4790im imVar) {
        if (imVar == null) {
            return false;
        }
        boolean a = mo29722a();
        boolean a2 = imVar.mo29722a();
        if ((a || a2) && (!a || !a2 || !this.f9127a.equals(imVar.f9127a))) {
            return false;
        }
        boolean b = mo29724b();
        boolean b2 = imVar.mo29724b();
        if ((b || b2) && (!b || !b2 || !this.f9126a.compareTo(imVar.f9126a))) {
            return false;
        }
        boolean c = mo29725c();
        boolean c2 = imVar.mo29725c();
        if ((c || c2) && (!c || !c2 || !this.f9131b.equals(imVar.f9131b))) {
            return false;
        }
        boolean d = mo29727d();
        boolean d2 = imVar.mo29727d();
        if ((d || d2) && (!d || !d2 || !this.f9132c.equals(imVar.f9132c))) {
            return false;
        }
        boolean e = mo29728e();
        boolean e2 = imVar.mo29728e();
        if ((e || e2) && (!e || !e2 || !this.f9133d.equals(imVar.f9133d))) {
            return false;
        }
        boolean f = mo29730f();
        boolean f2 = imVar.mo29730f();
        if ((f || f2) && (!f || !f2 || !this.f9134e.equals(imVar.f9134e))) {
            return false;
        }
        boolean g = mo29731g();
        boolean g2 = imVar.mo29731g();
        if ((g || g2) && (!g || !g2 || !this.f9135f.equals(imVar.f9135f))) {
            return false;
        }
        boolean h = mo29732h();
        boolean h2 = imVar.mo29732h();
        if ((h || h2) && (!h || !h2 || !this.f9125a.compareTo(imVar.f9125a))) {
            return false;
        }
        boolean i = mo29734i();
        boolean i2 = imVar.mo29734i();
        if ((i || i2) && (!i || !i2 || this.f9130a != imVar.f9130a)) {
            return false;
        }
        boolean j = mo29735j();
        boolean j2 = imVar.mo29735j();
        if ((j || j2) && (!j || !j2 || !this.f9129a.equals(imVar.f9129a))) {
            return false;
        }
        boolean k = mo29736k();
        boolean k2 = imVar.mo29736k();
        if ((k || k2) && (!k || !k2 || !this.f9136g.equals(imVar.f9136g))) {
            return false;
        }
        boolean l = mo29737l();
        boolean l2 = imVar.mo29737l();
        if (l || l2) {
            return l && l2 && this.f9137h.equals(imVar.f9137h);
        }
        return true;
    }

    /* renamed from: b */
    public String mo29724b() {
        return this.f9132c;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29722a();
        jfVar.mo29857a(f9113a);
        if (this.f9127a != null && mo29722a()) {
            jfVar.mo29854a(f9112a);
            jfVar.mo29858a(this.f9127a);
            jfVar.mo29862b();
        }
        if (this.f9126a != null && mo29724b()) {
            jfVar.mo29854a(f9114b);
            this.f9126a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9131b != null) {
            jfVar.mo29854a(f9115c);
            jfVar.mo29858a(this.f9131b);
            jfVar.mo29862b();
        }
        if (this.f9132c != null) {
            jfVar.mo29854a(f9116d);
            jfVar.mo29858a(this.f9132c);
            jfVar.mo29862b();
        }
        if (this.f9133d != null && mo29728e()) {
            jfVar.mo29854a(f9117e);
            jfVar.mo29858a(this.f9133d);
            jfVar.mo29862b();
        }
        if (this.f9134e != null && mo29730f()) {
            jfVar.mo29854a(f9118f);
            jfVar.mo29858a(this.f9134e);
            jfVar.mo29862b();
        }
        if (this.f9135f != null && mo29731g()) {
            jfVar.mo29854a(f9119g);
            jfVar.mo29858a(this.f9135f);
            jfVar.mo29862b();
        }
        if (this.f9125a != null && mo29732h()) {
            jfVar.mo29854a(f9120h);
            this.f9125a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (mo29734i()) {
            jfVar.mo29854a(f9121i);
            jfVar.mo29861a(this.f9130a);
            jfVar.mo29862b();
        }
        if (this.f9129a != null && mo29735j()) {
            jfVar.mo29854a(f9122j);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f9129a.size()));
            for (Map.Entry next : this.f9129a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (this.f9136g != null && mo29736k()) {
            jfVar.mo29854a(f9123k);
            jfVar.mo29858a(this.f9136g);
            jfVar.mo29862b();
        }
        if (this.f9137h != null && mo29737l()) {
            jfVar.mo29854a(f9124l);
            jfVar.mo29858a(this.f9137h);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean m14702b() {
        return this.f9126a != null;
    }

    /* renamed from: c */
    public String mo29725c() {
        return this.f9134e;
    }

    /* renamed from: c */
    public boolean m14704c() {
        return this.f9131b != null;
    }

    /* renamed from: d */
    public String mo29727d() {
        return this.f9135f;
    }

    /* renamed from: d */
    public boolean m14706d() {
        return this.f9132c != null;
    }

    /* renamed from: e */
    public String mo29728e() {
        return this.f9136g;
    }

    /* renamed from: e */
    public boolean m14708e() {
        return this.f9133d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4790im)) {
            return compareTo((C4790im) obj);
        }
        return false;
    }

    /* renamed from: f */
    public String mo29730f() {
        return this.f9137h;
    }

    /* renamed from: f */
    public boolean m14710f() {
        return this.f9134e != null;
    }

    /* renamed from: g */
    public boolean mo29731g() {
        return this.f9135f != null;
    }

    /* renamed from: h */
    public boolean mo29732h() {
        return this.f9125a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29734i() {
        return this.f9128a.get(0);
    }

    /* renamed from: j */
    public boolean mo29735j() {
        return this.f9129a != null;
    }

    /* renamed from: k */
    public boolean mo29736k() {
        return this.f9136g != null;
    }

    /* renamed from: l */
    public boolean mo29737l() {
        return this.f9137h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (mo29722a()) {
            sb.append("debug:");
            String str = this.f9127a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29724b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9126a;
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
        String str2 = this.f9131b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9132c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo29728e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f9133d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29730f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f9134e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29731g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f9135f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29732h()) {
            sb.append(", ");
            sb.append("message:");
            C4772hv hvVar = this.f9125a;
            if (hvVar == null) {
                sb.append("null");
            } else {
                sb.append(hvVar);
            }
        }
        if (mo29734i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f9130a);
        }
        if (mo29735j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f9129a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo29736k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9136g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29737l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f9137h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
