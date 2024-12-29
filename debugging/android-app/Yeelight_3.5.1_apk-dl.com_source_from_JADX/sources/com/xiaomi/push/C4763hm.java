package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.hm */
public class C4763hm implements C4798iu<C4763hm, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8477a = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4817jk f8478a = new C4817jk("ClientUploadData");

    /* renamed from: a */
    public List<C4764hn> f8479a;

    /* renamed from: a */
    public int mo29285a() {
        List<C4764hn> list = this.f8479a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public int compareTo(C4763hm hmVar) {
        int a;
        if (!getClass().equals(hmVar.getClass())) {
            return getClass().getName().compareTo(hmVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29285a()).compareTo(Boolean.valueOf(hmVar.mo29285a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29285a() || (a = C4799iv.m14843a((List) this.f8479a, (List) hmVar.f8479a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void m14188a() {
        if (this.f8479a == null) {
            throw new C4813jg("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo29287a(C4764hn hnVar) {
        if (this.f8479a == null) {
            this.f8479a = new ArrayList();
        }
        this.f8479a.add(hnVar);
    }

    /* renamed from: a */
    public void mo29095a(C4812jf jfVar) {
        jfVar.mo29850a();
        while (true) {
            C4809jc a = jfVar.mo29850a();
            byte b = a.f9289a;
            if (b == 0) {
                jfVar.mo29868f();
                mo29285a();
                return;
            }
            if (a.f9291a == 1 && b == 15) {
                C4810jd a2 = jfVar.mo29850a();
                this.f8479a = new ArrayList(a2.f9293a);
                for (int i = 0; i < a2.f9293a; i++) {
                    C4764hn hnVar = new C4764hn();
                    hnVar.mo29095a(jfVar);
                    this.f8479a.add(hnVar);
                }
                jfVar.mo29871i();
            } else {
                C4815ji.m14965a(jfVar, b);
            }
            jfVar.mo29869g();
        }
    }

    /* renamed from: a */
    public boolean m14191a() {
        return this.f8479a != null;
    }

    /* renamed from: a */
    public boolean m14192a(C4763hm hmVar) {
        if (hmVar == null) {
            return false;
        }
        boolean a = mo29285a();
        boolean a2 = hmVar.mo29285a();
        if (a || a2) {
            return a && a2 && this.f8479a.equals(hmVar.f8479a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29285a();
        jfVar.mo29857a(f8478a);
        if (this.f8479a != null) {
            jfVar.mo29854a(f8477a);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8479a.size()));
            for (C4764hn b : this.f8479a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4763hm)) {
            return compareTo((C4763hm) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<C4764hn> list = this.f8479a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
