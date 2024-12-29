package p011c.p083d.p084a;

import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1004b;
import p011c.p083d.p084a.p085d0.C1014e;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p087n.C1074b;
import p011c.p083d.p084a.p085d0.p087n.C1075c;
import p011c.p083d.p084a.p085d0.p087n.C1094i;
import p011c.p083d.p084a.p085d0.p087n.C1096k;
import p011c.p083d.p084a.p085d0.p087n.C1104r;
import p011c.p083d.p084a.p085d0.p088o.C1106a;
import p163g.C10838h;
import p163g.C10839i;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: c.d.a.c */
public final class C0992c {

    /* renamed from: a */
    final C1014e f1221a;

    /* renamed from: b */
    private final C1004b f1222b;

    /* renamed from: c */
    private int f1223c;

    /* renamed from: d */
    private int f1224d;

    /* renamed from: e */
    private int f1225e;

    /* renamed from: f */
    private int f1226f;

    /* renamed from: g */
    private int f1227g;

    /* renamed from: c.d.a.c$a */
    class C0993a implements C1014e {
        C0993a() {
        }

        /* renamed from: a */
        public void mo9401a() {
            C0992c.this.m1930n();
        }

        /* renamed from: b */
        public C1074b mo9402b(C1150z zVar) {
            return C0992c.this.m1927k(zVar);
        }

        /* renamed from: c */
        public C1150z mo9403c(C1144x xVar) {
            return C0992c.this.mo9400j(xVar);
        }

        /* renamed from: d */
        public void mo9404d(C1144x xVar) {
            C0992c.this.m1929m(xVar);
        }

        /* renamed from: e */
        public void mo9405e(C1075c cVar) {
            C0992c.this.m1931o(cVar);
        }

        /* renamed from: f */
        public void mo9406f(C1150z zVar, C1150z zVar2) {
            C0992c.this.m1932p(zVar, zVar2);
        }
    }

    /* renamed from: c.d.a.c$b */
    private final class C0994b implements C1074b {

        /* renamed from: a */
        private final C1004b.C1008d f1229a;

        /* renamed from: b */
        private C4415s f1230b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f1231c;

        /* renamed from: d */
        private C4415s f1232d;

        /* renamed from: c.d.a.c$b$a */
        class C0995a extends C10838h {

            /* renamed from: b */
            final /* synthetic */ C1004b.C1008d f1234b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0995a(C4415s sVar, C0992c cVar, C1004b.C1008d dVar) {
                super(sVar);
                this.f1234b = dVar;
            }

            public void close() {
                synchronized (C0992c.this) {
                    if (!C0994b.this.f1231c) {
                        boolean unused = C0994b.this.f1231c = true;
                        C0992c.m1925h(C0992c.this);
                        super.close();
                        this.f1234b.mo9444e();
                    }
                }
            }
        }

        public C0994b(C1004b.C1008d dVar) {
            this.f1229a = dVar;
            C4415s f = dVar.mo9445f(1);
            this.f1230b = f;
            this.f1232d = new C0995a(f, C0992c.this, dVar);
        }

