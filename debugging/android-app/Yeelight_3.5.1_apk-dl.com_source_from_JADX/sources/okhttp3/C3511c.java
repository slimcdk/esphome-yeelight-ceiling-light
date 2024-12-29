package okhttp3;

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
import okhttp3.C3509b0;
import okhttp3.C3544s;
import okhttp3.C3558z;
import okio.ByteString;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9840g;
import okio.C9841h;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import p056k5.C3300c;
import p063l5.C3317c;
import p063l5.C3319d;
import p063l5.C9532b;
import p063l5.C9534f;
import p073n5.C9732e;
import p073n5.C9733f;
import p073n5.C9737k;
import p092r5.C3636f;
import p203q5.C10283a;

/* renamed from: okhttp3.c */
public final class C3511c implements Closeable, Flushable {

    /* renamed from: a */
    final C9534f f5647a;

    /* renamed from: b */
    final C3319d f5648b;

    /* renamed from: c */
    int f5649c;

    /* renamed from: d */
    int f5650d;

    /* renamed from: e */
    private int f5651e;

    /* renamed from: f */
    private int f5652f;

    /* renamed from: g */
    private int f5653g;

    /* renamed from: okhttp3.c$c */
    private static class C3512c extends C3518c0 {

        /* renamed from: a */
        final C3319d.C3320e f5654a;

        /* renamed from: b */
        private final C9838e f5655b;
        @Nullable

        /* renamed from: c */
        private final String f5656c;
        @Nullable

        /* renamed from: d */
        private final String f5657d;

        /* renamed from: okhttp3.c$c$a */
        class C3513a extends C9841h {

            /* renamed from: b */
            final /* synthetic */ C3319d.C3320e f5658b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3513a(C3512c cVar, C9853r rVar, C3319d.C3320e eVar) {
                super(rVar);
                this.f5658b = eVar;
            }

            public void close() {
                this.f5658b.close();
                super.close();
            }
        }

        C3512c(C3319d.C3320e eVar, String str, String str2) {
            this.f5654a = eVar;
            this.f5656c = str;
            this.f5657d = str2;
            this.f5655b = C9845l.m23738d(new C3513a(this, eVar.mo24051c(1), eVar));
        }

