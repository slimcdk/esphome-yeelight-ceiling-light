package p162g6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CRL;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.eclipse.jetty.util.C9985i;
import org.eclipse.jetty.util.security.C10000a;
import org.eclipse.jetty.util.security.C10001b;
import org.eclipse.jetty.util.security.Password;
import p147d6.C8941a;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: g6.b */
public class C9085b extends C8941a {

    /* renamed from: a0 */
    public static final TrustManager[] f16690a0 = {new C9086a()};

    /* renamed from: b0 */
    private static final C9003c f16691b0 = C9001b.m21450a(C9085b.class);

    /* renamed from: c0 */
    public static final String f16692c0;

    /* renamed from: d0 */
    public static final String f16693d0;

    /* renamed from: A */
    private String f16694A = f16693d0;

    /* renamed from: B */
    private boolean f16695B;

    /* renamed from: C */
    private boolean f16696C;

    /* renamed from: Q */
    private int f16697Q = -1;

    /* renamed from: R */
    private String f16698R;

    /* renamed from: S */
    private boolean f16699S = false;

    /* renamed from: T */
    private boolean f16700T = false;

    /* renamed from: U */
    private String f16701U;

    /* renamed from: V */
    private KeyStore f16702V;

    /* renamed from: W */
    private KeyStore f16703W;

    /* renamed from: X */
    private boolean f16704X = true;

    /* renamed from: Y */
    private SSLContext f16705Y;

    /* renamed from: Z */
    private boolean f16706Z = true;

    /* renamed from: e */
    private final Set<String> f16707e = new LinkedHashSet();

    /* renamed from: f */
    private Set<String> f16708f = null;

    /* renamed from: g */
    private final Set<String> f16709g = new LinkedHashSet();

    /* renamed from: h */
    private Set<String> f16710h = null;

    /* renamed from: i */
    private String f16711i;

    /* renamed from: j */
    private String f16712j;

    /* renamed from: k */
    private String f16713k = "JKS";

    /* renamed from: l */
    private InputStream f16714l;

    /* renamed from: m */
    private String f16715m;

    /* renamed from: n */
    private String f16716n;

    /* renamed from: o */
    private String f16717o;

    /* renamed from: p */
    private String f16718p = "JKS";

    /* renamed from: q */
    private InputStream f16719q;

    /* renamed from: r */
    private boolean f16720r = false;

    /* renamed from: s */
    private boolean f16721s = false;

    /* renamed from: t */
    private transient Password f16722t;

    /* renamed from: u */
    private transient Password f16723u;

    /* renamed from: v */
    private transient Password f16724v;

    /* renamed from: w */
    private String f16725w;

    /* renamed from: x */
    private String f16726x = "TLS";

    /* renamed from: y */
    private String f16727y;

    /* renamed from: z */
    private String f16728z = f16692c0;

    /* renamed from: g6.b$a */
    static class C9086a implements X509TrustManager {
        C9086a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static {
        String str = "SunX509";
        f16692c0 = Security.getProperty("ssl.KeyManagerFactory.algorithm") == null ? str : Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (Security.getProperty("ssl.TrustManagerFactory.algorithm") != null) {
            str = Security.getProperty("ssl.TrustManagerFactory.algorithm");
        }
        f16693d0 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.home"));
        sb.append(File.separator);
        sb.append(".keystore");
    }

