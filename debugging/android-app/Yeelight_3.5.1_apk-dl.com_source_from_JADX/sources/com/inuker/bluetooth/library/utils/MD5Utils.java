package com.inuker.bluetooth.library.utils;

import com.miot.service.common.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MD5Utils {
    public static byte[] MD5_12(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(str.getBytes(), 0, str.length());
            byte[] digest = instance.digest();
            int length = digest.length;
            if (length < 12) {
                return ByteUtils.EMPTY_BYTES;
            }
            int i = length / 2;
            return Arrays.copyOfRange(digest, i - 6, i + 6);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
