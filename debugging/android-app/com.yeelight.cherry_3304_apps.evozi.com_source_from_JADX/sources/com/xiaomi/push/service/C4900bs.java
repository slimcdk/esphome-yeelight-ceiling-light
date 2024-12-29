package com.xiaomi.push.service;

import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bs */
class C4900bs implements C4860ap.C4861a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10116a;

    C4900bs(XMPushService xMPushService) {
        this.f10116a = xMPushService;
    }

    /* renamed from: a */
    public void mo25928a() {
        XMPushService.m15384a(this.f10116a);
        if (C4860ap.mo25920a().mo25920a() <= 0) {
            XMPushService xMPushService = this.f10116a;
            xMPushService.mo25871a((XMPushService.C4827i) new XMPushService.C4824f(12, (Exception) null));
        }
    }
}
