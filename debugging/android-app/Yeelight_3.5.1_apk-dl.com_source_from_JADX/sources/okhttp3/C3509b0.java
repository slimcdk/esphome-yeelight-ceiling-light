package okhttp3;

import java.io.Closeable;
import javax.annotation.Nullable;
import okhttp3.C3544s;

/* renamed from: okhttp3.b0 */
public final class C3509b0 implements Closeable {

    /* renamed from: a */
    final C3558z f5622a;

    /* renamed from: b */
    final Protocol f5623b;

    /* renamed from: c */
    final int f5624c;

    /* renamed from: d */
    final String f5625d;
    @Nullable

    /* renamed from: e */
    final C3543r f5626e;

    /* renamed from: f */
    final C3544s f5627f;
    @Nullable

    /* renamed from: g */
    final C3518c0 f5628g;
    @Nullable

    /* renamed from: h */
    final C3509b0 f5629h;
    @Nullable

    /* renamed from: i */
    final C3509b0 f5630i;
    @Nullable

    /* renamed from: j */
    final C3509b0 f5631j;

    /* renamed from: k */
    final long f5632k;

    /* renamed from: l */
    final long f5633l;
    @Nullable

    /* renamed from: m */
    private volatile C3520d f5634m;

    /* renamed from: okhttp3.b0$a */
    public static class C3510a {
        @Nullable

        /* renamed from: a */
        C3558z f5635a;
        @Nullable

        /* renamed from: b */
        Protocol f5636b;

        /* renamed from: c */
        int f5637c;

        /* renamed from: d */
        String f5638d;
        @Nullable

        /* renamed from: e */
        C3543r f5639e;

        /* renamed from: f */
        C3544s.C3545a f5640f;
        @Nullable

        /* renamed from: g */
        C3518c0 f5641g;
        @Nullable

        /* renamed from: h */
        C3509b0 f5642h;
        @Nullable

        /* renamed from: i */
        C3509b0 f5643i;
        @Nullable

        /* renamed from: j */
        C3509b0 f5644j;

        /* renamed from: k */
        long f5645k;

        /* renamed from: l */
        long f5646l;

        public C3510a() {
            this.f5637c = -1;
            this.f5640f = new C3544s.C3545a();
        }

        C3510a(C3509b0 b0Var) {
            this.f5637c = -1;
            this.f5635a = b0Var.f5622a;
            this.f5636b = b0Var.f5623b;
            this.f5637c = b0Var.f5624c;
            this.f5638d = b0Var.f5625d;
            this.f5639e = b0Var.f5626e;
            this.f5640f = b0Var.f5627f.mo24547f();
            this.f5641g = b0Var.f5628g;
            this.f5642h = b0Var.f5629h;
            this.f5643i = b0Var.f5630i;
            this.f5644j = b0Var.f5631j;
            this.f5645k = b0Var.f5632k;
            this.f5646l = b0Var.f5633l;
        }

