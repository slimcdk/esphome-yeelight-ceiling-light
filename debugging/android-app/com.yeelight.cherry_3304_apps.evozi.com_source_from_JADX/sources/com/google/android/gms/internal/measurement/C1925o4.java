package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.o4 */
public final class C1925o4 {

    /* renamed from: a */
    static final Charset f3609a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f3610b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3610b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f3610b;
        C1952q3.m5834b(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m5639a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static int m5640b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static int m5641c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    static <T> T m5642d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: e */
    static Object m5643e(Object obj, Object obj2) {
        C2047w5 f = ((C2062x5) obj).mo11843f();
        f.mo12178G0((C2062x5) obj2);
        return f.mo11852M();
    }

    /* renamed from: f */
    static <T> T m5644f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    static boolean m5645g(C2062x5 x5Var) {
        if (!(x5Var instanceof C2059x2)) {
            return false;
        }
        C2059x2 x2Var = (C2059x2) x5Var;
        return false;
    }

    /* renamed from: h */
    public static boolean m5646h(byte[] bArr) {
        return C1913n7.m5603f(bArr);
    }

    /* renamed from: i */
    public static String m5647i(byte[] bArr) {
        return new String(bArr, f3609a);
    }

    /* renamed from: j */
    public static int m5648j(byte[] bArr) {
        int length = bArr.length;
        int a = m5639a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
