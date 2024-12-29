package com.miot.service.common.crypto.rc4coder;

import com.miot.service.common.crypto.Base64Coder;
import java.security.MessageDigest;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Coder {
    private static final String HMAC_SHA1 = "HmacSHA1";
    public static final String KEY_MAC = "HmacMD5";
    public static final String KEY_MD5 = "MD5";
    public static final String KEY_PBKDF2 = "PBKDF2WithHmacSHA1";
    public static final String KEY_SHA = "SHA";
    private static final String KEY_SHA256 = "SHA-256";

    public static byte[] createPBKDF2Key(char[] cArr, byte[] bArr, int i, int i2) {
        return SecretKeyFactory.getInstance(KEY_PBKDF2).generateSecret(new PBEKeySpec(cArr, bArr, i, i2)).getEncoded();
    }

    public static byte[] decryptBASE64(String str) {
        return Base64Coder.decode(str);
    }

    public static String encryptBASE64(byte[] bArr) {
        return String.valueOf(Base64Coder.encode(bArr));
    }

    public static byte[] encryptHMAC(byte[] bArr, String str) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(decryptBASE64(str), KEY_MAC);
        Mac instance = Mac.getInstance(secretKeySpec.getAlgorithm());
        instance.init(secretKeySpec);
        return instance.doFinal(bArr);
    }

    public static byte[] encryptHMAC(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, KEY_MAC);
        Mac instance = Mac.getInstance(secretKeySpec.getAlgorithm());
        instance.init(secretKeySpec);
        return instance.doFinal(bArr);
    }

    public static byte[] encryptHMACSha1(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, HMAC_SHA1);
        Mac instance = Mac.getInstance(HMAC_SHA1);
        instance.init(secretKeySpec);
        instance.update(bArr);
        return instance.doFinal();
    }

    public static byte[] encryptMD5(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(KEY_MD5);
        instance.update(bArr);
        return instance.digest();
    }

    public static byte[] encryptMD5(byte[]... bArr) {
        MessageDigest instance = MessageDigest.getInstance(KEY_MD5);
        for (byte[] bArr2 : bArr) {
            if (!isEmpty(bArr2)) {
                instance.update(bArr2);
            }
        }
        return instance.digest();
    }

    public static byte[] encryptSHA(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(KEY_SHA);
        instance.update(bArr);
        return instance.digest();
    }

    public static String initMacKey() {
        return encryptBASE64(KeyGenerator.getInstance(KEY_MAC).generateKey().getEncoded());
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static byte[] sha256Hash(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(KEY_SHA256);
        instance.update(bArr);
        return instance.digest();
    }
}