        /* renamed from: e */
        private void m9597e(C3509b0 b0Var) {
            if (b0Var.f5628g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m9598f(String str, C3509b0 b0Var) {
            if (b0Var.f5628g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (b0Var.f5629h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (b0Var.f5630i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (b0Var.f5631j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: a */
        public C3510a mo24373a(String str, String str2) {
            this.f5640f.mo24553a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C3510a mo24374b(@Nullable C3518c0 c0Var) {
            this.f5641g = c0Var;
            return this;
        }

        /* renamed from: c */
        public C3509b0 mo24375c() {
            if (this.f5635a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f5636b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f5637c < 0) {
                throw new IllegalStateException("code < 0: " + this.f5637c);
            } else if (this.f5638d != null) {
                return new C3509b0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: d */
        public C3510a mo24376d(@Nullable C3509b0 b0Var) {
            if (b0Var != null) {
                m9598f("cacheResponse", b0Var);
            }
            this.f5643i = b0Var;
            return this;
        }

        /* renamed from: g */
        public C3510a mo24377g(int i) {
            this.f5637c = i;
            return this;
        }

        /* renamed from: h */
        public C3510a mo24378h(@Nullable C3543r rVar) {
            this.f5639e = rVar;
            return this;
        }

        /* renamed from: i */
        public C3510a mo24379i(String str, String str2) {
            this.f5640f.mo24559g(str, str2);
            return this;
        }

        /* renamed from: j */
        public C3510a mo24380j(C3544s sVar) {
            this.f5640f = sVar.mo24547f();
            return this;
        }

        /* renamed from: k */
        public C3510a mo24381k(String str) {
            this.f5638d = str;
            return this;
        }

        /* renamed from: l */
        public C3510a mo24382l(@Nullable C3509b0 b0Var) {
            if (b0Var != null) {
                m9598f("networkResponse", b0Var);
            }
            this.f5642h = b0Var;
            return this;
        }

        /* renamed from: m */
        public C3510a mo24383m(@Nullable C3509b0 b0Var) {
            if (b0Var != null) {
                m9597e(b0Var);
            }
            this.f5644j = b0Var;
            return this;
        }

        /* renamed from: n */
        public C3510a mo24384n(Protocol protocol) {
            this.f5636b = protocol;
            return this;
        }

        /* renamed from: o */
        public C3510a mo24385o(long j) {
            this.f5646l = j;
            return this;
        }

        /* renamed from: p */
        public C3510a mo24386p(C3558z zVar) {
            this.f5635a = zVar;
            return this;
        }

        /* renamed from: q */
        public C3510a mo24387q(long j) {
            this.f5645k = j;
            return this;
        }
    }

    C3509b0(C3510a aVar) {
        this.f5622a = aVar.f5635a;
        this.f5623b = aVar.f5636b;
        this.f5624c = aVar.f5637c;
        this.f5625d = aVar.f5638d;
        this.f5626e = aVar.f5639e;
        this.f5627f = aVar.f5640f.mo24556d();
        this.f5628g = aVar.f5641g;
        this.f5629h = aVar.f5642h;
        this.f5630i = aVar.f5643i;
        this.f5631j = aVar.f5644j;
        this.f5632k = aVar.f5645k;
        this.f5633l = aVar.f5646l;
    }

    /* renamed from: A */
    public long mo24355A() {
        return this.f5632k;
    }

    @Nullable
    /* renamed from: a */
    public C3518c0 mo24356a() {
        return this.f5628g;
    }

    /* renamed from: c */
    public C3520d mo24357c() {
        C3520d dVar = this.f5634m;
        if (dVar != null) {
            return dVar;
        }
        C3520d k = C3520d.m9651k(this.f5627f);
        this.f5634m = k;
        return k;
    }

    public void close() {
        C3518c0 c0Var = this.f5628g;
        if (c0Var != null) {
            c0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public int mo24359d() {
        return this.f5624c;
    }

    @Nullable
    /* renamed from: f */
    public C3543r mo24360f() {
        return this.f5626e;
    }

    @Nullable
    /* renamed from: h */
    public String mo24361h(String str) {
        return mo24362i(str, (String) null);
    }

    @Nullable
    /* renamed from: i */
    public String mo24362i(String str, @Nullable String str2) {
        String c = this.f5627f.mo24544c(str);
        return c != null ? c : str2;
    }

    /* renamed from: k */
    public C3544s mo24363k() {
        return this.f5627f;
    }

    /* renamed from: l */
    public boolean mo24364l() {
        int i = this.f5624c;
        return i >= 200 && i < 300;
    }

    /* renamed from: m */
    public String mo24365m() {
        return this.f5625d;
    }

    @Nullable
    /* renamed from: n */
    public C3509b0 mo24366n() {
        return this.f5629h;
    }

    /* renamed from: p */
    public C3510a mo24367p() {
        return new C3510a(this);
    }

    @Nullable
    /* renamed from: q */
    public C3509b0 mo24368q() {
        return this.f5631j;
    }

    /* renamed from: s */
    public Protocol mo24369s() {
        return this.f5623b;
    }

    public String toString() {
        return "Response{protocol=" + this.f5623b + ", code=" + this.f5624c + ", message=" + this.f5625d + ", url=" + this.f5622a.mo24660i() + '}';
    }

    /* renamed from: v */
    public long mo24371v() {
        return this.f5633l;
    }

    /* renamed from: z */
    public C3558z mo24372z() {
        return this.f5622a;
    }
}
