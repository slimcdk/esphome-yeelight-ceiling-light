package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ar */
class C4868ar extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4860ap.C4862b.C4865c f10014a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4868ar(C4860ap.C4862b.C4865c cVar, int i) {
        super(i);
        this.f10014a = cVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "clear peer job";
    }

    /* renamed from: a */
    public void m15630a() {
        C4860ap.C4862b.C4865c cVar = this.f10014a;
        if (cVar.f10006a == cVar.f10007a.f9982a) {
            C3989b.m10679b("clean peer, chid = " + this.f10014a.f10007a.f9998g);
            this.f10014a.f10007a.f9982a = null;
        }
    }
}
