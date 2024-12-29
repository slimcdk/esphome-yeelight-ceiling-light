package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.fa */
public class C4681fa implements C4798iu<C4681fa, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8104a = new C4809jc("", (byte) 3, 1);

    /* renamed from: a */
    private static final C4817jk f8105a = new C4817jk("StatsEvent");

    /* renamed from: b */
    private static final C4809jc f8106b = new C4809jc("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4809jc f8107c = new C4809jc("", (byte) 8, 3);

    /* renamed from: d */
    private static final C4809jc f8108d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8109e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f8110f = new C4809jc("", (byte) 8, 6);

    /* renamed from: g */
    private static final C4809jc f8111g = new C4809jc("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4809jc f8112h = new C4809jc("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4809jc f8113i = new C4809jc("", (byte) 8, 9);

    /* renamed from: j */
    private static final C4809jc f8114j = new C4809jc("", (byte) 8, 10);

    /* renamed from: a */
    public byte f8115a;

    /* renamed from: a */
    public int f8116a;

    /* renamed from: a */
    public String f8117a;

    /* renamed from: a */
    private BitSet f8118a = new BitSet(6);

    /* renamed from: b */
    public int f8119b;

    /* renamed from: b */
    public String f8120b;

    /* renamed from: c */
    public int f8121c;

    /* renamed from: c */
    public String f8122c;

    /* renamed from: d */
    public int f8123d;

    /* renamed from: d */
    public String f8124d;

    /* renamed from: e */
    public int f8125e;

    /* renamed from: a */
    public int compareTo(C4681fa faVar) {
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
        if (!getClass().equals(faVar.getClass())) {
            return getClass().getName().compareTo(faVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29094a()).compareTo(Boolean.valueOf(faVar.mo29094a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29094a() && (a10 = C4799iv.m14837a(this.f8115a, faVar.f8115a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo29101b()).compareTo(Boolean.valueOf(faVar.mo29101b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29101b() && (a9 = C4799iv.m14838a(this.f8116a, faVar.f8116a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo29105c()).compareTo(Boolean.valueOf(faVar.mo29105c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29105c() && (a8 = C4799iv.m14838a(this.f8119b, faVar.f8119b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo29110d()).compareTo(Boolean.valueOf(faVar.mo29110d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29110d() && (a7 = C4799iv.m14841a(this.f8117a, faVar.f8117a)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo29112e()).compareTo(Boolean.valueOf(faVar.mo29112e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29112e() && (a6 = C4799iv.m14841a(this.f8120b, faVar.f8120b)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo29115f()).compareTo(Boolean.valueOf(faVar.mo29115f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29115f() && (a5 = C4799iv.m14838a(this.f8121c, faVar.f8121c)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo29116g()).compareTo(Boolean.valueOf(faVar.mo29116g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29116g() && (a4 = C4799iv.m14841a(this.f8122c, faVar.f8122c)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo29117h()).compareTo(Boolean.valueOf(faVar.mo29117h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29117h() && (a3 = C4799iv.m14841a(this.f8124d, faVar.f8124d)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo29119i()).compareTo(Boolean.valueOf(faVar.mo29119i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo29119i() && (a2 = C4799iv.m14838a(this.f8123d, faVar.f8123d)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo29120j()).compareTo(Boolean.valueOf(faVar.mo29120j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo29120j() || (a = C4799iv.m14838a(this.f8125e, faVar.f8125e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4681fa mo29091a(byte b) {
        this.f8115a = b;
        mo29096a(true);
        return this;
    }

    /* renamed from: a */
    public C4681fa mo29092a(int i) {
        this.f8116a = i;
        mo29100b(true);
        return this;
    }

    /* renamed from: a */
    public C4681fa mo29093a(String str) {
        this.f8117a = str;
        return this;
    }

    /* renamed from: a */
    public void mo29094a() {
        if (this.f8117a == null) {
            throw new C4813jg("Required field 'connpt' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0075
            r6.mo29868f()
            boolean r6 = r5.mo29094a()
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.mo29101b()
            if (r6 == 0) goto L_0x003f
            boolean r6 = r5.mo29105c()
            if (r6 == 0) goto L_0x0024
            r5.mo29094a()
            return
        L_0x0024:
            com.xiaomi.push.jg r6 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'value' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x003f:
            com.xiaomi.push.jg r6 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'type' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x005a:
            com.xiaomi.push.jg r6 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'chid' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0075:
            short r0 = r0.f9291a
            r2 = 11
            r3 = 8
            r4 = 1
            switch(r0) {
                case 1: goto L_0x00e4;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009c;
                case 9: goto L_0x0090;
                case 10: goto L_0x0084;
                default: goto L_0x007f;
            }
        L_0x007f:
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x00f0
        L_0x0084:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo29850a()
            r5.f8125e = r0
            r5.mo29114f(r4)
            goto L_0x00f0
        L_0x0090:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo29850a()
            r5.f8123d = r0
            r5.mo29111e(r4)
            goto L_0x00f0
        L_0x009c:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo29850a()
            r5.f8124d = r0
            goto L_0x00f0
        L_0x00a5:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo29850a()
            r5.f8122c = r0
            goto L_0x00f0
        L_0x00ae:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo29850a()
            r5.f8121c = r0
            r5.mo29109d((boolean) r4)
            goto L_0x00f0
        L_0x00ba:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo29850a()
            r5.f8120b = r0
            goto L_0x00f0
        L_0x00c3:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo29850a()
            r5.f8117a = r0
            goto L_0x00f0
        L_0x00cc:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo29850a()
            r5.f8119b = r0
            r5.mo29104c((boolean) r4)
            goto L_0x00f0
        L_0x00d8:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo29850a()
            r5.f8116a = r0
            r5.mo29100b((boolean) r4)
            goto L_0x00f0
        L_0x00e4:
            r0 = 3
            if (r1 != r0) goto L_0x007f
            byte r0 = r6.mo29850a()
            r5.f8115a = r0
            r5.mo29096a((boolean) r4)
        L_0x00f0:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4681fa.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29096a(boolean z) {
        this.f8118a.set(0, z);
    }

    /* renamed from: a */
    public boolean m13783a() {
        return this.f8118a.get(0);
    }

    /* renamed from: a */
    public boolean m13784a(C4681fa faVar) {
        if (faVar == null || this.f8115a != faVar.f8115a || this.f8116a != faVar.f8116a || this.f8119b != faVar.f8119b) {
            return false;
        }
        boolean d = mo29110d();
        boolean d2 = faVar.mo29110d();
        if ((d || d2) && (!d || !d2 || !this.f8117a.equals(faVar.f8117a))) {
            return false;
        }
        boolean e = mo29112e();
        boolean e2 = faVar.mo29112e();
        if ((e || e2) && (!e || !e2 || !this.f8120b.equals(faVar.f8120b))) {
            return false;
        }
        boolean f = mo29115f();
        boolean f2 = faVar.mo29115f();
        if ((f || f2) && (!f || !f2 || this.f8121c != faVar.f8121c)) {
            return false;
        }
        boolean g = mo29116g();
        boolean g2 = faVar.mo29116g();
        if ((g || g2) && (!g || !g2 || !this.f8122c.equals(faVar.f8122c))) {
            return false;
        }
        boolean h = mo29117h();
        boolean h2 = faVar.mo29117h();
        if ((h || h2) && (!h || !h2 || !this.f8124d.equals(faVar.f8124d))) {
            return false;
        }
        boolean i = mo29119i();
        boolean i2 = faVar.mo29119i();
        if ((i || i2) && (!i || !i2 || this.f8123d != faVar.f8123d)) {
            return false;
        }
        boolean j = mo29120j();
        boolean j2 = faVar.mo29120j();
        if (j || j2) {
            return j && j2 && this.f8125e == faVar.f8125e;
        }
        return true;
    }

    /* renamed from: b */
    public C4681fa mo29097b(int i) {
        this.f8119b = i;
        mo29104c(true);
        return this;
    }

    /* renamed from: b */
    public C4681fa mo29098b(String str) {
        this.f8120b = str;
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29094a();
        jfVar.mo29857a(f8105a);
        jfVar.mo29854a(f8104a);
        jfVar.mo29852a(this.f8115a);
        jfVar.mo29862b();
        jfVar.mo29854a(f8106b);
        jfVar.mo29851a(this.f8116a);
        jfVar.mo29862b();
        jfVar.mo29854a(f8107c);
        jfVar.mo29851a(this.f8119b);
        jfVar.mo29862b();
        if (this.f8117a != null) {
            jfVar.mo29854a(f8108d);
            jfVar.mo29858a(this.f8117a);
            jfVar.mo29862b();
        }
        if (this.f8120b != null && mo29112e()) {
            jfVar.mo29854a(f8109e);
            jfVar.mo29858a(this.f8120b);
            jfVar.mo29862b();
        }
        if (mo29115f()) {
            jfVar.mo29854a(f8110f);
            jfVar.mo29851a(this.f8121c);
            jfVar.mo29862b();
        }
        if (this.f8122c != null && mo29116g()) {
            jfVar.mo29854a(f8111g);
            jfVar.mo29858a(this.f8122c);
            jfVar.mo29862b();
        }
        if (this.f8124d != null && mo29117h()) {
            jfVar.mo29854a(f8112h);
            jfVar.mo29858a(this.f8124d);
            jfVar.mo29862b();
        }
        if (mo29119i()) {
            jfVar.mo29854a(f8113i);
            jfVar.mo29851a(this.f8123d);
            jfVar.mo29862b();
        }
        if (mo29120j()) {
            jfVar.mo29854a(f8114j);
            jfVar.mo29851a(this.f8125e);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29100b(boolean z) {
        this.f8118a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29101b() {
        return this.f8118a.get(1);
    }

    /* renamed from: c */
    public C4681fa mo29102c(int i) {
        this.f8121c = i;
        mo29109d(true);
        return this;
    }

    /* renamed from: c */
    public C4681fa mo29103c(String str) {
        this.f8122c = str;
        return this;
    }

    /* renamed from: c */
    public void mo29104c(boolean z) {
        this.f8118a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo29105c() {
        return this.f8118a.get(2);
    }

    /* renamed from: d */
    public C4681fa mo29107d(int i) {
        this.f8123d = i;
        mo29111e(true);
        return this;
    }

    /* renamed from: d */
    public C4681fa mo29108d(String str) {
        this.f8124d = str;
        return this;
    }

    /* renamed from: d */
    public void mo29109d(boolean z) {
        this.f8118a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo29110d() {
        return this.f8117a != null;
    }

    /* renamed from: e */
    public void mo29111e(boolean z) {
        this.f8118a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo29112e() {
        return this.f8120b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4681fa)) {
            return compareTo((C4681fa) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo29114f(boolean z) {
        this.f8118a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo29115f() {
        return this.f8118a.get(3);
    }

    /* renamed from: g */
    public boolean mo29116g() {
        return this.f8122c != null;
    }

    /* renamed from: h */
    public boolean mo29117h() {
        return this.f8124d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29119i() {
        return this.f8118a.get(4);
    }

    /* renamed from: j */
    public boolean mo29120j() {
        return this.f8118a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append(this.f8115a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f8116a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f8119b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f8117a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo29112e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f8120b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo29115f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f8121c);
        }
        if (mo29116g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f8122c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29117h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f8124d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29119i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f8123d);
        }
        if (mo29120j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f8125e);
        }
        sb.append(")");
        return sb.toString();
    }
}