    /* renamed from: D0 */
    public void mo37057D0() {
        if (this.f16705Y == null) {
            KeyStore keyStore = this.f16702V;
            if (keyStore == null && this.f16714l == null && this.f16711i == null) {
                throw new IllegalStateException("SSL doesn't have a valid keystore");
            }
            if (this.f16703W == null && this.f16719q == null && this.f16716n == null) {
                this.f16703W = keyStore;
                this.f16716n = this.f16711i;
                this.f16719q = this.f16714l;
                this.f16718p = this.f16713k;
                this.f16717o = this.f16712j;
                this.f16724v = this.f16722t;
                this.f16694A = this.f16728z;
            }
            InputStream inputStream = this.f16714l;
            if (inputStream != null && inputStream == this.f16719q) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C9985i.m24688c(this.f16714l, byteArrayOutputStream);
                    this.f16714l.close();
                    this.f16714l = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    this.f16719q = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* renamed from: E0 */
    public void mo37058E0(SSLEngine sSLEngine) {
        if (mo37063J0()) {
            sSLEngine.setWantClientAuth(mo37063J0());
        }
        if (mo37061H0()) {
            sSLEngine.setNeedClientAuth(mo37061H0());
        }
        sSLEngine.setEnabledCipherSuites(mo37071R0(sSLEngine.getEnabledCipherSuites(), sSLEngine.getSupportedCipherSuites()));
        sSLEngine.setEnabledProtocols(mo37072S0(sSLEngine.getEnabledProtocols(), sSLEngine.getSupportedProtocols()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: javax.net.ssl.KeyManager[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: char[]} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.KeyManager[] mo37059F0(java.security.KeyStore r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.String r1 = r4.f16728z
            javax.net.ssl.KeyManagerFactory r1 = javax.net.ssl.KeyManagerFactory.getInstance(r1)
            org.eclipse.jetty.util.security.Password r2 = r4.f16723u
            if (r2 != 0) goto L_0x0012
            org.eclipse.jetty.util.security.Password r2 = r4.f16722t
            if (r2 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.String r0 = r2.toString()
            char[] r0 = r0.toCharArray()
        L_0x001a:
            r1.init(r5, r0)
            javax.net.ssl.KeyManager[] r0 = r1.getKeyManagers()
            java.lang.String r5 = r4.f16715m
            if (r5 == 0) goto L_0x003f
            r5 = 0
        L_0x0026:
            int r1 = r0.length
            if (r5 >= r1) goto L_0x003f
            r1 = r0[r5]
            boolean r1 = r1 instanceof javax.net.ssl.X509KeyManager
            if (r1 == 0) goto L_0x003c
            g6.a r1 = new g6.a
            java.lang.String r2 = r4.f16715m
            r3 = r0[r5]
            javax.net.ssl.X509KeyManager r3 = (javax.net.ssl.X509KeyManager) r3
            r1.<init>(r2, r3)
            r0[r5] = r1
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p162g6.C9085b.mo37059F0(java.security.KeyStore):javax.net.ssl.KeyManager[]");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: G0 */
    public KeyStore mo37060G0(InputStream inputStream, String str, String str2, String str3, String str4) {
        return C10000a.m24737a(inputStream, str, str2, str3, str4);
    }

    /* renamed from: H0 */
    public boolean mo37061H0() {
        return this.f16720r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public TrustManager[] mo37062I0(KeyStore keyStore, Collection<? extends CRL> collection) {
        if (keyStore == null) {
            return null;
        }
        if (!this.f16696C || !this.f16694A.equalsIgnoreCase("PKIX")) {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(this.f16694A);
            instance.init(keyStore);
            return instance.getTrustManagers();
        }
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, new X509CertSelector());
        pKIXBuilderParameters.setMaxPathLength(this.f16697Q);
        pKIXBuilderParameters.setRevocationEnabled(true);
        if (collection != null && !collection.isEmpty()) {
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(collection)));
        }
        if (this.f16699S) {
            System.setProperty("com.sun.security.enableCRLDP", "true");
        }
        if (this.f16700T) {
            Security.setProperty("ocsp.enable", "true");
            String str = this.f16701U;
            if (str != null) {
                Security.setProperty("ocsp.responderURL", str);
            }
        }
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(this.f16694A);
        instance2.init(new CertPathTrustManagerParameters(pKIXBuilderParameters));
        return instance2.getTrustManagers();
    }

    /* renamed from: J0 */
    public boolean mo37063J0() {
        return this.f16721s;
    }

    /* renamed from: K0 */
    public boolean mo37064K0() {
        return this.f16704X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public Collection<? extends CRL> mo37065L0(String str) {
        return C10000a.m24738b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public KeyStore mo37066M0() {
        KeyStore keyStore = this.f16702V;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f16714l;
        String str = this.f16711i;
        String str2 = this.f16713k;
        String str3 = this.f16712j;
        Password password = this.f16722t;
        return mo37060G0(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public KeyStore mo37067N0() {
        KeyStore keyStore = this.f16703W;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f16719q;
        String str = this.f16716n;
        String str2 = this.f16718p;
        String str3 = this.f16717o;
        Password password = this.f16724v;
        return mo37060G0(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    /* renamed from: O0 */
    public SSLEngine mo37068O0() {
        SSLEngine createSSLEngine = this.f16705Y.createSSLEngine();
        mo37058E0(createSSLEngine);
        return createSSLEngine;
    }

    /* renamed from: P0 */
    public SSLEngine mo37069P0(String str, int i) {
        SSLEngine createSSLEngine = mo37064K0() ? this.f16705Y.createSSLEngine(str, i) : this.f16705Y.createSSLEngine();
        mo37058E0(createSSLEngine);
        return createSSLEngine;
    }

    /* renamed from: Q0 */
    public SSLSocket mo37070Q0() {
        SSLSocket sSLSocket = (SSLSocket) this.f16705Y.getSocketFactory().createSocket();
        if (mo37063J0()) {
            sSLSocket.setWantClientAuth(mo37063J0());
        }
        if (mo37061H0()) {
            sSLSocket.setNeedClientAuth(mo37061H0());
        }
        sSLSocket.setEnabledCipherSuites(mo37071R0(sSLSocket.getEnabledCipherSuites(), sSLSocket.getSupportedCipherSuites()));
        sSLSocket.setEnabledProtocols(mo37072S0(sSLSocket.getEnabledProtocols(), sSLSocket.getSupportedProtocols()));
        return sSLSocket;
    }

    /* renamed from: R0 */
    public String[] mo37071R0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this.f16710h;
        if (set != null) {
            for (String next : set) {
                if (Arrays.asList(strArr2).contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this.f16709g;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    /* renamed from: S0 */
    public String[] mo37072S0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this.f16708f;
        if (set != null) {
            for (String next : set) {
                if (Arrays.asList(strArr2).contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this.f16707e;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String toString() {
        return String.format("%s@%x(%s,%s)", new Object[]{C9085b.class.getSimpleName(), Integer.valueOf(hashCode()), this.f16711i, this.f16716n});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        String str;
        TrustManager[] trustManagerArr;
        if (this.f16705Y == null) {
            SecureRandom secureRandom = null;
            if (this.f16702V == null && this.f16714l == null && this.f16711i == null && this.f16703W == null && this.f16719q == null && this.f16716n == null) {
                if (this.f16706Z) {
                    f16691b0.mo36850e("No keystore or trust store configured.  ACCEPTING UNTRUSTED CERTIFICATES!!!!!", new Object[0]);
                    trustManagerArr = f16690a0;
                } else {
                    trustManagerArr = null;
                }
                String str2 = this.f16727y;
                SecureRandom instance = str2 == null ? null : SecureRandom.getInstance(str2);
                SSLContext instance2 = SSLContext.getInstance(this.f16726x);
                this.f16705Y = instance2;
                instance2.init((KeyManager[]) null, trustManagerArr, instance);
                return;
            }
            mo37057D0();
            KeyStore M0 = mo37066M0();
            KeyStore N0 = mo37067N0();
            Collection<? extends CRL> L0 = mo37065L0(this.f16698R);
            if (this.f16695B && M0 != null) {
                if (this.f16715m == null) {
                    ArrayList<T> list = Collections.list(M0.aliases());
                    this.f16715m = list.size() == 1 ? (String) list.get(0) : null;
                }
                String str3 = this.f16715m;
                Certificate certificate = str3 == null ? null : M0.getCertificate(str3);
                if (certificate == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No certificate found in the keystore");
                    if (this.f16715m == null) {
                        str = "";
                    } else {
                        str = " for alias " + this.f16715m;
                    }
                    sb.append(str);
                    throw new Exception(sb.toString());
                }
                C10001b bVar = new C10001b(N0, L0);
                bVar.mo40298c(this.f16697Q);
                bVar.mo40296a(this.f16699S);
                bVar.mo40297b(this.f16700T);
                bVar.mo40299d(this.f16701U);
                bVar.mo40300e(M0, certificate);
            }
            KeyManager[] F0 = mo37059F0(M0);
            TrustManager[] I0 = mo37062I0(N0, L0);
            String str4 = this.f16727y;
            if (str4 != null) {
                secureRandom = SecureRandom.getInstance(str4);
            }
            String str5 = this.f16725w;
            SSLContext instance3 = str5 == null ? SSLContext.getInstance(this.f16726x) : SSLContext.getInstance(this.f16726x, str5);
            this.f16705Y = instance3;
            instance3.init(F0, I0, secureRandom);
            SSLEngine O0 = mo37068O0();
            C9003c cVar = f16691b0;
            cVar.mo36855i("Enabled Protocols {} of {}", Arrays.asList(O0.getEnabledProtocols()), Arrays.asList(O0.getSupportedProtocols()));
            if (cVar.mo36846a()) {
                cVar.mo36850e("Enabled Ciphers   {} of {}", Arrays.asList(O0.getEnabledCipherSuites()), Arrays.asList(O0.getSupportedCipherSuites()));
            }
        }
    }
}
