package com.xiaomi.push;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.fj */
public class C4671fj implements C4777ix<C4671fj, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f8713a = new C4791jf("", (byte) 11, 1);

    /* renamed from: a */
    private static final C4799jn f8714a = new C4799jn("StatsEvents");

    /* renamed from: b */
    private static final C4791jf f8715b = new C4791jf("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4791jf f8716c = new C4791jf("", ParameterInitDefType.CubemapSamplerInit, 3);

    /* renamed from: a */
    public String f8717a;

    /* renamed from: a */
    public List<C4670fi> f8718a;

    /* renamed from: b */
    public String f8719b;

    public C4671fj() {
    }

    public C4671fj(String str, List<C4670fi> list) {
        this();
        this.f8717a = str;
        this.f8718a = list;
    }

    /* renamed from: a */
    public int compareTo(C4671fj fjVar) {
        int a;
        int a2;
        int a3;
        if (!C4671fj.class.equals(fjVar.getClass())) {
            return C4671fj.class.getName().compareTo(fjVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25105a()).compareTo(Boolean.valueOf(fjVar.mo25105a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25105a() && (a3 = C4778iy.m15232a(this.f8717a, fjVar.f8717a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo25106b()).compareTo(Boolean.valueOf(fjVar.mo25106b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25106b() && (a2 = C4778iy.m15232a(this.f8719b, fjVar.f8719b)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo25107c()).compareTo(Boolean.valueOf(fjVar.mo25107c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo25107c() || (a = C4778iy.m15234a((List) this.f8718a, (List) fjVar.f8718a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4671fj mo25104a(String str) {
        this.f8719b = str;
        return this;
    }

    /* renamed from: a */
    public void mo25105a() {
        if (this.f8717a == null) {
            throw new C4795jj("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f8718a == null) {
            throw new C4795jj("Required field 'events' was not present! Struct: " + toString());
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
                mo25105a();
                return;
            }
            short s = a.f9822a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 15) {
                        C4792jg a2 = jiVar.mo25816a();
                        this.f8718a = new ArrayList(a2.f9824a);
                        for (int i = 0; i < a2.f9824a; i++) {
                            C4670fi fiVar = new C4670fi();
                            fiVar.mo25076a(jiVar);
                            this.f8718a.add(fiVar);
                        }
                        jiVar.mo25837i();
                        jiVar.mo25835g();
                    }
                } else if (b == 11) {
                    this.f8719b = jiVar.mo25816a();
                    jiVar.mo25835g();
                }
            } else if (b == 11) {
                this.f8717a = jiVar.mo25816a();
                jiVar.mo25835g();
            }
            C4797jl.m15328a(jiVar, b);
            jiVar.mo25835g();
        }
    }

    /* renamed from: a */
    public boolean m14217a() {
        return this.f8717a != null;
    }

    /* renamed from: a */
    public boolean m14218a(C4671fj fjVar) {
        if (fjVar == null) {
            return false;
        }
        boolean a = mo25105a();
        boolean a2 = fjVar.mo25105a();
        if ((a || a2) && (!a || !a2 || !this.f8717a.equals(fjVar.f8717a))) {
            return false;
        }
        boolean b = mo25106b();
        boolean b2 = fjVar.mo25106b();
        if ((b || b2) && (!b || !b2 || !this.f8719b.equals(fjVar.f8719b))) {
            return false;
        }
        boolean c = mo25107c();
        boolean c2 = fjVar.mo25107c();
        if (c || c2) {
            return c && c2 && this.f8718a.equals(fjVar.f8718a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25105a();
        jiVar.mo25823a(f8714a);
        if (this.f8717a != null) {
            jiVar.mo25820a(f8713a);
            jiVar.mo25824a(this.f8717a);
            jiVar.mo25828b();
        }
        if (this.f8719b != null && mo25106b()) {
            jiVar.mo25820a(f8715b);
            jiVar.mo25824a(this.f8719b);
            jiVar.mo25828b();
        }
        if (this.f8718a != null) {
            jiVar.mo25820a(f8716c);
            jiVar.mo25821a(new C4792jg((byte) 12, this.f8718a.size()));
            for (C4670fi b : this.f8718a) {
                b.mo25080b(jiVar);
            }
            jiVar.mo25833e();
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25106b() {
        return this.f8719b != null;
    }

    /* renamed from: c */
    public boolean mo25107c() {
        return this.f8718a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4671fj)) {
            return compareTo((C4671fj) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f8717a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo25106b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f8719b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C4670fi> list = this.f8718a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
