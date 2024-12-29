package com.squareup.okhttp;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
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
import okio.C3564c;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.squareup.okhttp.q */
public final class C4302q {

    /* renamed from: j */
    private static final char[] f6998j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6999a;

    /* renamed from: b */
    private final String f7000b;

    /* renamed from: c */
    private final String f7001c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f7002d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f7003e;

    /* renamed from: f */
    private final List<String> f7004f;

    /* renamed from: g */
    private final List<String> f7005g;

    /* renamed from: h */
    private final String f7006h;

    /* renamed from: i */
    private final String f7007i;

    /* renamed from: com.squareup.okhttp.q$b */
    public static final class C4304b {

        /* renamed from: a */
        String f7008a;

        /* renamed from: b */
        String f7009b = "";

        /* renamed from: c */
        String f7010c = "";

        /* renamed from: d */
        String f7011d;

        /* renamed from: e */
        int f7012e = -1;

        /* renamed from: f */
        final List<String> f7013f;

        /* renamed from: g */
        List<String> f7014g;

        /* renamed from: h */
        String f7015h;

        public C4304b() {
            ArrayList arrayList = new ArrayList();
            this.f7013f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private static String m12035d(String str, int i, int i2) {
            String x = C4302q.m12017x(str, i, i2);
            if (!x.startsWith("[") || !x.endsWith("]")) {
                String g = m12038g(x);
                if (g == null) {
                    return null;
                }
                int length = g.length();
                if (C4302q.m12012j(g, 0, length, "\u0000\t\n\r #%/:?@[\\]") != length) {
                    return null;
                }
                return g;
            }
            InetAddress f = m12037f(x, 1, x.length() - 1);
            if (f == null) {
                return null;
            }
            byte[] address = f.getAddress();
            if (address.length == 16) {
                return m12039k(address);
            }
            throw new AssertionError();
        }

        /* renamed from: e */
        private static boolean m12036e(String str, int i, int i2, byte[] bArr, int i3) {
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
        private static InetAddress m12037f(String str, int i, int i2) {
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
                            } else if (!str.regionMatches(i, ".", 0, 1) || !m12036e(str, i5, i2, bArr, i3 - 2)) {
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
                        int h = C4302q.m12010h(str.charAt(i));
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
        private static String m12038g(String str) {
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
        private static String m12039k(byte[] bArr) {
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
            C3564c cVar = new C3564c();
            while (i < bArr.length) {
                if (i == i2) {
                    cVar.mo24736R(58);
                    i += i4;
                    if (i == 16) {
                        cVar.mo24736R(58);
                    }
                } else {
                    if (i > 0) {
                        cVar.mo24736R(58);
                    }
                    cVar.mo24784t0((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return cVar.mo24722D();
        }

        /* renamed from: l */
        private boolean m12040l(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: m */
        private boolean m12041m(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: o */
        private static int m12042o(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C4302q.m12007e(str, i, i2, "", false, false));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: p */
        private void m12043p() {
            List<String> list = this.f7013f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f7013f.isEmpty()) {
                this.f7013f.add("");
                return;
            }
            List<String> list2 = this.f7013f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: r */
        private static int m12044r(String str, int i, int i2) {
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
        private void m12045s(String str, int i, int i2, boolean z, boolean z2) {
            String e = C4302q.m12007e(str, i, i2, " \"<>^`{}|/\\?#", z2, false);
            if (!m12040l(e)) {
                if (m12041m(e)) {
                    m12043p();
                    return;
                }
                List<String> list = this.f7013f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f7013f;
                    list2.set(list2.size() - 1, e);
                } else {
                    this.f7013f.add(e);
                }
                if (z) {
                    this.f7013f.add("");
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
        private void m12046t(java.lang.String r11, int r12, int r13) {
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
                java.util.List<java.lang.String> r0 = r10.f7013f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f7013f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f7013f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.squareup.okhttp.C4302q.m12012j(r11, r6, r13, r12)
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
                r4.m12045s(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4302q.C4304b.m12046t(java.lang.String, int, int):void");
        }

        /* renamed from: v */
        private static int m12047v(String str, int i, int i2) {
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
        private int m12048w(String str, int i, int i2) {
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
        private int m12049x(String str, int i, int i2) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                char charAt = str.charAt(i3);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i3 + 1;
                }
            }
            return i;
        }

        /* renamed from: y */
        private static int m12050y(String str, int i, int i2) {
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
        public C4304b mo27963a(String str, String str2) {
            if (str != null) {
                if (this.f7014g == null) {
                    this.f7014g = new ArrayList();
                }
                this.f7014g.add(C4302q.m12008f(str, " \"'<>#&=", true, true));
                this.f7014g.add(str2 != null ? C4302q.m12008f(str2, " \"'<>#&=", true, true) : null);
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        /* renamed from: b */
        public C4304b mo27964b(String str, String str2) {
            if (str != null) {
                if (this.f7014g == null) {
                    this.f7014g = new ArrayList();
                }
                this.f7014g.add(C4302q.m12008f(str, " \"'<>#&=", false, true));
                this.f7014g.add(str2 != null ? C4302q.m12008f(str2, " \"'<>#&=", false, true) : null);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        /* renamed from: c */
        public C4302q mo27965c() {
            if (this.f7008a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f7011d != null) {
                return new C4302q(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo27966h() {
            int i = this.f7012e;
            return i != -1 ? i : C4302q.m12011i(this.f7008a);
        }

        /* renamed from: i */
        public C4304b mo27967i(String str) {
            this.f7014g = str != null ? C4302q.m12002C(C4302q.m12008f(str, " \"'<>#", true, true)) : null;
            return this;
        }

        /* renamed from: j */
        public C4304b mo27968j(String str) {
            if (str != null) {
                String d = m12035d(str, 0, str.length());
                if (d != null) {
                    this.f7011d = d;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C4302q mo27969n(C4302q qVar, String str) {
            int b;
            int i;
            String str2 = str;
            boolean z = false;
            int w = m12048w(str2, 0, str.length());
            int x = m12049x(str2, w, str.length());
            if (m12047v(str2, w, x) != -1) {
                if (str.regionMatches(true, w, "https:", 0, 6)) {
                    this.f7008a = "https";
                    w += 6;
                } else if (!str.regionMatches(true, w, "http:", 0, 5)) {
                    return null;
                } else {
                    this.f7008a = "http";
                    w += 5;
                }
            } else if (qVar == null) {
                return null;
            } else {
                this.f7008a = qVar.f6999a;
            }
            int y = m12050y(str2, w, x);
            char c = '?';
            char c2 = '#';
            if (y >= 2 || qVar == null || !qVar.f6999a.equals(this.f7008a)) {
                int i2 = w + y;
                boolean z2 = false;
                while (true) {
                    b = C4302q.m12012j(str2, i2, x, "@/\\?#");
                    char charAt = b != x ? str2.charAt(b) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = b;
                        int r = m12044r(str2, i2, i3);
                        int i4 = r + 1;
                        this.f7011d = m12035d(str2, i2, r);
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int b2 = C4302q.m12012j(str2, i2, b, Constants.COLON_SEPARATOR);
                                int i5 = b2;
                                String str3 = "%40";
                                i = b;
                                String e = C4302q.m12007e(str, i2, b2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                if (z2) {
                                    e = this.f7009b + str3 + e;
                                }
                                this.f7009b = e;
                                if (i5 != i) {
                                    this.f7010c = C4302q.m12007e(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = b;
                                this.f7010c += "%40" + C4302q.m12007e(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = b;
                int r2 = m12044r(str2, i2, i32);
                int i42 = r2 + 1;
                this.f7011d = m12035d(str2, i2, r2);
                if (i42 < i32) {
                    int o = m12042o(str2, i42, i32);
                    this.f7012e = o;
                    if (o == -1) {
                        return null;
                    }
                } else {
                    this.f7012e = C4302q.m12011i(this.f7008a);
                }
                if (this.f7011d == null) {
                    return null;
                }
                w = i32;
            } else {
                this.f7009b = qVar.mo27958p();
                this.f7010c = qVar.mo27954l();
                this.f7011d = qVar.f7002d;
                this.f7012e = qVar.f7003e;
                this.f7013f.clear();
                this.f7013f.addAll(qVar.mo27956n());
                if (w == x || str2.charAt(w) == '#') {
                    mo27967i(qVar.mo27957o());
                }
            }
            int b3 = C4302q.m12012j(str2, w, x, "?#");
            m12046t(str2, w, b3);
            if (b3 < x && str2.charAt(b3) == '?') {
                int b4 = C4302q.m12012j(str2, b3, x, "#");
                this.f7014g = C4302q.m12002C(C4302q.m12007e(str, b3 + 1, b4, " \"'<>#", true, true));
                b3 = b4;
            }
            if (b3 < x && str2.charAt(b3) == '#') {
                this.f7015h = C4302q.m12007e(str, 1 + b3, x, "", true, false);
            }
            return mo27965c();
        }

        /* renamed from: q */
        public C4304b mo27970q(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f7012e = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7008a);
            sb.append("://");
            if (!this.f7009b.isEmpty() || !this.f7010c.isEmpty()) {
                sb.append(this.f7009b);
                if (!this.f7010c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f7010c);
                }
                sb.append('@');
            }
            if (this.f7011d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f7011d);
                sb.append(']');
            } else {
                sb.append(this.f7011d);
            }
            int h = mo27966h();
            if (h != C4302q.m12011i(this.f7008a)) {
                sb.append(':');
                sb.append(h);
            }
            C4302q.m12015v(sb, this.f7013f);
            if (this.f7014g != null) {
                sb.append('?');
                C4302q.m12013s(sb, this.f7014g);
            }
            if (this.f7015h != null) {
                sb.append('#');
                sb.append(this.f7015h);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public C4304b mo27972u(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f7008a = str2;
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }
    }

    private C4302q(C4304b bVar) {
        this.f6999a = bVar.f7008a;
        this.f7000b = m12016w(bVar.f7009b);
        this.f7001c = m12016w(bVar.f7010c);
        this.f7002d = bVar.f7011d;
        this.f7003e = bVar.mo27966h();
        this.f7004f = m12018y(bVar.f7013f);
        List<String> list = bVar.f7014g;
        String str = null;
        this.f7005g = list != null ? m12018y(list) : null;
        String str2 = bVar.f7015h;
        this.f7006h = str2 != null ? m12016w(str2) : str;
        this.f7007i = bVar.toString();
    }

    /* renamed from: C */
    static List<String> m12002C(String str) {
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
    static String m12007e(String str, int i, int i2, String str2, boolean z, boolean z2) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (z2 && codePointAt == 43))) {
                C3564c cVar = new C3564c();
                cVar.mo24792x1(str, i, i3);
                m12009g(cVar, str, i3, i2, str2, z, z2);
                return cVar.mo24722D();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    /* renamed from: f */
    static String m12008f(String str, String str2, boolean z, boolean z2) {
        return m12007e(str, 0, str.length(), str2, z, z2);
    }

    /* renamed from: g */
    static void m12009g(C3564c cVar, String str, int i, int i2, String str2, boolean z, boolean z2) {
        C3564c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (z2 && codePointAt == 43) {
                    cVar.mo24757i0(z ? "%20" : "%2B");
                } else if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                    if (cVar2 == null) {
                        cVar2 = new C3564c();
                    }
                    cVar2.mo24793y1(codePointAt);
                    while (!cVar2.mo24734Q()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24736R(37);
                        char[] cArr = f6998j;
                        cVar.mo24736R(cArr[(readByte >> 4) & 15]);
                        cVar.mo24736R(cArr[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24793y1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: h */
    static int m12010h(char c) {
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
    public static int m12011i(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static int m12012j(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: s */
    static void m12013s(StringBuilder sb, List<String> list) {
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
    public static C4302q m12014u(String str) {
        return new C4304b().mo27969n((C4302q) null, str);
    }

    /* renamed from: v */
    static void m12015v(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* renamed from: w */
    static String m12016w(String str) {
        return m12017x(str, 0, str.length());
    }

    /* renamed from: x */
    static String m12017x(String str, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (str.charAt(i3) == '%') {
                C3564c cVar = new C3564c();
                cVar.mo24792x1(str, i, i3);
                m12019z(cVar, str, i3, i2);
                return cVar.mo24722D();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: y */
    private List<String> m12018y(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m12016w(next) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: z */
    static void m12019z(C3564c cVar, String str, int i, int i2) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int h = m12010h(str.charAt(i + 1));
                int h2 = m12010h(str.charAt(i3));
                if (!(h == -1 || h2 == -1)) {
                    cVar.mo24736R((h << 4) + h2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            }
            cVar.mo24793y1(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: A */
    public int mo27945A() {
        return this.f7003e;
    }

    /* renamed from: B */
    public String mo27946B() {
        if (this.f7005g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m12013s(sb, this.f7005g);
        return sb.toString();
    }

    /* renamed from: D */
    public C4302q mo27947D(String str) {
        return new C4304b().mo27969n(this, str);
    }

    /* renamed from: E */
    public String mo27948E() {
        return this.f6999a;
    }

    /* renamed from: F */
    public URI mo27949F() {
        try {
            return new URI(this.f7007i);
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f7007i);
        }
    }

    /* renamed from: G */
    public URL mo27950G() {
        try {
            return new URL(this.f7007i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4302q) && ((C4302q) obj).f7007i.equals(this.f7007i);
    }

    public int hashCode() {
        return this.f7007i.hashCode();
    }

    /* renamed from: k */
    public String mo27953k() {
        if (this.f7006h == null) {
            return null;
        }
        return this.f7007i.substring(this.f7007i.indexOf(35) + 1);
    }

    /* renamed from: l */
    public String mo27954l() {
        if (this.f7001c.isEmpty()) {
            return "";
        }
        int indexOf = this.f7007i.indexOf(64);
        return this.f7007i.substring(this.f7007i.indexOf(58, this.f6999a.length() + 3) + 1, indexOf);
    }

    /* renamed from: m */
    public String mo27955m() {
        int indexOf = this.f7007i.indexOf(47, this.f6999a.length() + 3);
        String str = this.f7007i;
        return this.f7007i.substring(indexOf, m12012j(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: n */
    public List<String> mo27956n() {
        int indexOf = this.f7007i.indexOf(47, this.f6999a.length() + 3);
        String str = this.f7007i;
        int j = m12012j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j) {
            int i = indexOf + 1;
            int j2 = m12012j(this.f7007i, i, j, MiotCloudImpl.COOKIE_PATH);
            arrayList.add(this.f7007i.substring(i, j2));
            indexOf = j2;
        }
        return arrayList;
    }

    /* renamed from: o */
    public String mo27957o() {
        if (this.f7005g == null) {
            return null;
        }
        int indexOf = this.f7007i.indexOf(63) + 1;
        String str = this.f7007i;
        return this.f7007i.substring(indexOf, m12012j(str, indexOf + 1, str.length(), "#"));
    }

    /* renamed from: p */
    public String mo27958p() {
        if (this.f7000b.isEmpty()) {
            return "";
        }
        int length = this.f6999a.length() + 3;
        String str = this.f7007i;
        return this.f7007i.substring(length, m12012j(str, length, str.length(), ":@"));
    }

    /* renamed from: q */
    public String mo27959q() {
        return this.f7002d;
    }

    /* renamed from: r */
    public boolean mo27960r() {
        return this.f6999a.equals("https");
    }

    /* renamed from: t */
    public C4304b mo27961t() {
        C4304b bVar = new C4304b();
        bVar.f7008a = this.f6999a;
        bVar.f7009b = mo27958p();
        bVar.f7010c = mo27954l();
        bVar.f7011d = this.f7002d;
        bVar.f7012e = this.f7003e == m12011i(this.f6999a) ? -1 : this.f7003e;
        bVar.f7013f.clear();
        bVar.f7013f.addAll(mo27956n());
        bVar.mo27967i(mo27957o());
        bVar.f7015h = mo27953k();
        return bVar;
    }

    public String toString() {
        return this.f7007i;
    }
}
