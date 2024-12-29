package com.xiaomi.push.service;

import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bj */
class C4915bj extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4906bg.C4908b.C4911c f9564a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4915bj(C4906bg.C4908b.C4911c cVar, int i) {
        super(i);
        this.f9564a = cVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "check peer job";
    }

    /* renamed from: a */
    public void m15430a() {
        C4906bg a = C4906bg.mo30005a();
        C4906bg.C4908b bVar = this.f9564a.f9556a;
        if (a.mo30006a(bVar.f9547g, bVar.f9541b).f9531a == null) {
            XMPushService a2 = C4906bg.C4908b.m15407a(C4906bg.C4908b.this);
            C4906bg.C4908b bVar2 = this.f9564a.f9556a;
            a2.mo29935a(bVar2.f9547g, bVar2.f9541b, 2, (String) null, (String) null);
        }
    }
}
