package com.xiaomi.push.service;

import com.xiaomi.push.C4551bj;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.cs */
class C4955cs extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9675a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4955cs(XMPushService xMPushService, int i) {
        super(i);
        this.f9675a = xMPushService;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "prepare the mi push account.";
    }

    /* renamed from: a */
    public void m15538a() {
        C4870ah.m15197a(this.f9675a);
        if (C4551bj.m13000b(this.f9675a)) {
            this.f9675a.mo29937a(true);
        }
    }
}
