package p133c3;

import javax.security.auth.x500.X500Principal;

/* renamed from: c3.a */
final class C4004a {

    /* renamed from: a */
    private final String f6757a;

    /* renamed from: b */
    private final int f6758b;

    /* renamed from: c */
    private int f6759c;

    /* renamed from: d */
    private int f6760d;

    /* renamed from: e */
    private int f6761e;

    /* renamed from: f */
    private int f6762f;

    /* renamed from: g */
    private char[] f6763g;

    public C4004a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f6757a = name;
        this.f6758b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r1 = r8.f6763g;
        r2 = r8.f6760d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        return new java.lang.String(r1, r2, r8.f6762f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m11623a() {
        /*
            r8 = this;
            int r0 = r8.f6759c
            r8.f6760d = r0
            r8.f6761e = r0
        L_0x0006:
            int r0 = r8.f6759c
            int r1 = r8.f6758b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f6763g
            int r2 = r8.f6760d
            int r3 = r8.f6761e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f6763g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005a
            if (r2 == r5) goto L_0x004f
            r5 = 92
            if (r2 == r5) goto L_0x003c
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x004f
            int r2 = r8.f6761e
            int r3 = r2 + 1
            r8.f6761e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L_0x004a
        L_0x003c:
            int r0 = r8.f6761e
            int r2 = r0 + 1
            r8.f6761e = r2
            char r2 = r8.m11625d()
            r1[r0] = r2
            int r0 = r8.f6759c
        L_0x004a:
            int r0 = r0 + 1
            r8.f6759c = r0
            goto L_0x0006
        L_0x004f:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f6760d
            int r3 = r8.f6761e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005a:
            int r2 = r8.f6761e
            r8.f6762f = r2
            int r0 = r0 + 1
            r8.f6759c = r0
            int r0 = r2 + 1
            r8.f6761e = r0
            r1[r2] = r6
        L_0x0068:
            int r0 = r8.f6759c
            int r1 = r8.f6758b
            if (r0 >= r1) goto L_0x0081
            char[] r2 = r8.f6763g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0081
            int r1 = r8.f6761e
            int r7 = r1 + 1
            r8.f6761e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f6759c = r0
            goto L_0x0068
        L_0x0081:
            if (r0 == r1) goto L_0x0091
            char[] r1 = r8.f6763g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0091
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0091
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0091:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f6763g
            int r2 = r8.f6760d
            int r3 = r8.f6762f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p133c3.C4004a.m11623a():java.lang.String");
    }

    /* renamed from: c */
    private int m11624c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f6758b) {
            char[] cArr = this.f6763g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f6757a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f6757a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f6757a);
    }

