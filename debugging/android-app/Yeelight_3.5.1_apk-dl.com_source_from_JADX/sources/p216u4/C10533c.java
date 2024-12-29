package p216u4;

import kotlin.PublishedApi;

/* renamed from: u4.c */
public final class C10533c {
    /* renamed from: a */
    private static final int m26884a(int i, int i2, int i3) {
        return m26886c(m26886c(i, i3) - m26886c(i2, i3), i3);
    }

    @PublishedApi
    /* renamed from: b */
    public static final int m26885b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m26884a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m26884a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m26886c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
