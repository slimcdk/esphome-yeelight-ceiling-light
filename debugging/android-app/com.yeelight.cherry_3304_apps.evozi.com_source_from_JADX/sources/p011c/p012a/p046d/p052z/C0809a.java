package p011c.p012a.p046d.p052z;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.p271io.FilenameUtils;
import p011c.p012a.p046d.p047x.C0714f;
import p011c.p012a.p046d.p047x.p048n.C0742e;

/* renamed from: c.a.d.z.a */
public class C0809a implements Closeable {

    /* renamed from: p */
    private static final char[] f628p = ")]}'\n".toCharArray();

    /* renamed from: a */
    private final Reader f629a;

    /* renamed from: b */
    private boolean f630b = false;

    /* renamed from: c */
    private final char[] f631c = new char[1024];

    /* renamed from: d */
    private int f632d = 0;

    /* renamed from: e */
    private int f633e = 0;

    /* renamed from: f */
    private int f634f = 0;

    /* renamed from: g */
    private int f635g = 0;

    /* renamed from: h */
    int f636h = 0;

    /* renamed from: i */
    private long f637i;

    /* renamed from: j */
    private int f638j;

    /* renamed from: k */
    private String f639k;

    /* renamed from: l */
    private int[] f640l;

    /* renamed from: m */
    private int f641m;

    /* renamed from: n */
    private String[] f642n;

    /* renamed from: o */
    private int[] f643o;

    /* renamed from: c.a.d.z.a$a */
    static class C0810a extends C0714f {
        C0810a() {
        }

