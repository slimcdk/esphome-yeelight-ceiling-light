package p164h.p211a.p212a.p228h.p230b0;

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
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import p164h.p211a.p212a.p228h.C11121i;
import p164h.p211a.p212a.p228h.p229a0.C11095a;
import p164h.p211a.p212a.p228h.p229a0.C11096b;
import p164h.p211a.p212a.p228h.p229a0.C11099e;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.b0.b */
public class C11102b extends C11145a {

    /* renamed from: R */
    public static final TrustManager[] f21911R = {new C11103a()};

    /* renamed from: S */
    private static final C11158c f21912S = C11156b.m29015a(C11102b.class);

    /* renamed from: T */
    public static final String f21913T;

    /* renamed from: U */
    public static final String f21914U;

    /* renamed from: A */
    private String f21915A = f21914U;

    /* renamed from: B */
    private boolean f21916B;

    /* renamed from: G */
    private boolean f21917G;

    /* renamed from: H */
    private int f21918H = -1;

    /* renamed from: I */
    private String f21919I;

    /* renamed from: J */
    private boolean f21920J = false;

    /* renamed from: K */
    private boolean f21921K = false;

    /* renamed from: L */
    private String f21922L;

    /* renamed from: M */
    private KeyStore f21923M;

    /* renamed from: N */
    private KeyStore f21924N;

    /* renamed from: O */
    private boolean f21925O = true;

    /* renamed from: P */
    private SSLContext f21926P;

    /* renamed from: Q */
    private boolean f21927Q = true;

    /* renamed from: e */
    private final Set<String> f21928e = new LinkedHashSet();

    /* renamed from: f */
    private Set<String> f21929f = null;

    /* renamed from: g */
    private final Set<String> f21930g = new LinkedHashSet();

    /* renamed from: h */
    private Set<String> f21931h = null;

    /* renamed from: i */
    private String f21932i;

    /* renamed from: j */
    private String f21933j;

    /* renamed from: k */
    private String f21934k = "JKS";

    /* renamed from: l */
    private InputStream f21935l;

    /* renamed from: m */
    private String f21936m;

    /* renamed from: n */
    private String f21937n;

    /* renamed from: o */
    private String f21938o;

    /* renamed from: p */
    private String f21939p = "JKS";

    /* renamed from: q */
    private InputStream f21940q;

    /* renamed from: r */
    private boolean f21941r = false;

    /* renamed from: s */
    private boolean f21942s = false;

    /* renamed from: t */
    private transient C11099e f21943t;

    /* renamed from: u */
    private transient C11099e f21944u;

    /* renamed from: v */
    private transient C11099e f21945v;

    /* renamed from: w */
    private String f21946w;

    /* renamed from: x */
    private String f21947x = "TLS";

    /* renamed from: y */
    private String f21948y;

    /* renamed from: z */
    private String f21949z = f21913T;

    /* renamed from: h.a.a.h.b0.b$a */
    static class C11103a implements X509TrustManager {
        C11103a() {
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
        f21913T = Security.getProperty("ssl.KeyManagerFactory.algorithm") == null ? str : Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (Security.getProperty("ssl.TrustManagerFactory.algorithm") != null) {
            str = Security.getProperty("ssl.TrustManagerFactory.algorithm");
        }
        f21914U = str;
        System.getProperty("user.home") + File.separator + ".keystore";
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public KeyManager[] mo35264A0(KeyStore keyStore) {
        KeyManager[] keyManagerArr = null;
        if (keyStore != null) {
            KeyManagerFactory instance = KeyManagerFactory.getInstance(this.f21949z);
            C11099e eVar = this.f21944u;
            if (eVar == null) {
                C11099e eVar2 = this.f21943t;
                if (eVar2 == null) {
                    instance.init(keyStore, (char[]) null);
                    keyManagerArr = instance.getKeyManagers();
                    if (this.f21936m != null) {
                        for (int i = 0; i < keyManagerArr.length; i++) {
                            if (keyManagerArr[i] instanceof X509KeyManager) {
                                keyManagerArr[i] = new C11101a(this.f21936m, (X509KeyManager) keyManagerArr[i]);
                            }
                        }
                    }
                } else {
                    eVar2.toString();
                    throw null;
                }
            } else {
                eVar.toString();
                throw null;
            }
        }
        return keyManagerArr;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: B0 */
    public KeyStore mo35265B0(InputStream inputStream, String str, String str2, String str3, String str4) {
        return C11095a.m28755a(inputStream, str, str2, str3, str4);
    }

    /* renamed from: C0 */
    public boolean mo35266C0() {
        return this.f21941r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public TrustManager[] mo35267D0(KeyStore keyStore, Collection<? extends CRL> collection) {
        if (keyStore == null) {
            return null;
        }
        if (!this.f21917G || !this.f21915A.equalsIgnoreCase("PKIX")) {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(this.f21915A);
            instance.init(keyStore);
            return instance.getTrustManagers();
        }
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, new X509CertSelector());
        pKIXBuilderParameters.setMaxPathLength(this.f21918H);
        pKIXBuilderParameters.setRevocationEnabled(true);
        if (collection != null && !collection.isEmpty()) {
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(collection)));
        }
        if (this.f21920J) {
            System.setProperty("com.sun.security.enableCRLDP", "true");
        }
        if (this.f21921K) {
            Security.setProperty("ocsp.enable", "true");
            String str = this.f21922L;
            if (str != null) {
                Security.setProperty("ocsp.responderURL", str);
            }
        }
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(this.f21915A);
        instance2.init(new CertPathTrustManagerParameters(pKIXBuilderParameters));
        return instance2.getTrustManagers();
    }

