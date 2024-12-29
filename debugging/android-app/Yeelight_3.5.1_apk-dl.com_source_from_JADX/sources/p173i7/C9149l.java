package p173i7;

import com.squareup.okhttp.C4280e;
import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import java.io.IOException;
import okio.C3564c;
import okio.C9838e;
import okio.C9841h;
import okio.C9845l;
import okio.C9853r;

/* renamed from: i7.l */
final class C9149l<T> implements C9135c<T> {

    /* renamed from: a */
    private final C9173s f16920a;

    /* renamed from: b */
    private final C9170p f16921b;

    /* renamed from: c */
    private final C9138e<C4321y, T> f16922c;

    /* renamed from: d */
    private final Object[] f16923d;

    /* renamed from: e */
    private boolean f16924e;

    /* renamed from: f */
    private volatile boolean f16925f;

    /* renamed from: i7.l$a */
    static final class C9150a extends C4321y {

        /* renamed from: b */
        private final C4321y f16926b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public IOException f16927c;

        /* renamed from: i7.l$a$a */
        class C9151a extends C9841h {
            C9151a(C9853r rVar) {
                super(rVar);
            }

            /* renamed from: R0 */
            public long mo24477R0(C3564c cVar, long j) {
                try {
                    return super.mo24477R0(cVar, j);
                } catch (IOException e) {
                    IOException unused = C9150a.this.f16927c = e;
                    throw e;
                }
            }
        }

        C9150a(C4321y yVar) {
            this.f16926b = yVar;
        }

        public void close() {
            this.f16926b.close();
        }

        /* renamed from: h */
        public long mo26479h() {
            try {
                return this.f16926b.mo26479h();
            } catch (IOException e) {
                this.f16927c = e;
                throw e;
            }
        }

        /* renamed from: i */
        public C4307s mo26480i() {
            return this.f16926b.mo26480i();
        }

        /* renamed from: m */
        public C9838e mo26481m() {
            try {
                return C9845l.m23738d(new C9151a(this.f16926b.mo26481m()));
            } catch (IOException e) {
                this.f16927c = e;
                throw e;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo37232q() {
            IOException iOException = this.f16927c;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: i7.l$b */
    static final class C9152b extends C4321y {

        /* renamed from: b */
        private final C4307s f16929b;

        /* renamed from: c */
        private final long f16930c;

        C9152b(C4307s sVar, long j) {
            this.f16929b = sVar;
            this.f16930c = j;
        }

        /* renamed from: h */
        public long mo26479h() {
            return this.f16930c;
        }

        /* renamed from: i */
        public C4307s mo26480i() {
            return this.f16929b;
        }

        /* renamed from: m */
        public C9838e mo26481m() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C9149l(C9173s sVar, C9170p pVar, C9138e<C4321y, T> eVar, Object[] objArr) {
        this.f16920a = sVar;
        this.f16921b = pVar;
        this.f16922c = eVar;
        this.f16923d = objArr;
    }

    /* renamed from: b */
    private C4280e m21979b() {
        return this.f16920a.mo37254c().mo27990M(this.f16921b.mo37246a(this.f16923d));
    }

    /* renamed from: c */
    private C9172r<T> m21980c(C4318x xVar) {
        C4321y k = xVar.mo28056k();
        C4318x m = xVar.mo28069w().mo28073l(new C9152b(k.mo26480i(), k.mo26479h())).mo28074m();
        int o = m.mo28060o();
        if (o < 200 || o >= 300) {
            try {
                return C9172r.m22036c(C9177t.m22069j(k), m);
            } finally {
                C9177t.m22061b(k);
            }
        } else if (o == 204 || o == 205) {
            return C9172r.m22037g(null, m);
        } else {
            C9150a aVar = new C9150a(k);
            try {
                return C9172r.m22037g(this.f16922c.convert(aVar), m);
            } catch (RuntimeException e) {
                aVar.mo37232q();
                throw e;
            }
        }
    }

    /* renamed from: J */
    public C9172r<T> mo37223J() {
        synchronized (this) {
            if (!this.f16924e) {
                this.f16924e = true;
            } else {
                throw new IllegalStateException("Already executed");
            }
        }
        C4280e b = m21979b();
        if (this.f16925f) {
            b.mo27850d();
        }
        return m21980c(b.mo27853g());
    }

    /* renamed from: a */
    public C9149l<T> clone() {
        return new C9149l<>(this.f16920a, this.f16921b, this.f16922c, this.f16923d);
    }
}
