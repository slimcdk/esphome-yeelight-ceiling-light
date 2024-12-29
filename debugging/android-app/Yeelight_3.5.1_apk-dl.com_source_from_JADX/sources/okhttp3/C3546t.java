package okhttp3;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.C3564c;
import org.apache.commons.p194io.IOUtils;
import org.slf4j.Marker;
import p056k5.C3300c;

/* renamed from: okhttp3.t */
public final class C3546t {

    /* renamed from: j */
    private static final char[] f5805j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f5806a;

    /* renamed from: b */
    private final String f5807b;

    /* renamed from: c */
    private final String f5808c;

    /* renamed from: d */
    final String f5809d;

    /* renamed from: e */
    final int f5810e;

    /* renamed from: f */
    private final List<String> f5811f;
    @Nullable

    /* renamed from: g */
    private final List<String> f5812g;
    @Nullable

    /* renamed from: h */
    private final String f5813h;

    /* renamed from: i */
    private final String f5814i;

    /* renamed from: okhttp3.t$a */
    public static final class C3547a {
        @Nullable

        /* renamed from: a */
        String f5815a;

        /* renamed from: b */
        String f5816b = "";

        /* renamed from: c */
        String f5817c = "";
        @Nullable

        /* renamed from: d */
        String f5818d;

        /* renamed from: e */
        int f5819e = -1;

        /* renamed from: f */
        final List<String> f5820f;
        @Nullable

        /* renamed from: g */
        List<String> f5821g;
        @Nullable

        /* renamed from: h */
        String f5822h;

