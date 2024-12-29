package p156f;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4388s;
import p156f.p157g0.C4345c;
import p156f.p157g0.p158e.C10754b;
import p156f.p157g0.p158e.C10756f;
import p156f.p157g0.p158e.C4348c;
import p156f.p157g0.p158e.C4350d;
import p156f.p157g0.p160g.C10771e;
import p156f.p157g0.p160g.C10772f;
import p156f.p157g0.p160g.C10776k;
import p156f.p157g0.p162k.C4373f;
import p156f.p157g0.p208j.C10818a;
import p163g.C10838h;
import p163g.C10839i;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: f.c */
public final class C4325c implements Closeable, Flushable {

    /* renamed from: a */
    final C10756f f7545a;

    /* renamed from: b */
    final C4350d f7546b;

    /* renamed from: c */
    int f7547c;

    /* renamed from: d */
    int f7548d;

    /* renamed from: e */
    private int f7549e;

    /* renamed from: f */
    private int f7550f;

    /* renamed from: g */
    private int f7551g;

    /* renamed from: f.c$c */
    private static class C4326c extends C4336d0 {

        /* renamed from: a */
        final C4350d.C4351e f7552a;

        /* renamed from: b */
        private final C4410e f7553b;
        @Nullable

        /* renamed from: c */
        private final String f7554c;
        @Nullable

        /* renamed from: d */
        private final String f7555d;

        /* renamed from: f.c$c$a */
        class C4327a extends C10839i {

            /* renamed from: b */
            final /* synthetic */ C4350d.C4351e f7556b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4327a(C4416t tVar, C4350d.C4351e eVar) {
                super(tVar);
                this.f7556b = eVar;
            }

            public void close() {
                this.f7556b.close();
                super.close();
            }
        }

        C4326c(C4350d.C4351e eVar, String str, String str2) {
            this.f7552a = eVar;
            this.f7554c = str;
            this.f7555d = str2;
            this.f7553b = C10843m.m27009d(new C4327a(eVar.mo23955b(1), eVar));
        }

