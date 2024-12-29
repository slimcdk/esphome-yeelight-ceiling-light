package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.ih */
public class C4761ih implements C4777ix<C4761ih, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9457a = new C4791jf("", (byte) 12, 2);

    /* renamed from: a */
    private static final C4799jn f9458a = new C4799jn("XmPushActionCommandResult");

    /* renamed from: b */
    private static final C4791jf f9459b = new C4791jf("", (byte) 11, 3);

    /* renamed from: c */
    private static final C4791jf f9460c = new C4791jf("", (byte) 11, 4);

    /* renamed from: d */
    private static final C4791jf f9461d = new C4791jf("", (byte) 11, 5);

    /* renamed from: e */
    private static final C4791jf f9462e = new C4791jf("", (byte) 10, 7);

    /* renamed from: f */
    private static final C4791jf f9463f = new C4791jf("", (byte) 11, 8);

    /* renamed from: g */
    private static final C4791jf f9464g = new C4791jf("", (byte) 11, 9);

    /* renamed from: h */
    private static final C4791jf f9465h = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 10);

    /* renamed from: i */
    private static final C4791jf f9466i = new C4791jf("", (byte) 11, 12);

    /* renamed from: j */
    private static final C4791jf f9467j = new C4791jf("", (byte) 2, 13);

    /* renamed from: a */
    public long f9468a;

    /* renamed from: a */
    public C4755ib f9469a;

    /* renamed from: a */
    public String f9470a;

    /* renamed from: a */
    private BitSet f9471a = new BitSet(2);

    /* renamed from: a */
    public List<String> f9472a;

    /* renamed from: a */
    public boolean f9473a = true;

    /* renamed from: b */
    public String f9474b;

    /* renamed from: c */
    public String f9475c;

    /* renamed from: d */
    public String f9476d;

    /* renamed from: e */
    public String f9477e;

    /* renamed from: f */
    public String f9478f;

    /* renamed from: a */
    public int compareTo(C4761ih ihVar) {
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
        if (!C4761ih.class.equals(ihVar.getClass())) {
            return C4761ih.class.getName().compareTo(ihVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25504a()).compareTo(Boolean.valueOf(ihVar.mo25504a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25504a() && (a10 = C4778iy.m15231a((Comparable) this.f9469a, (Comparable) ihVar.f9469a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo25506b()).compareTo(Boolean.valueOf(ihVar.mo25506b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25506b() && (a9 = C4778iy.m15232a(this.f9470a, ihVar.f9470a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo25508c()).compareTo(Boolean.valueOf(ihVar.mo25508c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25508c() && (a8 = C4778iy.m15232a(this.f9474b, ihVar.f9474b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo25510d()).compareTo(Boolean.valueOf(ihVar.mo25510d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25510d() && (a7 = C4778iy.m15232a(this.f9475c, ihVar.f9475c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo25511e()).compareTo(Boolean.valueOf(ihVar.mo25511e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25511e() && (a6 = C4778iy.m15230a(this.f9468a, ihVar.f9468a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo25513f()).compareTo(Boolean.valueOf(ihVar.mo25513f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25513f() && (a5 = C4778iy.m15232a(this.f9476d, ihVar.f9476d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo25514g()).compareTo(Boolean.valueOf(ihVar.mo25514g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25514g() && (a4 = C4778iy.m15232a(this.f9477e, ihVar.f9477e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo25515h()).compareTo(Boolean.valueOf(ihVar.mo25515h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25515h() && (a3 = C4778iy.m15234a((List) this.f9472a, (List) ihVar.f9472a)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo25517i()).compareTo(Boolean.valueOf(ihVar.mo25517i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25517i() && (a2 = C4778iy.m15232a(this.f9478f, ihVar.f9478f)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo25518j()).compareTo(Boolean.valueOf(ihVar.mo25518j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo25518j() || (a = C4778iy.m15238a(this.f9473a, ihVar.f9473a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo25504a() {
        return this.f9475c;
    }

    /* renamed from: a */
    public List<String> m14886a() {
        return this.f9472a;
    }

    /* renamed from: a */
    public void m14887a() {
        if (this.f9470a == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9474b == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f9475c == null) {
            throw new C4795jj("Required field 'cmdName' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0033
            r5.mo25834f()
            boolean r5 = r4.mo25511e()
            if (r5 == 0) goto L_0x0018
            r4.mo25504a()
            return
        L_0x0018:
            com.xiaomi.push.jj r5 = new com.xiaomi.push.jj
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
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r5, r1)
            goto L_0x00c7
        L_0x0040:
            r0 = 2
            if (r1 != r0) goto L_0x003b
            boolean r0 = r5.mo25816a()
            r4.f9473a = r0
            r4.mo25507b((boolean) r2)
            goto L_0x00c7
        L_0x004e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9478f = r0
            goto L_0x00c7
        L_0x0058:
            r0 = 15
            if (r1 != r0) goto L_0x003b
            com.xiaomi.push.jg r0 = r5.mo25816a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f9824a
            r1.<init>(r2)
            r4.f9472a = r1
            r1 = 0
        L_0x006a:
            int r2 = r0.f9824a
            if (r1 >= r2) goto L_0x007a
            java.lang.String r2 = r5.mo25816a()
            java.util.List<java.lang.String> r3 = r4.f9472a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x006a
        L_0x007a:
            r5.mo25837i()
            goto L_0x00c7
        L_0x007e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9477e = r0
            goto L_0x00c7
        L_0x0087:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9476d = r0
            goto L_0x00c7
        L_0x0090:
            r0 = 10
            if (r1 != r0) goto L_0x003b
            long r0 = r5.mo25816a()
            r4.f9468a = r0
            r4.mo25505a((boolean) r2)
            goto L_0x00c7
        L_0x009e:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9475c = r0
            goto L_0x00c7
        L_0x00a7:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9474b = r0
            goto L_0x00c7
        L_0x00b0:
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.mo25816a()
            r4.f9470a = r0
            goto L_0x00c7
        L_0x00b9:
            r0 = 12
            if (r1 != r0) goto L_0x003b
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r4.f9469a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r5)
        L_0x00c7:
            r5.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4761ih.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25505a(boolean z) {
        this.f9471a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14890a() {
        return this.f9469a != null;
    }

    /* renamed from: a */
    public boolean m14891a(C4761ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        boolean a = mo25504a();
        boolean a2 = ihVar.mo25504a();
        if ((a || a2) && (!a || !a2 || !this.f9469a.compareTo(ihVar.f9469a))) {
            return false;
        }
        boolean b = mo25506b();
        boolean b2 = ihVar.mo25506b();
        if ((b || b2) && (!b || !b2 || !this.f9470a.equals(ihVar.f9470a))) {
            return false;
        }
        boolean c = mo25508c();
        boolean c2 = ihVar.mo25508c();
        if ((c || c2) && (!c || !c2 || !this.f9474b.equals(ihVar.f9474b))) {
            return false;
        }
        boolean d = mo25510d();
        boolean d2 = ihVar.mo25510d();
        if (((d || d2) && (!d || !d2 || !this.f9475c.equals(ihVar.f9475c))) || this.f9468a != ihVar.f9468a) {
            return false;
        }
        boolean f = mo25513f();
        boolean f2 = ihVar.mo25513f();
        if ((f || f2) && (!f || !f2 || !this.f9476d.equals(ihVar.f9476d))) {
            return false;
        }
        boolean g = mo25514g();
        boolean g2 = ihVar.mo25514g();
        if ((g || g2) && (!g || !g2 || !this.f9477e.equals(ihVar.f9477e))) {
            return false;
        }
        boolean h = mo25515h();
        boolean h2 = ihVar.mo25515h();
        if ((h || h2) && (!h || !h2 || !this.f9472a.equals(ihVar.f9472a))) {
            return false;
        }
        boolean i = mo25517i();
        boolean i2 = ihVar.mo25517i();
        if ((i || i2) && (!i || !i2 || !this.f9478f.equals(ihVar.f9478f))) {
            return false;
        }
        boolean j = mo25518j();
        boolean j2 = ihVar.mo25518j();
        if (j || j2) {
            return j && j2 && this.f9473a == ihVar.f9473a;
        }
        return true;
    }

    /* renamed from: b */
    public String mo25506b() {
        return this.f9478f;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25504a();
        jiVar.mo25823a(f9458a);
        if (this.f9469a != null && mo25504a()) {
            jiVar.mo25820a(f9457a);
            this.f9469a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9470a != null) {
            jiVar.mo25820a(f9459b);
            jiVar.mo25824a(this.f9470a);
            jiVar.mo25828b();
        }
        if (this.f9474b != null) {
            jiVar.mo25820a(f9460c);
            jiVar.mo25824a(this.f9474b);
            jiVar.mo25828b();
        }
        if (this.f9475c != null) {
            jiVar.mo25820a(f9461d);
            jiVar.mo25824a(this.f9475c);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9462e);
        jiVar.mo25819a(this.f9468a);
        jiVar.mo25828b();
        if (this.f9476d != null && mo25513f()) {
            jiVar.mo25820a(f9463f);
            jiVar.mo25824a(this.f9476d);
            jiVar.mo25828b();
        }
        if (this.f9477e != null && mo25514g()) {
            jiVar.mo25820a(f9464g);
            jiVar.mo25824a(this.f9477e);
            jiVar.mo25828b();
        }
        if (this.f9472a != null && mo25515h()) {
            jiVar.mo25820a(f9465h);
            jiVar.mo25821a(new C4792jg((byte) 11, this.f9472a.size()));
            for (String a : this.f9472a) {
                jiVar.mo25824a(a);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        if (this.f9478f != null && mo25517i()) {
            jiVar.mo25820a(f9466i);
            jiVar.mo25824a(this.f9478f);
            jiVar.mo25828b();
        }
        if (mo25518j()) {
            jiVar.mo25820a(f9467j);
            jiVar.mo25827a(this.f9473a);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25507b(boolean z) {
        this.f9471a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14895b() {
        return this.f9470a != null;
    }

    /* renamed from: c */
    public boolean mo25508c() {
        return this.f9474b != null;
    }

    /* renamed from: d */
    public boolean mo25510d() {
        return this.f9475c != null;
    }

    /* renamed from: e */
    public boolean mo25511e() {
        return this.f9471a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4761ih)) {
            return compareTo((C4761ih) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25513f() {
        return this.f9476d != null;
    }

    /* renamed from: g */
    public boolean mo25514g() {
        return this.f9477e != null;
    }

    /* renamed from: h */
    public boolean mo25515h() {
        return this.f9472a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25517i() {
        return this.f9478f != null;
    }

    /* renamed from: j */
    public boolean mo25518j() {
        return this.f9471a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (mo25504a()) {
            sb.append("target:");
            C4755ib ibVar = this.f9469a;
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
        String str = this.f9470a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f9474b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f9475c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9468a);
        if (mo25513f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9476d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25514g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9477e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25515h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f9472a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (mo25517i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f9478f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25518j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f9473a);
        }
        sb.append(")");
        return sb.toString();
    }
}
