package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.v */
final class C4932v extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4762ii f10198a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f10199a;

    /* renamed from: a */
    final /* synthetic */ String f10200a;

    /* renamed from: b */
    final /* synthetic */ String f10201b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4932v(int i, XMPushService xMPushService, C4762ii iiVar, String str, String str2) {
        super(i);
        this.f10199a = xMPushService;
        this.f10198a = iiVar;
        this.f10200a = str;
        this.f10201b = str2;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send wrong message ack for message.";
    }

    /* renamed from: a */
    public void m15850a() {
        try {
            C4762ii a = C4925p.m15817a((Context) this.f10199a, this.f10198a);
            a.f9489a.mo25366a(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, this.f10200a);
            a.f9489a.mo25366a("reason", this.f10201b);
            C4933w.m15858a(this.f10199a, a);
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10199a.mo25869a(10, (Exception) e);
        }
    }
}
