package com.squareup.okhttp;

import com.squareup.okhttp.C4299p;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import p123a3.C3953i;

/* renamed from: com.squareup.okhttp.v */
public final class C4312v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4302q f7062a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f7063b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4299p f7064c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4315w f7065d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f7066e;

    /* renamed from: f */
    private volatile URL f7067f;

    /* renamed from: g */
    private volatile URI f7068g;

    /* renamed from: h */
    private volatile C4277d f7069h;

    /* renamed from: com.squareup.okhttp.v$b */
    public static class C4314b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4302q f7070a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f7071b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C4299p.C4301b f7072c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C4315w f7073d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f7074e;

        public C4314b() {
            this.f7071b = "GET";
            this.f7072c = new C4299p.C4301b();
        }

        private C4314b(C4312v vVar) {
            this.f7070a = vVar.f7062a;
            this.f7071b = vVar.f7063b;
            this.f7073d = vVar.f7065d;
            this.f7074e = vVar.f7066e;
            this.f7072c = vVar.f7064c.mo27934e();
        }

        /* renamed from: f */
        public C4314b mo28046f(String str, String str2) {
            this.f7072c.mo27939b(str, str2);
            return this;
        }

        /* renamed from: g */
        public C4312v mo28047g() {
            if (this.f7070a != null) {
                return new C4312v(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: h */
        public C4314b mo28048h(C4277d dVar) {
            String dVar2 = dVar.toString();
            return dVar2.isEmpty() ? mo28053m("Cache-Control") : mo28049i("Cache-Control", dVar2);
        }

        /* renamed from: i */
        public C4314b mo28049i(String str, String str2) {
            this.f7072c.mo27944h(str, str2);
            return this;
        }

        /* renamed from: j */
        public C4314b mo28050j(C4299p pVar) {
            this.f7072c = pVar.mo27934e();
            return this;
        }

        /* renamed from: k */
        public C4314b mo28051k(String str, C4315w wVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (wVar != null && !C3953i.m11367b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (wVar != null || !C3953i.m11368c(str)) {
                this.f7071b = str;
                this.f7073d = wVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: l */
        public C4314b mo28052l(C4315w wVar) {
            return mo28051k("POST", wVar);
        }

        /* renamed from: m */
        public C4314b mo28053m(String str) {
            this.f7072c.mo27943g(str);
            return this;
        }

        /* renamed from: n */
        public C4314b mo28054n(C4302q qVar) {
            if (qVar != null) {
                this.f7070a = qVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.squareup.okhttp.C4312v.C4314b mo28055o(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0061
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
                com.squareup.okhttp.q r0 = com.squareup.okhttp.C4302q.m12014u(r7)
                if (r0 == 0) goto L_0x004a
                com.squareup.okhttp.v$b r7 = r6.mo28054n(r0)
                return r7
            L_0x004a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x0061:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                goto L_0x006a
            L_0x0069:
                throw r7
            L_0x006a:
                goto L_0x0069
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4312v.C4314b.mo28055o(java.lang.String):com.squareup.okhttp.v$b");
        }
    }

    private C4312v(C4314b bVar) {
        this.f7062a = bVar.f7070a;
        this.f7063b = bVar.f7071b;
        this.f7064c = bVar.f7072c.mo27942e();
        this.f7065d = bVar.f7073d;
        this.f7066e = bVar.f7074e != null ? bVar.f7074e : this;
    }

    /* renamed from: f */
    public C4315w mo28032f() {
        return this.f7065d;
    }

    /* renamed from: g */
    public C4277d mo28033g() {
        C4277d dVar = this.f7069h;
        if (dVar != null) {
            return dVar;
        }
        C4277d k = C4277d.m11874k(this.f7064c);
        this.f7069h = k;
        return k;
    }

    /* renamed from: h */
    public String mo28034h(String str) {
        return this.f7064c.mo27931a(str);
    }

    /* renamed from: i */
    public C4299p mo28035i() {
        return this.f7064c;
    }

    /* renamed from: j */
    public List<String> mo28036j(String str) {
        return this.f7064c.mo27937i(str);
    }

    /* renamed from: k */
    public C4302q mo28037k() {
        return this.f7062a;
    }

    /* renamed from: l */
    public boolean mo28038l() {
        return this.f7062a.mo27960r();
    }

    /* renamed from: m */
    public String mo28039m() {
        return this.f7063b;
    }

    /* renamed from: n */
    public C4314b mo28040n() {
        return new C4314b();
    }

    /* renamed from: o */
    public Object mo28041o() {
        return this.f7066e;
    }

    /* renamed from: p */
    public URI mo28042p() {
        try {
            URI uri = this.f7068g;
            if (uri != null) {
                return uri;
            }
            URI F = this.f7062a.mo27949F();
            this.f7068g = F;
            return F;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: q */
    public URL mo28043q() {
        URL url = this.f7067f;
        if (url != null) {
            return url;
        }
        URL G = this.f7062a.mo27950G();
        this.f7067f = G;
        return G;
    }

    /* renamed from: r */
    public String mo28044r() {
        return this.f7062a.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f7063b);
        sb.append(", url=");
        sb.append(this.f7062a);
        sb.append(", tag=");
        Object obj = this.f7066e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
