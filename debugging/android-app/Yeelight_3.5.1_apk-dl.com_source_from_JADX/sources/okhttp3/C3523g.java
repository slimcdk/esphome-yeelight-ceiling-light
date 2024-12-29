package okhttp3;

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
import okio.ByteString;
import p056k5.C3300c;
import p213t5.C10398c;

/* renamed from: okhttp3.g */
public final class C3523g {

    /* renamed from: c */
    public static final C3523g f5706c = new C3524a().mo24438a();

    /* renamed from: a */
    private final Set<C3525b> f5707a;
    @Nullable

    /* renamed from: b */
    private final C10398c f5708b;

    /* renamed from: okhttp3.g$a */
    public static final class C3524a {

        /* renamed from: a */
        private final List<C3525b> f5709a = new ArrayList();

        /* renamed from: a */
        public C3523g mo24438a() {
            return new C3523g(new LinkedHashSet(this.f5709a), (C10398c) null);
        }
    }

    /* renamed from: okhttp3.g$b */
    static final class C3525b {

        /* renamed from: a */
        final String f5710a;

        /* renamed from: b */
        final String f5711b;

        /* renamed from: c */
        final String f5712c;

        /* renamed from: d */
        final ByteString f5713d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo24439a(String str) {
            if (!this.f5710a.startsWith("*.")) {
                return str.equals(this.f5711b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f5711b.length()) {
                String str2 = this.f5711b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3525b) {
                C3525b bVar = (C3525b) obj;
                return this.f5710a.equals(bVar.f5710a) && this.f5712c.equals(bVar.f5712c) && this.f5713d.equals(bVar.f5713d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f5710a.hashCode()) * 31) + this.f5712c.hashCode()) * 31) + this.f5713d.hashCode();
        }

        public String toString() {
            return this.f5712c + this.f5713d.base64();
        }
    }

    C3523g(Set<C3525b> set, @Nullable C10398c cVar) {
        this.f5707a = set;
        this.f5708b = cVar;
    }

    /* renamed from: c */
    public static String m9669c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m9671e((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    static ByteString m9670d(X509Certificate x509Certificate) {
        return ByteString.m9966of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    /* renamed from: e */
    static ByteString m9671e(X509Certificate x509Certificate) {
        return ByteString.m9966of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* renamed from: a */
    public void mo24433a(String str, List<Certificate> list) {
        List<C3525b> b = mo24434b(str);
        if (!b.isEmpty()) {
            C10398c cVar = this.f5708b;
            if (cVar != null) {
                list = cVar.mo25945a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C3525b bVar = b.get(i2);
                    if (bVar.f5712c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = m9671e(x509Certificate);
                        }
                        if (bVar.f5713d.equals(byteString)) {
                            return;
                        }
                    } else if (bVar.f5712c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = m9670d(x509Certificate);
                        }
                        if (bVar.f5713d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f5712c);
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
                sb.append(m9669c(x509Certificate2));
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
    public List<C3525b> mo24434b(String str) {
        List<C3525b> emptyList = Collections.emptyList();
        for (C3525b next : this.f5707a) {
            if (next.mo24439a(str)) {
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
        if (obj instanceof C3523g) {
            C3523g gVar = (C3523g) obj;
            return C3300c.m8931p(this.f5708b, gVar.f5708b) && this.f5707a.equals(gVar.f5707a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3523g mo24436f(@Nullable C10398c cVar) {
        return C3300c.m8931p(this.f5708b, cVar) ? this : new C3523g(this.f5707a, cVar);
    }

    public int hashCode() {
        C10398c cVar = this.f5708b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f5707a.hashCode();
    }
}
