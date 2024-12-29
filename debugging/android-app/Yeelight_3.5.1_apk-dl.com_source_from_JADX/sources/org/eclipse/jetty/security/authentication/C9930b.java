package org.eclipse.jetty.security.authentication;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.C9980d;
import org.eclipse.jetty.util.security.C10000a;
import org.eclipse.jetty.util.security.C10001b;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Password;
import p208s4.C10364p;
import p208s4.C10368t;
import p234y5.C12089l;
import p239z5.C12159d;
import p239z5.C12193w;

/* renamed from: org.eclipse.jetty.security.authentication.b */
public class C9930b extends C9938e {

    /* renamed from: d */
    private String f18196d;

    /* renamed from: e */
    private String f18197e;

    /* renamed from: f */
    private String f18198f = "JKS";

    /* renamed from: g */
    private transient Password f18199g;

    /* renamed from: h */
    private boolean f18200h;

    /* renamed from: i */
    private String f18201i;

    /* renamed from: a */
    public C12159d mo39889a(C10364p pVar, C10368t tVar, boolean z) {
        if (!z) {
            return new C9931c(this);
        }
        C9279c cVar = (C9279c) tVar;
        X509Certificate[] x509CertificateArr = (X509Certificate[]) ((C9277a) pVar).mo40040a("javax.servlet.request.X509Certificate");
        if (x509CertificateArr != null) {
            try {
                if (x509CertificateArr.length > 0) {
                    if (this.f18200h) {
                        String str = this.f18196d;
                        String str2 = this.f18198f;
                        String str3 = this.f18197e;
                        Password password = this.f18199g;
                        new C10001b(mo39901g((InputStream) null, str, str2, str3, password == null ? null : password.toString()), mo39902h(this.f18201i)).mo40301f(x509CertificateArr);
                    }
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        if (x509Certificate != null) {
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            if (subjectDN == null) {
                                subjectDN = x509Certificate.getIssuerDN();
                            }
                            C12193w e = mo39913e(subjectDN == null ? "clientcert" : subjectDN.getName(), C9980d.m24668d(x509Certificate.getSignature()), pVar);
                            if (e != null) {
                                return new C12089l(getAuthMethod(), e);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw new ServerAuthException(e2.getMessage());
            }
        }
        if (C9931c.m24355d(cVar)) {
            return C12159d.f22392M;
        }
        cVar.mo37778k(TypedValues.CycleType.TYPE_ALPHA);
        return C12159d.f22395P;
    }

    /* renamed from: b */
    public boolean mo39890b(C10364p pVar, C10368t tVar, boolean z, C12159d.C12167h hVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public KeyStore mo39901g(InputStream inputStream, String str, String str2, String str3, String str4) {
        return C10000a.m24737a(inputStream, str, str2, str3, str4);
    }

    public String getAuthMethod() {
        return Constraint.__CERT_AUTH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Collection<? extends CRL> mo39902h(String str) {
        return C10000a.m24738b(str);
    }
}
