package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.r */
final class C4927r extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4762ii f10180a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f10181a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4927r(int i, XMPushService xMPushService, C4762ii iiVar) {
        super(i);
        this.f10181a = xMPushService;
        this.f10180a = iiVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send ack message for message.";
    }

    /* renamed from: a */
    public void m15839a() {
        try {
            C4933w.m15858a(this.f10181a, C4925p.m15817a((Context) this.f10181a, this.f10180a));
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10181a.mo25869a(10, (Exception) e);
        }
    }
}
