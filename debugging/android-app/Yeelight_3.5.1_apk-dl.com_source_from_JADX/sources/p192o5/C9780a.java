package p192o5;

import android.support.p004v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3544s;
import okhttp3.C3546t;
import okhttp3.C3552x;
import okhttp3.C3558z;
import okhttp3.internal.connection.C3526a;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9842i;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import org.apache.commons.p194io.IOUtils;
import p056k5.C3299a;
import p056k5.C3300c;
import p073n5.C3381h;
import p073n5.C9729c;
import p073n5.C9732e;
import p073n5.C9735i;
import p073n5.C9737k;
import p186m5.C9554e;

/* renamed from: o5.a */
public final class C9780a implements C9729c {

    /* renamed from: a */
    final C3552x f17636a;

    /* renamed from: b */
    final C9554e f17637b;

    /* renamed from: c */
    final C9838e f17638c;

    /* renamed from: d */
    final C9837d f17639d;

    /* renamed from: e */
    int f17640e = 0;

    /* renamed from: f */
    private long f17641f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* renamed from: o5.a$b */
    private abstract class C9782b implements C9853r {

        /* renamed from: a */
        protected final C9842i f17642a;

        /* renamed from: b */
        protected boolean f17643b;

        /* renamed from: c */
        protected long f17644c;