        public C3547a() {
            ArrayList arrayList = new ArrayList();
            this.f5820f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private static String m9849d(String str, int i, int i2) {
            return C3300c.m8918c(C3546t.m9827u(str, i, i2, false));
        }

        /* renamed from: h */
        private boolean m9850h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: i */
        private boolean m9851i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: k */
        private static int m9852k(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C3546t.m9818a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: m */
        private void m9853m() {
            List<String> list = this.f5820f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f5820f.isEmpty()) {
                this.f5820f.add("");
                return;
            }
            List<String> list2 = this.f5820f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: o */
        private static int m9854o(String str, int i, int i2) {
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

        /* renamed from: p */
        private void m9855p(String str, int i, int i2, boolean z, boolean z2) {
            String a = C3546t.m9818a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m9850h(a)) {
                if (m9851i(a)) {
                    m9853m();
                    return;
                }
                List<String> list = this.f5820f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f5820f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f5820f.add(a);
                }
                if (z) {
                    this.f5820f.add("");
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
        /* renamed from: r */
        private void m9856r(java.lang.String r11, int r12, int r13) {
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
                java.util.List<java.lang.String> r0 = r10.f5820f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f5820f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f5820f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p056k5.C3300c.m8929n(r11, r6, r13, r12)
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
                r4.m9855p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3546t.C3547a.m9856r(java.lang.String, int, int):void");
        }

        /* renamed from: t */
        private static int m9857t(String str, int i, int i2) {
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
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: u */
        private static int m9858u(String str, int i, int i2) {
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
        public C3547a mo24580a(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.f5821g == null) {
                this.f5821g = new ArrayList();
            }
            this.f5821g.add(C3546t.m9819b(str, " \"'<>#&=", true, false, true, true));
            this.f5821g.add(str2 != null ? C3546t.m9819b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        /* renamed from: b */
        public C3547a mo24581b(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "name == null");
            if (this.f5821g == null) {
                this.f5821g = new ArrayList();
            }
            this.f5821g.add(C3546t.m9819b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f5821g.add(str2 != null ? C3546t.m9819b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        /* renamed from: c */
        public C3546t mo24582c() {
            if (this.f5815a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f5818d != null) {
                return new C3546t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo24583e() {
            int i = this.f5819e;
            return i != -1 ? i : C3546t.m9822e(this.f5815a);
        }

        /* renamed from: f */
        public C3547a mo24584f(@Nullable String str) {
            this.f5821g = str != null ? C3546t.m9817B(C3546t.m9819b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public C3547a mo24585g(String str) {
            Objects.requireNonNull(str, "host == null");
            String d = m9849d(str, 0, str.length());
            if (d != null) {
                this.f5818d = d;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C3547a mo24586j(@Nullable C3546t tVar, String str) {
            int n;
            int i;
            C3546t tVar2 = tVar;
            String str2 = str;
            int D = C3300c.m8910D(str2, 0, str.length());
            int E = C3300c.m8911E(str2, D, str.length());
            int t = m9857t(str2, D, E);
            if (t != -1) {
                if (str.regionMatches(true, D, "https:", 0, 6)) {
                    this.f5815a = "https";
                    D += 6;
                } else if (str.regionMatches(true, D, "http:", 0, 5)) {
                    this.f5815a = "http";
                    D += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, t) + "'");
                }
            } else if (tVar2 != null) {
                this.f5815a = tVar2.f5806a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int u = m9858u(str2, D, E);
            char c = '?';
            char c2 = '#';
            if (u >= 2 || tVar2 == null || !tVar2.f5806a.equals(this.f5815a)) {
                int i2 = D + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    n = C3300c.m8929n(str2, i2, E, "@/\\?#");
                    char charAt = n != E ? str2.charAt(n) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = n;
                        int o = m9854o(str2, i2, i3);
                        int i4 = o + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int m = C3300c.m8928m(str2, i2, n, ':');
                                int i5 = m;
                                String str3 = "%40";
                                i = n;
                                String a = C3546t.m9818a(str, i2, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a = this.f5816b + str3 + a;
                                }
                                this.f5816b = a;
                                if (i5 != i) {
                                    this.f5817c = C3546t.m9818a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = n;
                                this.f5817c += "%40" + C3546t.m9818a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = n;
                int o2 = m9854o(str2, i2, i32);
                int i42 = o2 + 1;
                if (i42 < i32) {
                    this.f5818d = m9849d(str2, i2, o2);
                    int k = m9852k(str2, i42, i32);
                    this.f5819e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.f5818d = m9849d(str2, i2, o2);
                    this.f5819e = C3546t.m9822e(this.f5815a);
                }
                if (this.f5818d != null) {
                    D = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, o2) + '\"');
                }
            } else {
                this.f5816b = tVar.mo24572k();
                this.f5817c = tVar.mo24567g();
                this.f5818d = tVar2.f5809d;
                this.f5819e = tVar2.f5810e;
                this.f5820f.clear();
                this.f5820f.addAll(tVar.mo24570i());
                if (D == E || str2.charAt(D) == '#') {
                    mo24584f(tVar.mo24571j());
                }
            }
            int n2 = C3300c.m8929n(str2, D, E, "?#");
            m9856r(str2, D, n2);
            if (n2 < E && str2.charAt(n2) == '?') {
                int m2 = C3300c.m8928m(str2, n2, E, '#');
                this.f5821g = C3546t.m9817B(C3546t.m9818a(str, n2 + 1, m2, " \"'<>#", true, false, true, true, (Charset) null));
                n2 = m2;
            }
            if (n2 < E && str2.charAt(n2) == '#') {
                this.f5822h = C3546t.m9818a(str, 1 + n2, E, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /* renamed from: l */
        public C3547a mo24587l(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f5817c = C3546t.m9819b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: n */
        public C3547a mo24588n(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f5819e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C3547a mo24589q() {
            int size = this.f5820f.size();
            for (int i = 0; i < size; i++) {
                this.f5820f.set(i, C3546t.m9819b(this.f5820f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f5821g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f5821g.get(i2);
                    if (str != null) {
                        this.f5821g.set(i2, C3546t.m9819b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f5822h;
            if (str2 != null) {
                this.f5822h = C3546t.m9819b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: s */
        public C3547a mo24590s(String str) {
            Objects.requireNonNull(str, "scheme == null");
            String str2 = "http";
            if (!str.equalsIgnoreCase(str2)) {
                str2 = "https";
                if (!str.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f5815a = str2;
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f5815a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f5816b.isEmpty() || !this.f5817c.isEmpty()) {
                sb.append(this.f5816b);
                if (!this.f5817c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f5817c);
                }
                sb.append('@');
            }
            String str3 = this.f5818d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f5818d);
                    sb.append(']');
                } else {
                    sb.append(this.f5818d);
                }
            }
            if (!(this.f5819e == -1 && this.f5815a == null)) {
                int e = mo24583e();
                String str4 = this.f5815a;
                if (str4 == null || e != C3546t.m9822e(str4)) {
                    sb.append(':');
                    sb.append(e);
                }
            }
            C3546t.m9826t(sb, this.f5820f);
            if (this.f5821g != null) {
                sb.append('?');
                C3546t.m9824o(sb, this.f5821g);
            }
            if (this.f5822h != null) {
                sb.append('#');
                sb.append(this.f5822h);
            }
            return sb.toString();
        }

        /* renamed from: v */
        public C3547a mo24592v(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f5816b = C3546t.m9819b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    C3546t(C3547a aVar) {
        this.f5806a = aVar.f5815a;
        this.f5807b = m9828v(aVar.f5816b, false);
        this.f5808c = m9828v(aVar.f5817c, false);
        this.f5809d = aVar.f5818d;
        this.f5810e = aVar.mo24583e();
        this.f5811f = m9829w(aVar.f5820f, false);
        List<String> list = aVar.f5821g;
        String str = null;
        this.f5812g = list != null ? m9829w(list, true) : null;
        String str2 = aVar.f5822h;
        this.f5813h = str2 != null ? m9828v(str2, false) : str;
        this.f5814i = aVar.toString();
    }

    /* renamed from: B */
    static List<String> m9817B(String str) {
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

    /* renamed from: a */
    static String m9818a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m9831y(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C3564c cVar = new C3564c();
            int i5 = i;
            cVar.mo24792x1(str, i, i4);
            m9821d(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo24722D();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m9819b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m9818a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    static String m9820c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m9818a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: d */
    static void m9821d(C3564c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C3564c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.mo24757i0(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m9831y(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C3564c();
                    }
                    if (charset == null || charset.equals(C3300c.f5335d)) {
                        cVar2.mo24793y1(codePointAt);
                    } else {
                        cVar2.mo24787u1(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo24734Q()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24736R(37);
                        char[] cArr = f5805j;
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

    /* renamed from: e */
    public static int m9822e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static C3546t m9823l(String str) {
        return new C3547a().mo24586j((C3546t) null, str).mo24582c();
    }

    /* renamed from: o */
    static void m9824o(StringBuilder sb, List<String> list) {
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

    @Nullable
    /* renamed from: r */
    public static C3546t m9825r(String str) {
        try {
            return m9823l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: t */
    static void m9826t(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* renamed from: u */
    static String m9827u(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C3564c cVar = new C3564c();
                cVar.mo24792x1(str, i, i3);
                m9830x(cVar, str, i3, i2, z);
                return cVar.mo24722D();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: v */
    static String m9828v(String str, boolean z) {
        return m9827u(str, 0, str.length(), z);
    }

    /* renamed from: w */
    private List<String> m9829w(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m9828v(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: x */
    static void m9830x(C3564c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int j = C3300c.m8925j(str.charAt(i + 1));
                int j2 = C3300c.m8925j(str.charAt(i3));
                if (!(j == -1 || j2 == -1)) {
                    cVar.mo24736R((j << 4) + j2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.mo24736R(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo24793y1(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: y */
    static boolean m9831y(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C3300c.m8925j(str.charAt(i + 1)) != -1 && C3300c.m8925j(str.charAt(i3)) != -1;
    }

    @Nullable
    /* renamed from: A */
    public String mo24560A() {
        if (this.f5812g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m9824o(sb, this.f5812g);
        return sb.toString();
    }

    /* renamed from: C */
    public String mo24561C() {
        return mo24576q("/...").mo24592v("").mo24587l("").mo24582c().toString();
    }

    @Nullable
    /* renamed from: D */
    public C3546t mo24562D(String str) {
        C3547a q = mo24576q(str);
        if (q != null) {
            return q.mo24582c();
        }
        return null;
    }

    /* renamed from: E */
    public String mo24563E() {
        return this.f5806a;
    }

    /* renamed from: F */
    public URI mo24564F() {
        String aVar = mo24575p().mo24589q().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C3546t) && ((C3546t) obj).f5814i.equals(this.f5814i);
    }

    @Nullable
    /* renamed from: f */
    public String mo24566f() {
        if (this.f5813h == null) {
            return null;
        }
        return this.f5814i.substring(this.f5814i.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String mo24567g() {
        if (this.f5808c.isEmpty()) {
            return "";
        }
        int indexOf = this.f5814i.indexOf(64);
        return this.f5814i.substring(this.f5814i.indexOf(58, this.f5806a.length() + 3) + 1, indexOf);
    }

    /* renamed from: h */
    public String mo24568h() {
        int indexOf = this.f5814i.indexOf(47, this.f5806a.length() + 3);
        String str = this.f5814i;
        return this.f5814i.substring(indexOf, C3300c.m8929n(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f5814i.hashCode();
    }

    /* renamed from: i */
    public List<String> mo24570i() {
        int indexOf = this.f5814i.indexOf(47, this.f5806a.length() + 3);
        String str = this.f5814i;
        int n = C3300c.m8929n(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < n) {
            int i = indexOf + 1;
            int m = C3300c.m8928m(this.f5814i, i, n, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f5814i.substring(i, m));
            indexOf = m;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: j */
    public String mo24571j() {
        if (this.f5812g == null) {
            return null;
        }
        int indexOf = this.f5814i.indexOf(63) + 1;
        String str = this.f5814i;
        return this.f5814i.substring(indexOf, C3300c.m8928m(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String mo24572k() {
        if (this.f5807b.isEmpty()) {
            return "";
        }
        int length = this.f5806a.length() + 3;
        String str = this.f5814i;
        return this.f5814i.substring(length, C3300c.m8929n(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String mo24573m() {
        return this.f5809d;
    }

    /* renamed from: n */
    public boolean mo24574n() {
        return this.f5806a.equals("https");
    }

    /* renamed from: p */
    public C3547a mo24575p() {
        C3547a aVar = new C3547a();
        aVar.f5815a = this.f5806a;
        aVar.f5816b = mo24572k();
        aVar.f5817c = mo24567g();
        aVar.f5818d = this.f5809d;
        aVar.f5819e = this.f5810e != m9822e(this.f5806a) ? this.f5810e : -1;
        aVar.f5820f.clear();
        aVar.f5820f.addAll(mo24570i());
        aVar.mo24584f(mo24571j());
        aVar.f5822h = mo24566f();
        return aVar;
    }

    @Nullable
    /* renamed from: q */
    public C3547a mo24576q(String str) {
        try {
            return new C3547a().mo24586j(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public List<String> mo24577s() {
        return this.f5811f;
    }

    public String toString() {
        return this.f5814i;
    }

    /* renamed from: z */
    public int mo24579z() {
        return this.f5810e;
    }
}
