package com.xiaomi.push.service;

import com.xiaomi.push.C4711fw;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ck */
class C4947ck extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9667a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4947ck(XMPushService xMPushService, int i) {
        super(i);
        this.f9667a = xMPushService;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "disconnect for service destroy.";
    }

    /* renamed from: a */
    public void m15533a() {
        if (XMPushService.m15050a(this.f9667a) != null) {
            XMPushService.m15050a(this.f9667a).mo29189b(15, (Exception) null);
            C4711fw unused = this.f9667a.f9370a = null;
        }
    }
}
