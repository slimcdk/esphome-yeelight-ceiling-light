package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ba */
class C4880ba extends XMPushService.C4827i {

    /* renamed from: a */
    private C4673fl f10073a;

    /* renamed from: a */
    private XMPushService f10074a = null;

    public C4880ba(XMPushService xMPushService, C4673fl flVar) {
        super(4);
        this.f10074a = xMPushService;
        this.f10073a = flVar;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send a message.";
    }

    /* renamed from: a */
    public void m15662a() {
        try {
            if (this.f10073a != null) {
                this.f10074a.mo25870a(this.f10073a);
            }
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10074a.mo25869a(10, (Exception) e);
        }
    }
}
