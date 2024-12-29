package com.telink.crypto;

import com.telink.p149b.C3962a;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class AES {

    /* renamed from: a */
    public static boolean f6787a = true;

    static {
        System.loadLibrary("TelinkCrypto");
    }

    /* renamed from: a */
    public static byte[] m10665a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return !f6787a ? bArr3 : decryptCmd(bArr3, bArr2, bArr);
    }

    /* renamed from: b */
    public static byte[] m10666b(byte[] bArr, byte[] bArr2) {
        if (!f6787a) {
            return bArr2;
        }
        byte[] d = C3962a.m10652d(bArr);
        byte[] d2 = C3962a.m10652d(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(d, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
        instance.init(1, secretKeySpec);
        return instance.doFinal(d2);
    }

    /* renamed from: c */
    public static byte[] m10667c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return !f6787a ? bArr3 : encryptCmd(bArr3, bArr2, bArr);
    }

    private static native byte[] decryptCmd(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native byte[] encryptCmd(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
