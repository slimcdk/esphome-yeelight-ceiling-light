package com.squareup.okhttp;

import com.xiaomi.mipush.sdk.Constants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.g */
public final class C4285g {

    /* renamed from: b */
    public static final C4285g f6950b = new C4287b().mo27863b();

    /* renamed from: a */
    private final Map<String, Set<ByteString>> f6951a;

    /* renamed from: com.squareup.okhttp.g$b */
    public static final class C4287b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<String, Set<ByteString>> f6952a = new LinkedHashMap();

        /* renamed from: b */
        public C4285g mo27863b() {
            return new C4285g(this);
        }
    }

    private C4285g(C4287b bVar) {
        this.f6951a = C12033k.m31050j(bVar.f6952a);
    }

    /* renamed from: c */
    public static String m11907c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + m11908d((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: d */
    private static ByteString m11908d(X509Certificate x509Certificate) {
        return C12033k.m31055o(ByteString.m9966of(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public void mo27861a(String str, List<Certificate> list) {
        Set<ByteString> b = mo27862b(str);
        if (b != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!b.contains(m11908d((X509Certificate) list.get(i)))) {
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
                sb.append(m11907c(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(Constants.COLON_SEPARATOR);
            for (ByteString base64 : b) {
                sb.append("\n    sha1/");
                sb.append(base64.base64());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<ByteString> mo27862b(String str) {
        Set<ByteString> set;
        Set<ByteString> set2 = this.f6951a.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            set = this.f6951a.get("*." + str.substring(indexOf + 1));
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
