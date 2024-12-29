package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.u */
final class C4931u extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4762ii f10195a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f10196a;

    /* renamed from: a */
    final /* synthetic */ String f10197a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4931u(int i, XMPushService xMPushService, C4762ii iiVar, String str) {
        super(i);
        this.f10196a = xMPushService;
        this.f10195a = iiVar;
        this.f10197a = str;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send app absent ack message for message.";
    }

    /* renamed from: a */
    public void m15848a() {
        try {
            C4762ii a = C4925p.m15817a((Context) this.f10196a, this.f10195a);
            a.mo25521a().mo25366a("absent_target_package", this.f10197a);
            C4933w.m15858a(this.f10196a, a);
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10196a.mo25869a(10, (Exception) e);
        }
    }
}