        /* renamed from: d */
        public long mo24148d() {
            try {
                String str = this.f5657d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: f */
        public C3548v mo24149f() {
            String str = this.f5656c;
            if (str != null) {
                return C3548v.m9872d(str);
            }
            return null;
        }

        /* renamed from: k */
        public C9838e mo24150k() {
            return this.f5655b;
        }
    }

    /* renamed from: okhttp3.c$d */
    private static final class C3514d {

        /* renamed from: k */
        private static final String f5659k = (C3636f.m10368j().mo25956k() + "-Sent-Millis");

        /* renamed from: l */
        private static final String f5660l = (C3636f.m10368j().mo25956k() + "-Received-Millis");

        /* renamed from: a */
        private final String f5661a;

        /* renamed from: b */
        private final C3544s f5662b;

        /* renamed from: c */
        private final String f5663c;

        /* renamed from: d */
        private final Protocol f5664d;

        /* renamed from: e */
        private final int f5665e;

        /* renamed from: f */
        private final String f5666f;

        /* renamed from: g */
        private final C3544s f5667g;
        @Nullable

        /* renamed from: h */
        private final C3543r f5668h;

        /* renamed from: i */
        private final long f5669i;

        /* renamed from: j */
        private final long f5670j;

        C3514d(C3509b0 b0Var) {
            this.f5661a = b0Var.mo24372z().mo24660i().toString();
            this.f5662b = C9732e.m23368n(b0Var);
            this.f5663c = b0Var.mo24372z().mo24658g();
            this.f5664d = b0Var.mo24369s();
            this.f5665e = b0Var.mo24359d();
            this.f5666f = b0Var.mo24365m();
            this.f5667g = b0Var.mo24363k();
            this.f5668h = b0Var.mo24360f();
            this.f5669i = b0Var.mo24355A();
            this.f5670j = b0Var.mo24371v();
        }

        C3514d(C9853r rVar) {
            try {
                C9838e d = C9845l.m23738d(rVar);
                this.f5661a = d.mo24725G0();
                this.f5663c = d.mo24725G0();
                C3544s.C3545a aVar = new C3544s.C3545a();
                int h = C3511c.m9616h(d);
                for (int i = 0; i < h; i++) {
                    aVar.mo24554b(d.mo24725G0());
                }
                this.f5662b = aVar.mo24556d();
                C9737k a = C9737k.m23399a(d.mo24725G0());
                this.f5664d = a.f17565a;
                this.f5665e = a.f17566b;
                this.f5666f = a.f17567c;
                C3544s.C3545a aVar2 = new C3544s.C3545a();
                int h2 = C3511c.m9616h(d);
                for (int i2 = 0; i2 < h2; i2++) {
                    aVar2.mo24554b(d.mo24725G0());
                }
                String str = f5659k;
                String e = aVar2.mo24557e(str);
                String str2 = f5660l;
                String e2 = aVar2.mo24557e(str2);
                aVar2.mo24558f(str);
                aVar2.mo24558f(str2);
                long j = 0;
                this.f5669i = e != null ? Long.parseLong(e) : 0;
                this.f5670j = e2 != null ? Long.parseLong(e2) : j;
                this.f5667g = aVar2.mo24556d();
                if (m9626a()) {
                    String G0 = d.mo24725G0();
                    if (G0.length() <= 0) {
                        this.f5668h = C3543r.m9795c(!d.mo24734Q() ? TlsVersion.forJavaName(d.mo24725G0()) : TlsVersion.SSL_3_0, C9799h.m23502a(d.mo24725G0()), m9627c(d), m9627c(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + G0 + "\"");
                    }
                } else {
                    this.f5668h = null;
                }
            } finally {
                rVar.close();
            }
        }

        /* renamed from: a */
        private boolean m9626a() {
            return this.f5661a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m9627c(C9838e eVar) {
            int h = C3511c.m9616h(eVar);
            if (h == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(h);
                for (int i = 0; i < h; i++) {
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
        private void m9628e(C9837d dVar, List<Certificate> list) {
            try {
                dVar.mo24744c1((long) list.size()).mo24736R(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo24757i0(ByteString.m9966of(list.get(i).getEncoded()).base64()).mo24736R(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo24397b(C3558z zVar, C3509b0 b0Var) {
            return this.f5661a.equals(zVar.mo24660i().toString()) && this.f5663c.equals(zVar.mo24658g()) && C9732e.m23369o(b0Var, this.f5662b, zVar);
        }

        /* renamed from: d */
        public C3509b0 mo24398d(C3319d.C3320e eVar) {
            String c = this.f5667g.mo24544c("Content-Type");
            String c2 = this.f5667g.mo24544c("Content-Length");
            return new C3509b0.C3510a().mo24386p(new C3558z.C3559a().mo24668g(this.f5661a).mo24666e(this.f5663c, (C3505a0) null).mo24665d(this.f5662b).mo24663b()).mo24384n(this.f5664d).mo24377g(this.f5665e).mo24381k(this.f5666f).mo24380j(this.f5667g).mo24374b(new C3512c(eVar, c, c2)).mo24378h(this.f5668h).mo24387q(this.f5669i).mo24385o(this.f5670j).mo24375c();
        }

        /* renamed from: f */
        public void mo24399f(C3319d.C3323c cVar) {
            C9837d c = C9845l.m23737c(cVar.mo24058d(0));
            c.mo24757i0(this.f5661a).mo24736R(10);
            c.mo24757i0(this.f5663c).mo24736R(10);
            c.mo24744c1((long) this.f5662b.mo24548h()).mo24736R(10);
            int h = this.f5662b.mo24548h();
            for (int i = 0; i < h; i++) {
                c.mo24757i0(this.f5662b.mo24545e(i)).mo24757i0(": ").mo24757i0(this.f5662b.mo24550i(i)).mo24736R(10);
            }
            c.mo24757i0(new C9737k(this.f5664d, this.f5665e, this.f5666f).toString()).mo24736R(10);
            c.mo24744c1((long) (this.f5667g.mo24548h() + 2)).mo24736R(10);
            int h2 = this.f5667g.mo24548h();
            for (int i2 = 0; i2 < h2; i2++) {
                c.mo24757i0(this.f5667g.mo24545e(i2)).mo24757i0(": ").mo24757i0(this.f5667g.mo24550i(i2)).mo24736R(10);
            }
            c.mo24757i0(f5659k).mo24757i0(": ").mo24744c1(this.f5669i).mo24736R(10);
            c.mo24757i0(f5660l).mo24757i0(": ").mo24744c1(this.f5670j).mo24736R(10);
            if (m9626a()) {
                c.mo24736R(10);
                c.mo24757i0(this.f5668h.mo24538a().mo38989d()).mo24736R(10);
                m9628e(c, this.f5668h.mo24540e());
                m9628e(c, this.f5668h.mo24539d());
                c.mo24757i0(this.f5668h.mo24542f().javaName()).mo24736R(10);
            }
            c.close();
        }
    }

    /* renamed from: okhttp3.c$a */
    class C3515a implements C9534f {
        C3515a() {
        }

        /* renamed from: a */
        public void mo24400a() {
            C3511c.this.mo24393k();
        }

        /* renamed from: b */
        public void mo24401b(C3558z zVar) {
            C3511c.this.mo24392i(zVar);
        }

        /* renamed from: c */
        public C9532b mo24402c(C3509b0 b0Var) {
            return C3511c.this.mo24390f(b0Var);
        }

        /* renamed from: d */
        public C3509b0 mo24403d(C3558z zVar) {
            return C3511c.this.mo24388c(zVar);
        }

        /* renamed from: e */
        public void mo24404e(C3317c cVar) {
            C3511c.this.mo24394l(cVar);
        }

        /* renamed from: f */
        public void mo24405f(C3509b0 b0Var, C3509b0 b0Var2) {
            C3511c.this.mo24395m(b0Var, b0Var2);
        }
    }

    /* renamed from: okhttp3.c$b */
    private final class C3516b implements C9532b {

        /* renamed from: a */
        private final C3319d.C3323c f5672a;

        /* renamed from: b */
        private C9852q f5673b;

        /* renamed from: c */
        private C9852q f5674c;

        /* renamed from: d */
        boolean f5675d;

        /* renamed from: okhttp3.c$b$a */
        class C3517a extends C9840g {

            /* renamed from: b */
            final /* synthetic */ C3319d.C3323c f5677b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3517a(C9852q qVar, C3511c cVar, C3319d.C3323c cVar2) {
                super(qVar);
                this.f5677b = cVar2;
            }

            public void close() {
                synchronized (C3511c.this) {
                    C3516b bVar = C3516b.this;
                    if (!bVar.f5675d) {
                        bVar.f5675d = true;
                        C3511c.this.f5649c++;
                        super.close();
                        this.f5677b.mo24056b();
                    }
                }
            }
        }

        C3516b(C3319d.C3323c cVar) {
            this.f5672a = cVar;
            C9852q d = cVar.mo24058d(1);
            this.f5673b = d;
            this.f5674c = new C3517a(d, C3511c.this, cVar);
        }

        /* renamed from: a */
        public void mo24406a() {
            synchronized (C3511c.this) {
                if (!this.f5675d) {
                    this.f5675d = true;
                    C3511c.this.f5650d++;
                    C3300c.m8921f(this.f5673b);
                    try {
                        this.f5672a.mo24055a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public C9852q mo24407b() {
            return this.f5674c;
        }
    }

    public C3511c(File file, long j) {
        this(file, j, C10283a.f19369a);
    }

    C3511c(File file, long j, C10283a aVar) {
        this.f5647a = new C3515a();
        this.f5648b = C3319d.m9027d(aVar, file, 201105, 2, j);
    }

    /* renamed from: a */
    private void m9614a(@Nullable C3319d.C3323c cVar) {
        if (cVar != null) {
            try {
                cVar.mo24055a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static String m9615d(C3546t tVar) {
        return ByteString.encodeUtf8(tVar.toString()).md5().hex();
    }

    /* renamed from: h */
    static int m9616h(C9838e eVar) {
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

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public C3509b0 mo24388c(C3558z zVar) {
        try {
            C3319d.C3320e k = this.f5648b.mo24045k(m9615d(zVar.mo24660i()));
            if (k == null) {
                return null;
            }
            try {
                C3514d dVar = new C3514d(k.mo24051c(0));
                C3509b0 d = dVar.mo24398d(k);
                if (dVar.mo24397b(zVar, d)) {
                    return d;
                }
                C3300c.m8921f(d.mo24356a());
                return null;
            } catch (IOException unused) {
                C3300c.m8921f(k);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public void close() {
        this.f5648b.close();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public C9532b mo24390f(C3509b0 b0Var) {
        C3319d.C3323c cVar;
        String g = b0Var.mo24372z().mo24658g();
        if (C9733f.m23370a(b0Var.mo24372z().mo24658g())) {
            try {
                mo24392i(b0Var.mo24372z());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g.equals("GET") || C9732e.m23359e(b0Var)) {
            return null;
        } else {
            C3514d dVar = new C3514d(b0Var);
            try {
                cVar = this.f5648b.mo24042h(m9615d(b0Var.mo24372z().mo24660i()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.mo24399f(cVar);
                    return new C3516b(cVar);
                } catch (IOException unused2) {
                    m9614a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                m9614a(cVar);
                return null;
            }
        }
    }

    public void flush() {
        this.f5648b.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo24392i(C3558z zVar) {
        this.f5648b.mo24049z(m9615d(zVar.mo24660i()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo24393k() {
        this.f5652f++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized void mo24394l(C3317c cVar) {
        this.f5653g++;
        if (cVar.f5362a != null) {
            this.f5651e++;
        } else if (cVar.f5363b != null) {
            this.f5652f++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo24395m(C3509b0 b0Var, C3509b0 b0Var2) {
        C3319d.C3323c cVar;
        C3514d dVar = new C3514d(b0Var2);
        try {
            cVar = ((C3512c) b0Var.mo24356a()).f5654a.mo24050a();
            if (cVar != null) {
                try {
                    dVar.mo24399f(cVar);
                    cVar.mo24056b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            m9614a(cVar);
        }
    }
}
