package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p040h0.C3239j;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
final class C0844t0 extends C3239j {

    /* renamed from: a */
    final /* synthetic */ C0852v0 f779a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0844t0(C0852v0 v0Var, Looper looper) {
        super(looper);
        this.f779a = v0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C0852v0.m1118s(this.f779a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            C0852v0.m1117r(this.f779a);
        }
    }
}
