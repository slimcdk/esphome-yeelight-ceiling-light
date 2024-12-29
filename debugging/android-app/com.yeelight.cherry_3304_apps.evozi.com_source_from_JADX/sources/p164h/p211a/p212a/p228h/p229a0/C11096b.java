package p164h.p211a.p212a.p228h.p229a0;

import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Security;
import java.security.cert.CRL;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidator;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.a0.b */
public class C11096b {

    /* renamed from: f */
    private static final C11158c f21902f = C11156b.m29015a(C11096b.class);

    /* renamed from: g */
    private static AtomicLong f21903g = new AtomicLong();

    /* renamed from: a */
    private KeyStore f21904a;

    /* renamed from: b */
    private Collection<? extends CRL> f21905b;

    /* renamed from: c */
    private int f21906c = -1;

    /* renamed from: d */
    private boolean f21907d = false;

    /* renamed from: e */
    private boolean f21908e = false;

    public C11096b(KeyStore keyStore, Collection<? extends CRL> collection) {
        if (keyStore != null) {
            this.f21904a = keyStore;
            this.f21905b = collection;
            return;
        }
        throw new InvalidParameterException("TrustStore must be specified for CertificateValidator.");
    }

    /* renamed from: a */
    public void mo35248a(boolean z) {
        this.f21907d = z;
    }

    /* renamed from: b */
    public void mo35249b(boolean z) {
        this.f21908e = z;
    }

    /* renamed from: c */
    public void mo35250c(int i) {
        this.f21906c = i;
    }

    /* renamed from: d */
    public void mo35251d(String str) {
    }

    /* renamed from: e */
    public void mo35252e(KeyStore keyStore, Certificate certificate) {
        String str;
        if (certificate != null && (certificate instanceof X509Certificate)) {
            ((X509Certificate) certificate).checkValidity();
            String str2 = null;
            if (keyStore != null) {
                try {
                    str2 = keyStore.getCertificateAlias((X509Certificate) certificate);
                    if (str2 == null) {
                        str2 = "JETTY" + String.format("%016X", new Object[]{Long.valueOf(f21903g.incrementAndGet())});
                        keyStore.setCertificateEntry(str2, certificate);
                    }
                    Certificate[] certificateChain = keyStore.getCertificateChain(str2);
                    if (certificateChain == null || certificateChain.length == 0) {
                        throw new IllegalStateException("Unable to retrieve certificate chain");
                    }
                    mo35253f(certificateChain);
                } catch (KeyStoreException e) {
                    f21902f.mo35487c(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to validate certificate");
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = " for alias [" + str2 + "]";
                    }
                    sb.append(str);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    throw new CertificateException(sb.toString(), e);
                }
            } else {
                throw new InvalidParameterException("Keystore cannot be null");
            }
        }
    }

    /* renamed from: f */
    public void mo35253f(Certificate[] certificateArr) {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509Certificate x509Certificate : certificateArr) {
                if (x509Certificate != null) {
                    if (x509Certificate instanceof X509Certificate) {
                        arrayList.add(x509Certificate);
                    } else {
                        throw new IllegalStateException("Invalid certificate type in chain");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                X509CertSelector x509CertSelector = new X509CertSelector();
                x509CertSelector.setCertificate((X509Certificate) arrayList.get(0));
                PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(this.f21904a, x509CertSelector);
                pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
                pKIXBuilderParameters.setMaxPathLength(this.f21906c);
                pKIXBuilderParameters.setRevocationEnabled(true);
                if (this.f21905b != null && !this.f21905b.isEmpty()) {
                    pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(this.f21905b)));
                }
                if (this.f21908e) {
                    Security.setProperty("ocsp.enable", "true");
                }
                if (this.f21907d) {
                    System.setProperty("com.sun.security.enableCRLDP", "true");
                }
                CertPathValidator.getInstance("PKIX").validate(CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters).getCertPath(), pKIXBuilderParameters);
                return;
            }
            throw new IllegalStateException("Invalid certificate chain");
        } catch (GeneralSecurityException e) {
            f21902f.mo35487c(e);
            throw new CertificateException("Unable to validate certificate: " + e.getMessage(), e);
        }
    }
}
