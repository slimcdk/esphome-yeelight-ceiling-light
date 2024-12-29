package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
final class C1839j1 extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C1808h1 f3498a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1839j1(C1808h1 h1Var, Handler handler) {
        super((Handler) null);
        this.f3498a = h1Var;
    }

    public final void onChange(boolean z) {
        this.f3498a.mo11697d();
    }
}
