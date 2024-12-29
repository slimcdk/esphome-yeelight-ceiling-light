package p164h.p211a.p212a.p228h;

import java.io.ByteArrayOutputStream;
import org.apache.commons.p271io.IOUtils;

/* renamed from: h.a.a.h.d */
public class C11107d {

    /* renamed from: a */
    static final char[] f21958a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* renamed from: b */
    static final byte[] f21959b = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            f21959b[i] = -1;
        }
        for (byte b = 0; b < 64; b = (byte) (b + 1)) {
            f21959b[(byte) f21958a[b]] = b;
        }
        f21959b[61] = 0;
    }

    /* renamed from: a */
    public static String m28795a(String str, String str2) {
        byte[] b = m28796b(str);
        return str2 == null ? new String(b) : new String(b, str2);
    }

    /* renamed from: b */
    public static byte[] m28796b(String str) {
        int i;
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[4];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() * 4) / 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == '=') {
                break;
            }
            if (!Character.isWhitespace(charAt)) {
                byte[] bArr2 = f21959b;
                if (bArr2[charAt] >= 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = bArr2[charAt];
                    if (i5 == 2) {
                        i = (bArr[1] >>> 4) | (bArr[0] << 2);
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            byteArrayOutputStream.write((bArr[2] << 6) | bArr[3]);
                            i3 = 0;
                        }
                        i3 = i5;
                    } else {
                        i = (bArr[1] << 4) | (bArr[2] >>> 2);
                    }
                    byteArrayOutputStream.write(i);
                    i3 = i5;
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            }
            i2 = i4;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public static String m28797c(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return new String(m28798d(str.getBytes(str2)));
    }

    /* renamed from: d */
    public static char[] m28798d(byte[] bArr) {
        return m28799e(bArr, false);
    }

    /* renamed from: e */
    public static char[] m28799e(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        int length = bArr2.length;
        int i = ((length + 2) / 3) * 4;
        if (z) {
            i += ((i * 2) / 76) + 2;
        }
        char[] cArr = new char[i];
        int i2 = (length / 3) * 3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i3 + 1;
            byte b = bArr2[i3];
            int i7 = i6 + 1;
            byte b2 = bArr2[i6];
            int i8 = i7 + 1;
            byte b3 = bArr2[i7];
            int i9 = i4 + 1;
            char[] cArr2 = f21958a;
            cArr[i4] = cArr2[(b >>> 2) & 63];
            int i10 = i9 + 1;
            cArr[i9] = cArr2[((b << 4) & 63) | ((b2 >>> 4) & 15)];
            int i11 = i10 + 1;
            cArr[i10] = cArr2[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
            i4 = i11 + 1;
            cArr[i11] = cArr2[b3 & 63];
            i5 += 4;
            if (z && i5 % 76 == 0) {
                int i12 = i4 + 1;
                cArr[i4] = 13;
                i4 = i12 + 1;
                cArr[i12] = 10;
            }
            i3 = i8;
        }
        if (length != i3) {
            int i13 = length % 3;
            if (i13 == 1) {
                byte b4 = bArr2[i3];
                int i14 = i4 + 1;
                char[] cArr3 = f21958a;
                cArr[i4] = cArr3[(b4 >>> 2) & 63];
                int i15 = i14 + 1;
                cArr[i14] = cArr3[(b4 << 4) & 63];
                int i16 = i15 + 1;
                cArr[i15] = '=';
                i4 = i16 + 1;
                cArr[i16] = '=';
            } else if (i13 == 2) {
                int i17 = i3 + 1;
                byte b5 = bArr2[i3];
                byte b6 = bArr2[i17];
                int i18 = i4 + 1;
                char[] cArr4 = f21958a;
                cArr[i4] = cArr4[(b5 >>> 2) & 63];
                int i19 = i18 + 1;
                cArr[i18] = cArr4[((b5 << 4) & 63) | ((b6 >>> 4) & 15)];
                int i20 = i19 + 1;
                cArr[i19] = cArr4[(b6 << 2) & 63];
                i4 = i20 + 1;
                cArr[i20] = '=';
            }
        }
        if (z) {
            cArr[i4] = 13;
            cArr[i4 + 1] = 10;
        }
        return cArr;
    }
}
