package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hu */
public class C4771hu implements C4798iu<C4771hu, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8719a = new C4809jc("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4817jk f8720a = new C4817jk("OnlineConfigItem");

    /* renamed from: b */
    private static final C4809jc f8721b = new C4809jc("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4809jc f8722c = new C4809jc("", (byte) 2, 3);

    /* renamed from: d */
    private static final C4809jc f8723d = new C4809jc("", (byte) 8, 4);

    /* renamed from: e */
    private static final C4809jc f8724e = new C4809jc("", (byte) 10, 5);

    /* renamed from: f */
    private static final C4809jc f8725f = new C4809jc("", (byte) 11, 6);

    /* renamed from: g */
    private static final C4809jc f8726g = new C4809jc("", (byte) 2, 7);

    /* renamed from: a */
    public int f8727a;

    /* renamed from: a */
    public long f8728a;

    /* renamed from: a */
    public String f8729a;

    /* renamed from: a */
    private BitSet f8730a = new BitSet(6);

    /* renamed from: a */
    public boolean f8731a;

    /* renamed from: b */
    public int f8732b;

    /* renamed from: b */
    public boolean f8733b;

    /* renamed from: c */
    public int f8734c;

    /* renamed from: a */
    public int mo29346a() {
        return this.f8727a;
    }

    /* renamed from: a */
    public int compareTo(C4771hu huVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(huVar.getClass())) {
            return getClass().getName().compareTo(huVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29346a()).compareTo(Boolean.valueOf(huVar.mo29346a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29346a() && (a7 = C4799iv.m14838a(this.f8727a, huVar.f8727a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(mo29349b()).compareTo(Boolean.valueOf(huVar.mo29349b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29349b() && (a6 = C4799iv.m14838a(this.f8732b, huVar.f8732b)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(mo29351c()).compareTo(Boolean.valueOf(huVar.mo29351c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29351c() && (a5 = C4799iv.m14847a(this.f8731a, huVar.f8731a)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo29355d()).compareTo(Boolean.valueOf(huVar.mo29355d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29355d() && (a4 = C4799iv.m14838a(this.f8734c, huVar.f8734c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo29357e()).compareTo(Boolean.valueOf(huVar.mo29357e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29357e() && (a3 = C4799iv.m14839a(this.f8728a, huVar.f8728a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo29360f()).compareTo(Boolean.valueOf(huVar.mo29360f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29360f() && (a2 = C4799iv.m14841a(this.f8729a, huVar.f8729a)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo29362h()).compareTo(Boolean.valueOf(huVar.mo29362h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo29362h() || (a = C4799iv.m14847a(this.f8733b, huVar.f8733b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public long m14262a() {
        return this.f8728a;
    }

    /* renamed from: a */
    public String m14263a() {
        return this.f8729a;
    }

    /* renamed from: a */
    public void m14264a() {
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
            if (r1 != 0) goto L_0x0012
            r6.mo29868f()
            r5.mo29346a()
            return
        L_0x0012:
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r6, r1)
            goto L_0x0073
        L_0x001f:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo29850a()
            r5.f8733b = r0
            r5.mo29359f(r4)
            goto L_0x0073
        L_0x002b:
            r0 = 11
            if (r1 != r0) goto L_0x001b
            java.lang.String r0 = r6.mo29850a()
            r5.f8729a = r0
            goto L_0x0073
        L_0x0036:
            r0 = 10
            if (r1 != r0) goto L_0x001b
            long r0 = r6.mo29850a()
            r5.f8728a = r0
            r5.mo29356e(r4)
            goto L_0x0073
        L_0x0044:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo29850a()
            r5.f8734c = r0
            r5.mo29354d(r4)
            goto L_0x0073
        L_0x0050:
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.mo29850a()
            r5.f8731a = r0
            r5.mo29352c(r4)
            goto L_0x0073
        L_0x005c:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo29850a()
            r5.f8732b = r0
            r5.mo29350b((boolean) r4)
            goto L_0x0073
        L_0x0068:
            if (r1 != r3) goto L_0x001b
            int r0 = r6.mo29850a()
            r5.f8727a = r0
            r5.mo29348a((boolean) r4)
        L_0x0073:
            r6.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4771hu.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29348a(boolean z) {
        this.f8730a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14267a() {
        return this.f8730a.get(0);
    }

    /* renamed from: a */
    public boolean m14268a(C4771hu huVar) {
        if (huVar == null) {
            return false;
        }
        boolean a = mo29346a();
        boolean a2 = huVar.mo29346a();
        if ((a || a2) && (!a || !a2 || this.f8727a != huVar.f8727a)) {
            return false;
        }
        boolean b = mo29349b();
        boolean b2 = huVar.mo29349b();
        if ((b || b2) && (!b || !b2 || this.f8732b != huVar.f8732b)) {
            return false;
        }
        boolean c = mo29351c();
        boolean c2 = huVar.mo29351c();
        if ((c || c2) && (!c || !c2 || this.f8731a != huVar.f8731a)) {
            return false;
        }
        boolean d = mo29355d();
        boolean d2 = huVar.mo29355d();
        if ((d || d2) && (!d || !d2 || this.f8734c != huVar.f8734c)) {
            return false;
        }
        boolean e = mo29357e();
        boolean e2 = huVar.mo29357e();
        if ((e || e2) && (!e || !e2 || this.f8728a != huVar.f8728a)) {
            return false;
        }
        boolean f = mo29360f();
        boolean f2 = huVar.mo29360f();
        if ((f || f2) && (!f || !f2 || !this.f8729a.equals(huVar.f8729a))) {
            return false;
        }
        boolean h = mo29362h();
        boolean h2 = huVar.mo29362h();
        if (h || h2) {
            return h && h2 && this.f8733b == huVar.f8733b;
        }
        return true;
    }

    /* renamed from: b */
    public int mo29349b() {
        return this.f8732b;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29346a();
        jfVar.mo29857a(f8720a);
        if (mo29346a()) {
            jfVar.mo29854a(f8719a);
            jfVar.mo29851a(this.f8727a);
            jfVar.mo29862b();
        }
        if (mo29349b()) {
            jfVar.mo29854a(f8721b);
            jfVar.mo29851a(this.f8732b);
            jfVar.mo29862b();
        }
        if (mo29351c()) {
            jfVar.mo29854a(f8722c);
            jfVar.mo29861a(this.f8731a);
            jfVar.mo29862b();
        }
        if (mo29355d()) {
            jfVar.mo29854a(f8723d);
            jfVar.mo29851a(this.f8734c);
            jfVar.mo29862b();
        }
        if (mo29357e()) {
            jfVar.mo29854a(f8724e);
            jfVar.mo29853a(this.f8728a);
            jfVar.mo29862b();
        }
        if (this.f8729a != null && mo29360f()) {
            jfVar.mo29854a(f8725f);
            jfVar.mo29858a(this.f8729a);
            jfVar.mo29862b();
        }
        if (mo29362h()) {
            jfVar.mo29854a(f8726g);
            jfVar.mo29861a(this.f8733b);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29350b(boolean z) {
        this.f8730a.set(1, z);
    }

    /* renamed from: b */
    public boolean m14272b() {
        return this.f8730a.get(1);
    }

    /* renamed from: c */
    public int mo29351c() {
        return this.f8734c;
    }

    /* renamed from: c */
    public void mo29352c(boolean z) {
        this.f8730a.set(2, z);
    }

    /* renamed from: c */
    public boolean m14275c() {
        return this.f8730a.get(2);
    }

    /* renamed from: d */
    public void mo29354d(boolean z) {
        this.f8730a.set(3, z);
    }

    /* renamed from: d */
    public boolean mo29355d() {
        return this.f8730a.get(3);
    }

    /* renamed from: e */
    public void mo29356e(boolean z) {
        this.f8730a.set(4, z);
    }

    /* renamed from: e */
    public boolean mo29357e() {
        return this.f8730a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4771hu)) {
            return compareTo((C4771hu) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void mo29359f(boolean z) {
        this.f8730a.set(5, z);
    }

    /* renamed from: f */
    public boolean mo29360f() {
        return this.f8729a != null;
    }

    /* renamed from: g */
    public boolean mo29361g() {
        return this.f8733b;
    }

    /* renamed from: h */
    public boolean mo29362h() {
        return this.f8730a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (mo29346a()) {
            sb.append("key:");
            sb.append(this.f8727a);
            z = false;
        } else {
            z = true;
        }
        if (mo29349b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f8732b);
            z = false;
        }
        if (mo29351c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f8731a);
            z = false;
        }
        if (mo29355d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f8734c);
            z = false;
        }
        if (mo29357e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f8728a);
            z = false;
        }
        if (mo29360f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f8729a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
        } else {
            z2 = z;
        }
        if (mo29362h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f8733b);
        }
        sb.append(")");
        return sb.toString();
    }
}
