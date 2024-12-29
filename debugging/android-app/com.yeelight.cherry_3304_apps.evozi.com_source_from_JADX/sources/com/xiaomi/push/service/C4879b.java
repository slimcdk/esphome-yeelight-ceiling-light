package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.service.b */
public class C4879b extends C4498ai.C4499a {

    /* renamed from: a */
    private C4765il f10070a;

    /* renamed from: a */
    private WeakReference<XMPushService> f10071a;

    /* renamed from: a */
    private boolean f10072a = false;

    public C4879b(C4765il ilVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f10070a = ilVar;
        this.f10071a = weakReference;
        this.f10072a = z;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 22;
    }

    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f10071a;
        if (weakReference != null && this.f10070a != null && (xMPushService = (XMPushService) weakReference.get()) != null) {
            this.f10070a.mo25555a(C4858an.m15586a());
            this.f10070a.mo25558a(false);
            C3989b.m10680c("MoleInfo aw_ping : send aw_Ping msg " + this.f10070a.mo25560a());
            try {
                String c = this.f10070a.mo25566c();
                xMPushService.mo25876a(c, C4776iw.m15225a(C4933w.m15854a(c, this.f10070a.mo25563b(), this.f10070a, C4739hm.Notification)), this.f10072a);
            } catch (Exception e) {
                C3989b.m10681d("MoleInfo aw_ping : send help app ping error" + e.toString());
            }
        }
    }
}
