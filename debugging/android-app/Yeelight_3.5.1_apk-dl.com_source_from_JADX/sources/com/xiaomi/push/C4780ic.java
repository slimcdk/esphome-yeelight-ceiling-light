package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ic */
public class C4780ic implements C4798iu<C4780ic, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8891a = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4817jk f8892a = new C4817jk("XmPushActionCollectData");

    /* renamed from: a */
    public List<C4768hr> f8893a;

    /* renamed from: a */
    public int compareTo(C4780ic icVar) {
        int a;
        if (!getClass().equals(icVar.getClass())) {
            return getClass().getName().compareTo(icVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29512a()).compareTo(Boolean.valueOf(icVar.mo29512a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29512a() || (a = C4799iv.m14843a((List) this.f8893a, (List) icVar.f8893a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4780ic mo29511a(List<C4768hr> list) {
        this.f8893a = list;
        return this;
    }

    /* renamed from: a */
    public void mo29512a() {
        if (this.f8893a == null) {
            throw new C4813jg("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
                mo29512a();
                return;
            }
            if (a.f9291a == 1 && b == 15) {
                C4810jd a2 = jfVar.mo29850a();
                this.f8893a = new ArrayList(a2.f9293a);
                for (int i = 0; i < a2.f9293a; i++) {
                    C4768hr hrVar = new C4768hr();
                    hrVar.mo29095a(jfVar);
                    this.f8893a.add(hrVar);
                }
                jfVar.mo29871i();
            } else {
                C4815ji.m14965a(jfVar, b);
            }
            jfVar.mo29869g();
        }
    }

    /* renamed from: a */
    public boolean m14455a() {
        return this.f8893a != null;
    }

    /* renamed from: a */
    public boolean m14456a(C4780ic icVar) {
        if (icVar == null) {
            return false;
        }
        boolean a = mo29512a();
        boolean a2 = icVar.mo29512a();
        if (a || a2) {
            return a && a2 && this.f8893a.equals(icVar.f8893a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29512a();
        jfVar.mo29857a(f8892a);
        if (this.f8893a != null) {
            jfVar.mo29854a(f8891a);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8893a.size()));
            for (C4768hr b : this.f8893a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4780ic)) {
            return compareTo((C4780ic) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<C4768hr> list = this.f8893a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
