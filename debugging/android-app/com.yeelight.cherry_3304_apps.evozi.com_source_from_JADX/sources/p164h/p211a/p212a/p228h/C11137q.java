package p164h.p211a.p212a.p228h;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.q */
public class C11137q {

    /* renamed from: a */
    private static final C11158c f22064a = C11156b.m29015a(C11137q.class);

    /* renamed from: b */
    public static final Charset f22065b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    private static char[] f22066c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127};

    static {
        System.getProperty("line.separator", IOUtils.LINE_SEPARATOR_UNIX);
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m28918a(StringBuilder sb, int i) {
        if (i < 100) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
        }
    }

    /* renamed from: b */
    public static String m28919b(String str) {
        int i;
        char[] cArr;
        char c;
        int length = str.length();
        while (true) {
            i = length - 1;
            if (length <= 0) {
                cArr = null;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt <= 127 && charAt != (c = f22066c[charAt])) {
                cArr = str.toCharArray();
                cArr[i] = c;
                break;
            }
            length = i;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            if (cArr[i2] <= 127) {
                cArr[i2] = f22066c[cArr[i2]];
            }
            i = i2;
        }
        return cArr == null ? str : new String(cArr);
    }

    /* renamed from: c */
    public static byte[] m28920c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (Exception e) {
            f22064a.mo35495k(e);
            return str.getBytes();
        }
    }

    /* renamed from: d */
    public static boolean m28921d(String str) {
        return "UTF-8".equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    public static String m28922e(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isISOControl(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static String m28923f(String str, String str2, String str3) {
        int i = 0;
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + str3.length());
        do {
            sb.append(str.substring(i, indexOf));
            sb.append(str3);
            i = str2.length() + indexOf;
            indexOf = str.indexOf(str2, i);
        } while (indexOf != -1);
        if (i < str.length()) {
            sb.append(str.substring(i, str.length()));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m28924g(String str, String str2) {
        if (str2 == null) {
            return true;
        }
        if (str == null || str.length() < str2.length()) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                if (charAt <= 127) {
                    charAt = f22066c[charAt];
                }
                if (charAt2 <= 127) {
                    charAt2 = f22066c[charAt2];
                }
                if (charAt != charAt2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public static String m28925h(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: i */
    public static String m28926i(String str) {
        return C11132o.m28909d(str);
    }
}
