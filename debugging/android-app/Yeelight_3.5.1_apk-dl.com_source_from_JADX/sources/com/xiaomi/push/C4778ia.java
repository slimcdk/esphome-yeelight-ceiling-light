package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.ia */
public class C4778ia implements C4798iu<C4778ia, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8863a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8864a = new C4817jk("XmPushActionAckNotification");

    /* renamed from: b */
    private static final C4809jc f8865b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f8866c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8867d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8868e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f8869f = new C4809jc("", (byte) 10, 7);

    /* renamed from: g */
    private static final C4809jc f8870g = new C4809jc("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4809jc f8871h = new C4809jc("", ParameterInitDefType.IntVec3Init, 9);

    /* renamed from: i */
    private static final C4809jc f8872i = new C4809jc("", (byte) 11, 10);

    /* renamed from: j */
    private static final C4809jc f8873j = new C4809jc("", (byte) 11, 11);

    /* renamed from: a */
    public long f8874a = 0;

    /* renamed from: a */
    public C4775hy f8875a;

    /* renamed from: a */
    public String f8876a;

    /* renamed from: a */
    private BitSet f8877a = new BitSet(1);

    /* renamed from: a */
    public Map<String, String> f8878a;

    /* renamed from: b */
    public String f8879b;

    /* renamed from: c */
    public String f8880c;

    /* renamed from: d */
    public String f8881d;

    /* renamed from: e */
    public String f8882e;

    /* renamed from: f */
    public String f8883f;

    /* renamed from: g */
    public String f8884g;

    /* renamed from: a */
    public int compareTo(C4778ia iaVar) {
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
        if (!getClass().equals(iaVar.getClass())) {
            return getClass().getName().compareTo(iaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29480a()).compareTo(Boolean.valueOf(iaVar.mo29480a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29480a() && (a10 = C4799iv.m14841a(this.f8876a, iaVar.f8876a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo29483b()).compareTo(Boolean.valueOf(iaVar.mo29483b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29483b() && (a9 = C4799iv.m14840a((Comparable) this.f8875a, (Comparable) iaVar.f8875a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo29485c()).compareTo(Boolean.valueOf(iaVar.mo29485c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29485c() && (a8 = C4799iv.m14841a(this.f8879b, iaVar.f8879b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo29488d()).compareTo(Boolean.valueOf(iaVar.mo29488d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29488d() && (a7 = C4799iv.m14841a(this.f8880c, iaVar.f8880c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo29490e()).compareTo(Boolean.valueOf(iaVar.mo29490e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29490e() && (a6 = C4799iv.m14841a(this.f8881d, iaVar.f8881d)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo29492f()).compareTo(Boolean.valueOf(iaVar.mo29492f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29492f() && (a5 = C4799iv.m14839a(this.f8874a, iaVar.f8874a)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo29493g()).compareTo(Boolean.valueOf(iaVar.mo29493g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29493g() && (a4 = C4799iv.m14841a(this.f8882e, iaVar.f8882e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo29494h()).compareTo(Boolean.valueOf(iaVar.mo29494h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29494h() && (a3 = C4799iv.m14844a((Map) this.f8878a, (Map) iaVar.f8878a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo29496i()).compareTo(Boolean.valueOf(iaVar.mo29496i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29496i() && (a2 = C4799iv.m14841a(this.f8883f, iaVar.f8883f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo29497j()).compareTo(Boolean.valueOf(iaVar.mo29497j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo29497j() || (a = C4799iv.m14841a(this.f8884g, iaVar.f8884g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4778ia mo29477a(long j) {
        this.f8874a = j;
        mo29481a(true);
        return this;
    }

    /* renamed from: a */
    public C4778ia mo29478a(C4775hy hyVar) {
        this.f8875a = hyVar;
        return this;
    }

    /* renamed from: a */
    public C4778ia mo29479a(String str) {
        this.f8879b = str;
        return this;
    }

    /* renamed from: a */
    public String mo29480a() {
        return this.f8879b;
    }

    /* renamed from: a */
    public Map<String, String> m14419a() {
        return this.f8878a;
    }

    /* renamed from: a */
    public void m14420a() {
        if (this.f8879b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
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
            r5.mo29480a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 11
            switch(r0) {
                case 1: goto L_0x00a0;
                case 2: goto L_0x0091;
                case 3: goto L_0x0088;
                case 4: goto L_0x007f;
                case 5: goto L_0x0076;
                case 6: goto L_0x0019;
                case 7: goto L_0x0067;
                case 8: goto L_0x005e;
                case 9: goto L_0x0032;
                case 10: goto L_0x0028;
                case 11: goto L_0x001e;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x00a8
        L_0x001e:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8884g = r0
            goto L_0x00a8
        L_0x0028:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8883f = r0
            goto L_0x00a8
        L_0x0032:
            r0 = 13
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.je r0 = r6.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f9295a
            int r2 = r2 * 2
            r1.<init>(r2)
            r5.f8878a = r1
            r1 = 0
        L_0x0046:
            int r2 = r0.f9295a
            if (r1 >= r2) goto L_0x005a
            java.lang.String r2 = r6.mo29850a()
            java.lang.String r3 = r6.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f8878a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0046
        L_0x005a:
            r6.mo29870h()
            goto L_0x00a8
        L_0x005e:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8882e = r0
            goto L_0x00a8
        L_0x0067:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r6.mo29850a()
            r5.f8874a = r0
            r0 = 1
            r5.mo29481a((boolean) r0)
            goto L_0x00a8
        L_0x0076:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8881d = r0
            goto L_0x00a8
        L_0x007f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8880c = r0
            goto L_0x00a8
        L_0x0088:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8879b = r0
            goto L_0x00a8
        L_0x0091:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r5.f8875a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
            goto L_0x00a8
        L_0x00a0:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo29850a()
            r5.f8876a = r0
        L_0x00a8:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4778ia.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29481a(boolean z) {
        this.f8877a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14423a() {
        return this.f8876a != null;
    }

    /* renamed from: a */
    public boolean m14424a(C4778ia iaVar) {
        if (iaVar == null) {
            return false;
        }
        boolean a = mo29480a();
        boolean a2 = iaVar.mo29480a();
        if ((a || a2) && (!a || !a2 || !this.f8876a.equals(iaVar.f8876a))) {
            return false;
        }
        boolean b = mo29483b();
        boolean b2 = iaVar.mo29483b();
        if ((b || b2) && (!b || !b2 || !this.f8875a.compareTo(iaVar.f8875a))) {
            return false;
        }
        boolean c = mo29485c();
        boolean c2 = iaVar.mo29485c();
        if ((c || c2) && (!c || !c2 || !this.f8879b.equals(iaVar.f8879b))) {
            return false;
        }
        boolean d = mo29488d();
        boolean d2 = iaVar.mo29488d();
        if ((d || d2) && (!d || !d2 || !this.f8880c.equals(iaVar.f8880c))) {
            return false;
        }
        boolean e = mo29490e();
        boolean e2 = iaVar.mo29490e();
        if ((e || e2) && (!e || !e2 || !this.f8881d.equals(iaVar.f8881d))) {
            return false;
        }
        boolean f = mo29492f();
        boolean f2 = iaVar.mo29492f();
        if ((f || f2) && (!f || !f2 || this.f8874a != iaVar.f8874a)) {
            return false;
        }
        boolean g = mo29493g();
        boolean g2 = iaVar.mo29493g();
        if ((g || g2) && (!g || !g2 || !this.f8882e.equals(iaVar.f8882e))) {
            return false;
        }
        boolean h = mo29494h();
        boolean h2 = iaVar.mo29494h();
        if ((h || h2) && (!h || !h2 || !this.f8878a.equals(iaVar.f8878a))) {
            return false;
        }
        boolean i = mo29496i();
        boolean i2 = iaVar.mo29496i();
        if ((i || i2) && (!i || !i2 || !this.f8883f.equals(iaVar.f8883f))) {
            return false;
        }
        boolean j = mo29497j();
        boolean j2 = iaVar.mo29497j();
        if (j || j2) {
            return j && j2 && this.f8884g.equals(iaVar.f8884g);
        }
        return true;
    }

    /* renamed from: b */
    public C4778ia mo29482b(String str) {
        this.f8880c = str;
        return this;
    }

    /* renamed from: b */
    public String mo29483b() {
        return this.f8881d;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29480a();
        jfVar.mo29857a(f8864a);
        if (this.f8876a != null && mo29480a()) {
            jfVar.mo29854a(f8863a);
            jfVar.mo29858a(this.f8876a);
            jfVar.mo29862b();
        }
        if (this.f8875a != null && mo29483b()) {
            jfVar.mo29854a(f8865b);
            this.f8875a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8879b != null) {
            jfVar.mo29854a(f8866c);
            jfVar.mo29858a(this.f8879b);
            jfVar.mo29862b();
        }
        if (this.f8880c != null && mo29488d()) {
            jfVar.mo29854a(f8867d);
            jfVar.mo29858a(this.f8880c);
            jfVar.mo29862b();
        }
        if (this.f8881d != null && mo29490e()) {
            jfVar.mo29854a(f8868e);
            jfVar.mo29858a(this.f8881d);
            jfVar.mo29862b();
        }
        if (mo29492f()) {
            jfVar.mo29854a(f8869f);
            jfVar.mo29853a(this.f8874a);
            jfVar.mo29862b();
        }
        if (this.f8882e != null && mo29493g()) {
            jfVar.mo29854a(f8870g);
            jfVar.mo29858a(this.f8882e);
            jfVar.mo29862b();
        }
        if (this.f8878a != null && mo29494h()) {
            jfVar.mo29854a(f8871h);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8878a.size()));
            for (Map.Entry next : this.f8878a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (this.f8883f != null && mo29496i()) {
            jfVar.mo29854a(f8872i);
            jfVar.mo29858a(this.f8883f);
            jfVar.mo29862b();
        }
        if (this.f8884g != null && mo29497j()) {
            jfVar.mo29854a(f8873j);
            jfVar.mo29858a(this.f8884g);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean m14428b() {
        return this.f8875a != null;
    }

    /* renamed from: c */
    public C4778ia mo29484c(String str) {
        this.f8881d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo29485c() {
        return this.f8879b != null;
    }

    /* renamed from: d */
    public C4778ia mo29487d(String str) {
        this.f8882e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29488d() {
        return this.f8880c != null;
    }

    /* renamed from: e */
    public C4778ia mo29489e(String str) {
        this.f8883f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo29490e() {
        return this.f8881d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4778ia)) {
            return compareTo((C4778ia) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29492f() {
        return this.f8877a.get(0);
    }

    /* renamed from: g */
    public boolean mo29493g() {
        return this.f8882e != null;
    }

    /* renamed from: h */
    public boolean mo29494h() {
        return this.f8878a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29496i() {
        return this.f8883f != null;
    }

    /* renamed from: j */
    public boolean mo29497j() {
        return this.f8884g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (mo29480a()) {
            sb.append("debug:");
            String str = this.f8876a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29483b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f8875a;
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
        String str2 = this.f8879b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo29488d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f8880c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29490e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f8881d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29492f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f8874a);
        }
        if (mo29493g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f8882e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29494h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f8878a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo29496i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f8883f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29497j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f8884g;
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
