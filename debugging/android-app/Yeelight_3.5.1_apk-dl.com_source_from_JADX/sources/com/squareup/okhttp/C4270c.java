package com.squareup.okhttp;

import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9840g;
import okio.C9841h;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import p123a3.C3933b;
import p123a3.C3934c;
import p123a3.C3953i;
import p123a3.C3955k;
import p123a3.C3961p;
import p128b3.C3985a;
import p231y2.C12013b;
import p231y2.C12023e;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.c */
public final class C4270c {

    /* renamed from: a */
    final C12023e f6890a;

    /* renamed from: b */
    private final C12013b f6891b;

    /* renamed from: c */
    private int f6892c;

    /* renamed from: d */
    private int f6893d;

    /* renamed from: e */
    private int f6894e;

    /* renamed from: f */
    private int f6895f;

    /* renamed from: g */
    private int f6896g;

    /* renamed from: com.squareup.okhttp.c$a */
    class C4271a implements C12023e {
        C4271a() {
        }

        /* renamed from: a */
        public void mo27826a() {
            C4270c.this.m11848n();
        }

        /* renamed from: b */
        public C3933b mo27827b(C4318x xVar) {
            return C4270c.this.m11845k(xVar);
        }

        /* renamed from: c */
        public void mo27828c(C3934c cVar) {
            C4270c.this.m11849o(cVar);
        }

        /* renamed from: d */
        public C4318x mo27829d(C4312v vVar) {
            return C4270c.this.mo27825j(vVar);
        }

        /* renamed from: e */
        public void mo27830e(C4312v vVar) {
            C4270c.this.m11847m(vVar);
        }

        /* renamed from: f */
        public void mo27831f(C4318x xVar, C4318x xVar2) {
            C4270c.this.m11850p(xVar, xVar2);
        }
    }

    /* renamed from: com.squareup.okhttp.c$b */
    private final class C4272b implements C3933b {

        /* renamed from: a */
        private final C12013b.C12017d f6898a;

        /* renamed from: b */
        private C9852q f6899b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f6900c;

        /* renamed from: d */
        private C9852q f6901d;

        /* renamed from: com.squareup.okhttp.c$b$a */
        class C4273a extends C9840g {

            /* renamed from: b */
            final /* synthetic */ C12013b.C12017d f6903b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4273a(C9852q qVar, C4270c cVar, C12013b.C12017d dVar) {
                super(qVar);
                this.f6903b = dVar;
            }

            public void close() {
                synchronized (C4270c.this) {
                    if (!C4272b.this.f6900c) {
                        boolean unused = C4272b.this.f6900c = true;
                        C4270c.m11843h(C4270c.this);
                        super.close();
                        this.f6903b.mo42635e();
                    }
                }
            }
        }

        public C4272b(C12013b.C12017d dVar) {
            this.f6898a = dVar;
            C9852q f = dVar.mo42636f(1);
            this.f6899b = f;
            this.f6901d = new C4273a(f, C4270c.this, dVar);
        }

