package p213t5;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.commons.p194io.FilenameUtils;
import p056k5.C3300c;

/* renamed from: t5.d */
public final class C10399d implements HostnameVerifier {

    /* renamed from: a */
    public static final C10399d f19463a = new C10399d();

    private C10399d() {
    }

    /* renamed from: a */
    public static List<String> m26332a(X509Certificate x509Certificate) {
        List<String> b = m26333b(x509Certificate, 7);
        List<String> b2 = m26333b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m26333b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    private boolean m26334e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String d : m26333b(x509Certificate, 2)) {
            if (mo42044d(lowerCase, d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m26335f(String str, X509Certificate x509Certificate) {
        List<String> b = m26333b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo42043c(String str, X509Certificate x509Certificate) {
        return C3300c.m8915I(str) ? m26335f(str, x509Certificate) : m26334e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean mo42044d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + FilenameUtils.EXTENSION_SEPARATOR;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + FilenameUtils.EXTENSION_SEPARATOR;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo42043c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
