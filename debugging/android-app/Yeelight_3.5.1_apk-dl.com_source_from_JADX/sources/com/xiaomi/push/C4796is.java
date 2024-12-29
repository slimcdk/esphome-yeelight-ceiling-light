package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.is */
public class C4796is implements C4798iu<C4796is, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9238a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9239a = new C4817jk("XmPushActionUnSubscriptionResult");

    /* renamed from: b */
    private static final C4809jc f9240b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9241c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9242d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9243e = new C4809jc("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4809jc f9244f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f9245g = new C4809jc("", (byte) 11, 8);

    /* renamed from: h */
    private static final C4809jc f9246h = new C4809jc("", (byte) 11, 9);

    /* renamed from: i */
    private static final C4809jc f9247i = new C4809jc("", (byte) 11, 10);

    /* renamed from: a */
    public long f9248a;

    /* renamed from: a */
    public C4775hy f9249a;

    /* renamed from: a */
    public String f9250a;

    /* renamed from: a */
    private BitSet f9251a = new BitSet(1);

    /* renamed from: b */
    public String f9252b;

    /* renamed from: c */
    public String f9253c;

    /* renamed from: d */
    public String f9254d;

    /* renamed from: e */
    public String f9255e;

    /* renamed from: f */
    public String f9256f;

    /* renamed from: g */
    public String f9257g;

    /* renamed from: a */
    public int compareTo(C4796is isVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(isVar.getClass())) {
            return getClass().getName().compareTo(isVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29832a()).compareTo(Boolean.valueOf(isVar.mo29832a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29832a() && (a9 = C4799iv.m14841a(this.f9250a, isVar.f9250a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(mo29834b()).compareTo(Boolean.valueOf(isVar.mo29834b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29834b() && (a8 = C4799iv.m14840a((Comparable) this.f9249a, (Comparable) isVar.f9249a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(mo29835c()).compareTo(Boolean.valueOf(isVar.mo29835c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29835c() && (a7 = C4799iv.m14841a(this.f9252b, isVar.f9252b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(mo29837d()).compareTo(Boolean.valueOf(isVar.mo29837d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29837d() && (a6 = C4799iv.m14841a(this.f9253c, isVar.f9253c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(mo29838e()).compareTo(Boolean.valueOf(isVar.mo29838e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29838e() && (a5 = C4799iv.m14839a(this.f9248a, isVar.f9248a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(mo29840f()).compareTo(Boolean.valueOf(isVar.mo29840f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29840f() && (a4 = C4799iv.m14841a(this.f9254d, isVar.f9254d)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(mo29841g()).compareTo(Boolean.valueOf(isVar.mo29841g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (mo29841g() && (a3 = C4799iv.m14841a(this.f9255e, isVar.f9255e)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(mo29842h()).compareTo(Boolean.valueOf(isVar.mo29842h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (mo29842h() && (a2 = C4799iv.m14841a(this.f9256f, isVar.f9256f)) != 0) {
            return a2;
        }
        int compareTo9 = Boolean.valueOf(mo29844i()).compareTo(Boolean.valueOf(isVar.mo29844i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!mo29844i() || (a = C4799iv.m14841a(this.f9257g, isVar.f9257g)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public String mo29832a() {
        return this.f9252b;
    }

    /* renamed from: a */
    public void m14815a() {
        if (this.f9252b == null) {
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
            r3.mo29832a()
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
            r3.f9257g = r0
            goto L_0x0079
        L_0x0026:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9256f = r0
            goto L_0x0079
        L_0x002f:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9255e = r0
            goto L_0x0079
        L_0x0038:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9254d = r0
            goto L_0x0079
        L_0x0041:
            r0 = 10
            if (r1 != r0) goto L_0x0019
            long r0 = r4.mo29850a()
            r3.f9248a = r0
            r0 = 1
            r3.mo29833a((boolean) r0)
            goto L_0x0079
        L_0x0050:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9253c = r0
            goto L_0x0079
        L_0x0059:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9252b = r0
            goto L_0x0079
        L_0x0062:
            r0 = 12
            if (r1 != r0) goto L_0x0019
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r3.f9249a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r4)
            goto L_0x0079
        L_0x0071:
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.mo29850a()
            r3.f9250a = r0
        L_0x0079:
            r4.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4796is.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29833a(boolean z) {
        this.f9251a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14818a() {
        return this.f9250a != null;
    }

    /* renamed from: a */
    public boolean m14819a(C4796is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean a = mo29832a();
        boolean a2 = isVar.mo29832a();
        if ((a || a2) && (!a || !a2 || !this.f9250a.equals(isVar.f9250a))) {
            return false;
        }
        boolean b = mo29834b();
        boolean b2 = isVar.mo29834b();
        if ((b || b2) && (!b || !b2 || !this.f9249a.compareTo(isVar.f9249a))) {
            return false;
        }
        boolean c = mo29835c();
        boolean c2 = isVar.mo29835c();
        if ((c || c2) && (!c || !c2 || !this.f9252b.equals(isVar.f9252b))) {
            return false;
        }
        boolean d = mo29837d();
        boolean d2 = isVar.mo29837d();
        if ((d || d2) && (!d || !d2 || !this.f9253c.equals(isVar.f9253c))) {
            return false;
        }
        boolean e = mo29838e();
        boolean e2 = isVar.mo29838e();
        if ((e || e2) && (!e || !e2 || this.f9248a != isVar.f9248a)) {
            return false;
        }
        boolean f = mo29840f();
        boolean f2 = isVar.mo29840f();
        if ((f || f2) && (!f || !f2 || !this.f9254d.equals(isVar.f9254d))) {
            return false;
        }
        boolean g = mo29841g();
        boolean g2 = isVar.mo29841g();
        if ((g || g2) && (!g || !g2 || !this.f9255e.equals(isVar.f9255e))) {
            return false;
        }
        boolean h = mo29842h();
        boolean h2 = isVar.mo29842h();
        if ((h || h2) && (!h || !h2 || !this.f9256f.equals(isVar.f9256f))) {
            return false;
        }
        boolean i = mo29844i();
        boolean i2 = isVar.mo29844i();
        if (i || i2) {
            return i && i2 && this.f9257g.equals(isVar.f9257g);
        }
        return true;
    }

    /* renamed from: b */
    public String mo29834b() {
        return this.f9255e;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29832a();
        jfVar.mo29857a(f9239a);
        if (this.f9250a != null && mo29832a()) {
            jfVar.mo29854a(f9238a);
            jfVar.mo29858a(this.f9250a);
            jfVar.mo29862b();
        }
        if (this.f9249a != null && mo29834b()) {
            jfVar.mo29854a(f9240b);
            this.f9249a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9252b != null) {
            jfVar.mo29854a(f9241c);
            jfVar.mo29858a(this.f9252b);
            jfVar.mo29862b();
        }
        if (this.f9253c != null && mo29837d()) {
            jfVar.mo29854a(f9242d);
            jfVar.mo29858a(this.f9253c);
            jfVar.mo29862b();
        }
        if (mo29838e()) {
            jfVar.mo29854a(f9243e);
            jfVar.mo29853a(this.f9248a);
            jfVar.mo29862b();
        }
        if (this.f9254d != null && mo29840f()) {
            jfVar.mo29854a(f9244f);
            jfVar.mo29858a(this.f9254d);
            jfVar.mo29862b();
        }
        if (this.f9255e != null && mo29841g()) {
            jfVar.mo29854a(f9245g);
            jfVar.mo29858a(this.f9255e);
            jfVar.mo29862b();
        }
        if (this.f9256f != null && mo29842h()) {
            jfVar.mo29854a(f9246h);
            jfVar.mo29858a(this.f9256f);
            jfVar.mo29862b();
        }
        if (this.f9257g != null && mo29844i()) {
            jfVar.mo29854a(f9247i);
            jfVar.mo29858a(this.f9257g);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean m14822b() {
        return this.f9249a != null;
    }

    /* renamed from: c */
    public String mo29835c() {
        return this.f9257g;
    }

    /* renamed from: c */
    public boolean m14824c() {
        return this.f9252b != null;
    }

    /* renamed from: d */
    public boolean mo29837d() {
        return this.f9253c != null;
    }

    /* renamed from: e */
    public boolean mo29838e() {
        return this.f9251a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4796is)) {
            return compareTo((C4796is) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29840f() {
        return this.f9254d != null;
    }

    /* renamed from: g */
    public boolean mo29841g() {
        return this.f9255e != null;
    }

    /* renamed from: h */
    public boolean mo29842h() {
        return this.f9256f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo29844i() {
        return this.f9257g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (mo29832a()) {
            sb.append("debug:");
            String str = this.f9250a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29834b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9249a;
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
        String str2 = this.f9252b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (mo29837d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f9253c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29838e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f9248a);
        }
        if (mo29840f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9254d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29841g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f9255e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (mo29842h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f9256f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (mo29844i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f9257g;
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
