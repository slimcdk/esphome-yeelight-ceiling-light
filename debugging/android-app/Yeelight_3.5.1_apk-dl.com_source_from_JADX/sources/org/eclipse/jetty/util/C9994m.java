package org.eclipse.jetty.util;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.commons.p194io.IOUtils;

/* renamed from: org.eclipse.jetty.util.m */
public class C9994m extends StringTokenizer {

    /* renamed from: k */
    private static final char[] f18423k;

    /* renamed from: a */
    private String f18424a;

    /* renamed from: b */
    private String f18425b;

    /* renamed from: c */
    private boolean f18426c;

    /* renamed from: d */
    private boolean f18427d;

    /* renamed from: e */
    private StringBuffer f18428e;

    /* renamed from: f */
    private boolean f18429f;

    /* renamed from: g */
    private int f18430g;

    /* renamed from: h */
    private int f18431h;

    /* renamed from: i */
    private boolean f18432i;

    /* renamed from: j */
    private boolean f18433j;

    static {
        char[] cArr = new char[32];
        f18423k = cArr;
        Arrays.fill(cArr, 65535);
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[12] = 'f';
        cArr[13] = 'r';
    }

    public C9994m(String str, String str2) {
        this(str, str2, false, false);
    }

    public C9994m(String str, String str2, boolean z, boolean z2) {
        super("");
        this.f18425b = "\t\n\r";
        this.f18426c = false;
        this.f18427d = false;
        this.f18429f = false;
        this.f18430g = 0;
        this.f18431h = 0;
        this.f18432i = true;
        this.f18433j = true;
        this.f18424a = str;
        if (str2 != null) {
            this.f18425b = str2;
        }
        this.f18427d = z;
        this.f18426c = z2;
        if (this.f18425b.indexOf(39) >= 0 || this.f18425b.indexOf(34) >= 0) {
            throw new Error("Can't use quotes as delimiters: " + this.f18425b);
        }
        this.f18428e = new StringBuffer(this.f18424a.length() > 1024 ? 512 : this.f18424a.length() / 2);
    }

