package p156f.p157g0.p210m;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: f.g0.m.b */
public final class C10823b implements C10826e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f20867a = new LinkedHashMap();

    public C10823b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.f20867a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f20867a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo24012a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f20867a.get(x509Certificate.getIssuerX500Principal());
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
        return (obj instanceof C10823b) && ((C10823b) obj).f20867a.equals(this.f20867a);
    }

    public int hashCode() {
        return this.f20867a.hashCode();
    }
}
