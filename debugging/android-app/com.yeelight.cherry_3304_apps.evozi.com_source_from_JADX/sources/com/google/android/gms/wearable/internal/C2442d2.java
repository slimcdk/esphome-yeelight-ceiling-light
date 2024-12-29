package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C1422d;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.wearable.internal.d2 */
final class C2442d2 extends C2430a2<Object> {

    /* renamed from: b */
    private final List<FutureTask<Boolean>> f4871b;

    C2442d2(C1422d<Object> dVar, List<FutureTask<Boolean>> list) {
        super(dVar);
        this.f4871b = list;
    }

    /* renamed from: n */
    public final void mo13277n(zzfu zzfu) {
        mo13286c(new C2479n(C2508v1.m8082a(zzfu.f4993a), zzfu.f4994b));
        if (zzfu.f4993a != 0) {
            for (FutureTask<Boolean> cancel : this.f4871b) {
                cancel.cancel(true);
            }
        }
    }
}
