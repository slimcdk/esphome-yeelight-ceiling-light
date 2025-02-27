package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.xiaomi.push.bp */
public class C4561bp {
    /* renamed from: a */
    public static String m13041a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m13042a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(m13042a(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m13043a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (i <= 0 || length < i) {
            i = length / 3;
            if (i <= 1) {
                i = 1;
            }
            if (i > 3) {
                i = 3;
            }
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (i3 % i == 0) {
                sb.append("*");
            } else {
                sb.append(str.charAt(i2));
            }
            i2 = i3;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13044a(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return m13045a(collection.iterator(), str);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[SYNTHETIC] */
    /* renamed from: a */
    public static java.lang.String m13045a(java.util.Iterator<?> r3, java.lang.String r4) {
        /*
            if (r3 != 0) goto L_0x0004
            r3 = 0
            return r3
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = ""
            return r3
        L_0x000d:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x001c
            java.lang.String r3 = r0.toString()
            return r3
        L_0x001c:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r1.append(r0)
        L_0x0028:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003a
            if (r4 == 0) goto L_0x0033
            r1.append(r4)
        L_0x0033:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x0028
            goto L_0x0025
        L_0x003a:
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4561bp.m13045a(java.util.Iterator, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m13046a(byte[] bArr) {
        String str;
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(bArr);
            str = String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (Exception unused) {
            str = "";
        }
        return str.toLowerCase();
    }

    /* renamed from: a */
    public static String m13047a(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return m13048a(objArr, str, 0, objArr.length);
    }

    /* renamed from: a */
    public static String m13048a(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(i3 * ((objArr[i] == null ? 16 : objArr[i].toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                stringBuffer.append(str);
            }
            if (objArr[i4] != null) {
                stringBuffer.append(objArr[i4]);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static boolean m13049a(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m13050a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* renamed from: b */
    public static String m13051b(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(m13042a(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static String m13052b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    /* renamed from: b */
    public static boolean m13053b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[A-Za-z0-9]+$").matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m13054c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != charAt) {
                return false;
            }
        }
        return true;
    }
}
