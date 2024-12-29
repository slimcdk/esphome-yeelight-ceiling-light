package p156f;

import com.xiaomi.mipush.sdk.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import p156f.p157g0.C4345c;
import p156f.p157g0.p210m.C10824c;
import p163g.C4411f;

/* renamed from: f.g */
public final class C4341g {

    /* renamed from: c */
    public static final C4341g f7631c = new C4342a().mo23920a();

    /* renamed from: a */
    private final Set<C4343b> f7632a;
    @Nullable

    /* renamed from: b */
    private final C10824c f7633b;

    /* renamed from: f.g$a */
    public static final class C4342a {

        /* renamed from: a */
        private final List<C4343b> f7634a = new ArrayList();

        /* renamed from: a */
        public C4341g mo23920a() {
            return new C4341g(new LinkedHashSet(this.f7634a), (C10824c) null);
        }
    }

    /* renamed from: f.g$b */
    static final class C4343b {

        /* renamed from: a */
        final String f7635a;

        /* renamed from: b */
        final String f7636b;

        /* renamed from: c */
        final String f7637c;

        /* renamed from: d */
        final C4411f f7638d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo23921a(String str) {
            if (!this.f7635a.startsWith("*.")) {
                return str.equals(this.f7636b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f7636b.length()) {
                String str2 = this.f7636b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4343b) {
                C4343b bVar = (C4343b) obj;
                return this.f7635a.equals(bVar.f7635a) && this.f7637c.equals(bVar.f7637c) && this.f7638d.equals(bVar.f7638d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f7635a.hashCode()) * 31) + this.f7637c.hashCode()) * 31) + this.f7638d.hashCode();
        }

        public String toString() {
            return this.f7637c + this.f7638d.mo24285a();
        }
    }

    C4341g(Set<C4343b> set, @Nullable C10824c cVar) {
        this.f7632a = set;
        this.f7633b = cVar;
    }

    /* renamed from: c */
    public static String m12325c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m12327e((X509Certificate) certificate).mo24285a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static C4411f m12326d(X509Certificate x509Certificate) {
        return C4411f.m12869l(x509Certificate.getPublicKey().getEncoded()).mo24295o();
    }

    /* renamed from: e */
    static C4411f m12327e(X509Certificate x509Certificate) {
        return C4411f.m12869l(x509Certificate.getPublicKey().getEncoded()).mo24296p();
    }

    /* renamed from: a */
    public void mo23915a(String str, List<Certificate> list) {
        List<C4343b> b = mo23916b(str);
        if (!b.isEmpty()) {
            C10824c cVar = this.f7633b;
            if (cVar != null) {
                list = cVar.mo24009a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b.size();
                C4411f fVar = null;
                C4411f fVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C4343b bVar = b.get(i2);
                    if (bVar.f7637c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = m12327e(x509Certificate);
                        }
                        if (bVar.f7638d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f7637c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = m12326d(x509Certificate);
                        }
                        if (bVar.f7638d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f7637c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(m12325c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(Constants.COLON_SEPARATOR);
            int size4 = b.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(b.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C4343b> mo23916b(String str) {
        List<C4343b> emptyList = Collections.emptyList();
        for (C4343b next : this.f7632a) {
            if (next.mo23921a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4341g) {
            C4341g gVar = (C4341g) obj;
            return C4345c.m12370q(this.f7633b, gVar.f7633b) && this.f7632a.equals(gVar.f7632a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4341g mo23918f(@Nullable C10824c cVar) {
        return C4345c.m12370q(this.f7633b, cVar) ? this : new C4341g(this.f7632a, cVar);
    }

    public int hashCode() {
        C10824c cVar = this.f7633b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f7632a.hashCode();
    }
}
