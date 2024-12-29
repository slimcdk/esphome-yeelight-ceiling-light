package com.miot.bluetooth.utils;

import android.util.Base64;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AESCryptUtils {
    private static final String AES_MODE = "AES/CBC/PKCS7Padding";
    private static final String CHARSET = "UTF-8";
    private static final String HASH_ALGORITHM = "SHA-256";
    private static final String TAG = "AESCrypt";
    private static final byte[] ivBytes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static String decrypt(String str, String str2) {
        return new String(decrypt(generateKey(str), ivBytes, Base64.decode(str2, 2)), CHARSET);
    }

    private static byte[] decrypt(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance(AES_MODE);
        instance.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    public static String encrypt(String str, String str2) {
        return Base64.encodeToString(encrypt(generateKey(str), ivBytes, str2.getBytes(CHARSET)), 2);
    }

    private static byte[] encrypt(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance(AES_MODE);
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    private static SecretKeySpec generateKey(String str) {
        MessageDigest instance = MessageDigest.getInstance(HASH_ALGORITHM);
        byte[] bytes = str.getBytes(CHARSET);
        instance.update(bytes, 0, bytes.length);
        return new SecretKeySpec(instance.digest(), "AES");
    }
}
