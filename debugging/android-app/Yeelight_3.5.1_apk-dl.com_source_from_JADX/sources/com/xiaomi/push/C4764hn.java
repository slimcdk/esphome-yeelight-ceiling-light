package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hn */
public class C4764hn implements C4798iu<C4764hn, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8480a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8481a = new C4817jk("ClientUploadDataItem");

    /* renamed from: b */
    private static final C4809jc f8482b = new C4809jc("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4809jc f8483c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8484d = new C4809jc("", (byte) 10, 4);

    /* renamed from: e */
    private static final C4809jc f8485e = new C4809jc("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4809jc f8486f = new C4809jc("", (byte) 2, 6);

    /* renamed from: g */
    private static final C4809jc f8487g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8488h = new C4809jc("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4809jc f8489i = new C4809jc("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4809jc f8490j = new C4809jc("", ParameterInitDefType.IntVec3Init, 10);

    /* renamed from: k */
    private static final C4809jc f8491k = new C4809jc("", (byte) 11, 11);

    /* renamed from: a */
    public long f8492a;

    /* renamed from: a */
    public String f8493a;

    /* renamed from: a */
    private BitSet f8494a = new BitSet(3);

    /* renamed from: a */
    public Map<String, String> f8495a;

    /* renamed from: a */
    public boolean f8496a;

    /* renamed from: b */
    public long f8497b;

    /* renamed from: b */
    public String f8498b;

    /* renamed from: c */
    public String f8499c;

    /* renamed from: d */
    public String f8500d;

    /* renamed from: e */
    public String f8501e;

    /* renamed from: f */
    public String f8502f;

    /* renamed from: g */
    public String f8503g;

    /* renamed from: a */
    public int compareTo(C4764hn hnVar) {
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
        if (!getClass().equals(hnVar.getClass())) {
            return getClass().getName().compareTo(hnVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29293a()).compareTo(Boolean.valueOf(hnVar.mo29293a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29293a() && (a11 = C4799iv.m14841a(this.f8493a, hnVar.f8493a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(mo29301b()).compareTo(Boolean.valueOf(hnVar.mo29301b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29301b() && (a10 = C4799iv.m14841a(this.f8498b, hnVar.f8498b)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(mo29304c()).compareTo(Boolean.valueOf(hnVar.mo29304c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29304c() && (a9 = C4799iv.m14841a(this.f8499c, hnVar.f8499c)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(mo29308d()).compareTo(Boolean.valueOf(hnVar.mo29308d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29308d() && (a8 = C4799iv.m14839a(this.f8492a, hnVar.f8492a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(mo29310e()).compareTo(Boolean.valueOf(hnVar.mo29310e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29310e() && (a7 = C4799iv.m14839a(this.f8497b, hnVar.f8497b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(mo29313f()).compareTo(Boolean.valueOf(hnVar.mo29313f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29313f() && (a6 = C4799iv.m14847a(this.f8496a, hnVar.f8496a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(mo29315g()).compareTo(Boolean.valueOf(hnVar.mo29315g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29315g() && (a5 = C4799iv.m14841a(this.f8500d, hnVar.f8500d)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(mo29316h()).compareTo(Boolean.valueOf(hnVar.mo29316h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29316h() && (a4 = C4799iv.m14841a(this.f8501e, hnVar.f8501e)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(mo29318i()).compareTo(Boolean.valueOf(hnVar.mo29318i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29318i() && (a3 = C4799iv.m14841a(this.f8502f, hnVar.f8502f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(mo29319j()).compareTo(Boolean.valueOf(hnVar.mo29319j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29319j() && (a2 = C4799iv.m14844a((Map) this.f8495a, (Map) hnVar.f8495a)) != 0) {
            return a2;
        }
        int compareTo11 = Boolean.valueOf(mo29320k()).compareTo(Boolean.valueOf(hnVar.mo29320k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!mo29320k() || (a = C4799iv.m14841a(this.f8503g, hnVar.f8503g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long mo29293a() {
        return this.f8497b;
    }

    /* renamed from: a */
    public C4764hn mo29294a(long j) {
        this.f8492a = j;
        mo29297a(true);
        return this;
    }

    /* renamed from: a */
    public C4764hn mo29295a(String str) {
        this.f8493a = str;
        return this;
    }

    /* renamed from: a */
    public C4764hn mo29296a(Map<String, String> map) {
        this.f8495a = map;
        return this;
    }

    /* renamed from: a */
    public C4764hn mo29297a(boolean z) {
        this.f8496a = z;
        mo29305c(true);
        return this;
    }

    /* renamed from: a */
    public String m14200a() {
        return this.f8493a;
    }

    /* renamed from: a */
    public Map<String, String> m14201a() {
        return this.f8495a;
    }

    /* renamed from: a */
    public void m14202a() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r7) {
        /*
            r6 = this;
            r7.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r7.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0012
            r7.mo29868f()
            r6.mo29293a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 2
            r3 = 10
            r4 = 1
            r5 = 11
            switch(r0) {
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0097;
                case 4: goto L_0x008b;
                case 5: goto L_0x007f;
                case 6: goto L_0x0073;
                case 7: goto L_0x006a;
                case 8: goto L_0x0061;
                case 9: goto L_0x0058;
                case 10: goto L_0x002c;
                case 11: goto L_0x0022;
                default: goto L_0x001d;
            }
        L_0x001d:
            com.xiaomi.push.C4815ji.m14965a(r7, r1)
            goto L_0x00b1
        L_0x0022:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8503g = r0
            goto L_0x00b1
        L_0x002c:
            r0 = 13
            if (r1 != r0) goto L_0x001d
            com.xiaomi.push.je r0 = r7.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r6.f8495a = r1
            r1 = 0
        L_0x0040:
            int r2 = r0.f9295a
            if (r1 >= r2) goto L_0x0054
            java.lang.String r2 = r7.mo29850a()
            java.lang.String r3 = r7.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f8495a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0054:
            r7.mo29870h()
            goto L_0x00b1
        L_0x0058:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8502f = r0
            goto L_0x00b1
        L_0x0061:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8501e = r0
            goto L_0x00b1
        L_0x006a:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8500d = r0
            goto L_0x00b1
        L_0x0073:
            if (r1 != r2) goto L_0x001d
            boolean r0 = r7.mo29850a()
            r6.f8496a = r0
            r6.mo29305c((boolean) r4)
            goto L_0x00b1
        L_0x007f:
            if (r1 != r3) goto L_0x001d
            long r0 = r7.mo29850a()
            r6.f8497b = r0
            r6.mo29302b((boolean) r4)
            goto L_0x00b1
        L_0x008b:
            if (r1 != r3) goto L_0x001d
            long r0 = r7.mo29850a()
            r6.f8492a = r0
            r6.mo29297a((boolean) r4)
            goto L_0x00b1
        L_0x0097:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8499c = r0
            goto L_0x00b1
        L_0x00a0:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8498b = r0
            goto L_0x00b1
        L_0x00a9:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo29850a()
            r6.f8493a = r0
        L_0x00b1:
            r7.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4764hn.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29298a(String str, String str2) {
        if (this.f8495a == null) {
            this.f8495a = new HashMap();
        }
        this.f8495a.put(str, str2);
    }

    /* renamed from: a */
    public void m14205a(boolean z) {
        this.f8494a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14206a() {
        return this.f8493a != null;
    }

    /* renamed from: a */
    public boolean m14207a(C4764hn hnVar) {
        if (hnVar == null) {
            return false;
        }
        boolean a = mo29293a();
        boolean a2 = hnVar.mo29293a();
        if ((a || a2) && (!a || !a2 || !this.f8493a.equals(hnVar.f8493a))) {
            return false;
        }
        boolean b = mo29301b();
        boolean b2 = hnVar.mo29301b();
        if ((b || b2) && (!b || !b2 || !this.f8498b.equals(hnVar.f8498b))) {
            return false;
        }
        boolean c = mo29304c();
        boolean c2 = hnVar.mo29304c();
        if ((c || c2) && (!c || !c2 || !this.f8499c.equals(hnVar.f8499c))) {
            return false;
        }
        boolean d = mo29308d();
        boolean d2 = hnVar.mo29308d();
        if ((d || d2) && (!d || !d2 || this.f8492a != hnVar.f8492a)) {
            return false;
        }
        boolean e = mo29310e();
        boolean e2 = hnVar.mo29310e();
        if ((e || e2) && (!e || !e2 || this.f8497b != hnVar.f8497b)) {
            return false;
        }
        boolean f = mo29313f();
        boolean f2 = hnVar.mo29313f();
        if ((f || f2) && (!f || !f2 || this.f8496a != hnVar.f8496a)) {
            return false;
        }
        boolean g = mo29315g();
        boolean g2 = hnVar.mo29315g();
        if ((g || g2) && (!g || !g2 || !this.f8500d.equals(hnVar.f8500d))) {
            return false;
        }
        boolean h = mo29316h();
        boolean h2 = hnVar.mo29316h();
        if ((h || h2) && (!h || !h2 || !this.f8501e.equals(hnVar.f8501e))) {
            return false;
        }
        boolean i = mo29318i();
        boolean i2 = hnVar.mo29318i();
        if ((i || i2) && (!i || !i2 || !this.f8502f.equals(hnVar.f8502f))) {
            return false;
        }
        boolean j = mo29319j();
        boolean j2 = hnVar.mo29319j();
        if ((j || j2) && (!j || !j2 || !this.f8495a.equals(hnVar.f8495a))) {
            return false;
        }
        boolean k = mo29320k();
        boolean k2 = hnVar.mo29320k();
        if (k || k2) {
            return k && k2 && this.f8503g.equals(hnVar.f8503g);
        }
        return true;
    }

    /* renamed from: b */
    public C4764hn mo29299b(long j) {
        this.f8497b = j;
        mo29302b(true);
        return this;
    }

    /* renamed from: b */
    public C4764hn mo29300b(String str) {
        this.f8498b = str;
        return this;
    }

    /* renamed from: b */
    public String mo29301b() {
        return this.f8499c;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29293a();
        jfVar.mo29857a(f8481a);
        if (this.f8493a != null && mo29293a()) {
            jfVar.mo29854a(f8480a);
            jfVar.mo29858a(this.f8493a);
            jfVar.mo29862b();
        }
        if (this.f8498b != null && mo29301b()) {
            jfVar.mo29854a(f8482b);
            jfVar.mo29858a(this.f8498b);
            jfVar.mo29862b();
        }
        if (this.f8499c != null && mo29304c()) {
            jfVar.mo29854a(f8483c);
            jfVar.mo29858a(this.f8499c);
            jfVar.mo29862b();
        }
        if (mo29308d()) {
            jfVar.mo29854a(f8484d);
            jfVar.mo29853a(this.f8492a);
            jfVar.mo29862b();
        }
        if (mo29310e()) {
            jfVar.mo29854a(f8485e);
            jfVar.mo29853a(this.f8497b);
            jfVar.mo29862b();
        }
        if (mo29313f()) {
            jfVar.mo29854a(f8486f);
            jfVar.mo29861a(this.f8496a);
            jfVar.mo29862b();
        }
        if (this.f8500d != null && mo29315g()) {
            jfVar.mo29854a(f8487g);
            jfVar.mo29858a(this.f8500d);
            jfVar.mo29862b();
        }
        if (this.f8501e != null && mo29316h()) {
            jfVar.mo29854a(f8488h);
            jfVar.mo29858a(this.f8501e);
            jfVar.mo29862b();
        }
        if (this.f8502f != null && mo29318i()) {
            jfVar.mo29854a(f8489i);
            jfVar.mo29858a(this.f8502f);
            jfVar.mo29862b();
        }
        if (this.f8495a != null && mo29319j()) {
            jfVar.mo29854a(f8490j);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8495a.size()));
            for (Map.Entry next : this.f8495a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (this.f8503g != null && mo29320k()) {
            jfVar.mo29854a(f8491k);
            jfVar.mo29858a(this.f8503g);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29302b(boolean z) {
        this.f8494a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14213b() {
        return this.f8498b != null;
    }

    /* renamed from: c */
    public C4764hn mo29303c(String str) {
        this.f8499c = str;
        return this;
    }

    /* renamed from: c */
    public String mo29304c() {
        return this.f8501e;
    }

    /* renamed from: c */
    public void mo29305c(boolean z) {
        this.f8494a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14217c() {
        return this.f8499c != null;
    }

    /* renamed from: d */
    public C4764hn mo29307d(String str) {
        this.f8500d = str;
        return this;
    }

    /* renamed from: d */
    public String mo29308d() {
        return this.f8502f;
    }

    /* renamed from: d */
    public boolean m14220d() {
        return this.f8494a.get(0);
    }

    /* renamed from: e */
    public C4764hn mo29309e(String str) {
        this.f8501e = str;
        return this;
    }

    /* renamed from: e */
    public String mo29310e() {
        return this.f8503g;
    }

    /* renamed from: e */
    public boolean m14223e() {
        return this.f8494a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4764hn)) {
            return compareTo((C4764hn) obj);
        }
        return false;
    }

    /* renamed from: f */
    public C4764hn mo29312f(String str) {
        this.f8502f = str;
        return this;
    }

    /* renamed from: f */
    public boolean mo29313f() {
        return this.f8494a.get(2);
    }

    /* renamed from: g */
    public C4764hn mo29314g(String str) {
        this.f8503g = str;
        return this;
    }

    /* renamed from: g */
    public boolean mo29315g() {
        return this.f8500d != null;
    }

    /* renamed from: h */
    public boolean mo29316h() {
        return this.f8501e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29318i() {
        return this.f8502f != null;
    }

    /* renamed from: j */
    public boolean mo29319j() {
        return this.f8495a != null;
    }

    /* renamed from: k */
    public boolean mo29320k() {
        return this.f8503g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (mo29293a()) {
            sb.append("channel:");
            String str = this.f8493a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29301b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f8498b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo29304c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f8499c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo29308d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f8492a);
            z = false;
        }
        if (mo29310e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f8497b);
            z = false;
        }
        if (mo29313f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f8496a);
            z = false;
        }
        if (mo29315g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f8500d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo29316h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f8501e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (mo29318i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f8502f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (mo29319j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f8495a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (mo29320k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f8503g;
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
