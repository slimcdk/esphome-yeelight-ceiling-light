package com.xiaomi.push.service;

import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.cq */
class C4953cq implements C4906bg.C4907a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9673a;

    C4953cq(XMPushService xMPushService) {
        this.f9673a = xMPushService;
    }

    /* renamed from: a */
    public void mo30013a() {
        XMPushService.m15050a(this.f9673a);
        if (C4906bg.mo30005a().mo30005a() <= 0) {
            XMPushService xMPushService = this.f9673a;
            xMPushService.mo29931a((XMPushService.C4849j) new XMPushService.C4846g(12, (Exception) null));
        }
    }
}
