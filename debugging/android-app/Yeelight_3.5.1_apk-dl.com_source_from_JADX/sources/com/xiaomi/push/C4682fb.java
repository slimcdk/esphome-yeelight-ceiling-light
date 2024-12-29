package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.fb */
public class C4682fb implements C4798iu<C4682fb, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8126a = new C4809jc("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4817jk f8127a = new C4817jk("StatsEvents");

    /* renamed from: b */
    private static final C4809jc f8128b = new C4809jc("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4809jc f8129c = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 3);

    /* renamed from: a */
    public String f8130a;

    /* renamed from: a */
    public List<C4681fa> f8131a;

    /* renamed from: b */
    public String f8132b;

    public C4682fb() {
    }

    public C4682fb(String str, List<C4681fa> list) {
        this();
        this.f8130a = str;
        this.f8131a = list;
    }

    /* renamed from: a */
    public int compareTo(C4682fb fbVar) {
        int a;
        int a2;
        int a3;
        if (!getClass().equals(fbVar.getClass())) {
            return getClass().getName().compareTo(fbVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29124a()).compareTo(Boolean.valueOf(fbVar.mo29124a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29124a() && (a3 = C4799iv.m14841a(this.f8130a, fbVar.f8130a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo29125b()).compareTo(Boolean.valueOf(fbVar.mo29125b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29125b() && (a2 = C4799iv.m14841a(this.f8132b, fbVar.f8132b)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo29126c()).compareTo(Boolean.valueOf(fbVar.mo29126c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo29126c() || (a = C4799iv.m14843a((List) this.f8131a, (List) fbVar.f8131a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4682fb mo29123a(String str) {
        this.f8132b = str;
        return this;
    }

    /* renamed from: a */
    public void mo29124a() {
        if (this.f8130a == null) {
            throw new C4813jg("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f8131a == null) {
            throw new C4813jg("Required field 'events' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo29095a(C4812jf jfVar) {
        jfVar.mo29850a();
        while (true) {
            C4809jc a = jfVar.mo29850a();
            byte b = a.f9289a;
            if (b == 0) {
                jfVar.mo29868f();
                mo29124a();
                return;
            }
            short s = a.f9291a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 15) {
                        C4810jd a2 = jfVar.mo29850a();
                        this.f8131a = new ArrayList(a2.f9293a);
                        for (int i = 0; i < a2.f9293a; i++) {
                            C4681fa faVar = new C4681fa();
                            faVar.mo29095a(jfVar);
                            this.f8131a.add(faVar);
                        }
                        jfVar.mo29871i();
                        jfVar.mo29869g();
                    }
                } else if (b == 11) {
                    this.f8132b = jfVar.mo29850a();
                    jfVar.mo29869g();
                }
            } else if (b == 11) {
                this.f8130a = jfVar.mo29850a();
                jfVar.mo29869g();
            }
            C4815ji.m14965a(jfVar, b);
            jfVar.mo29869g();
        }
    }

    /* renamed from: a */
    public boolean m13810a() {
        return this.f8130a != null;
    }

    /* renamed from: a */
    public boolean m13811a(C4682fb fbVar) {
        if (fbVar == null) {
            return false;
        }
        boolean a = mo29124a();
        boolean a2 = fbVar.mo29124a();
        if ((a || a2) && (!a || !a2 || !this.f8130a.equals(fbVar.f8130a))) {
            return false;
        }
        boolean b = mo29125b();
        boolean b2 = fbVar.mo29125b();
        if ((b || b2) && (!b || !b2 || !this.f8132b.equals(fbVar.f8132b))) {
            return false;
        }
        boolean c = mo29126c();
        boolean c2 = fbVar.mo29126c();
        if (c || c2) {
            return c && c2 && this.f8131a.equals(fbVar.f8131a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29124a();
        jfVar.mo29857a(f8127a);
        if (this.f8130a != null) {
            jfVar.mo29854a(f8126a);
            jfVar.mo29858a(this.f8130a);
            jfVar.mo29862b();
        }
        if (this.f8132b != null && mo29125b()) {
            jfVar.mo29854a(f8128b);
            jfVar.mo29858a(this.f8132b);
            jfVar.mo29862b();
        }
        if (this.f8131a != null) {
            jfVar.mo29854a(f8129c);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8131a.size()));
            for (C4681fa b : this.f8131a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29125b() {
        return this.f8132b != null;
    }

    /* renamed from: c */
    public boolean mo29126c() {
        return this.f8131a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4682fb)) {
            return compareTo((C4682fb) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f8130a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo29125b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f8132b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C4681fa> list = this.f8131a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