    /* renamed from: E0 */
    public boolean mo35268E0() {
        return this.f21942s;
    }

    /* renamed from: F0 */
    public boolean mo35269F0() {
        return this.f21925O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public Collection<? extends CRL> mo35270G0(String str) {
        return C11095a.m28756b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public KeyStore mo35271H0() {
        KeyStore keyStore = this.f21923M;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f21935l;
        String str = this.f21932i;
        String str2 = this.f21934k;
        String str3 = this.f21933j;
        C11099e eVar = this.f21943t;
        if (eVar == null) {
            return mo35265B0(inputStream, str, str2, str3, (String) null);
        }
        eVar.toString();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public KeyStore mo35272I0() {
        KeyStore keyStore = this.f21924N;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f21940q;
        String str = this.f21937n;
        String str2 = this.f21939p;
        String str3 = this.f21938o;
        C11099e eVar = this.f21945v;
        if (eVar == null) {
            return mo35265B0(inputStream, str, str2, str3, (String) null);
        }
        eVar.toString();
        throw null;
    }

    /* renamed from: J0 */
    public SSLEngine mo35273J0() {
        SSLEngine createSSLEngine = this.f21926P.createSSLEngine();
        mo35280z0(createSSLEngine);
        return createSSLEngine;
    }

    /* renamed from: K0 */
    public SSLEngine mo35274K0(String str, int i) {
        SSLEngine createSSLEngine = mo35269F0() ? this.f21926P.createSSLEngine(str, i) : this.f21926P.createSSLEngine();
        mo35280z0(createSSLEngine);
        return createSSLEngine;
    }

    /* renamed from: L0 */
    public SSLSocket mo35275L0() {
        SSLSocket sSLSocket = (SSLSocket) this.f21926P.getSocketFactory().createSocket();
        if (mo35268E0()) {
            sSLSocket.setWantClientAuth(mo35268E0());
        }
        if (mo35266C0()) {
            sSLSocket.setNeedClientAuth(mo35266C0());
        }
        sSLSocket.setEnabledCipherSuites(mo35276M0(sSLSocket.getEnabledCipherSuites(), sSLSocket.getSupportedCipherSuites()));
        sSLSocket.setEnabledProtocols(mo35277N0(sSLSocket.getEnabledProtocols(), sSLSocket.getSupportedProtocols()));
        return sSLSocket;
    }

    /* renamed from: M0 */
    public String[] mo35276M0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this.f21931h;
        if (set != null) {
            for (String next : set) {
                if (Arrays.asList(strArr2).contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this.f21930g;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    /* renamed from: N0 */
    public String[] mo35277N0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this.f21929f;
        if (set != null) {
            for (String next : set) {
                if (Arrays.asList(strArr2).contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this.f21928e;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        String str;
        TrustManager[] trustManagerArr;
        if (this.f21926P == null) {
            SecureRandom secureRandom = null;
            if (this.f21923M == null && this.f21935l == null && this.f21932i == null && this.f21924N == null && this.f21940q == null && this.f21937n == null) {
                if (this.f21927Q) {
                    f21912S.mo35489e("No keystore or trust store configured.  ACCEPTING UNTRUSTED CERTIFICATES!!!!!", new Object[0]);
                    trustManagerArr = f21911R;
                } else {
                    trustManagerArr = null;
                }
                String str2 = this.f21948y;
                SecureRandom instance = str2 == null ? null : SecureRandom.getInstance(str2);
                SSLContext instance2 = SSLContext.getInstance(this.f21947x);
                this.f21926P = instance2;
                instance2.init((KeyManager[]) null, trustManagerArr, instance);
                return;
            }
            mo35279y0();
            KeyStore H0 = mo35271H0();
            KeyStore I0 = mo35272I0();
            Collection<? extends CRL> G0 = mo35270G0(this.f21919I);
            if (this.f21916B && H0 != null) {
                if (this.f21936m == null) {
                    ArrayList<T> list = Collections.list(H0.aliases());
                    this.f21936m = list.size() == 1 ? (String) list.get(0) : null;
                }
                String str3 = this.f21936m;
                Certificate certificate = str3 == null ? null : H0.getCertificate(str3);
                if (certificate == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No certificate found in the keystore");
                    if (this.f21936m == null) {
                        str = "";
                    } else {
                        str = " for alias " + this.f21936m;
                    }
                    sb.append(str);
                    throw new Exception(sb.toString());
                }
                C11096b bVar = new C11096b(I0, G0);
                bVar.mo35250c(this.f21918H);
                bVar.mo35248a(this.f21920J);
                bVar.mo35249b(this.f21921K);
                bVar.mo35251d(this.f21922L);
                bVar.mo35252e(H0, certificate);
            }
            KeyManager[] A0 = mo35264A0(H0);
            TrustManager[] D0 = mo35267D0(I0, G0);
            String str4 = this.f21948y;
            if (str4 != null) {
                secureRandom = SecureRandom.getInstance(str4);
            }
            String str5 = this.f21946w;
            SSLContext instance3 = str5 == null ? SSLContext.getInstance(this.f21947x) : SSLContext.getInstance(this.f21947x, str5);
            this.f21926P = instance3;
            instance3.init(A0, D0, secureRandom);
            SSLEngine J0 = mo35273J0();
            f21912S.mo35494j("Enabled Protocols {} of {}", Arrays.asList(J0.getEnabledProtocols()), Arrays.asList(J0.getSupportedProtocols()));
            if (f21912S.mo35485a()) {
                f21912S.mo35489e("Enabled Ciphers   {} of {}", Arrays.asList(J0.getEnabledCipherSuites()), Arrays.asList(J0.getSupportedCipherSuites()));
            }
        }
    }

    public String toString() {
        return String.format("%s@%x(%s,%s)", new Object[]{C11102b.class.getSimpleName(), Integer.valueOf(hashCode()), this.f21932i, this.f21937n});
    }

    /* renamed from: y0 */
    public void mo35279y0() {
        if (this.f21926P == null) {
            if (this.f21923M == null && this.f21935l == null && this.f21932i == null) {
                throw new IllegalStateException("SSL doesn't have a valid keystore");
            }
            if (this.f21924N == null && this.f21940q == null && this.f21937n == null) {
                this.f21924N = this.f21923M;
                this.f21937n = this.f21932i;
                this.f21940q = this.f21935l;
                this.f21939p = this.f21934k;
                this.f21938o = this.f21933j;
                this.f21945v = this.f21943t;
                this.f21915A = this.f21949z;
            }
            InputStream inputStream = this.f21935l;
            if (inputStream != null && inputStream == this.f21940q) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C11121i.m28873c(this.f21935l, byteArrayOutputStream);
                    this.f21935l.close();
                    this.f21935l = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    this.f21940q = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* renamed from: z0 */
    public void mo35280z0(SSLEngine sSLEngine) {
        if (mo35268E0()) {
            sSLEngine.setWantClientAuth(mo35268E0());
        }
        if (mo35266C0()) {
            sSLEngine.setNeedClientAuth(mo35266C0());
        }
        sSLEngine.setEnabledCipherSuites(mo35276M0(sSLEngine.getEnabledCipherSuites(), sSLEngine.getSupportedCipherSuites()));
        sSLEngine.setEnabledProtocols(mo35277N0(sSLEngine.getEnabledProtocols(), sSLEngine.getSupportedProtocols()));
    }
}
