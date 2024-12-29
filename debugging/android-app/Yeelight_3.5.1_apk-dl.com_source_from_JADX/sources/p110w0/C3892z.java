package p110w0;

import java.util.Objects;

/* renamed from: w0.z */
public final class C3892z {
    /* renamed from: a */
    public static void m11085a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m11086b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m11087c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m11088d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
