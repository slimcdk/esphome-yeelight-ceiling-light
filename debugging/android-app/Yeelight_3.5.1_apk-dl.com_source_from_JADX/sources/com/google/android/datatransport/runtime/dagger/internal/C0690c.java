package com.google.android.datatransport.runtime.dagger.internal;

import p043i.C3246a;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.c */
public final class C0690c<T> implements C0689b<T>, C3246a<T> {

    /* renamed from: a */
    private final T f436a;

    static {
        new C0690c((Object) null);
    }

    private C0690c(T t) {
        this.f436a = t;
    }

    /* renamed from: a */
    public static <T> C0689b<T> m534a(T t) {
        return new C0690c(C0691d.m537c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f436a;
    }
}
