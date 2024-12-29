package p011c.p083d.p084a;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.p271io.IOUtils;
import p163g.C4406c;

/* renamed from: c.d.a.r */
public final class C1133r {

    /* renamed from: i */
    private static final char[] f1803i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f1804a;

    /* renamed from: b */
    private final String f1805b;

    /* renamed from: c */
    private final String f1806c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f1807d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f1808e;

    /* renamed from: f */
    private final List<String> f1809f;

    /* renamed from: g */
    private final String f1810g;

    /* renamed from: h */
    private final String f1811h;

    /* renamed from: c.d.a.r$b */
    public static final class C1135b {

        /* renamed from: a */
        String f1812a;

        /* renamed from: b */
        String f1813b = "";

        /* renamed from: c */
        String f1814c = "";

        /* renamed from: d */
        String f1815d;

        /* renamed from: e */
        int f1816e = -1;

        /* renamed from: f */
        final List<String> f1817f;

        /* renamed from: g */
        List<String> f1818g;

        /* renamed from: h */
        String f1819h;

        public C1135b() {
            ArrayList arrayList = new ArrayList();
            this.f1817f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private static String m2755d(String str, int i, int i2) {
            String x = C1133r.m2737x(str, i, i2);
            if (!x.startsWith("[") || !x.endsWith("]")) {
                String g = m2758g(x);
                if (g == null) {
                    return null;
                }
                int length = g.length();
                if (C1133r.m2732j(g, 0, length, "\u0000\t\n\r #%/:?@[\\]") != length) {
                    return null;
                }
                return g;
            }
            InetAddress f = m2757f(x, 1, x.length() - 1);
            if (f == null) {
                return null;
            }
            byte[] address = f.getAddress();
            if (address.length == 16) {
                return m2759k(address);
            }
            throw new AssertionError();
        }

        /* renamed from: e */
        private static boolean m2756e(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        /* renamed from: f */
        private static InetAddress m2757f(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i3 == 16) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i3 != 0) {
                            if (str.regionMatches(i, Constants.COLON_SEPARATOR, 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !m2756e(str, i5, i2, bArr, i3 - 2)) {
                                return null;
                            } else {
                                i3 += 2;
                            }
                        }
                        i5 = i;
                    } else if (i4 != -1) {
                        return null;
                    } else {
                        i3 += 2;
                        i4 = i3;
                        if (i6 == i2) {
                            break;
                        }
                        i5 = i6;
                    }
                    i = i5;
                    int i7 = 0;
                    while (i < i2) {
                        int h = C1133r.m2730h(str.charAt(i));
                        if (h == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + h;
                        i++;
                    }
                    int i8 = i - i5;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i7 >>> 8) & 255);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) (i7 & 255);
                }
            }
            if (i3 != 16) {
                if (i4 == -1) {
                    return null;
                }
                int i10 = i3 - i4;
                System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
                Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        private static String m2758g(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: k */
        private static String m2759k(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C4406c cVar = new C4406c();
            while (i < bArr.length) {
                if (i == i2) {
                    cVar.mo24247n1(58);
                    i += i4;
                    if (i == 16) {
                        cVar.mo24247n1(58);
                    }
                } else {
                    if (i > 0) {
                        cVar.mo24247n1(58);
                    }
                    cVar.mo24251p1((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return cVar.mo24228d0();
        }

        /* renamed from: l */
        private boolean m2760l(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: m */
        private boolean m2761m(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: o */
        private static int m2762o(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C1133r.m2727e(str, i, i2, "", false, false));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: p */
        private void m2763p() {
            List<String> list = this.f1817f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f1817f.isEmpty()) {
                this.f1817f.add("");
                return;
            }
            List<String> list2 = this.f1817f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: r */
        private static int m2764r(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: s */
        private void m2765s(String str, int i, int i2, boolean z, boolean z2) {
            String e = C1133r.m2727e(str, i, i2, " \"<>^`{}|/\\?#", z2, false);
            if (!m2760l(e)) {
                if (m2761m(e)) {
                    m2763p();
                    return;
                }
                List<String> list = this.f1817f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f1817f;
                    list2.set(list2.size() - 1, e);
                } else {
                    this.f1817f.add(e);
                }
                if (z) {
                    this.f1817f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: t */
        private void m2766t(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f1817f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f1817f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f1817f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p011c.p083d.p084a.C1133r.m2732j(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m2765s(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1133r.C1135b.m2766t(java.lang.String, int, int):void");
        }

        /* renamed from: v */
        private static int m2767v(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.')) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: w */
        private int m2768w(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: x */
        private int m2769x(String str, int i, int i2) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                char charAt = str.charAt(i3);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i3 + 1;
                }
            }
            return i;
        }

        /* renamed from: y */
        private static int m2770y(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C1135b mo9776a(String str, String str2) {
            if (str != null) {
                if (this.f1818g == null) {
                    this.f1818g = new ArrayList();
                }
                this.f1818g.add(C1133r.m2728f(str, " \"'<>#&=", true, true));
                this.f1818g.add(str2 != null ? C1133r.m2728f(str2, " \"'<>#&=", true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        /* renamed from: b */
        public C1135b mo9777b(String str, String str2) {
            if (str != null) {
                if (this.f1818g == null) {
                    this.f1818g = new ArrayList();
                }
                this.f1818g.add(C1133r.m2728f(str, " \"'<>#&=", false, true));
                this.f1818g.add(str2 != null ? C1133r.m2728f(str2, " \"'<>#&=", false, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        /* renamed from: c */
        public C1133r mo9778c() {
            if (this.f1812a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f1815d != null) {
                return new C1133r(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo9779h() {
            int i = this.f1816e;
            return i != -1 ? i : C1133r.m2731i(this.f1812a);
        }

        /* renamed from: i */
        public C1135b mo9780i(String str) {
            this.f1818g = str != null ? C1133r.m2722C(C1133r.m2728f(str, " \"'<>#", true, true)) : null;
            return this;
        }

        /* renamed from: j */
        public C1135b mo9781j(String str) {
            if (str != null) {
                String d = m2755d(str, 0, str.length());
                if (d != null) {
                    this.f1815d = d;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1133r mo9782n(C1133r rVar, String str) {
            int b;
            int i;
            String str2 = str;
            boolean z = false;
            int w = m2768w(str2, 0, str.length());
            int x = m2769x(str2, w, str.length());
            if (m2767v(str2, w, x) != -1) {
                if (str.regionMatches(true, w, "https:", 0, 6)) {
                    this.f1812a = "https";
                    w += 6;
                } else if (!str.regionMatches(true, w, "http:", 0, 5)) {
                    return null;
                } else {
                    this.f1812a = "http";
                    w += 5;
                }
            } else if (rVar == null) {
                return null;
            } else {
                this.f1812a = rVar.f1804a;
            }
            int y = m2770y(str2, w, x);
            char c = '?';
            char c2 = '#';
            if (y >= 2 || rVar == null || !rVar.f1804a.equals(this.f1812a)) {
                int i2 = w + y;
                boolean z2 = false;
                while (true) {
                    b = C1133r.m2732j(str2, i2, x, "@/\\?#");
                    char charAt = b != x ? str2.charAt(b) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = b;
                        int r = m2764r(str2, i2, i3);
                        int i4 = r + 1;
                        this.f1815d = m2755d(str2, i2, r);
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int b2 = C1133r.m2732j(str2, i2, b, Constants.COLON_SEPARATOR);
                                int i5 = b2;
                                String str3 = "%40";
                                i = b;
                                String e = C1133r.m2727e(str, i2, b2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                if (z2) {
                                    e = this.f1813b + str3 + e;
                                }
                                this.f1813b = e;
                                if (i5 != i) {
                                    this.f1814c = C1133r.m2727e(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = b;
                                this.f1814c += "%40" + C1133r.m2727e(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = b;
                int r2 = m2764r(str2, i2, i32);
                int i42 = r2 + 1;
                this.f1815d = m2755d(str2, i2, r2);
                if (i42 < i32) {
                    int o = m2762o(str2, i42, i32);
                    this.f1816e = o;
                    if (o == -1) {
                        return null;
                    }
                } else {
                    this.f1816e = C1133r.m2731i(this.f1812a);
                }
                if (this.f1815d == null) {
                    return null;
                }
                w = i32;
            } else {
                this.f1813b = rVar.mo9771p();
                this.f1814c = rVar.mo9767l();
                this.f1815d = rVar.f1807d;
                this.f1816e = rVar.f1808e;
                this.f1817f.clear();
                this.f1817f.addAll(rVar.mo9769n());
                if (w == x || str2.charAt(w) == '#') {
                    mo9780i(rVar.mo9770o());
                }
            }
            int b3 = C1133r.m2732j(str2, w, x, "?#");
            m2766t(str2, w, b3);
            if (b3 < x && str2.charAt(b3) == '?') {
                int b4 = C1133r.m2732j(str2, b3, x, "#");
                this.f1818g = C1133r.m2722C(C1133r.m2727e(str, b3 + 1, b4, " \"'<>#", true, true));
                b3 = b4;
            }
            if (b3 < x && str2.charAt(b3) == '#') {
                this.f1819h = C1133r.m2727e(str, 1 + b3, x, "", true, false);
            }
            return mo9778c();
        }

        /* renamed from: q */
        public C1135b mo9783q(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f1816e = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1812a);
            sb.append("://");
            if (!this.f1813b.isEmpty() || !this.f1814c.isEmpty()) {
                sb.append(this.f1813b);
                if (!this.f1814c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f1814c);
                }
                sb.append('@');
            }
            if (this.f1815d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f1815d);
                sb.append(']');
            } else {
                sb.append(this.f1815d);
            }
            int h = mo9779h();
            if (h != C1133r.m2731i(this.f1812a)) {
                sb.append(':');
                sb.append(h);
            }
            C1133r.m2735v(sb, this.f1817f);
            if (this.f1818g != null) {
                sb.append('?');
                C1133r.m2733s(sb, this.f1818g);
            }
            if (this.f1819h != null) {
                sb.append('#');
                sb.append(this.f1819h);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public C1135b mo9785u(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f1812a = str2;
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }
    }

    private C1133r(C1135b bVar) {
        this.f1804a = bVar.f1812a;
        this.f1805b = m2736w(bVar.f1813b);
        this.f1806c = m2736w(bVar.f1814c);
        this.f1807d = bVar.f1815d;
        this.f1808e = bVar.mo9779h();
        m2738y(bVar.f1817f);
        List<String> list = bVar.f1818g;
        String str = null;
        this.f1809f = list != null ? m2738y(list) : null;
        String str2 = bVar.f1819h;
        this.f1810g = str2 != null ? m2736w(str2) : str;
        this.f1811h = bVar.toString();
    }

    /* renamed from: C */
    static List<String> m2722C(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: e */
    static String m2727e(String str, int i, int i2, String str2, boolean z, boolean z2) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (z2 && codePointAt == 43))) {
                C4406c cVar = new C4406c();
                cVar.mo24271v1(str, i, i3);
                m2729g(cVar, str, i3, i2, str2, z, z2);
                return cVar.mo24228d0();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    /* renamed from: f */
    static String m2728f(String str, String str2, boolean z, boolean z2) {
        return m2727e(str, 0, str.length(), str2, z, z2);
    }

    /* renamed from: g */
    static void m2729g(C4406c cVar, String str, int i, int i2, String str2, boolean z, boolean z2) {
        C4406c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (z2 && codePointAt == 43) {
                    cVar.mo24269u1(z ? "%20" : "%2B");
                } else if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                    if (cVar2 == null) {
                        cVar2 = new C4406c();
                    }
                    cVar2.mo24272w1(codePointAt);
                    while (!cVar2.mo24274x()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24247n1(37);
                        cVar.mo24247n1(f1803i[(readByte >> 4) & 15]);
                        cVar.mo24247n1(f1803i[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24272w1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: h */
    static int m2730h(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: i */
    public static int m2731i(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m2732j(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: s */
    static void m2733s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: u */
    public static C1133r m2734u(String str) {
        return new C1135b().mo9782n((C1133r) null, str);
    }

    /* renamed from: v */
    static void m2735v(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* renamed from: w */
    static String m2736w(String str) {
        return m2737x(str, 0, str.length());
    }

    /* renamed from: x */
    static String m2737x(String str, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (str.charAt(i3) == '%') {
                C4406c cVar = new C4406c();
                cVar.mo24271v1(str, i, i3);
                m2739z(cVar, str, i3, i2);
                return cVar.mo24228d0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: y */
    private List<String> m2738y(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m2736w(next) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: z */
    static void m2739z(C4406c cVar, String str, int i, int i2) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int h = m2730h(str.charAt(i + 1));
                int h2 = m2730h(str.charAt(i3));
                if (!(h == -1 || h2 == -1)) {
                    cVar.mo24247n1((h << 4) + h2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            }
            cVar.mo24272w1(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: A */
    public int mo9758A() {
        return this.f1808e;
    }

    /* renamed from: B */
    public String mo9759B() {
        if (this.f1809f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m2733s(sb, this.f1809f);
        return sb.toString();
    }

    /* renamed from: D */
    public C1133r mo9760D(String str) {
        return new C1135b().mo9782n(this, str);
    }

    /* renamed from: E */
    public String mo9761E() {
        return this.f1804a;
    }

    /* renamed from: F */
    public URI mo9762F() {
        try {
            return new URI(this.f1811h);
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f1811h);
        }
    }

    /* renamed from: G */
    public URL mo9763G() {
        try {
            return new URL(this.f1811h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1133r) && ((C1133r) obj).f1811h.equals(this.f1811h);
    }

    public int hashCode() {
        return this.f1811h.hashCode();
    }

    /* renamed from: k */
    public String mo9766k() {
        if (this.f1810g == null) {
            return null;
        }
        return this.f1811h.substring(this.f1811h.indexOf(35) + 1);
    }

    /* renamed from: l */
    public String mo9767l() {
        if (this.f1806c.isEmpty()) {
            return "";
        }
        int indexOf = this.f1811h.indexOf(64);
        return this.f1811h.substring(this.f1811h.indexOf(58, this.f1804a.length() + 3) + 1, indexOf);
    }

    /* renamed from: m */
    public String mo9768m() {
        int indexOf = this.f1811h.indexOf(47, this.f1804a.length() + 3);
        String str = this.f1811h;
        return this.f1811h.substring(indexOf, m2732j(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: n */
    public List<String> mo9769n() {
        int indexOf = this.f1811h.indexOf(47, this.f1804a.length() + 3);
        String str = this.f1811h;
        int j = m2732j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j) {
            int i = indexOf + 1;
            int j2 = m2732j(this.f1811h, i, j, MiotCloudImpl.COOKIE_PATH);
            arrayList.add(this.f1811h.substring(i, j2));
            indexOf = j2;
        }
        return arrayList;
    }

    /* renamed from: o */
    public String mo9770o() {
        if (this.f1809f == null) {
            return null;
        }
        int indexOf = this.f1811h.indexOf(63) + 1;
        String str = this.f1811h;
        return this.f1811h.substring(indexOf, m2732j(str, indexOf + 1, str.length(), "#"));
    }

    /* renamed from: p */
    public String mo9771p() {
        if (this.f1805b.isEmpty()) {
            return "";
        }
        int length = this.f1804a.length() + 3;
        String str = this.f1811h;
        return this.f1811h.substring(length, m2732j(str, length, str.length(), ":@"));
    }

    /* renamed from: q */
    public String mo9772q() {
        return this.f1807d;
    }

    /* renamed from: r */
    public boolean mo9773r() {
        return this.f1804a.equals("https");
    }

    /* renamed from: t */
    public C1135b mo9774t() {
        C1135b bVar = new C1135b();
        bVar.f1812a = this.f1804a;
        bVar.f1813b = mo9771p();
        bVar.f1814c = mo9767l();
        bVar.f1815d = this.f1807d;
        bVar.f1816e = this.f1808e == m2731i(this.f1804a) ? -1 : this.f1808e;
        bVar.f1817f.clear();
        bVar.f1817f.addAll(mo9769n());
        bVar.mo9780i(mo9770o());
        bVar.f1819h = mo9766k();
        return bVar;
    }

    public String toString() {
        return this.f1811h;
    }
}
