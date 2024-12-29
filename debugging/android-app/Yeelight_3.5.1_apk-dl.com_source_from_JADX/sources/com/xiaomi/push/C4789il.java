package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.il */
public class C4789il implements C4798iu<C4789il, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f9096a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f9097a = new C4817jk("XmPushActionSendFeedbackResult");

    /* renamed from: b */
    private static final C4809jc f9098b = new C4809jc("", (byte) 12, 2);

    /* renamed from: c */
    private static final C4809jc f9099c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f9100d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f9101e = new C4809jc("", (byte) 10, 6);

    /* renamed from: f */
    private static final C4809jc f9102f = new C4809jc("", (byte) 11, 7);

    /* renamed from: g */
    private static final C4809jc f9103g = new C4809jc("", (byte) 11, 8);

    /* renamed from: a */
    public long f9104a;

    /* renamed from: a */
    public C4775hy f9105a;

    /* renamed from: a */
    public String f9106a;

    /* renamed from: a */
    private BitSet f9107a = new BitSet(1);

    /* renamed from: b */
    public String f9108b;

    /* renamed from: c */
    public String f9109c;

    /* renamed from: d */
    public String f9110d;

    /* renamed from: e */
    public String f9111e;

    /* renamed from: a */
    public int compareTo(C4789il ilVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(ilVar.getClass())) {
            return getClass().getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29709a()).compareTo(Boolean.valueOf(ilVar.mo29709a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29709a() && (a7 = C4799iv.m14841a(this.f9106a, ilVar.f9106a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(mo29711b()).compareTo(Boolean.valueOf(ilVar.mo29711b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29711b() && (a6 = C4799iv.m14840a((Comparable) this.f9105a, (Comparable) ilVar.f9105a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(mo29712c()).compareTo(Boolean.valueOf(ilVar.mo29712c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29712c() && (a5 = C4799iv.m14841a(this.f9108b, ilVar.f9108b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(mo29714d()).compareTo(Boolean.valueOf(ilVar.mo29714d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29714d() && (a4 = C4799iv.m14841a(this.f9109c, ilVar.f9109c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(mo29715e()).compareTo(Boolean.valueOf(ilVar.mo29715e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29715e() && (a3 = C4799iv.m14839a(this.f9104a, ilVar.f9104a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(mo29717f()).compareTo(Boolean.valueOf(ilVar.mo29717f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (mo29717f() && (a2 = C4799iv.m14841a(this.f9110d, ilVar.f9110d)) != 0) {
            return a2;
        }
        int compareTo7 = Boolean.valueOf(mo29718g()).compareTo(Boolean.valueOf(ilVar.mo29718g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!mo29718g() || (a = C4799iv.m14841a(this.f9111e, ilVar.f9111e)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo29709a() {
        if (this.f9108b == null) {
            throw new C4813jg("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f9109c == null) {
            throw new C4813jg("Required field 'appId' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0033
            r4.mo29868f()
            boolean r4 = r3.mo29715e()
            if (r4 == 0) goto L_0x0018
            r3.mo29709a()
            return
        L_0x0018:
            com.xiaomi.push.jg r4 = new com.xiaomi.push.jg
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
            short r0 = r0.f9291a
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
            com.xiaomi.push.C4815ji.m14965a(r4, r1)
            goto L_0x0088
        L_0x003e:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo29850a()
            r3.f9111e = r0
            goto L_0x0088
        L_0x0047:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo29850a()
            r3.f9110d = r0
            goto L_0x0088
        L_0x0050:
            r0 = 10
            if (r1 != r0) goto L_0x003a
            long r0 = r4.mo29850a()
            r3.f9104a = r0
            r0 = 1
            r3.mo29710a((boolean) r0)
            goto L_0x0088
        L_0x005f:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo29850a()
            r3.f9109c = r0
            goto L_0x0088
        L_0x0068:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo29850a()
            r3.f9108b = r0
            goto L_0x0088
        L_0x0071:
            r0 = 12
            if (r1 != r0) goto L_0x003a
            com.xiaomi.push.hy r0 = new com.xiaomi.push.hy
            r0.<init>()
            r3.f9105a = r0
            r0.mo29095a((com.xiaomi.push.C4812jf) r4)
            goto L_0x0088
        L_0x0080:
            if (r1 != r2) goto L_0x003a
            java.lang.String r0 = r4.mo29850a()
            r3.f9106a = r0
        L_0x0088:
            r4.mo29869g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4789il.mo29095a(com.xiaomi.push.jf):void");
    }

    /* renamed from: a */
    public void mo29710a(boolean z) {
        this.f9107a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14683a() {
        return this.f9106a != null;
    }

    /* renamed from: a */
    public boolean m14684a(C4789il ilVar) {
        if (ilVar == null) {
            return false;
        }
        boolean a = mo29709a();
        boolean a2 = ilVar.mo29709a();
        if ((a || a2) && (!a || !a2 || !this.f9106a.equals(ilVar.f9106a))) {
            return false;
        }
        boolean b = mo29711b();
        boolean b2 = ilVar.mo29711b();
        if ((b || b2) && (!b || !b2 || !this.f9105a.compareTo(ilVar.f9105a))) {
            return false;
        }
        boolean c = mo29712c();
        boolean c2 = ilVar.mo29712c();
        if ((c || c2) && (!c || !c2 || !this.f9108b.equals(ilVar.f9108b))) {
            return false;
        }
        boolean d = mo29714d();
        boolean d2 = ilVar.mo29714d();
        if (((d || d2) && (!d || !d2 || !this.f9109c.equals(ilVar.f9109c))) || this.f9104a != ilVar.f9104a) {
            return false;
        }
        boolean f = mo29717f();
        boolean f2 = ilVar.mo29717f();
        if ((f || f2) && (!f || !f2 || !this.f9110d.equals(ilVar.f9110d))) {
            return false;
        }
        boolean g = mo29718g();
        boolean g2 = ilVar.mo29718g();
        if (g || g2) {
            return g && g2 && this.f9111e.equals(ilVar.f9111e);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29709a();
        jfVar.mo29857a(f9097a);
        if (this.f9106a != null && mo29709a()) {
            jfVar.mo29854a(f9096a);
            jfVar.mo29858a(this.f9106a);
            jfVar.mo29862b();
        }
        if (this.f9105a != null && mo29711b()) {
            jfVar.mo29854a(f9098b);
            this.f9105a.mo29099b(jfVar);
            jfVar.mo29862b();
        }
        if (this.f9108b != null) {
            jfVar.mo29854a(f9099c);
            jfVar.mo29858a(this.f9108b);
            jfVar.mo29862b();
        }
        if (this.f9109c != null) {
            jfVar.mo29854a(f9100d);
            jfVar.mo29858a(this.f9109c);
            jfVar.mo29862b();
        }
        jfVar.mo29854a(f9101e);
        jfVar.mo29853a(this.f9104a);
        jfVar.mo29862b();
        if (this.f9110d != null && mo29717f()) {
            jfVar.mo29854a(f9102f);
            jfVar.mo29858a(this.f9110d);
            jfVar.mo29862b();
        }
        if (this.f9111e != null && mo29718g()) {
            jfVar.mo29854a(f9103g);
            jfVar.mo29858a(this.f9111e);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29711b() {
        return this.f9105a != null;
    }

    /* renamed from: c */
    public boolean mo29712c() {
        return this.f9108b != null;
    }

    /* renamed from: d */
    public boolean mo29714d() {
        return this.f9109c != null;
    }

    /* renamed from: e */
    public boolean mo29715e() {
        return this.f9107a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4789il)) {
            return compareTo((C4789il) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29717f() {
        return this.f9110d != null;
    }

    /* renamed from: g */
    public boolean mo29718g() {
        return this.f9111e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (mo29709a()) {
            sb.append("debug:");
            String str = this.f9106a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29711b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C4775hy hyVar = this.f9105a;
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
        String str2 = this.f9108b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f9109c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f9104a);
        if (mo29717f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f9110d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (mo29718g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f9111e;
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
