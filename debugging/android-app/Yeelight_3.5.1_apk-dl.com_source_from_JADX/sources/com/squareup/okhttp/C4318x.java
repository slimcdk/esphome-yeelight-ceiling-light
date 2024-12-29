package com.squareup.okhttp;

import com.squareup.okhttp.C4299p;
import java.util.Collections;
import java.util.List;
import p123a3.C3955k;

/* renamed from: com.squareup.okhttp.x */
public final class C4318x {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4312v f7081a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Protocol f7082b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f7083c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f7084d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4298o f7085e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4299p f7086f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4321y f7087g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4318x f7088h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4318x f7089i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4318x f7090j;

    /* renamed from: k */
    private volatile C4277d f7091k;

    /* renamed from: com.squareup.okhttp.x$b */
    public static class C4320b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4312v f7092a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Protocol f7093b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f7094c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7095d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C4298o f7096e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C4299p.C4301b f7097f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C4321y f7098g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C4318x f7099h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C4318x f7100i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C4318x f7101j;

        public C4320b() {
            this.f7094c = -1;
            this.f7097f = new C4299p.C4301b();
        }

        private C4320b(C4318x xVar) {
            this.f7094c = -1;
            this.f7092a = xVar.f7081a;
            this.f7093b = xVar.f7082b;
            this.f7094c = xVar.f7083c;
            this.f7095d = xVar.f7084d;
            this.f7096e = xVar.f7085e;
            this.f7097f = xVar.f7086f.mo27934e();
            this.f7098g = xVar.f7087g;
            this.f7099h = xVar.f7088h;
            this.f7100i = xVar.f7089i;
            this.f7101j = xVar.f7090j;
        }

        /* renamed from: o */
        private void m12205o(C4318x xVar) {
            if (xVar.f7087g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: p */
        private void m12206p(String str, C4318x xVar) {
            if (xVar.f7087g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (xVar.f7088h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (xVar.f7089i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (xVar.f7090j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: k */
        public C4320b mo28072k(String str, String str2) {
            this.f7097f.mo27939b(str, str2);
            return this;
        }

        /* renamed from: l */
        public C4320b mo28073l(C4321y yVar) {
            this.f7098g = yVar;
            return this;
        }

        /* renamed from: m */
        public C4318x mo28074m() {
            if (this.f7092a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f7093b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f7094c >= 0) {
                return new C4318x(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f7094c);
            }
        }

        /* renamed from: n */
        public C4320b mo28075n(C4318x xVar) {
            if (xVar != null) {
                m12206p("cacheResponse", xVar);
            }
            this.f7100i = xVar;
            return this;
        }

        /* renamed from: q */
        public C4320b mo28076q(int i) {
            this.f7094c = i;
            return this;
        }

        /* renamed from: r */
        public C4320b mo28077r(C4298o oVar) {
            this.f7096e = oVar;
            return this;
        }

        /* renamed from: s */
        public C4320b mo28078s(String str, String str2) {
            this.f7097f.mo27944h(str, str2);
            return this;
        }

        /* renamed from: t */
        public C4320b mo28079t(C4299p pVar) {
            this.f7097f = pVar.mo27934e();
            return this;
        }

        /* renamed from: u */
        public C4320b mo28080u(String str) {
            this.f7095d = str;
            return this;
        }

        /* renamed from: v */
        public C4320b mo28081v(C4318x xVar) {
            if (xVar != null) {
                m12206p("networkResponse", xVar);
            }
            this.f7099h = xVar;
            return this;
        }

        /* renamed from: w */
        public C4320b mo28082w(C4318x xVar) {
            if (xVar != null) {
                m12205o(xVar);
            }
            this.f7101j = xVar;
            return this;
        }

        /* renamed from: x */
        public C4320b mo28083x(Protocol protocol) {
            this.f7093b = protocol;
            return this;
        }

        /* renamed from: y */
        public C4320b mo28084y(C4312v vVar) {
            this.f7092a = vVar;
            return this;
        }
    }

    private C4318x(C4320b bVar) {
        this.f7081a = bVar.f7092a;
        this.f7082b = bVar.f7093b;
        this.f7083c = bVar.f7094c;
        this.f7084d = bVar.f7095d;
        this.f7085e = bVar.f7096e;
        this.f7086f = bVar.f7097f.mo27942e();
        this.f7087g = bVar.f7098g;
        this.f7088h = bVar.f7099h;
        this.f7089i = bVar.f7100i;
        this.f7090j = bVar.f7101j;
    }

    /* renamed from: k */
    public C4321y mo28056k() {
        return this.f7087g;
    }

    /* renamed from: l */
    public C4277d mo28057l() {
        C4277d dVar = this.f7091k;
        if (dVar != null) {
            return dVar;
        }
        C4277d k = C4277d.m11874k(this.f7086f);
        this.f7091k = k;
        return k;
    }

    /* renamed from: m */
    public C4318x mo28058m() {
        return this.f7089i;
    }

    /* renamed from: n */
    public List<C4288h> mo28059n() {
        String str;
        int i = this.f7083c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C3955k.m11387i(mo28064s(), str);
    }

    /* renamed from: o */
    public int mo28060o() {
        return this.f7083c;
    }

    /* renamed from: p */
    public C4298o mo28061p() {
        return this.f7085e;
    }

    /* renamed from: q */
    public String mo28062q(String str) {
        return mo28063r(str, (String) null);
    }

    /* renamed from: r */
    public String mo28063r(String str, String str2) {
        String a = this.f7086f.mo27931a(str);
        return a != null ? a : str2;
    }

    /* renamed from: s */
    public C4299p mo28064s() {
        return this.f7086f;
    }

    /* renamed from: t */
    public boolean mo28065t() {
        int i = this.f7083c;
        return i >= 200 && i < 300;
    }

    public String toString() {
        return "Response{protocol=" + this.f7082b + ", code=" + this.f7083c + ", message=" + this.f7084d + ", url=" + this.f7081a.mo28044r() + '}';
    }

    /* renamed from: u */
    public String mo28067u() {
        return this.f7084d;
    }

    /* renamed from: v */
    public C4318x mo28068v() {
        return this.f7088h;
    }

    /* renamed from: w */
    public C4320b mo28069w() {
        return new C4320b();
    }

    /* renamed from: x */
    public Protocol mo28070x() {
        return this.f7082b;
    }

    /* renamed from: y */
    public C4312v mo28071y() {
        return this.f7081a;
    }
}
