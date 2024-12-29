package p156f;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.p271io.IOUtils;
import p156f.p157g0.C4345c;
import p163g.C4406c;

/* renamed from: f.t */
public final class C4390t {

    /* renamed from: j */
    private static final char[] f7832j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f7833a;

    /* renamed from: b */
    private final String f7834b;

    /* renamed from: c */
    private final String f7835c;

    /* renamed from: d */
    final String f7836d;

    /* renamed from: e */
    final int f7837e;

    /* renamed from: f */
    private final List<String> f7838f;
    @Nullable

    /* renamed from: g */
    private final List<String> f7839g;
    @Nullable

    /* renamed from: h */
    private final String f7840h;

    /* renamed from: i */
    private final String f7841i;

    /* renamed from: f.t$a */
    public static final class C4391a {
        @Nullable

        /* renamed from: a */
        String f7842a;

        /* renamed from: b */
        String f7843b = "";

        /* renamed from: c */
        String f7844c = "";
        @Nullable

        /* renamed from: d */
        String f7845d;

        /* renamed from: e */
        int f7846e = -1;

        /* renamed from: f */
        final List<String> f7847f;
        @Nullable

        /* renamed from: g */
        List<String> f7848g;
        @Nullable

        /* renamed from: h */
        String f7849h;

        public C4391a() {
            ArrayList arrayList = new ArrayList();
            this.f7847f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private static String m12648d(String str, int i, int i2) {
            return C4345c.m12357d(C4390t.m12626u(str, i, i2, false));
        }

        /* renamed from: h */
        private boolean m12649h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: i */
        private boolean m12650i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: k */
        private static int m12651k(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C4390t.m12617a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: m */
        private void m12652m() {
            List<String> list = this.f7847f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f7847f.isEmpty()) {
                this.f7847f.add("");
                return;
            }
            List<String> list2 = this.f7847f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: o */
        private static int m12653o(String str, int i, int i2) {
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
        private void m12654p(String str, int i, int i2, boolean z, boolean z2) {
            String a = C4390t.m12617a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m12649h(a)) {
                if (m12650i(a)) {
                    m12652m();
                    return;
                }
                List<String> list = this.f7847f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f7847f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f7847f.add(a);
                }
                if (z) {
                    this.f7847f.add("");
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
        private void m12655r(java.lang.String r11, int r12, int r13) {
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
                java.util.List<java.lang.String> r0 = r10.f7847f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f7847f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f7847f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p156f.p157g0.C4345c.m12368o(r11, r6, r13, r12)
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
                r4.m12654p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.C4390t.C4391a.m12655r(java.lang.String, int, int):void");
        }

        /* renamed from: t */
        private static int m12656t(String str, int i, int i2) {
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
        private static int m12657u(String str, int i, int i2) {
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
        public C4391a mo24121a(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f7848g == null) {
                    this.f7848g = new ArrayList();
                }
                this.f7848g.add(C4390t.m12618b(str, " \"'<>#&=", true, false, true, true));
                this.f7848g.add(str2 != null ? C4390t.m12618b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C4391a mo24122b(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f7848g == null) {
                    this.f7848g = new ArrayList();
                }
                this.f7848g.add(C4390t.m12618b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.f7848g.add(str2 != null ? C4390t.m12618b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: c */
        public C4390t mo24123c() {
            if (this.f7842a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f7845d != null) {
                return new C4390t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo24124e() {
            int i = this.f7846e;
            return i != -1 ? i : C4390t.m12621e(this.f7842a);
        }

        /* renamed from: f */
        public C4391a mo24125f(@Nullable String str) {
            this.f7848g = str != null ? C4390t.m12616B(C4390t.m12618b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public C4391a mo24126g(String str) {
            if (str != null) {
                String d = m12648d(str, 0, str.length());
                if (d != null) {
                    this.f7845d = d;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C4391a mo24127j(@Nullable C4390t tVar, String str) {
            int o;
            int i;
            C4390t tVar2 = tVar;
            String str2 = str;
            int E = C4345c.m12348E(str2, 0, str.length());
            int F = C4345c.m12349F(str2, E, str.length());
            int t = m12656t(str2, E, F);
            if (t != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f7842a = "https";
                    E += 6;
                } else if (str.regionMatches(true, E, "http:", 0, 5)) {
                    this.f7842a = "http";
                    E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, t) + "'");
                }
            } else if (tVar2 != null) {
                this.f7842a = tVar2.f7833a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int u = m12657u(str2, E, F);
            char c = '?';
            char c2 = '#';
            if (u >= 2 || tVar2 == null || !tVar2.f7833a.equals(this.f7842a)) {
                int i2 = E + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    o = C4345c.m12368o(str2, i2, F, "@/\\?#");
                    char charAt = o != F ? str2.charAt(o) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = o;
                        int o2 = m12653o(str2, i2, i3);
                        int i4 = o2 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int n = C4345c.m12367n(str2, i2, o, ':');
                                int i5 = n;
                                String str3 = "%40";
                                i = o;
                                String a = C4390t.m12617a(str, i2, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a = this.f7843b + str3 + a;
                                }
                                this.f7843b = a;
                                if (i5 != i) {
                                    this.f7844c = C4390t.m12617a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = o;
                                this.f7844c += "%40" + C4390t.m12617a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = o;
                int o22 = m12653o(str2, i2, i32);
                int i42 = o22 + 1;
                if (i42 < i32) {
                    this.f7845d = m12648d(str2, i2, o22);
                    int k = m12651k(str2, i42, i32);
                    this.f7846e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.f7845d = m12648d(str2, i2, o22);
                    this.f7846e = C4390t.m12621e(this.f7842a);
                }
                if (this.f7845d != null) {
                    E = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, o22) + '\"');
                }
            } else {
                this.f7843b = tVar.mo24113k();
                this.f7844c = tVar.mo24108g();
                this.f7845d = tVar2.f7836d;
                this.f7846e = tVar2.f7837e;
                this.f7847f.clear();
                this.f7847f.addAll(tVar.mo24111i());
                if (E == F || str2.charAt(E) == '#') {
                    mo24125f(tVar.mo24112j());
                }
            }
            int o3 = C4345c.m12368o(str2, E, F, "?#");
            m12655r(str2, E, o3);
            if (o3 < F && str2.charAt(o3) == '?') {
                int n2 = C4345c.m12367n(str2, o3, F, '#');
                this.f7848g = C4390t.m12616B(C4390t.m12617a(str, o3 + 1, n2, " \"'<>#", true, false, true, true, (Charset) null));
                o3 = n2;
            }
            if (o3 < F && str2.charAt(o3) == '#') {
                this.f7849h = C4390t.m12617a(str, 1 + o3, F, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /* renamed from: l */
        public C4391a mo24128l(String str) {
            if (str != null) {
                this.f7844c = C4390t.m12618b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: n */
        public C4391a mo24129n(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f7846e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C4391a mo24130q() {
            int size = this.f7847f.size();
            for (int i = 0; i < size; i++) {
                this.f7847f.set(i, C4390t.m12618b(this.f7847f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f7848g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f7848g.get(i2);
                    if (str != null) {
                        this.f7848g.set(i2, C4390t.m12618b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f7849h;
            if (str2 != null) {
                this.f7849h = C4390t.m12618b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: s */
        public C4391a mo24131s(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f7842a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f7842a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f7843b.isEmpty() || !this.f7844c.isEmpty()) {
                sb.append(this.f7843b);
                if (!this.f7844c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f7844c);
                }
                sb.append('@');
            }
            String str3 = this.f7845d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f7845d);
                    sb.append(']');
                } else {
                    sb.append(this.f7845d);
                }
            }
            if (!(this.f7846e == -1 && this.f7842a == null)) {
                int e = mo24124e();
                String str4 = this.f7842a;
                if (str4 == null || e != C4390t.m12621e(str4)) {
                    sb.append(':');
                    sb.append(e);
                }
            }
            C4390t.m12625t(sb, this.f7847f);
            if (this.f7848g != null) {
                sb.append('?');
                C4390t.m12623o(sb, this.f7848g);
            }
            if (this.f7849h != null) {
                sb.append('#');
                sb.append(this.f7849h);
            }
            return sb.toString();
        }

        /* renamed from: v */
        public C4391a mo24133v(String str) {
            if (str != null) {
                this.f7843b = C4390t.m12618b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    C4390t(C4391a aVar) {
        this.f7833a = aVar.f7842a;
        this.f7834b = m12627v(aVar.f7843b, false);
        this.f7835c = m12627v(aVar.f7844c, false);
        this.f7836d = aVar.f7845d;
        this.f7837e = aVar.mo24124e();
        this.f7838f = m12628w(aVar.f7847f, false);
        List<String> list = aVar.f7848g;
        String str = null;
        this.f7839g = list != null ? m12628w(list, true) : null;
        String str2 = aVar.f7849h;
        this.f7840h = str2 != null ? m12627v(str2, false) : str;
        this.f7841i = aVar.toString();
    }

    /* renamed from: B */
    static List<String> m12616B(String str) {
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
    static String m12617a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m12630y(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C4406c cVar = new C4406c();
            int i5 = i;
            cVar.mo24271v1(str, i, i4);
            m12620d(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo24228d0();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m12618b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m12617a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    static String m12619c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m12617a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: d */
    static void m12620d(C4406c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C4406c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.mo24269u1(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m12630y(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C4406c();
                    }
                    if (charset == null || charset.equals(C4345c.f7648i)) {
                        cVar2.mo24272w1(codePointAt);
                    } else {
                        cVar2.mo24262s1(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo24274x()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24247n1(37);
                        cVar.mo24247n1(f7832j[(readByte >> 4) & 15]);
                        cVar.mo24247n1(f7832j[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24272w1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    public static int m12621e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static C4390t m12622l(String str) {
        C4391a aVar = new C4391a();
        aVar.mo24127j((C4390t) null, str);
        return aVar.mo24123c();
    }

    /* renamed from: o */
    static void m12623o(StringBuilder sb, List<String> list) {
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
    public static C4390t m12624r(String str) {
        try {
            return m12622l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: t */
    static void m12625t(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* renamed from: u */
    static String m12626u(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C4406c cVar = new C4406c();
                cVar.mo24271v1(str, i, i3);
                m12629x(cVar, str, i3, i2, z);
                return cVar.mo24228d0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: v */
    static String m12627v(String str, boolean z) {
        return m12626u(str, 0, str.length(), z);
    }

    /* renamed from: w */
    private List<String> m12628w(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m12627v(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: x */
    static void m12629x(C4406c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int k = C4345c.m12364k(str.charAt(i + 1));
                int k2 = C4345c.m12364k(str.charAt(i3));
                if (!(k == -1 || k2 == -1)) {
                    cVar.mo24247n1((k << 4) + k2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.mo24247n1(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo24272w1(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: y */
    static boolean m12630y(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C4345c.m12364k(str.charAt(i + 1)) != -1 && C4345c.m12364k(str.charAt(i3)) != -1;
    }

    @Nullable
    /* renamed from: A */
    public String mo24101A() {
        if (this.f7839g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m12623o(sb, this.f7839g);
        return sb.toString();
    }

    /* renamed from: C */
    public String mo24102C() {
        C4391a q = mo24117q("/...");
        q.mo24133v("");
        q.mo24128l("");
        return q.mo24123c().toString();
    }

    @Nullable
    /* renamed from: D */
    public C4390t mo24103D(String str) {
        C4391a q = mo24117q(str);
        if (q != null) {
            return q.mo24123c();
        }
        return null;
    }

    /* renamed from: E */
    public String mo24104E() {
        return this.f7833a;
    }

    /* renamed from: F */
    public URI mo24105F() {
        C4391a p = mo24116p();
        p.mo24130q();
        String aVar = p.toString();
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
        return (obj instanceof C4390t) && ((C4390t) obj).f7841i.equals(this.f7841i);
    }

    @Nullable
    /* renamed from: f */
    public String mo24107f() {
        if (this.f7840h == null) {
            return null;
        }
        return this.f7841i.substring(this.f7841i.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String mo24108g() {
        if (this.f7835c.isEmpty()) {
            return "";
        }
        int indexOf = this.f7841i.indexOf(64);
        return this.f7841i.substring(this.f7841i.indexOf(58, this.f7833a.length() + 3) + 1, indexOf);
    }

    /* renamed from: h */
    public String mo24109h() {
        int indexOf = this.f7841i.indexOf(47, this.f7833a.length() + 3);
        String str = this.f7841i;
        return this.f7841i.substring(indexOf, C4345c.m12368o(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f7841i.hashCode();
    }

    /* renamed from: i */
    public List<String> mo24111i() {
        int indexOf = this.f7841i.indexOf(47, this.f7833a.length() + 3);
        String str = this.f7841i;
        int o = C4345c.m12368o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o) {
            int i = indexOf + 1;
            int n = C4345c.m12367n(this.f7841i, i, o, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f7841i.substring(i, n));
            indexOf = n;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: j */
    public String mo24112j() {
        if (this.f7839g == null) {
            return null;
        }
        int indexOf = this.f7841i.indexOf(63) + 1;
        String str = this.f7841i;
        return this.f7841i.substring(indexOf, C4345c.m12367n(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String mo24113k() {
        if (this.f7834b.isEmpty()) {
            return "";
        }
        int length = this.f7833a.length() + 3;
        String str = this.f7841i;
        return this.f7841i.substring(length, C4345c.m12368o(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String mo24114m() {
        return this.f7836d;
    }

    /* renamed from: n */
    public boolean mo24115n() {
        return this.f7833a.equals("https");
    }

    /* renamed from: p */
    public C4391a mo24116p() {
        C4391a aVar = new C4391a();
        aVar.f7842a = this.f7833a;
        aVar.f7843b = mo24113k();
        aVar.f7844c = mo24108g();
        aVar.f7845d = this.f7836d;
        aVar.f7846e = this.f7837e != m12621e(this.f7833a) ? this.f7837e : -1;
        aVar.f7847f.clear();
        aVar.f7847f.addAll(mo24111i());
        aVar.mo24125f(mo24112j());
        aVar.f7849h = mo24107f();
        return aVar;
    }

    @Nullable
    /* renamed from: q */
    public C4391a mo24117q(String str) {
        try {
            C4391a aVar = new C4391a();
            aVar.mo24127j(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public List<String> mo24118s() {
        return this.f7838f;
    }

    public String toString() {
        return this.f7841i;
    }

    /* renamed from: z */
    public int mo24120z() {
        return this.f7837e;
    }
}
