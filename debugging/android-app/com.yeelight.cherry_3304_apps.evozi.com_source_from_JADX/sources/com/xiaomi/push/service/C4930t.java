package com.xiaomi.push.service;

import android.content.Context;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.t */
final class C4930t extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4762ii f10193a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f10194a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4930t(int i, XMPushService xMPushService, C4762ii iiVar) {
        super(i);
        this.f10194a = xMPushService;
        this.f10193a = iiVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send ack message for unrecognized new miui message.";
    }

    /* renamed from: a */
    public void m15846a() {
        try {
            C4762ii a = C4925p.m15817a((Context) this.f10194a, this.f10193a);
            a.mo25521a().mo25366a("miui_message_unrecognized", TimerCodec.ENABLE);
            C4933w.m15858a(this.f10194a, a);
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10194a.mo25869a(10, (Exception) e);
        }
    }
}
