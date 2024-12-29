package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.u5 */
final class C1330u5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C1345v5 f1662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1330u5(C1345v5 v5Var, Handler handler) {
        super((Handler) null);
        this.f1662a = v5Var;
    }

    public final void onChange(boolean z) {
        this.f1662a.mo13430f();
    }
}
