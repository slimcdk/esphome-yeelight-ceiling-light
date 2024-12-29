package org.eclipse.jetty.util;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.UnsupportedEncodingException;
import org.apache.commons.p194io.IOUtils;

/* renamed from: org.eclipse.jetty.util.p */
public class C9997p implements Cloneable {

    /* renamed from: a */
    public static final String f18441a = System.getProperty("org.eclipse.jetty.util.URI.charset", "UTF-8");

    /* renamed from: a */
    public static String m24723a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            indexOf = str.indexOf(63);
        }
        if (indexOf == 0) {
            return str2 + str;
        }
        if (indexOf < 0) {
            indexOf = str.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 2);
        sb.append(str);
        int i = indexOf - 1;
        if (sb.charAt(i) == '/') {
            if (str2.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                sb.deleteCharAt(i);
                sb.insert(i, str2);
                return sb.toString();
            }
        } else if (!str2.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            sb.insert(indexOf, IOUtils.DIR_SEPARATOR_UNIX);
            indexOf++;
        }
        sb.insert(indexOf, str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r6.charAt(r9 - 1) == '.') goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b6, code lost:
        if (r6.charAt(r9 - 1) == '.') goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00da, code lost:
        if (r6.charAt(r9 - 1) == '.') goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013f A[LOOP:4: B:107:0x0137->B:110:0x013f, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24724b(java.lang.String r14) {
        /*
            if (r14 == 0) goto L_0x0154
            int r0 = r14.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x0154
        L_0x000a:
            int r0 = r14.length()
            r1 = 47
            int r2 = r14.lastIndexOf(r1, r0)
        L_0x0014:
            r3 = 3
            r4 = 2
            r5 = 46
            if (r0 <= 0) goto L_0x0044
            int r6 = r0 - r2
            if (r6 == r4) goto L_0x0032
            if (r6 == r3) goto L_0x0021
            goto L_0x003a
        L_0x0021:
            int r6 = r2 + 1
            char r6 = r14.charAt(r6)
            if (r6 != r5) goto L_0x003a
            int r6 = r2 + 2
            char r6 = r14.charAt(r6)
            if (r6 == r5) goto L_0x0044
            goto L_0x003a
        L_0x0032:
            int r6 = r2 + 1
            char r6 = r14.charAt(r6)
            if (r6 == r5) goto L_0x0044
        L_0x003a:
            int r0 = r2 + -1
            int r0 = r14.lastIndexOf(r1, r0)
            r13 = r2
            r2 = r0
            r0 = r13
            goto L_0x0014
        L_0x0044:
            if (r2 < r0) goto L_0x0047
            return r14
        L_0x0047:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r14 = 0
            r7 = -1
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x0051:
            if (r0 <= 0) goto L_0x0147
            int r11 = r0 - r2
            if (r11 == r4) goto L_0x00b9
            if (r11 == r3) goto L_0x0076
            if (r8 <= 0) goto L_0x0126
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x0126
            if (r2 < 0) goto L_0x0063
            r10 = r2
            goto L_0x0064
        L_0x0063:
            r10 = 0
        L_0x0064:
            int r11 = r6.length()
            if (r9 != r11) goto L_0x0126
            int r11 = r9 + -1
            char r11 = r6.charAt(r11)
            if (r11 != r5) goto L_0x0126
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x0126
        L_0x0076:
            int r11 = r2 + 1
            char r11 = r6.charAt(r11)
            if (r11 != r5) goto L_0x009d
            int r11 = r2 + 2
            char r11 = r6.charAt(r11)
            if (r11 == r5) goto L_0x0087
            goto L_0x009d
        L_0x0087:
            if (r9 >= 0) goto L_0x008a
            r9 = r0
        L_0x008a:
            int r8 = r8 + 1
            int r0 = r2 + -1
        L_0x008e:
            if (r0 < 0) goto L_0x0099
            char r10 = r6.charAt(r0)
            if (r10 == r1) goto L_0x0099
            int r0 = r0 + -1
            goto L_0x008e
        L_0x0099:
            r10 = r2
            r2 = r0
            r0 = r10
            goto L_0x0051
        L_0x009d:
            if (r8 <= 0) goto L_0x0126
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x0126
            if (r2 < 0) goto L_0x00a7
            r10 = r2
            goto L_0x00a8
        L_0x00a7:
            r10 = 0
        L_0x00a8:
            if (r10 <= 0) goto L_0x0126
            int r11 = r6.length()
            if (r9 != r11) goto L_0x0126
            int r11 = r9 + -1
            char r11 = r6.charAt(r11)
            if (r11 != r5) goto L_0x0126
            goto L_0x0072
        L_0x00b9:
            int r11 = r2 + 1
            char r12 = r6.charAt(r11)
            if (r12 == r5) goto L_0x00dd
            if (r8 <= 0) goto L_0x0126
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x0126
            if (r2 < 0) goto L_0x00cb
            r10 = r2
            goto L_0x00cc
        L_0x00cb:
            r10 = 0
        L_0x00cc:
            if (r10 <= 0) goto L_0x0126
            int r11 = r6.length()
            if (r9 != r11) goto L_0x0126
            int r11 = r9 + -1
            char r11 = r6.charAt(r11)
            if (r11 != r5) goto L_0x0126
            goto L_0x0072
        L_0x00dd:
            if (r2 >= 0) goto L_0x00f3
            int r12 = r6.length()
            if (r12 <= r4) goto L_0x00f3
            r12 = 1
            char r12 = r6.charAt(r12)
            if (r12 != r1) goto L_0x00f3
            char r12 = r6.charAt(r4)
            if (r12 != r1) goto L_0x00f3
            goto L_0x0126
        L_0x00f3:
            if (r9 >= 0) goto L_0x00f6
            r9 = r0
        L_0x00f6:
            if (r2 < 0) goto L_0x0117
            if (r2 != 0) goto L_0x0101
            char r10 = r6.charAt(r2)
            if (r10 != r1) goto L_0x0101
            goto L_0x0117
        L_0x0101:
            int r10 = r6.length()
            if (r0 != r10) goto L_0x0109
            r10 = r11
            goto L_0x010a
        L_0x0109:
            r10 = r2
        L_0x010a:
            int r0 = r2 + -1
        L_0x010c:
            if (r0 < 0) goto L_0x0142
            char r11 = r6.charAt(r0)
            if (r11 == r1) goto L_0x0142
            int r0 = r0 + -1
            goto L_0x010c
        L_0x0117:
            int r10 = r6.length()
            if (r9 >= r10) goto L_0x0125
            char r10 = r6.charAt(r9)
            if (r10 != r1) goto L_0x0125
            int r9 = r9 + 1
        L_0x0125:
            r10 = r11
        L_0x0126:
            if (r8 > 0) goto L_0x0135
            if (r10 < 0) goto L_0x0135
            if (r9 < r10) goto L_0x0135
            r6.delete(r10, r9)
            if (r8 <= 0) goto L_0x0133
            r9 = r0
            goto L_0x0134
        L_0x0133:
            r9 = -1
        L_0x0134:
            r10 = -1
        L_0x0135:
            int r0 = r2 + -1
        L_0x0137:
            if (r0 < 0) goto L_0x0142
            char r11 = r6.charAt(r0)
            if (r11 == r1) goto L_0x0142
            int r0 = r0 + -1
            goto L_0x0137
        L_0x0142:
            r13 = r2
            r2 = r0
            r0 = r13
            goto L_0x0051
        L_0x0147:
            if (r8 <= 0) goto L_0x014b
            r14 = 0
            return r14
        L_0x014b:
            if (r9 < 0) goto L_0x0150
            r6.delete(r10, r9)
        L_0x0150:
            java.lang.String r14 = r6.toString()
        L_0x0154:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.C9997p.m24724b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m24725c(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '/') {
                i3++;
                if (i3 == 2) {
                    break;
                }
            } else if (charAt == '?') {
                return str;
            } else {
                i3 = 0;
            }
            i2++;
        }
        if (i < 2) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(str, 0, i2);
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt2 = str.charAt(i2);
            if (charAt2 != '/') {
                if (charAt2 == '?') {
                    stringBuffer.append(str, i2, length);
                    break;
                }
                stringBuffer.append(charAt2);
                i = 0;
            } else {
                int i4 = i + 1;
                if (i == 0) {
                    stringBuffer.append(charAt2);
                }
                i = i4;
            }
            i2++;
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        r4 = r6;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24726d(java.lang.String r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r11.length()
            r2 = 0
            r3 = r0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000d:
            if (r4 >= r1) goto L_0x006c
            char r7 = r11.charAt(r4)
            r8 = 37
            if (r7 != r8) goto L_0x0037
            int r8 = r4 + 2
            if (r8 >= r1) goto L_0x0037
            if (r0 != 0) goto L_0x0024
            char[] r0 = new char[r1]
            byte[] r3 = new byte[r1]
            r11.getChars(r2, r4, r0, r2)
        L_0x0024:
            int r7 = r5 + 1
            int r4 = r4 + 1
            r9 = 16
            r10 = 2
            int r4 = org.eclipse.jetty.util.C9996o.m24717d(r11, r4, r10, r9)
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r5] = r4
            r5 = r7
            r4 = r8
            goto L_0x0069
        L_0x0037:
            r8 = 59
            if (r7 != r8) goto L_0x0043
            if (r0 != 0) goto L_0x006c
            char[] r0 = new char[r1]
            r11.getChars(r2, r4, r0, r2)
            goto L_0x006d
        L_0x0043:
            if (r3 != 0) goto L_0x0048
            int r6 = r6 + 1
            goto L_0x0069
        L_0x0048:
            if (r5 <= 0) goto L_0x0064
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            java.lang.String r9 = f18441a     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            r8.<init>(r3, r2, r5, r9)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            goto L_0x0057
        L_0x0052:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r3, r2, r5)
        L_0x0057:
            int r5 = r8.length()
            r8.getChars(r2, r5, r0, r6)
            int r5 = r8.length()
            int r6 = r6 + r5
            r5 = 0
        L_0x0064:
            int r8 = r6 + 1
            r0[r6] = r7
            r6 = r8
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x006c:
            r4 = r6
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            return r11
        L_0x0070:
            if (r5 <= 0) goto L_0x008b
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x007a }
            java.lang.String r1 = f18441a     // Catch:{ UnsupportedEncodingException -> 0x007a }
            r11.<init>(r3, r2, r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x007a }
            goto L_0x007f
        L_0x007a:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r3, r2, r5)
        L_0x007f:
            int r1 = r11.length()
            r11.getChars(r2, r1, r0, r4)
            int r11 = r11.length()
            int r4 = r4 + r11
        L_0x008b:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r2, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.C9997p.m24726d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static String m24727e(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            int i6 = i4 + i;
            byte b = bArr[i6];
            if (b == 37 && (i3 = i4 + 2) < i2) {
                b = (byte) (C9996o.m24718e(bArr, i6 + 1, 2, 16) & 255);
                i4 = i3;
            } else if (b == 59) {
                i2 = i4;
                break;
            } else if (bArr2 == null) {
                i5++;
                i4++;
            }
            if (bArr2 == null) {
                bArr2 = new byte[i2];
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr2[i7] = bArr[i7 + i];
                }
            }
            bArr2[i5] = b;
            i5++;
            i4++;
        }
        return bArr2 == null ? C9995n.m24712h(bArr, i, i2, f18441a) : C9995n.m24712h(bArr2, 0, i5, f18441a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = m24729g((java.lang.StringBuilder) null, r1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24728f(java.lang.String r1) {
        /*
            if (r1 == 0) goto L_0x0015
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            r0 = 0
            java.lang.StringBuilder r0 = m24729g(r0, r1)
            if (r0 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            java.lang.String r1 = r0.toString()
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.C9997p.m24728f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static StringBuilder m24729g(StringBuilder sb, String str) {
        StringBuilder sb2;
        String str2;
        String str3;
        byte[] bArr;
        String str4 = str;
        byte[] bArr2 = null;
        int i = 0;
        if (sb == null) {
            int i2 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    sb2 = sb;
                    break;
                }
                char charAt = str4.charAt(i2);
                if (charAt == ' ' || charAt == '%' || charAt == '\'' || charAt == '\"' || charAt == '#' || charAt == ';' || charAt == '<' || charAt == '>' || charAt == '?') {
                    sb2 = new StringBuilder(str.length() * 2);
                } else if (charAt > 127) {
                    try {
                        bArr = str4.getBytes(f18441a);
                        sb2 = new StringBuilder(str.length() * 2);
                        break;
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalStateException(e);
                    }
                } else {
                    i2++;
                }
            }
            bArr = null;
            if (sb2 == null) {
                return null;
            }
            bArr2 = bArr;
        } else {
            sb2 = sb;
        }
        synchronized (sb2) {
            if (bArr2 != null) {
                while (i < bArr2.length) {
                    byte b = bArr2[i];
                    if (b == 32) {
                        str3 = "%20";
                    } else if (b == 37) {
                        str3 = "%25";
                    } else if (b == 39) {
                        str3 = "%27";
                    } else if (b == 34) {
                        str3 = "%22";
                    } else if (b == 35) {
                        str3 = "%23";
                    } else if (b == 59) {
                        str3 = "%3B";
                    } else if (b == 60) {
                        str3 = "%3C";
                    } else if (b == 62) {
                        str3 = "%3E";
                    } else if (b != 63) {
                        if (b < 0) {
                            sb2.append('%');
                            C9996o.m24719f(b, sb2);
                        } else {
                            sb2.append((char) b);
                        }
                        i++;
                    } else {
                        str3 = "%3F";
                    }
                    sb2.append(str3);
                    i++;
                }
            } else {
                while (i < str.length()) {
                    char charAt2 = str4.charAt(i);
                    if (charAt2 == ' ') {
                        str2 = "%20";
                    } else if (charAt2 == '%') {
                        str2 = "%25";
                    } else if (charAt2 == '\'') {
                        str2 = "%27";
                    } else if (charAt2 == '\"') {
                        str2 = "%22";
                    } else if (charAt2 == '#') {
                        str2 = "%23";
                    } else if (charAt2 == ';') {
                        str2 = "%3B";
                    } else if (charAt2 == '<') {
                        str2 = "%3C";
                    } else if (charAt2 == '>') {
                        str2 = "%3E";
                    } else if (charAt2 != '?') {
                        sb2.append(charAt2);
                        i++;
                    } else {
                        str2 = "%3F";
                    }
                    sb2.append(str2);
                    i++;
                }
            }
        }
        return sb2;
    }

    /* renamed from: h */
    public static boolean m24730h(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && (i <= 0 || ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != '+' && charAt != '-')))) {
                    break;
                }
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m24731i(String str) {
        int lastIndexOf;
        if (str == null || MiotCloudImpl.COOKIE_PATH.equals(str) || (lastIndexOf = str.lastIndexOf(47, str.length() - 2)) < 0) {
            return null;
        }
        return str.substring(0, lastIndexOf + 1);
    }
}
