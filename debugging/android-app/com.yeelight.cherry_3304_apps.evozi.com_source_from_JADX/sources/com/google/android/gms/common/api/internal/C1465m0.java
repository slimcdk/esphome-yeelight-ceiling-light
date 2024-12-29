package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C1697h;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
final class C1465m0 extends C1697h {

    /* renamed from: a */
    private final /* synthetic */ C1453j0 f2769a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1465m0(C1453j0 j0Var, Looper looper) {
        super(looper);
        this.f2769a = j0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f2769a.m3886r();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            this.f2769a.m3882n();
        }
    }
}
