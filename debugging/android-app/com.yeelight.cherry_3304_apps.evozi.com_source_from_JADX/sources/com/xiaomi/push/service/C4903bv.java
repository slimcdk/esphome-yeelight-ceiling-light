package com.xiaomi.push.service;

import com.xiaomi.push.C4521az;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bv */
class C4903bv extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10119a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4903bv(XMPushService xMPushService, int i) {
        super(i);
        this.f10119a = xMPushService;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "prepare the mi push account.";
    }

    /* renamed from: a */
    public void m15722a() {
        C4933w.m15857a(this.f10119a);
        if (C4521az.m13366b(this.f10119a)) {
            this.f10119a.mo25877a(true);
        }
    }
}
