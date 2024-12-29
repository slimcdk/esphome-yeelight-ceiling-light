package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ib */
public class C4779ib implements C4798iu<C4779ib, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8885a = new C4809jc("", (byte) 8, 1);

    /* renamed from: a */
    private static final C4817jk f8886a = new C4817jk("XmPushActionCheckClientInfo");

    /* renamed from: b */
    private static final C4809jc f8887b = new C4809jc("", (byte) 8, 2);

    /* renamed from: a */
    public int f8888a;

    /* renamed from: a */
    private BitSet f8889a = new BitSet(2);

    /* renamed from: b */
    public int f8890b;

    /* renamed from: a */
    public int compareTo(C4779ib ibVar) {
        int a;
        int a2;
        if (!getClass().equals(ibVar.getClass())) {
            return getClass().getName().compareTo(ibVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29501a()).compareTo(Boolean.valueOf(ibVar.mo29501a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29501a() && (a2 = C4799iv.m14838a(this.f8888a, ibVar.f8888a)) != 0) {
            return a2;
        }
        int compareTo2 = Boolean.valueOf(mo29505b()).compareTo(Boolean.valueOf(ibVar.mo29505b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29505b() || (a = C4799iv.m14838a(this.f8890b, ibVar.f8890b)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4779ib mo29500a(int i) {
        this.f8888a = i;
        mo29502a(true);
        return this;
    }

    /* renamed from: a */
    public void mo29501a() {
    }

    /* renamed from: a */
    public void mo29095a(C4812jf jfVar) {
        jfVar.mo29850a();
        while (true) {
            C4809jc a = jfVar.mo29850a();
            byte b = a.f9289a;
            if (b == 0) {
                break;
            }
            short s = a.f9291a;
            if (s != 1) {
                if (s == 2 && b == 8) {
                    this.f8890b = jfVar.mo29850a();
                    mo29504b(true);
                    jfVar.mo29869g();
                }
            } else if (b == 8) {
                this.f8888a = jfVar.mo29850a();
                mo29502a(true);
                jfVar.mo29869g();
            }
            C4815ji.m14965a(jfVar, b);
            jfVar.mo29869g();
        }
        jfVar.mo29868f();
        if (!mo29501a()) {
            throw new C4813jg("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        } else if (mo29505b()) {
            mo29501a();
        } else {
            throw new C4813jg("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    /* renamed from: a */
    public void mo29502a(boolean z) {
        this.f8889a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14445a() {
        return this.f8889a.get(0);
    }

    /* renamed from: a */
    public boolean m14446a(C4779ib ibVar) {
        return ibVar != null && this.f8888a == ibVar.f8888a && this.f8890b == ibVar.f8890b;
    }

    /* renamed from: b */
    public C4779ib mo29503b(int i) {
        this.f8890b = i;
        mo29504b(true);
        return this;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29501a();
        jfVar.mo29857a(f8886a);
        jfVar.mo29854a(f8885a);
        jfVar.mo29851a(this.f8888a);
        jfVar.mo29862b();
        jfVar.mo29854a(f8887b);
        jfVar.mo29851a(this.f8890b);
        jfVar.mo29862b();
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public void mo29504b(boolean z) {
        this.f8889a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo29505b() {
        return this.f8889a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4779ib)) {
            return compareTo((C4779ib) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(" + "miscConfigVersion:" + this.f8888a + ", " + "pluginConfigVersion:" + this.f8890b + ")";
    }
}
