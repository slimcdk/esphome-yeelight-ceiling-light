package com.xiaomi.push.service;

import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.aq */
class C4867aq implements C4860ap.C4862b.C4863a {

    /* renamed from: a */
    final /* synthetic */ C4860ap.C4862b f10013a;

    C4867aq(C4860ap.C4862b bVar) {
        this.f10013a = bVar;
    }

    /* renamed from: a */
    public void mo25238a(C4860ap.C4866c cVar, C4860ap.C4866c cVar2, int i) {
        if (cVar2 == C4860ap.C4866c.binding) {
            C4860ap.C4862b.m15609a(this.f10013a).mo25872a((XMPushService.C4827i) C4860ap.C4862b.m15609a(this.f10013a), (long) MiStatInterface.MIN_UPLOAD_INTERVAL);
        } else {
            C4860ap.C4862b.m15609a(this.f10013a).mo25881b((XMPushService.C4827i) C4860ap.C4862b.m15609a(this.f10013a));
        }
    }
}
