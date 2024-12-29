package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.hp */
public class C4742hp implements C4777ix<C4742hp, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9039a = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4799jn f9040a = new C4799jn("ClientUploadData");

    /* renamed from: a */
    public List<C4743hq> f9041a;

    /* renamed from: a */
    public int mo25256a() {
        List<C4743hq> list = this.f9041a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public int compareTo(C4742hp hpVar) {
        int a;
        if (!C4742hp.class.equals(hpVar.getClass())) {
            return C4742hp.class.getName().compareTo(hpVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25256a()).compareTo(Boolean.valueOf(hpVar.mo25256a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo25256a() || (a = C4778iy.m15234a((List) this.f9041a, (List) hpVar.f9041a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void m14564a() {
        if (this.f9041a == null) {
            throw new C4795jj("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo25258a(C4743hq hqVar) {
        if (this.f9041a == null) {
            this.f9041a = new ArrayList();
        }
        this.f9041a.add(hqVar);
    }

    /* renamed from: a */
    public void mo25076a(C4794ji jiVar) {
        jiVar.mo25816a();
        while (true) {
            C4791jf a = jiVar.mo25816a();
            byte b = a.f9820a;
            if (b == 0) {
                jiVar.mo25834f();
                mo25256a();
                return;
            }
            if (a.f9822a == 1 && b == 15) {
                C4792jg a2 = jiVar.mo25816a();
                this.f9041a = new ArrayList(a2.f9824a);
                for (int i = 0; i < a2.f9824a; i++) {
                    C4743hq hqVar = new C4743hq();
                    hqVar.mo25076a(jiVar);
                    this.f9041a.add(hqVar);
                }
                jiVar.mo25837i();
            } else {
                C4797jl.m15328a(jiVar, b);
            }
            jiVar.mo25835g();
        }
    }

    /* renamed from: a */
    public boolean m14567a() {
        return this.f9041a != null;
    }

    /* renamed from: a */
    public boolean m14568a(C4742hp hpVar) {
        if (hpVar == null) {
            return false;
        }
        boolean a = mo25256a();
        boolean a2 = hpVar.mo25256a();
        if (a || a2) {
            return a && a2 && this.f9041a.equals(hpVar.f9041a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25256a();
        jiVar.mo25823a(f9040a);
        if (this.f9041a != null) {
            jiVar.mo25820a(f9039a);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f9041a.size()));
            for (C4743hq b : this.f9041a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4742hp)) {
            return compareTo((C4742hp) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<C4743hq> list = this.f9041a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
