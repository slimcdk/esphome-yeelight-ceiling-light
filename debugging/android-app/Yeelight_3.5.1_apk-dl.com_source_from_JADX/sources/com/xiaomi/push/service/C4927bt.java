package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4759hi;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bt */
class C4927bt extends XMPushService.C4849j {

    /* renamed from: a */
    private C4695fl f9625a;

    /* renamed from: a */
    private XMPushService f9626a = null;

    public C4927bt(XMPushService xMPushService, C4695fl flVar) {
        super(4);
        this.f9626a = xMPushService;
        this.f9625a = flVar;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send a message.";
    }

    /* renamed from: a */
    public void m15462a() {
        try {
            C4695fl flVar = this.f9625a;
            if (flVar != null) {
                this.f9626a.mo29930a(flVar);
                if (this.f9625a.f8170a != null && C4759hi.m14180a(this.f9626a, 1)) {
                    this.f9625a.f8170a.f9476d = System.currentTimeMillis();
                    C4935bz.m15497a("category_coord_up", "coord_up", "com.xiaomi.xmsf", this.f9625a.f8170a);
                }
            }
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9626a.mo29929a(10, (Exception) e);
        }
    }
}
