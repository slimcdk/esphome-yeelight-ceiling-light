package p156f;

import java.io.Closeable;
import javax.annotation.Nullable;
import p156f.C4388s;

/* renamed from: f.c0 */
public final class C4332c0 implements Closeable {

    /* renamed from: a */
    final C4318a0 f7579a;

    /* renamed from: b */
    final C10835y f7580b;

    /* renamed from: c */
    final int f7581c;

    /* renamed from: d */
    final String f7582d;
    @Nullable

    /* renamed from: e */
    final C4387r f7583e;

    /* renamed from: f */
    final C4388s f7584f;
    @Nullable

    /* renamed from: g */
    final C4336d0 f7585g;
    @Nullable

    /* renamed from: h */
    final C4332c0 f7586h;
    @Nullable

    /* renamed from: i */
    final C4332c0 f7587i;
    @Nullable

    /* renamed from: j */
    final C4332c0 f7588j;

    /* renamed from: k */
    final long f7589k;

    /* renamed from: l */
    final long f7590l;
    @Nullable

    /* renamed from: m */
    private volatile C4334d f7591m;

    /* renamed from: f.c0$a */
    public static class C4333a {
        @Nullable

        /* renamed from: a */
        C4318a0 f7592a;
        @Nullable

        /* renamed from: b */
        C10835y f7593b;

        /* renamed from: c */
        int f7594c;

        /* renamed from: d */
        String f7595d;
        @Nullable

        /* renamed from: e */
        C4387r f7596e;

        /* renamed from: f */
        C4388s.C4389a f7597f;
        @Nullable

        /* renamed from: g */
        C4336d0 f7598g;
        @Nullable

        /* renamed from: h */
        C4332c0 f7599h;
        @Nullable

        /* renamed from: i */
        C4332c0 f7600i;
        @Nullable

        /* renamed from: j */
        C4332c0 f7601j;

        /* renamed from: k */
        long f7602k;

        /* renamed from: l */
        long f7603l;

        public C4333a() {
            this.f7594c = -1;
            this.f7597f = new C4388s.C4389a();
        }

        C4333a(C4332c0 c0Var) {
            this.f7594c = -1;
            this.f7592a = c0Var.f7579a;
            this.f7593b = c0Var.f7580b;
            this.f7594c = c0Var.f7581c;
            this.f7595d = c0Var.f7582d;
            this.f7596e = c0Var.f7583e;
            this.f7597f = c0Var.f7584f.mo24088f();
            this.f7598g = c0Var.f7585g;
            this.f7599h = c0Var.f7586h;
            this.f7600i = c0Var.f7587i;
            this.f7601j = c0Var.f7588j;
            this.f7602k = c0Var.f7589k;
            this.f7603l = c0Var.f7590l;
        }

