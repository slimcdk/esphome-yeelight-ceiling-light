package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C4906bg;

/* renamed from: com.xiaomi.push.service.ak */
final class C4873ak implements C4906bg.C4908b.C4909a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9451a;

    C4873ak(XMPushService xMPushService) {
        this.f9451a = xMPushService;
    }

    /* renamed from: a */
    public void mo29132a(C4906bg.C4912c cVar, C4906bg.C4912c cVar2, int i) {
        if (cVar2 == C4906bg.C4912c.binded) {
            C4989x.m15701a(this.f9451a, true);
            C4989x.m15700a(this.f9451a);
        } else if (cVar2 == C4906bg.C4912c.unbind) {
            C4408b.m12464a("onChange unbind");
            C4989x.m15698a(this.f9451a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