        /* renamed from: a */
        public void mo8794a(C0809a aVar) {
            int i;
            if (aVar instanceof C0742e) {
                ((C0742e) aVar).mo8868r0();
                return;
            }
            int i2 = aVar.f636h;
            if (i2 == 0) {
                i2 = aVar.mo8974i();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo8861V() + aVar.mo8972D());
            }
            aVar.f636h = i;
        }
    }

    static {
        C0714f.f454a = new C0810a();
    }

    public C0809a(Reader reader) {
        int[] iArr = new int[32];
        this.f640l = iArr;
        this.f641m = 0;
        this.f641m = 0 + 1;
        iArr[0] = 6;
        this.f642n = new String[32];
        this.f643o = new int[32];
        if (reader != null) {
            this.f629a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: C */
    private boolean m1037C(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m1049g();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f632d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f632d = r4 - 1;
        r2 = m1052o(2);
        r7.f632d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        m1049g();
        r2 = r7.f632d;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.f632d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f632d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (m1046d0("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        m1051k0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f632d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        m1049g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1038M(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f631c
        L_0x0002:
            int r1 = r7.f632d
        L_0x0004:
            int r2 = r7.f633e
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f632d = r1
            boolean r1 = r7.m1052o(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.mo8972D()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f632d
            int r2 = r7.f633e
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f634f
            int r1 = r1 + r3
            r7.f634f = r1
            r7.f635g = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f632d = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f632d = r4
            boolean r2 = r7.m1052o(r6)
            int r4 = r7.f632d
            int r4 = r4 + r3
            r7.f632d = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.m1049g()
            int r2 = r7.f632d
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f632d = r2
        L_0x007c:
            r7.m1047e0()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f632d = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m1046d0(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f632d
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            r7.m1051k0(r8)
            r8 = 0
            throw r8
        L_0x0098:
            r2 = 35
            r7.f632d = r4
            if (r1 != r2) goto L_0x00a2
            r7.m1049g()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p052z.C0809a.m1038M(boolean):int");
    }

    /* renamed from: R */
    private String m1039R(char c) {
        char[] cArr = this.f631c;
        StringBuilder sb = null;
        while (true) {
            int i = this.f632d;
            int i2 = this.f633e;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f632d = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f632d = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(m1044a0());
                    } else {
                        if (c2 == 10) {
                            this.f634f++;
                            this.f635g = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f632d = i;
                    if (!m1052o(1)) {
                        m1051k0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m1049g();
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m1040T() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f632d
            int r4 = r3 + r2
            int r5 = r6.f633e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f631c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m1049g()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f631c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m1052o(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f631c
            int r4 = r6.f632d
            r1.append(r3, r4, r2)
            int r3 = r6.f632d
            int r3 = r3 + r2
            r6.f632d = r3
            r2 = 1
            boolean r2 = r6.m1052o(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f631c
            int r3 = r6.f632d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f631c
            int r3 = r6.f632d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f632d
            int r2 = r2 + r0
            r6.f632d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p052z.C0809a.m1040T():java.lang.String");
    }

    /* renamed from: W */
    private int m1041W() {
        String str;
        String str2;
        int i;
        char c = this.f631c[this.f632d];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f632d + i2 >= this.f633e && !m1052o(i2 + 1)) {
                return 0;
            }
            char c2 = this.f631c[this.f632d + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f632d + length < this.f633e || m1052o(length + 1)) && m1037C(this.f631c[this.f632d + length])) {
            return 0;
        }
        this.f632d += length;
        this.f636h = i;
        return i;
    }

    /* renamed from: X */
    private int m1042X() {
        int i;
        char c;
        char[] cArr = this.f631c;
        int i2 = this.f632d;
        int i3 = this.f633e;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!m1052o(i5 + 1)) {
                    break;
                }
                i2 = this.f632d;
                i3 = this.f633e;
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i4 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i4 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i4 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i4 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i4 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i4 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i4 = 0;
                            c2 = 7;
                        }
                        i4 = 0;
                    }
                }
                i5++;
            }
            c2 = 6;
            i5++;
        }
        if (m1037C(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f637i = j;
            this.f632d += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f638j = i5;
            i = 16;
        }
        this.f636h = i;
        return i;
    }

    /* renamed from: Z */
    private void m1043Z(int i) {
        int i2 = this.f641m;
        int[] iArr = this.f640l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f643o, 0, iArr3, 0, this.f641m);
            System.arraycopy(this.f642n, 0, strArr, 0, this.f641m);
            this.f640l = iArr2;
            this.f643o = iArr3;
            this.f642n = strArr;
        }
        int[] iArr4 = this.f640l;
        int i3 = this.f641m;
        this.f641m = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: a0 */
    private char m1044a0() {
        int i;
        int i2;
        if (this.f632d != this.f633e || m1052o(1)) {
            char[] cArr = this.f631c;
            int i3 = this.f632d;
            int i4 = i3 + 1;
            this.f632d = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f634f++;
                this.f635g = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m1051k0("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f633e || m1052o(4)) {
                    char c2 = 0;
                    int i5 = this.f632d;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f631c[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f631c, this.f632d, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f632d += 4;
                    return c2;
                } else {
                    m1051k0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        m1051k0("Unterminated escape sequence");
        throw null;
    }

    /* renamed from: c0 */
    private void m1045c0(char c) {
        char[] cArr = this.f631c;
        while (true) {
            int i = this.f632d;
            int i2 = this.f633e;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f632d = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f632d = i3;
                        m1044a0();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f634f++;
                            this.f635g = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f632d = i;
                    if (!m1052o(1)) {
                        m1051k0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: d0 */
    private boolean m1046d0(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f632d + length > this.f633e && !m1052o(length)) {
                return false;
            }
            char[] cArr = this.f631c;
            int i2 = this.f632d;
            if (cArr[i2] == 10) {
                this.f634f++;
                this.f635g = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f631c[this.f632d + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f632d++;
        }
    }

    /* renamed from: e0 */
    private void m1047e0() {
        char c;
        do {
            if (this.f632d < this.f633e || m1052o(1)) {
                char[] cArr = this.f631c;
                int i = this.f632d;
                int i2 = i + 1;
                this.f632d = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f634f++;
                    this.f635g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        m1049g();
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1048f0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f632d
            int r2 = r1 + r0
            int r3 = r4.f633e
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f631c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.m1049g()
        L_0x004b:
            int r1 = r4.f632d
            int r1 = r1 + r0
            r4.f632d = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f632d = r1
            r0 = 1
            boolean r0 = r4.m1052o(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p052z.C0809a.m1048f0():void");
    }

    /* renamed from: g */
    private void m1049g() {
        if (!this.f630b) {
            m1051k0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: h */
    private void m1050h() {
        m1038M(true);
        int i = this.f632d - 1;
        this.f632d = i;
        char[] cArr = f628p;
        if (i + cArr.length <= this.f633e || m1052o(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f628p;
                if (i2 >= cArr2.length) {
                    this.f632d += cArr2.length;
                    return;
                } else if (this.f631c[this.f632d + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k0 */
    private IOException m1051k0(String str) {
        throw new C0813d(str + mo8972D());
    }

    /* renamed from: o */
    private boolean m1052o(int i) {
        int i2;
        char[] cArr = this.f631c;
        int i3 = this.f635g;
        int i4 = this.f632d;
        this.f635g = i3 - i4;
        int i5 = this.f633e;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f633e = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f633e = 0;
        }
        this.f632d = 0;
        do {
            Reader reader = this.f629a;
            int i7 = this.f633e;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f633e + read;
            this.f633e = i8;
            if (this.f634f == 0 && (i2 = this.f635g) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f632d++;
                this.f635g = i2 + 1;
                i++;
            }
        } while (this.f633e < i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public String mo8972D() {
        return " at line " + (this.f634f + 1) + " column " + ((this.f632d - this.f635g) + 1) + " path " + mo8869s();
    }

    /* renamed from: F */
    public boolean mo8854F() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 5) {
            this.f636h = 0;
            int[] iArr = this.f643o;
            int i2 = this.f641m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f636h = 0;
            int[] iArr2 = this.f643o;
            int i3 = this.f641m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo8861V() + mo8972D());
        }
    }

    /* renamed from: I */
    public double mo8855I() {
        String str;
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 15) {
            this.f636h = 0;
            int[] iArr = this.f643o;
            int i2 = this.f641m - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f637i;
        }
        if (i == 16) {
            this.f639k = new String(this.f631c, this.f632d, this.f638j);
            this.f632d += this.f638j;
        } else {
            if (i == 8 || i == 9) {
                str = m1039R(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = m1040T();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo8861V() + mo8972D());
            }
            this.f639k = str;
        }
        this.f636h = 11;
        double parseDouble = Double.parseDouble(this.f639k);
        if (this.f630b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f639k = null;
            this.f636h = 0;
            int[] iArr2 = this.f643o;
            int i3 = this.f641m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C0813d("JSON forbids NaN and infinities: " + parseDouble + mo8972D());
    }

    /* renamed from: J */
    public int mo8856J() {
        String R;
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 15) {
            long j = this.f637i;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f636h = 0;
                int[] iArr = this.f643o;
                int i3 = this.f641m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f637i + mo8972D());
        }
        if (i == 16) {
            this.f639k = new String(this.f631c, this.f632d, this.f638j);
            this.f632d += this.f638j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                R = m1040T();
            } else {
                R = m1039R(i == 8 ? '\'' : '\"');
            }
            this.f639k = R;
            try {
                int parseInt = Integer.parseInt(this.f639k);
                this.f636h = 0;
                int[] iArr2 = this.f643o;
                int i4 = this.f641m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo8861V() + mo8972D());
        }
        this.f636h = 11;
        double parseDouble = Double.parseDouble(this.f639k);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f639k = null;
            this.f636h = 0;
            int[] iArr3 = this.f643o;
            int i6 = this.f641m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f639k + mo8972D());
    }

    /* renamed from: K */
    public long mo8857K() {
        String R;
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 15) {
            this.f636h = 0;
            int[] iArr = this.f643o;
            int i2 = this.f641m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f637i;
        }
        if (i == 16) {
            this.f639k = new String(this.f631c, this.f632d, this.f638j);
            this.f632d += this.f638j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                R = m1040T();
            } else {
                R = m1039R(i == 8 ? '\'' : '\"');
            }
            this.f639k = R;
            try {
                long parseLong = Long.parseLong(this.f639k);
                this.f636h = 0;
                int[] iArr2 = this.f643o;
                int i3 = this.f641m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo8861V() + mo8972D());
        }
        this.f636h = 11;
        double parseDouble = Double.parseDouble(this.f639k);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f639k = null;
            this.f636h = 0;
            int[] iArr3 = this.f643o;
            int i4 = this.f641m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f639k + mo8972D());
    }

    /* renamed from: L */
    public String mo8858L() {
        String str;
        char c;
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 14) {
            str = m1040T();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + mo8861V() + mo8972D());
            }
            str = m1039R(c);
        }
        this.f636h = 0;
        this.f642n[this.f641m - 1] = str;
        return str;
    }

    /* renamed from: Q */
    public void mo8859Q() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 7) {
            this.f636h = 0;
            int[] iArr = this.f643o;
            int i2 = this.f641m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo8861V() + mo8972D());
    }

    /* renamed from: S */
    public String mo8860S() {
        String str;
        char c;
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 10) {
            str = m1040T();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f639k;
                this.f639k = null;
            } else if (i == 15) {
                str = Long.toString(this.f637i);
            } else if (i == 16) {
                str = new String(this.f631c, this.f632d, this.f638j);
                this.f632d += this.f638j;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo8861V() + mo8972D());
            }
            str = m1039R(c);
        }
        this.f636h = 0;
        int[] iArr = this.f643o;
        int i2 = this.f641m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: V */
    public C0811b mo8861V() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        switch (i) {
            case 1:
                return C0811b.BEGIN_OBJECT;
            case 2:
                return C0811b.END_OBJECT;
            case 3:
                return C0811b.BEGIN_ARRAY;
            case 4:
                return C0811b.END_ARRAY;
            case 5:
            case 6:
                return C0811b.BOOLEAN;
            case 7:
                return C0811b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C0811b.STRING;
            case 12:
            case 13:
            case 14:
                return C0811b.NAME;
            case 15:
            case 16:
                return C0811b.NUMBER;
            case 17:
                return C0811b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo8862a() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 3) {
            m1043Z(1);
            this.f643o[this.f641m - 1] = 0;
            this.f636h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo8861V() + mo8972D());
    }

    /* renamed from: b */
    public void mo8863b() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 1) {
            m1043Z(3);
            this.f636h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo8861V() + mo8972D());
    }

    /* renamed from: b0 */
    public final void mo8973b0(boolean z) {
        this.f630b = z;
    }

    public void close() {
        this.f636h = 0;
        this.f640l[0] = 8;
        this.f641m = 1;
        this.f629a.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8974i() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f640l
            int r2 = r0.f641m
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 8
            r5 = 39
            r6 = 34
            r7 = 93
            r8 = 3
            r9 = 7
            r10 = 59
            r11 = 44
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 != r15) goto L_0x0023
            int r2 = r2 - r15
            r1[r2] = r13
            goto L_0x00a3
        L_0x0023:
            if (r3 != r13) goto L_0x003c
            int r1 = r0.m1038M(r15)
            if (r1 == r11) goto L_0x00a3
            if (r1 == r10) goto L_0x0038
            if (r1 != r7) goto L_0x0032
            r0.f636h = r12
            return r12
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.m1051k0(r1)
            throw r14
        L_0x0038:
            r16.m1049g()
            goto L_0x00a3
        L_0x003c:
            r13 = 5
            if (r3 == r8) goto L_0x0117
            if (r3 != r13) goto L_0x0043
            goto L_0x0117
        L_0x0043:
            if (r3 != r12) goto L_0x0077
            int r2 = r2 - r15
            r1[r2] = r13
            int r1 = r0.m1038M(r15)
            r2 = 58
            if (r1 == r2) goto L_0x00a3
            r2 = 61
            if (r1 != r2) goto L_0x0071
            r16.m1049g()
            int r1 = r0.f632d
            int r2 = r0.f633e
            if (r1 < r2) goto L_0x0063
            boolean r1 = r0.m1052o(r15)
            if (r1 == 0) goto L_0x00a3
        L_0x0063:
            char[] r1 = r0.f631c
            int r2 = r0.f632d
            char r1 = r1[r2]
            r13 = 62
            if (r1 != r13) goto L_0x00a3
            int r2 = r2 + r15
            r0.f632d = r2
            goto L_0x00a3
        L_0x0071:
            java.lang.String r1 = "Expected ':'"
            r0.m1051k0(r1)
            throw r14
        L_0x0077:
            r1 = 6
            if (r3 != r1) goto L_0x0089
            boolean r1 = r0.f630b
            if (r1 == 0) goto L_0x0081
            r16.m1050h()
        L_0x0081:
            int[] r1 = r0.f640l
            int r2 = r0.f641m
            int r2 = r2 - r15
            r1[r2] = r9
            goto L_0x00a3
        L_0x0089:
            if (r3 != r9) goto L_0x00a1
            r1 = 0
            int r1 = r0.m1038M(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0098
            r1 = 17
        L_0x0095:
            r0.f636h = r1
            return r1
        L_0x0098:
            r16.m1049g()
            int r1 = r0.f632d
            int r1 = r1 - r15
            r0.f632d = r1
            goto L_0x00a3
        L_0x00a1:
            if (r3 == r4) goto L_0x010f
        L_0x00a3:
            int r1 = r0.m1038M(r15)
            if (r1 == r6) goto L_0x010c
            if (r1 == r5) goto L_0x0106
            if (r1 == r11) goto L_0x00ef
            if (r1 == r10) goto L_0x00ef
            r2 = 91
            if (r1 == r2) goto L_0x00ec
            if (r1 == r7) goto L_0x00e7
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00e4
            int r1 = r0.f632d
            int r1 = r1 - r15
            r0.f632d = r1
            int r1 = r16.m1041W()
            if (r1 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            int r1 = r16.m1042X()
            if (r1 == 0) goto L_0x00cc
            return r1
        L_0x00cc:
            char[] r1 = r0.f631c
            int r2 = r0.f632d
            char r1 = r1[r2]
            boolean r1 = r0.m1037C(r1)
            if (r1 == 0) goto L_0x00de
            r16.m1049g()
            r1 = 10
            goto L_0x0095
        L_0x00de:
            java.lang.String r1 = "Expected value"
            r0.m1051k0(r1)
            throw r14
        L_0x00e4:
            r0.f636h = r15
            return r15
        L_0x00e7:
            if (r3 != r15) goto L_0x00ef
            r0.f636h = r12
            return r12
        L_0x00ec:
            r0.f636h = r8
            return r8
        L_0x00ef:
            if (r3 == r15) goto L_0x00fb
            r1 = 2
            if (r3 != r1) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = "Unexpected value"
            r0.m1051k0(r1)
            throw r14
        L_0x00fb:
            r16.m1049g()
            int r1 = r0.f632d
            int r1 = r1 - r15
            r0.f632d = r1
            r0.f636h = r9
            return r9
        L_0x0106:
            r16.m1049g()
            r0.f636h = r4
            return r4
        L_0x010c:
            r1 = 9
            goto L_0x0095
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0117:
            int[] r1 = r0.f640l
            int r2 = r0.f641m
            int r2 = r2 - r15
            r1[r2] = r12
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L_0x0138
            int r2 = r0.m1038M(r15)
            if (r2 == r11) goto L_0x0138
            if (r2 == r10) goto L_0x0135
            if (r2 != r1) goto L_0x012f
        L_0x012c:
            r1 = 2
            goto L_0x0095
        L_0x012f:
            java.lang.String r1 = "Unterminated object"
            r0.m1051k0(r1)
            throw r14
        L_0x0135:
            r16.m1049g()
        L_0x0138:
            int r2 = r0.m1038M(r15)
            if (r2 == r6) goto L_0x0169
            if (r2 == r5) goto L_0x0162
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x015b
            r16.m1049g()
            int r1 = r0.f632d
            int r1 = r1 - r15
            r0.f632d = r1
            char r1 = (char) r2
            boolean r1 = r0.m1037C(r1)
            if (r1 == 0) goto L_0x0157
            r1 = 14
            goto L_0x0095
        L_0x0157:
            r0.m1051k0(r4)
            throw r14
        L_0x015b:
            if (r3 == r13) goto L_0x015e
            goto L_0x012c
        L_0x015e:
            r0.m1051k0(r4)
            throw r14
        L_0x0162:
            r16.m1049g()
            r1 = 12
            goto L_0x0095
        L_0x0169:
            r1 = 13
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p052z.C0809a.mo8974i():int");
    }

    /* renamed from: j */
    public void mo8865j() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 4) {
            int i2 = this.f641m - 1;
            this.f641m = i2;
            int[] iArr = this.f643o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f636h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo8861V() + mo8972D());
    }

    /* renamed from: j0 */
    public void mo8866j0() {
        char c;
        int i = 0;
        do {
            int i2 = this.f636h;
            if (i2 == 0) {
                i2 = mo8974i();
            }
            if (i2 == 3) {
                m1043Z(1);
            } else if (i2 == 1) {
                m1043Z(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f641m--;
                i--;
                this.f636h = 0;
            } else if (i2 == 14 || i2 == 10) {
                m1048f0();
                this.f636h = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = '\"';
                } else {
                    if (i2 == 16) {
                        this.f632d += this.f638j;
                    }
                    this.f636h = 0;
                }
                m1045c0(c);
                this.f636h = 0;
            }
            i++;
            this.f636h = 0;
        } while (i != 0);
        int[] iArr = this.f643o;
        int i3 = this.f641m;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f642n[i3 - 1] = "null";
    }

    /* renamed from: n */
    public void mo8867n() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        if (i == 2) {
            int i2 = this.f641m - 1;
            this.f641m = i2;
            this.f642n[i2] = null;
            int[] iArr = this.f643o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f636h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo8861V() + mo8972D());
    }

    /* renamed from: s */
    public String mo8869s() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f641m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f640l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f643o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String[] strArr = this.f642n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: t */
    public boolean mo8870t() {
        int i = this.f636h;
        if (i == 0) {
            i = mo8974i();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + mo8972D();
    }

    /* renamed from: u */
    public final boolean mo8975u() {
        return this.f630b;
    }
}
