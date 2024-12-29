package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.il */
public class C4765il implements C4777ix<C4765il, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9503a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9504a = new C4799jn("XmPushActionNotification");

    /* renamed from: b */
    private static final C4791jf f9505b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9506c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9507d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9508e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9509f = new C4791jf("", (byte) 2, 6);

    /* renamed from: g */
    private static final C4791jf f9510g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f9511h = new C4791jf("", ParameterInitDefType.IntVec3Init, 8);

    /* renamed from: i */
    private static final C4791jf f9512i = new C4791jf("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4791jf f9513j = new C4791jf("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4791jf f9514k = new C4791jf("", (byte) 11, 12);

    /* renamed from: l */
    private static final C4791jf f9515l = new C4791jf("", (byte) 11, 13);

    /* renamed from: m */
    private static final C4791jf f9516m = new C4791jf("", (byte) 11, 14);

    /* renamed from: n */
    private static final C4791jf f9517n = new C4791jf("", (byte) 10, 15);

    /* renamed from: o */
    private static final C4791jf f9518o = new C4791jf("", (byte) 2, 20);

    /* renamed from: a */
    public long f9519a;

    /* renamed from: a */
    public C4755ib f9520a;

    /* renamed from: a */
    public String f9521a;

    /* renamed from: a */
    public ByteBuffer f9522a;

    /* renamed from: a */
    private BitSet f9523a;

    /* renamed from: a */
    public Map<String, String> f9524a;

    /* renamed from: a */
    public boolean f9525a;

    /* renamed from: b */
    public String f9526b;

    /* renamed from: b */
    public boolean f9527b;

    /* renamed from: c */
    public String f9528c;

    /* renamed from: d */
    public String f9529d;

    /* renamed from: e */
    public String f9530e;

    /* renamed from: f */
    public String f9531f;

    /* renamed from: g */
    public String f9532g;

    /* renamed from: h */
    public String f9533h;

    /* renamed from: i */
    public String f9534i;

    public C4765il() {
        this.f9523a = new BitSet(3);
        this.f9525a = true;
        this.f9527b = false;
    }

    public C4765il(String str, boolean z) {
        this();
        this.f9526b = str;
        this.f9525a = z;
        mo25558a(true);
    }

    /* renamed from: a */
    public int compareTo(C4765il ilVar) {
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
        int a14;
        int a15;
        if (!C4765il.class.equals(ilVar.getClass())) {
            return C4765il.class.getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25560a()).compareTo(Boolean.valueOf(ilVar.mo25560a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25560a() && (a15 = C4778iy.m15232a(this.f9521a, ilVar.f9521a)) != 0) {
            return a15;
        }
        int compareTo2 = Boolean.valueOf(mo25563b()).compareTo(Boolean.valueOf(ilVar.mo25563b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25563b() && (a14 = C4778iy.m15231a((Comparable) this.f9520a, (Comparable) ilVar.f9520a)) != 0) {
            return a14;
        }
        int compareTo3 = Boolean.valueOf(mo25566c()).compareTo(Boolean.valueOf(ilVar.mo25566c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25566c() && (a13 = C4778iy.m15232a(this.f9526b, ilVar.f9526b)) != 0) {
            return a13;
        }
        int compareTo4 = Boolean.valueOf(mo25570d()).compareTo(Boolean.valueOf(ilVar.mo25570d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25570d() && (a12 = C4778iy.m15232a(this.f9528c, ilVar.f9528c)) != 0) {
            return a12;
        }
        int compareTo5 = Boolean.valueOf(mo25571e()).compareTo(Boolean.valueOf(ilVar.mo25571e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25571e() && (a11 = C4778iy.m15232a(this.f9529d, ilVar.f9529d)) != 0) {
            return a11;
        }
        int compareTo6 = Boolean.valueOf(mo25573f()).compareTo(Boolean.valueOf(ilVar.mo25573f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25573f() && (a10 = C4778iy.m15238a(this.f9525a, ilVar.f9525a)) != 0) {
            return a10;
        }
        int compareTo7 = Boolean.valueOf(mo25574g()).compareTo(Boolean.valueOf(ilVar.mo25574g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25574g() && (a9 = C4778iy.m15232a(this.f9530e, ilVar.f9530e)) != 0) {
            return a9;
        }
        int compareTo8 = Boolean.valueOf(mo25575h()).compareTo(Boolean.valueOf(ilVar.mo25575h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25575h() && (a8 = C4778iy.m15235a((Map) this.f9524a, (Map) ilVar.f9524a)) != 0) {
            return a8;
        }
        int compareTo9 = Boolean.valueOf(mo25577i()).compareTo(Boolean.valueOf(ilVar.mo25577i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25577i() && (a7 = C4778iy.m15232a(this.f9531f, ilVar.f9531f)) != 0) {
            return a7;
        }
        int compareTo10 = Boolean.valueOf(mo25578j()).compareTo(Boolean.valueOf(ilVar.mo25578j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo25578j() && (a6 = C4778iy.m15232a(this.f9532g, ilVar.f9532g)) != 0) {
            return a6;
        }
        int compareTo11 = Boolean.valueOf(mo25579k()).compareTo(Boolean.valueOf(ilVar.mo25579k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo25579k() && (a5 = C4778iy.m15232a(this.f9533h, ilVar.f9533h)) != 0) {
            return a5;
        }
        int compareTo12 = Boolean.valueOf(mo25580l()).compareTo(Boolean.valueOf(ilVar.mo25580l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo25580l() && (a4 = C4778iy.m15232a(this.f9534i, ilVar.f9534i)) != 0) {
            return a4;
        }
        int compareTo13 = Boolean.valueOf(mo25581m()).compareTo(Boolean.valueOf(ilVar.mo25581m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo25581m() && (a3 = C4778iy.m15231a((Comparable) this.f9522a, (Comparable) ilVar.f9522a)) != 0) {
            return a3;
        }
        int compareTo14 = Boolean.valueOf(mo25582n()).compareTo(Boolean.valueOf(ilVar.mo25582n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo25582n() && (a2 = C4778iy.m15230a(this.f9519a, ilVar.f9519a)) != 0) {
            return a2;
        }
        int compareTo15 = Boolean.valueOf(mo25583o()).compareTo(Boolean.valueOf(ilVar.mo25583o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!mo25583o() || (a = C4778iy.m15238a(this.f9527b, ilVar.f9527b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4765il mo25555a(String str) {
        this.f9526b = str;
        return this;
    }

    /* renamed from: a */
    public C4765il mo25556a(ByteBuffer byteBuffer) {
        this.f9522a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4765il mo25557a(Map<String, String> map) {
        this.f9524a = map;
        return this;
    }

    /* renamed from: a */
    public C4765il mo25558a(boolean z) {
        this.f9525a = z;
        mo25558a(true);
        return this;
    }

    /* renamed from: a */
    public C4765il mo25559a(byte[] bArr) {
        mo25556a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public String mo25560a() {
        return this.f9526b;
    }

    /* renamed from: a */
    public Map<String, String> m14954a() {
        return this.f9524a;
    }

    /* renamed from: a */
    public void m14955a() {
        if (this.f9526b == null) {
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
            if (r1 != 0) goto L_0x0033
            r6.mo25834f()
            boolean r6 = r5.mo25573f()
            if (r6 == 0) goto L_0x0018
            r5.mo25560a()
            return
        L_0x0018:
            com.xiaomi.push.jj r6 = new com.xiaomi.push.jj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'requireAck' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0033:
            short r0 = r0.f9822a
            r2 = 2
            r3 = 1
            r4 = 11
            switch(r0) {
                case 1: goto L_0x00fa;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00bb;
                case 8: goto L_0x008f;
                case 9: goto L_0x0085;
                case 10: goto L_0x007b;
                case 11: goto L_0x003c;
                case 12: goto L_0x0071;
                case 13: goto L_0x0067;
                case 14: goto L_0x005d;
                case 15: goto L_0x004e;
                case 16: goto L_0x003c;
                case 17: goto L_0x003c;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x0041;
                default: goto L_0x003c;
            }
        L_0x003c:
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x0102
        L_0x0041:
            if (r1 != r2) goto L_0x003c
            boolean r0 = r6.mo25816a()
            r5.f9527b = r0
            r5.mo25567c((boolean) r3)
            goto L_0x0102
        L_0x004e:
            r0 = 10
            if (r1 != r0) goto L_0x003c
            long r0 = r6.mo25816a()
            r5.f9519a = r0
            r5.mo25564b((boolean) r3)
            goto L_0x0102
        L_0x005d:
            if (r1 != r4) goto L_0x003c
            java.nio.ByteBuffer r0 = r6.mo25816a()
            r5.f9522a = r0
            goto L_0x0102
        L_0x0067:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9534i = r0
            goto L_0x0102
        L_0x0071:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9533h = r0
            goto L_0x0102
        L_0x007b:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9532g = r0
            goto L_0x0102
        L_0x0085:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9531f = r0
            goto L_0x0102
        L_0x008f:
            r0 = 13
            if (r1 != r0) goto L_0x003c
            com.xiaomi.push.jh r0 = r6.mo25816a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9826a
            int r3 = r3 * 2
            r1.<init>(r3)
            r5.f9524a = r1
            r1 = 0
        L_0x00a3:
            int r2 = r0.f9826a
            if (r1 >= r2) goto L_0x00b7
            java.lang.String r2 = r6.mo25816a()
            java.lang.String r3 = r6.mo25816a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f9524a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00b7:
            r6.mo25836h()
            goto L_0x0102
        L_0x00bb:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9530e = r0
            goto L_0x0102
        L_0x00c4:
            if (r1 != r2) goto L_0x003c
            boolean r0 = r6.mo25816a()
            r5.f9525a = r0
            r5.mo25558a((boolean) r3)
            goto L_0x0102
        L_0x00d0:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9529d = r0
            goto L_0x0102
        L_0x00d9:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9528c = r0
            goto L_0x0102
        L_0x00e2:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9526b = r0
            goto L_0x0102
        L_0x00eb:
            r0 = 12
            if (r1 != r0) goto L_0x003c
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r5.f9520a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r6)
            goto L_0x0102
        L_0x00fa:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo25816a()
            r5.f9521a = r0
        L_0x0102:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4765il.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25561a(String str, String str2) {
        if (this.f9524a == null) {
            this.f9524a = new HashMap();
        }
        this.f9524a.put(str, str2);
    }

    /* renamed from: a */
    public void m14958a(boolean z) {
        this.f9523a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14959a() {
        return this.f9521a != null;
    }

    /* renamed from: a */
    public boolean m14960a(C4765il ilVar) {
        if (ilVar == null) {
            return false;
        }
        boolean a = mo25560a();
        boolean a2 = ilVar.mo25560a();
        if ((a || a2) && (!a || !a2 || !this.f9521a.equals(ilVar.f9521a))) {
            return false;
        }
        boolean b = mo25563b();
        boolean b2 = ilVar.mo25563b();
        if ((b || b2) && (!b || !b2 || !this.f9520a.compareTo(ilVar.f9520a))) {
            return false;
        }
        boolean c = mo25566c();
        boolean c2 = ilVar.mo25566c();
        if ((c || c2) && (!c || !c2 || !this.f9526b.equals(ilVar.f9526b))) {
            return false;
        }
        boolean d = mo25570d();
        boolean d2 = ilVar.mo25570d();
        if ((d || d2) && (!d || !d2 || !this.f9528c.equals(ilVar.f9528c))) {
            return false;
        }
        boolean e = mo25571e();
        boolean e2 = ilVar.mo25571e();
        if (((e || e2) && (!e || !e2 || !this.f9529d.equals(ilVar.f9529d))) || this.f9525a != ilVar.f9525a) {
            return false;
        }
        boolean g = mo25574g();
        boolean g2 = ilVar.mo25574g();
        if ((g || g2) && (!g || !g2 || !this.f9530e.equals(ilVar.f9530e))) {
            return false;
        }
        boolean h = mo25575h();
        boolean h2 = ilVar.mo25575h();
        if ((h || h2) && (!h || !h2 || !this.f9524a.equals(ilVar.f9524a))) {
            return false;
        }
        boolean i = mo25577i();
        boolean i2 = ilVar.mo25577i();
        if ((i || i2) && (!i || !i2 || !this.f9531f.equals(ilVar.f9531f))) {
            return false;
        }
        boolean j = mo25578j();
        boolean j2 = ilVar.mo25578j();
        if ((j || j2) && (!j || !j2 || !this.f9532g.equals(ilVar.f9532g))) {
            return false;
        }
        boolean k = mo25579k();
        boolean k2 = ilVar.mo25579k();
        if ((k || k2) && (!k || !k2 || !this.f9533h.equals(ilVar.f9533h))) {
            return false;
        }
        boolean l = mo25580l();
        boolean l2 = ilVar.mo25580l();
        if ((l || l2) && (!l || !l2 || !this.f9534i.equals(ilVar.f9534i))) {
            return false;
        }
        boolean m = mo25581m();
        boolean m2 = ilVar.mo25581m();
        if ((m || m2) && (!m || !m2 || !this.f9522a.equals(ilVar.f9522a))) {
            return false;
        }
        boolean n = mo25582n();
        boolean n2 = ilVar.mo25582n();
        if ((n || n2) && (!n || !n2 || this.f9519a != ilVar.f9519a)) {
            return false;
        }
        boolean o = mo25583o();
        boolean o2 = ilVar.mo25583o();
        if (o || o2) {
            return o && o2 && this.f9527b == ilVar.f9527b;
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m14961a() {
        mo25556a(C4778iy.m15241a(this.f9522a));
        return this.f9522a.array();
    }

    /* renamed from: b */
    public C4765il mo25562b(String str) {
        this.f9528c = str;
        return this;
    }

    /* renamed from: b */
    public String mo25563b() {
        return this.f9528c;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25560a();
        jiVar.mo25823a(f9504a);
        if (this.f9521a != null && mo25560a()) {
            jiVar.mo25820a(f9503a);
            jiVar.mo25824a(this.f9521a);
            jiVar.mo25828b();
        }
        if (this.f9520a != null && mo25563b()) {
            jiVar.mo25820a(f9505b);
            this.f9520a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9526b != null) {
            jiVar.mo25820a(f9506c);
            jiVar.mo25824a(this.f9526b);
            jiVar.mo25828b();
        }
        if (this.f9528c != null && mo25570d()) {
            jiVar.mo25820a(f9507d);
            jiVar.mo25824a(this.f9528c);
            jiVar.mo25828b();
        }
        if (this.f9529d != null && mo25571e()) {
            jiVar.mo25820a(f9508e);
            jiVar.mo25824a(this.f9529d);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9509f);
        jiVar.mo25827a(this.f9525a);
        jiVar.mo25828b();
        if (this.f9530e != null && mo25574g()) {
            jiVar.mo25820a(f9510g);
            jiVar.mo25824a(this.f9530e);
            jiVar.mo25828b();
        }
        if (this.f9524a != null && mo25575h()) {
            jiVar.mo25820a(f9511h);
            jiVar.mo25822a(new C4793jh((byte) 11, (byte) 11, this.f9524a.size()));
            for (Map.Entry next : this.f9524a.entrySet()) {
                jiVar.mo25824a((String) next.getKey());
                jiVar.mo25824a((String) next.getValue());
            }
            jiVar.mo25832d();
            jiVar.mo25828b();
        }
        if (this.f9531f != null && mo25577i()) {
            jiVar.mo25820a(f9512i);
            jiVar.mo25824a(this.f9531f);
            jiVar.mo25828b();
        }
        if (this.f9532g != null && mo25578j()) {
            jiVar.mo25820a(f9513j);
            jiVar.mo25824a(this.f9532g);
            jiVar.mo25828b();
        }
        if (this.f9533h != null && mo25579k()) {
            jiVar.mo25820a(f9514k);
            jiVar.mo25824a(this.f9533h);
            jiVar.mo25828b();
        }
        if (this.f9534i != null && mo25580l()) {
            jiVar.mo25820a(f9515l);
            jiVar.mo25824a(this.f9534i);
            jiVar.mo25828b();
        }
        if (this.f9522a != null && mo25581m()) {
            jiVar.mo25820a(f9516m);
            jiVar.mo25825a(this.f9522a);
            jiVar.mo25828b();
        }
        if (mo25582n()) {
            jiVar.mo25820a(f9517n);
            jiVar.mo25819a(this.f9519a);
            jiVar.mo25828b();
        }
        if (mo25583o()) {
            jiVar.mo25820a(f9518o);
            jiVar.mo25827a(this.f9527b);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25564b(boolean z) {
        this.f9523a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14966b() {
        return this.f9520a != null;
    }

    /* renamed from: c */
    public C4765il mo25565c(String str) {
        this.f9529d = str;
        return this;
    }

    /* renamed from: c */
    public String mo25566c() {
        return this.f9531f;
    }

    /* renamed from: c */
    public void mo25567c(boolean z) {
        this.f9523a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14970c() {
        return this.f9526b != null;
    }

    /* renamed from: d */
    public C4765il mo25569d(String str) {
        this.f9531f = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo25570d() {
        return this.f9528c != null;
    }

    /* renamed from: e */
    public boolean mo25571e() {
        return this.f9529d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4765il)) {
            return compareTo((C4765il) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25573f() {
        return this.f9523a.get(0);
    }

    /* renamed from: g */
    public boolean mo25574g() {
        return this.f9530e != null;
    }

    /* renamed from: h */
    public boolean mo25575h() {
        return this.f9524a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25577i() {
        return this.f9531f != null;
    }

    /* renamed from: j */
    public boolean mo25578j() {
        return this.f9532g != null;
    }

    /* renamed from: k */
    public boolean mo25579k() {
        return this.f9533h != null;
    }

    /* renamed from: l */
    public boolean mo25580l() {
        return this.f9534i != null;
    }

    /* renamed from: m */
    public boolean mo25581m() {
        return this.f9522a != null;
    }

    /* renamed from: n */
    public boolean mo25582n() {
        return this.f9523a.get(1);
    }

    /* renamed from: o */
    public boolean mo25583o() {
        return this.f9523a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (mo25560a()) {
            sb.append("debug:");
            String str = this.f9521a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25563b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9520a;
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
        String str2 = this.f9526b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo25570d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9528c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25571e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f9529d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f9525a);
        if (mo25574g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f9530e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25575h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f9524a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo25577i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9531f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo25578j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9532g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo25579k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f9533h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo25580l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f9534i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo25581m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f9522a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                C4778iy.m15242a(byteBuffer, sb);
            }
        }
        if (mo25582n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f9519a);
        }
        if (mo25583o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f9527b);
        }
        sb.append(")");
        return sb.toString();
    }
}
