package p156f;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import p156f.p157g0.C4345c;

/* renamed from: f.k */
public final class C4377k {

    /* renamed from: e */
    private static final C10827h[] f7786e = {C10827h.f20884q, C10827h.f20885r, C10827h.f20886s, C10827h.f20887t, C10827h.f20888u, C10827h.f20878k, C10827h.f20880m, C10827h.f20879l, C10827h.f20881n, C10827h.f20883p, C10827h.f20882o};

    /* renamed from: f */
    private static final C10827h[] f7787f = {C10827h.f20884q, C10827h.f20885r, C10827h.f20886s, C10827h.f20887t, C10827h.f20888u, C10827h.f20878k, C10827h.f20880m, C10827h.f20879l, C10827h.f20881n, C10827h.f20883p, C10827h.f20882o, C10827h.f20876i, C10827h.f20877j, C10827h.f20874g, C10827h.f20875h, C10827h.f20872e, C10827h.f20873f, C10827h.f20871d};

    /* renamed from: g */
    public static final C4377k f7788g;

    /* renamed from: h */
    public static final C4377k f7789h = new C4378a(false).mo24037a();

    /* renamed from: a */
    final boolean f7790a;

    /* renamed from: b */
    final boolean f7791b;
    @Nullable

    /* renamed from: c */
    final String[] f7792c;
    @Nullable

    /* renamed from: d */
    final String[] f7793d;

    /* renamed from: f.k$a */
    public static final class C4378a {

        /* renamed from: a */
        boolean f7794a;
        @Nullable

        /* renamed from: b */
        String[] f7795b;
        @Nullable

        /* renamed from: c */
        String[] f7796c;

        /* renamed from: d */
        boolean f7797d;

        public C4378a(C4377k kVar) {
            this.f7794a = kVar.f7790a;
            this.f7795b = kVar.f7792c;
            this.f7796c = kVar.f7793d;
            this.f7797d = kVar.f7791b;
        }

        C4378a(boolean z) {
            this.f7794a = z;
        }

        /* renamed from: a */
        public C4377k mo24037a() {
            return new C4377k(this);
        }

        /* renamed from: b */
        public C4378a mo24038b(String... strArr) {
            if (!this.f7794a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f7795b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C4378a mo24039c(C10827h... hVarArr) {
            if (this.f7794a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f20889a;
                }
                mo24038b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public C4378a mo24040d(boolean z) {
            if (this.f7794a) {
                this.f7797d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C4378a mo24041e(String... strArr) {
            if (!this.f7794a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f7796c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: f */
        public C4378a mo24042f(C10749f0... f0VarArr) {
            if (this.f7794a) {
                String[] strArr = new String[f0VarArr.length];
                for (int i = 0; i < f0VarArr.length; i++) {
                    strArr[i] = f0VarArr[i].f20628a;
                }
                mo24041e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        C4378a aVar = new C4378a(true);
        aVar.mo24039c(f7786e);
        aVar.mo24042f(C10749f0.TLS_1_3, C10749f0.TLS_1_2);
        aVar.mo24040d(true);
        aVar.mo24037a();
        C4378a aVar2 = new C4378a(true);
        aVar2.mo24039c(f7787f);
        aVar2.mo24042f(C10749f0.TLS_1_3, C10749f0.TLS_1_2, C10749f0.TLS_1_1, C10749f0.TLS_1_0);
        aVar2.mo24040d(true);
        f7788g = aVar2.mo24037a();
        C4378a aVar3 = new C4378a(true);
        aVar3.mo24039c(f7787f);
        aVar3.mo24042f(C10749f0.TLS_1_0);
        aVar3.mo24040d(true);
        aVar3.mo24037a();
    }

    C4377k(C4378a aVar) {
        this.f7790a = aVar.f7794a;
        this.f7792c = aVar.f7795b;
        this.f7793d = aVar.f7796c;
        this.f7791b = aVar.f7797d;
    }

    /* renamed from: e */
    private C4377k m12530e(SSLSocket sSLSocket, boolean z) {
        String[] z2 = this.f7792c != null ? C4345c.m12379z(C10827h.f20869b, sSLSocket.getEnabledCipherSuites(), this.f7792c) : sSLSocket.getEnabledCipherSuites();
        String[] z3 = this.f7793d != null ? C4345c.m12379z(C4345c.f7654o, sSLSocket.getEnabledProtocols(), this.f7793d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int w = C4345c.m12376w(C10827h.f20869b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && w != -1) {
            z2 = C4345c.m12362i(z2, supportedCipherSuites[w]);
        }
        C4378a aVar = new C4378a(this);
        aVar.mo24038b(z2);
        aVar.mo24041e(z3);
        return aVar.mo24037a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24028a(SSLSocket sSLSocket, boolean z) {
        C4377k e = m12530e(sSLSocket, z);
        String[] strArr = e.f7793d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e.f7792c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    /* renamed from: b */
    public List<C10827h> mo24029b() {
        String[] strArr = this.f7792c;
        if (strArr != null) {
            return C10827h.m26956b(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo24030c(SSLSocket sSLSocket) {
        if (!this.f7790a) {
            return false;
        }
        String[] strArr = this.f7793d;
        if (strArr != null && !C4345c.m12345B(C4345c.f7654o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f7792c;
        return strArr2 == null || C4345c.m12345B(C10827h.f20869b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: d */
    public boolean mo24031d() {
        return this.f7790a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4377k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4377k kVar = (C4377k) obj;
        boolean z = this.f7790a;
        if (z != kVar.f7790a) {
            return false;
        }
        return !z || (Arrays.equals(this.f7792c, kVar.f7792c) && Arrays.equals(this.f7793d, kVar.f7793d) && this.f7791b == kVar.f7791b);
    }

    /* renamed from: f */
    public boolean mo24033f() {
        return this.f7791b;
    }

    @Nullable
    /* renamed from: g */
    public List<C10749f0> mo24034g() {
        String[] strArr = this.f7793d;
        if (strArr != null) {
            return C10749f0.m26611b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f7790a) {
            return ((((527 + Arrays.hashCode(this.f7792c)) * 31) + Arrays.hashCode(this.f7793d)) * 31) + (this.f7791b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f7790a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f7792c != null ? mo24029b().toString() : str;
        if (this.f7793d != null) {
            str = mo24034g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f7791b + ")";
    }
}
