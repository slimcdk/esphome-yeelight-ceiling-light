package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ik */
public class C4764ik implements C4777ix<C4764ik, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9500a = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4799jn f9501a = new C4799jn("XmPushActionNormalConfig");

    /* renamed from: a */
    public List<C4748hv> f9502a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(C4764ik ikVar) {
        int a;
        if (!C4764ik.class.equals(ikVar.getClass())) {
            return C4764ik.class.getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25549a()).compareTo(Boolean.valueOf(ikVar.mo25549a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25549a() == null || (a = C4778iy.m15234a((List) this.f9502a, (List) ikVar.f9502a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public List<C4748hv> mo25549a() {
        return this.f9502a;
    }

    /* renamed from: a */
    public void m14942a() {
        if (this.f9502a == null) {
            throw new C4795jj("Required field 'normalConfigs' was not present! Struct: " + toString());
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
                mo25549a();
                return;
            }
            if (a.f9822a == 1 && b == 15) {
                C4792jg a2 = jiVar.mo25816a();
                this.f9502a = new ArrayList(a2.f9824a);
                for (int i = 0; i < a2.f9824a; i++) {
                    C4748hv hvVar = new C4748hv();
                    hvVar.mo25076a(jiVar);
                    this.f9502a.add(hvVar);
                }
                jiVar.mo25837i();
            } else {
                C4797jl.m15328a(jiVar, b);
            }
            jiVar.mo25835g();
        }
    }

    /* renamed from: a */
    public boolean m14944a() {
        return this.f9502a != null;
    }

    /* renamed from: a */
    public boolean m14945a(C4764ik ikVar) {
        if (ikVar == null) {
            return false;
        }
        List<C4748hv> a = mo25549a();
        List<C4748hv> a2 = ikVar.mo25549a();
        if (a == null && a2 == null) {
            return true;
        }
        return (a == null || a2 == null || !this.f9502a.equals(ikVar.f9502a)) ? false : true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25549a();
        jiVar.mo25823a(f9501a);
        if (this.f9502a != null) {
            jiVar.mo25820a(f9500a);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f9502a.size()));
            for (C4748hv b : this.f9502a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4764ik)) {
            return compareTo((C4764ik) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<C4748hv> list = this.f9502a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
