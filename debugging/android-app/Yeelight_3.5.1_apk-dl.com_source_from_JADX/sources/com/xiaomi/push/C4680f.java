package com.xiaomi.push;

/* renamed from: com.xiaomi.push.f */
public final class C4680f {

    /* renamed from: a */
    static final int f8100a = m13774a(1, 3);

    /* renamed from: b */
    static final int f8101b = m13774a(1, 4);

    /* renamed from: c */
    static final int f8102c = m13774a(2, 0);

    /* renamed from: d */
    static final int f8103d = m13774a(3, 2);

    /* renamed from: a */
    static int m13773a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    static int m13774a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    public static int m13775b(int i) {
        return i >>> 3;
    }
}
