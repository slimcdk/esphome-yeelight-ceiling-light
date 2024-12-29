package com.xiaomi.push;

import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.manager.timer.TimerCodec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.xiaomi.push.be */
public class C4531be {
    /* renamed from: a */
    private static String m13427a(byte b) {
        int i = (b & Byte.MAX_VALUE) + (b < 0 ? (byte) 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? TimerCodec.DISENABLE : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13428a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            StringBuffer stringBuffer = new StringBuffer();
            instance.update(str.getBytes(), 0, str.length());
            byte[] digest = instance.digest();
            for (byte a : digest) {
                stringBuffer.append(m13427a(a));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m13429b(String str) {
        return m13428a(str).subSequence(8, 24).toString();
    }
}
