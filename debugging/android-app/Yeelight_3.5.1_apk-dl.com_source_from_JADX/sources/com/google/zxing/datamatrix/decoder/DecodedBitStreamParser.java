package com.google.zxing.datamatrix.decoder;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;
import p026d2.C3128a;

final class DecodedBitStreamParser {

    /* renamed from: a */
    private static final char[] f4313a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f4314b;

    /* renamed from: c */
    private static final char[] f4315c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f4316d;

    /* renamed from: e */
    private static final char[] f4317e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    private enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$a */
    static /* synthetic */ class C2551a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4318a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode[] r0 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4318a = r0
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4318a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4318a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4318a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4318a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.C2551a.<clinit>():void");
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, ':', ';', '<', '=', '>', '?', '@', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_'};
        f4314b = cArr;
        f4316d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p026d2.C3129b m6939a(byte[] r8) {
        /*
            d2.a r0 = new d2.a
            r0.<init>(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
        L_0x001a:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r6 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = m6941c(r0, r1, r2)
            goto L_0x0052
        L_0x0023:
            int[] r7 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.C2551a.f4318a
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r4) goto L_0x004e
            r7 = 2
            if (r5 == r7) goto L_0x004a
            r7 = 3
            if (r5 == r7) goto L_0x0046
            r7 = 4
            if (r5 == r7) goto L_0x0042
            r7 = 5
            if (r5 != r7) goto L_0x003d
            m6942d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            com.google.zxing.FormatException r8 = com.google.zxing.FormatException.getFormatInstance()
            throw r8
        L_0x0042:
            m6944f(r0, r1)
            goto L_0x0051
        L_0x0046:
            m6940b(r0, r1)
            goto L_0x0051
        L_0x004a:
            m6945g(r0, r1)
            goto L_0x0051
        L_0x004e:
            m6943e(r0, r1)
        L_0x0051:
            r5 = r6
        L_0x0052:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r6 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE
            if (r5 == r6) goto L_0x005c
            int r6 = r0.mo23600a()
            if (r6 > 0) goto L_0x001a
        L_0x005c:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0065
            r1.append(r2)
        L_0x0065:
            d2.b r0 = new d2.b
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            r0.<init>(r8, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.m6939a(byte[]):d2.b");
    }

    /* renamed from: b */
    private static void m6940b(C3128a aVar, StringBuilder sb) {
        int d;
        int i;
        char c;
        int[] iArr = new int[3];
        while (aVar.mo23600a() != 8 && (d = aVar.mo23603d(8)) != 254) {
            m6946h(d, aVar.mo23603d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = 13;
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = '>';
                } else if (i3 == 3) {
                    c = ' ';
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else if (i3 < 40) {
                        i = i3 + 51;
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (aVar.mo23600a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static Mode m6941c(C3128a aVar, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int d = aVar.mo23603d(8);
            if (d == 0) {
                throw FormatException.getFormatInstance();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return Mode.ASCII_ENCODE;
            } else if (d == 129) {
                return Mode.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (d == 230) {
                    return Mode.C40_ENCODE;
                } else {
                    if (d == 231) {
                        return Mode.BASE256_ENCODE;
                    }
                    if (d == 232) {
                        sb.append(29);
                    } else if (!(d == 233 || d == 234)) {
                        if (d == 235) {
                            z = true;
                        } else {
                            if (d == 236) {
                                str = "[)>\u001e05\u001d";
                            } else if (d == 237) {
                                str = "[)>\u001e06\u001d";
                            } else if (d == 238) {
                                return Mode.ANSIX12_ENCODE;
                            } else {
                                if (d == 239) {
                                    return Mode.TEXT_ENCODE;
                                }
                                if (d == 240) {
                                    return Mode.EDIFACT_ENCODE;
                                }
                                if (!(d == 241 || d < 242 || (d == 254 && aVar.mo23600a() == 0))) {
                                    throw FormatException.getFormatInstance();
                                }
                            }
                            sb.append(str);
                            sb2.insert(0, "\u001e\u0004");
                        }
                    }
                }
            }
        } while (aVar.mo23600a() > 0);
        return Mode.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m6942d(C3128a aVar, StringBuilder sb, Collection<byte[]> collection) {
        int c = aVar.mo23602c() + 1;
        int i = c + 1;
        int i2 = m6947i(aVar.mo23603d(8), c);
        if (i2 == 0) {
            i2 = aVar.mo23600a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + m6947i(aVar.mo23603d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (aVar.mo23600a() >= 8) {
                    bArr[i3] = (byte) m6947i(aVar.mo23603d(8), i);
                    i3++;
                    i++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: e */
    private static void m6943e(C3128a aVar, StringBuilder sb) {
        int d;
        char c;
        char c2;
        int i;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (aVar.mo23600a() != 8 && (d = aVar.mo23603d(8)) != 254) {
            m6946h(d, aVar.mo23603d(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                        }
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 == 2) {
                        char[] cArr = f4314b;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                                i2 = 0;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else if (i4 == 30) {
                            z = true;
                            i2 = 0;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 != 3) {
                        throw FormatException.getFormatInstance();
                    } else if (z) {
                        i = i4 + 224;
                    } else {
                        i4 += 96;
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    }
                    c2 = (char) i;
                    sb.append(c2);
                    z = false;
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = f4313a;
                    if (i4 < cArr2.length) {
                        char c3 = cArr2[i4];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (aVar.mo23600a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m6944f(C3128a aVar, StringBuilder sb) {
        while (aVar.mo23600a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = aVar.mo23603d(6);
                if (d == 31) {
                    int b = 8 - aVar.mo23601b();
                    if (b != 8) {
                        aVar.mo23603d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (aVar.mo23600a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6945g(p026d2.C3128a r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int r5 = r9.mo23600a()
            r6 = 8
            if (r5 != r6) goto L_0x000f
            return
        L_0x000f:
            int r5 = r9.mo23603d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L_0x0018
            return
        L_0x0018:
            int r6 = r9.mo23603d(r6)
            m6946h(r5, r6, r1)
            r5 = 0
        L_0x0020:
            if (r5 >= r0) goto L_0x0093
            r6 = r1[r5]
            if (r4 == 0) goto L_0x0071
            r7 = 1
            if (r4 == r7) goto L_0x0061
            r8 = 2
            if (r4 == r8) goto L_0x0045
            if (r4 != r0) goto L_0x0040
            char[] r4 = f4317e
            int r7 = r4.length
            if (r6 >= r7) goto L_0x003b
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x006c
        L_0x0037:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L_0x0066
        L_0x003b:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0040:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0045:
            char[] r4 = f4316d
            int r8 = r4.length
            if (r6 >= r8) goto L_0x004f
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x006c
            goto L_0x0037
        L_0x004f:
            r4 = 27
            if (r6 != r4) goto L_0x0056
            r4 = 29
            goto L_0x006c
        L_0x0056:
            r3 = 30
            if (r6 != r3) goto L_0x005c
            r3 = 1
            goto L_0x006f
        L_0x005c:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0061:
            if (r3 == 0) goto L_0x006b
            int r6 = r6 + 128
            char r3 = (char) r6
        L_0x0066:
            r10.append(r3)
            r3 = 0
            goto L_0x006f
        L_0x006b:
            char r4 = (char) r6
        L_0x006c:
            r10.append(r4)
        L_0x006f:
            r4 = 0
            goto L_0x008b
        L_0x0071:
            if (r6 >= r0) goto L_0x0077
            int r6 = r6 + 1
            r4 = r6
            goto L_0x008b
        L_0x0077:
            char[] r7 = f4315c
            int r8 = r7.length
            if (r6 >= r8) goto L_0x008e
            char r6 = r7[r6]
            if (r3 == 0) goto L_0x0088
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = 0
            goto L_0x008b
        L_0x0088:
            r10.append(r6)
        L_0x008b:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x008e:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0093:
            int r5 = r9.mo23600a()
            if (r5 > 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.m6945g(d2.a, java.lang.StringBuilder):void");
    }

    /* renamed from: h */
    private static void m6946h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m6947i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
