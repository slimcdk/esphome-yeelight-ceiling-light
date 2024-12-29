package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hr */
public class C4768hr implements C4798iu<C4768hr, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4809jc f8642a = new C4809jc("", (byte) 10, 1);

    /* renamed from: a */
    private static final C4817jk f8643a = new C4817jk("DataCollectionItem");

    /* renamed from: b */
    private static final C4809jc f8644b = new C4809jc("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4809jc f8645c = new C4809jc("", (byte) 11, 3);

    /* renamed from: a */
    public long f8646a;

    /* renamed from: a */
    public C4762hl f8647a;

    /* renamed from: a */
    public String f8648a;

    /* renamed from: a */
    private BitSet f8649a = new BitSet(1);

    /* renamed from: a */
    public int compareTo(C4768hr hrVar) {
        int a;
        int a2;
        int a3;
        if (!getClass().equals(hrVar.getClass())) {
            return getClass().getName().compareTo(hrVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29328a()).compareTo(Boolean.valueOf(hrVar.mo29328a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo29328a() && (a3 = C4799iv.m14839a(this.f8646a, hrVar.f8646a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo29330b()).compareTo(Boolean.valueOf(hrVar.mo29330b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo29330b() && (a2 = C4799iv.m14840a((Comparable) this.f8647a, (Comparable) hrVar.f8647a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo29331c()).compareTo(Boolean.valueOf(hrVar.mo29331c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo29331c() || (a = C4799iv.m14841a(this.f8648a, hrVar.f8648a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4768hr mo29325a(long j) {
        this.f8646a = j;
        mo29329a(true);
        return this;
    }

    /* renamed from: a */
    public C4768hr mo29326a(C4762hl hlVar) {
        this.f8647a = hlVar;
        return this;
    }

    /* renamed from: a */
    public C4768hr mo29327a(String str) {
        this.f8648a = str;
        return this;
    }

    /* renamed from: a */
    public String mo29328a() {
        return this.f8648a;
    }

    /* renamed from: a */
    public void m14241a() {
        if (this.f8647a == null) {
            throw new C4813jg("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f8648a == null) {
            throw new C4813jg("Required field 'content' was not present! Struct: " + toString());
        }
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
                if (s != 2) {
                    if (s == 3 && b == 11) {
                        this.f8648a = jfVar.mo29850a();
                        jfVar.mo29869g();
                    }
                } else if (b == 8) {
                    this.f8647a = C4762hl.m14184a(jfVar.mo29850a());
                    jfVar.mo29869g();
                }
            } else if (b == 10) {
                this.f8646a = jfVar.mo29850a();
                mo29329a(true);
                jfVar.mo29869g();
            }
            C4815ji.m14965a(jfVar, b);
            jfVar.mo29869g();
        }
        jfVar.mo29868f();
        if (mo29328a()) {
            mo29328a();
            return;
        }
        throw new C4813jg("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo29329a(boolean z) {
        this.f8649a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14244a() {
        return this.f8649a.get(0);
    }

    /* renamed from: a */
    public boolean m14245a(C4768hr hrVar) {
        if (hrVar == null || this.f8646a != hrVar.f8646a) {
            return false;
        }
        boolean b = mo29330b();
        boolean b2 = hrVar.mo29330b();
        if ((b || b2) && (!b || !b2 || !this.f8647a.equals(hrVar.f8647a))) {
            return false;
        }
        boolean c = mo29331c();
        boolean c2 = hrVar.mo29331c();
        if (c || c2) {
            return c && c2 && this.f8648a.equals(hrVar.f8648a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo29099b(C4812jf jfVar) {
        mo29328a();
        jfVar.mo29857a(f8643a);
        jfVar.mo29854a(f8642a);
        jfVar.mo29853a(this.f8646a);
        jfVar.mo29862b();
        if (this.f8647a != null) {
            jfVar.mo29854a(f8644b);
            jfVar.mo29851a(this.f8647a.mo29284a());
            jfVar.mo29862b();
        }
        if (this.f8648a != null) {
            jfVar.mo29854a(f8645c);
            jfVar.mo29858a(this.f8648a);
            jfVar.mo29862b();
        }
        jfVar.mo29864c();
        jfVar.mo29850a();
    }

    /* renamed from: b */
    public boolean mo29330b() {
        return this.f8647a != null;
    }

    /* renamed from: c */
    public boolean mo29331c() {
        return this.f8648a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4768hr)) {
            return compareTo((C4768hr) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f8646a);
        sb.append(", ");
        sb.append("collectionType:");
        C4762hl hlVar = this.f8647a;
        if (hlVar == null) {
            sb.append("null");
        } else {
            sb.append(hlVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f8648a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }
}
