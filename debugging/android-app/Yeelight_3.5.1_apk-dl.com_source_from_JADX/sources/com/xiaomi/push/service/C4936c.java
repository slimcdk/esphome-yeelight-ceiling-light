package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.c */
class C4936c extends XMPushService.C4849j {

    /* renamed from: a */
    private XMPushService f9647a = null;

    /* renamed from: a */
    private C4695fl[] f9648a;

    public C4936c(XMPushService xMPushService, C4695fl[] flVarArr) {
        super(4);
        this.f9647a = xMPushService;
        this.f9648a = flVarArr;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "batch send message.";
    }

    /* renamed from: a */
    public void m15501a() {
        try {
            C4695fl[] flVarArr = this.f9648a;
            if (flVarArr != null) {
                this.f9647a.mo29939a(flVarArr);
            }
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9647a.mo29929a(10, (Exception) e);
        }
    }
}
