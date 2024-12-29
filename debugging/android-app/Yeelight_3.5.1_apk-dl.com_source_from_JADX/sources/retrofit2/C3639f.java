package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3548v;
import okhttp3.C9796e;
import okhttp3.C9798f;
import okio.C3564c;
import okio.C9838e;
import okio.C9841h;
import okio.C9845l;
import okio.C9853r;
import p177j7.C9216a;
import p177j7.C9217b;

/* renamed from: retrofit2.f */
final class C3639f<T> implements C9216a<T> {

    /* renamed from: a */
    private final C3670l<T, ?> f6075a;
    @Nullable

    /* renamed from: b */
    private final Object[] f6076b;

    /* renamed from: c */
    private volatile boolean f6077c;
    @GuardedBy("this")
    @Nullable

    /* renamed from: d */
    private C9796e f6078d;
    @GuardedBy("this")
    @Nullable

    /* renamed from: e */
    private Throwable f6079e;
    @GuardedBy("this")

    /* renamed from: f */
    private boolean f6080f;

    /* renamed from: retrofit2.f$a */
    class C3640a implements C9798f {

        /* renamed from: a */
        final /* synthetic */ C9217b f6081a;

        C3640a(C9217b bVar) {
            this.f6081a = bVar;
        }

        /* renamed from: c */
        private void m10394c(Throwable th) {
            try {
                this.f6081a.mo26576b(C3639f.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo25990a(C9796e eVar, C3509b0 b0Var) {
            try {
                try {
                    this.f6081a.mo26575a(C3639f.this, C3639f.this.mo25987c(b0Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                m10394c(th2);
            }
        }

        /* renamed from: b */
        public void mo25991b(C9796e eVar, IOException iOException) {
            m10394c(iOException);
        }
    }

    /* renamed from: retrofit2.f$b */
    static final class C3641b extends C3518c0 {

        /* renamed from: a */
        private final C3518c0 f6083a;

        /* renamed from: b */
        IOException f6084b;

        /* renamed from: retrofit2.f$b$a */
        class C3642a extends C9841h {
            C3642a(C9853r rVar) {
                super(rVar);
            }

            /* renamed from: R0 */
            public long mo24477R0(C3564c cVar, long j) {
                try {
                    return super.mo24477R0(cVar, j);
                } catch (IOException e) {
                    C3641b.this.f6084b = e;
                    throw e;
                }
            }
        }

        C3641b(C3518c0 c0Var) {
            this.f6083a = c0Var;
        }

        public void close() {
            this.f6083a.close();
        }

        /* renamed from: d */
        public long mo24148d() {
            return this.f6083a.mo24148d();
        }

        /* renamed from: f */
        public C3548v mo24149f() {
            return this.f6083a.mo24149f();
        }

        /* renamed from: k */
        public C9838e mo24150k() {
            return C9845l.m23738d(new C3642a(this.f6083a.mo24150k()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo25992l() {
            IOException iOException = this.f6084b;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: retrofit2.f$c */
    static final class C3643c extends C3518c0 {

        /* renamed from: a */
        private final C3548v f6086a;

        /* renamed from: b */
        private final long f6087b;

        C3643c(C3548v vVar, long j) {
            this.f6086a = vVar;
            this.f6087b = j;
        }

        /* renamed from: d */
        public long mo24148d() {
            return this.f6087b;
        }

        /* renamed from: f */
        public C3548v mo24149f() {
            return this.f6086a;
        }

        /* renamed from: k */
        public C9838e mo24150k() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C3639f(C3670l<T, ?> lVar, @Nullable Object[] objArr) {
        this.f6075a = lVar;
        this.f6076b = objArr;
    }

    /* renamed from: b */
    private C9796e m10388b() {
        C9796e d = this.f6075a.mo26063d(this.f6076b);
        Objects.requireNonNull(d, "Call.Factory returned null.");
        return d;
    }

    /* renamed from: H */
    public boolean mo25984H() {
        boolean z = true;
        if (this.f6077c) {
            return true;
        }
        synchronized (this) {
            C9796e eVar = this.f6078d;
            if (eVar == null || !eVar.mo24639H()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C3639f<T> clone() {
        return new C3639f<>(this.f6075a, this.f6076b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3666j<T> mo25987c(C3509b0 b0Var) {
        C3518c0 a = b0Var.mo24356a();
        C3509b0 c = b0Var.mo24367p().mo24374b(new C3643c(a.mo24149f(), a.mo24148d())).mo24375c();
        int d = c.mo24359d();
        if (d < 200 || d >= 300) {
            try {
                return C3666j.m10453c(C3672m.m10494a(a), c);
            } finally {
                a.close();
            }
        } else if (d == 204 || d == 205) {
            a.close();
            return C3666j.m10454f(null, c);
        } else {
            C3641b bVar = new C3641b(a);
            try {
                return C3666j.m10454f(this.f6075a.mo26064e(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo25992l();
                throw e;
            }
        }
    }

    /* renamed from: c0 */
    public void mo25988c0(C9217b<T> bVar) {
        C9796e eVar;
        Throwable th;
        C3672m.m10495b(bVar, "callback == null");
        synchronized (this) {
            if (!this.f6080f) {
                this.f6080f = true;
                eVar = this.f6078d;
                th = this.f6079e;
                if (eVar == null && th == null) {
                    try {
                        C9796e b = m10388b();
                        this.f6078d = b;
                        eVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C3672m.m10509p(th);
                        this.f6079e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            bVar.mo26576b(this, th);
            return;
        }
        if (this.f6077c) {
            eVar.cancel();
        }
        eVar.mo24647v(new C3640a(bVar));
    }
}
