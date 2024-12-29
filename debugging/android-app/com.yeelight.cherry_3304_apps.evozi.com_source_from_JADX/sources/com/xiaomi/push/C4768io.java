package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.io */
public class C4768io implements C4777ix<C4768io, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9631a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9632a = new C4799jn("XmPushActionSendFeedbackResult");

    /* renamed from: b */
    private static final C4791jf f9633b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9634c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9635d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9636e = new C4791jf("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4791jf f9637f = new C4791jf("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4791jf f9638g = new C4791jf("", (byte) 11, 8);

    /* renamed from: a */
    public long f9639a;

    /* renamed from: a */
    public C4755ib f9640a;

    /* renamed from: a */
    public String f9641a;

    /* renamed from: a */
    private BitSet f9642a = new BitSet(1);

    /* renamed from: b */
    public String f9643b;

    /* renamed from: c */
    public String f9644c;

    /* renamed from: d */
    public String f9645d;

    /* renamed from: e */
    public String f9646e;

    /* renamed from: a */
    public int compareTo(C4768io ioVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!C4768io.class.equals(ioVar.getClass())) {
            return C4768io.class.getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25669a()).compareTo(Boolean.valueOf(ioVar.mo25669a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25669a() && (a7 = C4778iy.m15232a(this.f9641a, ioVar.f9641a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(mo25671b()).compareTo(Boolean.valueOf(ioVar.mo25671b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25671b() && (a6 = C4778iy.m15231a((Comparable) this.f9640a, (Comparable) ioVar.f9640a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(mo25672c()).compareTo(Boolean.valueOf(ioVar.mo25672c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25672c() && (a5 = C4778iy.m15232a(this.f9643b, ioVar.f9643b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo25674d()).compareTo(Boolean.valueOf(ioVar.mo25674d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25674d() && (a4 = C4778iy.m15232a(this.f9644c, ioVar.f9644c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo25675e()).compareTo(Boolean.valueOf(ioVar.mo25675e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25675e() && (a3 = C4778iy.m15230a(this.f9639a, ioVar.f9639a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo25677f()).compareTo(Boolean.valueOf(ioVar.mo25677f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25677f() && (a2 = C4778iy.m15232a(this.f9645d, ioVar.f9645d)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo25678g()).compareTo(Boolean.valueOf(ioVar.mo25678g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo25678g() || (a = C4778iy.m15232a(this.f9646e, ioVar.f9646e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo25669a() {
        if (this.f9643b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9644c == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25076a(com.xiaomi.push.C4794ji r4) {
        /*
            r3 = this;
            r4.mo25816a()
        L_0x0003:
            com.xiaomi.push.jf r0 = r4.mo25816a()
            byte r1 = r0.f9820a
            if (r1 != 0) goto L_0x0033
            r4.mo25834f()
            boolean r4 = r3.mo25675e()
            if (r4 == 0) goto L_0x0018
            r3.mo25669a()
            return
        L_0x0018:
            com.xiaomi.push.jj r4 = new com.xiaomi.push.jj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0033:
            short r0 = r0.f9822a
            r2 = 11
            switch(r0) {
                case 1: goto L_0x0080;
                case 2: goto L_0x0071;
                case 3: goto L_0x0068;
                case 4: goto L_0x005f;
                case 5: goto L_0x003a;
                case 6: goto L_0x0050;
                case 7: goto L_0x0047;
                case 8: goto L_0x003e;
                default: goto L_0x003a;
            }
        L_0x003a:
            com.xiaomi.push.C4797jl.m15328a(r4, r1)
            goto L_0x0088
        L_0x003e:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo25816a()
            r3.f9646e = r0
            goto L_0x0088
        L_0x0047:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo25816a()
            r3.f9645d = r0
            goto L_0x0088
        L_0x0050:
            r0 = 10
            if (r1 != r0) goto L_0x003a
            long r0 = r4.mo25816a()
            r3.f9639a = r0
            r0 = 1
            r3.mo25670a((boolean) r0)
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo25816a()
            r3.f9644c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo25816a()
            r3.f9643b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x003a
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r3.f9640a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r4)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo25816a()
            r3.f9641a = r0
        L_0x0088:
            r4.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4768io.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25670a(boolean z) {
        this.f9642a.set(0, z);
    }

    /* renamed from: a */
    public boolean m15077a() {
        return this.f9641a != null;
    }

    /* renamed from: a */
    public boolean m15078a(C4768io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean a = mo25669a();
        boolean a2 = ioVar.mo25669a();
        if ((a || a2) && (!a || !a2 || !this.f9641a.equals(ioVar.f9641a))) {
            return false;
        }
        boolean b = mo25671b();
        boolean b2 = ioVar.mo25671b();
        if ((b || b2) && (!b || !b2 || !this.f9640a.compareTo(ioVar.f9640a))) {
            return false;
        }
        boolean c = mo25672c();
        boolean c2 = ioVar.mo25672c();
        if ((c || c2) && (!c || !c2 || !this.f9643b.equals(ioVar.f9643b))) {
            return false;
        }
        boolean d = mo25674d();
        boolean d2 = ioVar.mo25674d();
        if (((d || d2) && (!d || !d2 || !this.f9644c.equals(ioVar.f9644c))) || this.f9639a != ioVar.f9639a) {
            return false;
        }
        boolean f = mo25677f();
        boolean f2 = ioVar.mo25677f();
        if ((f || f2) && (!f || !f2 || !this.f9645d.equals(ioVar.f9645d))) {
            return false;
        }
        boolean g = mo25678g();
        boolean g2 = ioVar.mo25678g();
        if (g || g2) {
            return g && g2 && this.f9646e.equals(ioVar.f9646e);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25669a();
        jiVar.mo25823a(f9632a);
        if (this.f9641a != null && mo25669a()) {
            jiVar.mo25820a(f9631a);
            jiVar.mo25824a(this.f9641a);
            jiVar.mo25828b();
        }
        if (this.f9640a != null && mo25671b()) {
            jiVar.mo25820a(f9633b);
            this.f9640a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9643b != null) {
            jiVar.mo25820a(f9634c);
            jiVar.mo25824a(this.f9643b);
            jiVar.mo25828b();
        }
        if (this.f9644c != null) {
            jiVar.mo25820a(f9635d);
            jiVar.mo25824a(this.f9644c);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9636e);
        jiVar.mo25819a(this.f9639a);
        jiVar.mo25828b();
        if (this.f9645d != null && mo25677f()) {
            jiVar.mo25820a(f9637f);
            jiVar.mo25824a(this.f9645d);
            jiVar.mo25828b();
        }
        if (this.f9646e != null && mo25678g()) {
            jiVar.mo25820a(f9638g);
            jiVar.mo25824a(this.f9646e);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25671b() {
        return this.f9640a != null;
    }

    /* renamed from: c */
    public boolean mo25672c() {
        return this.f9643b != null;
    }

    /* renamed from: d */
    public boolean mo25674d() {
        return this.f9644c != null;
    }

    /* renamed from: e */
    public boolean mo25675e() {
        return this.f9642a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4768io)) {
            return compareTo((C4768io) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25677f() {
        return this.f9645d != null;
    }

    /* renamed from: g */
    public boolean mo25678g() {
        return this.f9646e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (mo25669a()) {
            sb.append("debug:");
            String str = this.f9641a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25671b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9640a;
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
        String str2 = this.f9643b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9644c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9639a);
        if (mo25677f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9645d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25678g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f9646e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
