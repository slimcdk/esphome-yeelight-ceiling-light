package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.C4521ao;

/* renamed from: com.xiaomi.push.ap */
class C4524ap extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4521ao f7566a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4524ap(C4521ao aoVar, Looper looper) {
        super(looper);
        this.f7566a = aoVar;
    }

    public void handleMessage(Message message) {
        C4521ao.C4523b bVar = (C4521ao.C4523b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.mo28748a();
        } else if (i == 1) {
            bVar.mo28750c();
        }
        super.handleMessage(message);
    }
}
