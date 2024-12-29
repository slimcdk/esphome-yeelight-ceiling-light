package com.xiaomi.push.service;

import android.content.Context;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ac */
final class C4863ac extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9433a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9434a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4863ac(int i, XMPushService xMPushService, C4783if ifVar) {
        super(i);
        this.f9434a = xMPushService;
        this.f9433a = ifVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send ack message for unrecognized new miui message.";
    }

    /* renamed from: a */
    public void m15171a() {
        try {
            C4783if a = C4990y.m15705a((Context) this.f9434a, this.f9433a);
            a.mo29558a().mo29397a("miui_message_unrecognized", TimerCodec.ENABLE);
            C4870ah.m15198a(this.f9434a, a);
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9434a.mo29929a(10, (Exception) e);
        }
    }
}
