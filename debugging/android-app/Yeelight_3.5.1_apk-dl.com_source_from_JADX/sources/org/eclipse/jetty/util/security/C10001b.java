package org.eclipse.jetty.util.security;

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
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: org.eclipse.jetty.util.security.b */
public class C10001b {

    /* renamed from: f */
    private static final C9003c f18444f = C9001b.m21450a(C10001b.class);

    /* renamed from: g */
    private static AtomicLong f18445g = new AtomicLong();

    /* renamed from: a */
    private KeyStore f18446a;

    /* renamed from: b */
    private Collection<? extends CRL> f18447b;

    /* renamed from: c */
    private int f18448c = -1;

    /* renamed from: d */
    private boolean f18449d = false;

    /* renamed from: e */
    private boolean f18450e = false;

    public C10001b(KeyStore keyStore, Collection<? extends CRL> collection) {
        if (keyStore != null) {
            this.f18446a = keyStore;
            this.f18447b = collection;
            return;
        }
        throw new InvalidParameterException("TrustStore must be specified for CertificateValidator.");
    }

    /* renamed from: a */
    public void mo40296a(boolean z) {
        this.f18449d = z;
    }

    /* renamed from: b */
    public void mo40297b(boolean z) {
        this.f18450e = z;
    }

    /* renamed from: c */
    public void mo40298c(int i) {
        this.f18448c = i;
    }

    /* renamed from: d */
    public void mo40299d(String str) {
    }

    /* renamed from: e */
    public void mo40300e(KeyStore keyStore, Certificate certificate) {
        String str;
        if (certificate != null && (certificate instanceof X509Certificate)) {
            ((X509Certificate) certificate).checkValidity();
            String str2 = null;
            if (keyStore != null) {
                try {
                    str2 = keyStore.getCertificateAlias((X509Certificate) certificate);
                    if (str2 == null) {
                        str2 = "JETTY" + String.format("%016X", new Object[]{Long.valueOf(f18445g.incrementAndGet())});
                        keyStore.setCertificateEntry(str2, certificate);
                    }
                    Certificate[] certificateChain = keyStore.getCertificateChain(str2);
                    if (certificateChain == null || certificateChain.length == 0) {
                        throw new IllegalStateException("Unable to retrieve certificate chain");
                    }
                    mo40301f(certificateChain);
                } catch (KeyStoreException e) {
                    f18444f.mo36848c(e);
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
    public void mo40301f(Certificate[] certificateArr) {
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
                PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(this.f18446a, x509CertSelector);
                pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
                pKIXBuilderParameters.setMaxPathLength(this.f18448c);
                pKIXBuilderParameters.setRevocationEnabled(true);
                Collection<? extends CRL> collection = this.f18447b;
                if (collection != null && !collection.isEmpty()) {
                    pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(this.f18447b)));
                }
                if (this.f18450e) {
                    Security.setProperty("ocsp.enable", "true");
                }
                if (this.f18449d) {
                    System.setProperty("com.sun.security.enableCRLDP", "true");
                }
                CertPathValidator.getInstance("PKIX").validate(CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters).getCertPath(), pKIXBuilderParameters);
                return;
            }
            throw new IllegalStateException("Invalid certificate chain");
        } catch (GeneralSecurityException e) {
            f18444f.mo36848c(e);
            throw new CertificateException("Unable to validate certificate: " + e.getMessage(), e);
        }
    }
}
