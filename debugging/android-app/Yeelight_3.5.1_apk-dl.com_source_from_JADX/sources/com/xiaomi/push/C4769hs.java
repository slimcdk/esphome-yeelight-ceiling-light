package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.hs */
public class C4769hs implements C4798iu<C4769hs, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8650a = new C4809jc("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4817jk f8651a = new C4817jk("NormalConfig");

    /* renamed from: b */
    private static final C4809jc f8652b = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 2);

    /* renamed from: c */
    private static final C4809jc f8653c = new C4809jc("", (byte) 8, 3);

    /* renamed from: a */
    public int f8654a;

    /* renamed from: a */
    public C4766hp f8655a;

    /* renamed from: a */
    private BitSet f8656a = new BitSet(1);

    /* renamed from: a */
    public List<C4771hu> f8657a;

    /* renamed from: a */
    public int mo29336a() {
        return this.f8654a;
    }

    /* renamed from: a */
    public int compareTo(C4769hs hsVar) {
        int a;
        int a2;
        int a3;
        if (!getClass().equals(hsVar.getClass())) {
            return getClass().getName().compareTo(hsVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29336a()).compareTo(Boolean.valueOf(hsVar.mo29336a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29336a() && (a3 = C4799iv.m14838a(this.f8654a, hsVar.f8654a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo29339b()).compareTo(Boolean.valueOf(hsVar.mo29339b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29339b() && (a2 = C4799iv.m14843a((List) this.f8657a, (List) hsVar.f8657a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo29340c()).compareTo(Boolean.valueOf(hsVar.mo29340c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo29340c() || (a = C4799iv.m14840a((Comparable) this.f8655a, (Comparable) hsVar.f8655a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4766hp m14251a() {
        return this.f8655a;
    }

    /* renamed from: a */
    public void m14252a() {
        if (this.f8657a == null) {
            throw new C4813jg("Required field 'configItems' was not present! Struct: " + toString());
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
                    if (s == 3 && b == 8) {
                        this.f8655a = C4766hp.m14233a(jfVar.mo29850a());
                        jfVar.mo29869g();
                    }
                } else if (b == 15) {
                    C4810jd a2 = jfVar.mo29850a();
                    this.f8657a = new ArrayList(a2.f9293a);
                    for (int i = 0; i < a2.f9293a; i++) {
                        C4771hu huVar = new C4771hu();
                        huVar.mo29095a(jfVar);
                        this.f8657a.add(huVar);
                    }
                    jfVar.mo29871i();
                    jfVar.mo29869g();
                }
            } else if (b == 8) {
                this.f8654a = jfVar.mo29850a();
                mo29338a(true);
                jfVar.mo29869g();
            }
            C4815ji.m14965a(jfVar, b);
            jfVar.mo29869g();
        }
        jfVar.mo29868f();
        if (mo29336a()) {
            mo29336a();
            return;
        }
        throw new C4813jg("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo29338a(boolean z) {
        this.f8656a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14255a() {
        return this.f8656a.get(0);
    }

    /* renamed from: a */
    public boolean m14256a(C4769hs hsVar) {
        if (hsVar == null || this.f8654a != hsVar.f8654a) {
            return false;
        }
        boolean b = mo29339b();
        boolean b2 = hsVar.mo29339b();
        if ((b || b2) && (!b || !b2 || !this.f8657a.equals(hsVar.f8657a))) {
            return false;
        }
        boolean c = mo29340c();
        boolean c2 = hsVar.mo29340c();
        if (c || c2) {
            return c && c2 && this.f8655a.equals(hsVar.f8655a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29336a();
        jfVar.mo29857a(f8651a);
        jfVar.mo29854a(f8650a);
        jfVar.mo29851a(this.f8654a);
        jfVar.mo29862b();
        if (this.f8657a != null) {
            jfVar.mo29854a(f8652b);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8657a.size()));
            for (C4771hu b : this.f8657a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        if (this.f8655a != null && mo29340c()) {
            jfVar.mo29854a(f8653c);
            jfVar.mo29851a(this.f8655a.mo29323a());
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29339b() {
        return this.f8657a != null;
    }

    /* renamed from: c */
    public boolean mo29340c() {
        return this.f8655a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4769hs)) {
            return compareTo((C4769hs) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f8654a);
        sb.append(", ");
        sb.append("configItems:");
        List<C4771hu> list = this.f8657a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (mo29340c()) {
            sb.append(", ");
            sb.append("type:");
            C4766hp hpVar = this.f8655a;
            if (hpVar == null) {
                sb.append("null");
            } else {
                sb.append(hpVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
