package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ad */
final class C4864ad extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9435a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9436a;

    /* renamed from: a */
    final /* synthetic */ String f9437a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4864ad(int i, XMPushService xMPushService, C4783if ifVar, String str) {
        super(i);
        this.f9436a = xMPushService;
        this.f9435a = ifVar;
        this.f9437a = str;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send app absent ack message for message.";
    }

    /* renamed from: a */
    public void m15173a() {
        try {
            C4783if a = C4990y.m15705a((Context) this.f9436a, this.f9435a);
            a.mo29558a().mo29397a("absent_target_package", this.f9437a);
            C4870ah.m15198a(this.f9436a, a);
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9436a.mo29929a(10, (Exception) e);
        }
    }
}
