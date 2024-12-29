package p164h.p211a.p212a.p228h;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.commons.p271io.IOUtils;

/* renamed from: h.a.a.h.o */
public class C11132o extends StringTokenizer {

    /* renamed from: k */
    private static final char[] f22039k;

    /* renamed from: a */
    private String f22040a;

    /* renamed from: b */
    private String f22041b;

    /* renamed from: c */
    private boolean f22042c;

    /* renamed from: d */
    private boolean f22043d;

    /* renamed from: e */
    private StringBuffer f22044e;

    /* renamed from: f */
    private boolean f22045f;

    /* renamed from: g */
    private int f22046g;

    /* renamed from: h */
    private int f22047h;

    /* renamed from: i */
    private boolean f22048i;

    /* renamed from: j */
    private boolean f22049j;

    static {
        char[] cArr = new char[32];
        f22039k = cArr;
        Arrays.fill(cArr, 65535);
        char[] cArr2 = f22039k;
        cArr2[8] = 'b';
        cArr2[9] = 't';
        cArr2[10] = 'n';
        cArr2[12] = 'f';
        cArr2[13] = 'r';
    }

    public C11132o(String str, String str2) {
        this(str, str2, false, false);
    }

    public C11132o(String str, String str2, boolean z, boolean z2) {
        super("");
        this.f22041b = "\t\n\r";
        this.f22042c = false;
        this.f22043d = false;
        this.f22045f = false;
        this.f22046g = 0;
        this.f22047h = 0;
        this.f22048i = true;
        this.f22049j = true;
        this.f22040a = str;
        if (str2 != null) {
            this.f22041b = str2;
        }
        this.f22043d = z;
        this.f22042c = z2;
        if (this.f22041b.indexOf(39) >= 0 || this.f22041b.indexOf(34) >= 0) {
            throw new Error("Can't use quotes as delimiters: " + this.f22041b);
        }
        this.f22044e = new StringBuffer(this.f22040a.length() > 1024 ? 512 : this.f22040a.length() / 2);
    }

