package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.wearable.internal.y1 */
final class C2517y1 implements C1422d<Status> {

    /* renamed from: a */
    private final C0620i<Void> f4927a;

    C2517y1(C0620i<Void> iVar) {
        this.f4927a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10888a(Object obj) {
        Status status = (Status) obj;
        int Q = status.mo10773Q();
        if (Q == 0 || Q == 4001) {
            this.f4927a.mo8668c(null);
        } else {
            mo13392b(status);
        }
    }

    /* renamed from: b */
    public final void mo13392b(Status status) {
        this.f4927a.mo8667b(new C1393b(status));
    }
}
