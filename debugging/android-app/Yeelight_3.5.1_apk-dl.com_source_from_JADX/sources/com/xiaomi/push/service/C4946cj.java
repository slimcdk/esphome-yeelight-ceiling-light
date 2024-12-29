package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.cj */
class C4946cj extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9664a;

    /* renamed from: a */
    final /* synthetic */ String f9665a;

    /* renamed from: a */
    final /* synthetic */ byte[] f9666a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4946cj(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f9664a = xMPushService;
        this.f9665a = str;
        this.f9666a = bArr;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "send mi push message";
    }

    /* renamed from: a */
    public void m15531a() {
        try {
            C4870ah.m15201a(this.f9664a, this.f9665a, this.f9666a);
        } catch (C4724gh e) {
            C4408b.m12478a((Throwable) e);
            this.f9664a.mo29929a(10, (Exception) e);
        }
    }
}
