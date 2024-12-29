package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.xiaomi.push.id */
public class C4757id implements C4777ix<C4757id, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9404a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9405a = new C4799jn("XmPushActionAckNotification");

    /* renamed from: b */
    private static final C4791jf f9406b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9407c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9408d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9409e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9410f = new C4791jf("", (byte) 10, 7);

    /* renamed from: g */
    private static final C4791jf f9411g = new C4791jf("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4791jf f9412h = new C4791jf("", ParameterInitDefType.IntVec3Init, 9);

    /* renamed from: i */
    private static final C4791jf f9413i = new C4791jf("", (byte) 11, 10);

    /* renamed from: j */
    private static final C4791jf f9414j = new C4791jf("", (byte) 11, 11);

    /* renamed from: a */
    public long f9415a = 0;

    /* renamed from: a */
    public C4755ib f9416a;

    /* renamed from: a */
    public String f9417a;

    /* renamed from: a */
    private BitSet f9418a = new BitSet(1);

    /* renamed from: a */
    public Map<String, String> f9419a;

    /* renamed from: b */
    public String f9420b;

    /* renamed from: c */
    public String f9421c;

    /* renamed from: d */
    public String f9422d;

    /* renamed from: e */
    public String f9423e;

    /* renamed from: f */
    public String f9424f;

    /* renamed from: g */
    public String f9425g;

    /* renamed from: a */
    public int compareTo(C4757id idVar) {
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
        if (!C4757id.class.equals(idVar.getClass())) {
            return C4757id.class.getName().compareTo(idVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25446a()).compareTo(Boolean.valueOf(idVar.mo25446a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25446a() && (a10 = C4778iy.m15232a(this.f9417a, idVar.f9417a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo25448b()).compareTo(Boolean.valueOf(idVar.mo25448b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25448b() && (a9 = C4778iy.m15231a((Comparable) this.f9416a, (Comparable) idVar.f9416a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo25449c()).compareTo(Boolean.valueOf(idVar.mo25449c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25449c() && (a8 = C4778iy.m15232a(this.f9420b, idVar.f9420b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo25451d()).compareTo(Boolean.valueOf(idVar.mo25451d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25451d() && (a7 = C4778iy.m15232a(this.f9421c, idVar.f9421c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo25452e()).compareTo(Boolean.valueOf(idVar.mo25452e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25452e() && (a6 = C4778iy.m15232a(this.f9422d, idVar.f9422d)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo25454f()).compareTo(Boolean.valueOf(idVar.mo25454f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25454f() && (a5 = C4778iy.m15230a(this.f9415a, idVar.f9415a)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo25455g()).compareTo(Boolean.valueOf(idVar.mo25455g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25455g() && (a4 = C4778iy.m15232a(this.f9423e, idVar.f9423e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo25456h()).compareTo(Boolean.valueOf(idVar.mo25456h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25456h() && (a3 = C4778iy.m15235a((Map) this.f9419a, (Map) idVar.f9419a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo25458i()).compareTo(Boolean.valueOf(idVar.mo25458i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25458i() && (a2 = C4778iy.m15232a(this.f9424f, idVar.f9424f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo25459j()).compareTo(Boolean.valueOf(idVar.mo25459j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo25459j() || (a = C4778iy.m15232a(this.f9425g, idVar.f9425g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo25446a() {
        return this.f9420b;
    }

    /* renamed from: a */
    public Map<String, String> m14824a() {
        return this.f9419a;
    }

    /* renamed from: a */
    public void m14825a() {
        if (this.f9420b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
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
            r5.mo25446a()
            return
        L_0x0012:
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x00a8
        L_0x001e:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9425g = r0
            goto L_0x00a8
        L_0x0028:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9424f = r0
            goto L_0x00a8
        L_0x0032:
            r0 = 13
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.jh r0 = r6.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f9826a
            int r2 = r2 * 2
            r1.<init>(r2)
            r5.f9419a = r1
            r1 = 0
        L_0x0046:
            int r2 = r0.f9826a
            if (r1 >= r2) goto L_0x005a
            java.lang.String r2 = r6.mo25816a()
            java.lang.String r3 = r6.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f9419a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0046
        L_0x005a:
            r6.mo25836h()
            goto L_0x00a8
        L_0x005e:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9423e = r0
            goto L_0x00a8
        L_0x0067:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r6.mo25816a()
            r5.f9415a = r0
            r0 = 1
            r5.mo25447a((boolean) r0)
            goto L_0x00a8
        L_0x0076:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9422d = r0
            goto L_0x00a8
        L_0x007f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9421c = r0
            goto L_0x00a8
        L_0x0088:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9420b = r0
            goto L_0x00a8
        L_0x0091:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r5.f9416a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r6)
            goto L_0x00a8
        L_0x00a0:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.mo25816a()
            r5.f9417a = r0
        L_0x00a8:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4757id.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25447a(boolean z) {
        this.f9418a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14828a() {
        return this.f9417a != null;
    }

    /* renamed from: a */
    public boolean m14829a(C4757id idVar) {
        if (idVar == null) {
            return false;
        }
        boolean a = mo25446a();
        boolean a2 = idVar.mo25446a();
        if ((a || a2) && (!a || !a2 || !this.f9417a.equals(idVar.f9417a))) {
            return false;
        }
        boolean b = mo25448b();
        boolean b2 = idVar.mo25448b();
        if ((b || b2) && (!b || !b2 || !this.f9416a.compareTo(idVar.f9416a))) {
            return false;
        }
        boolean c = mo25449c();
        boolean c2 = idVar.mo25449c();
        if ((c || c2) && (!c || !c2 || !this.f9420b.equals(idVar.f9420b))) {
            return false;
        }
        boolean d = mo25451d();
        boolean d2 = idVar.mo25451d();
        if ((d || d2) && (!d || !d2 || !this.f9421c.equals(idVar.f9421c))) {
            return false;
        }
        boolean e = mo25452e();
        boolean e2 = idVar.mo25452e();
        if ((e || e2) && (!e || !e2 || !this.f9422d.equals(idVar.f9422d))) {
            return false;
        }
        boolean f = mo25454f();
        boolean f2 = idVar.mo25454f();
        if ((f || f2) && (!f || !f2 || this.f9415a != idVar.f9415a)) {
            return false;
        }
        boolean g = mo25455g();
        boolean g2 = idVar.mo25455g();
        if ((g || g2) && (!g || !g2 || !this.f9423e.equals(idVar.f9423e))) {
            return false;
        }
        boolean h = mo25456h();
        boolean h2 = idVar.mo25456h();
        if ((h || h2) && (!h || !h2 || !this.f9419a.equals(idVar.f9419a))) {
            return false;
        }
        boolean i = mo25458i();
        boolean i2 = idVar.mo25458i();
        if ((i || i2) && (!i || !i2 || !this.f9424f.equals(idVar.f9424f))) {
            return false;
        }
        boolean j = mo25459j();
        boolean j2 = idVar.mo25459j();
        if (j || j2) {
            return j && j2 && this.f9425g.equals(idVar.f9425g);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25446a();
        jiVar.mo25823a(f9405a);
        if (this.f9417a != null && mo25446a()) {
            jiVar.mo25820a(f9404a);
            jiVar.mo25824a(this.f9417a);
            jiVar.mo25828b();
        }
        if (this.f9416a != null && mo25448b()) {
            jiVar.mo25820a(f9406b);
            this.f9416a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9420b != null) {
            jiVar.mo25820a(f9407c);
            jiVar.mo25824a(this.f9420b);
            jiVar.mo25828b();
        }
        if (this.f9421c != null && mo25451d()) {
            jiVar.mo25820a(f9408d);
            jiVar.mo25824a(this.f9421c);
            jiVar.mo25828b();
        }
        if (this.f9422d != null && mo25452e()) {
            jiVar.mo25820a(f9409e);
            jiVar.mo25824a(this.f9422d);
            jiVar.mo25828b();
        }
        if (mo25454f()) {
            jiVar.mo25820a(f9410f);
            jiVar.mo25819a(this.f9415a);
            jiVar.mo25828b();
        }
        if (this.f9423e != null && mo25455g()) {
            jiVar.mo25820a(f9411g);
            jiVar.mo25824a(this.f9423e);
            jiVar.mo25828b();
        }
        if (this.f9419a != null && mo25456h()) {
            jiVar.mo25820a(f9412h);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9419a.size()));
            for (Map.Entry next : this.f9419a.entrySet()) {
                jiVar.mo25824a((String) next.getKey());
                jiVar.mo25824a((String) next.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        if (this.f9424f != null && mo25458i()) {
            jiVar.mo25820a(f9413i);
            jiVar.mo25824a(this.f9424f);
            jiVar.mo25828b();
        }
        if (this.f9425g != null && mo25459j()) {
            jiVar.mo25820a(f9414j);
            jiVar.mo25824a(this.f9425g);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25448b() {
        return this.f9416a != null;
    }

    /* renamed from: c */
    public boolean mo25449c() {
        return this.f9420b != null;
    }

    /* renamed from: d */
    public boolean mo25451d() {
        return this.f9421c != null;
    }

    /* renamed from: e */
    public boolean mo25452e() {
        return this.f9422d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4757id)) {
            return compareTo((C4757id) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25454f() {
        return this.f9418a.get(0);
    }

    /* renamed from: g */
    public boolean mo25455g() {
        return this.f9423e != null;
    }

    /* renamed from: h */
    public boolean mo25456h() {
        return this.f9419a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25458i() {
        return this.f9424f != null;
    }

    /* renamed from: j */
    public boolean mo25459j() {
        return this.f9425g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (mo25446a()) {
            sb.append("debug:");
            String str = this.f9417a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25448b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9416a;
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
        String str2 = this.f9420b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo25451d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9421c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25452e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f9422d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25454f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f9415a);
        }
        if (mo25455g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f9423e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25456h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f9419a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo25458i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9424f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25459j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9425g;
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
