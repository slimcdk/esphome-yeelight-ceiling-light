package p011c.p083d.p084a;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.p085d0.p087n.C1094i;

/* renamed from: c.d.a.x */
public final class C1144x {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1133r f1872a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f1873b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1130q f1874c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1147y f1875d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f1876e;

    /* renamed from: f */
    private volatile URL f1877f;

    /* renamed from: g */
    private volatile URI f1878g;

    /* renamed from: h */
    private volatile C1000d f1879h;

    /* renamed from: c.d.a.x$b */
    public static class C1146b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1133r f1880a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f1881b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1130q.C1132b f1882c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1147y f1883d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f1884e;

        public C1146b() {
            this.f1881b = "GET";
            this.f1882c = new C1130q.C1132b();
        }

        private C1146b(C1144x xVar) {
            this.f1880a = xVar.f1872a;
            this.f1881b = xVar.f1873b;
            this.f1883d = xVar.f1875d;
            this.f1884e = xVar.f1876e;
            this.f1882c = xVar.f1874c.mo9747e();
        }

        /* renamed from: f */
        public C1146b mo9847f(String str, String str2) {
            this.f1882c.mo9752b(str, str2);
            return this;
        }

        /* renamed from: g */
        public C1144x mo9848g() {
            if (this.f1880a != null) {
                return new C1144x(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: h */
        public C1146b mo9849h(C1000d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                mo9854m("Cache-Control");
                return this;
            }
            mo9850i("Cache-Control", dVar2);
            return this;
        }

        /* renamed from: i */
        public C1146b mo9850i(String str, String str2) {
            this.f1882c.mo9757h(str, str2);
            return this;
        }

        /* renamed from: j */
        public C1146b mo9851j(C1130q qVar) {
            this.f1882c = qVar.mo9747e();
            return this;
        }

        /* renamed from: k */
        public C1146b mo9852k(String str, C1147y yVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (yVar != null && !C1094i.m2509b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (yVar != null || !C1094i.m2510c(str)) {
                this.f1881b = str;
                this.f1883d = yVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: l */
        public C1146b mo9853l(C1147y yVar) {
            mo9852k("POST", yVar);
            return this;
        }

        /* renamed from: m */
        public C1146b mo9854m(String str) {
            this.f1882c.mo9756g(str);
            return this;
        }

        /* renamed from: n */
        public C1146b mo9855n(C1133r rVar) {
            if (rVar != null) {
                this.f1880a = rVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p011c.p083d.p084a.C1144x.C1146b mo9856o(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0060
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x0026
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
            L_0x001a:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L_0x003f
            L_0x0026:
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 4
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x003f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                goto L_0x001a
            L_0x003f:
                c.d.a.r r0 = p011c.p083d.p084a.C1133r.m2734u(r7)
                if (r0 == 0) goto L_0x0049
                r6.mo9855n(r0)
                return r6
            L_0x0049:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x0060:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                goto L_0x0069
            L_0x0068:
                throw r7
            L_0x0069:
                goto L_0x0068
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1144x.C1146b.mo9856o(java.lang.String):c.d.a.x$b");
        }
    }

    private C1144x(C1146b bVar) {
        this.f1872a = bVar.f1880a;
        this.f1873b = bVar.f1881b;
        this.f1874c = bVar.f1882c.mo9755e();
        this.f1875d = bVar.f1883d;
        this.f1876e = bVar.f1884e != null ? bVar.f1884e : this;
    }

    /* renamed from: f */
    public C1147y mo9833f() {
        return this.f1875d;
    }

    /* renamed from: g */
    public C1000d mo9834g() {
        C1000d dVar = this.f1879h;
        if (dVar != null) {
            return dVar;
        }
        C1000d k = C1000d.m1957k(this.f1874c);
        this.f1879h = k;
        return k;
    }

    /* renamed from: h */
    public String mo9835h(String str) {
        return this.f1874c.mo9744a(str);
    }

    /* renamed from: i */
    public C1130q mo9836i() {
        return this.f1874c;
    }

    /* renamed from: j */
    public List<String> mo9837j(String str) {
        return this.f1874c.mo9750i(str);
    }

    /* renamed from: k */
    public C1133r mo9838k() {
        return this.f1872a;
    }

    /* renamed from: l */
    public boolean mo9839l() {
        return this.f1872a.mo9773r();
    }

    /* renamed from: m */
    public String mo9840m() {
        return this.f1873b;
    }

    /* renamed from: n */
    public C1146b mo9841n() {
        return new C1146b();
    }

    /* renamed from: o */
    public Object mo9842o() {
        return this.f1876e;
    }

    /* renamed from: p */
    public URI mo9843p() {
        try {
            URI uri = this.f1878g;
            if (uri != null) {
                return uri;
            }
            URI F = this.f1872a.mo9762F();
            this.f1878g = F;
            return F;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: q */
    public URL mo9844q() {
        URL url = this.f1877f;
        if (url != null) {
            return url;
        }
        URL G = this.f1872a.mo9763G();
        this.f1877f = G;
        return G;
    }

    /* renamed from: r */
    public String mo9845r() {
        return this.f1872a.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f1873b);
        sb.append(", url=");
        sb.append(this.f1872a);
        sb.append(", tag=");
        Object obj = this.f1876e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
