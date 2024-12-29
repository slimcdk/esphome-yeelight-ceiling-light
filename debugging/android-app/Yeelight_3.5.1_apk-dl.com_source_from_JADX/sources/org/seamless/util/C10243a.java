package org.seamless.util;

/* renamed from: org.seamless.util.a */
public class C10243a {
    /* renamed from: a */
    public static Throwable m25753a(Throwable th) {
        if (th != null) {
            Throwable th2 = th;
            while (th != null) {
                th2 = th;
                th = th.getCause();
            }
            return th2;
        }
        throw new IllegalArgumentException("Cannot unwrap null throwable");
    }
}
