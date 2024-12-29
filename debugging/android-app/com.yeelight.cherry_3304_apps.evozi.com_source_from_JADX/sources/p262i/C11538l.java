package p262i;

import java.io.IOException;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1110e;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1150z;
import p163g.C10839i;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4416t;

/* renamed from: i.l */
final class C11538l<T> implements C11524c<T> {

    /* renamed from: a */
    private final C11562s f22908a;

    /* renamed from: b */
    private final C11559p f22909b;

    /* renamed from: c */
    private final C11527e<C0988a0, T> f22910c;

    /* renamed from: d */
    private final Object[] f22911d;

    /* renamed from: e */
    private boolean f22912e;

    /* renamed from: f */
    private volatile boolean f22913f;

    /* renamed from: i.l$a */
    static final class C11539a extends C0988a0 {

        /* renamed from: b */
        private final C0988a0 f22914b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public IOException f22915c;

        /* renamed from: i.l$a$a */
        class C11540a extends C10839i {
            C11540a(C4416t tVar) {
                super(tVar);
            }

            /* renamed from: P0 */
            public long mo9541P0(C4406c cVar, long j) {
                try {
                    return super.mo9541P0(cVar, j);
                } catch (IOException e) {
                    IOException unused = C11539a.this.f22915c = e;
                    throw e;
                }
            }
        }

        C11539a(C0988a0 a0Var) {
            this.f22914b = a0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo36456C() {
            IOException iOException = this.f22915c;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f22914b.close();
        }

        /* renamed from: i */
        public long mo9388i() {
            try {
                return this.f22914b.mo9388i();
            } catch (IOException e) {
                this.f22915c = e;
                throw e;
            }
        }

        /* renamed from: j */
        public C1138t mo9389j() {
            return this.f22914b.mo9389j();
        }

        /* renamed from: s */
        public C4410e mo9390s() {
            try {
                return C10843m.m27009d(new C11540a(this.f22914b.mo9390s()));
            } catch (IOException e) {
                this.f22915c = e;
                throw e;
            }
        }
    }

    /* renamed from: i.l$b */
    static final class C11541b extends C0988a0 {

        /* renamed from: b */
        private final C1138t f22917b;

        /* renamed from: c */
        private final long f22918c;

        C11541b(C1138t tVar, long j) {
            this.f22917b = tVar;
            this.f22918c = j;
        }

        /* renamed from: i */
        public long mo9388i() {
            return this.f22918c;
        }

        /* renamed from: j */
        public C1138t mo9389j() {
            return this.f22917b;
        }

        /* renamed from: s */
        public C4410e mo9390s() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C11538l(C11562s sVar, C11559p pVar, C11527e<C0988a0, T> eVar, Object[] objArr) {
        this.f22908a = sVar;
        this.f22909b = pVar;
        this.f22910c = eVar;
        this.f22911d = objArr;
    }

    /* renamed from: b */
    private C1110e m30271b() {
        return this.f22908a.mo36478c().mo9803F(this.f22909b.mo36470a(this.f22911d));
    }

    /* renamed from: c */
    private C11561r<T> m30272c(C1150z zVar) {
        C0988a0 k = zVar.mo9857k();
        C1150z.C1152b w = zVar.mo9870w();
        w.mo9874l(new C11541b(k.mo9389j(), k.mo9388i()));
        C1150z m = w.mo9875m();
        int o = m.mo9861o();
        if (o < 200 || o >= 300) {
            try {
                return C11561r.m30328c(C11566t.m30361j(k), m);
            } finally {
                C11566t.m30353b(k);
            }
        } else if (o == 204 || o == 205) {
            return C11561r.m30329g(null, m);
        } else {
            C11539a aVar = new C11539a(k);
            try {
                return C11561r.m30329g(this.f22910c.convert(aVar), m);
            } catch (RuntimeException e) {
                aVar.mo36456C();
                throw e;
            }
        }
    }

    /* renamed from: J */
    public C11561r<T> mo36446J() {
        synchronized (this) {
            if (!this.f22912e) {
                this.f22912e = true;
            } else {
                throw new IllegalStateException("Already executed");
            }
        }
        C1110e b = m30271b();
        if (this.f22913f) {
            b.mo9669d();
        }
        return m30272c(b.mo9672g());
    }

    /* renamed from: a */
    public C11538l<T> clone() {
        return new C11538l<>(this.f22908a, this.f22909b, this.f22910c, this.f22911d);
    }
}
