package com.xiaomi.push.service.receivers;

import android.content.Context;

/* renamed from: com.xiaomi.push.service.receivers.a */
class C4982a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f9734a;

    /* renamed from: a */
    final /* synthetic */ NetworkStatusReceiver f9735a;

    C4982a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f9735a = networkStatusReceiver;
        this.f9734a = context;
    }

    public void run() {
        this.f9735a.m15663a(this.f9734a);
    }
}
