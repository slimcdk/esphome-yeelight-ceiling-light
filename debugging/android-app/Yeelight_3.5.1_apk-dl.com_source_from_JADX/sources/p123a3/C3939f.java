package p123a3;

import com.squareup.okhttp.C4289i;
import com.squareup.okhttp.C4290j;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4318x;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9842i;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import org.apache.commons.p194io.IOUtils;
import p231y2.C12022d;
import p231y2.C12033k;

/* renamed from: a3.f */
public final class C3939f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4290j f6605a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4289i f6606b;

    /* renamed from: c */
    private final Socket f6607c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9838e f6608d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9837d f6609e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6610f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f6611g = 0;

    /* renamed from: a3.f$b */
    private abstract class C3941b implements C9853r {

        /* renamed from: a */
        protected final C9842i f6612a;

        /* renamed from: b */
        protected boolean f6613b;

        private C3941b() {
            this.f6612a = new C9842i(C3939f.this.f6608d.mo24479j());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26459a(boolean z) {
            if (C3939f.this.f6610f == 5) {
                C3939f.this.m11291m(this.f6612a);
                int unused = C3939f.this.f6610f = 0;
                if (z && C3939f.this.f6611g == 1) {
                    int unused2 = C3939f.this.f6611g = 0;
                    C12022d.f22043b.mo28027j(C3939f.this.f6605a, C3939f.this.f6606b);
                } else if (C3939f.this.f6611g == 2) {
                    int unused3 = C3939f.this.f6610f = 6;
                    C3939f.this.f6606b.mo27877m().close();
                }
            } else {
                throw new IllegalStateException("state: " + C3939f.this.f6610f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo26460c() {
            C12033k.m31044d(C3939f.this.f6606b.mo27877m());
            int unused = C3939f.this.f6610f = 6;
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f6612a;
        }
    }

    /* renamed from: a3.f$c */
    private final class C3942c implements C9852q {

        /* renamed from: a */
        private final C9842i f6615a;

        /* renamed from: b */
        private boolean f6616b;

        private C3942c() {
            this.f6615a = new C9842i(C3939f.this.f6609e.mo24475j());
        }

        public synchronized void close() {
            if (!this.f6616b) {
                this.f6616b = true;
                C3939f.this.f6609e.mo24757i0("0\r\n\r\n");
                C3939f.this.m11291m(this.f6615a);
                int unused = C3939f.this.f6610f = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f6616b) {
                C3939f.this.f6609e.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return this.f6615a;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            if (this.f6616b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C3939f.this.f6609e.mo24784t0(j);
                C3939f.this.f6609e.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
                C3939f.this.f6609e.mo24476q0(cVar, j);
                C3939f.this.f6609e.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
    }

    /* renamed from: a3.f$d */
    private class C3943d extends C3941b {

        /* renamed from: d */
        private long f6618d = -1;

        /* renamed from: e */
        private boolean f6619e = true;

        /* renamed from: f */
        private final C3949h f6620f;

        C3943d(C3949h hVar) {
            super();
            this.f6620f = hVar;
        }

        /* renamed from: d */
        private void m11314d() {
            if (this.f6618d != -1) {
                C3939f.this.f6608d.mo24725G0();
            }
            try {
                this.f6618d = C3939f.this.f6608d.mo24749e1();
                String trim = C3939f.this.f6608d.mo24725G0().trim();
                if (this.f6618d < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6618d + trim + "\"");
                } else if (this.f6618d == 0) {
                    this.f6619e = false;
                    C4299p.C4301b bVar = new C4299p.C4301b();
                    C3939f.this.mo26455w(bVar);
                    this.f6620f.mo26478z(bVar.mo27942e());
                    mo26459a(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f6613b) {
                throw new IllegalStateException("closed");
            } else if (!this.f6619e) {
                return -1;
            } else {
                long j2 = this.f6618d;
                if (j2 == 0 || j2 == -1) {
                    m11314d();
                    if (!this.f6619e) {
                        return -1;
                    }
                }
                long R0 = C3939f.this.f6608d.mo24477R0(cVar, Math.min(j, this.f6618d));
                if (R0 != -1) {
                    this.f6618d -= R0;
                    return R0;
                }
                mo26460c();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f6613b) {
                if (this.f6619e && !C12033k.m31045e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo26460c();
                }
                this.f6613b = true;
            }
        }
    }

    /* renamed from: a3.f$e */
    private final class C3944e implements C9852q {

        /* renamed from: a */
        private final C9842i f6622a;

        /* renamed from: b */
        private boolean f6623b;

        /* renamed from: c */
        private long f6624c;

        private C3944e(long j) {
            this.f6622a = new C9842i(C3939f.this.f6609e.mo24475j());
            this.f6624c = j;
        }

        public void close() {
            if (!this.f6623b) {
                this.f6623b = true;
                if (this.f6624c <= 0) {
                    C3939f.this.m11291m(this.f6622a);
                    int unused = C3939f.this.f6610f = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.f6623b) {
                C3939f.this.f6609e.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return this.f6622a;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            if (!this.f6623b) {
                C12033k.m31041a(cVar.mo24758i1(), 0, j);
                if (j <= this.f6624c) {
                    C3939f.this.f6609e.mo24476q0(cVar, j);
                    this.f6624c -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f6624c + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a3.f$f */
    private class C3945f extends C3941b {

        /* renamed from: d */
        private long f6626d;

        public C3945f(long j) {
            super();
            this.f6626d = j;
            if (j == 0) {
                mo26459a(true);
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f6613b) {
                throw new IllegalStateException("closed");
            } else if (this.f6626d == 0) {
                return -1;
            } else {
                long R0 = C3939f.this.f6608d.mo24477R0(cVar, Math.min(this.f6626d, j));
                if (R0 != -1) {
                    long j2 = this.f6626d - R0;
                    this.f6626d = j2;
                    if (j2 == 0) {
                        mo26459a(true);
                    }
                    return R0;
                }
                mo26460c();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f6613b) {
                if (this.f6626d != 0 && !C12033k.m31045e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo26460c();
                }
                this.f6613b = true;
            }
        }
    }

    /* renamed from: a3.f$g */
    private class C3946g extends C3941b {

        /* renamed from: d */
        private boolean f6628d;

        private C3946g() {
            super();
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f6613b) {
                throw new IllegalStateException("closed");
            } else if (this.f6628d) {
                return -1;
            } else {
                long R0 = C3939f.this.f6608d.mo24477R0(cVar, j);
                if (R0 != -1) {
                    return R0;
                }
                this.f6628d = true;
                mo26459a(false);
                return -1;
            }
        }

        public void close() {
            if (!this.f6613b) {
                if (!this.f6628d) {
                    mo26460c();
                }
                this.f6613b = true;
            }
        }
    }

    public C3939f(C4290j jVar, C4289i iVar, Socket socket) {
        this.f6605a = jVar;
        this.f6606b = iVar;
        this.f6607c = socket;
        this.f6608d = C9845l.m23738d(C9845l.m23747m(socket));
        this.f6609e = C9845l.m23737c(C9845l.m23743i(socket));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m11291m(C9842i iVar) {
        C9854s i = iVar.mo39092i();
        iVar.mo39093j(C9854s.f17853d);
        i.mo39085a();
        i.mo39086b();
    }

    /* renamed from: A */
    public void mo26442A(C3959n nVar) {
        if (this.f6610f == 1) {
            this.f6610f = 3;
            nVar.mo26488c(this.f6609e);
            return;
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: j */
    public long mo26443j() {
        return this.f6608d.mo24724F().mo24758i1();
    }

    /* renamed from: k */
    public void mo26444k(Object obj) {
        C12022d.f22043b.mo28021d(this.f6606b, obj);
    }

    /* renamed from: l */
    public void mo26445l() {
        this.f6611g = 2;
        if (this.f6610f == 0) {
            this.f6610f = 6;
            this.f6606b.mo27877m().close();
        }
    }

    /* renamed from: n */
    public void mo26446n() {
        this.f6609e.flush();
    }

    /* renamed from: o */
    public boolean mo26447o() {
        return this.f6610f == 6;
    }

    /* renamed from: p */
    public boolean mo26448p() {
        int soTimeout;
        try {
            soTimeout = this.f6607c.getSoTimeout();
            this.f6607c.setSoTimeout(1);
            if (this.f6608d.mo24734Q()) {
                this.f6607c.setSoTimeout(soTimeout);
                return false;
            }
            this.f6607c.setSoTimeout(soTimeout);
            return true;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            this.f6607c.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: q */
    public C9852q mo26449q() {
        if (this.f6610f == 1) {
            this.f6610f = 2;
            return new C3942c();
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: r */
    public C9853r mo26450r(C3949h hVar) {
        if (this.f6610f == 4) {
            this.f6610f = 5;
            return new C3943d(hVar);
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: s */
    public C9852q mo26451s(long j) {
        if (this.f6610f == 1) {
            this.f6610f = 2;
            return new C3944e(j);
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: t */
    public C9853r mo26452t(long j) {
        if (this.f6610f == 4) {
            this.f6610f = 5;
            return new C3945f(j);
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: u */
    public C9853r mo26453u() {
        if (this.f6610f == 4) {
            this.f6610f = 5;
            return new C3946g();
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: v */
    public void mo26454v() {
        this.f6611g = 1;
        if (this.f6610f == 0) {
            this.f6611g = 0;
            C12022d.f22043b.mo28027j(this.f6605a, this.f6606b);
        }
    }

    /* renamed from: w */
    public void mo26455w(C4299p.C4301b bVar) {
        while (true) {
            String G0 = this.f6608d.mo24725G0();
            if (G0.length() != 0) {
                C12022d.f22043b.mo28018a(bVar, G0);
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public C4318x.C4320b mo26456x() {
        C3961p a;
        C4318x.C4320b u;
        int i = this.f6610f;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = C3961p.m11421a(this.f6608d.mo24725G0());
                    u = new C4318x.C4320b().mo28083x(a.f6687a).mo28076q(a.f6688b).mo28080u(a.f6689c);
                    C4299p.C4301b bVar = new C4299p.C4301b();
                    mo26455w(bVar);
                    bVar.mo27939b(C3955k.f6669e, a.f6687a.toString());
                    u.mo28079t(bVar.mo27942e());
                } catch (EOFException e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f6606b + " (recycle count=" + C12022d.f22043b.mo28028k(this.f6606b) + ")");
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f6688b == 100);
            this.f6610f = 4;
            return u;
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }

    /* renamed from: y */
    public void mo26457y(int i, int i2) {
        if (i != 0) {
            this.f6608d.mo24479j().mo39091g((long) i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f6609e.mo24475j().mo39091g((long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: z */
    public void mo26458z(C4299p pVar, String str) {
        if (this.f6610f == 0) {
            this.f6609e.mo24757i0(str).mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int g = pVar.mo27935g();
            for (int i = 0; i < g; i++) {
                this.f6609e.mo24757i0(pVar.mo27933d(i)).mo24757i0(": ").mo24757i0(pVar.mo27936h(i)).mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f6609e.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f6610f = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f6610f);
    }
}
