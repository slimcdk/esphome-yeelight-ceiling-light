package com.yeelight.yeelib.utils;

import com.telink.crypto.AES;
import com.telink.p149b.C3962a;
import com.telink.p149b.C3963b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.yeelight.yeelib.utils.t */
public class C10556t {

    /* renamed from: a */
    private static int f20172a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static byte[] m25798a(byte[] bArr, byte b, int i, byte[] bArr2, byte[] bArr3) {
        int d = m25801d();
        byte[] bArr4 = new byte[20];
        bArr4[0] = (byte) (d & 255);
        bArr4[1] = (byte) ((d >> 8) & 255);
        bArr4[2] = (byte) ((d >> 16) & 255);
        bArr4[3] = 0;
        bArr4[4] = 0;
        bArr4[5] = (byte) (i & 255);
        bArr4[6] = (byte) ((i >> 8) & 255);
        bArr4[7] = (byte) (b | 192);
        bArr4[8] = (byte) 100;
        bArr4[9] = (byte) 1;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr4, 10, bArr2.length);
        }
        byte[] e = m25802e(bArr, d);
        "build mesh command sk = " + bArr3 + " nonce = " + e + " command = " + bArr4;
        if (bArr3 == null) {
            return null;
        }
        return AES.m10667c(bArr3, e, bArr4);
    }

    /* renamed from: b */
    public static byte[] m25799b(byte b, String str, byte[] bArr) {
        return m25800c(b, C3963b.m10657d(str, 16), bArr);
    }

    /* renamed from: c */
    public static byte[] m25800c(byte b, byte[] bArr, byte[] bArr2) {
        try {
            byte[] b2 = AES.m10666b(bArr2, bArr);
            C3962a.m10653e(b2, 0, b2.length - 1);
            byte[] bArr3 = new byte[17];
            bArr3[0] = b;
            System.arraycopy(b2, 0, bArr3, 1, b2.length);
            return bArr3;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private static int m25801d() {
        if (f20172a > 16777215) {
            f20172a = Math.round(((float) Math.random()) * ((float) 16777214)) + 1;
        }
        int i = f20172a + 1;
        f20172a = i;
        return i;
    }

    /* renamed from: e */
    private static byte[] m25802e(byte[] bArr, int i) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[4] = 1;
        bArr2[5] = (byte) (i & 255);
        bArr2[6] = (byte) ((i >> 8) & 255);
        bArr2[7] = (byte) ((i >> 16) & 255);
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m25803f(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = bArr[0];
        bArr2[1] = bArr[1];
        bArr2[2] = bArr[2];
        return bArr2;
    }
}
