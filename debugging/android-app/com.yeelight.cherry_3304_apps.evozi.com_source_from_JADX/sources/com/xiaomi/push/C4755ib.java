package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.ib */
public class C4755ib implements C4777ix<C4755ib, Object>, Serializable, Cloneable {

    /* renamed from: a */
    private static final C4791jf f9348a = new C4791jf("", (byte) 10, 1);

    /* renamed from: a */
    private static final C4799jn f9349a = new C4799jn("Target");

    /* renamed from: b */
    private static final C4791jf f9350b = new C4791jf("", (byte) 11, 2);

    /* renamed from: c */
    private static final C4791jf f9351c = new C4791jf("", (byte) 11, 3);

    /* renamed from: d */
    private static final C4791jf f9352d = new C4791jf("", (byte) 11, 4);

    /* renamed from: e */
    private static final C4791jf f9353e = new C4791jf("", (byte) 2, 5);

    /* renamed from: f */
    private static final C4791jf f9354f = new C4791jf("", (byte) 11, 7);

    /* renamed from: a */
    public long f9355a = 5;

    /* renamed from: a */
    public String f9356a;

    /* renamed from: a */
    private BitSet f9357a = new BitSet(2);

    /* renamed from: a */
    public boolean f9358a = false;

    /* renamed from: b */
    public String f9359b = "xiaomi.com";

    /* renamed from: c */
    public String f9360c = "";

    /* renamed from: d */
    public String f9361d;

