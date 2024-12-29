package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.C3544s;
import p056k5.C3300c;
import p073n5.C9733f;

/* renamed from: okhttp3.z */
public final class C3558z {

    /* renamed from: a */
    final C3546t f5910a;

    /* renamed from: b */
    final String f5911b;

    /* renamed from: c */
    final C3544s f5912c;
    @Nullable

    /* renamed from: d */
    final C3505a0 f5913d;

    /* renamed from: e */
    final Map<Class<?>, Object> f5914e;
    @Nullable

    /* renamed from: f */
    private volatile C3520d f5915f;

    /* renamed from: okhttp3.z$a */
    public static class C3559a {
        @Nullable

        /* renamed from: a */
        C3546t f5916a;

        /* renamed from: b */
        String f5917b;

        /* renamed from: c */
        C3544s.C3545a f5918c;
        @Nullable

        /* renamed from: d */
        C3505a0 f5919d;

        /* renamed from: e */
        Map<Class<?>, Object> f5920e;

        public C3559a() {
            this.f5920e = Collections.emptyMap();
            this.f5917b = "GET";
            this.f5918c = new C3544s.C3545a();
        }

        C3559a(C3558z zVar) {
            this.f5920e = Collections.emptyMap();
            this.f5916a = zVar.f5910a;
            this.f5917b = zVar.f5911b;
            this.f5919d = zVar.f5913d;
            this.f5920e = zVar.f5914e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(zVar.f5914e);
            this.f5918c = zVar.f5912c.mo24547f();
        }

        /* renamed from: a */
        public C3559a mo24662a(String str, String str2) {
            this.f5918c.mo24553a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C3558z mo24663b() {
            if (this.f5916a != null) {
                return new C3558z(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public C3559a mo24664c(String str, String str2) {
            this.f5918c.mo24559g(str, str2);
            return this;
        }

        /* renamed from: d */
        public C3559a mo24665d(C3544s sVar) {
            this.f5918c = sVar.mo24547f();
            return this;
        }

        /* renamed from: e */
        public C3559a mo24666e(String str, @Nullable C3505a0 a0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (a0Var != null && !C9733f.m23371b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (a0Var != null || !C9733f.m23374e(str)) {
                this.f5917b = str;
                this.f5919d = a0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: f */
        public C3559a mo24667f(String str) {
            this.f5918c.mo24558f(str);
            return this;
        }

        /* renamed from: g */
        public C3559a mo24668g(String str) {
            StringBuilder sb;
            int i;
            Objects.requireNonNull(str, "url == null");
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
                return mo24669h(C3546t.m9823l(str));
            }
            sb.append(str.substring(i));
            str = sb.toString();
            return mo24669h(C3546t.m9823l(str));
        }

        /* renamed from: h */
        public C3559a mo24669h(C3546t tVar) {
            Objects.requireNonNull(tVar, "url == null");
            this.f5916a = tVar;
            return this;
        }
    }

    C3558z(C3559a aVar) {
        this.f5910a = aVar.f5916a;
        this.f5911b = aVar.f5917b;
        this.f5912c = aVar.f5918c.mo24556d();
        this.f5913d = aVar.f5919d;
        this.f5914e = C3300c.m8936u(aVar.f5920e);
    }

    @Nullable
    /* renamed from: a */
    public C3505a0 mo24652a() {
        return this.f5913d;
    }

    /* renamed from: b */
    public C3520d mo24653b() {
        C3520d dVar = this.f5915f;
        if (dVar != null) {
            return dVar;
        }
        C3520d k = C3520d.m9651k(this.f5912c);
        this.f5915f = k;
        return k;
    }

    @Nullable
    /* renamed from: c */
    public String mo24654c(String str) {
        return this.f5912c.mo24544c(str);
    }

    /* renamed from: d */
    public List<String> mo24655d(String str) {
        return this.f5912c.mo24551j(str);
    }

    /* renamed from: e */
    public C3544s mo24656e() {
        return this.f5912c;
    }

    /* renamed from: f */
    public boolean mo24657f() {
        return this.f5910a.mo24574n();
    }

    /* renamed from: g */
    public String mo24658g() {
        return this.f5911b;
    }

    /* renamed from: h */
    public C3559a mo24659h() {
        return new C3559a(this);
    }

    /* renamed from: i */
    public C3546t mo24660i() {
        return this.f5910a;
    }

    public String toString() {
        return "Request{method=" + this.f5911b + ", url=" + this.f5910a + ", tags=" + this.f5914e + '}';
    }
}
