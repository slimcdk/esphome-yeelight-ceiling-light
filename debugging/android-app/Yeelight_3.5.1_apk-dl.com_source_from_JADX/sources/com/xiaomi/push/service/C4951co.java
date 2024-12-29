package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.xiaomi.push.service.co */
class C4951co extends Handler {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9671a;

    C4951co(XMPushService xMPushService) {
        this.f9671a = xMPushService;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i = message.what;
                if (i == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f9671a.onStart((Intent) obj, 1);
                    }
                } else if (i == 18) {
                    Message obtain = Message.obtain((Handler) null, 0);
                    obtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", XMPushService.m15050a(this.f9671a));
                    obtain.setData(bundle);
                    message.replyTo.send(obtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
