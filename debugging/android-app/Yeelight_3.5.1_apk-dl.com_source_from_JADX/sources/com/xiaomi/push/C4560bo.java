package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.manager.timer.TimerCodec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.xiaomi.push.bo */
public class C4560bo {
    /* renamed from: a */
    private static String m13037a(byte b) {
        int i = (b & Byte.MAX_VALUE) + (b < 0 ? (byte) 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? TimerCodec.DISENABLE : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13038a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            StringBuffer stringBuffer = new StringBuffer();
            instance.update(str.getBytes(), 0, str.length());
            byte[] digest = instance.digest();
            for (byte a : digest) {
                stringBuffer.append(m13037a(a));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m13039a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(str.getBytes());
            return instance.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m13040b(String str) {
        return m13038a(str).subSequence(8, 24).toString();
    }
}
