package p122z1;

import com.google.gson.internal.C2515e;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import org.apache.commons.p194io.FilenameUtils;
import p107v1.C3744e;

/* renamed from: z1.a */
public class C3929a implements Closeable {

    /* renamed from: p */
    private static final char[] f6569p = ")]}'\n".toCharArray();

    /* renamed from: a */
    private final Reader f6570a;

    /* renamed from: b */
    private boolean f6571b = false;

    /* renamed from: c */
    private final char[] f6572c = new char[1024];

    /* renamed from: d */
    private int f6573d = 0;

    /* renamed from: e */
    private int f6574e = 0;

    /* renamed from: f */
    private int f6575f = 0;

    /* renamed from: g */
    private int f6576g = 0;

    /* renamed from: h */
    int f6577h = 0;

    /* renamed from: i */
    private long f6578i;

    /* renamed from: j */
    private int f6579j;

    /* renamed from: k */
    private String f6580k;

    /* renamed from: l */
    private int[] f6581l;

    /* renamed from: m */
    private int f6582m;

    /* renamed from: n */
    private String[] f6583n;

    /* renamed from: o */
    private int[] f6584o;

    /* renamed from: z1.a$a */
    static class C3930a extends C2515e {
        C3930a() {
        }

        /* renamed from: a */
        public void mo19373a(C3929a aVar) {
            int i;
            if (aVar instanceof C3744e) {
                ((C3744e) aVar).mo26179u0();
                return;
            }
            int i2 = aVar.f6577h;
            if (i2 == 0) {
                i2 = aVar.mo26425h();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo26169N() + aVar.mo26427s());
            }
            aVar.f6577h = i;
        }
    }

    static {
        C2515e.f4259a = new C3930a();
    }

    public C3929a(Reader reader) {
        int[] iArr = new int[32];
        this.f6581l = iArr;
        this.f6582m = 0;
        this.f6582m = 0 + 1;
        iArr[0] = 6;
        this.f6583n = new String[32];
        this.f6584o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f6570a = reader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f6573d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f6573d = r4 - 1;
        r2 = m11232l(2);
        r7.f6573d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        m11225d();
        r2 = r7.f6573d;
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
        r7.f6573d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f6573d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (m11228f0("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw m11231k0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f6573d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        m11225d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m11218E(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f6572c
        L_0x0002:
            int r1 = r7.f6573d
        L_0x0004:
            int r2 = r7.f6574e
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f6573d = r1
            boolean r1 = r7.m11232l(r3)
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
            java.lang.String r1 = r7.mo26427s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f6573d
            int r2 = r7.f6574e
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f6575f
            int r1 = r1 + r3
            r7.f6575f = r1
            r7.f6576g = r4
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
            r7.f6573d = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f6573d = r4
            boolean r2 = r7.m11232l(r6)
            int r4 = r7.f6573d
            int r4 = r4 + r3
            r7.f6573d = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.m11225d()
            int r2 = r7.f6573d
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f6573d = r2
        L_0x007c:
            r7.m11229g0()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f6573d = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m11228f0(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f6573d
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.m11231k0(r8)
            throw r8
        L_0x0098:
            r2 = 35
            r7.f6573d = r4
            if (r1 != r2) goto L_0x00a2
            r7.m11225d()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p122z1.C3929a.m11218E(boolean):int");
    }

    /* renamed from: H */
    private String m11219H(char c) {
        char[] cArr = this.f6572c;
        StringBuilder sb = null;
        while (true) {
            int i = this.f6573d;
            int i2 = this.f6574e;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f6573d = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f6573d = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(m11224W());
                    } else {
                        if (c2 == 10) {
                            this.f6575f++;
                            this.f6576g = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f6573d = i;
                    if (!m11232l(1)) {
                        throw m11231k0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m11225d();
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m11220J() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f6573d
            int r4 = r3 + r2
            int r5 = r6.f6574e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f6572c
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
            r6.m11225d()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f6572c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m11232l(r3)
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
            char[] r3 = r6.f6572c
            int r4 = r6.f6573d
            r1.append(r3, r4, r2)
            int r3 = r6.f6573d
            int r3 = r3 + r2
            r6.f6573d = r3
            r2 = 1
            boolean r2 = r6.m11232l(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f6572c
            int r3 = r6.f6573d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f6572c
            int r3 = r6.f6573d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f6573d
            int r2 = r2 + r0
            r6.f6573d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p122z1.C3929a.m11220J():java.lang.String");
    }

    /* renamed from: P */
    private int m11221P() {
        String str;
        String str2;
        int i;
        char c = this.f6572c[this.f6573d];
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
            if (this.f6573d + i2 >= this.f6574e && !m11232l(i2 + 1)) {
                return 0;
            }
            char c2 = this.f6572c[this.f6573d + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f6573d + length < this.f6574e || m11232l(length + 1)) && m11233q(this.f6572c[this.f6573d + length])) {
            return 0;
        }
        this.f6573d += length;
        this.f6577h = i;
        return i;
    }

    /* renamed from: T */
    private int m11222T() {
        int i;
        char c;
        char[] cArr = this.f6572c;
        int i2 = this.f6573d;
        int i3 = this.f6574e;
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
                if (!m11232l(i5 + 1)) {
                    break;
                }
                i2 = this.f6573d;
                i3 = this.f6574e;
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
        if (m11233q(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f6578i = j;
            this.f6573d += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f6579j = i5;
            i = 16;
        }
        this.f6577h = i;
        return i;
    }

    /* renamed from: V */
    private void m11223V(int i) {
        int i2 = this.f6582m;
        int[] iArr = this.f6581l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f6584o, 0, iArr3, 0, this.f6582m);
            System.arraycopy(this.f6583n, 0, strArr, 0, this.f6582m);
            this.f6581l = iArr2;
            this.f6584o = iArr3;
            this.f6583n = strArr;
        }
        int[] iArr4 = this.f6581l;
        int i3 = this.f6582m;
        this.f6582m = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: W */
    private char m11224W() {
        int i;
        int i2;
        if (this.f6573d != this.f6574e || m11232l(1)) {
            char[] cArr = this.f6572c;
            int i3 = this.f6573d;
            int i4 = i3 + 1;
            this.f6573d = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f6575f++;
                this.f6576g = i4;
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
                    throw m11231k0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f6574e || m11232l(4)) {
                    char c2 = 0;
                    int i5 = this.f6573d;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f6572c[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f6572c, this.f6573d, 4));
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
                    this.f6573d += 4;
                    return c2;
                } else {
                    throw m11231k0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m11231k0("Unterminated escape sequence");
    }

    /* renamed from: d */
    private void m11225d() {
        if (!this.f6571b) {
            throw m11231k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: d0 */
    private void m11226d0(char c) {
        char[] cArr = this.f6572c;
        while (true) {
            int i = this.f6573d;
            int i2 = this.f6574e;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f6573d = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f6573d = i3;
                        m11224W();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f6575f++;
                            this.f6576g = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f6573d = i;
                    if (!m11232l(1)) {
                        throw m11231k0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m11227f() {
        m11218E(true);
        int i = this.f6573d - 1;
        this.f6573d = i;
        char[] cArr = f6569p;
        if (i + cArr.length <= this.f6574e || m11232l(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f6569p;
                if (i2 >= cArr2.length) {
                    this.f6573d += cArr2.length;
                    return;
                } else if (this.f6572c[this.f6573d + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f0 */
    private boolean m11228f0(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f6573d + length > this.f6574e && !m11232l(length)) {
                return false;
            }
            char[] cArr = this.f6572c;
            int i2 = this.f6573d;
            if (cArr[i2] == 10) {
                this.f6575f++;
                this.f6576g = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f6572c[this.f6573d + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f6573d++;
        }
    }

    /* renamed from: g0 */
    private void m11229g0() {
        char c;
        do {
            if (this.f6573d < this.f6574e || m11232l(1)) {
                char[] cArr = this.f6572c;
                int i = this.f6573d;
                int i2 = i + 1;
                this.f6573d = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f6575f++;
                    this.f6576g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        m11225d();
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11230h0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f6573d
            int r2 = r1 + r0
            int r3 = r4.f6574e
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f6572c
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
            r4.m11225d()
        L_0x004b:
            int r1 = r4.f6573d
            int r1 = r1 + r0
            r4.f6573d = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f6573d = r1
            r0 = 1
            boolean r0 = r4.m11232l(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p122z1.C3929a.m11230h0():void");
    }

    /* renamed from: k0 */
    private IOException m11231k0(String str) {
        throw new MalformedJsonException(str + mo26427s());
    }

    /* renamed from: l */
    private boolean m11232l(int i) {
        int i2;
        int i3;
        char[] cArr = this.f6572c;
        int i4 = this.f6576g;
        int i5 = this.f6573d;
        this.f6576g = i4 - i5;
        int i6 = this.f6574e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f6574e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f6574e = 0;
        }
        this.f6573d = 0;
        do {
            Reader reader = this.f6570a;
            int i8 = this.f6574e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f6574e + read;
            this.f6574e = i2;
            if (this.f6575f == 0 && (i3 = this.f6576g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f6573d++;
                this.f6576g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: q */
    private boolean m11233q(char c) {
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
        m11225d();
        return false;
    }

    /* renamed from: A */
    public int mo26164A() {
        String H;
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 15) {
            long j = this.f6578i;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6577h = 0;
                int[] iArr = this.f6584o;
                int i3 = this.f6582m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f6578i + mo26427s());
        }
        if (i == 16) {
            this.f6580k = new String(this.f6572c, this.f6573d, this.f6579j);
            this.f6573d += this.f6579j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                H = m11220J();
            } else {
                H = m11219H(i == 8 ? '\'' : '\"');
            }
            this.f6580k = H;
            try {
                int parseInt = Integer.parseInt(this.f6580k);
                this.f6577h = 0;
                int[] iArr2 = this.f6584o;
                int i4 = this.f6582m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo26169N() + mo26427s());
        }
        this.f6577h = 11;
        double parseDouble = Double.parseDouble(this.f6580k);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f6580k = null;
            this.f6577h = 0;
            int[] iArr3 = this.f6584o;
            int i6 = this.f6582m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f6580k + mo26427s());
    }

    /* renamed from: B */
    public long mo26165B() {
        String H;
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 15) {
            this.f6577h = 0;
            int[] iArr = this.f6584o;
            int i2 = this.f6582m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f6578i;
        }
        if (i == 16) {
            this.f6580k = new String(this.f6572c, this.f6573d, this.f6579j);
            this.f6573d += this.f6579j;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                H = m11220J();
            } else {
                H = m11219H(i == 8 ? '\'' : '\"');
            }
            this.f6580k = H;
            try {
                long parseLong = Long.parseLong(this.f6580k);
                this.f6577h = 0;
                int[] iArr2 = this.f6584o;
                int i3 = this.f6582m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo26169N() + mo26427s());
        }
        this.f6577h = 11;
        double parseDouble = Double.parseDouble(this.f6580k);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f6580k = null;
            this.f6577h = 0;
            int[] iArr3 = this.f6584o;
            int i4 = this.f6582m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f6580k + mo26427s());
    }

    /* renamed from: D */
    public String mo26166D() {
        String str;
        char c;
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 14) {
            str = m11220J();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + mo26169N() + mo26427s());
            }
            str = m11219H(c);
        }
        this.f6577h = 0;
        this.f6583n[this.f6582m - 1] = str;
        return str;
    }

    /* renamed from: G */
    public void mo26167G() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 7) {
            this.f6577h = 0;
            int[] iArr = this.f6584o;
            int i2 = this.f6582m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo26169N() + mo26427s());
    }

    /* renamed from: I */
    public String mo26168I() {
        String str;
        char c;
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 10) {
            str = m11220J();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f6580k;
                this.f6580k = null;
            } else if (i == 15) {
                str = Long.toString(this.f6578i);
            } else if (i == 16) {
                str = new String(this.f6572c, this.f6573d, this.f6579j);
                this.f6573d += this.f6579j;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo26169N() + mo26427s());
            }
            str = m11219H(c);
        }
        this.f6577h = 0;
        int[] iArr = this.f6584o;
        int i2 = this.f6582m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: N */
    public JsonToken mo26169N() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo26170a() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 3) {
            m11223V(1);
            this.f6584o[this.f6582m - 1] = 0;
            this.f6577h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo26169N() + mo26427s());
    }

    /* renamed from: c */
    public void mo26171c() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 1) {
            m11223V(3);
            this.f6577h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo26169N() + mo26427s());
    }

    /* renamed from: c0 */
    public final void mo26424c0(boolean z) {
        this.f6571b = z;
    }

    public void close() {
        this.f6577h = 0;
        this.f6581l[0] = 8;
        this.f6582m = 1;
        this.f6570a.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo26425h() {
        /*
            r15 = this;
            int[] r0 = r15.f6581l
            int r1 = r15.f6582m
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.m11218E(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r6) goto L_0x002f
            r15.f6577h = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.m11231k0(r0)
            throw r0
        L_0x0036:
            r15.m11225d()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r7) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.m11218E(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.m11225d()
            int r0 = r15.f6573d
            int r1 = r15.f6574e
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.m11232l(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.f6572c
            int r1 = r15.f6573d
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.f6573d = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.m11231k0(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.f6571b
            if (r0 == 0) goto L_0x0080
            r15.m11227f()
        L_0x0080:
            int[] r0 = r15.f6581l
            int r1 = r15.f6582m
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.m11218E(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.f6577h = r0
            return r0
        L_0x0097:
            r15.m11225d()
            int r0 = r15.f6573d
            int r0 = r0 - r13
            r15.f6573d = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r3) goto L_0x010f
        L_0x00a2:
            int r0 = r15.m11218E(r13)
            if (r0 == r5) goto L_0x010c
            if (r0 == r4) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r6) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.f6573d
            int r0 = r0 - r13
            r15.f6573d = r0
            int r0 = r15.m11221P()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.m11222T()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.f6572c
            int r1 = r15.f6573d
            char r0 = r0[r1]
            boolean r0 = r15.m11233q(r0)
            if (r0 == 0) goto L_0x00dd
            r15.m11225d()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.m11231k0(r0)
            throw r0
        L_0x00e4:
            r15.f6577h = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.f6577h = r11
            return r11
        L_0x00ec:
            r15.f6577h = r7
            return r7
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.m11231k0(r0)
            throw r0
        L_0x00fb:
            r15.m11225d()
            int r0 = r15.f6573d
            int r0 = r0 - r13
            r15.f6573d = r0
            r15.f6577h = r8
            return r8
        L_0x0106:
            r15.m11225d()
            r15.f6577h = r3
            return r3
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.m11218E(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.f6577h = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.m11231k0(r0)
            throw r0
        L_0x0132:
            r15.m11225d()
        L_0x0135:
            int r1 = r15.m11218E(r13)
            if (r1 == r5) goto L_0x016a
            if (r1 == r4) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.m11225d()
            int r0 = r15.f6573d
            int r0 = r0 - r13
            r15.f6573d = r0
            char r0 = (char) r1
            boolean r0 = r15.m11233q(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.m11231k0(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.f6577h = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.m11231k0(r3)
            throw r0
        L_0x0163:
            r15.m11225d()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: p122z1.C3929a.mo26425h():int");
    }

    /* renamed from: i */
    public void mo26173i() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 4) {
            int i2 = this.f6582m - 1;
            this.f6582m = i2;
            int[] iArr = this.f6584o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6577h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo26169N() + mo26427s());
    }

    /* renamed from: j0 */
    public void mo26174j0() {
        char c;
        int i = 0;
        do {
            int i2 = this.f6577h;
            if (i2 == 0) {
                i2 = mo26425h();
            }
            if (i2 == 3) {
                m11223V(1);
            } else if (i2 == 1) {
                m11223V(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f6582m--;
                i--;
                this.f6577h = 0;
            } else if (i2 == 14 || i2 == 10) {
                m11230h0();
                this.f6577h = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = '\"';
                } else {
                    if (i2 == 16) {
                        this.f6573d += this.f6579j;
                    }
                    this.f6577h = 0;
                }
                m11226d0(c);
                this.f6577h = 0;
            }
            i++;
            this.f6577h = 0;
        } while (i != 0);
        int[] iArr = this.f6584o;
        int i3 = this.f6582m;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f6583n[i3 - 1] = "null";
    }

    /* renamed from: k */
    public void mo26175k() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 2) {
            int i2 = this.f6582m - 1;
            this.f6582m = i2;
            this.f6583n[i2] = null;
            int[] iArr = this.f6584o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6577h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo26169N() + mo26427s());
    }

    /* renamed from: m */
    public String mo26176m() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f6582m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f6581l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f6584o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String[] strArr = this.f6583n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public boolean mo26177n() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: p */
    public final boolean mo26426p() {
        return this.f6571b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo26427s() {
        return " at line " + (this.f6575f + 1) + " column " + ((this.f6573d - this.f6576g) + 1) + " path " + mo26176m();
    }

    public String toString() {
        return getClass().getSimpleName() + mo26427s();
    }

    /* renamed from: v */
    public boolean mo26180v() {
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 5) {
            this.f6577h = 0;
            int[] iArr = this.f6584o;
            int i2 = this.f6582m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6577h = 0;
            int[] iArr2 = this.f6584o;
            int i3 = this.f6582m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo26169N() + mo26427s());
        }
    }

    /* renamed from: z */
    public double mo26181z() {
        String str;
        int i = this.f6577h;
        if (i == 0) {
            i = mo26425h();
        }
        if (i == 15) {
            this.f6577h = 0;
            int[] iArr = this.f6584o;
            int i2 = this.f6582m - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6578i;
        }
        if (i == 16) {
            this.f6580k = new String(this.f6572c, this.f6573d, this.f6579j);
            this.f6573d += this.f6579j;
        } else {
            if (i == 8 || i == 9) {
                str = m11219H(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = m11220J();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo26169N() + mo26427s());
            }
            this.f6580k = str;
        }
        this.f6577h = 11;
        double parseDouble = Double.parseDouble(this.f6580k);
        if (this.f6571b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f6580k = null;
            this.f6577h = 0;
            int[] iArr2 = this.f6584o;
            int i3 = this.f6582m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + mo26427s());
    }
}
