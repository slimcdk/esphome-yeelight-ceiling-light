package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ig */
public class C4760ig implements C4777ix<C4760ig, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9435a = new C4791jf("", (byte) 12, 2);

    /* renamed from: a */
    private static final C4799jn f9436a = new C4799jn("XmPushActionCommand");

    /* renamed from: b */
    private static final C4791jf f9437b = new C4791jf("", (byte) 11, 3);

    /* renamed from: c */
    private static final C4791jf f9438c = new C4791jf("", (byte) 11, 4);

    /* renamed from: d */
    private static final C4791jf f9439d = new C4791jf("", (byte) 11, 5);

    /* renamed from: e */
    private static final C4791jf f9440e = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 6);

    /* renamed from: f */
    private static final C4791jf f9441f = new C4791jf("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4791jf f9442g = new C4791jf("", (byte) 11, 9);

    /* renamed from: h */
    private static final C4791jf f9443h = new C4791jf("", (byte) 2, 10);

    /* renamed from: i */
    private static final C4791jf f9444i = new C4791jf("", (byte) 2, 11);

    /* renamed from: j */
    private static final C4791jf f9445j = new C4791jf("", (byte) 10, 12);

    /* renamed from: a */
    public long f9446a;

    /* renamed from: a */
    public C4755ib f9447a;

    /* renamed from: a */
    public String f9448a;

    /* renamed from: a */
    private BitSet f9449a = new BitSet(3);

    /* renamed from: a */
    public List<String> f9450a;

    /* renamed from: a */
    public boolean f9451a = false;

    /* renamed from: b */
    public String f9452b;

    /* renamed from: b */
    public boolean f9453b = true;

    /* renamed from: c */
    public String f9454c;

    /* renamed from: d */
    public String f9455d;

    /* renamed from: e */
    public String f9456e;

    /* renamed from: a */
    public int compareTo(C4760ig igVar) {
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
        if (!C4760ig.class.equals(igVar.getClass())) {
            return C4760ig.class.getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25482a()).compareTo(Boolean.valueOf(igVar.mo25482a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25482a() && (a10 = C4778iy.m15231a((Comparable) this.f9447a, (Comparable) igVar.f9447a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo25486b()).compareTo(Boolean.valueOf(igVar.mo25486b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25486b() && (a9 = C4778iy.m15232a(this.f9448a, igVar.f9448a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo25489c()).compareTo(Boolean.valueOf(igVar.mo25489c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25489c() && (a8 = C4778iy.m15232a(this.f9452b, igVar.f9452b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo25492d()).compareTo(Boolean.valueOf(igVar.mo25492d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25492d() && (a7 = C4778iy.m15232a(this.f9454c, igVar.f9454c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo25494e()).compareTo(Boolean.valueOf(igVar.mo25494e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25494e() && (a6 = C4778iy.m15234a((List) this.f9450a, (List) igVar.f9450a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo25496f()).compareTo(Boolean.valueOf(igVar.mo25496f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25496f() && (a5 = C4778iy.m15232a(this.f9455d, igVar.f9455d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo25497g()).compareTo(Boolean.valueOf(igVar.mo25497g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25497g() && (a4 = C4778iy.m15232a(this.f9456e, igVar.f9456e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo25498h()).compareTo(Boolean.valueOf(igVar.mo25498h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25498h() && (a3 = C4778iy.m15238a(this.f9451a, igVar.f9451a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo25500i()).compareTo(Boolean.valueOf(igVar.mo25500i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25500i() && (a2 = C4778iy.m15238a(this.f9453b, igVar.f9453b)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo25501j()).compareTo(Boolean.valueOf(igVar.mo25501j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo25501j() || (a = C4778iy.m15230a(this.f9446a, igVar.f9446a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4760ig mo25480a(String str) {
        this.f9448a = str;
        return this;
    }

    /* renamed from: a */
    public C4760ig mo25481a(List<String> list) {
        this.f9450a = list;
        return this;
    }

    /* renamed from: a */
    public String mo25482a() {
        return this.f9454c;
    }

    /* renamed from: a */
    public void m14862a() {
        if (this.f9448a == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9452b == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9454c == null) {
            throw new C4795jj("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r6) {
        /*
            r5 = this;
            r6.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r6.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0012
            r6.mo25834f()
            r5.mo25482a()
            return
        L_0x0012:
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x00a9
        L_0x0020:
            r0 = 10
            if (r1 != r0) goto L_0x001b
            long r0 = r6.mo25816a()
            r5.f9446a = r0
            r5.mo25488c((boolean) r3)
            goto L_0x00a9
        L_0x002f:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo25816a()
            r5.f9453b = r0
            r5.mo25485b((boolean) r3)
            goto L_0x00a9
        L_0x003c:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo25816a()
            r5.f9451a = r0
            r5.mo25483a((boolean) r3)
            goto L_0x00a9
        L_0x0048:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9456e = r0
            goto L_0x00a9
        L_0x0051:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9455d = r0
            goto L_0x00a9
        L_0x005a:
            r0 = 15
            if (r1 != r0) goto L_0x001b
            com.xiaomi.push.jg r0 = r6.mo25816a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9824a
            r1.<init>(r2)
            r5.f9450a = r1
            r1 = 0
        L_0x006c:
            int r2 = r0.f9824a
            if (r1 >= r2) goto L_0x007c
            java.lang.String r2 = r6.mo25816a()
            java.util.List<java.lang.String> r3 = r5.f9450a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x006c
        L_0x007c:
            r6.mo25837i()
            goto L_0x00a9
        L_0x0080:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9454c = r0
            goto L_0x00a9
        L_0x0089:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9452b = r0
            goto L_0x00a9
        L_0x0092:
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9448a = r0
            goto L_0x00a9
        L_0x009b:
            r0 = 12
            if (r1 != r0) goto L_0x001b
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r5.f9447a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r6)
        L_0x00a9:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4760ig.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void m14864a(String str) {
        if (this.f9450a == null) {
            this.f9450a = new ArrayList();
        }
        this.f9450a.add(str);
    }

    /* renamed from: a */
    public void mo25483a(boolean z) {
        this.f9449a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14866a() {
        return this.f9447a != null;
    }

    /* renamed from: a */
    public boolean m14867a(C4760ig igVar) {
        if (igVar == null) {
            return false;
        }
        boolean a = mo25482a();
        boolean a2 = igVar.mo25482a();
        if ((a || a2) && (!a || !a2 || !this.f9447a.compareTo(igVar.f9447a))) {
            return false;
        }
        boolean b = mo25486b();
        boolean b2 = igVar.mo25486b();
        if ((b || b2) && (!b || !b2 || !this.f9448a.equals(igVar.f9448a))) {
            return false;
        }
        boolean c = mo25489c();
        boolean c2 = igVar.mo25489c();
        if ((c || c2) && (!c || !c2 || !this.f9452b.equals(igVar.f9452b))) {
            return false;
        }
        boolean d = mo25492d();
        boolean d2 = igVar.mo25492d();
        if ((d || d2) && (!d || !d2 || !this.f9454c.equals(igVar.f9454c))) {
            return false;
        }
        boolean e = mo25494e();
        boolean e2 = igVar.mo25494e();
        if ((e || e2) && (!e || !e2 || !this.f9450a.equals(igVar.f9450a))) {
            return false;
        }
        boolean f = mo25496f();
        boolean f2 = igVar.mo25496f();
        if ((f || f2) && (!f || !f2 || !this.f9455d.equals(igVar.f9455d))) {
            return false;
        }
        boolean g = mo25497g();
        boolean g2 = igVar.mo25497g();
        if ((g || g2) && (!g || !g2 || !this.f9456e.equals(igVar.f9456e))) {
            return false;
        }
        boolean h = mo25498h();
        boolean h2 = igVar.mo25498h();
        if ((h || h2) && (!h || !h2 || this.f9451a != igVar.f9451a)) {
            return false;
        }
        boolean i = mo25500i();
        boolean i2 = igVar.mo25500i();
        if ((i || i2) && (!i || !i2 || this.f9453b != igVar.f9453b)) {
            return false;
        }
        boolean j = mo25501j();
        boolean j2 = igVar.mo25501j();
        if (j || j2) {
            return j && j2 && this.f9446a == igVar.f9446a;
        }
        return true;
    }

    /* renamed from: b */
    public C4760ig mo25484b(String str) {
        this.f9452b = str;
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25482a();
        jiVar.mo25823a(f9436a);
        if (this.f9447a != null && mo25482a()) {
            jiVar.mo25820a(f9435a);
            this.f9447a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9448a != null) {
            jiVar.mo25820a(f9437b);
            jiVar.mo25824a(this.f9448a);
            jiVar.mo25828b();
        }
        if (this.f9452b != null) {
            jiVar.mo25820a(f9438c);
            jiVar.mo25824a(this.f9452b);
            jiVar.mo25828b();
        }
        if (this.f9454c != null) {
            jiVar.mo25820a(f9439d);
            jiVar.mo25824a(this.f9454c);
            jiVar.mo25828b();
        }
        if (this.f9450a != null && mo25494e()) {
            jiVar.mo25820a(f9440e);
            jiVar.mo25821a(new C4792jg((byte) 11, this.f9450a.size()));
            for (String a : this.f9450a) {
                jiVar.mo25824a(a);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        if (this.f9455d != null && mo25496f()) {
            jiVar.mo25820a(f9441f);
            jiVar.mo25824a(this.f9455d);
            jiVar.mo25828b();
        }
        if (this.f9456e != null && mo25497g()) {
            jiVar.mo25820a(f9442g);
            jiVar.mo25824a(this.f9456e);
            jiVar.mo25828b();
        }
        if (mo25498h()) {
            jiVar.mo25820a(f9443h);
            jiVar.mo25827a(this.f9451a);
            jiVar.mo25828b();
        }
        if (mo25500i()) {
            jiVar.mo25820a(f9444i);
            jiVar.mo25827a(this.f9453b);
            jiVar.mo25828b();
        }
        if (mo25501j()) {
            jiVar.mo25820a(f9445j);
            jiVar.mo25819a(this.f9446a);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25485b(boolean z) {
        this.f9449a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25486b() {
        return this.f9448a != null;
    }

    /* renamed from: c */
    public C4760ig mo25487c(String str) {
        this.f9454c = str;
        return this;
    }

    /* renamed from: c */
    public void mo25488c(boolean z) {
        this.f9449a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo25489c() {
        return this.f9452b != null;
    }

    /* renamed from: d */
    public C4760ig mo25491d(String str) {
        this.f9455d = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo25492d() {
        return this.f9454c != null;
    }

    /* renamed from: e */
    public C4760ig mo25493e(String str) {
        this.f9456e = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo25494e() {
        return this.f9450a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4760ig)) {
            return compareTo((C4760ig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25496f() {
        return this.f9455d != null;
    }

    /* renamed from: g */
    public boolean mo25497g() {
        return this.f9456e != null;
    }

    /* renamed from: h */
    public boolean mo25498h() {
        return this.f9449a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25500i() {
        return this.f9449a.get(1);
    }

    /* renamed from: j */
    public boolean mo25501j() {
        return this.f9449a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (mo25482a()) {
            sb.append("target:");
            C4755ib ibVar = this.f9447a;
            if (ibVar == null) {
                sb.append("null");
            } else {
                sb.append(ibVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f9448a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f9452b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f9454c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (mo25494e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f9450a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo25496f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f9455d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25497g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f9456e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25498h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f9451a);
        }
        if (mo25500i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f9453b);
        }
        if (mo25501j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f9446a);
        }
        sb.append(")");
        return sb.toString();
    }
}