        /* renamed from: a */
        public void mo9407a() {
            synchronized (C0992c.this) {
                if (!this.f1231c) {
                    this.f1231c = true;
                    C0992c.m1926i(C0992c.this);
                    C1024k.m2092c(this.f1230b);
                    try {
                        this.f1229a.mo9443a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public C4415s mo9408b() {
            return this.f1232d;
        }
    }

    /* renamed from: c.d.a.c$c */
    private static class C0996c extends C0988a0 {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1004b.C1011f f1236b;

        /* renamed from: c */
        private final C4410e f1237c;

        /* renamed from: d */
        private final String f1238d;

        /* renamed from: e */
        private final String f1239e;

        /* renamed from: c.d.a.c$c$a */
        class C0997a extends C10839i {

            /* renamed from: b */
            final /* synthetic */ C1004b.C1011f f1240b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0997a(C4416t tVar, C1004b.C1011f fVar) {
                super(tVar);
                this.f1240b = fVar;
            }

            public void close() {
                this.f1240b.close();
                super.close();
            }
        }

        public C0996c(C1004b.C1011f fVar, String str, String str2) {
            this.f1236b = fVar;
            this.f1238d = str;
            this.f1239e = str2;
            this.f1237c = C10843m.m27009d(new C0997a(fVar.mo9449b(1), fVar));
        }

        /* renamed from: i */
        public long mo9388i() {
            try {
                if (this.f1239e != null) {
                    return Long.parseLong(this.f1239e);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: j */
        public C1138t mo9389j() {
            String str = this.f1238d;
            if (str != null) {
                return C1138t.m2782c(str);
            }
            return null;
        }

        /* renamed from: s */
        public C4410e mo9390s() {
            return this.f1237c;
        }
    }

    /* renamed from: c.d.a.c$d */
    private static final class C0998d {

        /* renamed from: a */
        private final String f1242a;

        /* renamed from: b */
        private final C1130q f1243b;

        /* renamed from: c */
        private final String f1244c;

        /* renamed from: d */
        private final C1143w f1245d;

        /* renamed from: e */
        private final int f1246e;

        /* renamed from: f */
        private final String f1247f;

        /* renamed from: g */
        private final C1130q f1248g;

        /* renamed from: h */
        private final C1129p f1249h;

        public C0998d(C1150z zVar) {
            this.f1242a = zVar.mo9872y().mo9845r();
            this.f1243b = C1096k.m2536p(zVar);
            this.f1244c = zVar.mo9872y().mo9840m();
            this.f1245d = zVar.mo9871x();
            this.f1246e = zVar.mo9861o();
            this.f1247f = zVar.mo9868u();
            this.f1248g = zVar.mo9865s();
            this.f1249h = zVar.mo9862p();
        }

        public C0998d(C4416t tVar) {
            try {
                C4410e d = C10843m.m27009d(tVar);
                this.f1242a = d.mo24203C0();
                this.f1244c = d.mo24203C0();
                C1130q.C1132b bVar = new C1130q.C1132b();
                int d2 = C0992c.m1928l(d);
                for (int i = 0; i < d2; i++) {
                    bVar.mo9753c(d.mo24203C0());
                }
                this.f1243b = bVar.mo9755e();
                C1104r a = C1104r.m2567a(d.mo24203C0());
                this.f1245d = a.f1632a;
                this.f1246e = a.f1633b;
                this.f1247f = a.f1634c;
                C1130q.C1132b bVar2 = new C1130q.C1132b();
                int d3 = C0992c.m1928l(d);
                for (int i2 = 0; i2 < d3; i2++) {
                    bVar2.mo9753c(d.mo24203C0());
                }
                this.f1248g = bVar2.mo9755e();
                if (m1949a()) {
                    String C0 = d.mo24203C0();
                    if (C0.length() <= 0) {
                        this.f1249h = C1129p.m2700b(d.mo24203C0(), m1950c(d), m1950c(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + C0 + "\"");
                    }
                } else {
                    this.f1249h = null;
                }
            } finally {
                tVar.close();
            }
        }

        /* renamed from: a */
        private boolean m1949a() {
            return this.f1242a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m1950c(C4410e eVar) {
            int d = C0992c.m1928l(eVar);
            if (d == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(d);
                for (int i = 0; i < d; i++) {
                    String C0 = eVar.mo24203C0();
                    C4406c cVar = new C4406c();
                    cVar.mo24243k1(C4411f.m12864d(C0));
                    arrayList.add(instance.generateCertificate(cVar.mo24229d1()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private void m1951e(C4409d dVar, List<Certificate> list) {
            try {
                dVar.mo24220Z0((long) list.size());
                dVar.mo24217U(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo24232g0(C4411f.m12869l(list.get(i).getEncoded()).mo24285a());
                    dVar.mo24217U(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo9411b(C1144x xVar, C1150z zVar) {
            return this.f1242a.equals(xVar.mo9845r()) && this.f1244c.equals(xVar.mo9840m()) && C1096k.m2537q(zVar, this.f1243b, xVar);
        }

        /* renamed from: d */
        public C1150z mo9412d(C1144x xVar, C1004b.C1011f fVar) {
            String a = this.f1248g.mo9744a("Content-Type");
            String a2 = this.f1248g.mo9744a("Content-Length");
            C1144x.C1146b bVar = new C1144x.C1146b();
            bVar.mo9856o(this.f1242a);
            bVar.mo9852k(this.f1244c, (C1147y) null);
            bVar.mo9851j(this.f1243b);
            C1144x g = bVar.mo9848g();
            C1150z.C1152b bVar2 = new C1150z.C1152b();
            bVar2.mo9885y(g);
            bVar2.mo9884x(this.f1245d);
            bVar2.mo9877q(this.f1246e);
            bVar2.mo9881u(this.f1247f);
            bVar2.mo9880t(this.f1248g);
            bVar2.mo9874l(new C0996c(fVar, a, a2));
            bVar2.mo9878r(this.f1249h);
            return bVar2.mo9875m();
        }

        /* renamed from: f */
        public void mo9413f(C1004b.C1008d dVar) {
            C4409d c = C10843m.m27008c(dVar.mo9445f(0));
            c.mo24232g0(this.f1242a);
            c.mo24217U(10);
            c.mo24232g0(this.f1244c);
            c.mo24217U(10);
            c.mo24220Z0((long) this.f1243b.mo9748g());
            c.mo24217U(10);
            int g = this.f1243b.mo9748g();
            for (int i = 0; i < g; i++) {
                c.mo24232g0(this.f1243b.mo9746d(i));
                c.mo24232g0(": ");
                c.mo24232g0(this.f1243b.mo9749h(i));
                c.mo24217U(10);
            }
            c.mo24232g0(new C1104r(this.f1245d, this.f1246e, this.f1247f).toString());
            c.mo24217U(10);
            c.mo24220Z0((long) this.f1248g.mo9748g());
            c.mo24217U(10);
            int g2 = this.f1248g.mo9748g();
            for (int i2 = 0; i2 < g2; i2++) {
                c.mo24232g0(this.f1248g.mo9746d(i2));
                c.mo24232g0(": ");
                c.mo24232g0(this.f1248g.mo9749h(i2));
                c.mo24217U(10);
            }
            if (m1949a()) {
                c.mo24217U(10);
                c.mo24232g0(this.f1249h.mo9739a());
                c.mo24217U(10);
                m1951e(c, this.f1249h.mo9741e());
                m1951e(c, this.f1249h.mo9740d());
            }
            c.close();
        }
    }

    public C0992c(File file, long j) {
        this(file, j, C1106a.f1635a);
    }

    C0992c(File file, long j, C1106a aVar) {
        this.f1221a = new C0993a();
        this.f1222b = C1004b.m1980K(aVar, file, 201105, 2, j);
    }

    /* renamed from: a */
    private void m1918a(C1004b.C1008d dVar) {
        if (dVar != null) {
            try {
                dVar.mo9443a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ int m1925h(C0992c cVar) {
        int i = cVar.f1223c;
        cVar.f1223c = i + 1;
        return i;
    }

    /* renamed from: i */
    static /* synthetic */ int m1926i(C0992c cVar) {
        int i = cVar.f1224d;
        cVar.f1224d = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public C1074b m1927k(C1150z zVar) {
        C1004b.C1008d dVar;
        String m = zVar.mo9872y().mo9840m();
        if (C1094i.m2508a(zVar.mo9872y().mo9840m())) {
            try {
                m1929m(zVar.mo9872y());
            } catch (IOException unused) {
            }
            return null;
        } else if (!m.equals("GET") || C1096k.m2527g(zVar)) {
            return null;
        } else {
            C0998d dVar2 = new C0998d(zVar);
            try {
                dVar = this.f1222b.mo9432M(m1933q(zVar.mo9872y()));
                if (dVar == null) {
                    return null;
                }
                try {
                    dVar2.mo9413f(dVar);
                    return new C0994b(dVar);
                } catch (IOException unused2) {
                    m1918a(dVar);
                    return null;
                }
            } catch (IOException unused3) {
                dVar = null;
                m1918a(dVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m1928l(C4410e eVar) {
        try {
            long B = eVar.mo24202B();
            String C0 = eVar.mo24203C0();
            if (B >= 0 && B <= 2147483647L && C0.isEmpty()) {
                return (int) B;
            }
            throw new IOException("expected an int but was \"" + B + C0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m1929m(C1144x xVar) {
        this.f1222b.mo9435b0(m1933q(xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public synchronized void m1930n() {
        this.f1226f++;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public synchronized void m1931o(C1075c cVar) {
        this.f1227g++;
        if (cVar.f1529a != null) {
            this.f1225e++;
        } else if (cVar.f1530b != null) {
            this.f1226f++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m1932p(C1150z zVar, C1150z zVar2) {
        C1004b.C1008d dVar;
        C0998d dVar2 = new C0998d(zVar2);
        try {
            dVar = ((C0996c) zVar.mo9857k()).f1236b.mo9448a();
            if (dVar != null) {
                try {
                    dVar2.mo9413f(dVar);
                    dVar.mo9444e();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            dVar = null;
            m1918a(dVar);
        }
    }

    /* renamed from: q */
    private static String m1933q(C1144x xVar) {
        return C1024k.m2103n(xVar.mo9845r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1150z mo9400j(C1144x xVar) {
        try {
            C1004b.C1011f R = this.f1222b.mo9433R(m1933q(xVar));
            if (R == null) {
                return null;
            }
            try {
                C0998d dVar = new C0998d(R.mo9449b(0));
                C1150z d = dVar.mo9412d(xVar, R);
                if (dVar.mo9411b(xVar, d)) {
                    return d;
                }
                C1024k.m2092c(d.mo9857k());
                return null;
            } catch (IOException unused) {
                C1024k.m2092c(R);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
