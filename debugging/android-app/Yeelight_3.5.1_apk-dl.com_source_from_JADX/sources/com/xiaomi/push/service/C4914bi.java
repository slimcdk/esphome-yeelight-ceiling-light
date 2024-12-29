package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bi */
class C4914bi extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4906bg.C4908b.C4911c f9563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4914bi(C4906bg.C4908b.C4911c cVar, int i) {
        super(i);
        this.f9563a = cVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "clear peer job";
    }

    /* renamed from: a */
    public void m15428a() {
        C4906bg.C4908b.C4911c cVar = this.f9563a;
        if (cVar.f9555a == cVar.f9556a.f9531a) {
            C4408b.m12481b("clean peer, chid = " + this.f9563a.f9556a.f9547g);
            this.f9563a.f9556a.f9531a = null;
        }
    }
}
