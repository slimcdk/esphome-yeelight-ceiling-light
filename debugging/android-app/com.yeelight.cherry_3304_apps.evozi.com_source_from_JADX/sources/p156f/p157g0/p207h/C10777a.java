package p156f.p157g0.p207h;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p271io.IOUtils;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4388s;
import p156f.C4390t;
import p156f.C4396x;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p156f.p157g0.p160g.C10768c;
import p156f.p157g0.p160g.C10771e;
import p156f.p157g0.p160g.C10774i;
import p156f.p157g0.p160g.C10776k;
import p156f.p157g0.p160g.C4358h;
import p163g.C10840j;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: f.g0.h.a */
public final class C10777a implements C10768c {

    /* renamed from: a */
    final C4396x f20694a;

    /* renamed from: b */
    final C10763g f20695b;

    /* renamed from: c */
    final C4410e f20696c;

    /* renamed from: d */
    final C4409d f20697d;

    /* renamed from: e */
    int f20698e = 0;

    /* renamed from: f */
    private long f20699f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* renamed from: f.g0.h.a$b */
    private abstract class C10779b implements C4416t {

        /* renamed from: a */
        protected final C10840j f20700a;

        /* renamed from: b */
        protected boolean f20701b;

        /* renamed from: c */
        protected long f20702c;

