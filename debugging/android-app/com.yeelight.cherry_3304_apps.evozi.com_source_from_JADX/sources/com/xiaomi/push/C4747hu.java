package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.hu */
public class C4747hu implements C4777ix<C4747hu, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9191a = new C4791jf("", (byte) 10, 1);

    /* renamed from: a */
    private static final C4799jn f9192a = new C4799jn("DataCollectionItem");

    /* renamed from: b */
    private static final C4791jf f9193b = new C4791jf("", (byte) 8, 2);

    /* renamed from: c */
    private static final C4791jf f9194c = new C4791jf("", (byte) 11, 3);

    /* renamed from: a */
    public long f9195a;

    /* renamed from: a */
    public C4741ho f9196a;

    /* renamed from: a */
    public String f9197a;

    /* renamed from: a */
    private BitSet f9198a = new BitSet(1);

    /* renamed from: a */
    public int compareTo(C4747hu huVar) {
        int a;
        int a2;
        int a3;
        if (!C4747hu.class.equals(huVar.getClass())) {
            return C4747hu.class.getName().compareTo(huVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25297a()).compareTo(Boolean.valueOf(huVar.mo25297a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25297a() && (a3 = C4778iy.m15230a(this.f9195a, huVar.f9195a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(mo25299b()).compareTo(Boolean.valueOf(huVar.mo25299b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25299b() && (a2 = C4778iy.m15231a((Comparable) this.f9196a, (Comparable) huVar.f9196a)) != 0) {
            return a2;
        }
        int compareTo3 = Boolean.valueOf(mo25300c()).compareTo(Boolean.valueOf(huVar.mo25300c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!mo25300c() || (a = C4778iy.m15232a(this.f9197a, huVar.f9197a)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public C4747hu mo25294a(long j) {
        this.f9195a = j;
        mo25298a(true);
        return this;
    }

    /* renamed from: a */
    public C4747hu mo25295a(C4741ho hoVar) {
        this.f9196a = hoVar;
        return this;
    }

    /* renamed from: a */
    public C4747hu mo25296a(String str) {
        this.f9197a = str;
        return this;
    }

    /* renamed from: a */
    public String mo25297a() {
        return this.f9197a;
    }

    /* renamed from: a */
    public void m14614a() {
        if (this.f9196a == null) {
            throw new C4795jj("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f9197a == null) {
            throw new C4795jj("Required field 'content' was not present! Struct: " + toString());
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
                    if (s == 3 && b == 11) {
                        this.f9197a = jiVar.mo25816a();
                        jiVar.mo25835g();
                    }
                } else if (b == 8) {
                    this.f9196a = C4741ho.m14560a(jiVar.mo25816a());
                    jiVar.mo25835g();
                }
            } else if (b == 10) {
                this.f9195a = jiVar.mo25816a();
                mo25298a(true);
                jiVar.mo25835g();
            }
            C4797jl.m15328a(jiVar, b);
            jiVar.mo25835g();
        }
        jiVar.mo25834f();
        if (mo25297a()) {
            mo25297a();
            return;
        }
        throw new C4795jj("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo25298a(boolean z) {
        this.f9198a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14617a() {
        return this.f9198a.get(0);
    }

    /* renamed from: a */
    public boolean m14618a(C4747hu huVar) {
        if (huVar == null || this.f9195a != huVar.f9195a) {
            return false;
        }
        boolean b = mo25299b();
        boolean b2 = huVar.mo25299b();
        if ((b || b2) && (!b || !b2 || !this.f9196a.equals(huVar.f9196a))) {
            return false;
        }
        boolean c = mo25300c();
        boolean c2 = huVar.mo25300c();
        if (c || c2) {
            return c && c2 && this.f9197a.equals(huVar.f9197a);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25297a();
        jiVar.mo25823a(f9192a);
        jiVar.mo25820a(f9191a);
        jiVar.mo25819a(this.f9195a);
        jiVar.mo25828b();
        if (this.f9196a != null) {
            jiVar.mo25820a(f9193b);
            jiVar.mo25817a(this.f9196a.mo25255a());
            jiVar.mo25828b();
        }
        if (this.f9197a != null) {
            jiVar.mo25820a(f9194c);
            jiVar.mo25824a(this.f9197a);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public boolean mo25299b() {
        return this.f9196a != null;
    }

    /* renamed from: c */
    public boolean mo25300c() {
        return this.f9197a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4747hu)) {
            return compareTo((C4747hu) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f9195a);
        sb.append(", ");
        sb.append("collectionType:");
        C4741ho hoVar = this.f9196a;
        if (hoVar == null) {
            sb.append("null");
        } else {
            sb.append(hoVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f9197a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }
}
