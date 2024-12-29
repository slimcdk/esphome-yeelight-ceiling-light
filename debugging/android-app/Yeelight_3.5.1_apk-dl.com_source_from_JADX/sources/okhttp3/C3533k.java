package okhttp3;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import p056k5.C3300c;

/* renamed from: okhttp3.k */
public final class C3533k {

    /* renamed from: e */
    private static final C9799h[] f5759e;

    /* renamed from: f */
    private static final C9799h[] f5760f;

    /* renamed from: g */
    public static final C3533k f5761g;

    /* renamed from: h */
    public static final C3533k f5762h = new C3534a(false).mo24498a();

    /* renamed from: a */
    final boolean f5763a;

    /* renamed from: b */
    final boolean f5764b;
    @Nullable

    /* renamed from: c */
    final String[] f5765c;
    @Nullable

    /* renamed from: d */
    final String[] f5766d;

    /* renamed from: okhttp3.k$a */
    public static final class C3534a {

        /* renamed from: a */
        boolean f5767a;
        @Nullable

        /* renamed from: b */
        String[] f5768b;
        @Nullable

        /* renamed from: c */
        String[] f5769c;

        /* renamed from: d */
        boolean f5770d;

        public C3534a(C3533k kVar) {
            this.f5767a = kVar.f5763a;
            this.f5768b = kVar.f5765c;
            this.f5769c = kVar.f5766d;
            this.f5770d = kVar.f5764b;
        }

        C3534a(boolean z) {
            this.f5767a = z;
        }

        /* renamed from: a */
        public C3533k mo24498a() {
            return new C3533k(this);
        }

        /* renamed from: b */
        public C3534a mo24499b(String... strArr) {
            if (!this.f5767a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f5768b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C3534a mo24500c(C9799h... hVarArr) {
            if (this.f5767a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f17692a;
                }
                return mo24499b(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public C3534a mo24501d(boolean z) {
            if (this.f5767a) {
                this.f5770d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: e */
        public C3534a mo24502e(String... strArr) {
            if (!this.f5767a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f5769c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: f */
        public C3534a mo24503f(TlsVersion... tlsVersionArr) {
            if (this.f5767a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                return mo24502e(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        C9799h hVar = C9799h.f17687q;
        C9799h hVar2 = C9799h.f17688r;
        C9799h hVar3 = C9799h.f17689s;
        C9799h hVar4 = C9799h.f17690t;
        C9799h hVar5 = C9799h.f17691u;
        C9799h hVar6 = C9799h.f17681k;
        C9799h hVar7 = C9799h.f17683m;
        C9799h hVar8 = C9799h.f17682l;
        C9799h hVar9 = C9799h.f17684n;
        C9799h hVar10 = C9799h.f17686p;
        C9799h hVar11 = C9799h.f17685o;
        C9799h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        f5759e = hVarArr;
        C9799h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, C9799h.f17679i, C9799h.f17680j, C9799h.f17677g, C9799h.f17678h, C9799h.f17675e, C9799h.f17676f, C9799h.f17674d};
        f5760f = hVarArr2;
        C3534a c = new C3534a(true).mo24500c(hVarArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c.mo24503f(tlsVersion, tlsVersion2).mo24501d(true).mo24498a();
        C3534a c2 = new C3534a(true).mo24500c(hVarArr2);
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
        f5761g = c2.mo24503f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3).mo24501d(true).mo24498a();
        new C3534a(true).mo24500c(hVarArr2).mo24503f(tlsVersion3).mo24501d(true).mo24498a();
    }

    C3533k(C3534a aVar) {
        this.f5763a = aVar.f5767a;
        this.f5765c = aVar.f5768b;
        this.f5766d = aVar.f5769c;
        this.f5764b = aVar.f5770d;
    }

    /* renamed from: e */
    private C3533k m9733e(SSLSocket sSLSocket, boolean z) {
        String[] y = this.f5765c != null ? C3300c.m8940y(C9799h.f17672b, sSLSocket.getEnabledCipherSuites(), this.f5765c) : sSLSocket.getEnabledCipherSuites();
        String[] y2 = this.f5766d != null ? C3300c.m8940y(C3300c.f5337f, sSLSocket.getEnabledProtocols(), this.f5766d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int v = C3300c.m8937v(C9799h.f17672b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && v != -1) {
            y = C3300c.m8923h(y, supportedCipherSuites[v]);
        }
        return new C3534a(this).mo24499b(y).mo24502e(y2).mo24498a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24489a(SSLSocket sSLSocket, boolean z) {
        C3533k e = m9733e(sSLSocket, z);
        String[] strArr = e.f5766d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e.f5765c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    /* renamed from: b */
    public List<C9799h> mo24490b() {
        String[] strArr = this.f5765c;
        if (strArr != null) {
            return C9799h.m23503b(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo24491c(SSLSocket sSLSocket) {
        if (!this.f5763a) {
            return false;
        }
        String[] strArr = this.f5766d;
        if (strArr != null && !C3300c.m8907A(C3300c.f5337f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f5765c;
        return strArr2 == null || C3300c.m8907A(C9799h.f17672b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: d */
    public boolean mo24492d() {
        return this.f5763a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3533k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3533k kVar = (C3533k) obj;
        boolean z = this.f5763a;
        if (z != kVar.f5763a) {
            return false;
        }
        return !z || (Arrays.equals(this.f5765c, kVar.f5765c) && Arrays.equals(this.f5766d, kVar.f5766d) && this.f5764b == kVar.f5764b);
    }

    /* renamed from: f */
    public boolean mo24494f() {
        return this.f5764b;
    }

    @Nullable
    /* renamed from: g */
    public List<TlsVersion> mo24495g() {
        String[] strArr = this.f5766d;
        if (strArr != null) {
            return TlsVersion.forJavaNames(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f5763a) {
            return ((((527 + Arrays.hashCode(this.f5765c)) * 31) + Arrays.hashCode(this.f5766d)) * 31) + (this.f5764b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f5763a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f5765c != null ? mo24490b().toString() : str;
        if (this.f5766d != null) {
            str = mo24495g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f5764b + ")";
    }
}
