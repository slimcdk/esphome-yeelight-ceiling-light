package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.push.service.C4902bd;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hw */
public class C4773hw implements C4798iu<C4773hw, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8773a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8774a = new C4817jk("PushMetaInfo");

    /* renamed from: b */
    private static final C4809jc f8775b = new C4809jc("", (byte) 10, 2);

    /* renamed from: c */
    private static final C4809jc f8776c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8777d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8778e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f8779f = new C4809jc("", (byte) 8, 6);

    /* renamed from: g */
    private static final C4809jc f8780g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8781h = new C4809jc("", (byte) 8, 8);

    /* renamed from: i */
    private static final C4809jc f8782i = new C4809jc("", (byte) 8, 9);

    /* renamed from: j */
    private static final C4809jc f8783j = new C4809jc("", ParameterInitDefType.IntVec3Init, 10);

    /* renamed from: k */
    private static final C4809jc f8784k = new C4809jc("", ParameterInitDefType.IntVec3Init, 11);

    /* renamed from: l */
    private static final C4809jc f8785l = new C4809jc("", (byte) 2, 12);

    /* renamed from: m */
    private static final C4809jc f8786m = new C4809jc("", ParameterInitDefType.IntVec3Init, 13);

    /* renamed from: a */
    public int f8787a;

    /* renamed from: a */
    public long f8788a;

    /* renamed from: a */
    public String f8789a;

    /* renamed from: a */
    private BitSet f8790a;

    /* renamed from: a */
    public Map<String, String> f8791a;

    /* renamed from: a */
    public boolean f8792a;

    /* renamed from: b */
    public int f8793b;

    /* renamed from: b */
    public String f8794b;

    /* renamed from: b */
    public Map<String, String> f8795b;

    /* renamed from: c */
    public int f8796c;

    /* renamed from: c */
    public String f8797c;

    /* renamed from: c */
    public Map<String, String> f8798c;

    /* renamed from: d */
    public String f8799d;

    /* renamed from: e */
    public String f8800e;

    public C4773hw() {
        this.f8790a = new BitSet(5);
        this.f8792a = false;
    }

    public C4773hw(C4773hw hwVar) {
        BitSet bitSet = new BitSet(5);
        this.f8790a = bitSet;
        bitSet.clear();
        this.f8790a.or(hwVar.f8790a);
        if (hwVar.mo29392a()) {
            this.f8789a = hwVar.f8789a;
        }
        this.f8788a = hwVar.f8788a;
        if (hwVar.mo29404c()) {
            this.f8794b = hwVar.f8794b;
        }
        if (hwVar.mo29410d()) {
            this.f8797c = hwVar.f8797c;
        }
        if (hwVar.mo29413e()) {
            this.f8799d = hwVar.f8799d;
        }
        this.f8787a = hwVar.f8787a;
        if (hwVar.mo29416g()) {
            this.f8800e = hwVar.f8800e;
        }
        this.f8793b = hwVar.f8793b;
        this.f8796c = hwVar.f8796c;
        if (hwVar.mo29420j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : hwVar.f8791a.entrySet()) {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
            this.f8791a = hashMap;
        }
        if (hwVar.mo29421k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next2 : hwVar.f8795b.entrySet()) {
                hashMap2.put((String) next2.getKey(), (String) next2.getValue());
            }
            this.f8795b = hashMap2;
        }
        this.f8792a = hwVar.f8792a;
        if (hwVar.mo29424n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry next3 : hwVar.f8798c.entrySet()) {
                hashMap3.put((String) next3.getKey(), (String) next3.getValue());
            }
            this.f8798c = hashMap3;
        }
    }

    /* renamed from: a */
    public int mo29392a() {
        return this.f8787a;
    }

    /* renamed from: a */
    public int compareTo(C4773hw hwVar) {
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
        if (!getClass().equals(hwVar.getClass())) {
            return getClass().getName().compareTo(hwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29392a()).compareTo(Boolean.valueOf(hwVar.mo29392a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29392a() && (a13 = C4799iv.m14841a(this.f8789a, hwVar.f8789a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(mo29399b()).compareTo(Boolean.valueOf(hwVar.mo29399b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29399b() && (a12 = C4799iv.m14839a(this.f8788a, hwVar.f8788a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(mo29404c()).compareTo(Boolean.valueOf(hwVar.mo29404c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29404c() && (a11 = C4799iv.m14841a(this.f8794b, hwVar.f8794b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(mo29410d()).compareTo(Boolean.valueOf(hwVar.mo29410d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29410d() && (a10 = C4799iv.m14841a(this.f8797c, hwVar.f8797c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(mo29413e()).compareTo(Boolean.valueOf(hwVar.mo29413e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29413e() && (a9 = C4799iv.m14841a(this.f8799d, hwVar.f8799d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(mo29415f()).compareTo(Boolean.valueOf(hwVar.mo29415f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29415f() && (a8 = C4799iv.m14838a(this.f8787a, hwVar.f8787a)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(mo29416g()).compareTo(Boolean.valueOf(hwVar.mo29416g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29416g() && (a7 = C4799iv.m14841a(this.f8800e, hwVar.f8800e)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(mo29417h()).compareTo(Boolean.valueOf(hwVar.mo29417h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29417h() && (a6 = C4799iv.m14838a(this.f8793b, hwVar.f8793b)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(mo29419i()).compareTo(Boolean.valueOf(hwVar.mo29419i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29419i() && (a5 = C4799iv.m14838a(this.f8796c, hwVar.f8796c)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(mo29420j()).compareTo(Boolean.valueOf(hwVar.mo29420j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (mo29420j() && (a4 = C4799iv.m14844a((Map) this.f8791a, (Map) hwVar.f8791a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(mo29421k()).compareTo(Boolean.valueOf(hwVar.mo29421k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (mo29421k() && (a3 = C4799iv.m14844a((Map) this.f8795b, (Map) hwVar.f8795b)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(mo29423m()).compareTo(Boolean.valueOf(hwVar.mo29423m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (mo29423m() && (a2 = C4799iv.m14847a(this.f8792a, hwVar.f8792a)) != 0) {
            return a2;
        }
        int compareTo13 = Boolean.valueOf(mo29424n()).compareTo(Boolean.valueOf(hwVar.mo29424n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!mo29424n() || (a = C4799iv.m14844a((Map) this.f8798c, (Map) hwVar.f8798c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m14317a() {
        return this.f8788a;
    }

    /* renamed from: a */
    public C4773hw m14318a() {
        return new C4773hw(this);
    }

    /* renamed from: a */
    public C4773hw mo29394a(int i) {
        this.f8787a = i;
        mo29403b(true);
        return this;
    }

    /* renamed from: a */
    public C4773hw mo29395a(String str) {
        this.f8789a = str;
        return this;
    }

    /* renamed from: a */
    public C4773hw mo29396a(Map<String, String> map) {
        this.f8791a = map;
        return this;
    }

    /* renamed from: a */
    public String m14322a() {
        return this.f8789a;
    }

    /* renamed from: a */
    public Map<String, String> m14323a() {
        return this.f8791a;
    }

    /* renamed from: a */
    public void m14324a() {
        if (this.f8789a == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        r9.mo29870h();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r9) {
        /*
            r8 = this;
            r9.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r9.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0033
            r9.mo29868f()
            boolean r9 = r8.mo29399b()
            if (r9 == 0) goto L_0x0018
            r8.mo29392a()
            return
        L_0x0018:
            com.xiaomi.push.jg r9 = new com.xiaomi.push.jg
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
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r9, r1)
            goto L_0x0124
        L_0x0046:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.je r0 = r9.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f8798c = r1
        L_0x0057:
            int r1 = r0.f9295a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo29850a()
            java.lang.String r3 = r9.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f8798c
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0057
        L_0x006b:
            if (r1 != r5) goto L_0x0041
            boolean r0 = r9.mo29850a()
            r8.f8792a = r0
            r8.mo29412e(r7)
            goto L_0x0124
        L_0x0078:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.je r0 = r9.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f8795b = r1
        L_0x0089:
            int r1 = r0.f9295a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo29850a()
            java.lang.String r3 = r9.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f8795b
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009d:
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.je r0 = r9.mo29850a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f9295a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f8791a = r1
        L_0x00ae:
            int r1 = r0.f9295a
            if (r2 >= r1) goto L_0x00c2
            java.lang.String r1 = r9.mo29850a()
            java.lang.String r3 = r9.mo29850a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f8791a
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x00ae
        L_0x00c2:
            r9.mo29870h()
            goto L_0x0124
        L_0x00c6:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo29850a()
            r8.f8796c = r0
            r8.mo29411d((boolean) r7)
            goto L_0x0124
        L_0x00d2:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo29850a()
            r8.f8793b = r0
            r8.mo29407c((boolean) r7)
            goto L_0x0124
        L_0x00de:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo29850a()
            r8.f8800e = r0
            goto L_0x0124
        L_0x00e7:
            if (r1 != r4) goto L_0x0041
            int r0 = r9.mo29850a()
            r8.f8787a = r0
            r8.mo29403b((boolean) r7)
            goto L_0x0124
        L_0x00f3:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo29850a()
            r8.f8799d = r0
            goto L_0x0124
        L_0x00fc:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo29850a()
            r8.f8797c = r0
            goto L_0x0124
        L_0x0105:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo29850a()
            r8.f8794b = r0
            goto L_0x0124
        L_0x010e:
            r0 = 10
            if (r1 != r0) goto L_0x0041
            long r0 = r9.mo29850a()
            r8.f8788a = r0
            r8.mo29398a((boolean) r7)
            goto L_0x0124
        L_0x011c:
            if (r1 != r6) goto L_0x0041
            java.lang.String r0 = r9.mo29850a()
            r8.f8789a = r0
        L_0x0124:
            r9.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4773hw.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29397a(String str, String str2) {
        if (this.f8791a == null) {
            this.f8791a = new HashMap();
        }
        this.f8791a.put(str, str2);
    }

    /* renamed from: a */
    public void mo29398a(boolean z) {
        this.f8790a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14328a() {
        return this.f8789a != null;
    }

    /* renamed from: a */
    public boolean m14329a(C4773hw hwVar) {
        if (hwVar == null) {
            return false;
        }
        boolean a = mo29392a();
        boolean a2 = hwVar.mo29392a();
        if (((a || a2) && (!a || !a2 || !this.f8789a.equals(hwVar.f8789a))) || this.f8788a != hwVar.f8788a) {
            return false;
        }
        boolean c = mo29404c();
        boolean c2 = hwVar.mo29404c();
        if ((c || c2) && (!c || !c2 || !this.f8794b.equals(hwVar.f8794b))) {
            return false;
        }
        boolean d = mo29410d();
        boolean d2 = hwVar.mo29410d();
        if ((d || d2) && (!d || !d2 || !this.f8797c.equals(hwVar.f8797c))) {
            return false;
        }
        boolean e = mo29413e();
        boolean e2 = hwVar.mo29413e();
        if ((e || e2) && (!e || !e2 || !this.f8799d.equals(hwVar.f8799d))) {
            return false;
        }
        boolean f = mo29415f();
        boolean f2 = hwVar.mo29415f();
        if ((f || f2) && (!f || !f2 || this.f8787a != hwVar.f8787a)) {
            return false;
        }
        boolean g = mo29416g();
        boolean g2 = hwVar.mo29416g();
        if ((g || g2) && (!g || !g2 || !this.f8800e.equals(hwVar.f8800e))) {
            return false;
        }
        boolean h = mo29417h();
        boolean h2 = hwVar.mo29417h();
        if ((h || h2) && (!h || !h2 || this.f8793b != hwVar.f8793b)) {
            return false;
        }
        boolean i = mo29419i();
        boolean i2 = hwVar.mo29419i();
        if ((i || i2) && (!i || !i2 || this.f8796c != hwVar.f8796c)) {
            return false;
        }
        boolean j = mo29420j();
        boolean j2 = hwVar.mo29420j();
        if ((j || j2) && (!j || !j2 || !this.f8791a.equals(hwVar.f8791a))) {
            return false;
        }
        boolean k = mo29421k();
        boolean k2 = hwVar.mo29421k();
        if ((k || k2) && (!k || !k2 || !this.f8795b.equals(hwVar.f8795b))) {
            return false;
        }
        boolean m = mo29423m();
        boolean m2 = hwVar.mo29423m();
        if ((m || m2) && (!m || !m2 || this.f8792a != hwVar.f8792a)) {
            return false;
        }
        boolean n = mo29424n();
        boolean n2 = hwVar.mo29424n();
        if (n || n2) {
            return n && n2 && this.f8798c.equals(hwVar.f8798c);
        }
        return true;
    }

    /* renamed from: b */
    public int mo29399b() {
        return this.f8793b;
    }

    /* renamed from: b */
    public C4773hw mo29400b(int i) {
        this.f8793b = i;
        mo29407c(true);
        return this;
    }

    /* renamed from: b */
    public C4773hw mo29401b(String str) {
        this.f8794b = str;
        return this;
    }

    /* renamed from: b */
    public String m14333b() {
        return this.f8794b;
    }

    /* renamed from: b */
    public Map<String, String> m14334b() {
        return this.f8795b;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29392a();
        jfVar.mo29857a(f8774a);
        if (this.f8789a != null) {
            jfVar.mo29854a(f8773a);
            jfVar.mo29858a(this.f8789a);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f8775b);
        jfVar.mo29853a(this.f8788a);
        jfVar.mo29862b();
        if (this.f8794b != null && mo29404c()) {
            jfVar.mo29854a(f8776c);
            jfVar.mo29858a(this.f8794b);
            jfVar.mo29862b();
        }
        if (this.f8797c != null && mo29410d()) {
            jfVar.mo29854a(f8777d);
            jfVar.mo29858a(this.f8797c);
            jfVar.mo29862b();
        }
        if (this.f8799d != null && mo29413e()) {
            jfVar.mo29854a(f8778e);
            jfVar.mo29858a(this.f8799d);
            jfVar.mo29862b();
        }
        if (mo29415f()) {
            jfVar.mo29854a(f8779f);
            jfVar.mo29851a(this.f8787a);
            jfVar.mo29862b();
        }
        if (this.f8800e != null && mo29416g()) {
            jfVar.mo29854a(f8780g);
            jfVar.mo29858a(this.f8800e);
            jfVar.mo29862b();
        }
        if (mo29417h()) {
            jfVar.mo29854a(f8781h);
            jfVar.mo29851a(this.f8793b);
            jfVar.mo29862b();
        }
        if (mo29419i()) {
            jfVar.mo29854a(f8782i);
            jfVar.mo29851a(this.f8796c);
            jfVar.mo29862b();
        }
        if (this.f8791a != null && mo29420j()) {
            jfVar.mo29854a(f8783j);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8791a.size()));
            for (Map.Entry next : this.f8791a.entrySet()) {
                jfVar.mo29858a((String) next.getKey());
                jfVar.mo29858a((String) next.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (this.f8795b != null && mo29421k()) {
            jfVar.mo29854a(f8784k);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8795b.size()));
            for (Map.Entry next2 : this.f8795b.entrySet()) {
                jfVar.mo29858a((String) next2.getKey());
                jfVar.mo29858a((String) next2.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        if (mo29423m()) {
            jfVar.mo29854a(f8785l);
            jfVar.mo29861a(this.f8792a);
            jfVar.mo29862b();
        }
        if (this.f8798c != null && mo29424n()) {
            jfVar.mo29854a(f8786m);
            jfVar.mo29856a(new C4811je((byte) 11, (byte) 11, this.f8798c.size()));
            for (Map.Entry next3 : this.f8798c.entrySet()) {
                jfVar.mo29858a((String) next3.getKey());
                jfVar.mo29858a((String) next3.getValue());
            }
            jfVar.mo29866d();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29402b(String str, String str2) {
        if (this.f8795b == null) {
            this.f8795b = new HashMap();
        }
        this.f8795b.put(str, str2);
    }

    /* renamed from: b */
    public void mo29403b(boolean z) {
        this.f8790a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14338b() {
        return this.f8790a.get(0);
    }

    /* renamed from: c */
    public int mo29404c() {
        return this.f8796c;
    }

    /* renamed from: c */
    public C4773hw mo29405c(int i) {
        this.f8796c = i;
        mo29411d(true);
        return this;
    }

    /* renamed from: c */
    public C4773hw mo29406c(String str) {
        this.f8797c = str;
        return this;
    }

    /* renamed from: c */
    public String m14342c() {
        return this.f8797c;
    }

    /* renamed from: c */
    public void mo29407c(boolean z) {
        this.f8790a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14344c() {
        return this.f8794b != null;
    }

    /* renamed from: d */
    public C4773hw mo29409d(String str) {
        this.f8799d = str;
        return this;
    }

    /* renamed from: d */
    public String mo29410d() {
        return this.f8799d;
    }

    /* renamed from: d */
    public void mo29411d(boolean z) {
        this.f8790a.set(3, z);
    }

    /* renamed from: d */
    public boolean m14348d() {
        return this.f8797c != null;
    }

    /* renamed from: e */
    public void mo29412e(boolean z) {
        this.f8790a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo29413e() {
        return this.f8799d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4773hw)) {
            return compareTo((C4773hw) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29415f() {
        return this.f8790a.get(1);
    }

    /* renamed from: g */
    public boolean mo29416g() {
        return this.f8800e != null;
    }

    /* renamed from: h */
    public boolean mo29417h() {
        return this.f8790a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29419i() {
        return this.f8790a.get(3);
    }

    /* renamed from: j */
    public boolean mo29420j() {
        return this.f8791a != null;
    }

    /* renamed from: k */
    public boolean mo29421k() {
        return this.f8795b != null;
    }

    /* renamed from: l */
    public boolean mo29422l() {
        return this.f8792a;
    }

    /* renamed from: m */
    public boolean mo29423m() {
        return this.f8790a.get(4);
    }

    /* renamed from: n */
    public boolean mo29424n() {
        return this.f8798c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f8789a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(C4902bd.m15381a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f8788a);
        if (mo29404c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f8794b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo29410d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f8797c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29413e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f8799d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29415f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f8787a);
        }
        if (mo29416g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f8800e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29417h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f8793b);
        }
        if (mo29419i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f8796c);
        }
        if (mo29420j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f8791a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (mo29421k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f8795b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (mo29423m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f8792a);
        }
        if (mo29424n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f8798c;
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