        /* renamed from: e */
        private void m12273e(C4332c0 c0Var) {
            if (c0Var.f7585g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m12274f(String str, C4332c0 c0Var) {
            if (c0Var.f7585g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (c0Var.f7586h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (c0Var.f7587i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (c0Var.f7588j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: a */
        public C4333a mo23870a(String str, String str2) {
            this.f7597f.mo24094a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C4333a mo23871b(@Nullable C4336d0 d0Var) {
            this.f7598g = d0Var;
            return this;
        }

        /* renamed from: c */
        public C4332c0 mo23872c() {
            if (this.f7592a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f7593b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f7594c < 0) {
                throw new IllegalStateException("code < 0: " + this.f7594c);
            } else if (this.f7595d != null) {
                return new C4332c0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: d */
        public C4333a mo23873d(@Nullable C4332c0 c0Var) {
            if (c0Var != null) {
                m12274f("cacheResponse", c0Var);
            }
            this.f7600i = c0Var;
            return this;
        }

        /* renamed from: g */
        public C4333a mo23874g(int i) {
            this.f7594c = i;
            return this;
        }

        /* renamed from: h */
        public C4333a mo23875h(@Nullable C4387r rVar) {
            this.f7596e = rVar;
            return this;
        }

        /* renamed from: i */
        public C4333a mo23876i(String str, String str2) {
            this.f7597f.mo24100g(str, str2);
            return this;
        }

        /* renamed from: j */
        public C4333a mo23877j(C4388s sVar) {
            this.f7597f = sVar.mo24088f();
            return this;
        }

        /* renamed from: k */
        public C4333a mo23878k(String str) {
            this.f7595d = str;
            return this;
        }

        /* renamed from: l */
        public C4333a mo23879l(@Nullable C4332c0 c0Var) {
            if (c0Var != null) {
                m12274f("networkResponse", c0Var);
            }
            this.f7599h = c0Var;
            return this;
        }

        /* renamed from: m */
        public C4333a mo23880m(@Nullable C4332c0 c0Var) {
            if (c0Var != null) {
                m12273e(c0Var);
            }
            this.f7601j = c0Var;
            return this;
        }

        /* renamed from: n */
        public C4333a mo23881n(C10835y yVar) {
            this.f7593b = yVar;
            return this;
        }

        /* renamed from: o */
        public C4333a mo23882o(long j) {
            this.f7603l = j;
            return this;
        }

        /* renamed from: p */
        public C4333a mo23883p(C4318a0 a0Var) {
            this.f7592a = a0Var;
            return this;
        }

        /* renamed from: q */
        public C4333a mo23884q(long j) {
            this.f7602k = j;
            return this;
        }
    }

    C4332c0(C4333a aVar) {
        this.f7579a = aVar.f7592a;
        this.f7580b = aVar.f7593b;
        this.f7581c = aVar.f7594c;
        this.f7582d = aVar.f7595d;
        this.f7583e = aVar.f7596e;
        this.f7584f = aVar.f7597f.mo24097d();
        this.f7585g = aVar.f7598g;
        this.f7586h = aVar.f7599h;
        this.f7587i = aVar.f7600i;
        this.f7588j = aVar.f7601j;
        this.f7589k = aVar.f7602k;
        this.f7590l = aVar.f7603l;
    }

    @Nullable
    /* renamed from: C */
    public C4332c0 mo23852C() {
        return this.f7588j;
    }

    /* renamed from: D */
    public C10835y mo23853D() {
        return this.f7580b;
    }

    /* renamed from: F */
    public long mo23854F() {
        return this.f7590l;
    }

    /* renamed from: I */
    public C4318a0 mo23855I() {
        return this.f7579a;
    }

    /* renamed from: J */
    public long mo23856J() {
        return this.f7589k;
    }

    @Nullable
    /* renamed from: a */
    public C4336d0 mo23857a() {
        return this.f7585g;
    }

    /* renamed from: b */
    public C4334d mo23858b() {
        C4334d dVar = this.f7591m;
        if (dVar != null) {
            return dVar;
        }
        C4334d k = C4334d.m12291k(this.f7584f);
        this.f7591m = k;
        return k;
    }

    public void close() {
        C4336d0 d0Var = this.f7585g;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: g */
    public int mo23860g() {
        return this.f7581c;
    }

    @Nullable
    /* renamed from: h */
    public C4387r mo23861h() {
        return this.f7583e;
    }

    @Nullable
    /* renamed from: i */
    public String mo23862i(String str) {
        return mo23863j(str, (String) null);
    }

    @Nullable
    /* renamed from: j */
    public String mo23863j(String str, @Nullable String str2) {
        String c = this.f7584f.mo24085c(str);
        return c != null ? c : str2;
    }

    /* renamed from: n */
    public C4388s mo23864n() {
        return this.f7584f;
    }

    /* renamed from: o */
    public boolean mo23865o() {
        int i = this.f7581c;
        return i >= 200 && i < 300;
    }

    /* renamed from: s */
    public String mo23866s() {
        return this.f7582d;
    }

    @Nullable
    /* renamed from: t */
    public C4332c0 mo23867t() {
        return this.f7586h;
    }

    public String toString() {
        return "Response{protocol=" + this.f7580b + ", code=" + this.f7581c + ", message=" + this.f7582d + ", url=" + this.f7579a.mo23815i() + '}';
    }

    /* renamed from: u */
    public C4333a mo23869u() {
        return new C4333a(this);
    }
}
