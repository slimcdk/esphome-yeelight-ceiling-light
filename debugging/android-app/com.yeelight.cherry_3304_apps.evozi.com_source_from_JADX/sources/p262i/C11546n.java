package p262i;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import p011c.p083d.p084a.C1128o;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1139u;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1147y;
import p163g.C4406c;
import p163g.C4409d;

/* renamed from: i.n */
final class C11546n {

    /* renamed from: k */
    private static final char[] f22921k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f22922a;

    /* renamed from: b */
    private final C1133r f22923b;

    /* renamed from: c */
    private String f22924c;

    /* renamed from: d */
    private C1133r.C1135b f22925d;

    /* renamed from: e */
    private final C1144x.C1146b f22926e;

    /* renamed from: f */
    private C1138t f22927f;

    /* renamed from: g */
    private final boolean f22928g;

    /* renamed from: h */
    private C1139u f22929h;

    /* renamed from: i */
    private C1128o f22930i;

    /* renamed from: j */
    private C1147y f22931j;

    /* renamed from: i.n$a */
    private static class C11547a extends C1147y {

        /* renamed from: a */
        private final C1147y f22932a;

        /* renamed from: b */
        private final C1138t f22933b;

        C11547a(C1147y yVar, C1138t tVar) {
            this.f22932a = yVar;
            this.f22933b = tVar;
        }

        /* renamed from: a */
        public long mo9796a() {
            return this.f22932a.mo9796a();
        }

        /* renamed from: b */
        public C1138t mo9797b() {
            return this.f22933b;
        }

        /* renamed from: g */
        public void mo9798g(C4409d dVar) {
            this.f22932a.mo9798g(dVar);
        }
    }

    C11546n(String str, C1133r rVar, String str2, C1130q qVar, C1138t tVar, boolean z, boolean z2, boolean z3) {
        this.f22922a = str;
        this.f22923b = rVar;
        this.f22924c = str2;
        C1144x.C1146b bVar = new C1144x.C1146b();
        this.f22926e = bVar;
        this.f22927f = tVar;
        this.f22928g = z;
        if (qVar != null) {
            bVar.mo9851j(qVar);
        }
        if (z2) {
            this.f22930i = new C1128o();
        } else if (z3) {
            C1139u uVar = new C1139u();
            this.f22929h = uVar;
            uVar.mo9795f(C1139u.f1826f);
        }
    }

    /* renamed from: g */
    static String m30293g(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|/\\?#".indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                C4406c cVar = new C4406c();
                cVar.mo24271v1(str, 0, i);
                m30294h(cVar, str, i, length, z);
                return cVar.mo24228d0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: h */
    static void m30294h(C4406c cVar, String str, int i, int i2, boolean z) {
        C4406c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|/\\?#".indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                    if (cVar2 == null) {
                        cVar2 = new C4406c();
                    }
                    cVar2.mo24272w1(codePointAt);
                    while (!cVar2.mo24274x()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24247n1(37);
                        cVar.mo24247n1(f22921k[(readByte >> 4) & 15]);
                        cVar.mo24247n1(f22921k[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24272w1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36461a(String str, String str2, boolean z) {
        if (z) {
            this.f22930i.mo9737b(str, str2);
        } else {
            this.f22930i.mo9736a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36462b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            this.f22927f = C1138t.m2782c(str2);
        } else {
            this.f22926e.mo9847f(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36463c(C1130q qVar, C1147y yVar) {
        this.f22929h.mo9793d(qVar, yVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36464d(String str, String str2, boolean z) {
        String str3 = this.f22924c;
        if (str3 != null) {
            this.f22924c = str3.replace("{" + str + "}", m30293g(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36465e(String str, String str2, boolean z) {
        String str3 = this.f22924c;
        if (str3 != null) {
            this.f22925d = this.f22923b.mo9760D(str3).mo9774t();
            this.f22924c = null;
        }
        if (z) {
            this.f22925d.mo9776a(str, str2);
        } else {
            this.f22925d.mo9777b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1144x mo36466f() {
        C1133r.C1135b bVar = this.f22925d;
        C1133r c = bVar != null ? bVar.mo9778c() : this.f22923b.mo9760D(this.f22924c);
        C11547a aVar = this.f22931j;
        if (aVar == null) {
            C1128o oVar = this.f22930i;
            if (oVar != null) {
                aVar = oVar.mo9738c();
            } else {
                C1139u uVar = this.f22929h;
                if (uVar != null) {
                    aVar = uVar.mo9794e();
                } else if (this.f22928g) {
                    aVar = C1147y.m2880e((C1138t) null, new byte[0]);
                }
            }
        }
        C1138t tVar = this.f22927f;
        if (tVar != null) {
            if (aVar != null) {
                aVar = new C11547a(aVar, tVar);
            } else {
                this.f22926e.mo9847f("Content-Type", tVar.toString());
            }
        }
        C1144x.C1146b bVar2 = this.f22926e;
        bVar2.mo9855n(c);
        bVar2.mo9852k(this.f22922a, aVar);
        return bVar2.mo9848g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo36467i(C1147y yVar) {
        this.f22931j = yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo36468j(String str) {
        this.f22924c = str;
    }
}
