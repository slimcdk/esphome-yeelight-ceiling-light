package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.it */
public class C4773it implements C4777ix<C4773it, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9736a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f9737a = new C4799jn("XmPushActionUnRegistrationResult");

    /* renamed from: b */
    private static final C4791jf f9738b = new C4791jf("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4791jf f9739c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9740d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9741e = new C4791jf("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4791jf f9742f = new C4791jf("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4791jf f9743g = new C4791jf("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4791jf f9744h = new C4791jf("", (byte) 10, 9);

    /* renamed from: i */
    private static final C4791jf f9745i = new C4791jf("", (byte) 10, 10);

    /* renamed from: a */
    public long f9746a;

    /* renamed from: a */
    public C4755ib f9747a;

    /* renamed from: a */
    public String f9748a;

    /* renamed from: a */
    private BitSet f9749a = new BitSet(3);

    /* renamed from: b */
    public long f9750b;

    /* renamed from: b */
    public String f9751b;

    /* renamed from: c */
    public long f9752c;

    /* renamed from: c */
    public String f9753c;

    /* renamed from: d */
    public String f9754d;

    /* renamed from: e */
    public String f9755e;

    /* renamed from: a */
    public int compareTo(C4773it itVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!C4773it.class.equals(itVar.getClass())) {
            return C4773it.class.getName().compareTo(itVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25757a()).compareTo(Boolean.valueOf(itVar.mo25757a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25757a() && (a9 = C4778iy.m15232a(this.f9748a, itVar.f9748a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo25760b()).compareTo(Boolean.valueOf(itVar.mo25760b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25760b() && (a8 = C4778iy.m15231a((Comparable) this.f9747a, (Comparable) itVar.f9747a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo25762c()).compareTo(Boolean.valueOf(itVar.mo25762c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25762c() && (a7 = C4778iy.m15232a(this.f9751b, itVar.f9751b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo25764d()).compareTo(Boolean.valueOf(itVar.mo25764d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25764d() && (a6 = C4778iy.m15232a(this.f9753c, itVar.f9753c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo25765e()).compareTo(Boolean.valueOf(itVar.mo25765e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25765e() && (a5 = C4778iy.m15230a(this.f9746a, itVar.f9746a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo25767f()).compareTo(Boolean.valueOf(itVar.mo25767f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25767f() && (a4 = C4778iy.m15232a(this.f9754d, itVar.f9754d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo25768g()).compareTo(Boolean.valueOf(itVar.mo25768g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo25768g() && (a3 = C4778iy.m15232a(this.f9755e, itVar.f9755e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo25769h()).compareTo(Boolean.valueOf(itVar.mo25769h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo25769h() && (a2 = C4778iy.m15230a(this.f9750b, itVar.f9750b)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo25771i()).compareTo(Boolean.valueOf(itVar.mo25771i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo25771i() || (a = C4778iy.m15230a(this.f9752c, itVar.f9752c)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo25757a() {
        return this.f9755e;
    }

    /* renamed from: a */
    public void m15172a() {
        if (this.f9751b == null) {
            throw new C4795jj("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9753c == null) {
            throw new C4795jj("Required field 'appId' was not present! Struct: " + toString());
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
            boolean r6 = r5.mo25765e()
            if (r6 == 0) goto L_0x0018
            r5.mo25757a()
            return
        L_0x0018:
            com.xiaomi.push.jj r6 = new com.xiaomi.push.jj
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0033:
            short r0 = r0.f9822a
            r2 = 1
            r3 = 10
            r4 = 11
            switch(r0) {
                case 1: goto L_0x0098;
                case 2: goto L_0x0089;
                case 3: goto L_0x0080;
                case 4: goto L_0x0077;
                case 5: goto L_0x003d;
                case 6: goto L_0x006b;
                case 7: goto L_0x0062;
                case 8: goto L_0x0059;
                case 9: goto L_0x004d;
                case 10: goto L_0x0041;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x00a0
        L_0x0041:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo25816a()
            r5.f9752c = r0
            r5.mo25761c(r2)
            goto L_0x00a0
        L_0x004d:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo25816a()
            r5.f9750b = r0
            r5.mo25759b((boolean) r2)
            goto L_0x00a0
        L_0x0059:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo25816a()
            r5.f9755e = r0
            goto L_0x00a0
        L_0x0062:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo25816a()
            r5.f9754d = r0
            goto L_0x00a0
        L_0x006b:
            if (r1 != r3) goto L_0x003d
            long r0 = r6.mo25816a()
            r5.f9746a = r0
            r5.mo25758a((boolean) r2)
            goto L_0x00a0
        L_0x0077:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo25816a()
            r5.f9753c = r0
            goto L_0x00a0
        L_0x0080:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo25816a()
            r5.f9751b = r0
            goto L_0x00a0
        L_0x0089:
            r0 = 12
            if (r1 != r0) goto L_0x003d
            com.xiaomi.push.ib r0 = new com.xiaomi.push.ib
            r0.<init>()
            r5.f9747a = r0
            r0.mo25076a((com.xiaomi.push.C4794ji) r6)
            goto L_0x00a0
        L_0x0098:
            if (r1 != r4) goto L_0x003d
            java.lang.String r0 = r6.mo25816a()
            r5.f9748a = r0
        L_0x00a0:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4773it.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25758a(boolean z) {
        this.f9749a.set(0, z);
    }

    /* renamed from: a */
    public boolean m15175a() {
        return this.f9748a != null;
    }

    /* renamed from: a */
    public boolean m15176a(C4773it itVar) {
        if (itVar == null) {
            return false;
        }
        boolean a = mo25757a();
        boolean a2 = itVar.mo25757a();
        if ((a || a2) && (!a || !a2 || !this.f9748a.equals(itVar.f9748a))) {
            return false;
        }
        boolean b = mo25760b();
        boolean b2 = itVar.mo25760b();
        if ((b || b2) && (!b || !b2 || !this.f9747a.compareTo(itVar.f9747a))) {
            return false;
        }
        boolean c = mo25762c();
        boolean c2 = itVar.mo25762c();
        if ((c || c2) && (!c || !c2 || !this.f9751b.equals(itVar.f9751b))) {
            return false;
        }
        boolean d = mo25764d();
        boolean d2 = itVar.mo25764d();
        if (((d || d2) && (!d || !d2 || !this.f9753c.equals(itVar.f9753c))) || this.f9746a != itVar.f9746a) {
            return false;
        }
        boolean f = mo25767f();
        boolean f2 = itVar.mo25767f();
        if ((f || f2) && (!f || !f2 || !this.f9754d.equals(itVar.f9754d))) {
            return false;
        }
        boolean g = mo25768g();
        boolean g2 = itVar.mo25768g();
        if ((g || g2) && (!g || !g2 || !this.f9755e.equals(itVar.f9755e))) {
            return false;
        }
        boolean h = mo25769h();
        boolean h2 = itVar.mo25769h();
        if ((h || h2) && (!h || !h2 || this.f9750b != itVar.f9750b)) {
            return false;
        }
        boolean i = mo25771i();
        boolean i2 = itVar.mo25771i();
        if (i || i2) {
            return i && i2 && this.f9752c == itVar.f9752c;
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25757a();
        jiVar.mo25823a(f9737a);
        if (this.f9748a != null && mo25757a()) {
            jiVar.mo25820a(f9736a);
            jiVar.mo25824a(this.f9748a);
            jiVar.mo25828b();
        }
        if (this.f9747a != null && mo25760b()) {
            jiVar.mo25820a(f9738b);
            this.f9747a.mo25080b(jiVar);
            jiVar.mo25828b();
        }
        if (this.f9751b != null) {
            jiVar.mo25820a(f9739c);
            jiVar.mo25824a(this.f9751b);
            jiVar.mo25828b();
        }
        if (this.f9753c != null) {
            jiVar.mo25820a(f9740d);
            jiVar.mo25824a(this.f9753c);
            jiVar.mo25828b();
        }
        jiVar.mo25820a(f9741e);
        jiVar.mo25819a(this.f9746a);
        jiVar.mo25828b();
        if (this.f9754d != null && mo25767f()) {
            jiVar.mo25820a(f9742f);
            jiVar.mo25824a(this.f9754d);
            jiVar.mo25828b();
        }
        if (this.f9755e != null && mo25768g()) {
            jiVar.mo25820a(f9743g);
            jiVar.mo25824a(this.f9755e);
            jiVar.mo25828b();
        }
        if (mo25769h()) {
            jiVar.mo25820a(f9744h);
            jiVar.mo25819a(this.f9750b);
            jiVar.mo25828b();
        }
        if (mo25771i()) {
            jiVar.mo25820a(f9745i);
            jiVar.mo25819a(this.f9752c);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25759b(boolean z) {
        this.f9749a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25760b() {
        return this.f9747a != null;
    }

    /* renamed from: c */
    public void mo25761c(boolean z) {
        this.f9749a.set(2, z);
    }

    /* renamed from: c */
    public boolean mo25762c() {
        return this.f9751b != null;
    }

    /* renamed from: d */
    public boolean mo25764d() {
        return this.f9753c != null;
    }

    /* renamed from: e */
    public boolean mo25765e() {
        return this.f9749a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4773it)) {
            return compareTo((C4773it) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25767f() {
        return this.f9754d != null;
    }

    /* renamed from: g */
    public boolean mo25768g() {
        return this.f9755e != null;
    }

    /* renamed from: h */
    public boolean mo25769h() {
        return this.f9749a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo25771i() {
        return this.f9749a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (mo25757a()) {
            sb.append("debug:");
            String str = this.f9748a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25760b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4755ib ibVar = this.f9747a;
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
        String str2 = this.f9751b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9753c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9746a);
        if (mo25767f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9754d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo25768g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f9755e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo25769h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f9750b);
        }
        if (mo25771i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f9752c);
        }
        sb.append(")");
        return sb.toString();
    }
}