    /* renamed from: a */
    public static void m28906a(Appendable appendable, String str) {
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
                    char c = f22039k[charAt];
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
    public static String m28907b(String str, String str2) {
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
                m28906a(stringBuffer, str);
                return stringBuffer.toString();
            }
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m28908c(Appendable appendable, String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str2.indexOf(str.charAt(i)) >= 0) {
                m28906a(appendable, str);
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
    public static String m28909d(String str) {
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
                                    int b = (C11138r.m28928b((byte) str.charAt(i)) << 24) + (C11138r.m28928b((byte) str.charAt(i2)) << ParameterInitDefType.ExternalSamplerInit);
                                    int i4 = i3 + 1;
                                    int b2 = b + (C11138r.m28928b((byte) str.charAt(i3)) << 8);
                                    sb.append((char) (b2 + C11138r.m28928b((byte) str.charAt(i4))));
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
        if (r10.f22042c != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r10.f22042c != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r10.f22042c != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r10.f22042c != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r10.f22044e.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (r10.f22042c != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r10.f22042c != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        if (r10.f22042c != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        if (r10.f22042c != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ce, code lost:
        r10.f22044e.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d3, code lost:
        r2 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasMoreTokens() {
        /*
            r10 = this;
            boolean r0 = r10.f22045f
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r10.f22046g
            r10.f22047h = r0
            r0 = 0
            r2 = 0
        L_0x000c:
            r3 = 0
        L_0x000d:
            int r4 = r10.f22046g
            java.lang.String r5 = r10.f22040a
            int r5 = r5.length()
            if (r4 >= r5) goto L_0x00e0
            java.lang.String r4 = r10.f22040a
            int r5 = r10.f22046g
            int r6 = r5 + 1
            r10.f22046g = r6
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
            r10.f22045f = r1
            if (r3 == 0) goto L_0x0039
            goto L_0x0051
        L_0x0039:
            if (r4 != r5) goto L_0x0046
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00dd
        L_0x003f:
            java.lang.StringBuffer r2 = r10.f22044e
            r2.append(r4)
            goto L_0x00dd
        L_0x0046:
            if (r4 != r9) goto L_0x0097
            boolean r3 = r10.f22042c
            if (r3 == 0) goto L_0x0069
            goto L_0x0064
        L_0x004d:
            r10.f22045f = r1
            if (r3 == 0) goto L_0x0057
        L_0x0051:
            java.lang.StringBuffer r3 = r10.f22044e
            r3.append(r4)
            goto L_0x000c
        L_0x0057:
            if (r4 != r6) goto L_0x005e
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00dd
            goto L_0x003f
        L_0x005e:
            if (r4 != r9) goto L_0x0097
            boolean r3 = r10.f22042c
            if (r3 == 0) goto L_0x0069
        L_0x0064:
            java.lang.StringBuffer r3 = r10.f22044e
            r3.append(r4)
        L_0x0069:
            r3 = 1
            goto L_0x000d
        L_0x006b:
            r10.f22045f = r1
            java.lang.String r9 = r10.f22041b
            int r9 = r9.indexOf(r4)
            if (r9 < 0) goto L_0x0081
            boolean r0 = r10.f22043d
            if (r0 == 0) goto L_0x007e
            int r0 = r10.f22046g
            int r0 = r0 - r1
            r10.f22046g = r0
        L_0x007e:
            boolean r0 = r10.f22045f
            return r0
        L_0x0081:
            if (r4 != r6) goto L_0x008c
            boolean r6 = r10.f22049j
            if (r6 == 0) goto L_0x008c
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00c1
            goto L_0x00bc
        L_0x008c:
            if (r4 != r5) goto L_0x0097
            boolean r5 = r10.f22048i
            if (r5 == 0) goto L_0x0097
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00d3
            goto L_0x00ce
        L_0x0097:
            java.lang.StringBuffer r5 = r10.f22044e
            r5.append(r4)
            goto L_0x000d
        L_0x009e:
            java.lang.String r9 = r10.f22041b
            int r9 = r9.indexOf(r4)
            if (r9 < 0) goto L_0x00b2
            boolean r5 = r10.f22043d
            if (r5 == 0) goto L_0x000d
            java.lang.StringBuffer r0 = r10.f22044e
            r0.append(r4)
            r10.f22045f = r1
            return r1
        L_0x00b2:
            if (r4 != r6) goto L_0x00c4
            boolean r2 = r10.f22049j
            if (r2 == 0) goto L_0x00c4
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00c1
        L_0x00bc:
            java.lang.StringBuffer r2 = r10.f22044e
            r2.append(r4)
        L_0x00c1:
            r2 = 2
            goto L_0x000d
        L_0x00c4:
            if (r4 != r5) goto L_0x00d6
            boolean r2 = r10.f22048i
            if (r2 == 0) goto L_0x00d6
            boolean r2 = r10.f22042c
            if (r2 == 0) goto L_0x00d3
        L_0x00ce:
            java.lang.StringBuffer r2 = r10.f22044e
            r2.append(r4)
        L_0x00d3:
            r2 = 3
            goto L_0x000d
        L_0x00d6:
            java.lang.StringBuffer r2 = r10.f22044e
            r2.append(r4)
            r10.f22045f = r1
        L_0x00dd:
            r2 = 1
            goto L_0x000d
        L_0x00e0:
            boolean r0 = r10.f22045f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.C11132o.hasMoreTokens():boolean");
    }

    public Object nextElement() {
        return nextToken();
    }

    public String nextToken() {
        StringBuffer stringBuffer;
        if (!hasMoreTokens() || (stringBuffer = this.f22044e) == null) {
            throw new NoSuchElementException();
        }
        String stringBuffer2 = stringBuffer.toString();
        this.f22044e.setLength(0);
        this.f22045f = false;
        return stringBuffer2;
    }

    public String nextToken(String str) {
        this.f22041b = str;
        this.f22046g = this.f22047h;
        this.f22044e.setLength(0);
        this.f22045f = false;
        return nextToken();
    }
}
