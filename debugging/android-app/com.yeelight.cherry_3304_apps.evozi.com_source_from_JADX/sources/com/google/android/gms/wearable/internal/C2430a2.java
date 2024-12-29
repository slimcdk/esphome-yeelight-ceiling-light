package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C1422d;

/* renamed from: com.google.android.gms.wearable.internal.a2 */
class C2430a2<T> extends C2427a {

    /* renamed from: a */
    private C1422d<T> f4863a;

    public C2430a2(C1422d<T> dVar) {
        this.f4863a = dVar;
    }

    /* renamed from: c */
    public final void mo13286c(T t) {
        C1422d<T> dVar = this.f4863a;
        if (dVar != null) {
            dVar.mo10888a(t);
            this.f4863a = null;
        }
    }
}
