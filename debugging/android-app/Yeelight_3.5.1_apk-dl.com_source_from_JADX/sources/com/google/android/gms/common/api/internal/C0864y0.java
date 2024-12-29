package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p040h0.C3239j;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
final class C0864y0 extends C3239j {

    /* renamed from: a */
    final /* synthetic */ C0868z0 f852a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0864y0(C0868z0 z0Var, Looper looper) {
        super(looper);
        this.f852a = z0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C0860x0) message.obj).mo12093b(this.f852a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
