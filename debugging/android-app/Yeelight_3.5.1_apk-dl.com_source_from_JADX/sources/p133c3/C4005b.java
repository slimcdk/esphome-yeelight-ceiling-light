package p133c3;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: c3.b */
public final class C4005b implements HostnameVerifier {

    /* renamed from: a */
    public static final C4005b f6764a = new C4005b();

    /* renamed from: b */
    private static final Pattern f6765b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C4005b() {
    }

    /* renamed from: a */
    public static List<String> m11631a(X509Certificate x509Certificate) {
        List<String> b = m11632b(x509Certificate, 7);
        List<String> b2 = m11632b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m11632b(X509Certificate x509Certificate, int i) {
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

    /* renamed from: d */
    static boolean m11633d(String str) {
        return f6765b.matcher(str).matches();
    }

    /* renamed from: e */
    private boolean m11634e(String str, String str2) {
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

    /* renamed from: f */
    private boolean m11635f(String str, X509Certificate x509Certificate) {
        String b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> b2 = m11632b(x509Certificate, 2);
        int size = b2.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m11634e(lowerCase, b2.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (b = new C4004a(x509Certificate.getSubjectX500Principal()).mo26591b("cn")) == null) {
            return false;
        }
        return m11634e(lowerCase, b);
    }

    /* renamed from: g */
    private boolean m11636g(String str, X509Certificate x509Certificate) {
        List<String> b = m11632b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo26592c(String str, X509Certificate x509Certificate) {
        return m11633d(str) ? m11636g(str, x509Certificate) : m11635f(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo26592c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
