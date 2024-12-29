package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.xiaomi.push.service.bq */
class C4898bq extends Handler {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10114a;

    C4898bq(XMPushService xMPushService) {
        this.f10114a = xMPushService;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i = message.what;
                if (i != 17) {
                    if (i == 18) {
                        Message obtain = Message.obtain((Handler) null, 0);
                        obtain.what = 18;
                        Bundle bundle = new Bundle();
                        bundle.putString("xmsf_region", XMPushService.m15384a(this.f10114a));
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    }
                } else if (message.obj != null) {
                    this.f10114a.onStart((Intent) message.obj, XMPushService.f9876a);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
