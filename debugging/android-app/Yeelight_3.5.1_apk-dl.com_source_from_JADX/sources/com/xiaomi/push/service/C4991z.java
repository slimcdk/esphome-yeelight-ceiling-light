package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.z */
final class C4991z extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9761a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9762a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4991z(int i, XMPushService xMPushService, C4783if ifVar) {
        super(i);
        this.f9762a = xMPushService;
        this.f9761a = ifVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send app absent message.";
    }

    /* renamed from: a */
    public void m15730a() {
        try {
            C4870ah.m15198a(this.f9762a, C4870ah.m15192a(this.f9761a.mo29567b(), this.f9761a.mo29558a()));
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9762a.mo29929a(10, (Exception) e);
        }
    }
}
