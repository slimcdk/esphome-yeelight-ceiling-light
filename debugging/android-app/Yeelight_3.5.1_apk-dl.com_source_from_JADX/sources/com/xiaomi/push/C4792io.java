package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.io */
public class C4792io implements C4798iu<C4792io, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9155a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9156a = new C4817jk("XmPushActionSubscriptionResult");

    /* renamed from: b */
    private static final C4809jc f9157b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9158c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9159d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9160e = new C4809jc("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4809jc f9161f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f9162g = new C4809jc("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4809jc f9163h = new C4809jc("", (byte) 11, 9);

    /* renamed from: i */
    private static final C4809jc f9164i = new C4809jc("", (byte) 11, 10);

    /* renamed from: a */
    public long f9165a;

    /* renamed from: a */
    public C4775hy f9166a;

    /* renamed from: a */
    public String f9167a;

    /* renamed from: a */
    private BitSet f9168a = new BitSet(1);

    /* renamed from: b */
    public String f9169b;

    /* renamed from: c */
    public String f9170c;

    /* renamed from: d */
    public String f9171d;

    /* renamed from: e */
    public String f9172e;

    /* renamed from: f */
    public String f9173f;

    /* renamed from: g */
    public String f9174g;

    /* renamed from: a */
    public int compareTo(C4792io ioVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29758a()).compareTo(Boolean.valueOf(ioVar.mo29758a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29758a() && (a9 = C4799iv.m14841a(this.f9167a, ioVar.f9167a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo29760b()).compareTo(Boolean.valueOf(ioVar.mo29760b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29760b() && (a8 = C4799iv.m14840a((Comparable) this.f9166a, (Comparable) ioVar.f9166a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo29761c()).compareTo(Boolean.valueOf(ioVar.mo29761c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29761c() && (a7 = C4799iv.m14841a(this.f9169b, ioVar.f9169b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo29763d()).compareTo(Boolean.valueOf(ioVar.mo29763d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29763d() && (a6 = C4799iv.m14841a(this.f9170c, ioVar.f9170c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo29764e()).compareTo(Boolean.valueOf(ioVar.mo29764e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29764e() && (a5 = C4799iv.m14839a(this.f9165a, ioVar.f9165a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo29766f()).compareTo(Boolean.valueOf(ioVar.mo29766f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29766f() && (a4 = C4799iv.m14841a(this.f9171d, ioVar.f9171d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo29767g()).compareTo(Boolean.valueOf(ioVar.mo29767g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29767g() && (a3 = C4799iv.m14841a(this.f9172e, ioVar.f9172e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo29768h()).compareTo(Boolean.valueOf(ioVar.mo29768h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29768h() && (a2 = C4799iv.m14841a(this.f9173f, ioVar.f9173f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo29770i()).compareTo(Boolean.valueOf(ioVar.mo29770i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo29770i() || (a = C4799iv.m14841a(this.f9174g, ioVar.f9174g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo29758a() {
        return this.f9169b;
    }

    /* renamed from: a */
    public void m14737a() {
        if (this.f9169b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29095a(com.xiaomi.push.C4812jf r4) {
        /*
            r3 = this;
            r4.mo29850a()
        L_0x0003:
            com.xiaomi.push.jc r0 = r4.mo29850a()
            byte r1 = r0.f9289a
            if (r1 != 0) goto L_0x0012
            r4.mo29868f()
            r3.mo29758a()
            return
        L_0x0012:
            short r0 = r0.f9291a
            r2 = 11
            switch(r0) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0062;
                case 3: goto L_0x0059;
                case 4: goto L_0x0050;
                case 5: goto L_0x0019;
                case 6: goto L_0x0041;
                case 7: goto L_0x0038;
                case 8: goto L_0x002f;
                case 9: goto L_0x0026;
                case 10: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.xiaomi.push.C4815ji.m14965a(r4, r1)
            goto L_0x0079
        L_0x001d:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9174g = r0
            goto L_0x0079
        L_0x0026:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9173f = r0
            goto L_0x0079
        L_0x002f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9172e = r0
            goto L_0x0079
        L_0x0038:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9171d = r0
            goto L_0x0079
        L_0x0041:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r4.mo29850a()
            r3.f9165a = r0
            r0 = 1
            r3.mo29759a((boolean) r0)
            goto L_0x0079
        L_0x0050:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9170c = r0
            goto L_0x0079
        L_0x0059:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9169b = r0
            goto L_0x0079
        L_0x0062:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r3.f9166a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r4)
            goto L_0x0079
        L_0x0071:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9167a = r0
        L_0x0079:
            r4.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4792io.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29759a(boolean z) {
        this.f9168a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14740a() {
        return this.f9167a != null;
    }

    /* renamed from: a */
    public boolean m14741a(C4792io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean a = mo29758a();
        boolean a2 = ioVar.mo29758a();
        if ((a || a2) && (!a || !a2 || !this.f9167a.equals(ioVar.f9167a))) {
            return false;
        }
        boolean b = mo29760b();
        boolean b2 = ioVar.mo29760b();
        if ((b || b2) && (!b || !b2 || !this.f9166a.compareTo(ioVar.f9166a))) {
            return false;
        }
        boolean c = mo29761c();
        boolean c2 = ioVar.mo29761c();
        if ((c || c2) && (!c || !c2 || !this.f9169b.equals(ioVar.f9169b))) {
            return false;
        }
        boolean d = mo29763d();
        boolean d2 = ioVar.mo29763d();
        if ((d || d2) && (!d || !d2 || !this.f9170c.equals(ioVar.f9170c))) {
            return false;
        }
        boolean e = mo29764e();
        boolean e2 = ioVar.mo29764e();
        if ((e || e2) && (!e || !e2 || this.f9165a != ioVar.f9165a)) {
            return false;
        }
        boolean f = mo29766f();
        boolean f2 = ioVar.mo29766f();
        if ((f || f2) && (!f || !f2 || !this.f9171d.equals(ioVar.f9171d))) {
            return false;
        }
        boolean g = mo29767g();
        boolean g2 = ioVar.mo29767g();
        if ((g || g2) && (!g || !g2 || !this.f9172e.equals(ioVar.f9172e))) {
            return false;
        }
        boolean h = mo29768h();
        boolean h2 = ioVar.mo29768h();
        if ((h || h2) && (!h || !h2 || !this.f9173f.equals(ioVar.f9173f))) {
            return false;
        }
        boolean i = mo29770i();
        boolean i2 = ioVar.mo29770i();
        if (i || i2) {
            return i && i2 && this.f9174g.equals(ioVar.f9174g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo29760b() {
        return this.f9172e;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29758a();
        jfVar.mo29857a(f9156a);
        if (this.f9167a != null && mo29758a()) {
            jfVar.mo29854a(f9155a);
            jfVar.mo29858a(this.f9167a);
            jfVar.mo29862b();
        }
        if (this.f9166a != null && mo29760b()) {
            jfVar.mo29854a(f9157b);
            this.f9166a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9169b != null) {
            jfVar.mo29854a(f9158c);
            jfVar.mo29858a(this.f9169b);
            jfVar.mo29862b();
        }
        if (this.f9170c != null && mo29763d()) {
            jfVar.mo29854a(f9159d);
            jfVar.mo29858a(this.f9170c);
            jfVar.mo29862b();
        }
        if (mo29764e()) {
            jfVar.mo29854a(f9160e);
            jfVar.mo29853a(this.f9165a);
            jfVar.mo29862b();
        }
        if (this.f9171d != null && mo29766f()) {
            jfVar.mo29854a(f9161f);
            jfVar.mo29858a(this.f9171d);
            jfVar.mo29862b();
        }
        if (this.f9172e != null && mo29767g()) {
            jfVar.mo29854a(f9162g);
            jfVar.mo29858a(this.f9172e);
            jfVar.mo29862b();
        }
        if (this.f9173f != null && mo29768h()) {
            jfVar.mo29854a(f9163h);
            jfVar.mo29858a(this.f9173f);
            jfVar.mo29862b();
        }
        if (this.f9174g != null && mo29770i()) {
            jfVar.mo29854a(f9164i);
            jfVar.mo29858a(this.f9174g);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean m14744b() {
        return this.f9166a != null;
    }

    /* renamed from: c */
    public String mo29761c() {
        return this.f9174g;
    }

    /* renamed from: c */
    public boolean m14746c() {
        return this.f9169b != null;
    }

    /* renamed from: d */
    public boolean mo29763d() {
        return this.f9170c != null;
    }

    /* renamed from: e */
    public boolean mo29764e() {
        return this.f9168a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4792io)) {
            return compareTo((C4792io) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29766f() {
        return this.f9171d != null;
    }

    /* renamed from: g */
    public boolean mo29767g() {
        return this.f9172e != null;
    }

    /* renamed from: h */
    public boolean mo29768h() {
        return this.f9173f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29770i() {
        return this.f9174g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (mo29758a()) {
            sb.append("debug:");
            String str = this.f9167a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29760b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9166a;
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
        String str2 = this.f9169b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo29763d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9170c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29764e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f9165a);
        }
        if (mo29766f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9171d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29767g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f9172e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29768h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9173f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29770i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9174g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
