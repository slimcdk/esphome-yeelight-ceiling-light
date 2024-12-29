package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.hq */
public class C4743hq implements C4777ix<C4743hq, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9042a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9043a = new C4799jn("ClientUploadDataItem");

    /* renamed from: b */
    private static final C4791jf f9044b = new C4791jf("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4791jf f9045c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9046d = new C4791jf("", (byte) 10, 4);

    /* renamed from: e */
    private static final C4791jf f9047e = new C4791jf("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4791jf f9048f = new C4791jf("", (byte) 2, 6);

    /* renamed from: g */
    private static final C4791jf f9049g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9050h = new C4791jf("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4791jf f9051i = new C4791jf("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4791jf f9052j = new C4791jf("", ParameterInitDefType.IntVec3Init, 10);

    /* renamed from: k */
    private static final C4791jf f9053k = new C4791jf("", (byte) 11, 11);

    /* renamed from: a */
    public long f9054a;

    /* renamed from: a */
    public String f9055a;

    /* renamed from: a */
    private BitSet f9056a = new BitSet(3);

    /* renamed from: a */
    public Map<String, String> f9057a;

    /* renamed from: a */
    public boolean f9058a;

    /* renamed from: b */
    public long f9059b;

    /* renamed from: b */
    public String f9060b;

    /* renamed from: c */
    public String f9061c;

    /* renamed from: d */
    public String f9062d;

    /* renamed from: e */
    public String f9063e;

    /* renamed from: f */
    public String f9064f;

    /* renamed from: g */
    public String f9065g;

    /* renamed from: a */
    public int compareTo(C4743hq hqVar) {
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
        if (!C4743hq.class.equals(hqVar.getClass())) {
            return C4743hq.class.getName().compareTo(hqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25264a()).compareTo(Boolean.valueOf(hqVar.mo25264a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25264a() && (a11 = C4778iy.m15232a(this.f9055a, hqVar.f9055a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(mo25270b()).compareTo(Boolean.valueOf(hqVar.mo25270b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25270b() && (a10 = C4778iy.m15232a(this.f9060b, hqVar.f9060b)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(mo25273c()).compareTo(Boolean.valueOf(hqVar.mo25273c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25273c() && (a9 = C4778iy.m15232a(this.f9061c, hqVar.f9061c)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(mo25277d()).compareTo(Boolean.valueOf(hqVar.mo25277d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25277d() && (a8 = C4778iy.m15230a(this.f9054a, hqVar.f9054a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(mo25279e()).compareTo(Boolean.valueOf(hqVar.mo25279e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25279e() && (a7 = C4778iy.m15230a(this.f9059b, hqVar.f9059b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(mo25282f()).compareTo(Boolean.valueOf(hqVar.mo25282f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25282f() && (a6 = C4778iy.m15238a(this.f9058a, hqVar.f9058a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(mo25284g()).compareTo(Boolean.valueOf(hqVar.mo25284g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25284g() && (a5 = C4778iy.m15232a(this.f9062d, hqVar.f9062d)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(mo25285h()).compareTo(Boolean.valueOf(hqVar.mo25285h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25285h() && (a4 = C4778iy.m15232a(this.f9063e, hqVar.f9063e)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(mo25287i()).compareTo(Boolean.valueOf(hqVar.mo25287i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25287i() && (a3 = C4778iy.m15232a(this.f9064f, hqVar.f9064f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(mo25288j()).compareTo(Boolean.valueOf(hqVar.mo25288j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo25288j() && (a2 = C4778iy.m15235a((Map) this.f9057a, (Map) hqVar.f9057a)) != 0) {
            return a2;
        }
        int compareTo11 = Boolean.valueOf(mo25289k()).compareTo(Boolean.valueOf(hqVar.mo25289k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!mo25289k() || (a = C4778iy.m15232a(this.f9065g, hqVar.f9065g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long mo25264a() {
        return this.f9059b;
    }

    /* renamed from: a */
    public C4743hq mo25265a(long j) {
        this.f9054a = j;
        mo25267a(true);
        return this;
    }

    /* renamed from: a */
    public C4743hq mo25266a(String str) {
        this.f9055a = str;
        return this;
    }

    /* renamed from: a */
    public C4743hq mo25267a(boolean z) {
        this.f9058a = z;
        mo25274c(true);
        return this;
    }

    /* renamed from: a */
    public String m14575a() {
        return this.f9055a;
    }

    /* renamed from: a */
    public void m14576a() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r7) {
        /*
            r6 = this;
            r7.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r7.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0012
            r7.mo25834f()
            r6.mo25264a()
            return
        L_0x0012:
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r7, r1)
            goto L_0x00b1
        L_0x0022:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9065g = r0
            goto L_0x00b1
        L_0x002c:
            r0 = 13
            if (r1 != r0) goto L_0x001d
            com.xiaomi.push.jh r0 = r7.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9826a
            int r3 = r3 * 2
            r1.<init>(r3)
            r6.f9057a = r1
            r1 = 0
        L_0x0040:
            int r2 = r0.f9826a
            if (r1 >= r2) goto L_0x0054
            java.lang.String r2 = r7.mo25816a()
            java.lang.String r3 = r7.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f9057a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0054:
            r7.mo25836h()
            goto L_0x00b1
        L_0x0058:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9064f = r0
            goto L_0x00b1
        L_0x0061:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9063e = r0
            goto L_0x00b1
        L_0x006a:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9062d = r0
            goto L_0x00b1
        L_0x0073:
            if (r1 != r2) goto L_0x001d
            boolean r0 = r7.mo25816a()
            r6.f9058a = r0
            r6.mo25274c((boolean) r4)
            goto L_0x00b1
        L_0x007f:
            if (r1 != r3) goto L_0x001d
            long r0 = r7.mo25816a()
            r6.f9059b = r0
            r6.mo25271b((boolean) r4)
            goto L_0x00b1
        L_0x008b:
            if (r1 != r3) goto L_0x001d
            long r0 = r7.mo25816a()
            r6.f9054a = r0
            r6.mo25267a((boolean) r4)
            goto L_0x00b1
        L_0x0097:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9061c = r0
            goto L_0x00b1
        L_0x00a0:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9060b = r0
            goto L_0x00b1
        L_0x00a9:
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.mo25816a()
            r6.f9055a = r0
        L_0x00b1:
            r7.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4743hq.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void m14578a(boolean z) {
        this.f9056a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14579a() {
        return this.f9055a != null;
    }

    /* renamed from: a */
    public boolean m14580a(C4743hq hqVar) {
        if (hqVar == null) {
            return false;
        }
        boolean a = mo25264a();
        boolean a2 = hqVar.mo25264a();
        if ((a || a2) && (!a || !a2 || !this.f9055a.equals(hqVar.f9055a))) {
            return false;
        }
        boolean b = mo25270b();
        boolean b2 = hqVar.mo25270b();
        if ((b || b2) && (!b || !b2 || !this.f9060b.equals(hqVar.f9060b))) {
            return false;
        }
        boolean c = mo25273c();
        boolean c2 = hqVar.mo25273c();
        if ((c || c2) && (!c || !c2 || !this.f9061c.equals(hqVar.f9061c))) {
            return false;
        }
        boolean d = mo25277d();
        boolean d2 = hqVar.mo25277d();
        if ((d || d2) && (!d || !d2 || this.f9054a != hqVar.f9054a)) {
            return false;
        }
        boolean e = mo25279e();
        boolean e2 = hqVar.mo25279e();
        if ((e || e2) && (!e || !e2 || this.f9059b != hqVar.f9059b)) {
            return false;
        }
        boolean f = mo25282f();
        boolean f2 = hqVar.mo25282f();
        if ((f || f2) && (!f || !f2 || this.f9058a != hqVar.f9058a)) {
            return false;
        }
        boolean g = mo25284g();
        boolean g2 = hqVar.mo25284g();
        if ((g || g2) && (!g || !g2 || !this.f9062d.equals(hqVar.f9062d))) {
            return false;
        }
        boolean h = mo25285h();
        boolean h2 = hqVar.mo25285h();
        if ((h || h2) && (!h || !h2 || !this.f9063e.equals(hqVar.f9063e))) {
            return false;
        }
        boolean i = mo25287i();
        boolean i2 = hqVar.mo25287i();
        if ((i || i2) && (!i || !i2 || !this.f9064f.equals(hqVar.f9064f))) {
            return false;
        }
        boolean j = mo25288j();
        boolean j2 = hqVar.mo25288j();
        if ((j || j2) && (!j || !j2 || !this.f9057a.equals(hqVar.f9057a))) {
            return false;
        }
        boolean k = mo25289k();
        boolean k2 = hqVar.mo25289k();
        if (k || k2) {
            return k && k2 && this.f9065g.equals(hqVar.f9065g);
        }
        return true;
    }

    /* renamed from: b */
    public C4743hq mo25268b(long j) {
        this.f9059b = j;
        mo25271b(true);
        return this;
    }

    /* renamed from: b */
    public C4743hq mo25269b(String str) {
        this.f9060b = str;
        return this;
    }

    /* renamed from: b */
    public String mo25270b() {
        return this.f9061c;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25264a();
        jiVar.mo25823a(f9043a);
        if (this.f9055a != null && mo25264a()) {
            jiVar.mo25820a(f9042a);
            jiVar.mo25824a(this.f9055a);
            jiVar.mo25828b();
        }
        if (this.f9060b != null && mo25270b()) {
            jiVar.mo25820a(f9044b);
            jiVar.mo25824a(this.f9060b);
            jiVar.mo25828b();
        }
        if (this.f9061c != null && mo25273c()) {
            jiVar.mo25820a(f9045c);
            jiVar.mo25824a(this.f9061c);
            jiVar.mo25828b();
        }
        if (mo25277d()) {
            jiVar.mo25820a(f9046d);
            jiVar.mo25819a(this.f9054a);
            jiVar.mo25828b();
        }
        if (mo25279e()) {
            jiVar.mo25820a(f9047e);
            jiVar.mo25819a(this.f9059b);
            jiVar.mo25828b();
        }
        if (mo25282f()) {
            jiVar.mo25820a(f9048f);
            jiVar.mo25827a(this.f9058a);
            jiVar.mo25828b();
        }
        if (this.f9062d != null && mo25284g()) {
            jiVar.mo25820a(f9049g);
            jiVar.mo25824a(this.f9062d);
            jiVar.mo25828b();
        }
        if (this.f9063e != null && mo25285h()) {
            jiVar.mo25820a(f9050h);
            jiVar.mo25824a(this.f9063e);
            jiVar.mo25828b();
        }
        if (this.f9064f != null && mo25287i()) {
            jiVar.mo25820a(f9051i);
            jiVar.mo25824a(this.f9064f);
            jiVar.mo25828b();
        }
        if (this.f9057a != null && mo25288j()) {
            jiVar.mo25820a(f9052j);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9057a.size()));
            for (Map.Entry next : this.f9057a.entrySet()) {
                jiVar.mo25824a((String) next.getKey());
                jiVar.mo25824a((String) next.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        if (this.f9065g != null && mo25289k()) {
            jiVar.mo25820a(f9053k);
            jiVar.mo25824a(this.f9065g);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25271b(boolean z) {
        this.f9056a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14586b() {
        return this.f9060b != null;
    }

    /* renamed from: c */
    public C4743hq mo25272c(String str) {
        this.f9061c = str;
        return this;
    }

    /* renamed from: c */
    public String mo25273c() {
        return this.f9063e;
    }

    /* renamed from: c */
    public void mo25274c(boolean z) {
        this.f9056a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14590c() {
        return this.f9061c != null;
    }

    /* renamed from: d */
    public C4743hq mo25276d(String str) {
        this.f9062d = str;
        return this;
    }

    /* renamed from: d */
    public String mo25277d() {
        return this.f9064f;
    }

    /* renamed from: d */
    public boolean m14593d() {
        return this.f9056a.get(0);
    }

    /* renamed from: e */
    public C4743hq mo25278e(String str) {
        this.f9063e = str;
        return this;
    }

    /* renamed from: e */
    public String mo25279e() {
        return this.f9065g;
    }

    /* renamed from: e */
    public boolean m14596e() {
        return this.f9056a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4743hq)) {
            return compareTo((C4743hq) obj);
        }
        return false;
    }

    /* renamed from: f */
    public C4743hq mo25281f(String str) {
        this.f9064f = str;
        return this;
    }

    /* renamed from: f */
    public boolean mo25282f() {
        return this.f9056a.get(2);
    }

    /* renamed from: g */
    public C4743hq mo25283g(String str) {
        this.f9065g = str;
        return this;
    }

    /* renamed from: g */
    public boolean mo25284g() {
        return this.f9062d != null;
    }

    /* renamed from: h */
    public boolean mo25285h() {
        return this.f9063e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25287i() {
        return this.f9064f != null;
    }

    /* renamed from: j */
    public boolean mo25288j() {
        return this.f9057a != null;
    }

    /* renamed from: k */
    public boolean mo25289k() {
        return this.f9065g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (mo25264a()) {
            sb.append("channel:");
            String str = this.f9055a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25270b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f9060b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo25273c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f9061c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo25277d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f9054a);
            z = false;
        }
        if (mo25279e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f9059b);
            z = false;
        }
        if (mo25282f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f9058a);
            z = false;
        }
        if (mo25284g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f9062d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo25285h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f9063e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (mo25287i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f9064f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (mo25288j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f9057a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (mo25289k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f9065g;
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
