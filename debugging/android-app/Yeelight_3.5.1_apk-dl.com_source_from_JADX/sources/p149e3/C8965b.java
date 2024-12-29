package p149e3;

import java.nio.charset.Charset;

/* renamed from: e3.b */
public final class C8965b {
    /* renamed from: a */
    public static String m21440a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new String(bArr, Charset.defaultCharset()).trim();
    }

    /* renamed from: b */
    public static boolean m21441b(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* renamed from: c */
    public static byte[] m21442c(String str) {
        return m21443d(str, 0);
    }

    /* renamed from: d */
    public static byte[] m21443d(String str, int i) {
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
