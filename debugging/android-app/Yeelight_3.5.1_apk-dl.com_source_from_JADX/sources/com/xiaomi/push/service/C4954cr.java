package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.cr */
class C4954cr extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9674a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4954cr(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f9674a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean a = XMPushService.m15050a(this.f9674a);
        C4408b.m12464a("SuperPowerMode:" + a);
        XMPushService.m15050a(this.f9674a);
        if (a) {
            XMPushService xMPushService = this.f9674a;
            xMPushService.mo29931a((XMPushService.C4849j) new XMPushService.C4846g(24, (Exception) null));
            return;
        }
        this.f9674a.mo29937a(true);
    }
}