    /* renamed from: a */
    public int compareTo(C4755ib ibVar) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        if (!C4755ib.class.equals(ibVar.getClass())) {
            return C4755ib.class.getName().compareTo(ibVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25397a()).compareTo(Boolean.valueOf(ibVar.mo25397a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (mo25397a() && (a6 = C4778iy.m15230a(this.f9355a, ibVar.f9355a)) != 0) {
            return a6;
        }
        int compareTo2 = Boolean.valueOf(mo25400b()).compareTo(Boolean.valueOf(ibVar.mo25400b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (mo25400b() && (a5 = C4778iy.m15232a(this.f9356a, ibVar.f9356a)) != 0) {
            return a5;
        }
        int compareTo3 = Boolean.valueOf(mo25401c()).compareTo(Boolean.valueOf(ibVar.mo25401c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (mo25401c() && (a4 = C4778iy.m15232a(this.f9359b, ibVar.f9359b)) != 0) {
            return a4;
        }
        int compareTo4 = Boolean.valueOf(mo25403d()).compareTo(Boolean.valueOf(ibVar.mo25403d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (mo25403d() && (a3 = C4778iy.m15232a(this.f9360c, ibVar.f9360c)) != 0) {
            return a3;
        }
        int compareTo5 = Boolean.valueOf(mo25404e()).compareTo(Boolean.valueOf(ibVar.mo25404e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (mo25404e() && (a2 = C4778iy.m15238a(this.f9358a, ibVar.f9358a)) != 0) {
            return a2;
        }
        int compareTo6 = Boolean.valueOf(mo25406f()).compareTo(Boolean.valueOf(ibVar.mo25406f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!mo25406f() || (a = C4778iy.m15232a(this.f9361d, ibVar.f9361d)) == 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public void mo25397a() {
        if (this.f9356a == null) {
            throw new C4795jj("Required field 'userId' was not present! Struct: " + toString());
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
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s == 7 && b == 11) {
                                    this.f9361d = jiVar.mo25816a();
                                    jiVar.mo25835g();
                                }
                            } else if (b == 2) {
                                this.f9358a = jiVar.mo25816a();
                                mo25399b(true);
                                jiVar.mo25835g();
                            }
                        } else if (b == 11) {
                            this.f9360c = jiVar.mo25816a();
                            jiVar.mo25835g();
                        }
                    } else if (b == 11) {
                        this.f9359b = jiVar.mo25816a();
                        jiVar.mo25835g();
                    }
                } else if (b == 11) {
                    this.f9356a = jiVar.mo25816a();
                    jiVar.mo25835g();
                }
            } else if (b == 10) {
                this.f9355a = jiVar.mo25816a();
                mo25398a(true);
                jiVar.mo25835g();
            }
            C4797jl.m15328a(jiVar, b);
            jiVar.mo25835g();
        }
        jiVar.mo25834f();
        if (mo25397a()) {
            mo25397a();
            return;
        }
        throw new C4795jj("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    /* renamed from: a */
    public void mo25398a(boolean z) {
        this.f9357a.set(0, z);
    }

    /* renamed from: a */
    public boolean m14777a() {
        return this.f9357a.get(0);
    }

    /* renamed from: a */
    public boolean m14778a(C4755ib ibVar) {
        if (ibVar == null || this.f9355a != ibVar.f9355a) {
            return false;
        }
        boolean b = mo25400b();
        boolean b2 = ibVar.mo25400b();
        if ((b || b2) && (!b || !b2 || !this.f9356a.equals(ibVar.f9356a))) {
            return false;
        }
        boolean c = mo25401c();
        boolean c2 = ibVar.mo25401c();
        if ((c || c2) && (!c || !c2 || !this.f9359b.equals(ibVar.f9359b))) {
            return false;
        }
        boolean d = mo25403d();
        boolean d2 = ibVar.mo25403d();
        if ((d || d2) && (!d || !d2 || !this.f9360c.equals(ibVar.f9360c))) {
            return false;
        }
        boolean e = mo25404e();
        boolean e2 = ibVar.mo25404e();
        if ((e || e2) && (!e || !e2 || this.f9358a != ibVar.f9358a)) {
            return false;
        }
        boolean f = mo25406f();
        boolean f2 = ibVar.mo25406f();
        if (f || f2) {
            return f && f2 && this.f9361d.equals(ibVar.f9361d);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25080b(C4794ji jiVar) {
        mo25397a();
        jiVar.mo25823a(f9349a);
        jiVar.mo25820a(f9348a);
        jiVar.mo25819a(this.f9355a);
        jiVar.mo25828b();
        if (this.f9356a != null) {
            jiVar.mo25820a(f9350b);
            jiVar.mo25824a(this.f9356a);
            jiVar.mo25828b();
        }
        if (this.f9359b != null && mo25401c()) {
            jiVar.mo25820a(f9351c);
            jiVar.mo25824a(this.f9359b);
            jiVar.mo25828b();
        }
        if (this.f9360c != null && mo25403d()) {
            jiVar.mo25820a(f9352d);
            jiVar.mo25824a(this.f9360c);
            jiVar.mo25828b();
        }
        if (mo25404e()) {
            jiVar.mo25820a(f9353e);
            jiVar.mo25827a(this.f9358a);
            jiVar.mo25828b();
        }
        if (this.f9361d != null && mo25406f()) {
            jiVar.mo25820a(f9354f);
            jiVar.mo25824a(this.f9361d);
            jiVar.mo25828b();
        }
        jiVar.mo25830c();
        jiVar.mo25816a();
    }

    /* renamed from: b */
    public void mo25399b(boolean z) {
        this.f9357a.set(1, z);
    }

    /* renamed from: b */
    public boolean mo25400b() {
        return this.f9356a != null;
    }

    /* renamed from: c */
    public boolean mo25401c() {
        return this.f9359b != null;
    }

    /* renamed from: d */
    public boolean mo25403d() {
        return this.f9360c != null;
    }

    /* renamed from: e */
    public boolean mo25404e() {
        return this.f9357a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4755ib)) {
            return compareTo((C4755ib) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo25406f() {
        return this.f9361d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f9355a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f9356a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (mo25401c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f9359b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (mo25403d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f9360c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (mo25404e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f9358a);
        }
        if (mo25406f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f9361d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