        /* renamed from: h */
        public long mo23838h() {
            try {
                if (this.f7555d != null) {
                    return Long.parseLong(this.f7555d);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: i */
        public C4392v mo23839i() {
            String str = this.f7554c;
            if (str != null) {
                return C4392v.m12671d(str);
            }
            return null;
        }

        /* renamed from: o */
        public C4410e mo23840o() {
            return this.f7553b;
        }
    }

    /* renamed from: f.c$d */
    private static final class C4328d {

        /* renamed from: k */
        private static final String f7558k = (C4373f.m12509j().mo24020k() + "-Sent-Millis");

        /* renamed from: l */
        private static final String f7559l = (C4373f.m12509j().mo24020k() + "-Received-Millis");

        /* renamed from: a */
        private final String f7560a;

        /* renamed from: b */
        private final C4388s f7561b;

        /* renamed from: c */
        private final String f7562c;

        /* renamed from: d */
        private final C10835y f7563d;

        /* renamed from: e */
        private final int f7564e;

        /* renamed from: f */
        private final String f7565f;

        /* renamed from: g */
        private final C4388s f7566g;
        @Nullable

        /* renamed from: h */
        private final C4387r f7567h;

        /* renamed from: i */
        private final long f7568i;

        /* renamed from: j */
        private final long f7569j;

        C4328d(C4332c0 c0Var) {
            this.f7560a = c0Var.mo23855I().mo23815i().toString();
            this.f7561b = C10771e.m26698n(c0Var);
            this.f7562c = c0Var.mo23855I().mo23813g();
            this.f7563d = c0Var.mo23853D();
            this.f7564e = c0Var.mo23860g();
            this.f7565f = c0Var.mo23866s();
            this.f7566g = c0Var.mo23864n();
            this.f7567h = c0Var.mo23861h();
            this.f7568i = c0Var.mo23856J();
            this.f7569j = c0Var.mo23854F();
        }

        C4328d(C4416t tVar) {
            try {
                C4410e d = C10843m.m27009d(tVar);
                this.f7560a = d.mo24203C0();
                this.f7562c = d.mo24203C0();
                C4388s.C4389a aVar = new C4388s.C4389a();
                int i = C4325c.m12233i(d);
                for (int i2 = 0; i2 < i; i2++) {
                    aVar.mo24095b(d.mo24203C0());
                }
                this.f7561b = aVar.mo24097d();
                C10776k a = C10776k.m26729a(d.mo24203C0());
                this.f7563d = a.f20691a;
                this.f7564e = a.f20692b;
                this.f7565f = a.f20693c;
                C4388s.C4389a aVar2 = new C4388s.C4389a();
                int i3 = C4325c.m12233i(d);
                for (int i4 = 0; i4 < i3; i4++) {
                    aVar2.mo24095b(d.mo24203C0());
                }
                String e = aVar2.mo24098e(f7558k);
                String e2 = aVar2.mo24098e(f7559l);
                aVar2.mo24099f(f7558k);
                aVar2.mo24099f(f7559l);
                long j = 0;
                this.f7568i = e != null ? Long.parseLong(e) : 0;
                this.f7569j = e2 != null ? Long.parseLong(e2) : j;
                this.f7566g = aVar2.mo24097d();
                if (m12243a()) {
                    String C0 = d.mo24203C0();
                    if (C0.length() <= 0) {
                        this.f7567h = C4387r.m12594c(!d.mo24274x() ? C10749f0.m26610a(d.mo24203C0()) : C10749f0.SSL_3_0, C10827h.m26955a(d.mo24203C0()), m12244c(d), m12244c(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + C0 + "\"");
                    }
                } else {
                    this.f7567h = null;
                }
            } finally {
                tVar.close();
            }
        }

        /* renamed from: a */
        private boolean m12243a() {
            return this.f7560a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m12244c(C4410e eVar) {
            int i = C4325c.m12233i(eVar);
            if (i == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
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
        private void m12245e(C4409d dVar, List<Certificate> list) {
            try {
                dVar.mo24220Z0((long) list.size()).mo24217U(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo24232g0(C4411f.m12869l(list.get(i).getEncoded()).mo24285a()).mo24217U(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo23841b(C4318a0 a0Var, C4332c0 c0Var) {
            return this.f7560a.equals(a0Var.mo23815i().toString()) && this.f7562c.equals(a0Var.mo23813g()) && C10771e.m26699o(c0Var, this.f7561b, a0Var);
        }

        /* renamed from: d */
        public C4332c0 mo23842d(C4350d.C4351e eVar) {
            String c = this.f7566g.mo24085c("Content-Type");
            String c2 = this.f7566g.mo24085c("Content-Length");
            C4318a0.C4319a aVar = new C4318a0.C4319a();
            aVar.mo23824h(this.f7560a);
            aVar.mo23822f(this.f7562c, (C4322b0) null);
            aVar.mo23821e(this.f7561b);
            C4318a0 b = aVar.mo23818b();
            C4332c0.C4333a aVar2 = new C4332c0.C4333a();
            aVar2.mo23883p(b);
            aVar2.mo23881n(this.f7563d);
            aVar2.mo23874g(this.f7564e);
            aVar2.mo23878k(this.f7565f);
            aVar2.mo23877j(this.f7566g);
            aVar2.mo23871b(new C4326c(eVar, c, c2));
            aVar2.mo23875h(this.f7567h);
            aVar2.mo23884q(this.f7568i);
            aVar2.mo23882o(this.f7569j);
            return aVar2.mo23872c();
        }

        /* renamed from: f */
        public void mo23843f(C4350d.C4354c cVar) {
            C4409d c = C10843m.m27008c(cVar.mo23962d(0));
            c.mo24232g0(this.f7560a).mo24217U(10);
            c.mo24232g0(this.f7562c).mo24217U(10);
            c.mo24220Z0((long) this.f7561b.mo24089h()).mo24217U(10);
            int h = this.f7561b.mo24089h();
            for (int i = 0; i < h; i++) {
                c.mo24232g0(this.f7561b.mo24086e(i)).mo24232g0(": ").mo24232g0(this.f7561b.mo24091i(i)).mo24217U(10);
            }
            c.mo24232g0(new C10776k(this.f7563d, this.f7564e, this.f7565f).toString()).mo24217U(10);
            c.mo24220Z0((long) (this.f7566g.mo24089h() + 2)).mo24217U(10);
            int h2 = this.f7566g.mo24089h();
            for (int i2 = 0; i2 < h2; i2++) {
                c.mo24232g0(this.f7566g.mo24086e(i2)).mo24232g0(": ").mo24232g0(this.f7566g.mo24091i(i2)).mo24217U(10);
            }
            c.mo24232g0(f7558k).mo24232g0(": ").mo24220Z0(this.f7568i).mo24217U(10);
            c.mo24232g0(f7559l).mo24232g0(": ").mo24220Z0(this.f7569j).mo24217U(10);
            if (m12243a()) {
                c.mo24217U(10);
                c.mo24232g0(this.f7567h.mo24079a().mo34153d()).mo24217U(10);
                m12245e(c, this.f7567h.mo24081e());
                m12245e(c, this.f7567h.mo24080d());
                c.mo24232g0(this.f7567h.mo24083f().mo33985c()).mo24217U(10);
            }
            c.close();
        }
    }

    /* renamed from: f.c$a */
    class C4329a implements C10756f {
        C4329a() {
        }

        /* renamed from: a */
        public void mo23844a() {
            C4325c.this.mo23835n();
        }

        /* renamed from: b */
        public void mo23845b(C4348c cVar) {
            C4325c.this.mo23836o(cVar);
        }

        /* renamed from: c */
        public void mo23846c(C4318a0 a0Var) {
            C4325c.this.mo23834j(a0Var);
        }

        /* renamed from: d */
        public C10754b mo23847d(C4332c0 c0Var) {
            return C4325c.this.mo23833h(c0Var);
        }

        /* renamed from: e */
        public C4332c0 mo23848e(C4318a0 a0Var) {
            return C4325c.this.mo23830b(a0Var);
        }

        /* renamed from: f */
        public void mo23849f(C4332c0 c0Var, C4332c0 c0Var2) {
            C4325c.this.mo23837s(c0Var, c0Var2);
        }
    }

    /* renamed from: f.c$b */
    private final class C4330b implements C10754b {

        /* renamed from: a */
        private final C4350d.C4354c f7571a;

        /* renamed from: b */
        private C4415s f7572b;

        /* renamed from: c */
        private C4415s f7573c;

        /* renamed from: d */
        boolean f7574d;

        /* renamed from: f.c$b$a */
        class C4331a extends C10838h {

            /* renamed from: b */
            final /* synthetic */ C4325c f7576b;

            /* renamed from: c */
            final /* synthetic */ C4350d.C4354c f7577c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4331a(C4415s sVar, C4325c cVar, C4350d.C4354c cVar2) {
                super(sVar);
                this.f7576b = cVar;
                this.f7577c = cVar2;
            }

            public void close() {
                synchronized (C4325c.this) {
                    if (!C4330b.this.f7574d) {
                        C4330b.this.f7574d = true;
                        C4325c.this.f7547c++;
                        super.close();
                        this.f7577c.mo23960b();
                    }
                }
            }
        }

        C4330b(C4350d.C4354c cVar) {
            this.f7571a = cVar;
            C4415s d = cVar.mo23962d(1);
            this.f7572b = d;
            this.f7573c = new C4331a(d, C4325c.this, cVar);
        }

        /* renamed from: a */
        public void mo23850a() {
            synchronized (C4325c.this) {
                if (!this.f7574d) {
                    this.f7574d = true;
                    C4325c.this.f7548d++;
                    C4345c.m12360g(this.f7572b);
                    try {
                        this.f7571a.mo23959a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public C4415s mo23851b() {
            return this.f7573c;
        }
    }

    public C4325c(File file, long j) {
        this(file, j, C10818a.f20862a);
    }

    C4325c(File file, long j, C10818a aVar) {
        this.f7545a = new C4329a();
        this.f7546b = C4350d.m12392g(aVar, file, 201105, 2, j);
    }

    /* renamed from: a */
    private void m12231a(@Nullable C4350d.C4354c cVar) {
        if (cVar != null) {
            try {
                cVar.mo23959a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g */
    public static String m12232g(C4390t tVar) {
        return C4411f.m12868h(tVar.toString()).mo24292k().mo24291j();
    }

    /* renamed from: i */
    static int m12233i(C4410e eVar) {
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

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public C4332c0 mo23830b(C4318a0 a0Var) {
        try {
            C4350d.C4351e n = this.f7546b.mo23951n(m12232g(a0Var.mo23815i()));
            if (n == null) {
                return null;
            }
            try {
                C4328d dVar = new C4328d(n.mo23955b(0));
                C4332c0 d = dVar.mo23842d(n);
                if (dVar.mo23841b(a0Var, d)) {
                    return d;
                }
                C4345c.m12360g(d.mo23857a());
                return null;
            } catch (IOException unused) {
                C4345c.m12360g(n);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public void close() {
        this.f7546b.close();
    }

    public void flush() {
        this.f7546b.flush();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: h */
    public C10754b mo23833h(C4332c0 c0Var) {
        C4350d.C4354c cVar;
        String g = c0Var.mo23855I().mo23813g();
        if (C10772f.m26700a(c0Var.mo23855I().mo23813g())) {
            try {
                mo23834j(c0Var.mo23855I());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g.equals("GET") || C10771e.m26689e(c0Var)) {
            return null;
        } else {
            C4328d dVar = new C4328d(c0Var);
            try {
                cVar = this.f7546b.mo23948i(m12232g(c0Var.mo23855I().mo23815i()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.mo23843f(cVar);
                    return new C4330b(cVar);
                } catch (IOException unused2) {
                    m12231a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                m12231a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo23834j(C4318a0 a0Var) {
        this.f7546b.mo23941I(m12232g(a0Var.mo23815i()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized void mo23835n() {
        this.f7550f++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void mo23836o(C4348c cVar) {
        this.f7551g++;
        if (cVar.f7659a != null) {
            this.f7549e++;
        } else if (cVar.f7660b != null) {
            this.f7550f++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23837s(C4332c0 c0Var, C4332c0 c0Var2) {
        C4350d.C4354c cVar;
        C4328d dVar = new C4328d(c0Var2);
        try {
            cVar = ((C4326c) c0Var.mo23857a()).f7552a.mo23954a();
            if (cVar != null) {
                try {
                    dVar.mo23843f(cVar);
                    cVar.mo23960b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            m12231a(cVar);
        }
    }
}
