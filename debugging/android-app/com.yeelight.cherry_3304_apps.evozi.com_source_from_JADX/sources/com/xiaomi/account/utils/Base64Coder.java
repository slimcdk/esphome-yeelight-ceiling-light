package com.xiaomi.account.utils;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import org.apache.commons.p271io.IOUtils;

public class Base64Coder {
    private static char[] map1 = new char[64];
    private static byte[] map2 = new byte[128];
    private static final String systemLineSeparator = System.getProperty("line.separator");

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            map1[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            map1[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            map1[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = map1;
        cArr[i] = '+';
        cArr[i + 1] = IOUtils.DIR_SEPARATOR_UNIX;
        int i2 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            map2[map1[i3]] = (byte) i3;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static byte[] decode(char[] cArr, int i, int i2) {
        int i3;
        char c;
        char c2;
        int i4;
        if (i2 % 4 == 0) {
            while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
                i2--;
            }
            int i5 = (i2 * 3) / 4;
            byte[] bArr = new byte[i5];
            int i6 = i2 + i;
            int i7 = 0;
            while (i < i6) {
                int i8 = i + 1;
                char c3 = cArr[i];
                int i9 = i8 + 1;
                char c4 = cArr[i8];
                if (i9 < i6) {
                    i3 = i9 + 1;
                    c = cArr[i9];
                } else {
                    i3 = i9;
                    c = 'A';
                }
                if (i3 < i6) {
                    i4 = i3 + 1;
                    c2 = cArr[i3];
                } else {
                    i4 = i3;
                    c2 = 'A';
                }
                if (c3 > 127 || c4 > 127 || c > 127 || c2 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte[] bArr2 = map2;
                byte b = bArr2[c3];
                byte b2 = bArr2[c4];
                byte b3 = bArr2[c];
                byte b4 = bArr2[c2];
                if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i10 = (b << 2) | (b2 >>> 4);
                int i11 = ((b2 & ParameterInitDefType.CubemapSamplerInit) << 4) | (b3 >>> 2);
                byte b5 = ((b3 & 3) << 6) | b4;
                int i12 = i7 + 1;
                bArr[i7] = (byte) i10;
                if (i12 < i5) {
                    bArr[i12] = (byte) i11;
                    i12++;
                }
                if (i12 < i5) {
                    bArr[i12] = (byte) b5;
                    i7 = i12 + 1;
                } else {
                    i7 = i12;
                }
                i = i4;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static byte[] decodeLines(String str) {
        char[] cArr = new char[str.length()];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!(charAt == ' ' || charAt == 13 || charAt == 10 || charAt == 9)) {
                cArr[i] = charAt;
                i++;
            }
        }
        return decode(cArr, 0, i);
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static char[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, i);
    }

    public static char[] encode(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        byte b2;
        int i4 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[(((i2 + 2) / 3) * 4)];
        int i5 = i2 + i;
        int i6 = 0;
        while (i < i5) {
            int i7 = i + 1;
            byte b3 = bArr[i] & 255;
            if (i7 < i5) {
                i3 = i7 + 1;
                b = bArr[i7] & 255;
            } else {
                i3 = i7;
                b = 0;
            }
            if (i3 < i5) {
                b2 = bArr[i3] & 255;
                i3++;
            } else {
                b2 = 0;
            }
            int i8 = b3 >>> 2;
            int i9 = ((b3 & 3) << 4) | (b >>> 4);
            int i10 = ((b & ParameterInitDefType.CubemapSamplerInit) << 2) | (b2 >>> 6);
            byte b4 = b2 & 63;
            int i11 = i6 + 1;
            char[] cArr2 = map1;
            cArr[i6] = cArr2[i8];
            int i12 = i11 + 1;
            cArr[i11] = cArr2[i9];
            char c = '=';
            cArr[i12] = i12 < i4 ? cArr2[i10] : '=';
            int i13 = i12 + 1;
            if (i13 < i4) {
                c = map1[b4];
            }
            cArr[i13] = c;
            i6 = i13 + 1;
            i = i3;
        }
        return cArr;
    }

    public static String encodeLines(byte[] bArr) {
        return encodeLines(bArr, 0, bArr.length, 76, systemLineSeparator);
    }

    public static String encodeLines(byte[] bArr, int i, int i2, int i3, String str) {
        int i4 = (i3 * 3) / 4;
        if (i4 > 0) {
            StringBuilder sb = new StringBuilder((((i2 + 2) / 3) * 4) + ((((i2 + i4) - 1) / i4) * str.length()));
            int i5 = 0;
            while (i5 < i2) {
                int min = Math.min(i2 - i5, i4);
                sb.append(encode(bArr, i + i5, min));
                sb.append(str);
                i5 += min;
            }
            return sb.toString();
        }
        throw new IllegalArgumentException();
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }
}
