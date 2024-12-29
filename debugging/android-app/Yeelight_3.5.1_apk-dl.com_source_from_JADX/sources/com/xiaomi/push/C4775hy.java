package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hy */
public class C4775hy implements C4798iu<C4775hy, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8806a = new C4809jc("", (byte) 10, 1);

    /* renamed from: a */
    private static final C4817jk f8807a = new C4817jk("Target");

    /* renamed from: b */
    private static final C4809jc f8808b = new C4809jc("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4809jc f8809c = new C4809jc("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4809jc f8810d = new C4809jc("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4809jc f8811e = new C4809jc("", (byte) 2, 5);

    /* renamed from: f */
    private static final C4809jc f8812f = new C4809jc("", (byte) 11, 7);

    /* renamed from: a */
    public long f8813a = 5;

    /* renamed from: a */
    public String f8814a;

    /* renamed from: a */
    private BitSet f8815a = new BitSet(2);

    /* renamed from: a */
    public boolean f8816a = false;

    /* renamed from: b */
    public String f8817b = "xiaomi.com";

    /* renamed from: c */
    public String f8818c = "";

    /* renamed from: d */
    public String f8819d;

    /* renamed from: a */
    public int compareTo(C4775hy hyVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        if (!getClass().equals(hyVar.getClass())) {
            return getClass().getName().compareTo(hyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29428a()).compareTo(Boolean.valueOf(hyVar.mo29428a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29428a() && (a6 = C4799iv.m14839a(this.f8813a, hyVar.f8813a)) != 0) {
            return a6;
        }
        int compareTo2 = Boolean.valueOf(mo29431b()).compareTo(Boolean.valueOf(hyVar.mo29431b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29431b() && (a5 = C4799iv.m14841a(this.f8814a, hyVar.f8814a)) != 0) {
            return a5;
        }
        int compareTo3 = Boolean.valueOf(mo29432c()).compareTo(Boolean.valueOf(hyVar.mo29432c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo29432c() && (a4 = C4799iv.m14841a(this.f8817b, hyVar.f8817b)) != 0) {
            return a4;
        }
        int compareTo4 = Boolean.valueOf(mo29434d()).compareTo(Boolean.valueOf(hyVar.mo29434d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo29434d() && (a3 = C4799iv.m14841a(this.f8818c, hyVar.f8818c)) != 0) {
            return a3;
        }
        int compareTo5 = Boolean.valueOf(mo29435e()).compareTo(Boolean.valueOf(hyVar.mo29435e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo29435e() && (a2 = C4799iv.m14847a(this.f8816a, hyVar.f8816a)) != 0) {
            return a2;
        }
        int compareTo6 = Boolean.valueOf(mo29437f()).compareTo(Boolean.valueOf(hyVar.mo29437f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!mo29437f() || (a = C4799iv.m14841a(this.f8819d, hyVar.f8819d)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo29428a() {
        if (this.f8814a == null) {
            throw new C4813jg("Required field 'userId' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo29095a(C4812jf jfVar) {
        jfVar.mo29850a();
        while (true) {
            C4809jc a = jfVar.mo29850a();
            byte b = a.f9289a;
            if (b == 0) {
                break;
            }
            short s = a.f9291a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s == 7 && b == 11) {
                                    this.f8819d = jfVar.mo29850a();
                                    jfVar.mo29869g();
                                }
                            } else if (b == 2) {
                                this.f8816a = jfVar.mo29850a();
                                mo29430b(true);
                                jfVar.mo29869g();
                            }
                        } else if (b == 11) {
                            this.f8818c = jfVar.mo29850a();
                            jfVar.mo29869g();
                        }
                    } else if (b == 11) {
                        this.f8817b = jfVar.mo29850a();
                        jfVar.mo29869g();
                    }
                } else if (b == 11) {
                    this.f8814a = jfVar.mo29850a();
                    jfVar.mo29869g();
                }
            } else if (b == 10) {
                this.f8813a = jfVar.mo29850a();
                mo29429a(true);
                jfVar.mo29869g();
            }
            C4815ji.m14965a(jfVar, b);
            jfVar.mo29869g();
        }
        jfVar.mo29868f();
        if (mo29428a()) {
            mo29428a();
            return;
        }
        throw new C4813jg("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo29429a(boolean z) {
        this.f8815a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14366a() {
        return this.f8815a.get(0);
    }

    /* renamed from: a */
    public boolean m14367a(C4775hy hyVar) {
        if (hyVar == null || this.f8813a != hyVar.f8813a) {
            return false;
        }
        boolean b = mo29431b();
        boolean b2 = hyVar.mo29431b();
        if ((b || b2) && (!b || !b2 || !this.f8814a.equals(hyVar.f8814a))) {
            return false;
        }
        boolean c = mo29432c();
        boolean c2 = hyVar.mo29432c();
        if ((c || c2) && (!c || !c2 || !this.f8817b.equals(hyVar.f8817b))) {
            return false;
        }
        boolean d = mo29434d();
        boolean d2 = hyVar.mo29434d();
        if ((d || d2) && (!d || !d2 || !this.f8818c.equals(hyVar.f8818c))) {
            return false;
        }
        boolean e = mo29435e();
        boolean e2 = hyVar.mo29435e();
        if ((e || e2) && (!e || !e2 || this.f8816a != hyVar.f8816a)) {
            return false;
        }
        boolean f = mo29437f();
        boolean f2 = hyVar.mo29437f();
        if (f || f2) {
            return f && f2 && this.f8819d.equals(hyVar.f8819d);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29428a();
        jfVar.mo29857a(f8807a);
        jfVar.mo29854a(f8806a);
        jfVar.mo29853a(this.f8813a);
        jfVar.mo29862b();
        if (this.f8814a != null) {
            jfVar.mo29854a(f8808b);
            jfVar.mo29858a(this.f8814a);
            jfVar.mo29862b();
        }
        if (this.f8817b != null && mo29432c()) {
            jfVar.mo29854a(f8809c);
            jfVar.mo29858a(this.f8817b);
            jfVar.mo29862b();
        }
        if (this.f8818c != null && mo29434d()) {
            jfVar.mo29854a(f8810d);
            jfVar.mo29858a(this.f8818c);
            jfVar.mo29862b();
        }
        if (mo29435e()) {
            jfVar.mo29854a(f8811e);
            jfVar.mo29861a(this.f8816a);
            jfVar.mo29862b();
        }
        if (this.f8819d != null && mo29437f()) {
            jfVar.mo29854a(f8812f);
            jfVar.mo29858a(this.f8819d);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29430b(boolean z) {
        this.f8815a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29431b() {
        return this.f8814a != null;
    }

    /* renamed from: c */
    public boolean mo29432c() {
        return this.f8817b != null;
    }

    /* renamed from: d */
    public boolean mo29434d() {
        return this.f8818c != null;
    }

    /* renamed from: e */
    public boolean mo29435e() {
        return this.f8815a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4775hy)) {
            return compareTo((C4775hy) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo29437f() {
        return this.f8819d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f8813a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f8814a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo29432c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f8817b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo29434d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f8818c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo29435e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f8816a);
        }
        if (mo29437f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f8819d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
