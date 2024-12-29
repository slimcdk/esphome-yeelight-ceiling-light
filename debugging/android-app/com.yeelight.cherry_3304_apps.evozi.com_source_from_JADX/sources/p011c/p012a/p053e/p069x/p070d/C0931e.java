package p011c.p012a.p053e.p069x.p070d;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p069x.C0926c;

/* renamed from: c.a.e.x.d.e */
final class C0931e {

    /* renamed from: a */
    private static final char[] f1047a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f1048b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final Charset f1049c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final BigInteger[] f1050d;

    /* renamed from: c.a.e.x.d.e$a */
    static /* synthetic */ class C0932a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1051a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.a.e.x.d.e$b[] r0 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1051a = r0
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1051a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1051a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1051a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1051a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1051a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p069x.p070d.C0931e.C0932a.<clinit>():void");
        }
    }

    /* renamed from: c.a.e.x.d.e$b */
    private enum C0933b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f1050d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f1050d[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f1050d;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m1599a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 922;
        int i8 = 923;
        int i9 = 928;
        int i10 = 902;
        long j2 = 900;
        if (i6 == 901) {
            int[] iArr2 = new int[6];
            int i11 = i2 + 1;
            int i12 = iArr[i2];
            boolean z = false;
            loop0:
            while (true) {
                i4 = 0;
                long j3 = 0;
                while (i3 < iArr[0] && !z) {
                    int i13 = i4 + 1;
                    iArr2[i4] = i12;
                    j3 = (j3 * j) + ((long) i12);
                    int i14 = i3 + 1;
                    i12 = iArr[i3];
                    if (i12 == 900 || i12 == 901 || i12 == 902 || i12 == 924 || i12 == 928 || i12 == i8 || i12 == i7) {
                        i3 = i14 - 1;
                        i4 = i13;
                        i7 = 922;
                        i8 = 923;
                        j = 900;
                        z = true;
                    } else if (i13 % 5 != 0 || i13 <= 0) {
                        i3 = i14;
                        i4 = i13;
                        i7 = 922;
                        i8 = 923;
                        j = 900;
                    } else {
                        int i15 = 0;
                        while (i15 < 6) {
                            byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i15) * 8))));
                            i15++;
                            i7 = 922;
                            i8 = 923;
                        }
                        i11 = i14;
                        j2 = 900;
                    }
                }
            }
            if (i3 != iArr[0] || i12 >= 900) {
                i5 = i4;
            } else {
                i5 = i4 + 1;
                iArr2[i4] = i12;
            }
            for (int i16 = 0; i16 < i5; i16++) {
                byteArrayOutputStream.write((byte) iArr2[i16]);
            }
        } else if (i6 == 924) {
            int i17 = i2;
            boolean z2 = false;
            int i18 = 0;
            long j4 = 0;
            while (i17 < iArr[0] && !z2) {
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                if (i20 < 900) {
                    i18++;
                    j4 = (j4 * 900) + ((long) i20);
                    i17 = i19;
                } else {
                    if (i20 != 900 && i20 != 901 && i20 != i10 && i20 != 924 && i20 != i9) {
                        if (!(i20 == 923 || i20 == 922)) {
                            i17 = i19;
                        }
                    }
                    i17 = i19 - 1;
                    z2 = true;
                }
                if (i18 % 5 == 0 && i18 > 0) {
                    for (int i21 = 0; i21 < 6; i21++) {
                        byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i21) * 8))));
                    }
                    i18 = 0;
                    j4 = 0;
                }
                i9 = 928;
                i10 = 902;
            }
            i3 = i17;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = m1599a(r2, r6, r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r2 = m1605g(r6, r4, r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p011c.p012a.p053e.p057t.C0843e m1600b(int[] r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = f1049c
            r2 = r6[r2]
            c.a.e.x.c r3 = new c.a.e.x.c
            r3.<init>()
            r4 = 2
        L_0x0012:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L_0x0069
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L_0x0054
            switch(r2) {
                case 900: goto L_0x004f;
                case 901: goto L_0x004a;
                case 902: goto L_0x0045;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r2) {
                case 922: goto L_0x0040;
                case 923: goto L_0x0040;
                case 924: goto L_0x004a;
                case 925: goto L_0x003d;
                case 926: goto L_0x003a;
                case 927: goto L_0x0029;
                case 928: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r4 = r4 + -1
            goto L_0x004f
        L_0x0024:
            int r2 = m1602d(r6, r4, r3)
            goto L_0x005c
        L_0x0029:
            int r2 = r4 + 1
            r1 = r6[r4]
            c.a.e.t.d r1 = p011c.p012a.p053e.p057t.C0842d.m1220b(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x005c
        L_0x003a:
            int r2 = r4 + 2
            goto L_0x005c
        L_0x003d:
            int r2 = r4 + 1
            goto L_0x005c
        L_0x0040:
            c.a.e.g r6 = p011c.p012a.p053e.C0820g.m1114a()
            throw r6
        L_0x0045:
            int r2 = m1604f(r6, r4, r0)
            goto L_0x005c
        L_0x004a:
            int r2 = m1599a(r2, r6, r1, r4, r0)
            goto L_0x005c
        L_0x004f:
            int r2 = m1605g(r6, r4, r0)
            goto L_0x005c
        L_0x0054:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L_0x005c:
            int r4 = r6.length
            if (r2 >= r4) goto L_0x0064
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L_0x0012
        L_0x0064:
            c.a.e.g r6 = p011c.p012a.p053e.C0820g.m1114a()
            throw r6
        L_0x0069:
            int r6 = r0.length()
            if (r6 == 0) goto L_0x007d
            c.a.e.t.e r6 = new c.a.e.t.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.mo9091m(r3)
            return r6
        L_0x007d:
            c.a.e.g r6 = p011c.p012a.p053e.C0820g.m1114a()
            goto L_0x0083
        L_0x0082:
            throw r6
        L_0x0083:
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p069x.p070d.C0931e.m1600b(int[], java.lang.String):c.a.e.t.e");
    }

    /* renamed from: c */
    private static String m1601c(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f1050d[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C0820g.m1114a();
    }

    /* renamed from: d */
    private static int m1602d(int[] iArr, int i, C0926c cVar) {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            cVar.mo9228d(Integer.parseInt(m1601c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = m1605g(iArr, i, sb);
            cVar.mo9225a(sb.toString());
            if (iArr[g] == 923) {
                int i3 = g + 1;
                int[] iArr3 = new int[(iArr[0] - i3)];
                boolean z = false;
                int i4 = 0;
                while (i3 < iArr[0] && !z) {
                    int i5 = i3 + 1;
                    int i6 = iArr[i3];
                    if (i6 < 900) {
                        iArr3[i4] = i6;
                        i3 = i5;
                        i4++;
                    } else if (i6 == 922) {
                        cVar.mo9226b(true);
                        i3 = i5 + 1;
                        z = true;
                    } else {
                        throw C0820g.m1114a();
                    }
                }
                cVar.mo9227c(Arrays.copyOf(iArr3, i4));
                return i3;
            } else if (iArr[g] != 922) {
                return g;
            } else {
                cVar.mo9226b(true);
                return g + 1;
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.f1052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r0.append((char) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r10 = 0;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ab, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        r10 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.f1053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.f1054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c3, code lost:
        r3 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.f1057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ce, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        if (r10 == 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d1, code lost:
        r0.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r6 == 900) goto L_0x0059;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1603e(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.ALPHA
            r2 = 0
            r4 = r18
            r3 = r1
            r5 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x00d8
            r6 = r16[r5]
            int[] r7 = p011c.p012a.p053e.p069x.p070d.C0931e.C0932a.f1051a
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00ae;
                case 2: goto L_0x008f;
                case 3: goto L_0x006a;
                case 4: goto L_0x004f;
                case 5: goto L_0x003e;
                case 6: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00ce
        L_0x0028:
            if (r6 >= r13) goto L_0x002f
            char[] r1 = f1047a
            char r10 = r1[r6]
            goto L_0x0043
        L_0x002f:
            if (r6 != r13) goto L_0x0032
            goto L_0x0059
        L_0x0032:
            if (r6 != r11) goto L_0x003b
            r1 = r17[r5]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x004c
        L_0x003b:
            if (r6 != r12) goto L_0x004c
            goto L_0x0059
        L_0x003e:
            if (r6 >= r14) goto L_0x0046
            int r6 = r6 + 65
            char r10 = (char) r6
        L_0x0043:
            r1 = r3
            goto L_0x00cf
        L_0x0046:
            if (r6 != r14) goto L_0x0049
            goto L_0x0043
        L_0x0049:
            if (r6 != r12) goto L_0x004c
            goto L_0x0059
        L_0x004c:
            r1 = r3
            goto L_0x00ce
        L_0x004f:
            if (r6 >= r13) goto L_0x0057
            char[] r7 = f1047a
            char r10 = r7[r6]
            goto L_0x00cf
        L_0x0057:
            if (r6 != r13) goto L_0x005d
        L_0x0059:
            c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.ALPHA
            goto L_0x00ce
        L_0x005d:
            if (r6 != r11) goto L_0x0067
            r6 = r17[r5]
        L_0x0061:
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00ce
        L_0x0067:
            if (r6 != r12) goto L_0x00ce
            goto L_0x0059
        L_0x006a:
            r7 = 25
            if (r6 >= r7) goto L_0x0074
            char[] r7 = f1048b
            char r10 = r7[r6]
            goto L_0x00cf
        L_0x0074:
            if (r6 != r7) goto L_0x007a
            c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.PUNCT
            goto L_0x00ce
        L_0x007a:
            if (r6 != r14) goto L_0x007e
            goto L_0x00cf
        L_0x007e:
            if (r6 != r9) goto L_0x0081
            goto L_0x00b9
        L_0x0081:
            if (r6 != r8) goto L_0x0084
            goto L_0x0059
        L_0x0084:
            if (r6 != r13) goto L_0x0087
            goto L_0x00c3
        L_0x0087:
            if (r6 != r11) goto L_0x008c
            r6 = r17[r5]
            goto L_0x0061
        L_0x008c:
            if (r6 != r12) goto L_0x00ce
            goto L_0x0059
        L_0x008f:
            if (r6 >= r14) goto L_0x0094
            int r6 = r6 + 97
            goto L_0x00b2
        L_0x0094:
            if (r6 != r14) goto L_0x0097
            goto L_0x00cf
        L_0x0097:
            if (r6 != r9) goto L_0x00a0
            c.a.e.x.d.e$b r3 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.ALPHA_SHIFT
        L_0x009b:
            r10 = 0
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x00cf
        L_0x00a0:
            if (r6 != r8) goto L_0x00a3
            goto L_0x00be
        L_0x00a3:
            if (r6 != r13) goto L_0x00a6
            goto L_0x00c3
        L_0x00a6:
            if (r6 != r11) goto L_0x00ab
            r6 = r17[r5]
            goto L_0x0061
        L_0x00ab:
            if (r6 != r12) goto L_0x00ce
            goto L_0x0059
        L_0x00ae:
            if (r6 >= r14) goto L_0x00b4
            int r6 = r6 + 65
        L_0x00b2:
            char r10 = (char) r6
            goto L_0x00cf
        L_0x00b4:
            if (r6 != r14) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            if (r6 != r9) goto L_0x00bc
        L_0x00b9:
            c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.LOWER
            goto L_0x00ce
        L_0x00bc:
            if (r6 != r8) goto L_0x00c1
        L_0x00be:
            c.a.e.x.d.e$b r1 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.MIXED
            goto L_0x00ce
        L_0x00c1:
            if (r6 != r13) goto L_0x00c6
        L_0x00c3:
            c.a.e.x.d.e$b r3 = p011c.p012a.p053e.p069x.p070d.C0931e.C0933b.PUNCT_SHIFT
            goto L_0x009b
        L_0x00c6:
            if (r6 != r11) goto L_0x00cb
            r6 = r17[r5]
            goto L_0x0061
        L_0x00cb:
            if (r6 != r12) goto L_0x00ce
            goto L_0x0059
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            if (r10 == 0) goto L_0x00d4
            r0.append(r10)
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p069x.p070d.C0931e.m1603e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    private static int m1604f(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == 900 || i4 == 901 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m1601c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: g */
    private static int m1605g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m1603e(iArr2, iArr3, i2, sb);
        return i;
    }
}