        private C10779b() {
            this.f20700a = new C10840j(C10777a.this.f20696c.mo9542f());
            this.f20702c = 0;
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            try {
                long P0 = C10777a.this.f20696c.mo9541P0(cVar, j);
                if (P0 > 0) {
                    this.f20702c += P0;
                }
                return P0;
            } catch (IOException e) {
                mo34046a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo34046a(boolean z, IOException iOException) {
            C10777a aVar = C10777a.this;
            int i = aVar.f20698e;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo34038g(this.f20700a);
                    C10777a aVar2 = C10777a.this;
                    aVar2.f20698e = 6;
                    C10763g gVar = aVar2.f20695b;
                    if (gVar != null) {
                        gVar.mo34012r(!z, aVar2, this.f20702c, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + C10777a.this.f20698e);
            }
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f20700a;
        }
    }

    /* renamed from: f.g0.h.a$c */
    private final class C10780c implements C4415s {

        /* renamed from: a */
        private final C10840j f20704a = new C10840j(C10777a.this.f20697d.mo9440f());

        /* renamed from: b */
        private boolean f20705b;

        C10780c() {
        }

        public synchronized void close() {
            if (!this.f20705b) {
                this.f20705b = true;
                C10777a.this.f20697d.mo24232g0("0\r\n\r\n");
                C10777a.this.mo34038g(this.f20704a);
                C10777a.this.f20698e = 3;
            }
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return this.f20704a;
        }

        public synchronized void flush() {
            if (!this.f20705b) {
                C10777a.this.f20697d.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            if (this.f20705b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C10777a.this.f20697d.mo24265t0(j);
                C10777a.this.f20697d.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
                C10777a.this.f20697d.mo9442p0(cVar, j);
                C10777a.this.f20697d.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
    }

    /* renamed from: f.g0.h.a$d */
    private class C10781d extends C10779b {

        /* renamed from: e */
        private final C4390t f20707e;

        /* renamed from: f */
        private long f20708f = -1;

        /* renamed from: g */
        private boolean f20709g = true;

        C10781d(C4390t tVar) {
            super();
            this.f20707e = tVar;
        }

        /* renamed from: b */
        private void m26750b() {
            if (this.f20708f != -1) {
                C10777a.this.f20696c.mo24203C0();
            }
            try {
                this.f20708f = C10777a.this.f20696c.mo24225c1();
                String trim = C10777a.this.f20696c.mo24203C0().trim();
                if (this.f20708f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f20708f + trim + "\"");
                } else if (this.f20708f == 0) {
                    this.f20709g = false;
                    C10771e.m26691g(C10777a.this.f20694a.mo24159k(), this.f20707e, C10777a.this.mo34044n());
                    mo34046a(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f20701b) {
                throw new IllegalStateException("closed");
            } else if (!this.f20709g) {
                return -1;
            } else {
                long j2 = this.f20708f;
                if (j2 == 0 || j2 == -1) {
                    m26750b();
                    if (!this.f20709g) {
                        return -1;
                    }
                }
                long P0 = super.mo9541P0(cVar, Math.min(j, this.f20708f));
                if (P0 != -1) {
                    this.f20708f -= P0;
                    return P0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo34046a(false, protocolException);
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f20701b) {
                if (this.f20709g && !C4345c.m12369p(this, 100, TimeUnit.MILLISECONDS)) {
                    mo34046a(false, (IOException) null);
                }
                this.f20701b = true;
            }
        }
    }

    /* renamed from: f.g0.h.a$e */
    private final class C10782e implements C4415s {

        /* renamed from: a */
        private final C10840j f20711a = new C10840j(C10777a.this.f20697d.mo9440f());

        /* renamed from: b */
        private boolean f20712b;

        /* renamed from: c */
        private long f20713c;

        C10782e(long j) {
            this.f20713c = j;
        }

        public void close() {
            if (!this.f20712b) {
                this.f20712b = true;
                if (this.f20713c <= 0) {
                    C10777a.this.mo34038g(this.f20711a);
                    C10777a.this.f20698e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return this.f20711a;
        }

        public void flush() {
            if (!this.f20712b) {
                C10777a.this.f20697d.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            if (!this.f20712b) {
                C4345c.m12359f(cVar.mo24233g1(), 0, j);
                if (j <= this.f20713c) {
                    C10777a.this.f20697d.mo9442p0(cVar, j);
                    this.f20713c -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f20713c + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: f.g0.h.a$f */
    private class C10783f extends C10779b {

        /* renamed from: e */
        private long f20715e;

        C10783f(C10777a aVar, long j) {
            super();
            this.f20715e = j;
            if (j == 0) {
                mo34046a(true, (IOException) null);
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f20701b) {
                long j2 = this.f20715e;
                if (j2 == 0) {
                    return -1;
                }
                long P0 = super.mo9541P0(cVar, Math.min(j2, j));
                if (P0 != -1) {
                    long j3 = this.f20715e - P0;
                    this.f20715e = j3;
                    if (j3 == 0) {
                        mo34046a(true, (IOException) null);
                    }
                    return P0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo34046a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f20701b) {
                if (this.f20715e != 0 && !C4345c.m12369p(this, 100, TimeUnit.MILLISECONDS)) {
                    mo34046a(false, (IOException) null);
                }
                this.f20701b = true;
            }
        }
    }

    /* renamed from: f.g0.h.a$g */
    private class C10784g extends C10779b {

        /* renamed from: e */
        private boolean f20716e;

        C10784g(C10777a aVar) {
            super();
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f20701b) {
                throw new IllegalStateException("closed");
            } else if (this.f20716e) {
                return -1;
            } else {
                long P0 = super.mo9541P0(cVar, j);
                if (P0 != -1) {
                    return P0;
                }
                this.f20716e = true;
                mo34046a(true, (IOException) null);
                return -1;
            }
        }

        public void close() {
            if (!this.f20701b) {
                if (!this.f20716e) {
                    mo34046a(false, (IOException) null);
                }
                this.f20701b = true;
            }
        }
    }

    public C10777a(C4396x xVar, C10763g gVar, C4410e eVar, C4409d dVar) {
        this.f20694a = xVar;
        this.f20695b = gVar;
        this.f20696c = eVar;
        this.f20697d = dVar;
    }

    /* renamed from: m */
    private String m26730m() {
        String E = this.f20696c.mo24205E(this.f20699f);
        this.f20699f -= (long) E.length();
        return E;
    }

    /* renamed from: a */
    public void mo34014a() {
        this.f20697d.flush();
    }

    /* renamed from: b */
    public void mo34015b(C4318a0 a0Var) {
        mo34045o(a0Var.mo23811e(), C10774i.m26716a(a0Var, this.f20695b.mo34004d().mo23975p().mo23909b().type()));
    }

    /* renamed from: c */
    public C4336d0 mo34016c(C4332c0 c0Var) {
        C10763g gVar = this.f20695b;
        gVar.f20659f.mo24070q(gVar.f20658e);
        String i = c0Var.mo23862i("Content-Type");
        if (!C10771e.m26687c(c0Var)) {
            return new C4358h(i, 0, C10843m.m27009d(mo34042k(0)));
        }
        if ("chunked".equalsIgnoreCase(c0Var.mo23862i("Transfer-Encoding"))) {
            return new C4358h(i, -1, C10843m.m27009d(mo34040i(c0Var.mo23855I().mo23815i())));
        }
        long b = C10771e.m26686b(c0Var);
        return b != -1 ? new C4358h(i, b, C10843m.m27009d(mo34042k(b))) : new C4358h(i, -1, C10843m.m27009d(mo34043l()));
    }

    public void cancel() {
        C4357c d = this.f20695b.mo34004d();
        if (d != null) {
            d.mo23968c();
        }
    }

    /* renamed from: d */
    public C4332c0.C4333a mo34018d(boolean z) {
        int i = this.f20698e;
        if (i == 1 || i == 3) {
            try {
                C10776k a = C10776k.m26729a(m26730m());
                C4332c0.C4333a aVar = new C4332c0.C4333a();
                aVar.mo23881n(a.f20691a);
                aVar.mo23874g(a.f20692b);
                aVar.mo23878k(a.f20693c);
                aVar.mo23877j(mo34044n());
                if (z && a.f20692b == 100) {
                    return null;
                }
                if (a.f20692b == 100) {
                    this.f20698e = 3;
                    return aVar;
                }
                this.f20698e = 4;
                return aVar;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f20695b);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f20698e);
        }
    }

    /* renamed from: e */
    public void mo34019e() {
        this.f20697d.flush();
    }

    /* renamed from: f */
    public C4415s mo34020f(C4318a0 a0Var, long j) {
        if ("chunked".equalsIgnoreCase(a0Var.mo23809c("Transfer-Encoding"))) {
            return mo34039h();
        }
        if (j != -1) {
            return mo34041j(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34038g(C10840j jVar) {
        C4417u i = jVar.mo34166i();
        jVar.mo34167j(C4417u.f7967d);
        i.mo24311a();
        i.mo24312b();
    }

    /* renamed from: h */
    public C4415s mo34039h() {
        if (this.f20698e == 1) {
            this.f20698e = 2;
            return new C10780c();
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }

    /* renamed from: i */
    public C4416t mo34040i(C4390t tVar) {
        if (this.f20698e == 4) {
            this.f20698e = 5;
            return new C10781d(tVar);
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }

    /* renamed from: j */
    public C4415s mo34041j(long j) {
        if (this.f20698e == 1) {
            this.f20698e = 2;
            return new C10782e(j);
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }

    /* renamed from: k */
    public C4416t mo34042k(long j) {
        if (this.f20698e == 4) {
            this.f20698e = 5;
            return new C10783f(this, j);
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }

    /* renamed from: l */
    public C4416t mo34043l() {
        if (this.f20698e == 4) {
            C10763g gVar = this.f20695b;
            if (gVar != null) {
                this.f20698e = 5;
                gVar.mo34007j();
                return new C10784g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }

    /* renamed from: n */
    public C4388s mo34044n() {
        C4388s.C4389a aVar = new C4388s.C4389a();
        while (true) {
            String m = m26730m();
            if (m.length() == 0) {
                return aVar.mo24097d();
            }
            C4344a.f7639a.mo23925a(aVar, m);
        }
    }

    /* renamed from: o */
    public void mo34045o(C4388s sVar, String str) {
        if (this.f20698e == 0) {
            this.f20697d.mo24232g0(str).mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int h = sVar.mo24089h();
            for (int i = 0; i < h; i++) {
                this.f20697d.mo24232g0(sVar.mo24086e(i)).mo24232g0(": ").mo24232g0(sVar.mo24091i(i)).mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f20697d.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f20698e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f20698e);
    }
}
