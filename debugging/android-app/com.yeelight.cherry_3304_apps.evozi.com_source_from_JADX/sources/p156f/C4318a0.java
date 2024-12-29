package p156f;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import p156f.C4388s;
import p156f.p157g0.C4345c;
import p156f.p157g0.p160g.C10772f;

/* renamed from: f.a0 */
public final class C4318a0 {

    /* renamed from: a */
    final C4390t f7527a;

    /* renamed from: b */
    final String f7528b;

    /* renamed from: c */
    final C4388s f7529c;
    @Nullable

    /* renamed from: d */
    final C4322b0 f7530d;

    /* renamed from: e */
    final Map<Class<?>, Object> f7531e;
    @Nullable

    /* renamed from: f */
    private volatile C4334d f7532f;

    /* renamed from: f.a0$a */
    public static class C4319a {
        @Nullable

        /* renamed from: a */
        C4390t f7533a;

        /* renamed from: b */
        String f7534b;

        /* renamed from: c */
        C4388s.C4389a f7535c;
        @Nullable

        /* renamed from: d */
        C4322b0 f7536d;

        /* renamed from: e */
        Map<Class<?>, Object> f7537e;

        public C4319a() {
            this.f7537e = Collections.emptyMap();
            this.f7534b = "GET";
            this.f7535c = new C4388s.C4389a();
        }

        C4319a(C4318a0 a0Var) {
            this.f7537e = Collections.emptyMap();
            this.f7533a = a0Var.f7527a;
            this.f7534b = a0Var.f7528b;
            this.f7536d = a0Var.f7530d;
            this.f7537e = a0Var.f7531e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(a0Var.f7531e);
            this.f7535c = a0Var.f7529c.mo24088f();
        }

        /* renamed from: a */
        public C4319a mo23817a(String str, String str2) {
            this.f7535c.mo24094a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C4318a0 mo23818b() {
            if (this.f7533a != null) {
                return new C4318a0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public C4319a mo23819c(C4334d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                mo23823g("Cache-Control");
                return this;
            }
            mo23820d("Cache-Control", dVar2);
            return this;
        }

        /* renamed from: d */
        public C4319a mo23820d(String str, String str2) {
            this.f7535c.mo24100g(str, str2);
            return this;
        }

        /* renamed from: e */
        public C4319a mo23821e(C4388s sVar) {
            this.f7535c = sVar.mo24088f();
            return this;
        }

        /* renamed from: f */
        public C4319a mo23822f(String str, @Nullable C4322b0 b0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (b0Var != null && !C10772f.m26701b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (b0Var != null || !C10772f.m26704e(str)) {
                this.f7534b = str;
                this.f7536d = b0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: g */
        public C4319a mo23823g(String str) {
            this.f7535c.mo24099f(str);
            return this;
        }

        /* renamed from: h */
        public C4319a mo23824h(String str) {
            StringBuilder sb;
            int i;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb = new StringBuilder();
                    sb.append("http:");
                    i = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb = new StringBuilder();
                        sb.append("https:");
                        i = 4;
                    }
                    mo23825i(C4390t.m12622l(str));
                    return this;
                }
                sb.append(str.substring(i));
                str = sb.toString();
                mo23825i(C4390t.m12622l(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: i */
        public C4319a mo23825i(C4390t tVar) {
            if (tVar != null) {
                this.f7533a = tVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    C4318a0(C4319a aVar) {
        this.f7527a = aVar.f7533a;
        this.f7528b = aVar.f7534b;
        this.f7529c = aVar.f7535c.mo24097d();
        this.f7530d = aVar.f7536d;
        this.f7531e = C4345c.m12375v(aVar.f7537e);
    }

    @Nullable
    /* renamed from: a */
    public C4322b0 mo23807a() {
        return this.f7530d;
    }

    /* renamed from: b */
    public C4334d mo23808b() {
        C4334d dVar = this.f7532f;
        if (dVar != null) {
            return dVar;
        }
        C4334d k = C4334d.m12291k(this.f7529c);
        this.f7532f = k;
        return k;
    }

    @Nullable
    /* renamed from: c */
    public String mo23809c(String str) {
        return this.f7529c.mo24085c(str);
    }

    /* renamed from: d */
    public List<String> mo23810d(String str) {
        return this.f7529c.mo24092j(str);
    }

    /* renamed from: e */
    public C4388s mo23811e() {
        return this.f7529c;
    }

    /* renamed from: f */
    public boolean mo23812f() {
        return this.f7527a.mo24115n();
    }

    /* renamed from: g */
    public String mo23813g() {
        return this.f7528b;
    }

    /* renamed from: h */
    public C4319a mo23814h() {
        return new C4319a(this);
    }

    /* renamed from: i */
    public C4390t mo23815i() {
        return this.f7527a;
    }

    public String toString() {
        return "Request{method=" + this.f7528b + ", url=" + this.f7527a + ", tags=" + this.f7531e + '}';
    }
}
