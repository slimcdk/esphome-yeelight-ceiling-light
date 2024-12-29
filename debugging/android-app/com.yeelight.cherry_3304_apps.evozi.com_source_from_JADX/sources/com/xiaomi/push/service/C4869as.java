package com.xiaomi.push.service;

import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.as */
class C4869as extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4860ap.C4862b.C4865c f10015a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4869as(C4860ap.C4862b.C4865c cVar, int i) {
        super(i);
        this.f10015a = cVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "check peer job";
    }

    /* renamed from: a */
    public void m15632a() {
        C4860ap a = C4860ap.mo25920a();
        C4860ap.C4862b bVar = this.f10015a.f10007a;
        if (a.mo25921a(bVar.f9998g, bVar.f9992b).f9982a == null) {
            XMPushService a2 = C4860ap.C4862b.m15609a(C4860ap.C4862b.this);
            C4860ap.C4862b bVar2 = this.f10015a.f10007a;
            a2.mo25875a(bVar2.f9998g, bVar2.f9992b, 2, (String) null, (String) null);
        }
    }
}
