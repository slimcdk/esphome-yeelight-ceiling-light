package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.if */
public class C4759if implements C4777ix<C4759if, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9432a = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 1);

    /* renamed from: a */
    private static final C4799jn f9433a = new C4799jn("XmPushActionCollectData");

    /* renamed from: a */
    public List<C4747hu> f9434a;

    /* renamed from: a */
    public int compareTo(C4759if ifVar) {
        int a;
        if (!C4759if.class.equals(ifVar.getClass())) {
            return C4759if.class.getName().compareTo(ifVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25474a()).compareTo(Boolean.valueOf(ifVar.mo25474a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo25474a() || (a = C4778iy.m15234a((List) this.f9434a, (List) ifVar.f9434a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4759if mo25473a(List<C4747hu> list) {
        this.f9434a = list;
        return this;
    }

    /* renamed from: a */
    public void mo25474a() {
        if (this.f9434a == null) {
            throw new C4795jj("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
                mo25474a();
                return;
            }
            if (a.f9822a == 1 && b == 15) {
                C4792jg a2 = jiVar.mo25816a();
                this.f9434a = new ArrayList(a2.f9824a);
                for (int i = 0; i < a2.f9824a; i++) {
                    C4747hu huVar = new C4747hu();
                    huVar.mo25076a(jiVar);
                    this.f9434a.add(huVar);
                }
                jiVar.mo25837i();
            } else {
                C4797jl.m15328a(jiVar, b);
            }
            jiVar.mo25835g();
        }
    }

    /* renamed from: a */
    public boolean m14855a() {
        return this.f9434a != null;
    }

    /* renamed from: a */
    public boolean m14856a(C4759if ifVar) {
        if (ifVar == null) {
            return false;
        }
        boolean a = mo25474a();
        boolean a2 = ifVar.mo25474a();
        if (a || a2) {
            return a && a2 && this.f9434a.equals(ifVar.f9434a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25474a();
        jiVar.mo25823a(f9433a);
        if (this.f9434a != null) {
            jiVar.mo25820a(f9432a);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f9434a.size()));
            for (C4747hu b : this.f9434a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4759if)) {
            return compareTo((C4759if) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<C4747hu> list = this.f9434a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
