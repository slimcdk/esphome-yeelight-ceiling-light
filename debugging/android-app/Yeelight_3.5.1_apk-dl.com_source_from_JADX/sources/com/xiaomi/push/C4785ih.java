package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ih */
public class C4785ih implements C4798iu<C4785ih, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8959a = new C4809jc("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4817jk f8960a = new C4817jk("XmPushActionNormalConfig");

    /* renamed from: a */
    public List<C4769hs> f8961a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(C4785ih ihVar) {
        int a;
        if (!getClass().equals(ihVar.getClass())) {
            return getClass().getName().compareTo(ihVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29586a()).compareTo(Boolean.valueOf(ihVar.mo29586a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29586a() == null || (a = C4799iv.m14843a((List) this.f8961a, (List) ihVar.f8961a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4769hs> mo29586a() {
        return this.f8961a;
    }

    /* renamed from: a */
    public void m14542a() {
        if (this.f8961a == null) {
            throw new C4813jg("Required field 'normalConfigs' was not present! Struct: " + toString());
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
                mo29586a();
                return;
            }
            if (a.f9291a == 1 && b == 15) {
                C4810jd a2 = jfVar.mo29850a();
                this.f8961a = new ArrayList(a2.f9293a);
                for (int i = 0; i < a2.f9293a; i++) {
                    C4769hs hsVar = new C4769hs();
                    hsVar.mo29095a(jfVar);
                    this.f8961a.add(hsVar);
                }
                jfVar.mo29871i();
            } else {
                C4815ji.m14965a(jfVar, b);
            }
            jfVar.mo29869g();
        }
    }

    /* renamed from: a */
    public boolean m14544a() {
        return this.f8961a != null;
    }

    /* renamed from: a */
    public boolean m14545a(C4785ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        List<C4769hs> a = mo29586a();
        List<C4769hs> a2 = ihVar.mo29586a();
        if (a == null && a2 == null) {
            return true;
        }
        return (a == null || a2 == null || !this.f8961a.equals(ihVar.f8961a)) ? false : true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29586a();
        jfVar.mo29857a(f8960a);
        if (this.f8961a != null) {
            jfVar.mo29854a(f8959a);
            jfVar.mo29855a(new C4810jd((byte) 12, this.f8961a.size()));
            for (C4769hs b : this.f8961a) {
                b.mo29099b(jfVar);
            }
            jfVar.mo29867e();
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4785ih)) {
            return compareTo((C4785ih) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<C4769hs> list = this.f8961a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
