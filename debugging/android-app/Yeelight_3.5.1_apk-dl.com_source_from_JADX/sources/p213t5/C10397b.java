package p213t5;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: t5.b */
public final class C10397b implements C10400e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f19462a = new LinkedHashMap();

    public C10397b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f19462a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f19462a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo25948a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f19462a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C10397b) && ((C10397b) obj).f19462a.equals(this.f19462a);
    }

    public int hashCode() {
        return this.f19462a.hashCode();
    }
}
