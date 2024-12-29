package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import dagger.internal.C10742b;
import javax.inject.C11584a;

/* renamed from: com.google.android.datatransport.runtime.backends.m */
public final class C1327m implements C10742b<C1325l> {

    /* renamed from: a */
    private final C11584a<Context> f2423a;

    /* renamed from: b */
    private final C11584a<C1323j> f2424b;

    public C1327m(C11584a<Context> aVar, C11584a<C1323j> aVar2) {
        this.f2423a = aVar;
        this.f2424b = aVar2;
    }

    /* renamed from: a */
    public static C1327m m3488a(C11584a<Context> aVar, C11584a<C1323j> aVar2) {
        return new C1327m(aVar, aVar2);
    }

    /* renamed from: b */
    public C1325l get() {
        return new C1325l(this.f2423a.get(), this.f2424b.get());
    }
}
