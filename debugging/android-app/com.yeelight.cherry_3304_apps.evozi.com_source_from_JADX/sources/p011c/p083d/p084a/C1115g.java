package p011c.p083d.p084a;

import com.xiaomi.mipush.sdk.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C4411f;

/* renamed from: c.d.a.g */
public final class C1115g {

    /* renamed from: b */
    public static final C1115g f1657b = new C1117b().mo9683b();

    /* renamed from: a */
    private final Map<String, Set<C4411f>> f1658a;

    /* renamed from: c.d.a.g$b */
    public static final class C1117b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<String, Set<C4411f>> f1659a = new LinkedHashMap();

        /* renamed from: b */
        public C1115g mo9683b() {
            return new C1115g(this);
        }
    }

    private C1115g(C1117b bVar) {
        this.f1658a = C1024k.m2099j(bVar.f1659a);
    }

    /* renamed from: c */
    public static String m2626c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + m2627d((X509Certificate) certificate).mo24285a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    private static C4411f m2627d(X509Certificate x509Certificate) {
        return C1024k.m2104o(C4411f.m12869l(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public void mo9681a(String str, List<Certificate> list) {
        Set<C4411f> b = mo9682b(str);
        if (b != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!b.contains(m2627d((X509Certificate) list.get(i)))) {
                    i++;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m2626c(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(Constants.COLON_SEPARATOR);
            for (C4411f a : b) {
                sb.append("\n    sha1/");
                sb.append(a.mo24285a());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C4411f> mo9682b(String str) {
        Set<C4411f> set;
        Set<C4411f> set2 = this.f1658a.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            set = this.f1658a.get("*." + str.substring(indexOf + 1));
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            return null;
        }
        if (set2 == null || set == null) {
            return set2 != null ? set2 : set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set2);
        linkedHashSet.addAll(set);
        return linkedHashSet;
    }
}
