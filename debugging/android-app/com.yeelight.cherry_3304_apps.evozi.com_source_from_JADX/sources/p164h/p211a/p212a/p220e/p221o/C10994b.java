package p164h.p211a.p212a.p220e.p221o;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p220e.C10990l;
import p164h.p211a.p212a.p220e.C10991m;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p228h.C11107d;
import p164h.p211a.p212a.p228h.p229a0.C11095a;
import p164h.p211a.p212a.p228h.p229a0.C11096b;
import p164h.p211a.p212a.p228h.p229a0.C11099e;

/* renamed from: h.a.a.e.o.b */
public class C10994b extends C11005f {

    /* renamed from: d */
    private String f21478d;

    /* renamed from: e */
    private String f21479e;

    /* renamed from: f */
    private String f21480f = "JKS";

    /* renamed from: g */
    private transient C11099e f21481g;

    /* renamed from: h */
    private boolean f21482h;

    /* renamed from: i */
    private String f21483i;

    /* renamed from: a */
    public C11018d mo34712a(C10734t tVar, C10740z zVar, boolean z) {
        if (!z) {
            return new C10995c(this);
        }
        C10711e eVar = (C10711e) zVar;
        X509Certificate[] x509CertificateArr = (X509Certificate[]) ((C10709c) tVar).mo33964a("javax.servlet.request.X509Certificate");
        if (x509CertificateArr != null) {
            try {
                if (x509CertificateArr.length > 0) {
                    if (this.f21482h) {
                        String str = this.f21478d;
                        String str2 = this.f21480f;
                        String str3 = this.f21479e;
                        if (this.f21481g == null) {
                            new C11096b(mo34769h((InputStream) null, str, str2, str3, (String) null), mo34770i(this.f21483i)).mo35253f(x509CertificateArr);
                        } else {
                            this.f21481g.toString();
                            throw null;
                        }
                    }
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        if (x509Certificate != null) {
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            if (subjectDN == null) {
                                subjectDN = x509Certificate.getIssuerDN();
                            }
                            C11046u f = mo34776f(subjectDN == null ? "clientcert" : subjectDN.getName(), C11107d.m28798d(x509Certificate.getSignature()), tVar);
                            if (f != null) {
                                return new C10991m(mo34714c(), f);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                throw new C10990l(e.getMessage());
            }
        }
        if (C10995c.m28014e(eVar)) {
            return C11018d.f21599C;
        }
        eVar.mo33933e(403);
        return C11018d.f21602F;
    }

    /* renamed from: c */
    public String mo34714c() {
        return "CLIENT_CERT";
    }

    /* renamed from: d */
    public boolean mo34715d(C10734t tVar, C10740z zVar, boolean z, C11018d.C11025g gVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public KeyStore mo34769h(InputStream inputStream, String str, String str2, String str3, String str4) {
        return C11095a.m28755a(inputStream, str, str2, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Collection<? extends CRL> mo34770i(String str) {
        return C11095a.m28756b(str);
    }
}
