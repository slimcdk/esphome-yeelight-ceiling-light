package p173j;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p156f.C10748f;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4338e;
import p156f.C4392v;
import p163g.C10839i;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4416t;

/* renamed from: j.h */
final class C4449h<T> implements C4446b<T> {

    /* renamed from: a */
    private final C4480n<T, ?> f8015a;
    @Nullable

    /* renamed from: b */
    private final Object[] f8016b;

    /* renamed from: c */
    private volatile boolean f8017c;
    @GuardedBy("this")
    @Nullable

    /* renamed from: d */
    private C4338e f8018d;
    @GuardedBy("this")
    @Nullable

    /* renamed from: e */
    private Throwable f8019e;
    @GuardedBy("this")

    /* renamed from: f */
    private boolean f8020f;

    /* renamed from: j.h$a */
    class C4450a implements C10748f {

        /* renamed from: a */
        final /* synthetic */ C11574d f8021a;

        C4450a(C11574d dVar) {
            this.f8021a = dVar;
        }

        /* renamed from: c */
        private void m13129c(Throwable th) {
            try {
                this.f8021a.mo31921a(C4449h.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo24536a(C4338e eVar, C4332c0 c0Var) {
            try {
                try {
                    this.f8021a.mo31922b(C4449h.this, C4449h.this.mo24534c(c0Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                m13129c(th2);
            }
        }

        /* renamed from: b */
        public void mo24537b(C4338e eVar, IOException iOException) {
            m13129c(iOException);
        }
    }

    /* renamed from: j.h$b */
    static final class C4451b extends C4336d0 {

        /* renamed from: a */
        private final C4336d0 f8023a;

        /* renamed from: b */
        IOException f8024b;

        /* renamed from: j.h$b$a */
        class C4452a extends C10839i {
            C4452a(C4416t tVar) {
                super(tVar);
            }

            /* renamed from: P0 */
            public long mo9541P0(C4406c cVar, long j) {
                try {
                    return super.mo9541P0(cVar, j);
                } catch (IOException e) {
                    C4451b.this.f8024b = e;
                    throw e;
                }
            }
        }

        C4451b(C4336d0 d0Var) {
            this.f8023a = d0Var;
        }

        public void close() {
            this.f8023a.close();
        }

        /* renamed from: h */
        public long mo23838h() {
            return this.f8023a.mo23838h();
        }

        /* renamed from: i */
        public C4392v mo23839i() {
            return this.f8023a.mo23839i();
        }

        /* renamed from: o */
        public C4410e mo23840o() {
            return C10843m.m27009d(new C4452a(this.f8023a.mo23840o()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo24538t() {
            IOException iOException = this.f8024b;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: j.h$c */
    static final class C4453c extends C4336d0 {

        /* renamed from: a */
        private final C4392v f8026a;

        /* renamed from: b */
        private final long f8027b;

        C4453c(C4392v vVar, long j) {
            this.f8026a = vVar;
            this.f8027b = j;
        }

        /* renamed from: h */
        public long mo23838h() {
            return this.f8027b;
        }

        /* renamed from: i */
        public C4392v mo23839i() {
            return this.f8026a;
        }

        /* renamed from: o */
        public C4410e mo23840o() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C4449h(C4480n<T, ?> nVar, @Nullable Object[] objArr) {
        this.f8015a = nVar;
        this.f8016b = objArr;
    }

    /* renamed from: b */
    private C4338e m13123b() {
        C4338e d = this.f8015a.mo24585d(this.f8016b);
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: K */
    public boolean mo24526K() {
        boolean z = true;
        if (this.f8017c) {
            return true;
        }
        synchronized (this) {
            if (this.f8018d == null || !this.f8018d.mo23904K()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C4449h<T> clone() {
        return new C4449h<>(this.f8015a, this.f8016b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C4476l<T> mo24534c(C4332c0 c0Var) {
        C4336d0 a = c0Var.mo23857a();
        C4332c0.C4333a u = c0Var.mo23869u();
        u.mo23871b(new C4453c(a.mo23839i(), a.mo23838h()));
        C4332c0 c = u.mo23872c();
        int g = c.mo23860g();
        if (g < 200 || g >= 300) {
            try {
                return C4476l.m13188c(C4482o.m13229a(a), c);
            } finally {
                a.close();
            }
        } else if (g == 204 || g == 205) {
            a.close();
            return C4476l.m13189f(null, c);
        } else {
            C4451b bVar = new C4451b(a);
            try {
                return C4476l.m13189f(this.f8015a.mo24586e(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo24538t();
                throw e;
            }
        }
    }

    /* renamed from: n */
    public void mo24528n(C11574d<T> dVar) {
        C4338e eVar;
        Throwable th;
        C4482o.m13230b(dVar, "callback == null");
        synchronized (this) {
            if (!this.f8020f) {
                this.f8020f = true;
                eVar = this.f8018d;
                th = this.f8019e;
                if (eVar == null && th == null) {
                    try {
                        C4338e b = m13123b();
                        this.f8018d = b;
                        eVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C4482o.m13244p(th);
                        this.f8019e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo31921a(this, th);
            return;
        }
        if (this.f8017c) {
            eVar.cancel();
        }
        eVar.mo23905Q(new C4450a(dVar));
    }
}
