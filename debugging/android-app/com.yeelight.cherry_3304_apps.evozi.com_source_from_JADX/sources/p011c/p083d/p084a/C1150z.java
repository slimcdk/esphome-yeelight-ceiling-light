package p011c.p083d.p084a;

import java.util.Collections;
import java.util.List;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.p085d0.p087n.C1096k;

/* renamed from: c.d.a.z */
public final class C1150z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1144x f1891a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1143w f1892b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f1893c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f1894d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1129p f1895e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1130q f1896f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0988a0 f1897g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1150z f1898h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1150z f1899i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1150z f1900j;

    /* renamed from: k */
    private volatile C1000d f1901k;

    /* renamed from: c.d.a.z$b */
    public static class C1152b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1144x f1902a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1143w f1903b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1904c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f1905d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C1129p f1906e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1130q.C1132b f1907f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C0988a0 f1908g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C1150z f1909h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C1150z f1910i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1150z f1911j;

        public C1152b() {
            this.f1904c = -1;
            this.f1907f = new C1130q.C1132b();
        }

        private C1152b(C1150z zVar) {
            this.f1904c = -1;
            this.f1902a = zVar.f1891a;
            this.f1903b = zVar.f1892b;
            this.f1904c = zVar.f1893c;
            this.f1905d = zVar.f1894d;
            this.f1906e = zVar.f1895e;
            this.f1907f = zVar.f1896f.mo9747e();
            this.f1908g = zVar.f1897g;
            this.f1909h = zVar.f1898h;
            this.f1910i = zVar.f1899i;
            this.f1911j = zVar.f1900j;
        }

        /* renamed from: o */
        private void m2926o(C1150z zVar) {
            if (zVar.f1897g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: p */
        private void m2927p(String str, C1150z zVar) {
            if (zVar.f1897g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (zVar.f1898h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (zVar.f1899i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (zVar.f1900j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: k */
        public C1152b mo9873k(String str, String str2) {
            this.f1907f.mo9752b(str, str2);
            return this;
        }

        /* renamed from: l */
        public C1152b mo9874l(C0988a0 a0Var) {
            this.f1908g = a0Var;
            return this;
        }

        /* renamed from: m */
        public C1150z mo9875m() {
            if (this.f1902a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f1903b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f1904c >= 0) {
                return new C1150z(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f1904c);
            }
        }

        /* renamed from: n */
        public C1152b mo9876n(C1150z zVar) {
            if (zVar != null) {
                m2927p("cacheResponse", zVar);
            }
            this.f1910i = zVar;
            return this;
        }

        /* renamed from: q */
        public C1152b mo9877q(int i) {
            this.f1904c = i;
            return this;
        }

        /* renamed from: r */
        public C1152b mo9878r(C1129p pVar) {
            this.f1906e = pVar;
            return this;
        }

        /* renamed from: s */
        public C1152b mo9879s(String str, String str2) {
            this.f1907f.mo9757h(str, str2);
            return this;
        }

        /* renamed from: t */
        public C1152b mo9880t(C1130q qVar) {
            this.f1907f = qVar.mo9747e();
            return this;
        }

        /* renamed from: u */
        public C1152b mo9881u(String str) {
            this.f1905d = str;
            return this;
        }

        /* renamed from: v */
        public C1152b mo9882v(C1150z zVar) {
            if (zVar != null) {
                m2927p("networkResponse", zVar);
            }
            this.f1909h = zVar;
            return this;
        }

        /* renamed from: w */
        public C1152b mo9883w(C1150z zVar) {
            if (zVar != null) {
                m2926o(zVar);
            }
            this.f1911j = zVar;
            return this;
        }

        /* renamed from: x */
        public C1152b mo9884x(C1143w wVar) {
            this.f1903b = wVar;
            return this;
        }

        /* renamed from: y */
        public C1152b mo9885y(C1144x xVar) {
            this.f1902a = xVar;
            return this;
        }
    }

    private C1150z(C1152b bVar) {
        this.f1891a = bVar.f1902a;
        this.f1892b = bVar.f1903b;
        this.f1893c = bVar.f1904c;
        this.f1894d = bVar.f1905d;
        this.f1895e = bVar.f1906e;
        this.f1896f = bVar.f1907f.mo9755e();
        this.f1897g = bVar.f1908g;
        this.f1898h = bVar.f1909h;
        this.f1899i = bVar.f1910i;
        this.f1900j = bVar.f1911j;
    }

    /* renamed from: k */
    public C0988a0 mo9857k() {
        return this.f1897g;
    }

    /* renamed from: l */
    public C1000d mo9858l() {
        C1000d dVar = this.f1901k;
        if (dVar != null) {
            return dVar;
        }
        C1000d k = C1000d.m1957k(this.f1896f);
        this.f1901k = k;
        return k;
    }

    /* renamed from: m */
    public C1150z mo9859m() {
        return this.f1899i;
    }

    /* renamed from: n */
    public List<C1118h> mo9860n() {
        String str;
        int i = this.f1893c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C1096k.m2529i(mo9865s(), str);
    }

    /* renamed from: o */
    public int mo9861o() {
        return this.f1893c;
    }

    /* renamed from: p */
    public C1129p mo9862p() {
        return this.f1895e;
    }

    /* renamed from: q */
    public String mo9863q(String str) {
        return mo9864r(str, (String) null);
    }

    /* renamed from: r */
    public String mo9864r(String str, String str2) {
        String a = this.f1896f.mo9744a(str);
        return a != null ? a : str2;
    }

    /* renamed from: s */
    public C1130q mo9865s() {
        return this.f1896f;
    }

    /* renamed from: t */
    public boolean mo9866t() {
        int i = this.f1893c;
        return i >= 200 && i < 300;
    }

    public String toString() {
        return "Response{protocol=" + this.f1892b + ", code=" + this.f1893c + ", message=" + this.f1894d + ", url=" + this.f1891a.mo9845r() + '}';
    }

    /* renamed from: u */
    public String mo9868u() {
        return this.f1894d;
    }

    /* renamed from: v */
    public C1150z mo9869v() {
        return this.f1898h;
    }

    /* renamed from: w */
    public C1152b mo9870w() {
        return new C1152b();
    }

    /* renamed from: x */
    public C1143w mo9871x() {
        return this.f1892b;
    }

    /* renamed from: y */
    public C1144x mo9872y() {
        return this.f1891a;
    }
}
