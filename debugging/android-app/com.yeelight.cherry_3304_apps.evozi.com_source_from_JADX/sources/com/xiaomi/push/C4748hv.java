package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.xiaomi.push.hv */
public class C4748hv implements C4777ix<C4748hv, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9199a = new C4791jf("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4799jn f9200a = new C4799jn("NormalConfig");

    /* renamed from: b */
    private static final C4791jf f9201b = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 2);

    /* renamed from: c */
    private static final C4791jf f9202c = new C4791jf("", (byte) 8, 3);

    /* renamed from: a */
    public int f9203a;

    /* renamed from: a */
    public C4745hs f9204a;

    /* renamed from: a */
    private BitSet f9205a = new BitSet(1);

    /* renamed from: a */
    public List<C4750hx> f9206a;

    /* renamed from: a */
    public int mo25305a() {
        return this.f9203a;
    }

    /* renamed from: a */
    public int compareTo(C4748hv hvVar) {
        int a;
        int a2;
        int a3;
        if (!C4748hv.class.equals(hvVar.getClass())) {
            return C4748hv.class.getName().compareTo(hvVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25305a()).compareTo(Boolean.valueOf(hvVar.mo25305a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25305a() && (a3 = C4778iy.m15229a(this.f9203a, hvVar.f9203a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo25308b()).compareTo(Boolean.valueOf(hvVar.mo25308b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25308b() && (a2 = C4778iy.m15234a((List) this.f9206a, (List) hvVar.f9206a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo25309c()).compareTo(Boolean.valueOf(hvVar.mo25309c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo25309c() || (a = C4778iy.m15231a((Comparable) this.f9204a, (Comparable) hvVar.f9204a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4745hs m14624a() {
        return this.f9204a;
    }

    /* renamed from: a */
    public void m14625a() {
        if (this.f9206a == null) {
            throw new C4795jj("Required field 'configItems' was not present! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo25076a(C4794ji jiVar) {
        jiVar.mo25816a();
        while (true) {
            C4791jf a = jiVar.mo25816a();
            byte b = a.f9820a;
            if (b == 0) {
                break;
            }
            short s = a.f9822a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 8) {
                        this.f9204a = C4745hs.m14606a(jiVar.mo25816a());
                        jiVar.mo25835g();
                    }
                } else if (b == 15) {
                    C4792jg a2 = jiVar.mo25816a();
                    this.f9206a = new ArrayList(a2.f9824a);
                    for (int i = 0; i < a2.f9824a; i++) {
                        C4750hx hxVar = new C4750hx();
                        hxVar.mo25076a(jiVar);
                        this.f9206a.add(hxVar);
                    }
                    jiVar.mo25837i();
                    jiVar.mo25835g();
                }
            } else if (b == 8) {
                this.f9203a = jiVar.mo25816a();
                mo25307a(true);
                jiVar.mo25835g();
            }
            C4797jl.m15328a(jiVar, b);
            jiVar.mo25835g();
        }
        jiVar.mo25834f();
        if (mo25305a()) {
            mo25305a();
            return;
        }
        throw new C4795jj("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo25307a(boolean z) {
        this.f9205a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14628a() {
        return this.f9205a.get(0);
    }

    /* renamed from: a */
    public boolean m14629a(C4748hv hvVar) {
        if (hvVar == null || this.f9203a != hvVar.f9203a) {
            return false;
        }
        boolean b = mo25308b();
        boolean b2 = hvVar.mo25308b();
        if ((b || b2) && (!b || !b2 || !this.f9206a.equals(hvVar.f9206a))) {
            return false;
        }
        boolean c = mo25309c();
        boolean c2 = hvVar.mo25309c();
        if (c || c2) {
            return c && c2 && this.f9204a.equals(hvVar.f9204a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25305a();
        jiVar.mo25823a(f9200a);
        jiVar.mo25820a(f9199a);
        jiVar.mo25817a(this.f9203a);
        jiVar.mo25828b();
        if (this.f9206a != null) {
            jiVar.mo25820a(f9201b);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f9206a.size()));
            for (C4750hx b : this.f9206a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        if (this.f9204a != null && mo25309c()) {
            jiVar.mo25820a(f9202c);
            jiVar.mo25817a(this.f9204a.mo25292a());
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25308b() {
        return this.f9206a != null;
    }

    /* renamed from: c */
    public boolean mo25309c() {
        return this.f9204a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4748hv)) {
            return compareTo((C4748hv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f9203a);
        sb.append(", ");
        sb.append("configItems:");
        List<C4750hx> list = this.f9206a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (mo25309c()) {
            sb.append(", ");
            sb.append("type:");
            C4745hs hsVar = this.f9204a;
            if (hsVar == null) {
                sb.append("null");
            } else {
                sb.append(hsVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
