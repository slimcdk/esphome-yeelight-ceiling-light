package com.xiaomi.push.service;

import android.content.Context;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ab */
final class C4862ab extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9431a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9432a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4862ab(int i, XMPushService xMPushService, C4783if ifVar) {
        super(i);
        this.f9432a = xMPushService;
        this.f9431a = ifVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send ack message for obsleted message.";
    }

    /* renamed from: a */
    public void m15169a() {
        try {
            C4783if a = C4990y.m15705a((Context) this.f9432a, this.f9431a);
            a.mo29558a().mo29397a("message_obsleted", TimerCodec.ENABLE);
            C4870ah.m15198a(this.f9432a, a);
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9432a.mo29929a(10, (Exception) e);
        }
    }
}
