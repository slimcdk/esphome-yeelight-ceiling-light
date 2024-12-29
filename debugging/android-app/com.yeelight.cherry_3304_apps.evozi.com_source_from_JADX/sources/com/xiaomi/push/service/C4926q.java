package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.q */
final class C4926q extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4762ii f10178a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f10179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4926q(int i, XMPushService xMPushService, C4762ii iiVar) {
        super(i);
        this.f10179a = xMPushService;
        this.f10178a = iiVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send app absent message.";
    }

    /* renamed from: a */
    public void m15837a() {
        try {
            C4933w.m15858a(this.f10179a, C4933w.m15853a(this.f10178a.mo25530b(), this.f10178a.mo25521a()));
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10179a.mo25869a(10, (Exception) e);
        }
    }
}
