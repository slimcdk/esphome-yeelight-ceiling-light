package com.google.android.datatransport.runtime.time;

import dagger.internal.C10742b;
import dagger.internal.C10744d;

/* renamed from: com.google.android.datatransport.runtime.time.c */
public final class C1356c implements C10742b<C1354a> {

    /* renamed from: a */
    private static final C1356c f2489a = new C1356c();

    /* renamed from: a */
    public static C1356c m3560a() {
        return f2489a;
    }

    /* renamed from: b */
    public static C1354a m3561b() {
        C1354a a = C1355b.m3558a();
        C10744d.m26606c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public C1354a get() {
        return m3561b();
    }
}
