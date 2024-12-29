package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bt */
class C4901bt extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10117a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4901bt(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f10117a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean a = XMPushService.m15384a(this.f10117a);
        C3989b.m10669a("ExtremePowerMode:" + a);
        if (a) {
            XMPushService xMPushService = this.f10117a;
            xMPushService.mo25871a((XMPushService.C4827i) new XMPushService.C4824f(23, (Exception) null));
            return;
        }
        this.f10117a.mo25877a(true);
    }
}
