package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4778ia;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.af */
final class C4866af extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4783if f9442a;

    /* renamed from: a */
    final /* synthetic */ C4786ii f9443a;

    /* renamed from: a */
    final /* synthetic */ XMPushService f9444a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4866af(int i, C4786ii iiVar, C4783if ifVar, XMPushService xMPushService) {
        super(i);
        this.f9443a = iiVar;
        this.f9442a = ifVar;
        this.f9444a = xMPushService;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send ack message for clear push message.";
    }

    /* renamed from: a */
    public void m15177a() {
        try {
            C4778ia iaVar = new C4778ia();
            iaVar.mo29484c(C4770ht.CancelPushMessageACK.f8718a);
            iaVar.mo29479a(this.f9443a.mo29592a());
            iaVar.mo29478a(this.f9443a.mo29592a());
            iaVar.mo29482b(this.f9443a.mo29600b());
            iaVar.mo29489e(this.f9443a.mo29603c());
            iaVar.mo29477a(0);
            iaVar.mo29487d("success clear push message.");
            C4870ah.m15198a(this.f9444a, C4870ah.m15203b(this.f9442a.mo29567b(), this.f9442a.mo29558a(), iaVar, C4760hj.Notification));
        } catch (C4724gh e) {
            C4408b.m12483d("clear push message. " + e);
            this.f9444a.mo29929a(10, (Exception) e);
        }
    }
}
