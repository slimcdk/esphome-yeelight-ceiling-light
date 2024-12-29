package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bm */
class C4894bm extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10108a;

    /* renamed from: a */
    final /* synthetic */ String f10109a;

    /* renamed from: a */
    final /* synthetic */ byte[] f10110a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4894bm(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f10108a = xMPushService;
        this.f10109a = str;
        this.f10110a = bArr;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "send mi push message";
    }

    /* renamed from: a */
    public void m15715a() {
        try {
            C4933w.m15861a(this.f10108a, this.f10109a, this.f10110a);
        } catch (C4694gd e) {
            C3989b.m10678a((Throwable) e);
            this.f10108a.mo25869a(10, (Exception) e);
        }
    }
}
