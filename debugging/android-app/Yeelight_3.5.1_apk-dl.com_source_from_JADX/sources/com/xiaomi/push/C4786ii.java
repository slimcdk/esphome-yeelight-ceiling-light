package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ii */
public class C4786ii implements C4798iu<C4786ii, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8962a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8963a = new C4817jk("XmPushActionNotification");

    /* renamed from: b */
    private static final C4809jc f8964b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f8965c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8966d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8967e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f8968f = new C4809jc("", (byte) 2, 6);

    /* renamed from: g */
    private static final C4809jc f8969g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8970h = new C4809jc("", ParameterInitDefType.IntVec3Init, 8);

    /* renamed from: i */
    private static final C4809jc f8971i = new C4809jc("", (byte) 11, 9);

    /* renamed from: j */
    private static final C4809jc f8972j = new C4809jc("", (byte) 11, 10);

    /* renamed from: k */
    private static final C4809jc f8973k = new C4809jc("", (byte) 11, 12);

    /* renamed from: l */
    private static final C4809jc f8974l = new C4809jc("", (byte) 11, 13);

    /* renamed from: m */
    private static final C4809jc f8975m = new C4809jc("", (byte) 11, 14);

    /* renamed from: n */
    private static final C4809jc f8976n = new C4809jc("", (byte) 10, 15);

    /* renamed from: o */
    private static final C4809jc f8977o = new C4809jc("", (byte) 2, 20);

    /* renamed from: a */
    public long f8978a;

    /* renamed from: a */
    public C4775hy f8979a;

    /* renamed from: a */
    public String f8980a;

    /* renamed from: a */
    public ByteBuffer f8981a;

    /* renamed from: a */
    private BitSet f8982a;

    /* renamed from: a */
    public Map<String, String> f8983a;

    /* renamed from: a */
    public boolean f8984a;

    /* renamed from: b */
    public String f8985b;

    /* renamed from: b */
    public boolean f8986b;

    /* renamed from: c */
    public String f8987c;

    /* renamed from: d */
    public String f8988d;

    /* renamed from: e */
    public String f8989e;

    /* renamed from: f */
    public String f8990f;

    /* renamed from: g */
    public String f8991g;

    /* renamed from: h */
    public String f8992h;

    /* renamed from: i */
    public String f8993i;

    public C4786ii() {
        this.f8982a = new BitSet(3);
        this.f8984a = true;
        this.f8986b = false;
    }

    public C4786ii(String str, boolean z) {
        this();
        this.f8985b = str;
        this.f8984a = z;
        mo29596a(true);
    }

    /* renamed from: a */
    public int compareTo(C4786ii iiVar) {
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
        if (!getClass().equals(iiVar.getClass())) {
            return getClass().getName().compareTo(iiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29592a()).compareTo(Boolean.valueOf(iiVar.mo29592a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29592a() && (a15 = C4799iv.m14841a(this.f8980a, iiVar.f8980a)) != 0) {
            return a15;
        }
        int compareTo2 = Boolean.valueOf(mo29600b()).compareTo(Boolean.valueOf(iiVar.mo29600b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29600b() && (a14 = C4799iv.m14840a((Comparable) this.f8979a, (Comparable) iiVar.f8979a)) != 0) {
            return a14;
        }
        int compareTo3 = Boolean.valueOf(mo29603c()).compareTo(Boolean.valueOf(iiVar.mo29603c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29603c() && (a13 = C4799iv.m14841a(this.f8985b, iiVar.f8985b)) != 0) {
            return a13;
        }
        int compareTo4 = Boolean.valueOf(mo29607d()).compareTo(Boolean.valueOf(iiVar.mo29607d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29607d() && (a12 = C4799iv.m14841a(this.f8987c, iiVar.f8987c)) != 0) {
            return a12;
        }
        int compareTo5 = Boolean.valueOf(mo29608e()).compareTo(Boolean.valueOf(iiVar.mo29608e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29608e() && (a11 = C4799iv.m14841a(this.f8988d, iiVar.f8988d)) != 0) {
            return a11;
        }
        int compareTo6 = Boolean.valueOf(mo29610f()).compareTo(Boolean.valueOf(iiVar.mo29610f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29610f() && (a10 = C4799iv.m14847a(this.f8984a, iiVar.f8984a)) != 0) {
            return a10;
        }
        int compareTo7 = Boolean.valueOf(mo29611g()).compareTo(Boolean.valueOf(iiVar.mo29611g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29611g() && (a9 = C4799iv.m14841a(this.f8989e, iiVar.f8989e)) != 0) {
            return a9;
        }
        int compareTo8 = Boolean.valueOf(mo29612h()).compareTo(Boolean.valueOf(iiVar.mo29612h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29612h() && (a8 = C4799iv.m14844a((Map) this.f8983a, (Map) iiVar.f8983a)) != 0) {
            return a8;
        }
        int compareTo9 = Boolean.valueOf(mo29614i()).compareTo(Boolean.valueOf(iiVar.mo29614i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29614i() && (a7 = C4799iv.m14841a(this.f8990f, iiVar.f8990f)) != 0) {
            return a7;
        }
        int compareTo10 = Boolean.valueOf(mo29615j()).compareTo(Boolean.valueOf(iiVar.mo29615j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29615j() && (a6 = C4799iv.m14841a(this.f8991g, iiVar.f8991g)) != 0) {
            return a6;
        }
        int compareTo11 = Boolean.valueOf(mo29616k()).compareTo(Boolean.valueOf(iiVar.mo29616k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29616k() && (a5 = C4799iv.m14841a(this.f8992h, iiVar.f8992h)) != 0) {
            return a5;
        }
        int compareTo12 = Boolean.valueOf(mo29617l()).compareTo(Boolean.valueOf(iiVar.mo29617l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo29617l() && (a4 = C4799iv.m14841a(this.f8993i, iiVar.f8993i)) != 0) {
            return a4;
        }
        int compareTo13 = Boolean.valueOf(mo29618m()).compareTo(Boolean.valueOf(iiVar.mo29618m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (mo29618m() && (a3 = C4799iv.m14840a((Comparable) this.f8981a, (Comparable) iiVar.f8981a)) != 0) {
            return a3;
        }
        int compareTo14 = Boolean.valueOf(mo29619n()).compareTo(Boolean.valueOf(iiVar.mo29619n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (mo29619n() && (a2 = C4799iv.m14839a(this.f8978a, iiVar.f8978a)) != 0) {
            return a2;
        }
        int compareTo15 = Boolean.valueOf(mo29620o()).compareTo(Boolean.valueOf(iiVar.mo29620o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!mo29620o() || (a = C4799iv.m14847a(this.f8986b, iiVar.f8986b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4775hy mo29592a() {
        return this.f8979a;
    }

    /* renamed from: a */
    public C4786ii mo29593a(String str) {
        this.f8985b = str;
        return this;
    }

    /* renamed from: a */
    public C4786ii mo29594a(ByteBuffer byteBuffer) {
        this.f8981a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4786ii mo29595a(Map<String, String> map) {
        this.f8983a = map;
        return this;
    }

    /* renamed from: a */
    public C4786ii mo29596a(boolean z) {
        this.f8984a = z;
        mo29596a(true);
        return this;
    }

    /* renamed from: a */
    public C4786ii mo29597a(byte[] bArr) {
        mo29594a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public String m14554a() {
        return this.f8985b;
    }

    /* renamed from: a */
    public Map<String, String> m14555a() {
        return this.f8983a;
    }

    /* renamed from: a */
    public void m14556a() {
        if (this.f8985b == null) {
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
            if (r1 != 0) goto L_0x0033
            r6.mo29868f()
            boolean r6 = r5.mo29610f()
            if (r6 == 0) goto L_0x0018
            r5.mo29592a()
            return
        L_0x0018:
            com.xiaomi.push.jg r6 = new com.xiaomi.push.jg
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
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x0102
        L_0x0041:
            if (r1 != r2) goto L_0x003c
            boolean r0 = r6.mo29850a()
            r5.f8986b = r0
            r5.mo29604c((boolean) r3)
            goto L_0x0102
        L_0x004e:
            r0 = 10
            if (r1 != r0) goto L_0x003c
            long r0 = r6.mo29850a()
            r5.f8978a = r0
            r5.mo29601b((boolean) r3)
            goto L_0x0102
        L_0x005d:
            if (r1 != r4) goto L_0x003c
            java.nio.ByteBuffer r0 = r6.mo29850a()
            r5.f8981a = r0
            goto L_0x0102
        L_0x0067:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8993i = r0
            goto L_0x0102
        L_0x0071:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8992h = r0
            goto L_0x0102
        L_0x007b:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8991g = r0
            goto L_0x0102
        L_0x0085:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8990f = r0
            goto L_0x0102
        L_0x008f:
            r0 = 13
            if (r1 != r0) goto L_0x003c
            com.xiaomi.push.je r0 = r6.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r5.f8983a = r1
            r1 = 0
        L_0x00a3:
            int r2 = r0.f9295a
            if (r1 >= r2) goto L_0x00b7
            java.lang.String r2 = r6.mo29850a()
            java.lang.String r3 = r6.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f8983a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00b7:
            r6.mo29870h()
            goto L_0x0102
        L_0x00bb:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8989e = r0
            goto L_0x0102
        L_0x00c4:
            if (r1 != r2) goto L_0x003c
            boolean r0 = r6.mo29850a()
            r5.f8984a = r0
            r5.mo29596a((boolean) r3)
            goto L_0x0102
        L_0x00d0:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8988d = r0
            goto L_0x0102
        L_0x00d9:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8987c = r0
            goto L_0x0102
        L_0x00e2:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8985b = r0
            goto L_0x0102
        L_0x00eb:
            r0 = 12
            if (r1 != r0) goto L_0x003c
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r5.f8979a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r6)
            goto L_0x0102
        L_0x00fa:
            if (r1 != r4) goto L_0x003c
            java.lang.String r0 = r6.mo29850a()
            r5.f8980a = r0
        L_0x0102:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4786ii.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29598a(String str, String str2) {
        if (this.f8983a == null) {
            this.f8983a = new HashMap();
        }
        this.f8983a.put(str, str2);
    }

    /* renamed from: a */
    public void m14559a(boolean z) {
        this.f8982a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14560a() {
        return this.f8980a != null;
    }

    /* renamed from: a */
    public boolean m14561a(C4786ii iiVar) {
        if (iiVar == null) {
            return false;
        }
        boolean a = mo29592a();
        boolean a2 = iiVar.mo29592a();
        if ((a || a2) && (!a || !a2 || !this.f8980a.equals(iiVar.f8980a))) {
            return false;
        }
        boolean b = mo29600b();
        boolean b2 = iiVar.mo29600b();
        if ((b || b2) && (!b || !b2 || !this.f8979a.compareTo(iiVar.f8979a))) {
            return false;
        }
        boolean c = mo29603c();
        boolean c2 = iiVar.mo29603c();
        if ((c || c2) && (!c || !c2 || !this.f8985b.equals(iiVar.f8985b))) {
            return false;
        }
        boolean d = mo29607d();
        boolean d2 = iiVar.mo29607d();
        if ((d || d2) && (!d || !d2 || !this.f8987c.equals(iiVar.f8987c))) {
            return false;
        }
        boolean e = mo29608e();
        boolean e2 = iiVar.mo29608e();
        if (((e || e2) && (!e || !e2 || !this.f8988d.equals(iiVar.f8988d))) || this.f8984a != iiVar.f8984a) {
            return false;
        }
        boolean g = mo29611g();
        boolean g2 = iiVar.mo29611g();
        if ((g || g2) && (!g || !g2 || !this.f8989e.equals(iiVar.f8989e))) {
            return false;
        }
        boolean h = mo29612h();
        boolean h2 = iiVar.mo29612h();
        if ((h || h2) && (!h || !h2 || !this.f8983a.equals(iiVar.f8983a))) {
            return false;
        }
        boolean i = mo29614i();
        boolean i2 = iiVar.mo29614i();
        if ((i || i2) && (!i || !i2 || !this.f8990f.equals(iiVar.f8990f))) {
            return false;
        }
        boolean j = mo29615j();
        boolean j2 = iiVar.mo29615j();
        if ((j || j2) && (!j || !j2 || !this.f8991g.equals(iiVar.f8991g))) {
            return false;
        }
        boolean k = mo29616k();
        boolean k2 = iiVar.mo29616k();
        if ((k || k2) && (!k || !k2 || !this.f8992h.equals(iiVar.f8992h))) {
            return false;
        }
        boolean l = mo29617l();
        boolean l2 = iiVar.mo29617l();
        if ((l || l2) && (!l || !l2 || !this.f8993i.equals(iiVar.f8993i))) {
            return false;
        }
        boolean m = mo29618m();
        boolean m2 = iiVar.mo29618m();
        if ((m || m2) && (!m || !m2 || !this.f8981a.equals(iiVar.f8981a))) {
            return false;
        }
        boolean n = mo29619n();
        boolean n2 = iiVar.mo29619n();
        if ((n || n2) && (!n || !n2 || this.f8978a != iiVar.f8978a)) {
            return false;
        }
        boolean o = mo29620o();
        boolean o2 = iiVar.mo29620o();
        if (o || o2) {
            return o && o2 && this.f8986b == iiVar.f8986b;
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m14562a() {
        mo29594a(C4799iv.m14850a(this.f8981a));
        return this.f8981a.array();
    }

    /* renamed from: b */
    public C4786ii mo29599b(String str) {
        this.f8987c = str;
        return this;
    }

    /* renamed from: b */
    public String mo29600b() {
        return this.f8987c;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29592a();
        jfVar.mo29857a(f8963a);
        if (this.f8980a != null && mo29592a()) {
            jfVar.mo29854a(f8962a);
            jfVar.mo29858a(this.f8980a);
            jfVar.mo29862b();
        }
        if (this.f8979a != null && mo29600b()) {
            jfVar.mo29854a(f8964b);
            this.f8979a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8985b != null) {
            jfVar.mo29854a(f8965c);
            jfVar.mo29858a(this.f8985b);
            jfVar.mo29862b();
        }
        if (this.f8987c != null && mo29607d()) {
            jfVar.mo29854a(f8966d);
            jfVar.mo29858a(this.f8987c);
            jfVar.mo29862b();
        }
        if (this.f8988d != null && mo29608e()) {
            jfVar.mo29854a(f8967e);
            jfVar.mo29858a(this.f8988d);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f8968f);
        jfVar.mo29861a(this.f8984a);
        jfVar.mo29862b();
        if (this.f8989e != null && mo29611g()) {
            jfVar.mo29854a(f8969g);
            jfVar.mo29858a(this.f8989e);
            jfVar.mo29862b();
        }
        if (this.f8983a != null && mo29612h()) {
            jfVar.mo29854a(f8970h);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8983a.size()));
            for (Map.Entry next : this.f8983a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (this.f8990f != null && mo29614i()) {
            jfVar.mo29854a(f8971i);
            jfVar.mo29858a(this.f8990f);
            jfVar.mo29862b();
        }
        if (this.f8991g != null && mo29615j()) {
            jfVar.mo29854a(f8972j);
            jfVar.mo29858a(this.f8991g);
            jfVar.mo29862b();
        }
        if (this.f8992h != null && mo29616k()) {
            jfVar.mo29854a(f8973k);
            jfVar.mo29858a(this.f8992h);
            jfVar.mo29862b();
        }
        if (this.f8993i != null && mo29617l()) {
            jfVar.mo29854a(f8974l);
            jfVar.mo29858a(this.f8993i);
            jfVar.mo29862b();
        }
        if (this.f8981a != null && mo29618m()) {
            jfVar.mo29854a(f8975m);
            jfVar.mo29859a(this.f8981a);
            jfVar.mo29862b();
        }
        if (mo29619n()) {
            jfVar.mo29854a(f8976n);
            jfVar.mo29853a(this.f8978a);
            jfVar.mo29862b();
        }
        if (mo29620o()) {
            jfVar.mo29854a(f8977o);
            jfVar.mo29861a(this.f8986b);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29601b(boolean z) {
        this.f8982a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14567b() {
        return this.f8979a != null;
    }

    /* renamed from: c */
    public C4786ii mo29602c(String str) {
        this.f8988d = str;
        return this;
    }

    /* renamed from: c */
    public String mo29603c() {
        return this.f8990f;
    }

    /* renamed from: c */
    public void mo29604c(boolean z) {
        this.f8982a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14571c() {
        return this.f8985b != null;
    }

    /* renamed from: d */
    public C4786ii mo29606d(String str) {
        this.f8990f = str;
        return this;
    }

    /* renamed from: d */
    public boolean mo29607d() {
        return this.f8987c != null;
    }

    /* renamed from: e */
    public boolean mo29608e() {
        return this.f8988d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4786ii)) {
            return compareTo((C4786ii) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29610f() {
        return this.f8982a.get(0);
    }

    /* renamed from: g */
    public boolean mo29611g() {
        return this.f8989e != null;
    }

    /* renamed from: h */
    public boolean mo29612h() {
        return this.f8983a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29614i() {
        return this.f8990f != null;
    }

    /* renamed from: j */
    public boolean mo29615j() {
        return this.f8991g != null;
    }

    /* renamed from: k */
    public boolean mo29616k() {
        return this.f8992h != null;
    }

    /* renamed from: l */
    public boolean mo29617l() {
        return this.f8993i != null;
    }

    /* renamed from: m */
    public boolean mo29618m() {
        return this.f8981a != null;
    }

    /* renamed from: n */
    public boolean mo29619n() {
        return this.f8982a.get(1);
    }

    /* renamed from: o */
    public boolean mo29620o() {
        return this.f8982a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (mo29592a()) {
            sb.append("debug:");
            String str = this.f8980a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29600b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f8979a;
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
        String str2 = this.f8985b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo29607d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f8987c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29608e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f8988d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f8984a);
        if (mo29611g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f8989e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29612h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f8983a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo29614i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f8990f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29615j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f8991g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (mo29616k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f8992h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (mo29617l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f8993i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (mo29618m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f8981a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                C4799iv.m14851a(byteBuffer, sb);
            }
        }
        if (mo29619n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f8978a);
        }
        if (mo29620o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f8986b);
        }
        sb.append(")");
        return sb.toString();
    }
}
