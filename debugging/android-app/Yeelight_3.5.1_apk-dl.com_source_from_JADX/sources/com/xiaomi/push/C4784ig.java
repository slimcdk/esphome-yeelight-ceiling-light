package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ig */
public class C4784ig implements C4798iu<C4784ig, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8956a = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4817jk f8957a = new C4817jk("XmPushActionCustomConfig");

    /* renamed from: a */
    public List<C4771hu> f8958a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(C4784ig igVar) {
        int a;
        if (!getClass().equals(igVar.getClass())) {
            return getClass().getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29580a()).compareTo(Boolean.valueOf(igVar.mo29580a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29580a() == null || (a = C4799iv.m14843a((List) this.f8958a, (List) igVar.f8958a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4771hu> mo29580a() {
        return this.f8958a;
    }

    /* renamed from: a */
    public void m14535a() {
        if (this.f8958a == null) {
            throw new C4813jg("Required field 'customConfigs' was not present! Struct: " + toString());
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
                mo29580a();
                return;
            }
            if (a.f9291a == 1 && b == 15) {
                C4810jd a2 = jfVar.mo29850a();
                this.f8958a = new ArrayList(a2.f9293a);
                for (int i = 0; i < a2.f9293a; i++) {
                    C4771hu huVar = new C4771hu();
                    huVar.mo29095a(jfVar);
                    this.f8958a.add(huVar);
                }
                jfVar.mo29871i();
            } else {
                C4815ji.m14965a(jfVar, b);
            }
            jfVar.mo29869g();
        }
    }

    /* renamed from: a */
    public boolean m14537a() {
        return this.f8958a != null;
    }

    /* renamed from: a */
    public boolean m14538a(C4784ig igVar) {
        if (igVar == null) {
            return false;
        }
        List<C4771hu> a = mo29580a();
        List<C4771hu> a2 = igVar.mo29580a();
        if (a == null && a2 == null) {
            return true;
        }
        return (a == null || a2 == null || !this.f8958a.equals(igVar.f8958a)) ? false : true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29580a();
        jfVar.mo29857a(f8957a);
        if (this.f8958a != null) {
            jfVar.mo29854a(f8956a);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8958a.size()));
            for (C4771hu b : this.f8958a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4784ig)) {
            return compareTo((C4784ig) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<C4771hu> list = this.f8958a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
