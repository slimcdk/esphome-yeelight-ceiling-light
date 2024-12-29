package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ie */
public class C4758ie implements C4777ix<C4758ie, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9426a = new C4791jf("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4799jn f9427a = new C4799jn("XmPushActionCheckClientInfo");

    /* renamed from: b */
    private static final C4791jf f9428b = new C4791jf("", (byte) 8, 2);

    /* renamed from: a */
    public int f9429a;

    /* renamed from: a */
    private BitSet f9430a = new BitSet(2);

    /* renamed from: b */
    public int f9431b;

    /* renamed from: a */
    public int compareTo(C4758ie ieVar) {
        int a;
        int a2;
        if (!C4758ie.class.equals(ieVar.getClass())) {
            return C4758ie.class.getName().compareTo(ieVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25463a()).compareTo(Boolean.valueOf(ieVar.mo25463a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25463a() && (a2 = C4778iy.m15229a(this.f9429a, ieVar.f9429a)) != 0) {
            return a2;
        }
        int compareTo2 = Boolean.valueOf(mo25467b()).compareTo(Boolean.valueOf(ieVar.mo25467b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo25467b() || (a = C4778iy.m15229a(this.f9431b, ieVar.f9431b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4758ie mo25462a(int i) {
        this.f9429a = i;
        mo25464a(true);
        return this;
    }

    /* renamed from: a */
    public void mo25463a() {
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
                if (s == 2 && b == 8) {
                    this.f9431b = jiVar.mo25816a();
                    mo25466b(true);
                    jiVar.mo25835g();
                }
            } else if (b == 8) {
                this.f9429a = jiVar.mo25816a();
                mo25464a(true);
                jiVar.mo25835g();
            }
            C4797jl.m15328a(jiVar, b);
            jiVar.mo25835g();
        }
        jiVar.mo25834f();
        if (!mo25463a()) {
            throw new C4795jj("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        } else if (mo25467b()) {
            mo25463a();
        } else {
            throw new C4795jj("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo25464a(boolean z) {
        this.f9430a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14845a() {
        return this.f9430a.get(0);
    }

    /* renamed from: a */
    public boolean m14846a(C4758ie ieVar) {
        return ieVar != null && this.f9429a == ieVar.f9429a && this.f9431b == ieVar.f9431b;
    }

    /* renamed from: b */
    public C4758ie mo25465b(int i) {
        this.f9431b = i;
        mo25466b(true);
        return this;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25463a();
        jiVar.mo25823a(f9427a);
        jiVar.mo25820a(f9426a);
        jiVar.mo25817a(this.f9429a);
        jiVar.mo25828b();
        jiVar.mo25820a(f9428b);
        jiVar.mo25817a(this.f9431b);
        jiVar.mo25828b();
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25466b(boolean z) {
        this.f9430a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25467b() {
        return this.f9430a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4758ie)) {
            return compareTo((C4758ie) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(" + "miscConfigVersion:" + this.f9429a + ", " + "pluginConfigVersion:" + this.f9431b + ")";
    }
}
