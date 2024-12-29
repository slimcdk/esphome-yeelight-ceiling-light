package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.wearable.internal.x1 */
final class C2514x1 implements C1422d<Status> {

    /* renamed from: a */
    private final C0620i<Boolean> f4924a;

    C2514x1(C0620i<Boolean> iVar) {
        this.f4924a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10888a(Object obj) {
        C0620i<Boolean> iVar;
        Boolean bool;
        Status status = (Status) obj;
        int Q = status.mo10773Q();
        if (Q == 0) {
            iVar = this.f4924a;
            bool = Boolean.TRUE;
        } else if (Q == 4002) {
            iVar = this.f4924a;
            bool = Boolean.FALSE;
        } else {
            mo13389b(status);
            return;
        }
        iVar.mo8668c(bool);
    }

    /* renamed from: b */
    public final void mo13389b(Status status) {
        this.f4924a.mo8667b(new C1393b(status));
    }
}
