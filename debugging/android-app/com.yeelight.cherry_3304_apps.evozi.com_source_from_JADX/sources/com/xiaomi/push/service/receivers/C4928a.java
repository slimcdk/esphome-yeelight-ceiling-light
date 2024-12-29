package com.xiaomi.push.service.receivers;

import android.content.Context;

/* renamed from: com.xiaomi.push.service.receivers.a */
class C4928a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f10189a;

    /* renamed from: a */
    final /* synthetic */ NetworkStatusReceiver f10190a;

    C4928a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f10190a = networkStatusReceiver;
        this.f10189a = context;
    }

    public void run() {
        this.f10190a.m15840a(this.f10189a);
    }
}
