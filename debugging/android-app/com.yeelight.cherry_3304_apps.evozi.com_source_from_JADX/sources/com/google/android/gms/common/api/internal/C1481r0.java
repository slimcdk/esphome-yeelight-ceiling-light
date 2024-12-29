package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C1697h;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
final class C1481r0 extends C1697h {

    /* renamed from: a */
    private final /* synthetic */ C1475p0 f2807a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1481r0(C1475p0 p0Var, Looper looper) {
        super(looper);
        this.f2807a = p0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C1478q0) message.obj).mo11007b(this.f2807a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
