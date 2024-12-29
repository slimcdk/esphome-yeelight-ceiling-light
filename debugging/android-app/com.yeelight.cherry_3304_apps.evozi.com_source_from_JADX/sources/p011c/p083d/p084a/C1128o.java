package p011c.p083d.p084a;

import p163g.C4406c;

/* renamed from: c.d.a.o */
public final class C1128o {

    /* renamed from: b */
    private static final C1138t f1796b = C1138t.m2782c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final C4406c f1797a = new C4406c();

    /* renamed from: a */
    public C1128o mo9736a(String str, String str2) {
        if (this.f1797a.mo24233g1() > 0) {
            this.f1797a.mo24247n1(38);
        }
        C1133r.m2729g(this.f1797a, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        this.f1797a.mo24247n1(61);
        C1133r.m2729g(this.f1797a, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        return this;
    }

    /* renamed from: b */
    public C1128o mo9737b(String str, String str2) {
        if (this.f1797a.mo24233g1() > 0) {
            this.f1797a.mo24247n1(38);
        }
        C1133r.m2729g(this.f1797a, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        this.f1797a.mo24247n1(61);
        C1133r.m2729g(this.f1797a, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        return this;
    }

    /* renamed from: c */
    public C1147y mo9738c() {
        return C1147y.m2879d(f1796b, this.f1797a.mo24235h1());
    }
}
