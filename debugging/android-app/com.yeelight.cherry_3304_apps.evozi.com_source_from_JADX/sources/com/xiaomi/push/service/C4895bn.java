package com.xiaomi.push.service;

import com.xiaomi.push.C4680fs;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bn */
class C4895bn extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10111a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4895bn(XMPushService xMPushService, int i) {
        super(i);
        this.f10111a = xMPushService;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "disconnect for service destroy.";
    }

    /* renamed from: a */
    public void m15717a() {
        if (XMPushService.m15384a(this.f10111a) != null) {
            XMPushService.m15384a(this.f10111a).mo25151b(15, (Exception) null);
            C4680fs unused = this.f10111a.f9882a = null;
        }
    }
}
