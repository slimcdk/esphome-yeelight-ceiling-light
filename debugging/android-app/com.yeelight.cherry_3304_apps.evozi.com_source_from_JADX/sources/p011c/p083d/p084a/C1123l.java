package p011c.p083d.p084a;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.l */
public final class C1123l {

    /* renamed from: e */
    private static final C1119i[] f1778e = {C1119i.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C1119i.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C1119i.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C1119i.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C1119i.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C1119i.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C1119i.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C1119i.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C1119i.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, C1119i.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C1119i.TLS_RSA_WITH_AES_128_GCM_SHA256, C1119i.TLS_RSA_WITH_AES_128_CBC_SHA, C1119i.TLS_RSA_WITH_AES_256_CBC_SHA, C1119i.TLS_RSA_WITH_3DES_EDE_CBC_SHA};

    /* renamed from: f */
    public static final C1123l f1779f;

    /* renamed from: g */
    public static final C1123l f1780g;

    /* renamed from: h */
    public static final C1123l f1781h = new C1125b(false).mo9724e();

    /* renamed from: a */
    final boolean f1782a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f1783b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f1784c;

    /* renamed from: d */
    final boolean f1785d;

    /* renamed from: c.d.a.l$b */
    public static final class C1125b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f1786a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f1787b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f1788c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f1789d;

        public C1125b(C1123l lVar) {
            this.f1786a = lVar.f1782a;
            this.f1787b = lVar.f1783b;
            this.f1788c = lVar.f1784c;
            this.f1789d = lVar.f1785d;
        }

        C1125b(boolean z) {
            this.f1786a = z;
        }

        /* renamed from: e */
        public C1123l mo9724e() {
            return new C1123l(this);
        }

        /* renamed from: f */
        public C1125b mo9725f(C1119i... iVarArr) {
            if (this.f1786a) {
                String[] strArr = new String[iVarArr.length];
                for (int i = 0; i < iVarArr.length; i++) {
                    strArr[i] = iVarArr[i].f1759a;
                }
                this.f1787b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C1125b mo9726g(String... strArr) {
            if (this.f1786a) {
                if (strArr == null) {
                    this.f1787b = null;
                } else {
                    this.f1787b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C1125b mo9727h(boolean z) {
            if (this.f1786a) {
                this.f1789d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C1125b mo9728i(C0999c0... c0VarArr) {
            if (!this.f1786a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (c0VarArr.length != 0) {
                String[] strArr = new String[c0VarArr.length];
                for (int i = 0; i < c0VarArr.length; i++) {
                    strArr[i] = c0VarArr[i].f1255a;
                }
                this.f1788c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        /* renamed from: j */
        public C1125b mo9729j(String... strArr) {
            if (this.f1786a) {
                if (strArr == null) {
                    this.f1788c = null;
                } else {
                    this.f1788c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        C1125b bVar = new C1125b(true);
        bVar.mo9725f(f1778e);
        bVar.mo9728i(C0999c0.TLS_1_2, C0999c0.TLS_1_1, C0999c0.TLS_1_0);
        bVar.mo9727h(true);
        C1123l e = bVar.mo9724e();
        f1779f = e;
        C1125b bVar2 = new C1125b(e);
        bVar2.mo9728i(C0999c0.TLS_1_0);
        bVar2.mo9727h(true);
        f1780g = bVar2.mo9724e();
    }

    private C1123l(C1125b bVar) {
        this.f1782a = bVar.f1786a;
        this.f1783b = bVar.f1787b;
        this.f1784c = bVar.f1788c;
        this.f1785d = bVar.f1789d;
    }

    /* renamed from: e */
    private static <T> boolean m2670e(T[] tArr, T t) {
        for (T f : tArr) {
            if (C1024k.m2095f(t, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m2671g(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String e : strArr) {
                if (m2670e(strArr2, e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private C1123l m2672h(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f1783b != null) {
            strArr = (String[]) C1024k.m2101l(cls, this.f1783b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C1125b bVar = new C1125b(this);
        bVar.mo9726g(strArr);
        bVar.mo9729j((String[]) C1024k.m2101l(cls, this.f1784c, enabledProtocols));
        return bVar.mo9724e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9716c(SSLSocket sSLSocket, boolean z) {
        C1123l h = m2672h(sSLSocket, z);
        sSLSocket.setEnabledProtocols(h.f1784c);
        String[] strArr = h.f1783b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<C1119i> mo9717d() {
        String[] strArr = this.f1783b;
        if (strArr == null) {
            return null;
        }
        C1119i[] iVarArr = new C1119i[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f1783b;
            if (i >= strArr2.length) {
                return C1024k.m2098i(iVarArr);
            }
            iVarArr[i] = C1119i.m2634a(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1123l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1123l lVar = (C1123l) obj;
        boolean z = this.f1782a;
        if (z != lVar.f1782a) {
            return false;
        }
        return !z || (Arrays.equals(this.f1783b, lVar.f1783b) && Arrays.equals(this.f1784c, lVar.f1784c) && this.f1785d == lVar.f1785d);
    }

    /* renamed from: f */
    public boolean mo9719f(SSLSocket sSLSocket) {
        if (!this.f1782a) {
            return false;
        }
        if (!m2671g(this.f1784c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr = this.f1783b;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        return strArr == null ? enabledCipherSuites.length > 0 : m2671g(this.f1783b, enabledCipherSuites);
    }

    public int hashCode() {
        if (this.f1782a) {
            return ((((527 + Arrays.hashCode(this.f1783b)) * 31) + Arrays.hashCode(this.f1784c)) * 31) + (this.f1785d ^ true ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: i */
    public boolean mo9721i() {
        return this.f1785d;
    }

    /* renamed from: j */
    public List<C0999c0> mo9722j() {
        C0999c0[] c0VarArr = new C0999c0[this.f1784c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f1784c;
            if (i >= strArr.length) {
                return C1024k.m2098i(c0VarArr);
            }
            c0VarArr[i] = C0999c0.m1955a(strArr[i]);
            i++;
        }
    }

    public String toString() {
        if (!this.f1782a) {
            return "ConnectionSpec()";
        }
        List<C1119i> d = mo9717d();
        String obj = d == null ? "[use default]" : d.toString();
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + mo9722j() + ", supportsTlsExtensions=" + this.f1785d + ")";
    }
}
