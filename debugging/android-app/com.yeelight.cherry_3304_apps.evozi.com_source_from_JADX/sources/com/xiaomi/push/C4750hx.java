package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hx */
public class C4750hx implements C4777ix<C4750hx, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9253a = new C4791jf("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4799jn f9254a = new C4799jn("OnlineConfigItem");

    /* renamed from: b */
    private static final C4791jf f9255b = new C4791jf("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4791jf f9256c = new C4791jf("", (byte) 2, 3);

    /* renamed from: d */
    private static final C4791jf f9257d = new C4791jf("", (byte) 8, 4);

    /* renamed from: e */
    private static final C4791jf f9258e = new C4791jf("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4791jf f9259f = new C4791jf("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4791jf f9260g = new C4791jf("", (byte) 2, 7);

    /* renamed from: a */
    public int f9261a;

    /* renamed from: a */
    public long f9262a;

    /* renamed from: a */
    public String f9263a;

    /* renamed from: a */
    private BitSet f9264a = new BitSet(6);

    /* renamed from: a */
    public boolean f9265a;

    /* renamed from: b */
    public int f9266b;

    /* renamed from: b */
    public boolean f9267b;

    /* renamed from: c */
    public int f9268c;

    /* renamed from: a */
    public int mo25315a() {
        return this.f9261a;
    }

    /* renamed from: a */
    public int compareTo(C4750hx hxVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!C4750hx.class.equals(hxVar.getClass())) {
            return C4750hx.class.getName().compareTo(hxVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25315a()).compareTo(Boolean.valueOf(hxVar.mo25315a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25315a() && (a7 = C4778iy.m15229a(this.f9261a, hxVar.f9261a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(mo25318b()).compareTo(Boolean.valueOf(hxVar.mo25318b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25318b() && (a6 = C4778iy.m15229a(this.f9266b, hxVar.f9266b)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(mo25320c()).compareTo(Boolean.valueOf(hxVar.mo25320c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25320c() && (a5 = C4778iy.m15238a(this.f9265a, hxVar.f9265a)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo25324d()).compareTo(Boolean.valueOf(hxVar.mo25324d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25324d() && (a4 = C4778iy.m15229a(this.f9268c, hxVar.f9268c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo25326e()).compareTo(Boolean.valueOf(hxVar.mo25326e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25326e() && (a3 = C4778iy.m15230a(this.f9262a, hxVar.f9262a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo25329f()).compareTo(Boolean.valueOf(hxVar.mo25329f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo25329f() && (a2 = C4778iy.m15232a(this.f9263a, hxVar.f9263a)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo25331h()).compareTo(Boolean.valueOf(hxVar.mo25331h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo25331h() || (a = C4778iy.m15238a(this.f9267b, hxVar.f9267b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m14635a() {
        return this.f9262a;
    }

    /* renamed from: a */
    public String m14636a() {
        return this.f9263a;
    }

    /* renamed from: a */
    public void m14637a() {
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
            if (r1 != 0) goto L_0x0012
            r6.mo25834f()
            r5.mo25315a()
            return
        L_0x0012:
            short r0 = r0.f9822a
            r2 = 2
            r3 = 8
            r4 = 1
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x005c;
                case 3: goto L_0x0050;
                case 4: goto L_0x0044;
                case 5: goto L_0x0036;
                case 6: goto L_0x002b;
                case 7: goto L_0x001f;
                default: goto L_0x001b;
            }
        L_0x001b:
            com.xiaomi.push.C4797jl.m15328a(r6, r1)
            goto L_0x0073
        L_0x001f:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo25816a()
            r5.f9267b = r0
            r5.mo25328f(r4)
            goto L_0x0073
        L_0x002b:
            r0 = 11
            if (r1 != r0) goto L_0x001b
            java.lang.String r0 = r6.mo25816a()
            r5.f9263a = r0
            goto L_0x0073
        L_0x0036:
            r0 = 10
            if (r1 != r0) goto L_0x001b
            long r0 = r6.mo25816a()
            r5.f9262a = r0
            r5.mo25325e(r4)
            goto L_0x0073
        L_0x0044:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo25816a()
            r5.f9268c = r0
            r5.mo25323d(r4)
            goto L_0x0073
        L_0x0050:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo25816a()
            r5.f9265a = r0
            r5.mo25321c(r4)
            goto L_0x0073
        L_0x005c:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo25816a()
            r5.f9266b = r0
            r5.mo25319b((boolean) r4)
            goto L_0x0073
        L_0x0068:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo25816a()
            r5.f9261a = r0
            r5.mo25317a((boolean) r4)
        L_0x0073:
            r6.mo25835g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4750hx.mo25076a(com.xiaomi.push.ji):void");
    }

    /* renamed from: a */
    public void mo25317a(boolean z) {
        this.f9264a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14640a() {
        return this.f9264a.get(0);
    }

    /* renamed from: a */
    public boolean m14641a(C4750hx hxVar) {
        if (hxVar == null) {
            return false;
        }
        boolean a = mo25315a();
        boolean a2 = hxVar.mo25315a();
        if ((a || a2) && (!a || !a2 || this.f9261a != hxVar.f9261a)) {
            return false;
        }
        boolean b = mo25318b();
        boolean b2 = hxVar.mo25318b();
        if ((b || b2) && (!b || !b2 || this.f9266b != hxVar.f9266b)) {
            return false;
        }
        boolean c = mo25320c();
        boolean c2 = hxVar.mo25320c();
        if ((c || c2) && (!c || !c2 || this.f9265a != hxVar.f9265a)) {
            return false;
        }
        boolean d = mo25324d();
        boolean d2 = hxVar.mo25324d();
        if ((d || d2) && (!d || !d2 || this.f9268c != hxVar.f9268c)) {
            return false;
        }
        boolean e = mo25326e();
        boolean e2 = hxVar.mo25326e();
        if ((e || e2) && (!e || !e2 || this.f9262a != hxVar.f9262a)) {
            return false;
        }
        boolean f = mo25329f();
        boolean f2 = hxVar.mo25329f();
        if ((f || f2) && (!f || !f2 || !this.f9263a.equals(hxVar.f9263a))) {
            return false;
        }
        boolean h = mo25331h();
        boolean h2 = hxVar.mo25331h();
        if (h || h2) {
            return h && h2 && this.f9267b == hxVar.f9267b;
        }
        return true;
    }

    /* renamed from: b */
    public int mo25318b() {
        return this.f9266b;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25315a();
        jiVar.mo25823a(f9254a);
        if (mo25315a()) {
            jiVar.mo25820a(f9253a);
            jiVar.mo25817a(this.f9261a);
            jiVar.mo25828b();
        }
        if (mo25318b()) {
            jiVar.mo25820a(f9255b);
            jiVar.mo25817a(this.f9266b);
            jiVar.mo25828b();
        }
        if (mo25320c()) {
            jiVar.mo25820a(f9256c);
            jiVar.mo25827a(this.f9265a);
            jiVar.mo25828b();
        }
        if (mo25324d()) {
            jiVar.mo25820a(f9257d);
            jiVar.mo25817a(this.f9268c);
            jiVar.mo25828b();
        }
        if (mo25326e()) {
            jiVar.mo25820a(f9258e);
            jiVar.mo25819a(this.f9262a);
            jiVar.mo25828b();
        }
        if (this.f9263a != null && mo25329f()) {
            jiVar.mo25820a(f9259f);
            jiVar.mo25824a(this.f9263a);
            jiVar.mo25828b();
        }
        if (mo25331h()) {
            jiVar.mo25820a(f9260g);
            jiVar.mo25827a(this.f9267b);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25319b(boolean z) {
        this.f9264a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14645b() {
        return this.f9264a.get(1);
    }

    /* renamed from: c */
    public int mo25320c() {
        return this.f9268c;
    }

    /* renamed from: c */
    public void mo25321c(boolean z) {
        this.f9264a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14648c() {
        return this.f9264a.get(2);
    }

    /* renamed from: d */
    public void mo25323d(boolean z) {
        this.f9264a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo25324d() {
        return this.f9264a.get(3);
    }

    /* renamed from: e */
    public void mo25325e(boolean z) {
        this.f9264a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo25326e() {
        return this.f9264a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4750hx)) {
            return compareTo((C4750hx) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo25328f(boolean z) {
        this.f9264a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo25329f() {
        return this.f9263a != null;
    }

    /* renamed from: g */
    public boolean mo25330g() {
        return this.f9267b;
    }

    /* renamed from: h */
    public boolean mo25331h() {
        return this.f9264a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (mo25315a()) {
            sb.append("key:");
            sb.append(this.f9261a);
            z = false;
        } else {
            z = true;
        }
        if (mo25318b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f9266b);
            z = false;
        }
        if (mo25320c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f9265a);
            z = false;
        }
        if (mo25324d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f9268c);
            z = false;
        }
        if (mo25326e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f9262a);
            z = false;
        }
        if (mo25329f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f9263a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
        } else {
            z2 = z;
        }
        if (mo25331h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f9267b);
        }
        sb.append(")");
        return sb.toString();
    }
}
