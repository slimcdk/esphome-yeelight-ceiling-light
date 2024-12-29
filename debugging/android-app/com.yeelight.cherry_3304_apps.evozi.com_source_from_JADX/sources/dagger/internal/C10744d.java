package dagger.internal;

/* renamed from: dagger.internal.d */
public final class C10744d {
    /* renamed from: a */
    public static <T> void m26604a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m26605b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m26606c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
