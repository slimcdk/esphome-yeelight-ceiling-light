package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import javax.inject.C11584a;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
public final class C1324k implements C10742b<C1323j> {

    /* renamed from: a */
    private final C11584a<Context> f2415a;

    /* renamed from: b */
    private final C11584a<C1354a> f2416b;

    /* renamed from: c */
    private final C11584a<C1354a> f2417c;

    public C1324k(C11584a<Context> aVar, C11584a<C1354a> aVar2, C11584a<C1354a> aVar3) {
        this.f2415a = aVar;
        this.f2416b = aVar2;
        this.f2417c = aVar3;
    }

    /* renamed from: a */
    public static C1324k m3481a(C11584a<Context> aVar, C11584a<C1354a> aVar2, C11584a<C1354a> aVar3) {
        return new C1324k(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public C1323j get() {
        return new C1323j(this.f2415a.get(), this.f2416b.get(), this.f2417c.get());
    }
}
