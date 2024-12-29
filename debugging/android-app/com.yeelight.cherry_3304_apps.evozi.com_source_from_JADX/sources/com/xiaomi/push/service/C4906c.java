package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.c */
class C4906c extends XMPushService.C4827i {

    /* renamed from: a */
    private XMPushService f10126a = null;

    /* renamed from: a */
    private C4673fl[] f10127a;

    public C4906c(XMPushService xMPushService, C4673fl[] flVarArr) {
        super(4);
        this.f10126a = xMPushService;
        this.f10127a = flVarArr;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "batch send message.";
    }

    /* renamed from: a */
    public void m15727a() {
        try {
            if (this.f10127a != null) {
                this.f10126a.mo25879a(this.f10127a);
            }
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10126a.mo25869a(10, (Exception) e);
        }
    }
}
