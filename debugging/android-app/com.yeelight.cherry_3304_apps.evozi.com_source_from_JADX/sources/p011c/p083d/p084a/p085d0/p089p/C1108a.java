package p011c.p083d.p084a.p085d0.p089p;

import javax.security.auth.x500.X500Principal;

/* renamed from: c.d.a.d0.p.a */
final class C1108a {

    /* renamed from: a */
    private final String f1636a;

    /* renamed from: b */
    private final int f1637b;

    /* renamed from: c */
    private int f1638c;

    /* renamed from: d */
    private int f1639d;

    /* renamed from: e */
    private int f1640e;

    /* renamed from: f */
    private int f1641f;

    /* renamed from: g */
    private char[] f1642g;

    public C1108a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f1636a = name;
        this.f1637b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r1 = r8.f1642g;
        r2 = r8.f1639d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f1641f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m2593a() {
        /*
            r8 = this;
            int r0 = r8.f1638c
            r8.f1639d = r0
            r8.f1640e = r0
        L_0x0006:
            int r0 = r8.f1638c
            int r1 = r8.f1637b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f1642g
            int r2 = r8.f1639d
            int r3 = r8.f1640e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f1642g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x004f
            r5 = 92
            if (r2 == r5) goto L_0x003c
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x004f
            int r2 = r8.f1640e
            int r3 = r2 + 1
            r8.f1640e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L_0x004a
        L_0x003c:
            int r0 = r8.f1640e
            int r2 = r0 + 1
            r8.f1640e = r2
            char r2 = r8.m2595d()
            r1[r0] = r2
            int r0 = r8.f1638c
        L_0x004a:
            int r0 = r0 + 1
            r8.f1638c = r0
            goto L_0x0006
        L_0x004f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f1642g
            int r2 = r8.f1639d
            int r3 = r8.f1640e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005c:
            int r2 = r8.f1640e
            r8.f1641f = r2
            int r0 = r0 + 1
            r8.f1638c = r0
            int r0 = r2 + 1
            r8.f1640e = r0
            r1[r2] = r6
        L_0x006a:
            int r0 = r8.f1638c
            int r1 = r8.f1637b
            if (r0 >= r1) goto L_0x0083
            char[] r1 = r8.f1642g
            char r2 = r1[r0]
            if (r2 != r6) goto L_0x0083
            int r2 = r8.f1640e
            int r7 = r2 + 1
            r8.f1640e = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.f1638c = r0
            goto L_0x006a
        L_0x0083:
            int r0 = r8.f1638c
            int r1 = r8.f1637b
            if (r0 == r1) goto L_0x0097
            char[] r1 = r8.f1642g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0097
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0097
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0097:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f1642g
            int r2 = r8.f1639d
            int r3 = r8.f1641f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p089p.C1108a.m2593a():java.lang.String");
    }

    /* renamed from: c */
    private int m2594c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f1637b) {
            char c = this.f1642g[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f1636a);
            } else {
                i2 = c - '7';
            }
            char c2 = this.f1642g[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f1636a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f1636a);
    }

    /* renamed from: d */
    private char m2595d() {
        int i = this.f1638c + 1;
        this.f1638c = i;
        if (i != this.f1637b) {
            char c = this.f1642g[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m2596e();
                        }
                }
            }
            return this.f1642g[this.f1638c];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
    }

    /* renamed from: e */
    private char m2596e() {
        int i;
        int i2;
        int c = m2594c(this.f1638c);
        this.f1638c++;
        if (c < 128) {
            return (char) c;
        }
        if (c < 192 || c > 247) {
            return '?';
        }
        if (c <= 223) {
            i2 = c & 31;
            i = 1;
        } else if (c <= 239) {
            i = 2;
            i2 = c & 15;
        } else {
            i = 3;
            i2 = c & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f1638c + 1;
            this.f1638c = i4;
            if (i4 == this.f1637b || this.f1642g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f1638c = i5;
            int c2 = m2594c(i5);
            this.f1638c++;
            if ((c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (c2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: f */
    private String m2597f() {
        int i = this.f1638c;
        if (i + 4 < this.f1637b) {
            this.f1639d = i;
            while (true) {
                this.f1638c = i + 1;
                int i2 = this.f1638c;
                if (i2 == this.f1637b) {
                    break;
                }
                char[] cArr = this.f1642g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.f1640e = i2;
                    do {
                        this.f1638c = i2 + 1;
                        i2 = this.f1638c;
                        if (i2 >= this.f1637b) {
                            break;
                        }
                    } while (this.f1642g[i2] != ' ');
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    i = this.f1638c;
                }
            }
            this.f1640e = this.f1638c;
            int i3 = this.f1640e;
            int i4 = this.f1639d;
            int i5 = i3 - i4;
            if (i5 < 5 || (i5 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
            }
            int i6 = i5 / 2;
            byte[] bArr = new byte[i6];
            int i7 = i4 + 1;
            for (int i8 = 0; i8 < i6; i8++) {
                bArr[i8] = (byte) m2594c(i7);
                i7 += 2;
            }
            return new String(this.f1642g, this.f1639d, i5);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
    }

    /* renamed from: g */
    private String m2598g() {
        char[] cArr;
        while (true) {
            int i = this.f1638c;
            if (i >= this.f1637b || this.f1642g[i] != ' ') {
                int i2 = this.f1638c;
            } else {
                this.f1638c = i + 1;
            }
        }
        int i22 = this.f1638c;
        if (i22 == this.f1637b) {
            return null;
        }
        this.f1639d = i22;
        do {
            this.f1638c = i22 + 1;
            i22 = this.f1638c;
            if (i22 >= this.f1637b) {
                break;
            }
            cArr = this.f1642g;
            if (cArr[i22] == '=') {
                break;
            }
        } while (cArr[i22] == ' ');
        int i3 = this.f1638c;
        if (i3 < this.f1637b) {
            this.f1640e = i3;
            if (this.f1642g[i3] == ' ') {
                while (true) {
                    int i4 = this.f1638c;
                    if (i4 >= this.f1637b) {
                        break;
                    }
                    char[] cArr2 = this.f1642g;
                    if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                        break;
                    }
                    this.f1638c = i4 + 1;
                }
                char[] cArr3 = this.f1642g;
                int i5 = this.f1638c;
                if (cArr3[i5] != '=' || i5 == this.f1637b) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
                }
            }
            int i6 = this.f1638c;
            do {
                this.f1638c = i6 + 1;
                i6 = this.f1638c;
                if (i6 >= this.f1637b || this.f1642g[i6] != ' ') {
                    int i7 = this.f1640e;
                    int i8 = this.f1639d;
                }
                this.f1638c = i6 + 1;
                i6 = this.f1638c;
                break;
            } while (this.f1642g[i6] != ' ');
            int i72 = this.f1640e;
            int i82 = this.f1639d;
            if (i72 - i82 > 4) {
                char[] cArr4 = this.f1642g;
                if (cArr4[i82 + 3] == '.' && (cArr4[i82] == 'O' || cArr4[i82] == 'o')) {
                    char[] cArr5 = this.f1642g;
                    int i9 = this.f1639d;
                    if (cArr5[i9 + 1] == 'I' || cArr5[i9 + 1] == 'i') {
                        char[] cArr6 = this.f1642g;
                        int i10 = this.f1639d;
                        if (cArr6[i10 + 2] == 'D' || cArr6[i10 + 2] == 'd') {
                            this.f1639d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.f1642g;
            int i11 = this.f1639d;
            return new String(cArr7, i11, this.f1640e - i11);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
    }

    /* renamed from: h */
    private String m2599h() {
        int i = this.f1638c + 1;
        this.f1638c = i;
        this.f1639d = i;
        while (true) {
            this.f1640e = i;
            int i2 = this.f1638c;
            if (i2 != this.f1637b) {
                char[] cArr = this.f1642g;
                if (cArr[i2] == '\"') {
                    do {
                        this.f1638c = i2 + 1;
                        i2 = this.f1638c;
                        if (i2 >= this.f1637b || this.f1642g[i2] != ' ') {
                            char[] cArr2 = this.f1642g;
                            int i3 = this.f1639d;
                        }
                        this.f1638c = i2 + 1;
                        i2 = this.f1638c;
                        break;
                    } while (this.f1642g[i2] != ' ');
                    char[] cArr22 = this.f1642g;
                    int i32 = this.f1639d;
                    return new String(cArr22, i32, this.f1640e - i32);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f1640e] = m2595d();
                } else {
                    cArr[this.f1640e] = cArr[i2];
                }
                this.f1638c++;
                i = this.f1640e + 1;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f1636a);
            }
        }
    }

    /* renamed from: b */
    public String mo9666b(String str) {
        this.f1638c = 0;
        this.f1639d = 0;
        this.f1640e = 0;
        this.f1641f = 0;
        this.f1642g = this.f1636a.toCharArray();
        String g = m2598g();
        if (g == null) {
            return null;
        }
        do {
            int i = this.f1638c;
            if (i == this.f1637b) {
                return null;
            }
            char c = this.f1642g[i];
            String a = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m2593a() : m2597f() : m2599h();
            if (str.equalsIgnoreCase(g)) {
                return a;
            }
            int i2 = this.f1638c;
            if (i2 >= this.f1637b) {
                return null;
            }
            char[] cArr = this.f1642g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f1638c++;
                g = m2598g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f1636a);
            }
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.f1636a);
    }
}
