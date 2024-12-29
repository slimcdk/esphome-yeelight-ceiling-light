package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ij */
public class C4763ij implements C4777ix<C4763ij, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9497a = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4799jn f9498a = new C4799jn("XmPushActionCustomConfig");

    /* renamed from: a */
    public List<C4750hx> f9499a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(C4763ij ijVar) {
        int a;
        if (!C4763ij.class.equals(ijVar.getClass())) {
            return C4763ij.class.getName().compareTo(ijVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25543a()).compareTo(Boolean.valueOf(ijVar.mo25543a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25543a() == null || (a = C4778iy.m15234a((List) this.f9499a, (List) ijVar.f9499a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4750hx> mo25543a() {
        return this.f9499a;
    }

    /* renamed from: a */
    public void m14935a() {
        if (this.f9499a == null) {
            throw new C4795jj("Required field 'customConfigs' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo25076a(C4794ji jiVar) {
        jiVar.mo25816a();
        while (true) {
            C4791jf a = jiVar.mo25816a();
            byte b = a.f9820a;
            if (b == 0) {
                jiVar.mo25834f();
                mo25543a();
                return;
            }
            if (a.f9822a == 1 && b == 15) {
                C4792jg a2 = jiVar.mo25816a();
                this.f9499a = new ArrayList(a2.f9824a);
                for (int i = 0; i < a2.f9824a; i++) {
                    C4750hx hxVar = new C4750hx();
                    hxVar.mo25076a(jiVar);
                    this.f9499a.add(hxVar);
                }
                jiVar.mo25837i();
            } else {
                C4797jl.m15328a(jiVar, b);
            }
            jiVar.mo25835g();
        }
    }

    /* renamed from: a */
    public boolean m14937a() {
        return this.f9499a != null;
    }

    /* renamed from: a */
    public boolean m14938a(C4763ij ijVar) {
        if (ijVar == null) {
            return false;
        }
        List<C4750hx> a = mo25543a();
        List<C4750hx> a2 = ijVar.mo25543a();
        if (a == null && a2 == null) {
            return true;
        }
        return (a == null || a2 == null || !this.f9499a.equals(ijVar.f9499a)) ? false : true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25543a();
        jiVar.mo25823a(f9498a);
        if (this.f9499a != null) {
            jiVar.mo25820a(f9497a);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f9499a.size()));
            for (C4750hx b : this.f9499a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4763ij)) {
            return compareTo((C4763ij) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<C4750hx> list = this.f9499a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
