package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ii */
public class C4762ii implements C4777ix<C4762ii, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9479a = new C4791jf("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4799jn f9480a = new C4799jn("XmPushActionContainer");

    /* renamed from: b */
    private static final C4791jf f9481b = new C4791jf("", (byte) 2, 2);

    /* renamed from: c */
    private static final C4791jf f9482c = new C4791jf("", (byte) 2, 3);

    /* renamed from: d */
    private static final C4791jf f9483d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9484e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f9485f = new C4791jf("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4791jf f9486g = new C4791jf("", (byte) 12, 7);

    /* renamed from: h */
    private static final C4791jf f9487h = new C4791jf("", (byte) 12, 8);

    /* renamed from: a */
    public C4739hm f9488a;

    /* renamed from: a */
    public C4752hz f9489a;

    /* renamed from: a */
    public C4755ib f9490a;

    /* renamed from: a */
    public String f9491a;

    /* renamed from: a */
    public ByteBuffer f9492a;

    /* renamed from: a */
    private BitSet f9493a = new BitSet(2);

    /* renamed from: a */
    public boolean f9494a = true;

    /* renamed from: b */
    public String f9495b;

    /* renamed from: b */
    public boolean f9496b = true;

    /* renamed from: a */
    public int compareTo(C4762ii iiVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!C4762ii.class.equals(iiVar.getClass())) {
            return C4762ii.class.getName().compareTo(iiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25521a()).compareTo(Boolean.valueOf(iiVar.mo25521a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25521a() && (a8 = C4778iy.m15231a((Comparable) this.f9488a, (Comparable) iiVar.f9488a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(mo25531c()).compareTo(Boolean.valueOf(iiVar.mo25531c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25531c() && (a7 = C4778iy.m15238a(this.f9494a, iiVar.f9494a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(mo25533d()).compareTo(Boolean.valueOf(iiVar.mo25533d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25533d() && (a6 = C4778iy.m15238a(this.f9496b, iiVar.f9496b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(mo25534e()).compareTo(Boolean.valueOf(iiVar.mo25534e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25534e() && (a5 = C4778iy.m15231a((Comparable) this.f9492a, (Comparable) iiVar.f9492a)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(mo25536f()).compareTo(Boolean.valueOf(iiVar.mo25536f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25536f() && (a4 = C4778iy.m15232a(this.f9491a, iiVar.f9491a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(mo25537g()).compareTo(Boolean.valueOf(iiVar.mo25537g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25537g() && (a3 = C4778iy.m15232a(this.f9495b, iiVar.f9495b)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(mo25538h()).compareTo(Boolean.valueOf(iiVar.mo25538h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25538h() && (a2 = C4778iy.m15231a((Comparable) this.f9490a, (Comparable) iiVar.f9490a)) != 0) {
            return a2;
        }
        int compareTo8 = Boolean.valueOf(mo25540i()).compareTo(Boolean.valueOf(iiVar.mo25540i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!mo25540i() || (a = C4778iy.m15231a((Comparable) this.f9489a, (Comparable) iiVar.f9489a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4739hm mo25521a() {
        return this.f9488a;
    }

    /* renamed from: a */
    public C4752hz m14906a() {
        return this.f9489a;
    }

    /* renamed from: a */
    public C4762ii mo25522a(C4739hm hmVar) {
        this.f9488a = hmVar;
        return this;
    }

    /* renamed from: a */
    public C4762ii mo25523a(C4752hz hzVar) {
        this.f9489a = hzVar;
        return this;
    }

    /* renamed from: a */
    public C4762ii mo25524a(C4755ib ibVar) {
        this.f9490a = ibVar;
        return this;
    }

    /* renamed from: a */
    public C4762ii mo25525a(String str) {
        this.f9491a = str;
        return this;
    }

    /* renamed from: a */
    public C4762ii mo25526a(ByteBuffer byteBuffer) {
        this.f9492a = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C4762ii mo25527a(boolean z) {
        this.f9494a = z;
        mo25527a(true);
        return this;
    }

    /* renamed from: a */
    public String m14913a() {
        return this.f9491a;
    }

    /* renamed from: a */
    public void m14914a() {
        if (this.f9488a == null) {
            throw new C4795jj("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f9492a == null) {
            throw new C4795jj("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f9490a == null) {
            throw new C4795jj("Required field 'target' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r7) {
        /*
            r6 = this;
            r7.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r7.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0054
            r7.mo25834f()
            boolean r7 = r6.mo25531c()
            if (r7 == 0) goto L_0x0039
            boolean r7 = r6.mo25533d()
            if (r7 == 0) goto L_0x001e
            r6.mo25521a()
            return
        L_0x001e:
            com.xiaomi.push.jj r7 = new com.xiaomi.push.jj
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
            com.xiaomi.push.jj r7 = new com.xiaomi.push.jj
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
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r7, r1)
            goto L_0x00be
        L_0x0063:
            if (r1 != r3) goto L_0x005f
            com.xiaomi.push.hz r0 = new com.xiaomi.push.hz
            r0.<init>()
            r6.f9489a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r7)
            goto L_0x00be
        L_0x0070:
            if (r1 != r3) goto L_0x005f
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r6.f9490a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r7)
            goto L_0x00be
        L_0x007d:
            if (r1 != r5) goto L_0x005f
            java.lang.String r0 = r7.mo25816a()
            r6.f9495b = r0
            goto L_0x00be
        L_0x0086:
            if (r1 != r5) goto L_0x005f
            java.lang.String r0 = r7.mo25816a()
            r6.f9491a = r0
            goto L_0x00be
        L_0x008f:
            if (r1 != r5) goto L_0x005f
            java.nio.ByteBuffer r0 = r7.mo25816a()
            r6.f9492a = r0
            goto L_0x00be
        L_0x0098:
            if (r1 != r4) goto L_0x005f
            boolean r0 = r7.mo25816a()
            r6.f9496b = r0
            r6.mo25529b((boolean) r2)
            goto L_0x00be
        L_0x00a4:
            if (r1 != r4) goto L_0x005f
            boolean r0 = r7.mo25816a()
            r6.f9494a = r0
            r6.mo25527a((boolean) r2)
            goto L_0x00be
        L_0x00b0:
            r0 = 8
            if (r1 != r0) goto L_0x005f
            int r0 = r7.mo25816a()
            com.xiaomi.push.hm r0 = com.xiaomi.push.C4739hm.m14557a(r0)
            r6.f9488a = r0
        L_0x00be:
            r7.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4762ii.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void m14916a(boolean z) {
        this.f9493a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14917a() {
        return this.f9488a != null;
    }

    /* renamed from: a */
    public boolean m14918a(C4762ii iiVar) {
        if (iiVar == null) {
            return false;
        }
        boolean a = mo25521a();
        boolean a2 = iiVar.mo25521a();
        if (((a || a2) && (!a || !a2 || !this.f9488a.equals(iiVar.f9488a))) || this.f9494a != iiVar.f9494a || this.f9496b != iiVar.f9496b) {
            return false;
        }
        boolean e = mo25534e();
        boolean e2 = iiVar.mo25534e();
        if ((e || e2) && (!e || !e2 || !this.f9492a.equals(iiVar.f9492a))) {
            return false;
        }
        boolean f = mo25536f();
        boolean f2 = iiVar.mo25536f();
        if ((f || f2) && (!f || !f2 || !this.f9491a.equals(iiVar.f9491a))) {
            return false;
        }
        boolean g = mo25537g();
        boolean g2 = iiVar.mo25537g();
        if ((g || g2) && (!g || !g2 || !this.f9495b.equals(iiVar.f9495b))) {
            return false;
        }
        boolean h = mo25538h();
        boolean h2 = iiVar.mo25538h();
        if ((h || h2) && (!h || !h2 || !this.f9490a.compareTo(iiVar.f9490a))) {
            return false;
        }
        boolean i = mo25540i();
        boolean i2 = iiVar.mo25540i();
        if (i || i2) {
            return i && i2 && this.f9489a.compareTo(iiVar.f9489a);
        }
        return true;
    }

    /* renamed from: a */
    public byte[] m14919a() {
        mo25526a(C4778iy.m15241a(this.f9492a));
        return this.f9492a.array();
    }

    /* renamed from: b */
    public C4762ii mo25528b(String str) {
        this.f9495b = str;
        return this;
    }

    /* renamed from: b */
    public C4762ii mo25529b(boolean z) {
        this.f9496b = z;
        mo25529b(true);
        return this;
    }

    /* renamed from: b */
    public String mo25530b() {
        return this.f9495b;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25521a();
        jiVar.mo25823a(f9480a);
        if (this.f9488a != null) {
            jiVar.mo25820a(f9479a);
            jiVar.mo25817a(this.f9488a.mo25253a());
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9481b);
        jiVar.mo25827a(this.f9494a);
        jiVar.mo25828b();
        jiVar.mo25820a(f9482c);
        jiVar.mo25827a(this.f9496b);
        jiVar.mo25828b();
        if (this.f9492a != null) {
            jiVar.mo25820a(f9483d);
            jiVar.mo25825a(this.f9492a);
            jiVar.mo25828b();
        }
        if (this.f9491a != null && mo25536f()) {
            jiVar.mo25820a(f9484e);
            jiVar.mo25824a(this.f9491a);
            jiVar.mo25828b();
        }
        if (this.f9495b != null && mo25537g()) {
            jiVar.mo25820a(f9485f);
            jiVar.mo25824a(this.f9495b);
            jiVar.mo25828b();
        }
        if (this.f9490a != null) {
            jiVar.mo25820a(f9486g);
            this.f9490a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9489a != null && mo25540i()) {
            jiVar.mo25820a(f9487h);
            this.f9489a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void m14924b(boolean z) {
        this.f9493a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14925b() {
        return this.f9494a;
    }

    /* renamed from: c */
    public boolean mo25531c() {
        return this.f9493a.get(0);
    }

    /* renamed from: d */
    public boolean mo25533d() {
        return this.f9493a.get(1);
    }

    /* renamed from: e */
    public boolean mo25534e() {
        return this.f9492a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4762ii)) {
            return compareTo((C4762ii) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25536f() {
        return this.f9491a != null;
    }

    /* renamed from: g */
    public boolean mo25537g() {
        return this.f9495b != null;
    }

    /* renamed from: h */
    public boolean mo25538h() {
        return this.f9490a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25540i() {
        return this.f9489a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        C4739hm hmVar = this.f9488a;
        if (hmVar == null) {
            sb.append("null");
        } else {
            sb.append(hmVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f9494a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f9496b);
        sb.append(", ");
        sb.append("pushAction:");
        ByteBuffer byteBuffer = this.f9492a;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C4778iy.m15242a(byteBuffer, sb);
        }
        if (mo25536f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f9491a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (mo25537g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f9495b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        C4755ib ibVar = this.f9490a;
        if (ibVar == null) {
            sb.append("null");
        } else {
            sb.append(ibVar);
        }
        if (mo25540i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C4752hz hzVar = this.f9489a;
            if (hzVar == null) {
                sb.append("null");
            } else {
                sb.append(hzVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
