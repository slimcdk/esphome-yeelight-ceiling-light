package com.google.android.datatransport.runtime.time;

import dagger.internal.C10742b;
import dagger.internal.C10744d;

/* renamed from: com.google.android.datatransport.runtime.time.d */
public final class C1357d implements C10742b<C1354a> {

    /* renamed from: a */
    private static final C1357d f2490a = new C1357d();

    /* renamed from: a */
    public static C1357d m3563a() {
        return f2490a;
    }

    /* renamed from: c */
    public static C1354a m3564c() {
        C1354a b = C1355b.m3559b();
        C10744d.m26606c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public C1354a get() {
        return m3564c();
    }
}
