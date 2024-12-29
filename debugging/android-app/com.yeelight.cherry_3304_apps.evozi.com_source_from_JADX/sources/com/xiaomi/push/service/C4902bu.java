package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bu */
class C4902bu extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10118a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4902bu(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f10118a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean b = XMPushService.m15403b(this.f10118a);
        C3989b.m10669a("SuperPowerMode:" + b);
        XMPushService.m15384a(this.f10118a);
        if (b) {
            XMPushService xMPushService = this.f10118a;
            xMPushService.mo25871a((XMPushService.C4827i) new XMPushService.C4824f(24, (Exception) null));
            return;
        }
        this.f10118a.mo25877a(true);
    }
}
