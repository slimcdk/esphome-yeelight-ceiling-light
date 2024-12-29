package p011c.p083d.p084a.p085d0.p087n;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p271io.IOUtils;
import p011c.p083d.p084a.C1120j;
import p011c.p083d.p084a.C1121k;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1013d;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C10840j;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.n.f */
public final class C1080f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1121k f1548a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1120j f1549b;

    /* renamed from: c */
    private final Socket f1550c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4410e f1551d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4409d f1552e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f1553f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1554g = 0;

    /* renamed from: c.d.a.d0.n.f$b */
    private abstract class C1082b implements C4416t {

        /* renamed from: a */
        protected final C10840j f1555a;

        /* renamed from: b */
        protected boolean f1556b;

        private C1082b() {
            this.f1555a = new C10840j(C1080f.this.f1551d.mo9542f());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo9623a(boolean z) {
            if (C1080f.this.f1553f == 5) {
                C1080f.this.m2433m(this.f1555a);
                int unused = C1080f.this.f1553f = 0;
                if (z && C1080f.this.f1554g == 1) {
                    int unused2 = C1080f.this.f1554g = 0;
                    C1013d.f1321b.mo9460j(C1080f.this.f1548a, C1080f.this.f1549b);
                } else if (C1080f.this.f1554g == 2) {
                    int unused3 = C1080f.this.f1553f = 6;
                    C1080f.this.f1549b.mo9697m().close();
                }
            } else {
                throw new IllegalStateException("state: " + C1080f.this.f1553f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo9624b() {
            C1024k.m2093d(C1080f.this.f1549b.mo9697m());
            int unused = C1080f.this.f1553f = 6;
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f1555a;
        }
    }

    /* renamed from: c.d.a.d0.n.f$c */
    private final class C1083c implements C4415s {

        /* renamed from: a */
        private final C10840j f1558a;

        /* renamed from: b */
        private boolean f1559b;

        private C1083c() {
            this.f1558a = new C10840j(C1080f.this.f1552e.mo9440f());
        }

        public synchronized void close() {
            if (!this.f1559b) {
                this.f1559b = true;
                C1080f.this.f1552e.mo24232g0("0\r\n\r\n");
                C1080f.this.m2433m(this.f1558a);
                int unused = C1080f.this.f1553f = 3;
            }
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return this.f1558a;
        }

        public synchronized void flush() {
            if (!this.f1559b) {
                C1080f.this.f1552e.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            if (this.f1559b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C1080f.this.f1552e.mo24265t0(j);
                C1080f.this.f1552e.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
                C1080f.this.f1552e.mo9442p0(cVar, j);
                C1080f.this.f1552e.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
    }

    /* renamed from: c.d.a.d0.n.f$d */
    private class C1084d extends C1082b {

        /* renamed from: d */
        private long f1561d = -1;

        /* renamed from: e */
        private boolean f1562e = true;

        /* renamed from: f */
        private final C1090h f1563f;

        C1084d(C1090h hVar) {
            super();
            this.f1563f = hVar;
        }

        /* renamed from: g */
        private void m2456g() {
            if (this.f1561d != -1) {
                C1080f.this.f1551d.mo24203C0();
            }
            try {
                this.f1561d = C1080f.this.f1551d.mo24225c1();
                String trim = C1080f.this.f1551d.mo24203C0().trim();
                if (this.f1561d < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1561d + trim + "\"");
                } else if (this.f1561d == 0) {
                    this.f1562e = false;
                    C1130q.C1132b bVar = new C1130q.C1132b();
                    C1080f.this.mo9619w(bVar);
                    this.f1563f.mo9642z(bVar.mo9755e());
                    mo9623a(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f1556b) {
                throw new IllegalStateException("closed");
            } else if (!this.f1562e) {
                return -1;
            } else {
                long j2 = this.f1561d;
                if (j2 == 0 || j2 == -1) {
                    m2456g();
                    if (!this.f1562e) {
                        return -1;
                    }
                }
                long P0 = C1080f.this.f1551d.mo9541P0(cVar, Math.min(j, this.f1561d));
                if (P0 != -1) {
                    this.f1561d -= P0;
                    return P0;
                }
                mo9624b();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f1556b) {
                if (this.f1562e && !C1024k.m2094e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo9624b();
                }
                this.f1556b = true;
            }
        }
    }

    /* renamed from: c.d.a.d0.n.f$e */
    private final class C1085e implements C4415s {

        /* renamed from: a */
        private final C10840j f1565a;

        /* renamed from: b */
        private boolean f1566b;

        /* renamed from: c */
        private long f1567c;

        private C1085e(long j) {
            this.f1565a = new C10840j(C1080f.this.f1552e.mo9440f());
            this.f1567c = j;
        }

        public void close() {
            if (!this.f1566b) {
                this.f1566b = true;
                if (this.f1567c <= 0) {
                    C1080f.this.m2433m(this.f1565a);
                    int unused = C1080f.this.f1553f = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return this.f1565a;
        }

        public void flush() {
            if (!this.f1566b) {
                C1080f.this.f1552e.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            if (!this.f1566b) {
                C1024k.m2090a(cVar.mo24233g1(), 0, j);
                if (j <= this.f1567c) {
                    C1080f.this.f1552e.mo9442p0(cVar, j);
                    this.f1567c -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f1567c + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c.d.a.d0.n.f$f */
    private class C1086f extends C1082b {

        /* renamed from: d */
        private long f1569d;

        public C1086f(long j) {
            super();
            this.f1569d = j;
            if (j == 0) {
                mo9623a(true);
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f1556b) {
                throw new IllegalStateException("closed");
            } else if (this.f1569d == 0) {
                return -1;
            } else {
                long P0 = C1080f.this.f1551d.mo9541P0(cVar, Math.min(this.f1569d, j));
                if (P0 != -1) {
                    long j2 = this.f1569d - P0;
                    this.f1569d = j2;
                    if (j2 == 0) {
                        mo9623a(true);
                    }
                    return P0;
                }
                mo9624b();
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void close() {
            if (!this.f1556b) {
                if (this.f1569d != 0 && !C1024k.m2094e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo9624b();
                }
                this.f1556b = true;
            }
        }
    }

    /* renamed from: c.d.a.d0.n.f$g */
    private class C1087g extends C1082b {

        /* renamed from: d */
        private boolean f1571d;

        private C1087g() {
            super();
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f1556b) {
                throw new IllegalStateException("closed");
            } else if (this.f1571d) {
                return -1;
            } else {
                long P0 = C1080f.this.f1551d.mo9541P0(cVar, j);
                if (P0 != -1) {
                    return P0;
                }
                this.f1571d = true;
                mo9623a(false);
                return -1;
            }
        }

        public void close() {
            if (!this.f1556b) {
                if (!this.f1571d) {
                    mo9624b();
                }
                this.f1556b = true;
            }
        }
    }

    public C1080f(C1121k kVar, C1120j jVar, Socket socket) {
        this.f1548a = kVar;
        this.f1549b = jVar;
        this.f1550c = socket;
        this.f1551d = C10843m.m27009d(C10843m.m27018m(socket));
        this.f1552e = C10843m.m27008c(C10843m.m27014i(socket));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m2433m(C10840j jVar) {
        C4417u i = jVar.mo34166i();
        jVar.mo34167j(C4417u.f7967d);
        i.mo24311a();
        i.mo24312b();
    }

    /* renamed from: A */
    public void mo9606A(C1101o oVar) {
        if (this.f1553f == 1) {
            this.f1553f = 3;
            oVar.mo9651b(this.f1552e);
            return;
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: j */
    public long mo9607j() {
        return this.f1551d.mo24208H().mo24233g1();
    }

    /* renamed from: k */
    public void mo9608k(Object obj) {
        C1013d.f1321b.mo9454d(this.f1549b, obj);
    }

    /* renamed from: l */
    public void mo9609l() {
        this.f1554g = 2;
        if (this.f1553f == 0) {
            this.f1553f = 6;
            this.f1549b.mo9697m().close();
        }
    }

    /* renamed from: n */
    public void mo9610n() {
        this.f1552e.flush();
    }

    /* renamed from: o */
    public boolean mo9611o() {
        return this.f1553f == 6;
    }

    /* renamed from: p */
    public boolean mo9612p() {
        int soTimeout;
        try {
            soTimeout = this.f1550c.getSoTimeout();
            this.f1550c.setSoTimeout(1);
            if (this.f1551d.mo24274x()) {
                this.f1550c.setSoTimeout(soTimeout);
                return false;
            }
            this.f1550c.setSoTimeout(soTimeout);
            return true;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            this.f1550c.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: q */
    public C4415s mo9613q() {
        if (this.f1553f == 1) {
            this.f1553f = 2;
            return new C1083c();
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: r */
    public C4416t mo9614r(C1090h hVar) {
        if (this.f1553f == 4) {
            this.f1553f = 5;
            return new C1084d(hVar);
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: s */
    public C4415s mo9615s(long j) {
        if (this.f1553f == 1) {
            this.f1553f = 2;
            return new C1085e(j);
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: t */
    public C4416t mo9616t(long j) {
        if (this.f1553f == 4) {
            this.f1553f = 5;
            return new C1086f(j);
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: u */
    public C4416t mo9617u() {
        if (this.f1553f == 4) {
            this.f1553f = 5;
            return new C1087g();
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: v */
    public void mo9618v() {
        this.f1554g = 1;
        if (this.f1553f == 0) {
            this.f1554g = 0;
            C1013d.f1321b.mo9460j(this.f1548a, this.f1549b);
        }
    }

    /* renamed from: w */
    public void mo9619w(C1130q.C1132b bVar) {
        while (true) {
            String C0 = this.f1551d.mo24203C0();
            if (C0.length() != 0) {
                C1013d.f1321b.mo9451a(bVar, C0);
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public C1150z.C1152b mo9620x() {
        C1104r a;
        C1150z.C1152b bVar;
        int i = this.f1553f;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = C1104r.m2567a(this.f1551d.mo24203C0());
                    bVar = new C1150z.C1152b();
                    bVar.mo9884x(a.f1632a);
                    bVar.mo9877q(a.f1633b);
                    bVar.mo9881u(a.f1634c);
                    C1130q.C1132b bVar2 = new C1130q.C1132b();
                    mo9619w(bVar2);
                    bVar2.mo9752b(C1096k.f1612e, a.f1632a.toString());
                    bVar.mo9880t(bVar2.mo9755e());
                } catch (EOFException e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f1549b + " (recycle count=" + C1013d.f1321b.mo9461k(this.f1549b) + ")");
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f1633b == 100);
            this.f1553f = 4;
            return bVar;
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }

    /* renamed from: y */
    public void mo9621y(int i, int i2) {
        if (i != 0) {
            this.f1551d.mo9542f().mo24317g((long) i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f1552e.mo9440f().mo24317g((long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: z */
    public void mo9622z(C1130q qVar, String str) {
        if (this.f1553f == 0) {
            this.f1552e.mo24232g0(str).mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int g = qVar.mo9748g();
            for (int i = 0; i < g; i++) {
                this.f1552e.mo24232g0(qVar.mo9746d(i)).mo24232g0(": ").mo24232g0(qVar.mo9749h(i)).mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f1552e.mo24232g0(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f1553f = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f1553f);
    }
}
