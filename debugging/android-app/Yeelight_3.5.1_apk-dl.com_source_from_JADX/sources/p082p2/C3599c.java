package p082p2;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.WriterException;
import com.google.zxing.common.C2548a;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.C2627g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p034f2.C3161a;
import p034f2.C3164d;

/* renamed from: p2.c */
public final class C3599c {

    /* renamed from: a */
    private static final int[] f6003a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: p2.c$a */
    static /* synthetic */ class C3600a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6004a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6004a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6004a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6004a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6004a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082p2.C3599c.C3600a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m10199a(String str, C2548a aVar, String str2) {
        try {
            for (byte c : str.getBytes(str2)) {
                aVar.mo19471c(c, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* renamed from: b */
    static void m10200b(CharSequence charSequence, C2548a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = m10214p(charSequence.charAt(i));
            if (p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int p2 = m10214p(charSequence.charAt(i2));
                    if (p2 != -1) {
                        aVar.mo19471c((p * 45) + p2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo19471c(p, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    static void m10201c(String str, Mode mode, C2548a aVar, String str2) {
        int i = C3600a.f6004a[mode.ordinal()];
        if (i == 1) {
            m10206h(str, aVar);
        } else if (i == 2) {
            m10200b(str, aVar);
        } else if (i == 3) {
            m10199a(str, aVar, str2);
        } else if (i == 4) {
            m10203e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: " + mode);
        }
    }

    /* renamed from: d */
    private static void m10202d(CharacterSetECI characterSetECI, C2548a aVar) {
        aVar.mo19471c(Mode.ECI.getBits(), 4);
        aVar.mo19471c(characterSetECI.getValue(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10203e(java.lang.String r6, com.google.zxing.common.C2548a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo19471c(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: p082p2.C3599c.m10203e(java.lang.String, com.google.zxing.common.a):void");
    }

    /* renamed from: f */
    static void m10204f(int i, C2627g gVar, Mode mode, C2548a aVar) {
        int characterCountBits = mode.getCharacterCountBits(gVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            aVar.mo19471c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m10205g(Mode mode, C2548a aVar) {
        aVar.mo19471c(mode.getBits(), 4);
    }

    /* renamed from: h */
    static void m10206h(CharSequence charSequence, C2548a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo19471c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo19471c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo19471c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m10207i(Mode mode, C2548a aVar, C2548a aVar2, C2627g gVar) {
        return aVar.mo19481j() + mode.getCharacterCountBits(gVar) + aVar2.mo19481j();
    }

    /* renamed from: j */
    private static int m10208j(C3598b bVar) {
        return C3601d.m10221a(bVar) + C3601d.m10223c(bVar) + C3601d.m10224d(bVar) + C3601d.m10225e(bVar);
    }

    /* renamed from: k */
    private static int m10209k(C2548a aVar, ErrorCorrectionLevel errorCorrectionLevel, C2627g gVar, C3598b bVar) {
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C3602e.m10229a(aVar, errorCorrectionLevel, gVar, i3, bVar);
            int j = m10208j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static Mode m10210l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m10217s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m10214p(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        return z ? Mode.ALPHANUMERIC : z2 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* renamed from: m */
    private static C2627g m10211m(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C2627g i3 = C2627g.m7273i(i2);
            if (m10220v(i, i3, errorCorrectionLevel)) {
                return i3;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p082p2.C3603f m10212n(java.lang.String r6, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r7, java.util.Map<com.google.zxing.EncodeHintType, ?> r8) {
        /*
            java.lang.String r0 = "ISO-8859-1"
            if (r8 == 0) goto L_0x0015
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x0015
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            com.google.zxing.qrcode.decoder.Mode r2 = m10210l(r6, r1)
            com.google.zxing.common.a r3 = new com.google.zxing.common.a
            r3.<init>()
            com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r2 != r4) goto L_0x0032
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            com.google.zxing.common.CharacterSetECI r0 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r1)
            if (r0 == 0) goto L_0x0032
            m10202d(r0, r3)
        L_0x0032:
            m10205g(r2, r3)
            com.google.zxing.common.a r0 = new com.google.zxing.common.a
            r0.<init>()
            m10201c(r6, r2, r0, r1)
            if (r8 == 0) goto L_0x006a
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L_0x006a
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            com.google.zxing.qrcode.decoder.g r8 = com.google.zxing.qrcode.decoder.C2627g.m7273i(r8)
            int r1 = m10207i(r2, r3, r0, r8)
            boolean r1 = m10220v(r1, r8, r7)
            if (r1 == 0) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x006a:
            com.google.zxing.qrcode.decoder.g r8 = m10218t(r7, r2, r3, r0)
        L_0x006e:
            com.google.zxing.common.a r1 = new com.google.zxing.common.a
            r1.<init>()
            r1.mo19470b(r3)
            if (r2 != r4) goto L_0x007d
            int r6 = r0.mo19482k()
            goto L_0x0081
        L_0x007d:
            int r6 = r6.length()
        L_0x0081:
            m10204f(r6, r8, r2, r1)
            r1.mo19470b(r0)
            com.google.zxing.qrcode.decoder.g$b r6 = r8.mo19666f(r7)
            int r0 = r8.mo19667h()
            int r3 = r6.mo19675d()
            int r0 = r0 - r3
            m10219u(r0, r1)
            int r3 = r8.mo19667h()
            int r6 = r6.mo19674c()
            com.google.zxing.common.a r6 = m10216r(r1, r3, r0, r6)
            p2.f r0 = new p2.f
            r0.<init>()
            r0.mo25907c(r7)
            r0.mo25910f(r2)
            r0.mo25911g(r8)
            int r1 = r8.mo19665e()
            p2.b r2 = new p2.b
            r2.<init>(r1, r1)
            int r1 = m10209k(r6, r7, r8, r2)
            r0.mo25908d(r1)
            p082p2.C3602e.m10229a(r6, r7, r8, r1, r2)
            r0.mo25909e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082p2.C3599c.m10212n(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):p2.f");
    }

    /* renamed from: o */
    static byte[] m10213o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C3164d(C3161a.f5073l).mo23692b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m10214p(int i) {
        int[] iArr = f6003a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    static void m10215q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: r */
    static C2548a m10216r(C2548a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo19482k() == i5) {
            ArrayList<C3597a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m10215q(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo19487t(i7 << 3, bArr, 0, i11);
                byte[] o = m10213o(bArr, iArr2[0]);
                arrayList.add(new C3597a(bArr, o));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, o.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C2548a aVar2 = new C2548a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C3597a a : arrayList) {
                        byte[] a2 = a.mo25896a();
                        if (i12 < a2.length) {
                            aVar2.mo19471c(a2[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C3597a b : arrayList) {
                        byte[] b2 = b.mo25897b();
                        if (i13 < b2.length) {
                            aVar2.mo19471c(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo19482k()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i4 + " and " + aVar2.mo19482k() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m10217s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C2627g m10218t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C2548a aVar, C2548a aVar2) {
        return m10211m(m10207i(mode, aVar, aVar2, m10211m(m10207i(mode, aVar, aVar2, C2627g.m7273i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: u */
    static void m10219u(int i, C2548a aVar) {
        int i2 = i << 3;
        if (aVar.mo19481j() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo19481j() < i2; i3++) {
                aVar.mo19469a(false);
            }
            int j = aVar.mo19481j() & 7;
            if (j > 0) {
                while (j < 8) {
                    aVar.mo19469a(false);
                    j++;
                }
            }
            int k = i - aVar.mo19482k();
            for (int i4 = 0; i4 < k; i4++) {
                aVar.mo19471c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo19481j() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.mo19481j() + " > " + i2);
    }

    /* renamed from: v */
    private static boolean m10220v(int i, C2627g gVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return gVar.mo19667h() - gVar.mo19666f(errorCorrectionLevel).mo19675d() >= (i + 7) / 8;
    }
}
