package com.telink.crypto;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p149e3.C8964a;

public abstract class AES {

    /* renamed from: a */
    public static boolean f7341a = true;

    static {
        System.loadLibrary("TelinkCrypto");
    }

    /* renamed from: a */
    public static byte[] m12460a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return !f7341a ? bArr3 : decryptCmd(bArr3, bArr2, bArr);
    }

    /* renamed from: b */
    public static byte[] m12461b(byte[] bArr, byte[] bArr2) {
        if (!f7341a) {
            return bArr2;
        }
        byte[] d = C8964a.m21438d(bArr);
        byte[] d2 = C8964a.m21438d(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(d, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
        instance.init(1, secretKeySpec);
        return instance.doFinal(d2);
    }

    /* renamed from: c */
    public static byte[] m12462c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return !f7341a ? bArr3 : encryptCmd(bArr3, bArr2, bArr);
    }

    private static native byte[] decryptCmd(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native byte[] encryptCmd(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
