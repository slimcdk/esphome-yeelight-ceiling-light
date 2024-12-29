package com.google.android.gms.internal.wearable;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.wearable.w0 */
public final class C1524w0 {

    /* renamed from: a */
    static final Charset f1867a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f1868b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1868b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C1504s(bArr, 0, 0, false, (C1499r) null).mo13792c(0);
        } catch (zzcc e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    static <T> T m3857a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m3858b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static boolean m3859c(byte[] bArr) {
        return C1428c3.m3493a(bArr);
    }

    /* renamed from: d */
    public static String m3860d(byte[] bArr) {
        return new String(bArr, f1867a);
    }

    /* renamed from: e */
    public static int m3861e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static int m3862f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static int m3863g(byte[] bArr) {
        int length = bArr.length;
        int h = m3864h(length, bArr, 0, length);
        if (h == 0) {
            return 1;
        }
        return h;
    }

    /* renamed from: h */
    static int m3864h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: i */
    static Object m3865i(Object obj, Object obj2) {
        return ((C1486o1) obj).mo13713d().mo13600A((C1486o1) obj2).mo13679G();
    }
}
