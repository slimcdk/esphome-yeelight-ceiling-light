package p164h.p211a.p212a.p216c;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import p164h.p211a.p212a.p228h.C11129m;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.C11140t;
import p164h.p211a.p212a.p228h.C11144w;

/* renamed from: h.a.a.c.r */
public class C10918r {

    /* renamed from: o */
    private static final byte[] f21242o = new byte[0];

    /* renamed from: a */
    boolean f21243a = false;

    /* renamed from: b */
    byte[] f21244b = f21242o;

    /* renamed from: c */
    String f21245c;

    /* renamed from: d */
    int f21246d;

    /* renamed from: e */
    int f21247e;

    /* renamed from: f */
    int f21248f;

    /* renamed from: g */
    int f21249g;

    /* renamed from: h */
    int f21250h;

    /* renamed from: i */
    int f21251i;

    /* renamed from: j */
    int f21252j;

    /* renamed from: k */
    int f21253k;

    /* renamed from: l */
    int f21254l;

    /* renamed from: m */
    int f21255m;

    /* renamed from: n */
    final C11144w f21256n = new C11144w(64);

    public C10918r() {
    }

    public C10918r(String str) {
        this.f21245c = str;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo34538q(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public C10918r(URI uri) {
        mo34537p(uri.toASCIIString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r0.f21253k = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r10 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0125, code lost:
        r0.f21254l = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0047, code lost:
        if (r14 == '#') goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0169, code lost:
        r11 = r15;
        r10 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r14 != '?') goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0171, code lost:
        r11 = r15;
        r10 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0178, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018a, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r0.f21253k = r11;
        r10 = 9;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27538r(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r17
            r3 = r19
            r0.f21244b = r2
            int r2 = r1 + r3
            r0.f21255m = r2
            r0.f21246d = r1
            r0.f21247e = r1
            r0.f21248f = r1
            r0.f21249g = r1
            r4 = -1
            r0.f21250h = r4
            r0.f21251i = r1
            r0.f21252j = r2
            r0.f21253k = r2
            r0.f21254l = r2
            r10 = 0
            r11 = r1
            r12 = r11
        L_0x0024:
            if (r11 >= r2) goto L_0x018d
            byte[] r13 = r0.f21244b
            byte r14 = r13[r11]
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = (char) r14
            int r15 = r11 + 1
            r5 = 6
            r6 = 59
            r7 = 63
            r8 = 35
            r4 = 47
            r9 = 58
            switch(r10) {
                case 0: goto L_0x0154;
                case 1: goto L_0x0129;
                case 2: goto L_0x00cb;
                case 3: goto L_0x003d;
                case 4: goto L_0x00a8;
                case 5: goto L_0x007e;
                case 6: goto L_0x006e;
                case 7: goto L_0x0057;
                case 8: goto L_0x004b;
                case 9: goto L_0x0047;
                case 10: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x018a
        L_0x003f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "only '*'"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            if (r14 != r8) goto L_0x018a
            goto L_0x0125
        L_0x004b:
            if (r14 == r8) goto L_0x006a
            if (r14 == r7) goto L_0x0051
            goto L_0x018a
        L_0x0051:
            r0.f21253k = r11
            r10 = 9
            goto L_0x018a
        L_0x0057:
            if (r14 == r8) goto L_0x0068
            if (r14 == r6) goto L_0x0062
            if (r14 == r7) goto L_0x005f
            goto L_0x018a
        L_0x005f:
            r0.f21252j = r11
            goto L_0x0051
        L_0x0062:
            r0.f21252j = r11
            r10 = 8
            goto L_0x018a
        L_0x0068:
            r0.f21252j = r11
        L_0x006a:
            r0.f21253k = r11
            goto L_0x0125
        L_0x006e:
            if (r14 != r4) goto L_0x018a
            r0.f21251i = r11
            int r4 = r0.f21249g
            int r5 = r0.f21247e
            if (r4 > r5) goto L_0x007a
            r0.f21249g = r11
        L_0x007a:
            r12 = r11
        L_0x007b:
            r11 = r15
        L_0x007c:
            r10 = 7
            goto L_0x0024
        L_0x007e:
            if (r14 == r4) goto L_0x0089
            r4 = 93
            if (r14 == r4) goto L_0x0086
            goto L_0x018a
        L_0x0086:
            r10 = 4
            goto L_0x018a
        L_0x0089:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "No closing ']' for "
            r4.append(r5)
            byte[] r5 = r0.f21244b
            java.lang.String r6 = p164h.p211a.p212a.p228h.C11139s.f22070a
            java.lang.String r1 = p164h.p211a.p212a.p228h.C11137q.m28925h(r5, r1, r3, r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x00a8:
            if (r14 == r4) goto L_0x00c3
            if (r14 == r9) goto L_0x00be
            r4 = 64
            if (r14 == r4) goto L_0x00ba
            r4 = 91
            if (r14 == r4) goto L_0x00b6
            goto L_0x018a
        L_0x00b6:
            r4 = 5
            r10 = 5
            goto L_0x018a
        L_0x00ba:
            r0.f21248f = r15
            goto L_0x018a
        L_0x00be:
            r0.f21249g = r11
            r10 = 6
            goto L_0x018a
        L_0x00c3:
            r0.f21251i = r11
            r0.f21249g = r11
            r12 = r11
            r10 = 7
            goto L_0x018a
        L_0x00cb:
            if (r3 <= r5) goto L_0x00ef
            r5 = 116(0x74, float:1.63E-43)
            if (r14 != r5) goto L_0x00ef
            int r5 = r1 + 3
            byte r6 = r13[r5]
            if (r6 != r9) goto L_0x00dd
            int r15 = r1 + 4
        L_0x00d9:
            r11 = r5
            r14 = 58
            goto L_0x00ef
        L_0x00dd:
            int r5 = r1 + 4
            byte r6 = r13[r5]
            if (r6 != r9) goto L_0x00e6
            int r15 = r1 + 5
            goto L_0x00d9
        L_0x00e6:
            int r5 = r1 + 5
            byte r6 = r13[r5]
            if (r6 != r9) goto L_0x00ef
            int r15 = r1 + 6
            goto L_0x00d9
        L_0x00ef:
            if (r14 == r8) goto L_0x0121
            if (r14 == r4) goto L_0x007b
            if (r14 == r7) goto L_0x011c
            if (r14 == r9) goto L_0x0101
            r5 = 59
            if (r14 == r5) goto L_0x00fd
            goto L_0x018a
        L_0x00fd:
            r0.f21252j = r11
            goto L_0x0171
        L_0x0101:
            int r5 = r15 + 1
            r0.f21247e = r15
            r0.f21251i = r15
            byte[] r6 = r0.f21244b
            byte r6 = r6[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = (char) r6
            if (r6 != r4) goto L_0x0114
            r11 = r5
            r12 = r15
            goto L_0x0178
        L_0x0114:
            r0.f21248f = r15
            r0.f21249g = r15
            r11 = r5
            r12 = r15
            goto L_0x007c
        L_0x011c:
            r0.f21252j = r11
            r0.f21253k = r11
            goto L_0x0169
        L_0x0121:
            r0.f21252j = r11
            r0.f21253k = r11
        L_0x0125:
            r0.f21254l = r11
            goto L_0x018a
        L_0x0129:
            boolean r5 = r0.f21243a
            if (r5 != 0) goto L_0x0133
            int r5 = r0.f21246d
            int r6 = r0.f21247e
            if (r5 == r6) goto L_0x0141
        L_0x0133:
            if (r14 != r4) goto L_0x0141
            r0.f21248f = r15
            int r4 = r0.f21255m
            r0.f21249g = r4
            r0.f21251i = r4
            r11 = r15
            r10 = 4
            goto L_0x0024
        L_0x0141:
            r4 = 59
            if (r14 == r4) goto L_0x0150
            if (r14 == r7) goto L_0x0150
            if (r14 != r8) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            r0.f21248f = r12
            r0.f21249g = r12
            goto L_0x007b
        L_0x0150:
            int r11 = r15 + -1
            goto L_0x007c
        L_0x0154:
            if (r14 == r8) goto L_0x0183
            r5 = 42
            if (r14 == r5) goto L_0x017b
            if (r14 == r4) goto L_0x0176
            r4 = 59
            if (r14 == r4) goto L_0x016e
            if (r14 == r7) goto L_0x0164
            r10 = 2
            goto L_0x0189
        L_0x0164:
            r0.f21252j = r11
            r0.f21253k = r11
            r12 = r11
        L_0x0169:
            r11 = r15
            r10 = 9
            goto L_0x0024
        L_0x016e:
            r0.f21252j = r11
            r12 = r11
        L_0x0171:
            r11 = r15
            r10 = 8
            goto L_0x0024
        L_0x0176:
            r12 = r11
            r11 = r15
        L_0x0178:
            r10 = 1
            goto L_0x0024
        L_0x017b:
            r0.f21251i = r11
            r12 = r11
            r11 = r15
            r10 = 10
            goto L_0x0024
        L_0x0183:
            r0.f21252j = r11
            r0.f21253k = r11
            r0.f21254l = r11
        L_0x0189:
            r12 = r11
        L_0x018a:
            r11 = r15
            goto L_0x0024
        L_0x018d:
            int r1 = r0.f21249g
            int r2 = r0.f21251i
            if (r1 >= r2) goto L_0x01a2
            byte[] r3 = r0.f21244b
            int r4 = r1 + 1
            int r2 = r2 - r1
            r1 = 1
            int r2 = r2 - r1
            r1 = 10
            int r1 = p164h.p211a.p212a.p228h.C11138r.m28930d(r3, r4, r2, r1)
            r0.f21250h = r1
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10918r.m27538r(byte[], int, int):void");
    }

    /* renamed from: t */
    private String m27539t(int i, int i2) {
        this.f21256n.mo35444e();
        this.f21256n.mo35441b(this.f21244b, i, i2);
        return this.f21256n.toString();
    }

    /* renamed from: a */
    public void mo34534a() {
        this.f21255m = 0;
        this.f21254l = 0;
        this.f21253k = 0;
        this.f21252j = 0;
        this.f21251i = 0;
        this.f21249g = 0;
        this.f21248f = 0;
        this.f21247e = 0;
        this.f21246d = 0;
        this.f21244b = f21242o;
        this.f21245c = "";
    }

    /* renamed from: b */
    public void mo34419b(C11129m mVar) {
        if (this.f21253k != this.f21254l) {
            this.f21256n.mo35444e();
            byte[] bArr = this.f21244b;
            int i = this.f21253k;
            C11140t.m28952o(bArr, i + 1, (this.f21254l - i) - 1, mVar, this.f21256n);
        }
    }

    /* renamed from: c */
    public void mo34420c(C11129m mVar, String str) {
        if (this.f21253k != this.f21254l) {
            if (str == null || C11137q.m28921d(str)) {
                byte[] bArr = this.f21244b;
                int i = this.f21253k;
                C11140t.m28951m(bArr, i + 1, (this.f21254l - i) - 1, mVar);
                return;
            }
            byte[] bArr2 = this.f21244b;
            int i2 = this.f21253k;
            C11140t.m28947f(C11137q.m28925h(bArr2, i2 + 1, (this.f21254l - i2) - 1, str), mVar, str);
        }
    }

    /* renamed from: d */
    public String mo34421d() {
        int i = this.f21251i;
        int i2 = this.f21255m;
        if (i == i2) {
            return null;
        }
        return m27539t(i, i2 - i);
    }

    /* renamed from: e */
    public String mo34422e() {
        int i = this.f21251i;
        int i2 = this.f21252j;
        byte[] bArr = null;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            int i5 = this.f21252j;
            if (i < i5) {
                byte[] bArr2 = this.f21244b;
                byte b = bArr2[i];
                if (b == 37) {
                    int i6 = i + 2;
                    if (i6 < i5) {
                        int i7 = i6;
                        b = (byte) (C11138r.m28930d(bArr2, i + 1, 2, 16) & 255);
                        i = i7;
                    } else {
                        throw new IllegalArgumentException("Bad % encoding: " + this);
                    }
                } else if (bArr == null) {
                    i4++;
                    i++;
                }
                if (bArr == null) {
                    bArr = new byte[i3];
                    System.arraycopy(this.f21244b, this.f21251i, bArr, 0, i4);
                }
                bArr[i4] = b;
                i4++;
                i++;
            } else if (bArr == null) {
                return m27539t(this.f21251i, i3);
            } else {
                this.f21256n.mo35444e();
                this.f21256n.mo35441b(bArr, 0, i4);
                return this.f21256n.toString();
            }
        }
    }

    /* renamed from: f */
    public String mo34535f(String str) {
        int i = this.f21251i;
        int i2 = this.f21252j;
        byte[] bArr = null;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            int i5 = this.f21252j;
            if (i < i5) {
                byte[] bArr2 = this.f21244b;
                byte b = bArr2[i];
                if (b == 37) {
                    int i6 = i + 2;
                    if (i6 < i5) {
                        int i7 = i6;
                        b = (byte) (C11138r.m28930d(bArr2, i + 1, 2, 16) & 255);
                        i = i7;
                    } else {
                        throw new IllegalArgumentException("Bad % encoding: " + this);
                    }
                } else if (bArr == null) {
                    i4++;
                    i++;
                }
                if (bArr == null) {
                    bArr = new byte[i3];
                    System.arraycopy(this.f21244b, this.f21251i, bArr, 0, i4);
                }
                bArr[i4] = b;
                i4++;
                i++;
            } else if (bArr != null) {
                return C11137q.m28925h(bArr, 0, i4, str);
            } else {
                byte[] bArr3 = this.f21244b;
                int i8 = this.f21251i;
                return C11137q.m28925h(bArr3, i8, i5 - i8, str);
            }
        }
    }

    /* renamed from: g */
    public String mo34423g() {
        int i = this.f21254l;
        int i2 = this.f21255m;
        if (i == i2) {
            return null;
        }
        return m27539t(i + 1, (i2 - i) - 1);
    }

    /* renamed from: h */
    public String mo34424h() {
        int i = this.f21248f;
        int i2 = this.f21249g;
        if (i == i2) {
            return null;
        }
        return m27539t(i, i2 - i);
    }

    /* renamed from: i */
    public String mo34425i() {
        int i = this.f21251i;
        int i2 = this.f21252j;
        if (i == i2) {
            return null;
        }
        return m27539t(i, i2 - i);
    }

    /* renamed from: j */
    public String mo34426j() {
        int i = this.f21251i;
        int i2 = this.f21253k;
        if (i == i2) {
            return null;
        }
        return m27539t(i, i2 - i);
    }

    /* renamed from: k */
    public int mo34427k() {
        return this.f21250h;
    }

    /* renamed from: l */
    public String mo34428l() {
        int i = this.f21253k;
        int i2 = this.f21254l;
        if (i == i2) {
            return null;
        }
        return m27539t(i + 1, (i2 - i) - 1);
    }

    /* renamed from: m */
    public String mo34536m(String str) {
        int i = this.f21253k;
        int i2 = this.f21254l;
        if (i == i2) {
            return null;
        }
        return C11137q.m28925h(this.f21244b, i + 1, (i2 - i) - 1, str);
    }

    /* renamed from: n */
    public String mo34429n() {
        int i = this.f21246d;
        int i2 = this.f21247e;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this.f21244b;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this.f21244b;
            int i4 = this.f21246d;
            if (bArr2[i4] == 104 && bArr2[i4 + 1] == 116 && bArr2[i4 + 2] == 116 && bArr2[i4 + 3] == 112 && bArr2[i4 + 4] == 115) {
                return "https";
            }
        }
        int i5 = this.f21246d;
        return m27539t(i5, (this.f21247e - i5) - 1);
    }

    /* renamed from: o */
    public boolean mo34430o() {
        return this.f21254l > this.f21253k;
    }

    /* renamed from: p */
    public void mo34537p(String str) {
        byte[] bytes = str.getBytes();
        m27538r(bytes, 0, bytes.length);
        this.f21245c = str;
    }

    /* renamed from: q */
    public void mo34538q(byte[] bArr, int i, int i2) {
        this.f21245c = null;
        m27538r(bArr, i, i2);
    }

    /* renamed from: s */
    public void mo34539s(byte[] bArr, int i, int i2) {
        this.f21245c = null;
        this.f21244b = bArr;
        int i3 = i + i2;
        this.f21255m = i3;
        this.f21246d = i;
        this.f21247e = i;
        this.f21248f = i;
        this.f21249g = i3;
        this.f21250h = -1;
        this.f21251i = i3;
        this.f21252j = i3;
        this.f21253k = i3;
        this.f21254l = i3;
        int i4 = i;
        char c = 4;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            char c2 = (char) (this.f21244b[i4] & 255);
            int i5 = i4 + 1;
            if (c == 4) {
                if (c2 == ':') {
                    this.f21249g = i4;
                    break;
                } else if (c2 == '[') {
                    c = 5;
                }
            } else if (c != 5) {
                continue;
            } else if (c2 == '/') {
                throw new IllegalArgumentException("No closing ']' for " + C11137q.m28925h(this.f21244b, i, i2, C11139s.f22070a));
            } else if (c2 == ']') {
                c = 4;
            }
            i4 = i5;
        }
        int i6 = this.f21249g;
        int i7 = this.f21251i;
        if (i6 < i7) {
            this.f21250h = C11138r.m28930d(this.f21244b, i6 + 1, (i7 - i6) - 1, 10);
            this.f21251i = i;
            return;
        }
        throw new IllegalArgumentException("No port");
    }

    public String toString() {
        if (this.f21245c == null) {
            int i = this.f21246d;
            this.f21245c = m27539t(i, this.f21255m - i);
        }
        return this.f21245c;
    }
}
