package p164h.p257c.p259b.p260f;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: h.c.b.f.b */
public final class C11509b {

    /* renamed from: a */
    private static byte[] f22874a = new byte[255];

    /* renamed from: b */
    private static byte[] f22875b = new byte[16];

    static {
        for (int i = 0; i < 255; i++) {
            f22874a[i] = -1;
        }
        for (int i2 = 57; i2 >= 48; i2--) {
            f22874a[i2] = (byte) (i2 - 48);
        }
        for (int i3 = 70; i3 >= 65; i3--) {
            f22874a[i3] = (byte) ((i3 - 65) + 10);
        }
        for (int i4 = 102; i4 >= 97; i4--) {
            f22874a[i4] = (byte) ((i4 - 97) + 10);
        }
        for (int i5 = 0; i5 < 10; i5++) {
            f22875b[i5] = (byte) (i5 + 48);
        }
        for (int i6 = 10; i6 <= 15; i6++) {
            f22875b[i6] = (byte) ((i6 + 65) - 10);
        }
    }

    /* renamed from: a */
    public static String m30219a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(m30222d(bArr));
    }

    /* renamed from: b */
    public static String m30220b(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        String str2 = new String(m30222d(bArr));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (char append : str2.toCharArray()) {
            sb.append(append);
            if (i == 2) {
                sb.append(str);
                i = 1;
            } else {
                i++;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: c */
    public static byte[] m30221c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length % 2 != 0) {
            return null;
        }
        int i = length / 2;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 * 2;
            if (m30223e(bArr[i3])) {
                int i4 = i3 + 1;
                if (m30223e(bArr[i4])) {
                    byte[] bArr3 = f22874a;
                    bArr2[i2] = (byte) ((bArr3[bArr[i3]] << 4) | bArr3[bArr[i4]]);
                    i2++;
                }
            }
            return null;
        }
        return bArr2;
    }

    /* renamed from: d */
    public static byte[] m30222d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            byte[] bArr3 = f22875b;
            bArr2[i2] = bArr3[(bArr[i] >> 4) & 15];
            bArr2[i2 + 1] = bArr3[bArr[i] & ParameterInitDefType.CubemapSamplerInit];
        }
        return bArr2;
    }

    /* renamed from: e */
    static boolean m30223e(byte b) {
        return f22874a[b] != -1;
    }

    /* renamed from: f */
    public static byte[] m30224f(String str) {
        return m30221c(str.getBytes());
    }

    /* renamed from: g */
    public static byte[] m30225g(String str, String str2) {
        return m30221c(str.replaceAll(str2, "").getBytes());
    }
}
