package com.google.gson.internal;

import java.util.Objects;

/* renamed from: com.google.gson.internal.a */
public final class C2496a {
    /* renamed from: a */
    public static void m6749a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m6750b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}
