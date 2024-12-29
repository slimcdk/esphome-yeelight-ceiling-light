package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.xiaomi.push.iu */
public class C4774iu implements C4777ix<C4774iu, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9756a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9757a = new C4799jn("XmPushActionUnSubscription");

    /* renamed from: b */
    private static final C4791jf f9758b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9759c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9760d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9761e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9762f = new C4791jf("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4791jf f9763g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9764h = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 8);

    /* renamed from: a */
    public C4755ib f9765a;

    /* renamed from: a */
    public String f9766a;

    /* renamed from: a */
    public List<String> f9767a;

    /* renamed from: b */
    public String f9768b;

    /* renamed from: c */
    public String f9769c;

    /* renamed from: d */
    public String f9770d;

    /* renamed from: e */
    public String f9771e;

    /* renamed from: f */
    public String f9772f;

    /* renamed from: a */
    public int compareTo(C4774iu iuVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4774iu.class.equals(iuVar.getClass())) {
            return C4774iu.class.getName().compareTo(iuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25775a()).compareTo(Boolean.valueOf(iuVar.mo25775a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25775a() && (a8 = C4778iy.m15232a(this.f9766a, iuVar.f9766a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo25777b()).compareTo(Boolean.valueOf(iuVar.mo25777b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25777b() && (a7 = C4778iy.m15231a((Comparable) this.f9765a, (Comparable) iuVar.f9765a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo25779c()).compareTo(Boolean.valueOf(iuVar.mo25779c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25779c() && (a6 = C4778iy.m15232a(this.f9768b, iuVar.f9768b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo25782d()).compareTo(Boolean.valueOf(iuVar.mo25782d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25782d() && (a5 = C4778iy.m15232a(this.f9769c, iuVar.f9769c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo25784e()).compareTo(Boolean.valueOf(iuVar.mo25784e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25784e() && (a4 = C4778iy.m15232a(this.f9770d, iuVar.f9770d)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo25786f()).compareTo(Boolean.valueOf(iuVar.mo25786f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25786f() && (a3 = C4778iy.m15232a(this.f9771e, iuVar.f9771e)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo25787g()).compareTo(Boolean.valueOf(iuVar.mo25787g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25787g() && (a2 = C4778iy.m15232a(this.f9772f, iuVar.f9772f)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo25788h()).compareTo(Boolean.valueOf(iuVar.mo25788h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo25788h() || (a = C4778iy.m15234a((List) this.f9767a, (List) iuVar.f9767a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4774iu mo25774a(String str) {
        this.f9768b = str;
        return this;
    }

    /* renamed from: a */
    public void mo25775a() {
        if (this.f9768b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9769c == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9770d == null) {
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
            r4.mo25775a()
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
            r4.f9767a = r1
            r1 = 0
        L_0x0030:
            int r2 = r0.f9824a
            if (r1 >= r2) goto L_0x0040
            java.lang.String r2 = r5.mo25816a()
            java.util.List<java.lang.String> r3 = r4.f9767a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0040:
            r5.mo25837i()
            goto L_0x0088
        L_0x0044:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9772f = r0
            goto L_0x0088
        L_0x004d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9771e = r0
            goto L_0x0088
        L_0x0056:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9770d = r0
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9769c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9768b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r4.f9765a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r5)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.mo25816a()
            r4.f9766a = r0
        L_0x0088:
            r5.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4774iu.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public boolean m15192a() {
        return this.f9766a != null;
    }

    /* renamed from: a */
    public boolean m15193a(C4774iu iuVar) {
        if (iuVar == null) {
            return false;
        }
        boolean a = mo25775a();
        boolean a2 = iuVar.mo25775a();
        if ((a || a2) && (!a || !a2 || !this.f9766a.equals(iuVar.f9766a))) {
            return false;
        }
        boolean b = mo25777b();
        boolean b2 = iuVar.mo25777b();
        if ((b || b2) && (!b || !b2 || !this.f9765a.compareTo(iuVar.f9765a))) {
            return false;
        }
        boolean c = mo25779c();
        boolean c2 = iuVar.mo25779c();
        if ((c || c2) && (!c || !c2 || !this.f9768b.equals(iuVar.f9768b))) {
            return false;
        }
        boolean d = mo25782d();
        boolean d2 = iuVar.mo25782d();
        if ((d || d2) && (!d || !d2 || !this.f9769c.equals(iuVar.f9769c))) {
            return false;
        }
        boolean e = mo25784e();
        boolean e2 = iuVar.mo25784e();
        if ((e || e2) && (!e || !e2 || !this.f9770d.equals(iuVar.f9770d))) {
            return false;
        }
        boolean f = mo25786f();
        boolean f2 = iuVar.mo25786f();
        if ((f || f2) && (!f || !f2 || !this.f9771e.equals(iuVar.f9771e))) {
            return false;
        }
        boolean g = mo25787g();
        boolean g2 = iuVar.mo25787g();
        if ((g || g2) && (!g || !g2 || !this.f9772f.equals(iuVar.f9772f))) {
            return false;
        }
        boolean h = mo25788h();
        boolean h2 = iuVar.mo25788h();
        if (h || h2) {
            return h && h2 && this.f9767a.equals(iuVar.f9767a);
        }
        return true;
    }

    /* renamed from: b */
    public C4774iu mo25776b(String str) {
        this.f9769c = str;
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25775a();
        jiVar.mo25823a(f9757a);
        if (this.f9766a != null && mo25775a()) {
            jiVar.mo25820a(f9756a);
            jiVar.mo25824a(this.f9766a);
            jiVar.mo25828b();
        }
        if (this.f9765a != null && mo25777b()) {
            jiVar.mo25820a(f9758b);
            this.f9765a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9768b != null) {
            jiVar.mo25820a(f9759c);
            jiVar.mo25824a(this.f9768b);
            jiVar.mo25828b();
        }
        if (this.f9769c != null) {
            jiVar.mo25820a(f9760d);
            jiVar.mo25824a(this.f9769c);
            jiVar.mo25828b();
        }
        if (this.f9770d != null) {
            jiVar.mo25820a(f9761e);
            jiVar.mo25824a(this.f9770d);
            jiVar.mo25828b();
        }
        if (this.f9771e != null && mo25786f()) {
            jiVar.mo25820a(f9762f);
            jiVar.mo25824a(this.f9771e);
            jiVar.mo25828b();
        }
        if (this.f9772f != null && mo25787g()) {
            jiVar.mo25820a(f9763g);
            jiVar.mo25824a(this.f9772f);
            jiVar.mo25828b();
        }
        if (this.f9767a != null && mo25788h()) {
            jiVar.mo25820a(f9764h);
            jiVar.mo25821a(new C4792jg((byte) 11, this.f9767a.size()));
            for (String a : this.f9767a) {
                jiVar.mo25824a(a);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25777b() {
        return this.f9765a != null;
    }

    /* renamed from: c */
    public C4774iu mo25778c(String str) {
        this.f9770d = str;
        return this;
    }

    /* renamed from: c */
    public boolean mo25779c() {
        return this.f9768b != null;
    }

    /* renamed from: d */
    public C4774iu mo25781d(String str) {
        this.f9771e = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo25782d() {
        return this.f9769c != null;
    }

    /* renamed from: e */
    public C4774iu mo25783e(String str) {
        this.f9772f = str;
        return this;
    }

    /* renamed from: e */
    public boolean mo25784e() {
        return this.f9770d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4774iu)) {
            return compareTo((C4774iu) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25786f() {
        return this.f9771e != null;
    }

    /* renamed from: g */
    public boolean mo25787g() {
        return this.f9772f != null;
    }

    /* renamed from: h */
    public boolean mo25788h() {
        return this.f9767a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (mo25775a()) {
            sb.append("debug:");
            String str = this.f9766a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25777b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9765a;
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
        String str2 = this.f9768b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9769c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f9770d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (mo25786f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9771e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25787g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f9772f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25788h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f9767a;
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