        /* renamed from: a */
        public void mo26430a() {
            synchronized (C4270c.this) {
                if (!this.f6900c) {
                    this.f6900c = true;
                    C4270c.m11844i(C4270c.this);
                    C12033k.m31043c(this.f6899b);
                    try {
                        this.f6898a.mo42634a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public C9852q mo26431b() {
            return this.f6901d;
        }
    }

    /* renamed from: com.squareup.okhttp.c$c */
    private static class C4274c extends C4321y {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C12013b.C12020f f6905b;

        /* renamed from: c */
        private final C9838e f6906c;

        /* renamed from: d */
        private final String f6907d;

        /* renamed from: e */
        private final String f6908e;

        /* renamed from: com.squareup.okhttp.c$c$a */
        class C4275a extends C9841h {

            /* renamed from: b */
            final /* synthetic */ C12013b.C12020f f6909b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4275a(C4274c cVar, C9853r rVar, C12013b.C12020f fVar) {
                super(rVar);
                this.f6909b = fVar;
            }

            public void close() {
                this.f6909b.close();
                super.close();
            }
        }

        public C4274c(C12013b.C12020f fVar, String str, String str2) {
            this.f6905b = fVar;
            this.f6907d = str;
            this.f6908e = str2;
            this.f6906c = C9845l.m23738d(new C4275a(this, fVar.mo42640c(1), fVar));
        }

        /* renamed from: h */
        public long mo26479h() {
            try {
                String str = this.f6908e;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: i */
        public C4307s mo26480i() {
            String str = this.f6907d;
            if (str != null) {
                return C4307s.m12062c(str);
            }
            return null;
        }

        /* renamed from: m */
        public C9838e mo26481m() {
            return this.f6906c;
        }
    }

    /* renamed from: com.squareup.okhttp.c$d */
    private static final class C4276d {

        /* renamed from: a */
        private final String f6910a;

        /* renamed from: b */
        private final C4299p f6911b;

        /* renamed from: c */
        private final String f6912c;

        /* renamed from: d */
        private final Protocol f6913d;

        /* renamed from: e */
        private final int f6914e;

        /* renamed from: f */
        private final String f6915f;

        /* renamed from: g */
        private final C4299p f6916g;

        /* renamed from: h */
        private final C4298o f6917h;

        public C4276d(C4318x xVar) {
            this.f6910a = xVar.mo28071y().mo28044r();
            this.f6911b = C3955k.m11394p(xVar);
            this.f6912c = xVar.mo28071y().mo28039m();
            this.f6913d = xVar.mo28070x();
            this.f6914e = xVar.mo28060o();
            this.f6915f = xVar.mo28067u();
            this.f6916g = xVar.mo28064s();
            this.f6917h = xVar.mo28061p();
        }

        public C4276d(C9853r rVar) {
            try {
                C9838e d = C9845l.m23738d(rVar);
                this.f6910a = d.mo24725G0();
                this.f6912c = d.mo24725G0();
                C4299p.C4301b bVar = new C4299p.C4301b();
                int d2 = C4270c.m11846l(d);
                for (int i = 0; i < d2; i++) {
                    bVar.mo27940c(d.mo24725G0());
                }
                this.f6911b = bVar.mo27942e();
                C3961p a = C3961p.m11421a(d.mo24725G0());
                this.f6913d = a.f6687a;
                this.f6914e = a.f6688b;
                this.f6915f = a.f6689c;
                C4299p.C4301b bVar2 = new C4299p.C4301b();
                int d3 = C4270c.m11846l(d);
                for (int i2 = 0; i2 < d3; i2++) {
                    bVar2.mo27940c(d.mo24725G0());
                }
                this.f6916g = bVar2.mo27942e();
                if (m11867a()) {
                    String G0 = d.mo24725G0();
                    if (G0.length() <= 0) {
                        this.f6917h = C4298o.m11980b(d.mo24725G0(), m11868c(d), m11868c(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + G0 + "\"");
                    }
                } else {
                    this.f6917h = null;
                }
            } finally {
                rVar.close();
            }
        }

        /* renamed from: a */
        private boolean m11867a() {
            return this.f6910a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m11868c(C9838e eVar) {
            int d = C4270c.m11846l(eVar);
            if (d == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(d);
                for (int i = 0; i < d; i++) {
                    String G0 = eVar.mo24725G0();
                    C3564c cVar = new C3564c();
                    cVar.mo24733P0(ByteString.decodeBase64(G0));
                    arrayList.add(instance.generateCertificate(cVar.mo24752f1()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private void m11869e(C9837d dVar, List<Certificate> list) {
            try {
                dVar.mo24744c1((long) list.size());
                dVar.mo24736R(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo24757i0(ByteString.m9966of(list.get(i).getEncoded()).base64());
                    dVar.mo24736R(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo27832b(C4312v vVar, C4318x xVar) {
            return this.f6910a.equals(vVar.mo28044r()) && this.f6912c.equals(vVar.mo28039m()) && C3955k.m11395q(xVar, this.f6911b, vVar);
        }

        /* renamed from: d */
        public C4318x mo27833d(C4312v vVar, C12013b.C12020f fVar) {
            String a = this.f6916g.mo27931a("Content-Type");
            String a2 = this.f6916g.mo27931a("Content-Length");
            return new C4318x.C4320b().mo28084y(new C4312v.C4314b().mo28055o(this.f6910a).mo28051k(this.f6912c, (C4315w) null).mo28050j(this.f6911b).mo28047g()).mo28083x(this.f6913d).mo28076q(this.f6914e).mo28080u(this.f6915f).mo28079t(this.f6916g).mo28073l(new C4274c(fVar, a, a2)).mo28077r(this.f6917h).mo28074m();
        }

        /* renamed from: f */
        public void mo27834f(C12013b.C12017d dVar) {
            C9837d c = C9845l.m23737c(dVar.mo42636f(0));
            c.mo24757i0(this.f6910a);
            c.mo24736R(10);
            c.mo24757i0(this.f6912c);
            c.mo24736R(10);
            c.mo24744c1((long) this.f6911b.mo27935g());
            c.mo24736R(10);
            int g = this.f6911b.mo27935g();
            for (int i = 0; i < g; i++) {
                c.mo24757i0(this.f6911b.mo27933d(i));
                c.mo24757i0(": ");
                c.mo24757i0(this.f6911b.mo27936h(i));
                c.mo24736R(10);
            }
            c.mo24757i0(new C3961p(this.f6913d, this.f6914e, this.f6915f).toString());
            c.mo24736R(10);
            c.mo24744c1((long) this.f6916g.mo27935g());
            c.mo24736R(10);
            int g2 = this.f6916g.mo27935g();
            for (int i2 = 0; i2 < g2; i2++) {
                c.mo24757i0(this.f6916g.mo27933d(i2));
                c.mo24757i0(": ");
                c.mo24757i0(this.f6916g.mo27936h(i2));
                c.mo24736R(10);
            }
            if (m11867a()) {
                c.mo24736R(10);
                c.mo24757i0(this.f6917h.mo27926a());
                c.mo24736R(10);
                m11869e(c, this.f6917h.mo27928e());
                m11869e(c, this.f6917h.mo27927d());
            }
            c.close();
        }
    }

    public C4270c(File file, long j) {
        this(file, j, C3985a.f6733a);
    }

    C4270c(File file, long j, C3985a aVar) {
        this.f6890a = new C4271a();
        this.f6891b = C12013b.m30927B(aVar, file, 201105, 2, j);
    }

    /* renamed from: a */
    private void m11836a(C12013b.C12017d dVar) {
        if (dVar != null) {
            try {
                dVar.mo42634a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ int m11843h(C4270c cVar) {
        int i = cVar.f6892c;
        cVar.f6892c = i + 1;
        return i;
    }

    /* renamed from: i */
    static /* synthetic */ int m11844i(C4270c cVar) {
        int i = cVar.f6893d;
        cVar.f6893d = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public C3933b m11845k(C4318x xVar) {
        C12013b.C12017d dVar;
        String m = xVar.mo28071y().mo28039m();
        if (C3953i.m11366a(xVar.mo28071y().mo28039m())) {
            try {
                m11847m(xVar.mo28071y());
            } catch (IOException unused) {
            }
            return null;
        } else if (!m.equals("GET") || C3955k.m11385g(xVar)) {
            return null;
        } else {
            C4276d dVar2 = new C4276d(xVar);
            try {
                dVar = this.f6891b.mo42626E(m11851q(xVar.mo28071y()));
                if (dVar == null) {
                    return null;
                }
                try {
                    dVar2.mo27834f(dVar);
                    return new C4272b(dVar);
                } catch (IOException unused2) {
                    m11836a(dVar);
                    return null;
                }
            } catch (IOException unused3) {
                dVar = null;
                m11836a(dVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m11846l(C9838e eVar) {
        try {
            long Z = eVar.mo24739Z();
            String G0 = eVar.mo24725G0();
            if (Z >= 0 && Z <= 2147483647L && G0.isEmpty()) {
                return (int) Z;
            }
            throw new IOException("expected an int but was \"" + Z + G0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m11847m(C4312v vVar) {
        this.f6891b.mo42629c0(m11851q(vVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public synchronized void m11848n() {
        this.f6895f++;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public synchronized void m11849o(C3934c cVar) {
        this.f6896g++;
        if (cVar.f6586a != null) {
            this.f6894e++;
        } else if (cVar.f6587b != null) {
            this.f6895f++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m11850p(C4318x xVar, C4318x xVar2) {
        C12013b.C12017d dVar;
        C4276d dVar2 = new C4276d(xVar2);
        try {
            dVar = ((C4274c) xVar.mo28056k()).f6905b.mo42639a();
            if (dVar != null) {
                try {
                    dVar2.mo27834f(dVar);
                    dVar.mo42635e();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            dVar = null;
            m11836a(dVar);
        }
    }

    /* renamed from: q */
    private static String m11851q(C4312v vVar) {
        return C12033k.m31054n(vVar.mo28044r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C4318x mo27825j(C4312v vVar) {
        try {
            C12013b.C12020f H = this.f6891b.mo42627H(m11851q(vVar));
            if (H == null) {
                return null;
            }
            try {
                C4276d dVar = new C4276d(H.mo42640c(0));
                C4318x d = dVar.mo27833d(vVar, H);
                if (dVar.mo27832b(vVar, d)) {
                    return d;
                }
                C12033k.m31043c(d.mo28056k());
                return null;
            } catch (IOException unused) {
                C12033k.m31043c(H);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
