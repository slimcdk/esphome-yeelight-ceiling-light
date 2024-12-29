package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C4860ap;

/* renamed from: com.xiaomi.push.service.z */
final class C4936z implements C4860ap.C4862b.C4863a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10206a;

    C4936z(XMPushService xMPushService) {
        this.f10206a = xMPushService;
    }

    /* renamed from: a */
    public void mo25238a(C4860ap.C4866c cVar, C4860ap.C4866c cVar2, int i) {
        if (cVar2 == C4860ap.C4866c.binded) {
            C4924o.m15812a(this.f10206a);
            C4924o.m15814b(this.f10206a);
        } else if (cVar2 == C4860ap.C4866c.unbind) {
            C4924o.m15810a(this.f10206a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