        private C9782b() {
            this.f17642a = new C9842i(C9780a.this.f17638c.mo24479j());
            this.f17644c = 0;
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            try {
                long R0 = C9780a.this.f17638c.mo24477R0(cVar, j);
                if (R0 > 0) {
                    this.f17644c += R0;
                }
                return R0;
            } catch (IOException e) {
                mo38958a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo38958a(boolean z, IOException iOException) {
            C9780a aVar = C9780a.this;
            int i = aVar.f17640e;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo38950g(this.f17642a);
                    C9780a aVar2 = C9780a.this;
                    aVar2.f17640e = 6;
                    C9554e eVar = aVar2.f17637b;
                    if (eVar != null) {
                        eVar.mo38532r(!z, aVar2, this.f17644c, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + C9780a.this.f17640e);
            }
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f17642a;
        }
    }

    /* renamed from: o5.a$c */
    private final class C9783c implements C9852q {

        /* renamed from: a */
        private final C9842i f17646a;

        /* renamed from: b */
        private boolean f17647b;

        C9783c() {
            this.f17646a = new C9842i(C9780a.this.f17639d.mo24475j());
        }

        public synchronized void close() {
            if (!this.f17647b) {
                this.f17647b = true;
                C9780a.this.f17639d.mo24757i0("0\r\n\r\n");
                C9780a.this.mo38950g(this.f17646a);
                C9780a.this.f17640e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f17647b) {
                C9780a.this.f17639d.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return this.f17646a;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            if (this.f17647b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C9780a.this.f17639d.mo24784t0(j);
                C9780a.this.f17639d.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
                C9780a.this.f17639d.mo24476q0(cVar, j);
                C9780a.this.f17639d.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
    }

    /* renamed from: o5.a$d */
    private class C9784d extends C9782b {

        /* renamed from: e */
        private final C3546t f17649e;

        /* renamed from: f */
        private long f17650f = -1;

        /* renamed from: g */
        private boolean f17651g = true;

        C9784d(C3546t tVar) {
            super();
            this.f17649e = tVar;
        }

        /* renamed from: c */
        private void m23462c() {
            if (this.f17650f != -1) {
                C9780a.this.f17638c.mo24725G0();
            }
            try {
                this.f17650f = C9780a.this.f17638c.mo24749e1();
                String trim = C9780a.this.f17638c.mo24725G0().trim();
                if (this.f17650f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f17650f + trim + "\"");
                } else if (this.f17650f == 0) {
                    this.f17651g = false;
                    C9732e.m23361g(C9780a.this.f17636a.mo24617h(), this.f17649e, C9780a.this.mo38956n());
                    mo38958a(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f17643b) {
                throw new IllegalStateException("closed");
            } else if (!this.f17651g) {
                return -1;
            } else {
                long j2 = this.f17650f;
                if (j2 == 0 || j2 == -1) {
                    m23462c();
                    if (!this.f17651g) {
                        return -1;
                    }
                }
                long R0 = super.mo24477R0(cVar, Math.min(j, this.f17650f));
                if (R0 != -1) {
                    this.f17650f -= R0;
                    return R0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo38958a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f17643b) {
                if (this.f17651g && !C3300c.m8930o(this, 100, TimeUnit.MILLISECONDS)) {
                    mo38958a(false, (IOException) null);
                }
                this.f17643b = true;
            }
        }
    }

    /* renamed from: o5.a$e */
    private final class C9785e implements C9852q {

        /* renamed from: a */
        private final C9842i f17653a;

        /* renamed from: b */
        private boolean f17654b;

        /* renamed from: c */
        private long f17655c;

        C9785e(long j) {
            this.f17653a = new C9842i(C9780a.this.f17639d.mo24475j());
            this.f17655c = j;
        }

        public void close() {
            if (!this.f17654b) {
                this.f17654b = true;
                if (this.f17655c <= 0) {
                    C9780a.this.mo38950g(this.f17653a);
                    C9780a.this.f17640e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.f17654b) {
                C9780a.this.f17639d.flush();
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return this.f17653a;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            if (!this.f17654b) {
                C3300c.m8920e(cVar.mo24758i1(), 0, j);
                if (j <= this.f17655c) {
                    C9780a.this.f17639d.mo24476q0(cVar, j);
                    this.f17655c -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f17655c + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: o5.a$f */
    private class C9786f extends C9782b {

        /* renamed from: e */
        private long f17657e;

        C9786f(C9780a aVar, long j) {
            super();
            this.f17657e = j;
            if (j == 0) {
                mo38958a(true, (IOException) null);
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f17643b) {
                long j2 = this.f17657e;
                if (j2 == 0) {
                    return -1;
                }
                long R0 = super.mo24477R0(cVar, Math.min(j2, j));
                if (R0 != -1) {
                    long j3 = this.f17657e - R0;
                    this.f17657e = j3;
                    if (j3 == 0) {
                        mo38958a(true, (IOException) null);
                    }
                    return R0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo38958a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f17643b) {
                if (this.f17657e != 0 && !C3300c.m8930o(this, 100, TimeUnit.MILLISECONDS)) {
                    mo38958a(false, (IOException) null);
                }
                this.f17643b = true;
            }
        }
    }

    /* renamed from: o5.a$g */
    private class C9787g extends C9782b {

        /* renamed from: e */
        private boolean f17658e;

        C9787g(C9780a aVar) {
            super();
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f17643b) {
                throw new IllegalStateException("closed");
            } else if (this.f17658e) {
                return -1;
            } else {
                long R0 = super.mo24477R0(cVar, j);
                if (R0 != -1) {
                    return R0;
                }
                this.f17658e = true;
                mo38958a(true, (IOException) null);
                return -1;
            }
        }

        public void close() {
            if (!this.f17643b) {
                if (!this.f17658e) {
                    mo38958a(false, (IOException) null);
                }
                this.f17643b = true;
            }
        }
    }

    public C9780a(C3552x xVar, C9554e eVar, C9838e eVar2, C9837d dVar) {
        this.f17636a = xVar;
        this.f17637b = eVar;
        this.f17638c = eVar2;
        this.f17639d = dVar;
    }

    /* renamed from: m */
    private String m23442m() {
        String a0 = this.f17638c.mo24741a0(this.f17641f);
        this.f17641f -= (long) a0.length();
        return a0;
    }

    /* renamed from: a */
    public void mo38892a() {
        this.f17639d.flush();
    }

    /* renamed from: b */
    public void mo38893b(C3558z zVar) {
        mo38957o(zVar.mo24656e(), C9735i.m23386a(zVar, this.f17637b.mo38524d().mo24452p().mo24427b().type()));
    }

    /* renamed from: c */
    public C3518c0 mo38894c(C3509b0 b0Var) {
        C9554e eVar = this.f17637b;
        eVar.f17446f.mo24529q(eVar.f17445e);
        String h = b0Var.mo24361h("Content-Type");
        if (!C9732e.m23357c(b0Var)) {
            return new C3381h(h, 0, C9845l.m23738d(mo38954k(0)));
        }
        if ("chunked".equalsIgnoreCase(b0Var.mo24361h("Transfer-Encoding"))) {
            return new C3381h(h, -1, C9845l.m23738d(mo38952i(b0Var.mo24372z().mo24660i())));
        }
        long b = C9732e.m23356b(b0Var);
        return b != -1 ? new C3381h(h, b, C9845l.m23738d(mo38954k(b))) : new C3381h(h, -1, C9845l.m23738d(mo38955l()));
    }

    public void cancel() {
        C3526a d = this.f17637b.mo38524d();
        if (d != null) {
            d.mo24445c();
        }
    }

    /* renamed from: d */
    public C3509b0.C3510a mo38896d(boolean z) {
        int i = this.f17640e;
        if (i == 1 || i == 3) {
            try {
                C9737k a = C9737k.m23399a(m23442m());
                C3509b0.C3510a j = new C3509b0.C3510a().mo24384n(a.f17565a).mo24377g(a.f17566b).mo24381k(a.f17567c).mo24380j(mo38956n());
                if (z && a.f17566b == 100) {
                    return null;
                }
                if (a.f17566b == 100) {
                    this.f17640e = 3;
                    return j;
                }
                this.f17640e = 4;
                return j;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f17637b);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f17640e);
        }
    }

    /* renamed from: e */
    public void mo38897e() {
        this.f17639d.flush();
    }

    /* renamed from: f */
    public C9852q mo38898f(C3558z zVar, long j) {
        if ("chunked".equalsIgnoreCase(zVar.mo24654c("Transfer-Encoding"))) {
            return mo38951h();
        }
        if (j != -1) {
            return mo38953j(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo38950g(C9842i iVar) {
        C9854s i = iVar.mo39092i();
        iVar.mo39093j(C9854s.f17853d);
        i.mo39085a();
        i.mo39086b();
    }

    /* renamed from: h */
    public C9852q mo38951h() {
        if (this.f17640e == 1) {
            this.f17640e = 2;
            return new C9783c();
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }

    /* renamed from: i */
    public C9853r mo38952i(C3546t tVar) {
        if (this.f17640e == 4) {
            this.f17640e = 5;
            return new C9784d(tVar);
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }

    /* renamed from: j */
    public C9852q mo38953j(long j) {
        if (this.f17640e == 1) {
            this.f17640e = 2;
            return new C9785e(j);
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }

    /* renamed from: k */
    public C9853r mo38954k(long j) {
        if (this.f17640e == 4) {
            this.f17640e = 5;
            return new C9786f(this, j);
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }

    /* renamed from: l */
    public C9853r mo38955l() {
        if (this.f17640e == 4) {
            C9554e eVar = this.f17637b;
            if (eVar != null) {
                this.f17640e = 5;
                eVar.mo38527j();
                return new C9787g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }

    /* renamed from: n */
    public C3544s mo38956n() {
        C3544s.C3545a aVar = new C3544s.C3545a();
        while (true) {
            String m = m23442m();
            if (m.length() == 0) {
                return aVar.mo24556d();
            }
            C3299a.f5331a.mo23924a(aVar, m);
        }
    }

    /* renamed from: o */
    public void mo38957o(C3544s sVar, String str) {
        if (this.f17640e == 0) {
            this.f17639d.mo24757i0(str).mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int h = sVar.mo24548h();
            for (int i = 0; i < h; i++) {
                this.f17639d.mo24757i0(sVar.mo24545e(i)).mo24757i0(": ").mo24757i0(sVar.mo24550i(i)).mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f17639d.mo24757i0(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f17640e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f17640e);
    }
}
