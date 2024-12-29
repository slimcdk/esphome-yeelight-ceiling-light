package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
public final class C1270q8 {

    /* renamed from: a */
    static final Charset f1555a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f1556b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1556b = bArr;
        ByteBuffer.wrap(bArr);
        int i = C1253p7.f1526a;
        try {
            new C1221n7(bArr, 0, 0, false, (C1205m7) null).mo13019c(0);
        } catch (zzkm e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m2542a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m2543b(byte[] bArr) {
        int length = bArr.length;
        int d = m2545d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m2544c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m2545d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m2546e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m2547f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m2548g(Object obj, Object obj2) {
        return ((C1191l9) obj).mo12910e().mo12919n((C1191l9) obj2).mo12829V0();
    }

    /* renamed from: h */
    public static String m2549h(byte[] bArr) {
        return new String(bArr, f1555a);
    }

    /* renamed from: i */
    public static boolean m2550i(byte[] bArr) {
        return C1049cb.m1778e(bArr);
    }
}