    /* renamed from: a */
    public static void m24701a(Appendable appendable, String str) {
        try {
            appendable.append('\"');
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt >= ' ') {
                    if (charAt == '\"' || charAt == '\\') {
                        appendable.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    appendable.append(charAt);
                } else {
                    char c = f18423k[charAt];
                    if (c == 65535) {
                        appendable.append(IOUtils.DIR_SEPARATOR_WINDOWS).append('u').append('0').append('0');
                        if (charAt < 16) {
                            appendable.append('0');
                        }
                        appendable.append(Integer.toString(charAt, 16));
                    } else {
                        appendable.append(IOUtils.DIR_SEPARATOR_WINDOWS).append(c);
                    }
                }
            }
            appendable.append('\"');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static String m24702b(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\\' || charAt == '\"' || charAt == '\'' || Character.isWhitespace(charAt) || str2.indexOf(charAt) >= 0) {
                StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
                m24701a(stringBuffer, str);
                return stringBuffer.toString();
            }
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m24703c(Appendable appendable, String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str2.indexOf(str.charAt(i)) >= 0) {
                m24701a(appendable, str);
                return true;
            }
        }
        try {
            appendable.append(str);
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static String m24704d(String str) {
        char charAt;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (charAt = str.charAt(0)) != str.charAt(str.length() - 1)) {
            return str;
        }
        if (charAt != '\"' && charAt != '\'') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() - 2);
        int i = 1;
        boolean z = false;
        while (i < str.length() - 1) {
            char charAt2 = str.charAt(i);
            char c = IOUtils.DIR_SEPARATOR_WINDOWS;
            if (z) {
                if (charAt2 != '\"') {
                    char c2 = IOUtils.DIR_SEPARATOR_UNIX;
                    if (charAt2 != '/') {
                        if (charAt2 != '\\') {
                            c = 8;
                            if (charAt2 != 'b') {
                                if (charAt2 == 'f') {
                                    c2 = 12;
                                } else if (charAt2 == 'n') {
                                    c2 = 10;
                                } else if (charAt2 == 'r') {
                                    c2 = 13;
                                } else if (charAt2 == 't') {
                                    c2 = 9;
                                } else if (charAt2 != 'u') {
                                    sb.append(charAt2);
                                } else {
                                    int i2 = i + 1;
                                    int i3 = i2 + 1;
                                    int b = (C9996o.m24715b((byte) str.charAt(i)) << 24) + (C9996o.m24715b((byte) str.charAt(i2)) << ParameterInitDefType.ExternalSamplerInit);
                                    int i4 = i3 + 1;
                                    int b2 = b + (C9996o.m24715b((byte) str.charAt(i3)) << 8);
                                    sb.append((char) (b2 + C9996o.m24715b((byte) str.charAt(i4))));
                                    i = i4 + 1;
                                }
                            }
                        }
                        sb.append(c);
                    }
                    sb.append(c2);
                } else {
                    sb.append('\"');
                }
                z = false;
            } else if (charAt2 == '\\') {
                z = true;
            } else {
                sb.append(charAt2);
            }
            i++;
        }
        return sb.toString();
    }

    public int countTokens() {
        return -1;
    }

    public boolean hasMoreElements() {
        return hasMoreTokens();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r10.f18426c != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r10.f18426c != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r10.f18426c != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r10.f18426c != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r10.f18428e.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (r10.f18426c != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r10.f18426c != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        if (r10.f18426c != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        if (r10.f18426c != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ce, code lost:
        r10.f18428e.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d3, code lost:
        r2 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasMoreTokens() {
        /*
            r10 = this;
            boolean r0 = r10.f18429f
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r10.f18430g
            r10.f18431h = r0
            r0 = 0
            r2 = 0
        L_0x000c:
            r3 = 0
        L_0x000d:
            int r4 = r10.f18430g
            java.lang.String r5 = r10.f18424a
            int r5 = r5.length()
            if (r4 >= r5) goto L_0x00e0
            java.lang.String r4 = r10.f18424a
            int r5 = r10.f18430g
            int r6 = r5 + 1
            r10.f18430g = r6
            char r4 = r4.charAt(r5)
            r5 = 34
            r6 = 39
            r7 = 3
            r8 = 2
            if (r2 == 0) goto L_0x009e
            if (r2 == r1) goto L_0x006b
            r9 = 92
            if (r2 == r8) goto L_0x004d
            if (r2 == r7) goto L_0x0034
            goto L_0x000d
        L_0x0034:
            r10.f18429f = r1
            if (r3 == 0) goto L_0x0039
            goto L_0x0051
        L_0x0039:
            if (r4 != r5) goto L_0x0046
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00dd
        L_0x003f:
            java.lang.StringBuffer r2 = r10.f18428e
            r2.append(r4)
            goto L_0x00dd
        L_0x0046:
            if (r4 != r9) goto L_0x0097
            boolean r3 = r10.f18426c
            if (r3 == 0) goto L_0x0069
            goto L_0x0064
        L_0x004d:
            r10.f18429f = r1
            if (r3 == 0) goto L_0x0057
        L_0x0051:
            java.lang.StringBuffer r3 = r10.f18428e
            r3.append(r4)
            goto L_0x000c
        L_0x0057:
            if (r4 != r6) goto L_0x005e
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00dd
            goto L_0x003f
        L_0x005e:
            if (r4 != r9) goto L_0x0097
            boolean r3 = r10.f18426c
            if (r3 == 0) goto L_0x0069
        L_0x0064:
            java.lang.StringBuffer r3 = r10.f18428e
            r3.append(r4)
        L_0x0069:
            r3 = 1
            goto L_0x000d
        L_0x006b:
            r10.f18429f = r1
            java.lang.String r9 = r10.f18425b
            int r9 = r9.indexOf(r4)
            if (r9 < 0) goto L_0x0081
            boolean r0 = r10.f18427d
            if (r0 == 0) goto L_0x007e
            int r0 = r10.f18430g
            int r0 = r0 - r1
            r10.f18430g = r0
        L_0x007e:
            boolean r0 = r10.f18429f
            return r0
        L_0x0081:
            if (r4 != r6) goto L_0x008c
            boolean r6 = r10.f18433j
            if (r6 == 0) goto L_0x008c
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00c1
            goto L_0x00bc
        L_0x008c:
            if (r4 != r5) goto L_0x0097
            boolean r5 = r10.f18432i
            if (r5 == 0) goto L_0x0097
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00d3
            goto L_0x00ce
        L_0x0097:
            java.lang.StringBuffer r5 = r10.f18428e
            r5.append(r4)
            goto L_0x000d
        L_0x009e:
            java.lang.String r9 = r10.f18425b
            int r9 = r9.indexOf(r4)
            if (r9 < 0) goto L_0x00b2
            boolean r5 = r10.f18427d
            if (r5 == 0) goto L_0x000d
            java.lang.StringBuffer r0 = r10.f18428e
            r0.append(r4)
            r10.f18429f = r1
            return r1
        L_0x00b2:
            if (r4 != r6) goto L_0x00c4
            boolean r2 = r10.f18433j
            if (r2 == 0) goto L_0x00c4
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00c1
        L_0x00bc:
            java.lang.StringBuffer r2 = r10.f18428e
            r2.append(r4)
        L_0x00c1:
            r2 = 2
            goto L_0x000d
        L_0x00c4:
            if (r4 != r5) goto L_0x00d6
            boolean r2 = r10.f18432i
            if (r2 == 0) goto L_0x00d6
            boolean r2 = r10.f18426c
            if (r2 == 0) goto L_0x00d3
        L_0x00ce:
            java.lang.StringBuffer r2 = r10.f18428e
            r2.append(r4)
        L_0x00d3:
            r2 = 3
            goto L_0x000d
        L_0x00d6:
            java.lang.StringBuffer r2 = r10.f18428e
            r2.append(r4)
            r10.f18429f = r1
        L_0x00dd:
            r2 = 1
            goto L_0x000d
        L_0x00e0:
            boolean r0 = r10.f18429f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.C9994m.hasMoreTokens():boolean");
    }

    public Object nextElement() {
        return nextToken();
    }

    public String nextToken() {
        StringBuffer stringBuffer;
        if (!hasMoreTokens() || (stringBuffer = this.f18428e) == null) {
            throw new NoSuchElementException();
        }
        String stringBuffer2 = stringBuffer.toString();
        this.f18428e.setLength(0);
        this.f18429f = false;
        return stringBuffer2;
    }

    public String nextToken(String str) {
        this.f18425b = str;
        this.f18430g = this.f18431h;
        this.f18428e.setLength(0);
        this.f18429f = false;
        return nextToken();
    }
}
