package com.telink.p149b;

import java.nio.charset.Charset;

/* renamed from: com.telink.b.b */
public final class C3963b {
    /* renamed from: a */
    public static String m10654a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new String(bArr, Charset.defaultCharset()).trim();
    }

    /* renamed from: b */
    public static boolean m10655b(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* renamed from: c */
    public static byte[] m10656c(String str) {
        return m10657d(str, 0);
    }

    /* renamed from: d */
    public static byte[] m10657d(String str, int i) {
        if (i <= 0) {
            return str.getBytes(Charset.defaultCharset());
        }
        byte[] bArr = new byte[i];
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (bytes.length <= i) {
            i = bytes.length;
        }
        System.arraycopy(bytes, 0, bArr, 0, i);
        return bArr;
    }
}
