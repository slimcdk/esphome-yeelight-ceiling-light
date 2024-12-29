package com.telink.p149b;

import java.util.Formatter;

/* renamed from: com.telink.b.a */
public final class C3962a {
    /* renamed from: a */
    public static String m10649a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("%02X", new Object[]{Byte.valueOf(bArr[0])});
        for (int i = 1; i < bArr.length; i++) {
            if (!C3963b.m10655b(str)) {
                sb.append(str);
            }
            formatter.format("%02X", new Object[]{Byte.valueOf(bArr[i])});
        }
        formatter.flush();
        formatter.close();
        return sb.toString();
    }

    /* renamed from: b */
    public static String m10650b(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        if (bArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 6);
        sb.append('[');
        sb.append(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            sb.append(", ");
            sb.append(bArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m10651c(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static byte[] m10652d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    /* renamed from: e */
    public static byte[] m10653e(byte[] bArr, int i, int i2) {
        while (i < i2) {
            byte b = bArr[i2];
            bArr[i2] = bArr[i];
            bArr[i] = b;
            i++;
            i2--;
        }
        return bArr;
    }
}
