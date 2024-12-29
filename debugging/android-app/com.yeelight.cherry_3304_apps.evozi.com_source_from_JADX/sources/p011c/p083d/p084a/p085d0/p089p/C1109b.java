package p011c.p083d.p084a.p085d0.p089p;

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
import org.apache.commons.p271io.FilenameUtils;

/* renamed from: c.d.a.d0.p.b */
public final class C1109b implements HostnameVerifier {

    /* renamed from: a */
    public static final C1109b f1643a = new C1109b();

    /* renamed from: b */
    private static final Pattern f1644b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C1109b() {
    }

    /* renamed from: a */
    public static List<String> m2601a(X509Certificate x509Certificate) {
        List<String> b = m2602b(x509Certificate, 7);
        List<String> b2 = m2602b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m2602b(X509Certificate x509Certificate, int i) {
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
    static boolean m2603d(String str) {
        return f1644b.matcher(str).matches();
    }

    /* renamed from: e */
    private boolean m2604e(String str, String str2) {
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
    private boolean m2605f(String str, X509Certificate x509Certificate) {
        String b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> b2 = m2602b(x509Certificate, 2);
        int size = b2.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m2604e(lowerCase, b2.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (b = new C1108a(x509Certificate.getSubjectX500Principal()).mo9666b("cn")) == null) {
            return false;
        }
        return m2604e(lowerCase, b);
    }

    /* renamed from: g */
    private boolean m2606g(String str, X509Certificate x509Certificate) {
        List<String> b = m2602b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo9667c(String str, X509Certificate x509Certificate) {
        return m2603d(str) ? m2606g(str, x509Certificate) : m2605f(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo9667c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
