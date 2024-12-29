package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.C4503al;

/* renamed from: com.xiaomi.push.am */
class C4506am extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4503al f8170a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4506am(C4503al alVar, Looper looper) {
        super(looper);
        this.f8170a = alVar;
    }

    public void handleMessage(Message message) {
        C4503al.C4505b bVar = (C4503al.C4505b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.mo24739a();
        } else if (i == 1) {
            bVar.mo24741c();
        }
        super.handleMessage(message);
    }
}
