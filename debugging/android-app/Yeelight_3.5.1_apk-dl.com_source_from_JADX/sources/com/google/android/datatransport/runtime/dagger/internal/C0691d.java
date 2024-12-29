package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.d */
public final class C0691d {
    /* renamed from: a */
    public static <T> void m535a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m536b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m537c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
