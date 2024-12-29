package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.fi */
public class C4670fi implements C4777ix<C4670fi, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f8691a = new C4791jf("", (byte) 3, 1);

    /* renamed from: a */
    private static final C4799jn f8692a = new C4799jn("StatsEvent");

    /* renamed from: b */
    private static final C4791jf f8693b = new C4791jf("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4791jf f8694c = new C4791jf("", (byte) 8, 3);

    /* renamed from: d */
    private static final C4791jf f8695d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f8696e = new C4791jf("", (byte) 11, 5);

    /* renamed from: f */
    private static final C4791jf f8697f = new C4791jf("", (byte) 8, 6);

    /* renamed from: g */
    private static final C4791jf f8698g = new C4791jf("", (byte) 11, 7);

    /* renamed from: h */
    private static final C4791jf f8699h = new C4791jf("", (byte) 11, 8);

    /* renamed from: i */
    private static final C4791jf f8700i = new C4791jf("", (byte) 8, 9);

    /* renamed from: j */
    private static final C4791jf f8701j = new C4791jf("", (byte) 8, 10);

    /* renamed from: a */
    public byte f8702a;

    /* renamed from: a */
    public int f8703a;

    /* renamed from: a */
    public String f8704a;

    /* renamed from: a */
    private BitSet f8705a = new BitSet(6);

    /* renamed from: b */
    public int f8706b;

    /* renamed from: b */
    public String f8707b;

    /* renamed from: c */
    public int f8708c;

    /* renamed from: c */
    public String f8709c;

    /* renamed from: d */
    public int f8710d;

    /* renamed from: d */
    public String f8711d;

    /* renamed from: e */
    public int f8712e;

    /* renamed from: a */
    public int compareTo(C4670fi fiVar) {
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
        if (!C4670fi.class.equals(fiVar.getClass())) {
            return C4670fi.class.getName().compareTo(fiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25075a()).compareTo(Boolean.valueOf(fiVar.mo25075a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25075a() && (a10 = C4778iy.m15228a(this.f8702a, fiVar.f8702a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(mo25082b()).compareTo(Boolean.valueOf(fiVar.mo25082b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25082b() && (a9 = C4778iy.m15229a(this.f8703a, fiVar.f8703a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(mo25086c()).compareTo(Boolean.valueOf(fiVar.mo25086c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25086c() && (a8 = C4778iy.m15229a(this.f8706b, fiVar.f8706b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(mo25091d()).compareTo(Boolean.valueOf(fiVar.mo25091d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25091d() && (a7 = C4778iy.m15232a(this.f8704a, fiVar.f8704a)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(mo25093e()).compareTo(Boolean.valueOf(fiVar.mo25093e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25093e() && (a6 = C4778iy.m15232a(this.f8707b, fiVar.f8707b)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(mo25096f()).compareTo(Boolean.valueOf(fiVar.mo25096f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25096f() && (a5 = C4778iy.m15229a(this.f8708c, fiVar.f8708c)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(mo25097g()).compareTo(Boolean.valueOf(fiVar.mo25097g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25097g() && (a4 = C4778iy.m15232a(this.f8709c, fiVar.f8709c)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(mo25098h()).compareTo(Boolean.valueOf(fiVar.mo25098h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25098h() && (a3 = C4778iy.m15232a(this.f8711d, fiVar.f8711d)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(mo25100i()).compareTo(Boolean.valueOf(fiVar.mo25100i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (mo25100i() && (a2 = C4778iy.m15229a(this.f8710d, fiVar.f8710d)) != 0) {
            return a2;
        }
        int compareTo10 = Boolean.valueOf(mo25101j()).compareTo(Boolean.valueOf(fiVar.mo25101j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!mo25101j() || (a = C4778iy.m15229a(this.f8712e, fiVar.f8712e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4670fi mo25072a(byte b) {
        this.f8702a = b;
        mo25077a(true);
        return this;
    }

    /* renamed from: a */
    public C4670fi mo25073a(int i) {
        this.f8703a = i;
        mo25081b(true);
        return this;
    }

    /* renamed from: a */
    public C4670fi mo25074a(String str) {
        this.f8704a = str;
        return this;
    }

    /* renamed from: a */
    public void mo25075a() {
        if (this.f8704a == null) {
            throw new C4795jj("Required field 'connpt' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0075
            r6.mo25834f()
            boolean r6 = r5.mo25075a()
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.mo25082b()
            if (r6 == 0) goto L_0x003f
            boolean r6 = r5.mo25086c()
            if (r6 == 0) goto L_0x0024
            r5.mo25075a()
            return
        L_0x0024:
            com.xiaomi.push.jj r6 = new com.xiaomi.push.jj
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
            com.xiaomi.push.jj r6 = new com.xiaomi.push.jj
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
            com.xiaomi.push.jj r6 = new com.xiaomi.push.jj
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
            short r0 = r0.f9822a
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
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x00f0
        L_0x0084:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo25816a()
            r5.f8712e = r0
            r5.mo25095f(r4)
            goto L_0x00f0
        L_0x0090:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo25816a()
            r5.f8710d = r0
            r5.mo25092e(r4)
            goto L_0x00f0
        L_0x009c:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo25816a()
            r5.f8711d = r0
            goto L_0x00f0
        L_0x00a5:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo25816a()
            r5.f8709c = r0
            goto L_0x00f0
        L_0x00ae:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo25816a()
            r5.f8708c = r0
            r5.mo25090d((boolean) r4)
            goto L_0x00f0
        L_0x00ba:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo25816a()
            r5.f8707b = r0
            goto L_0x00f0
        L_0x00c3:
            if (r1 != r2) goto L_0x007f
            java.lang.String r0 = r6.mo25816a()
            r5.f8704a = r0
            goto L_0x00f0
        L_0x00cc:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo25816a()
            r5.f8706b = r0
            r5.mo25085c((boolean) r4)
            goto L_0x00f0
        L_0x00d8:
            if (r1 != r3) goto L_0x007f
            int r0 = r6.mo25816a()
            r5.f8703a = r0
            r5.mo25081b((boolean) r4)
            goto L_0x00f0
        L_0x00e4:
            r0 = 3
            if (r1 != r0) goto L_0x007f
            byte r0 = r6.mo25816a()
            r5.f8702a = r0
            r5.mo25077a((boolean) r4)
        L_0x00f0:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4670fi.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25077a(boolean z) {
        this.f8705a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14190a() {
        return this.f8705a.get(0);
    }

    /* renamed from: a */
    public boolean m14191a(C4670fi fiVar) {
        if (fiVar == null || this.f8702a != fiVar.f8702a || this.f8703a != fiVar.f8703a || this.f8706b != fiVar.f8706b) {
            return false;
        }
        boolean d = mo25091d();
        boolean d2 = fiVar.mo25091d();
        if ((d || d2) && (!d || !d2 || !this.f8704a.equals(fiVar.f8704a))) {
            return false;
        }
        boolean e = mo25093e();
        boolean e2 = fiVar.mo25093e();
        if ((e || e2) && (!e || !e2 || !this.f8707b.equals(fiVar.f8707b))) {
            return false;
        }
        boolean f = mo25096f();
        boolean f2 = fiVar.mo25096f();
        if ((f || f2) && (!f || !f2 || this.f8708c != fiVar.f8708c)) {
            return false;
        }
        boolean g = mo25097g();
        boolean g2 = fiVar.mo25097g();
        if ((g || g2) && (!g || !g2 || !this.f8709c.equals(fiVar.f8709c))) {
            return false;
        }
        boolean h = mo25098h();
        boolean h2 = fiVar.mo25098h();
        if ((h || h2) && (!h || !h2 || !this.f8711d.equals(fiVar.f8711d))) {
            return false;
        }
        boolean i = mo25100i();
        boolean i2 = fiVar.mo25100i();
        if ((i || i2) && (!i || !i2 || this.f8710d != fiVar.f8710d)) {
            return false;
        }
        boolean j = mo25101j();
        boolean j2 = fiVar.mo25101j();
        if (j || j2) {
            return j && j2 && this.f8712e == fiVar.f8712e;
        }
        return true;
    }

    /* renamed from: b */
    public C4670fi mo25078b(int i) {
        this.f8706b = i;
        mo25085c(true);
        return this;
    }

    /* renamed from: b */
    public C4670fi mo25079b(String str) {
        this.f8707b = str;
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25075a();
        jiVar.mo25823a(f8692a);
        jiVar.mo25820a(f8691a);
        jiVar.mo25818a(this.f8702a);
        jiVar.mo25828b();
        jiVar.mo25820a(f8693b);
        jiVar.mo25817a(this.f8703a);
        jiVar.mo25828b();
        jiVar.mo25820a(f8694c);
        jiVar.mo25817a(this.f8706b);
        jiVar.mo25828b();
        if (this.f8704a != null) {
            jiVar.mo25820a(f8695d);
            jiVar.mo25824a(this.f8704a);
            jiVar.mo25828b();
        }
        if (this.f8707b != null && mo25093e()) {
            jiVar.mo25820a(f8696e);
            jiVar.mo25824a(this.f8707b);
            jiVar.mo25828b();
        }
        if (mo25096f()) {
            jiVar.mo25820a(f8697f);
            jiVar.mo25817a(this.f8708c);
            jiVar.mo25828b();
        }
        if (this.f8709c != null && mo25097g()) {
            jiVar.mo25820a(f8698g);
            jiVar.mo25824a(this.f8709c);
            jiVar.mo25828b();
        }
        if (this.f8711d != null && mo25098h()) {
            jiVar.mo25820a(f8699h);
            jiVar.mo25824a(this.f8711d);
            jiVar.mo25828b();
        }
        if (mo25100i()) {
            jiVar.mo25820a(f8700i);
            jiVar.mo25817a(this.f8710d);
            jiVar.mo25828b();
        }
        if (mo25101j()) {
            jiVar.mo25820a(f8701j);
            jiVar.mo25817a(this.f8712e);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25081b(boolean z) {
        this.f8705a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25082b() {
        return this.f8705a.get(1);
    }

    /* renamed from: c */
    public C4670fi mo25083c(int i) {
        this.f8708c = i;
        mo25090d(true);
        return this;
    }

    /* renamed from: c */
    public C4670fi mo25084c(String str) {
        this.f8709c = str;
        return this;
    }

    /* renamed from: c */
    public void mo25085c(boolean z) {
        this.f8705a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo25086c() {
        return this.f8705a.get(2);
    }

    /* renamed from: d */
    public C4670fi mo25088d(int i) {
        this.f8710d = i;
        mo25092e(true);
        return this;
    }

    /* renamed from: d */
    public C4670fi mo25089d(String str) {
        this.f8711d = str;
        return this;
    }

    /* renamed from: d */
    public void mo25090d(boolean z) {
        this.f8705a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo25091d() {
        return this.f8704a != null;
    }

    /* renamed from: e */
    public void mo25092e(boolean z) {
        this.f8705a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo25093e() {
        return this.f8707b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4670fi)) {
            return compareTo((C4670fi) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo25095f(boolean z) {
        this.f8705a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo25096f() {
        return this.f8705a.get(3);
    }

    /* renamed from: g */
    public boolean mo25097g() {
        return this.f8709c != null;
    }

    /* renamed from: h */
    public boolean mo25098h() {
        return this.f8711d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25100i() {
        return this.f8705a.get(4);
    }

    /* renamed from: j */
    public boolean mo25101j() {
        return this.f8705a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append(this.f8702a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f8703a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f8706b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f8704a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo25093e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f8707b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo25096f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f8708c);
        }
        if (mo25097g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f8709c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25098h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f8711d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25100i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f8710d);
        }
        if (mo25101j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f8712e);
        }
        sb.append(")");
        return sb.toString();
    }
}
