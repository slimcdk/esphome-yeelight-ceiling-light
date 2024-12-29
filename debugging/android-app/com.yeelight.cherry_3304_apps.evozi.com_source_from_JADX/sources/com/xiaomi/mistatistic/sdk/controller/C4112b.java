package com.xiaomi.mistatistic.sdk.controller;

import com.miot.service.manager.timer.TimerCodec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.b */
public class C4112b {

    /* renamed from: a */
    private static KeyGenerator f7035a;

    /* renamed from: b */
    private static Cipher f7036b;

    static {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            f7035a = instance;
            instance.init(128);
            f7036b = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m11101a(String str, String str2) {
        return m11102a(m11104b(str, str2));
    }

    /* renamed from: a */
    public static String m11102a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            while (hexString.length() < 2) {
                hexString = TimerCodec.DISENABLE + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static byte[] m11103a(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* renamed from: b */
    private static byte[] m11104b(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m11103a(str2), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] bytes = str.getBytes("utf-8");
            instance.init(1, secretKeySpec);
            return instance.doFinal(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
