package p011c.p012a.p053e.p060u.p061b;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p057t.C0841c;

/* renamed from: c.a.e.u.b.c */
final class C0861c {

    /* renamed from: a */
    private static final char[] f872a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f873b;

    /* renamed from: c */
    private static final char[] f874c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f875d;

    /* renamed from: e */
    private static final char[] f876e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: c.a.e.u.b.c$a */
    static /* synthetic */ class C0862a {

        /* renamed from: a */
        static final /* synthetic */ int[] f877a;

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
                c.a.e.u.b.c$b[] r0 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f877a = r0
                c.a.e.u.b.c$b r1 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f877a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.e.u.b.c$b r1 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f877a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.e.u.b.c$b r1 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f877a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.e.u.b.c$b r1 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f877a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.a.e.u.b.c$b r1 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p060u.p061b.C0861c.C0862a.<clinit>():void");
        }
    }

    /* renamed from: c.a.e.u.b.c$b */
    private enum C0863b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, ':', ';', '<', '=', '>', '?', '@', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_'};
        f873b = cArr;
        f875d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p011c.p012a.p053e.p057t.C0843e m1309a(byte[] r7) {
        /*
            c.a.e.t.c r0 = new c.a.e.t.c
            r0.<init>(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            c.a.e.u.b.c$b r5 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.ASCII_ENCODE
        L_0x001a:
            c.a.e.u.b.c$b r6 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            c.a.e.u.b.c$b r5 = m1311c(r0, r1, r2)
            goto L_0x0053
        L_0x0023:
            int[] r6 = p011c.p012a.p053e.p060u.p061b.C0861c.C0862a.f877a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r4) goto L_0x004e
            r6 = 2
            if (r5 == r6) goto L_0x004a
            r6 = 3
            if (r5 == r6) goto L_0x0046
            r6 = 4
            if (r5 == r6) goto L_0x0042
            r6 = 5
            if (r5 != r6) goto L_0x003d
            m1312d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            c.a.e.g r7 = p011c.p012a.p053e.C0820g.m1114a()
            throw r7
        L_0x0042:
            m1314f(r0, r1)
            goto L_0x0051
        L_0x0046:
            m1310b(r0, r1)
            goto L_0x0051
        L_0x004a:
            m1315g(r0, r1)
            goto L_0x0051
        L_0x004e:
            m1313e(r0, r1)
        L_0x0051:
            c.a.e.u.b.c$b r5 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.ASCII_ENCODE
        L_0x0053:
            c.a.e.u.b.c$b r6 = p011c.p012a.p053e.p060u.p061b.C0861c.C0863b.PAD_ENCODE
            if (r5 == r6) goto L_0x005d
            int r6 = r0.mo9074a()
            if (r6 > 0) goto L_0x001a
        L_0x005d:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0066
            r1.append(r2)
        L_0x0066:
            c.a.e.t.e r0 = new c.a.e.t.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0074
            r3 = r4
        L_0x0074:
            r0.<init>(r7, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p060u.p061b.C0861c.m1309a(byte[]):c.a.e.t.e");
    }

    /* renamed from: b */
    private static void m1310b(C0841c cVar, StringBuilder sb) {
        int d;
        int i;
        char c;
        int[] iArr = new int[3];
        while (cVar.mo9074a() != 8 && (d = cVar.mo9077d(8)) != 254) {
            m1316h(d, cVar.mo9077d(8), iArr);
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
                        throw C0820g.m1114a();
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (cVar.mo9074a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static C0863b m1311c(C0841c cVar, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int d = cVar.mo9077d(8);
            if (d == 0) {
                throw C0820g.m1114a();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return C0863b.ASCII_ENCODE;
            } else if (d == 129) {
                return C0863b.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (d == 230) {
                    return C0863b.C40_ENCODE;
                } else {
                    if (d == 231) {
                        return C0863b.BASE256_ENCODE;
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
                                return C0863b.ANSIX12_ENCODE;
                            } else {
                                if (d == 239) {
                                    return C0863b.TEXT_ENCODE;
                                }
                                if (d == 240) {
                                    return C0863b.EDIFACT_ENCODE;
                                }
                                if (!(d == 241 || d < 242 || (d == 254 && cVar.mo9074a() == 0))) {
                                    throw C0820g.m1114a();
                                }
                            }
                            sb.append(str);
                            sb2.insert(0, "\u001e\u0004");
                        }
                    }
                }
            }
        } while (cVar.mo9074a() > 0);
        return C0863b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m1312d(C0841c cVar, StringBuilder sb, Collection<byte[]> collection) {
        int c = cVar.mo9076c() + 1;
        int i = c + 1;
        int i2 = m1317i(cVar.mo9077d(8), c);
        if (i2 == 0) {
            i2 = cVar.mo9074a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + m1317i(cVar.mo9077d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.mo9074a() >= 8) {
                    bArr[i3] = (byte) m1317i(cVar.mo9077d(8), i);
                    i3++;
                    i++;
                } else {
                    throw C0820g.m1114a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: e */
    private static void m1313e(C0841c cVar, StringBuilder sb) {
        int d;
        char c;
        char c2;
        int i;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (cVar.mo9074a() != 8 && (d = cVar.mo9077d(8)) != 254) {
            m1316h(d, cVar.mo9077d(8), iArr);
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
                        char[] cArr = f873b;
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
                            throw C0820g.m1114a();
                        }
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 != 3) {
                        throw C0820g.m1114a();
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
                    char[] cArr2 = f872a;
                    if (i4 < cArr2.length) {
                        char c3 = cArr2[i4];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw C0820g.m1114a();
                    }
                }
            }
            if (cVar.mo9074a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m1314f(C0841c cVar, StringBuilder sb) {
        while (cVar.mo9074a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.mo9077d(6);
                if (d == 31) {
                    int b = 8 - cVar.mo9075b();
                    if (b != 8) {
                        cVar.mo9077d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (cVar.mo9074a() <= 0) {
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
    private static void m1315g(p011c.p012a.p053e.p057t.C0841c r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int r5 = r9.mo9074a()
            r6 = 8
            if (r5 != r6) goto L_0x000f
            return
        L_0x000f:
            int r5 = r9.mo9077d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L_0x0018
            return
        L_0x0018:
            int r6 = r9.mo9077d(r6)
            m1316h(r5, r6, r1)
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
            char[] r4 = f876e
            int r7 = r4.length
            if (r6 >= r7) goto L_0x003b
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x006c
        L_0x0037:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L_0x0066
        L_0x003b:
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x0040:
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x0045:
            char[] r4 = f875d
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
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
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
            char[] r7 = f874c
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
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x0093:
            int r5 = r9.mo9074a()
            if (r5 > 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p060u.p061b.C0861c.m1315g(c.a.e.t.c, java.lang.StringBuilder):void");
    }

    /* renamed from: h */
    private static void m1316h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m1317i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
