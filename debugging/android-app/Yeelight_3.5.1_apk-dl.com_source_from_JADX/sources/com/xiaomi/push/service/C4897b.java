package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.service.b */
public class C4897b extends C4516al.C4517a {

    /* renamed from: a */
    private C4786ii f9512a;

    /* renamed from: a */
    private WeakReference<XMPushService> f9513a;

    /* renamed from: a */
    private boolean f9514a = false;

    public C4897b(C4786ii iiVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f9512a = iiVar;
        this.f9513a = weakReference;
        this.f9514a = z;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "22";
    }

    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f9513a;
        if (weakReference != null && this.f9512a != null && (xMPushService = (XMPushService) weakReference.get()) != null) {
            this.f9512a.mo29593a(C4902bd.m15380a());
            this.f9512a.mo29596a(false);
            C4408b.m12482c("MoleInfo aw_ping : send aw_Ping msg " + this.f9512a.mo29592a());
            try {
                String c = this.f9512a.mo29603c();
                xMPushService.mo29936a(c, C4797it.m14834a(C4870ah.m15193a(c, this.f9512a.mo29600b(), this.f9512a, C4760hj.Notification)), this.f9514a);
            } catch (Exception e) {
                C4408b.m12483d("MoleInfo aw_ping : send help app ping error" + e.toString());
            }
        }
    }
}