    /* renamed from: d */
    private char m11625d() {
        int i = this.f6759c + 1;
        this.f6759c = i;
        if (i != this.f6758b) {
            char[] cArr = this.f6763g;
            char c = cArr[i];
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
                                return m11626e();
                        }
                }
            }
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f6757a);
    }

    /* renamed from: e */
    private char m11626e() {
        int i;
        int i2;
        int c = m11624c(this.f6759c);
        this.f6759c++;
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
            int i4 = this.f6759c + 1;
            this.f6759c = i4;
            if (i4 == this.f6758b || this.f6763g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f6759c = i5;
            int c2 = m11624c(i5);
            this.f6759c++;
            if ((c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (c2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: f */
    private String m11627f() {
        int i = this.f6759c;
        if (i + 4 < this.f6758b) {
            this.f6760d = i;
            while (true) {
                this.f6759c = i + 1;
                i = this.f6759c;
                if (i == this.f6758b) {
                    break;
                }
                char[] cArr = this.f6763g;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.f6761e = i;
                    do {
                        this.f6759c = i + 1;
                        i = this.f6759c;
                        if (i >= this.f6758b) {
                            break;
                        }
                    } while (this.f6763g[i] != ' ');
                } else if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                    cArr[i] = (char) (cArr[i] + ' ');
                }
            }
            this.f6761e = i;
            int i2 = this.f6761e;
            int i3 = this.f6760d;
            int i4 = i2 - i3;
            if (i4 < 5 || (i4 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f6757a);
            }
            int i5 = i4 / 2;
            byte[] bArr = new byte[i5];
            int i6 = i3 + 1;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i7] = (byte) m11624c(i6);
                i6 += 2;
            }
            return new String(this.f6763g, this.f6760d, i4);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f6757a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m11628g() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.f6759c
            int r1 = r7.f6758b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f6763g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.f6759c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.f6760d = r0
        L_0x0019:
            int r0 = r0 + 1
            r7.f6759c = r0
            int r0 = r7.f6759c
            int r1 = r7.f6758b
            r3 = 61
            if (r0 >= r1) goto L_0x0030
            char[] r4 = r7.f6763g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0030
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0030
            goto L_0x0019
        L_0x0030:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00d1
            r7.f6761e = r0
            char[] r1 = r7.f6763g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0071
        L_0x003c:
            int r0 = r7.f6759c
            int r1 = r7.f6758b
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r7.f6763g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0051
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r7.f6759c = r0
            goto L_0x003c
        L_0x0051:
            char[] r5 = r7.f6763g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x0071
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f6757a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0071:
            int r0 = r7.f6759c
        L_0x0073:
            int r0 = r0 + 1
            r7.f6759c = r0
            int r0 = r7.f6759c
            int r1 = r7.f6758b
            if (r0 >= r1) goto L_0x0084
            char[] r1 = r7.f6763g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0084
            goto L_0x0073
        L_0x0084:
            int r0 = r7.f6761e
            int r1 = r7.f6760d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00c6
            char[] r2 = r7.f6763g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00c6
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x00a3
            char r4 = r2[r1]
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00c6
        L_0x00a3:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00b3
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00c6
        L_0x00b3:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00c3
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + r3
            r7.f6760d = r1
        L_0x00c6:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r7.f6763g
            int r3 = r7.f6760d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f6757a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x00e9
        L_0x00e8:
            throw r0
        L_0x00e9:
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: p133c3.C4004a.m11628g():java.lang.String");
    }

    /* renamed from: h */
    private String m11629h() {
        int i = this.f6759c + 1;
        this.f6759c = i;
        this.f6760d = i;
        while (true) {
            this.f6761e = i;
            int i2 = this.f6759c;
            if (i2 != this.f6758b) {
                char[] cArr = this.f6763g;
                if (cArr[i2] == '\"') {
                    do {
                        this.f6759c = i2 + 1;
                        i2 = this.f6759c;
                        if (i2 >= this.f6758b || this.f6763g[i2] != ' ') {
                            char[] cArr2 = this.f6763g;
                            int i3 = this.f6760d;
                        }
                        this.f6759c = i2 + 1;
                        i2 = this.f6759c;
                        break;
                    } while (this.f6763g[i2] != ' ');
                    char[] cArr22 = this.f6763g;
                    int i32 = this.f6760d;
                    return new String(cArr22, i32, this.f6761e - i32);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f6761e] = m11625d();
                } else {
                    cArr[this.f6761e] = cArr[i2];
                }
                this.f6759c++;
                i = this.f6761e + 1;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f6757a);
            }
        }
    }

    /* renamed from: b */
    public String mo26591b(String str) {
        this.f6759c = 0;
        this.f6760d = 0;
        this.f6761e = 0;
        this.f6762f = 0;
        this.f6763g = this.f6757a.toCharArray();
        String g = m11628g();
        if (g == null) {
            return null;
        }
        do {
            int i = this.f6759c;
            if (i == this.f6758b) {
                return null;
            }
            char c = this.f6763g[i];
            String a = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m11623a() : m11627f() : m11629h();
            if (str.equalsIgnoreCase(g)) {
                return a;
            }
            int i2 = this.f6759c;
            if (i2 >= this.f6758b) {
                return null;
            }
            char[] cArr = this.f6763g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f6759c = i2 + 1;
                g = m11628g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f6757a);
            }
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.f6757a);
    }
}
