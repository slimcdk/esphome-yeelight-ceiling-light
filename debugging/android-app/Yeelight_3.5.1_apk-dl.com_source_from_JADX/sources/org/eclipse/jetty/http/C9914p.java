package org.eclipse.jetty.http;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.C9999r;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;

/* renamed from: org.eclipse.jetty.http.p */
public class C9914p {

    /* renamed from: o */
    private static final byte[] f18125o = new byte[0];

    /* renamed from: a */
    boolean f18126a = false;

    /* renamed from: b */
    byte[] f18127b = f18125o;

    /* renamed from: c */
    String f18128c;

    /* renamed from: d */
    int f18129d;

    /* renamed from: e */
    int f18130e;

    /* renamed from: f */
    int f18131f;

    /* renamed from: g */
    int f18132g;

    /* renamed from: h */
    int f18133h;

    /* renamed from: i */
    int f18134i;

    /* renamed from: j */
    int f18135j;

    /* renamed from: k */
    int f18136k;

    /* renamed from: l */
    int f18137l;

    /* renamed from: m */
    int f18138m;

    /* renamed from: n */
    final C9999r f18139n = new C9999r(64);

    public C9914p() {
    }

    public C9914p(String str) {
        this.f18128c = str;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo39858q(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public C9914p(URI uri) {
        mo39857p(uri.toASCIIString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r0.f18136k = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r10 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0123, code lost:
        r0.f18137l = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0047, code lost:
        if (r14 == '#') goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0167, code lost:
        r11 = r15;
        r10 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r14 != '?') goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016f, code lost:
        r11 = r15;
        r10 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0176, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0188, code lost:
        r11 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r0.f18136k = r11;
        r10 = 9;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24261r(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r17
            r3 = r19
            r0.f18127b = r2
            int r2 = r1 + r3
            r0.f18138m = r2
            r0.f18129d = r1
            r0.f18130e = r1
            r0.f18131f = r1
            r0.f18132g = r1
            r4 = -1
            r0.f18133h = r4
            r0.f18134i = r1
            r0.f18135j = r2
            r0.f18136k = r2
            r0.f18137l = r2
            r10 = 0
            r11 = r1
            r12 = r11
        L_0x0024:
            if (r11 >= r2) goto L_0x018b
            byte[] r13 = r0.f18127b
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
                case 0: goto L_0x0152;
                case 1: goto L_0x0127;
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
            goto L_0x0188
        L_0x003f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "only '*'"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            if (r14 != r8) goto L_0x0188
            goto L_0x0123
        L_0x004b:
            if (r14 == r8) goto L_0x006a
            if (r14 == r7) goto L_0x0051
            goto L_0x0188
        L_0x0051:
            r0.f18136k = r11
            r10 = 9
            goto L_0x0188
        L_0x0057:
            if (r14 == r8) goto L_0x0068
            if (r14 == r6) goto L_0x0062
            if (r14 == r7) goto L_0x005f
            goto L_0x0188
        L_0x005f:
            r0.f18135j = r11
            goto L_0x0051
        L_0x0062:
            r0.f18135j = r11
            r10 = 8
            goto L_0x0188
        L_0x0068:
            r0.f18135j = r11
        L_0x006a:
            r0.f18136k = r11
            goto L_0x0123
        L_0x006e:
            if (r14 != r4) goto L_0x0188
            r0.f18134i = r11
            int r4 = r0.f18132g
            int r5 = r0.f18130e
            if (r4 > r5) goto L_0x007a
            r0.f18132g = r11
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
            goto L_0x0188
        L_0x0086:
            r10 = 4
            goto L_0x0188
        L_0x0089:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "No closing ']' for "
            r4.append(r5)
            byte[] r5 = r0.f18127b
            java.lang.String r6 = org.eclipse.jetty.util.C9997p.f18441a
            java.lang.String r1 = org.eclipse.jetty.util.C9995n.m24712h(r5, r1, r3, r6)
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
            goto L_0x0188
        L_0x00b6:
            r4 = 5
            r10 = 5
            goto L_0x0188
        L_0x00ba:
            r0.f18131f = r15
            goto L_0x0188
        L_0x00be:
            r0.f18132g = r11
            r10 = 6
            goto L_0x0188
        L_0x00c3:
            r0.f18134i = r11
            r0.f18132g = r11
            r12 = r11
            r10 = 7
            goto L_0x0188
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
            if (r14 == r8) goto L_0x011f
            if (r14 == r4) goto L_0x007b
            if (r14 == r7) goto L_0x011a
            if (r14 == r9) goto L_0x0101
            r5 = 59
            if (r14 == r5) goto L_0x00fd
            goto L_0x0188
        L_0x00fd:
            r0.f18135j = r11
            goto L_0x016f
        L_0x0101:
            int r5 = r15 + 1
            r0.f18130e = r15
            r0.f18134i = r15
            byte r6 = r13[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = (char) r6
            if (r6 != r4) goto L_0x0112
            r11 = r5
            r12 = r15
            goto L_0x0176
        L_0x0112:
            r0.f18131f = r15
            r0.f18132g = r15
            r11 = r5
            r12 = r15
            goto L_0x007c
        L_0x011a:
            r0.f18135j = r11
            r0.f18136k = r11
            goto L_0x0167
        L_0x011f:
            r0.f18135j = r11
            r0.f18136k = r11
        L_0x0123:
            r0.f18137l = r11
            goto L_0x0188
        L_0x0127:
            boolean r5 = r0.f18126a
            if (r5 != 0) goto L_0x0131
            int r5 = r0.f18129d
            int r6 = r0.f18130e
            if (r5 == r6) goto L_0x013f
        L_0x0131:
            if (r14 != r4) goto L_0x013f
            r0.f18131f = r15
            int r4 = r0.f18138m
            r0.f18132g = r4
            r0.f18134i = r4
            r11 = r15
            r10 = 4
            goto L_0x0024
        L_0x013f:
            r4 = 59
            if (r14 == r4) goto L_0x014e
            if (r14 == r7) goto L_0x014e
            if (r14 != r8) goto L_0x0148
            goto L_0x014e
        L_0x0148:
            r0.f18131f = r12
            r0.f18132g = r12
            goto L_0x007b
        L_0x014e:
            int r11 = r15 + -1
            goto L_0x007c
        L_0x0152:
            if (r14 == r8) goto L_0x0181
            r5 = 42
            if (r14 == r5) goto L_0x0179
            if (r14 == r4) goto L_0x0174
            r4 = 59
            if (r14 == r4) goto L_0x016c
            if (r14 == r7) goto L_0x0162
            r10 = 2
            goto L_0x0187
        L_0x0162:
            r0.f18135j = r11
            r0.f18136k = r11
            r12 = r11
        L_0x0167:
            r11 = r15
            r10 = 9
            goto L_0x0024
        L_0x016c:
            r0.f18135j = r11
            r12 = r11
        L_0x016f:
            r11 = r15
            r10 = 8
            goto L_0x0024
        L_0x0174:
            r12 = r11
            r11 = r15
        L_0x0176:
            r10 = 1
            goto L_0x0024
        L_0x0179:
            r0.f18134i = r11
            r12 = r11
            r11 = r15
            r10 = 10
            goto L_0x0024
        L_0x0181:
            r0.f18135j = r11
            r0.f18136k = r11
            r0.f18137l = r11
        L_0x0187:
            r12 = r11
        L_0x0188:
            r11 = r15
            goto L_0x0024
        L_0x018b:
            int r1 = r0.f18132g
            int r2 = r0.f18134i
            if (r1 >= r2) goto L_0x01a0
            byte[] r3 = r0.f18127b
            int r4 = r1 + 1
            int r2 = r2 - r1
            r1 = 1
            int r2 = r2 - r1
            r1 = 10
            int r1 = org.eclipse.jetty.util.C9996o.m24718e(r3, r4, r2, r1)
            r0.f18133h = r1
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9914p.m24261r(byte[], int, int):void");
    }

    /* renamed from: t */
    private String m24262t(int i, int i2) {
        this.f18139n.mo40205e();
        this.f18139n.mo40202b(this.f18127b, i, i2);
        return this.f18139n.toString();
    }

    /* renamed from: a */
    public void mo39854a() {
        this.f18138m = 0;
        this.f18137l = 0;
        this.f18136k = 0;
        this.f18135j = 0;
        this.f18134i = 0;
        this.f18132g = 0;
        this.f18131f = 0;
        this.f18130e = 0;
        this.f18129d = 0;
        this.f18127b = f18125o;
        this.f18128c = "";
    }

    /* renamed from: b */
    public void mo39740b(MultiMap multiMap) {
        if (this.f18136k != this.f18137l) {
            this.f18139n.mo40205e();
            byte[] bArr = this.f18127b;
            int i = this.f18136k;
            UrlEncoded.decodeUtf8To(bArr, i + 1, (this.f18137l - i) - 1, multiMap, this.f18139n);
        }
    }

    /* renamed from: c */
    public void mo39741c(MultiMap multiMap, String str) {
        if (this.f18136k != this.f18137l) {
            if (str == null || C9995n.m24708d(str)) {
                byte[] bArr = this.f18127b;
                int i = this.f18136k;
                UrlEncoded.decodeUtf8To(bArr, i + 1, (this.f18137l - i) - 1, multiMap);
                return;
            }
            byte[] bArr2 = this.f18127b;
            int i2 = this.f18136k;
            UrlEncoded.decodeTo(C9995n.m24712h(bArr2, i2 + 1, (this.f18137l - i2) - 1, str), multiMap, str);
        }
    }

    /* renamed from: d */
    public String mo39742d() {
        int i = this.f18134i;
        int i2 = this.f18138m;
        if (i == i2) {
            return null;
        }
        return m24262t(i, i2 - i);
    }

    /* renamed from: e */
    public String mo39743e() {
        int i = this.f18134i;
        int i2 = this.f18135j;
        byte[] bArr = null;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            int i5 = this.f18135j;
            if (i < i5) {
                byte[] bArr2 = this.f18127b;
                byte b = bArr2[i];
                if (b == 37) {
                    int i6 = i + 2;
                    if (i6 < i5) {
                        int i7 = i6;
                        b = (byte) (C9996o.m24718e(bArr2, i + 1, 2, 16) & 255);
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
                    System.arraycopy(this.f18127b, this.f18134i, bArr, 0, i4);
                }
                bArr[i4] = b;
                i4++;
                i++;
            } else if (bArr == null) {
                return m24262t(this.f18134i, i3);
            } else {
                this.f18139n.mo40205e();
                this.f18139n.mo40202b(bArr, 0, i4);
                return this.f18139n.toString();
            }
        }
    }

    /* renamed from: f */
    public String mo39855f(String str) {
        int i = this.f18134i;
        int i2 = this.f18135j;
        byte[] bArr = null;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            int i5 = this.f18135j;
            if (i < i5) {
                byte[] bArr2 = this.f18127b;
                byte b = bArr2[i];
                if (b == 37) {
                    int i6 = i + 2;
                    if (i6 < i5) {
                        int i7 = i6;
                        b = (byte) (C9996o.m24718e(bArr2, i + 1, 2, 16) & 255);
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
                    System.arraycopy(this.f18127b, this.f18134i, bArr, 0, i4);
                }
                bArr[i4] = b;
                i4++;
                i++;
            } else if (bArr != null) {
                return C9995n.m24712h(bArr, 0, i4, str);
            } else {
                byte[] bArr3 = this.f18127b;
                int i8 = this.f18134i;
                return C9995n.m24712h(bArr3, i8, i5 - i8, str);
            }
        }
    }

    /* renamed from: g */
    public String mo39744g() {
        int i = this.f18137l;
        int i2 = this.f18138m;
        if (i == i2) {
            return null;
        }
        return m24262t(i + 1, (i2 - i) - 1);
    }

    /* renamed from: h */
    public String mo39745h() {
        int i = this.f18131f;
        int i2 = this.f18132g;
        if (i == i2) {
            return null;
        }
        return m24262t(i, i2 - i);
    }

    /* renamed from: i */
    public String mo39746i() {
        int i = this.f18134i;
        int i2 = this.f18135j;
        if (i == i2) {
            return null;
        }
        return m24262t(i, i2 - i);
    }

    /* renamed from: j */
    public String mo39747j() {
        int i = this.f18134i;
        int i2 = this.f18136k;
        if (i == i2) {
            return null;
        }
        return m24262t(i, i2 - i);
    }

    /* renamed from: k */
    public int mo39748k() {
        return this.f18133h;
    }

    /* renamed from: l */
    public String mo39749l() {
        int i = this.f18136k;
        int i2 = this.f18137l;
        if (i == i2) {
            return null;
        }
        return m24262t(i + 1, (i2 - i) - 1);
    }

    /* renamed from: m */
    public String mo39856m(String str) {
        int i = this.f18136k;
        int i2 = this.f18137l;
        if (i == i2) {
            return null;
        }
        return C9995n.m24712h(this.f18127b, i + 1, (i2 - i) - 1, str);
    }

    /* renamed from: n */
    public String mo39750n() {
        int i = this.f18129d;
        int i2 = this.f18130e;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this.f18127b;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this.f18127b;
            if (bArr2[i] == 104 && bArr2[i + 1] == 116 && bArr2[i + 2] == 116 && bArr2[i + 3] == 112 && bArr2[i + 4] == 115) {
                return "https";
            }
        }
        return m24262t(i, (i2 - i) - 1);
    }

    /* renamed from: o */
    public boolean mo39751o() {
        return this.f18137l > this.f18136k;
    }

    /* renamed from: p */
    public void mo39857p(String str) {
        byte[] bytes = str.getBytes();
        m24261r(bytes, 0, bytes.length);
        this.f18128c = str;
    }

    /* renamed from: q */
    public void mo39858q(byte[] bArr, int i, int i2) {
        this.f18128c = null;
        m24261r(bArr, i, i2);
    }

    /* renamed from: s */
    public void mo39859s(byte[] bArr, int i, int i2) {
        this.f18128c = null;
        this.f18127b = bArr;
        int i3 = i + i2;
        this.f18138m = i3;
        this.f18129d = i;
        this.f18130e = i;
        this.f18131f = i;
        this.f18132g = i3;
        this.f18133h = -1;
        this.f18134i = i3;
        this.f18135j = i3;
        this.f18136k = i3;
        this.f18137l = i3;
        int i4 = i;
        char c = 4;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            char c2 = (char) (this.f18127b[i4] & 255);
            int i5 = i4 + 1;
            if (c == 4) {
                if (c2 == ':') {
                    this.f18132g = i4;
                    break;
                } else if (c2 == '[') {
                    c = 5;
                }
            } else if (c != 5) {
                continue;
            } else if (c2 == '/') {
                throw new IllegalArgumentException("No closing ']' for " + C9995n.m24712h(this.f18127b, i, i2, C9997p.f18441a));
            } else if (c2 == ']') {
                c = 4;
            }
            i4 = i5;
        }
        int i6 = this.f18132g;
        int i7 = this.f18134i;
        if (i6 < i7) {
            this.f18133h = C9996o.m24718e(this.f18127b, i6 + 1, (i7 - i6) - 1, 10);
            this.f18134i = i;
            return;
        }
        throw new IllegalArgumentException("No port");
    }

    public String toString() {
        if (this.f18128c == null) {
            int i = this.f18129d;
            this.f18128c = m24262t(i, this.f18138m - i);
        }
        return this.f18128c;
    }
}
