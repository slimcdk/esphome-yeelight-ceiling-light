package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.if */
public class C4783if implements C4798iu<C4783if, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8938a = new C4809jc("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4817jk f8939a = new C4817jk("XmPushActionContainer");

    /* renamed from: b */
    private static final C4809jc f8940b = new C4809jc("", (byte) 2, 2);

    /* renamed from: c */
    private static final C4809jc f8941c = new C4809jc("", (byte) 2, 3);

    /* renamed from: d */
    private static final C4809jc f8942d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8943e = new C4809jc("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4809jc f8944f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f8945g = new C4809jc("", (byte) 12, 7);

    /* renamed from: h */
    private static final C4809jc f8946h = new C4809jc("", (byte) 12, 8);

    /* renamed from: a */
    public C4760hj f8947a;

    /* renamed from: a */
    public C4773hw f8948a;

    /* renamed from: a */
    public C4775hy f8949a;

    /* renamed from: a */
    public String f8950a;

    /* renamed from: a */
    public ByteBuffer f8951a;

    /* renamed from: a */
    private BitSet f8952a = new BitSet(2);

    /* renamed from: a */
    public boolean f8953a = true;

    /* renamed from: b */
    public String f8954b;

    /* renamed from: b */
    public boolean f8955b = true;

    /* renamed from: a */
    public int compareTo(C4783if ifVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(ifVar.getClass())) {
            return getClass().getName().compareTo(ifVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29558a()).compareTo(Boolean.valueOf(ifVar.mo29558a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29558a() && (a8 = C4799iv.m14840a((Comparable) this.f8947a, (Comparable) ifVar.f8947a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo29568c()).compareTo(Boolean.valueOf(ifVar.mo29568c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29568c() && (a7 = C4799iv.m14847a(this.f8953a, ifVar.f8953a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo29570d()).compareTo(Boolean.valueOf(ifVar.mo29570d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29570d() && (a6 = C4799iv.m14847a(this.f8955b, ifVar.f8955b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo29571e()).compareTo(Boolean.valueOf(ifVar.mo29571e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29571e() && (a5 = C4799iv.m14840a((Comparable) this.f8951a, (Comparable) ifVar.f8951a)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo29573f()).compareTo(Boolean.valueOf(ifVar.mo29573f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29573f() && (a4 = C4799iv.m14841a(this.f8950a, ifVar.f8950a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo29574g()).compareTo(Boolean.valueOf(ifVar.mo29574g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29574g() && (a3 = C4799iv.m14841a(this.f8954b, ifVar.f8954b)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo29575h()).compareTo(Boolean.valueOf(ifVar.mo29575h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29575h() && (a2 = C4799iv.m14840a((Comparable) this.f8949a, (Comparable) ifVar.f8949a)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo29577i()).compareTo(Boolean.valueOf(ifVar.mo29577i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo29577i() || (a = C4799iv.m14840a((Comparable) this.f8948a, (Comparable) ifVar.f8948a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4760hj mo29558a() {
        return this.f8947a;
    }

    /* renamed from: a */
    public C4773hw m14506a() {
        return this.f8948a;
    }

    /* renamed from: a */
    public C4783if mo29559a(C4760hj hjVar) {
        this.f8947a = hjVar;
        return this;
    }

    /* renamed from: a */
    public C4783if mo29560a(C4773hw hwVar) {
        this.f8948a = hwVar;
        return this;
    }

    /* renamed from: a */
    public C4783if mo29561a(C4775hy hyVar) {
        this.f8949a = hyVar;
        return this;
    }

    /* renamed from: a */
    public C4783if mo29562a(String str) {
        this.f8950a = str;
        return this;
    }

    /* renamed from: a */
    public C4783if mo29563a(ByteBuffer byteBuffer) {
        this.f8951a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4783if mo29564a(boolean z) {
        this.f8953a = z;
        mo29564a(true);
        return this;
    }

    /* renamed from: a */
    public String m14513a() {
        return this.f8950a;
    }

    /* renamed from: a */
    public void m14514a() {
        if (this.f8947a == null) {
            throw new C4813jg("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f8951a == null) {
            throw new C4813jg("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f8949a == null) {
            throw new C4813jg("Required field 'target' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r7) {
        /*
            r6 = this;
            r7.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r7.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0054
            r7.mo29868f()
            boolean r7 = r6.mo29568c()
            if (r7 == 0) goto L_0x0039
            boolean r7 = r6.mo29570d()
            if (r7 == 0) goto L_0x001e
            r6.mo29558a()
            return
        L_0x001e:
            com.xiaomi.push.jg r7 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'isRequest' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0039:
            com.xiaomi.push.jg r7 = new com.xiaomi.push.jg
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'encryptAction' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0054:
            short r0 = r0.f9291a
            r2 = 1
            r3 = 12
            r4 = 2
            r5 = 11
            switch(r0) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0098;
                case 4: goto L_0x008f;
                case 5: goto L_0x0086;
                case 6: goto L_0x007d;
                case 7: goto L_0x0070;
                case 8: goto L_0x0063;
                default: goto L_0x005f;
            }
        L_0x005f:
            com.xiaomi.push.C4815ji.m14965a(r7, r1)
            goto L_0x00be
        L_0x0063:
            if (r1 != r3) goto L_0x005f
            com.xiaomi.push.hw r0 = new com.xiaomi.push.hw
            r0.<init>()
            r6.f8948a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r7)
            goto L_0x00be
        L_0x0070:
            if (r1 != r3) goto L_0x005f
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r6.f8949a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r7)
            goto L_0x00be
        L_0x007d:
            if (r1 != r5) goto L_0x005f
            java.lang.String r0 = r7.mo29850a()
            r6.f8954b = r0
            goto L_0x00be
        L_0x0086:
            if (r1 != r5) goto L_0x005f
            java.lang.String r0 = r7.mo29850a()
            r6.f8950a = r0
            goto L_0x00be
        L_0x008f:
            if (r1 != r5) goto L_0x005f
            java.nio.ByteBuffer r0 = r7.mo29850a()
            r6.f8951a = r0
            goto L_0x00be
        L_0x0098:
            if (r1 != r4) goto L_0x005f
            boolean r0 = r7.mo29850a()
            r6.f8955b = r0
            r6.mo29566b((boolean) r2)
            goto L_0x00be
        L_0x00a4:
            if (r1 != r4) goto L_0x005f
            boolean r0 = r7.mo29850a()
            r6.f8953a = r0
            r6.mo29564a((boolean) r2)
            goto L_0x00be
        L_0x00b0:
            r0 = 8
            if (r1 != r0) goto L_0x005f
            int r0 = r7.mo29850a()
            com.xiaomi.push.hj r0 = com.xiaomi.push.C4760hj.m14181a(r0)
            r6.f8947a = r0
        L_0x00be:
            r7.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4783if.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void m14516a(boolean z) {
        this.f8952a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14517a() {
        return this.f8947a != null;
    }

    /* renamed from: a */
    public boolean m14518a(C4783if ifVar) {
        if (ifVar == null) {
            return false;
        }
        boolean a = mo29558a();
        boolean a2 = ifVar.mo29558a();
        if (((a || a2) && (!a || !a2 || !this.f8947a.equals(ifVar.f8947a))) || this.f8953a != ifVar.f8953a || this.f8955b != ifVar.f8955b) {
            return false;
        }
        boolean e = mo29571e();
        boolean e2 = ifVar.mo29571e();
        if ((e || e2) && (!e || !e2 || !this.f8951a.equals(ifVar.f8951a))) {
            return false;
        }
        boolean f = mo29573f();
        boolean f2 = ifVar.mo29573f();
        if ((f || f2) && (!f || !f2 || !this.f8950a.equals(ifVar.f8950a))) {
            return false;
        }
        boolean g = mo29574g();
        boolean g2 = ifVar.mo29574g();
        if ((g || g2) && (!g || !g2 || !this.f8954b.equals(ifVar.f8954b))) {
            return false;
        }
        boolean h = mo29575h();
        boolean h2 = ifVar.mo29575h();
        if ((h || h2) && (!h || !h2 || !this.f8949a.compareTo(ifVar.f8949a))) {
            return false;
        }
        boolean i = mo29577i();
        boolean i2 = ifVar.mo29577i();
        if (i || i2) {
            return i && i2 && this.f8948a.compareTo(ifVar.f8948a);
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m14519a() {
        mo29563a(C4799iv.m14850a(this.f8951a));
        return this.f8951a.array();
    }

    /* renamed from: b */
    public C4783if mo29565b(String str) {
        this.f8954b = str;
        return this;
    }

    /* renamed from: b */
    public C4783if mo29566b(boolean z) {
        this.f8955b = z;
        mo29566b(true);
        return this;
    }

    /* renamed from: b */
    public String mo29567b() {
        return this.f8954b;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29558a();
        jfVar.mo29857a(f8939a);
        if (this.f8947a != null) {
            jfVar.mo29854a(f8938a);
            jfVar.mo29851a(this.f8947a.mo29282a());
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f8940b);
        jfVar.mo29861a(this.f8953a);
        jfVar.mo29862b();
        jfVar.mo29854a(f8941c);
        jfVar.mo29861a(this.f8955b);
        jfVar.mo29862b();
        if (this.f8951a != null) {
            jfVar.mo29854a(f8942d);
            jfVar.mo29859a(this.f8951a);
            jfVar.mo29862b();
        }
        if (this.f8950a != null && mo29573f()) {
            jfVar.mo29854a(f8943e);
            jfVar.mo29858a(this.f8950a);
            jfVar.mo29862b();
        }
        if (this.f8954b != null && mo29574g()) {
            jfVar.mo29854a(f8944f);
            jfVar.mo29858a(this.f8954b);
            jfVar.mo29862b();
        }
        if (this.f8949a != null) {
            jfVar.mo29854a(f8945g);
            this.f8949a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f8948a != null && mo29577i()) {
            jfVar.mo29854a(f8946h);
            this.f8948a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void m14524b(boolean z) {
        this.f8952a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14525b() {
        return this.f8953a;
    }

    /* renamed from: c */
    public boolean mo29568c() {
        return this.f8952a.get(0);
    }

    /* renamed from: d */
    public boolean mo29570d() {
        return this.f8952a.get(1);
    }

    /* renamed from: e */
    public boolean mo29571e() {
        return this.f8951a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4783if)) {
            return compareTo((C4783if) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29573f() {
        return this.f8950a != null;
    }

    /* renamed from: g */
    public boolean mo29574g() {
        return this.f8954b != null;
    }

    /* renamed from: h */
    public boolean mo29575h() {
        return this.f8949a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29577i() {
        return this.f8948a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        C4760hj hjVar = this.f8947a;
        if (hjVar == null) {
            sb.append("null");
        } else {
            sb.append(hjVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f8953a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f8955b);
        if (mo29573f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f8950a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (mo29574g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f8954b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        C4775hy hyVar = this.f8949a;
        if (hyVar == null) {
            sb.append("null");
        } else {
            sb.append(hyVar);
        }
        if (mo29577i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C4773hw hwVar = this.f8948a;
            if (hwVar == null) {
                sb.append("null");
            } else {
                sb.append(hwVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
