package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hz */
public class C4752hz implements C4777ix<C4752hz, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9307a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9308a = new C4799jn("PushMetaInfo");

    /* renamed from: b */
    private static final C4791jf f9309b = new C4791jf("", (byte) 10, 2);

    /* renamed from: c */
    private static final C4791jf f9310c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9311d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9312e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9313f = new C4791jf("", (byte) 8, 6);

    /* renamed from: g */
    private static final C4791jf f9314g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9315h = new C4791jf("", (byte) 8, 8);

    /* renamed from: i */
    private static final C4791jf f9316i = new C4791jf("", (byte) 8, 9);

    /* renamed from: j */
    private static final C4791jf f9317j = new C4791jf("", ParameterInitDefType.IntVec3Init, 10);

    /* renamed from: k */
    private static final C4791jf f9318k = new C4791jf("", ParameterInitDefType.IntVec3Init, 11);

    /* renamed from: l */
    private static final C4791jf f9319l = new C4791jf("", (byte) 2, 12);

    /* renamed from: m */
    private static final C4791jf f9320m = new C4791jf("", ParameterInitDefType.IntVec3Init, 13);

    /* renamed from: a */
    public int f9321a;

    /* renamed from: a */
    public long f9322a;

    /* renamed from: a */
    public String f9323a;

    /* renamed from: a */
    private BitSet f9324a;

    /* renamed from: a */
    public Map<String, String> f9325a;

    /* renamed from: a */
    public boolean f9326a;

    /* renamed from: b */
    public int f9327b;

    /* renamed from: b */
    public String f9328b;

    /* renamed from: b */
    public Map<String, String> f9329b;

    /* renamed from: c */
    public int f9330c;

    /* renamed from: c */
    public String f9331c;

    /* renamed from: c */
    public Map<String, String> f9332c;

    /* renamed from: d */
    public String f9333d;

    /* renamed from: e */
    public String f9334e;

    public C4752hz() {
        this.f9324a = new BitSet(5);
        this.f9326a = false;
    }

    public C4752hz(C4752hz hzVar) {
        BitSet bitSet = new BitSet(5);
        this.f9324a = bitSet;
        bitSet.clear();
        this.f9324a.or(hzVar.f9324a);
        if (hzVar.mo25361a()) {
            this.f9323a = hzVar.f9323a;
        }
        this.f9322a = hzVar.f9322a;
        if (hzVar.mo25373c()) {
            this.f9328b = hzVar.f9328b;
        }
        if (hzVar.mo25379d()) {
            this.f9331c = hzVar.f9331c;
        }
        if (hzVar.mo25382e()) {
            this.f9333d = hzVar.f9333d;
        }
        this.f9321a = hzVar.f9321a;
        if (hzVar.mo25385g()) {
            this.f9334e = hzVar.f9334e;
        }
        this.f9327b = hzVar.f9327b;
        this.f9330c = hzVar.f9330c;
        if (hzVar.mo25389j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : hzVar.f9325a.entrySet()) {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
            this.f9325a = hashMap;
        }
        if (hzVar.mo25390k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next2 : hzVar.f9329b.entrySet()) {
                hashMap2.put((String) next2.getKey(), (String) next2.getValue());
            }
            this.f9329b = hashMap2;
        }
        this.f9326a = hzVar.f9326a;
        if (hzVar.mo25393n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry next3 : hzVar.f9332c.entrySet()) {
                hashMap3.put((String) next3.getKey(), (String) next3.getValue());
            }
            this.f9332c = hashMap3;
        }
    }

    /* renamed from: a */
    public int mo25361a() {
        return this.f9321a;
    }

    /* renamed from: a */
    public int compareTo(C4752hz hzVar) {
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
        int a13;
        if (!C4752hz.class.equals(hzVar.getClass())) {
            return C4752hz.class.getName().compareTo(hzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25361a()).compareTo(Boolean.valueOf(hzVar.mo25361a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25361a() && (a13 = C4778iy.m15232a(this.f9323a, hzVar.f9323a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(mo25368b()).compareTo(Boolean.valueOf(hzVar.mo25368b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25368b() && (a12 = C4778iy.m15230a(this.f9322a, hzVar.f9322a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(mo25373c()).compareTo(Boolean.valueOf(hzVar.mo25373c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25373c() && (a11 = C4778iy.m15232a(this.f9328b, hzVar.f9328b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(mo25379d()).compareTo(Boolean.valueOf(hzVar.mo25379d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25379d() && (a10 = C4778iy.m15232a(this.f9331c, hzVar.f9331c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(mo25382e()).compareTo(Boolean.valueOf(hzVar.mo25382e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25382e() && (a9 = C4778iy.m15232a(this.f9333d, hzVar.f9333d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(mo25384f()).compareTo(Boolean.valueOf(hzVar.mo25384f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25384f() && (a8 = C4778iy.m15229a(this.f9321a, hzVar.f9321a)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(mo25385g()).compareTo(Boolean.valueOf(hzVar.mo25385g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25385g() && (a7 = C4778iy.m15232a(this.f9334e, hzVar.f9334e)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(mo25386h()).compareTo(Boolean.valueOf(hzVar.mo25386h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25386h() && (a6 = C4778iy.m15229a(this.f9327b, hzVar.f9327b)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(mo25388i()).compareTo(Boolean.valueOf(hzVar.mo25388i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25388i() && (a5 = C4778iy.m15229a(this.f9330c, hzVar.f9330c)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(mo25389j()).compareTo(Boolean.valueOf(hzVar.mo25389j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo25389j() && (a4 = C4778iy.m15235a((Map) this.f9325a, (Map) hzVar.f9325a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(mo25390k()).compareTo(Boolean.valueOf(hzVar.mo25390k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo25390k() && (a3 = C4778iy.m15235a((Map) this.f9329b, (Map) hzVar.f9329b)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(mo25392m()).compareTo(Boolean.valueOf(hzVar.mo25392m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo25392m() && (a2 = C4778iy.m15238a(this.f9326a, hzVar.f9326a)) != 0) {
            return a2;
        }
        int compareTo13 = Boolean.valueOf(mo25393n()).compareTo(Boolean.valueOf(hzVar.mo25393n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!mo25393n() || (a = C4778iy.m15235a((Map) this.f9332c, (Map) hzVar.f9332c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m14690a() {
        return this.f9322a;
    }

    /* renamed from: a */
    public C4752hz m14691a() {
        return new C4752hz(this);
    }

    /* renamed from: a */
    public C4752hz mo25363a(int i) {
        this.f9321a = i;
        mo25372b(true);
        return this;
    }

    /* renamed from: a */
    public C4752hz mo25364a(String str) {
        this.f9323a = str;
        return this;
    }

    /* renamed from: a */
    public C4752hz mo25365a(Map<String, String> map) {
        this.f9325a = map;
        return this;
    }

    /* renamed from: a */
    public String m14695a() {
        return this.f9323a;
    }

    /* renamed from: a */
    public Map<String, String> m14696a() {
        return this.f9325a;
    }

    /* renamed from: a */
    public void m14697a() {
        if (this.f9323a == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        r9.mo25836h();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r9) {
        /*
            r8 = this;
            r9.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r9.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0033
            r9.mo25834f()
            boolean r9 = r8.mo25368b()
            if (r9 == 0) goto L_0x0018
            r8.mo25361a()
            return
        L_0x0018:
            com.xiaomi.push.jj r9 = new com.xiaomi.push.jj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'messageTs' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0033:
            short r0 = r0.f9822a
            r2 = 0
            r3 = 13
            r4 = 8
            r5 = 2
            r6 = 11
            r7 = 1
            switch(r0) {
                case 1: goto L_0x011c;
                case 2: goto L_0x010e;
                case 3: goto L_0x0105;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00de;
                case 8: goto L_0x00d2;
                case 9: goto L_0x00c6;
                case 10: goto L_0x009d;
                case 11: goto L_0x0078;
                case 12: goto L_0x006b;
                case 13: goto L_0x0046;
                default: goto L_0x0041;
            }
        L_0x0041:
            com.xiaomi.push.C4797jl.m15328a(r9, r1)
            goto L_0x0124
        L_0x0046:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.jh r0 = r9.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9826a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f9332c = r1
        L_0x0057:
            int r1 = r0.f9826a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo25816a()
            java.lang.String r3 = r9.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f9332c
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0057
        L_0x006b:
            if (r1 != r5) goto L_0x0041
            boolean r0 = r9.mo25816a()
            r8.f9326a = r0
            r8.mo25381e(r7)
            goto L_0x0124
        L_0x0078:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.jh r0 = r9.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9826a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f9329b = r1
        L_0x0089:
            int r1 = r0.f9826a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo25816a()
            java.lang.String r3 = r9.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f9329b
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009d:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.jh r0 = r9.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9826a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f9325a = r1
        L_0x00ae:
            int r1 = r0.f9826a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo25816a()
            java.lang.String r3 = r9.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f9325a
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x00ae
        L_0x00c2:
            r9.mo25836h()
            goto L_0x0124
        L_0x00c6:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo25816a()
            r8.f9330c = r0
            r8.mo25380d((boolean) r7)
            goto L_0x0124
        L_0x00d2:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo25816a()
            r8.f9327b = r0
            r8.mo25376c((boolean) r7)
            goto L_0x0124
        L_0x00de:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo25816a()
            r8.f9334e = r0
            goto L_0x0124
        L_0x00e7:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo25816a()
            r8.f9321a = r0
            r8.mo25372b((boolean) r7)
            goto L_0x0124
        L_0x00f3:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo25816a()
            r8.f9333d = r0
            goto L_0x0124
        L_0x00fc:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo25816a()
            r8.f9331c = r0
            goto L_0x0124
        L_0x0105:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo25816a()
            r8.f9328b = r0
            goto L_0x0124
        L_0x010e:
            r0 = 10
            if (r1 != r0) goto L_0x0041
            long r0 = r9.mo25816a()
            r8.f9322a = r0
            r8.mo25367a((boolean) r7)
            goto L_0x0124
        L_0x011c:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo25816a()
            r8.f9323a = r0
        L_0x0124:
            r9.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4752hz.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25366a(String str, String str2) {
        if (this.f9325a == null) {
            this.f9325a = new HashMap();
        }
        this.f9325a.put(str, str2);
    }

    /* renamed from: a */
    public void mo25367a(boolean z) {
        this.f9324a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14701a() {
        return this.f9323a != null;
    }

    /* renamed from: a */
    public boolean m14702a(C4752hz hzVar) {
        if (hzVar == null) {
            return false;
        }
        boolean a = mo25361a();
        boolean a2 = hzVar.mo25361a();
        if (((a || a2) && (!a || !a2 || !this.f9323a.equals(hzVar.f9323a))) || this.f9322a != hzVar.f9322a) {
            return false;
        }
        boolean c = mo25373c();
        boolean c2 = hzVar.mo25373c();
        if ((c || c2) && (!c || !c2 || !this.f9328b.equals(hzVar.f9328b))) {
            return false;
        }
        boolean d = mo25379d();
        boolean d2 = hzVar.mo25379d();
        if ((d || d2) && (!d || !d2 || !this.f9331c.equals(hzVar.f9331c))) {
            return false;
        }
        boolean e = mo25382e();
        boolean e2 = hzVar.mo25382e();
        if ((e || e2) && (!e || !e2 || !this.f9333d.equals(hzVar.f9333d))) {
            return false;
        }
        boolean f = mo25384f();
        boolean f2 = hzVar.mo25384f();
        if ((f || f2) && (!f || !f2 || this.f9321a != hzVar.f9321a)) {
            return false;
        }
        boolean g = mo25385g();
        boolean g2 = hzVar.mo25385g();
        if ((g || g2) && (!g || !g2 || !this.f9334e.equals(hzVar.f9334e))) {
            return false;
        }
        boolean h = mo25386h();
        boolean h2 = hzVar.mo25386h();
        if ((h || h2) && (!h || !h2 || this.f9327b != hzVar.f9327b)) {
            return false;
        }
        boolean i = mo25388i();
        boolean i2 = hzVar.mo25388i();
        if ((i || i2) && (!i || !i2 || this.f9330c != hzVar.f9330c)) {
            return false;
        }
        boolean j = mo25389j();
        boolean j2 = hzVar.mo25389j();
        if ((j || j2) && (!j || !j2 || !this.f9325a.equals(hzVar.f9325a))) {
            return false;
        }
        boolean k = mo25390k();
        boolean k2 = hzVar.mo25390k();
        if ((k || k2) && (!k || !k2 || !this.f9329b.equals(hzVar.f9329b))) {
            return false;
        }
        boolean m = mo25392m();
        boolean m2 = hzVar.mo25392m();
        if ((m || m2) && (!m || !m2 || this.f9326a != hzVar.f9326a)) {
            return false;
        }
        boolean n = mo25393n();
        boolean n2 = hzVar.mo25393n();
        if (n || n2) {
            return n && n2 && this.f9332c.equals(hzVar.f9332c);
        }
        return true;
    }

    /* renamed from: b */
    public int mo25368b() {
        return this.f9327b;
    }

    /* renamed from: b */
    public C4752hz mo25369b(int i) {
        this.f9327b = i;
        mo25376c(true);
        return this;
    }

    /* renamed from: b */
    public C4752hz mo25370b(String str) {
        this.f9328b = str;
        return this;
    }

    /* renamed from: b */
    public String m14706b() {
        return this.f9328b;
    }

    /* renamed from: b */
    public Map<String, String> m14707b() {
        return this.f9329b;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25361a();
        jiVar.mo25823a(f9308a);
        if (this.f9323a != null) {
            jiVar.mo25820a(f9307a);
            jiVar.mo25824a(this.f9323a);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9309b);
        jiVar.mo25819a(this.f9322a);
        jiVar.mo25828b();
        if (this.f9328b != null && mo25373c()) {
            jiVar.mo25820a(f9310c);
            jiVar.mo25824a(this.f9328b);
            jiVar.mo25828b();
        }
        if (this.f9331c != null && mo25379d()) {
            jiVar.mo25820a(f9311d);
            jiVar.mo25824a(this.f9331c);
            jiVar.mo25828b();
        }
        if (this.f9333d != null && mo25382e()) {
            jiVar.mo25820a(f9312e);
            jiVar.mo25824a(this.f9333d);
            jiVar.mo25828b();
        }
        if (mo25384f()) {
            jiVar.mo25820a(f9313f);
            jiVar.mo25817a(this.f9321a);
            jiVar.mo25828b();
        }
        if (this.f9334e != null && mo25385g()) {
            jiVar.mo25820a(f9314g);
            jiVar.mo25824a(this.f9334e);
            jiVar.mo25828b();
        }
        if (mo25386h()) {
            jiVar.mo25820a(f9315h);
            jiVar.mo25817a(this.f9327b);
            jiVar.mo25828b();
        }
        if (mo25388i()) {
            jiVar.mo25820a(f9316i);
            jiVar.mo25817a(this.f9330c);
            jiVar.mo25828b();
        }
        if (this.f9325a != null && mo25389j()) {
            jiVar.mo25820a(f9317j);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9325a.size()));
            for (Map.Entry next : this.f9325a.entrySet()) {
                jiVar.mo25824a((String) next.getKey());
                jiVar.mo25824a((String) next.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        if (this.f9329b != null && mo25390k()) {
            jiVar.mo25820a(f9318k);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9329b.size()));
            for (Map.Entry next2 : this.f9329b.entrySet()) {
                jiVar.mo25824a((String) next2.getKey());
                jiVar.mo25824a((String) next2.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        if (mo25392m()) {
            jiVar.mo25820a(f9319l);
            jiVar.mo25827a(this.f9326a);
            jiVar.mo25828b();
        }
        if (this.f9332c != null && mo25393n()) {
            jiVar.mo25820a(f9320m);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9332c.size()));
            for (Map.Entry next3 : this.f9332c.entrySet()) {
                jiVar.mo25824a((String) next3.getKey());
                jiVar.mo25824a((String) next3.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25371b(String str, String str2) {
        if (this.f9329b == null) {
            this.f9329b = new HashMap();
        }
        this.f9329b.put(str, str2);
    }

    /* renamed from: b */
    public void mo25372b(boolean z) {
        this.f9324a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14711b() {
        return this.f9324a.get(0);
    }

    /* renamed from: c */
    public int mo25373c() {
        return this.f9330c;
    }

    /* renamed from: c */
    public C4752hz mo25374c(int i) {
        this.f9330c = i;
        mo25380d(true);
        return this;
    }

    /* renamed from: c */
    public C4752hz mo25375c(String str) {
        this.f9331c = str;
        return this;
    }

    /* renamed from: c */
    public String m14715c() {
        return this.f9331c;
    }

    /* renamed from: c */
    public void mo25376c(boolean z) {
        this.f9324a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14717c() {
        return this.f9328b != null;
    }

    /* renamed from: d */
    public C4752hz mo25378d(String str) {
        this.f9333d = str;
        return this;
    }

    /* renamed from: d */
    public String mo25379d() {
        return this.f9333d;
    }

    /* renamed from: d */
    public void mo25380d(boolean z) {
        this.f9324a.set(3, z);
    }

    /* renamed from: d */
    public boolean m14721d() {
        return this.f9331c != null;
    }

    /* renamed from: e */
    public void mo25381e(boolean z) {
        this.f9324a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo25382e() {
        return this.f9333d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4752hz)) {
            return compareTo((C4752hz) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25384f() {
        return this.f9324a.get(1);
    }

    /* renamed from: g */
    public boolean mo25385g() {
        return this.f9334e != null;
    }

    /* renamed from: h */
    public boolean mo25386h() {
        return this.f9324a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25388i() {
        return this.f9324a.get(3);
    }

    /* renamed from: j */
    public boolean mo25389j() {
        return this.f9325a != null;
    }

    /* renamed from: k */
    public boolean mo25390k() {
        return this.f9329b != null;
    }

    /* renamed from: l */
    public boolean mo25391l() {
        return this.f9326a;
    }

    /* renamed from: m */
    public boolean mo25392m() {
        return this.f9324a.get(4);
    }

    /* renamed from: n */
    public boolean mo25393n() {
        return this.f9332c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f9323a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f9322a);
        if (mo25373c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f9328b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo25379d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f9331c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25382e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f9333d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25384f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f9321a);
        }
        if (mo25385g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f9334e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25386h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f9327b);
        }
        if (mo25388i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f9330c);
        }
        if (mo25389j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f9325a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo25390k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f9329b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (mo25392m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f9326a);
        }
        if (mo25393n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f9332c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
