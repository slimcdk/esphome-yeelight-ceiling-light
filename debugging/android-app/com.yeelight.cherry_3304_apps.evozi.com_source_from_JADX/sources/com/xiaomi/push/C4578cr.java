package com.xiaomi.push;

import android.util.Base64;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import org.apache.http.NameValuePair;

/* renamed from: com.xiaomi.push.cr */
class C4578cr {
    /* renamed from: a */
    public static String m13607a(String str) {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(m13607a(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m13608a(List<NameValuePair> list, String str) {
        Collections.sort(list, new C4579cs());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (NameValuePair next : list) {
            if (!z) {
                sb.append("&");
            }
            sb.append(next.getName());
            sb.append("=");
            sb.append(next.getValue());
            z = false;
        }
        sb.append("&");
        sb.append(str);
        return m13607a(new String(Base64.encode(m13607a(sb.toString()), 2)));
    }

    /* renamed from: a */
    public static void m13609a(String str) {
    }

    /* renamed from: a */
    private static byte[] m13610a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
