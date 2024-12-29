package org.eclipse.jetty.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: org.eclipse.jetty.util.n */
public class C9995n {

    /* renamed from: a */
    private static final C9003c f18434a = C9001b.m21450a(C9995n.class);

    /* renamed from: b */
    public static final Charset f18435b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    private static char[] f18436c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127};

    static {
        System.getProperty("line.separator", IOUtils.LINE_SEPARATOR_UNIX);
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m24705a(StringBuilder sb, int i) {
        if (i < 100) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
        }
    }

    /* renamed from: b */
    public static String m24706b(String str) {
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
            if (charAt <= 127 && charAt != (c = f18436c[charAt])) {
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
                cArr[i2] = f18436c[cArr[i2]];
            }
            i = i2;
        }
        return cArr == null ? str : new String(cArr);
    }

    /* renamed from: c */
    public static byte[] m24707c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (Exception e) {
            f18434a.mo36856j(e);
            return str.getBytes();
        }
    }

    /* renamed from: d */
    public static boolean m24708d(String str) {
        return "UTF-8".equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    public static String m24709e(String str) {
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
    public static String m24710f(String str, String str2, String str3) {
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
    public static boolean m24711g(String str, String str2) {
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
                    charAt = f18436c[charAt];
                }
                if (charAt2 <= 127) {
                    charAt2 = f18436c[charAt2];
                }
                if (charAt != charAt2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public static String m24712h(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: i */
    public static String m24713i(String str) {
        return C9994m.m24704d(str);
    }
}
