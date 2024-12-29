package com.squareup.okhttp;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.k */
public final class C4292k {

    /* renamed from: e */
    private static final CipherSuite[] f6973e;

    /* renamed from: f */
    public static final C4292k f6974f;

    /* renamed from: g */
    public static final C4292k f6975g;

    /* renamed from: h */
    public static final C4292k f6976h = new C4294b(false).mo27911e();

    /* renamed from: a */
    final boolean f6977a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f6978b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f6979c;

    /* renamed from: d */
    final boolean f6980d;

    /* renamed from: com.squareup.okhttp.k$b */
    public static final class C4294b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f6981a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f6982b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f6983c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f6984d;

        public C4294b(C4292k kVar) {
            this.f6981a = kVar.f6977a;
            this.f6982b = kVar.f6978b;
            this.f6983c = kVar.f6979c;
            this.f6984d = kVar.f6980d;
        }

        C4294b(boolean z) {
            this.f6981a = z;
        }

        /* renamed from: e */
        public C4292k mo27911e() {
            return new C4292k(this);
        }

        /* renamed from: f */
        public C4294b mo27912f(CipherSuite... cipherSuiteArr) {
            if (this.f6981a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i = 0; i < cipherSuiteArr.length; i++) {
                    strArr[i] = cipherSuiteArr[i].javaName;
                }
                this.f6982b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C4294b mo27913g(String... strArr) {
            if (this.f6981a) {
                if (strArr == null) {
                    this.f6982b = null;
                } else {
                    this.f6982b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C4294b mo27914h(boolean z) {
            if (this.f6981a) {
                this.f6984d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C4294b mo27915i(TlsVersion... tlsVersionArr) {
            if (!this.f6981a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (tlsVersionArr.length != 0) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].javaName;
                }
                this.f6983c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        /* renamed from: j */
        public C4294b mo27916j(String... strArr) {
            if (this.f6981a) {
                if (strArr == null) {
                    this.f6983c = null;
                } else {
                    this.f6983c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f6973e = cipherSuiteArr;
        C4294b f = new C4294b(true).mo27912f(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        C4292k e = f.mo27915i(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion).mo27914h(true).mo27911e();
        f6974f = e;
        f6975g = new C4294b(e).mo27915i(tlsVersion).mo27914h(true).mo27911e();
    }

    private C4292k(C4294b bVar) {
        this.f6977a = bVar.f6981a;
        this.f6978b = bVar.f6982b;
        this.f6979c = bVar.f6983c;
        this.f6980d = bVar.f6984d;
    }

    /* renamed from: e */
    private static <T> boolean m11950e(T[] tArr, T t) {
        for (T f : tArr) {
            if (C12033k.m31046f(t, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m11951g(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String e : strArr) {
                if (m11950e(strArr2, e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private C4292k m11952h(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f6978b != null) {
            strArr = (String[]) C12033k.m31052l(cls, this.f6978b, sSLSocket.getEnabledCipherSuites());
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
        return new C4294b(this).mo27913g(strArr).mo27916j((String[]) C12033k.m31052l(cls, this.f6979c, enabledProtocols)).mo27911e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27903c(SSLSocket sSLSocket, boolean z) {
        C4292k h = m11952h(sSLSocket, z);
        sSLSocket.setEnabledProtocols(h.f6979c);
        String[] strArr = h.f6978b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<CipherSuite> mo27904d() {
        String[] strArr = this.f6978b;
        if (strArr == null) {
            return null;
        }
        CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f6978b;
            if (i >= strArr2.length) {
                return C12033k.m31049i(cipherSuiteArr);
            }
            cipherSuiteArr[i] = CipherSuite.forJavaName(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4292k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4292k kVar = (C4292k) obj;
        boolean z = this.f6977a;
        if (z != kVar.f6977a) {
            return false;
        }
        return !z || (Arrays.equals(this.f6978b, kVar.f6978b) && Arrays.equals(this.f6979c, kVar.f6979c) && this.f6980d == kVar.f6980d);
    }

    /* renamed from: f */
    public boolean mo27906f(SSLSocket sSLSocket) {
        if (!this.f6977a) {
            return false;
        }
        if (!m11951g(this.f6979c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr = this.f6978b;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        return strArr == null ? enabledCipherSuites.length > 0 : m11951g(this.f6978b, enabledCipherSuites);
    }

    public int hashCode() {
        if (this.f6977a) {
            return ((((527 + Arrays.hashCode(this.f6978b)) * 31) + Arrays.hashCode(this.f6979c)) * 31) + (this.f6980d ^ true ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: i */
    public boolean mo27908i() {
        return this.f6980d;
    }

    /* renamed from: j */
    public List<TlsVersion> mo27909j() {
        TlsVersion[] tlsVersionArr = new TlsVersion[this.f6979c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f6979c;
            if (i >= strArr.length) {
                return C12033k.m31049i(tlsVersionArr);
            }
            tlsVersionArr[i] = TlsVersion.forJavaName(strArr[i]);
            i++;
        }
    }

    public String toString() {
        if (!this.f6977a) {
            return "ConnectionSpec()";
        }
        List<CipherSuite> d = mo27904d();
        String obj = d == null ? "[use default]" : d.toString();
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + mo27909j() + ", supportsTlsExtensions=" + this.f6980d + ")";
    }
}
