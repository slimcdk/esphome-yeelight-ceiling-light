package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;

/* renamed from: com.xiaomi.push.service.ch */
final class C4944ch implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4786ii f9662a;

    C4944ch(C4786ii iiVar) {
        this.f9662a = iiVar;
    }

    public void run() {
        byte[] a = C4797it.m14834a(C4870ah.m15193a(this.f9662a.mo29603c(), this.f9662a.mo29600b(), this.f9662a, C4760hj.Notification));
        if (C4943cg.mo29275a() instanceof XMPushService) {
            ((XMPushService) C4943cg.mo29275a()).mo29936a(this.f9662a.mo29603c(), a, true);
        } else {
            C4408b.m12464a("UNDatas UploadNotificationDatas failed because not xmsf");
        }
    }
}
