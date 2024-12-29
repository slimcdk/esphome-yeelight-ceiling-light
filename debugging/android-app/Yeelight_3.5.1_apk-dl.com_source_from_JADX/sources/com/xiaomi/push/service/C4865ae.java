package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ae */
final class C4865ae extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9438a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9439a;

    /* renamed from: a */
    final /* synthetic */ String f9440a;

    /* renamed from: b */
    final /* synthetic */ String f9441b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4865ae(int i, XMPushService xMPushService, C4783if ifVar, String str, String str2) {
        super(i);
        this.f9439a = xMPushService;
        this.f9438a = ifVar;
        this.f9440a = str;
        this.f9441b = str2;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send wrong message ack for message.";
    }

    /* renamed from: a */
    public void m15175a() {
        try {
            C4783if a = C4990y.m15705a((Context) this.f9439a, this.f9438a);
            a.f8948a.mo29397a(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, this.f9440a);
            a.f8948a.mo29397a("reason", this.f9441b);
            C4870ah.m15198a(this.f9439a, a);
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9439a.mo29929a(10, (Exception) e);
        }
    }
}
