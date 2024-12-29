package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
class C1323j {

    /* renamed from: a */
    private final Context f2412a;

    /* renamed from: b */
    private final C1354a f2413b;

    /* renamed from: c */
    private final C1354a f2414c;

    @Inject
    C1323j(Context context, @WallTime C1354a aVar, @Monotonic C1354a aVar2) {
        this.f2412a = context;
        this.f2413b = aVar;
        this.f2414c = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1322i mo10227a(String str) {
        return C1322i.m3475a(this.f2412a, this.f2413b, this.f2414c, str);
    }
}
