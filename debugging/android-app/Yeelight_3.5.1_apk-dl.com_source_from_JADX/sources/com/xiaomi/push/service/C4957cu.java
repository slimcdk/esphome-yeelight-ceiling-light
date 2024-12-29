package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4509ae;
import com.xiaomi.push.C4713fx;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.cu */
class C4957cu extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9678a;

    /* renamed from: a */
    final /* synthetic */ String f9679a;

    /* renamed from: a */
    final /* synthetic */ byte[] f9680a;

    /* renamed from: b */
    final /* synthetic */ int f9681b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4957cu(XMPushService xMPushService, int i, int i2, String str, byte[] bArr) {
        super(i);
        this.f9678a = xMPushService;
        this.f9681b = i2;
        this.f9679a = str;
        this.f9680a = bArr;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "clear account cache.";
    }

    /* renamed from: a */
    public void m15541a() {
        C4985u.m15674a((Context) this.f9678a);
        C4906bg.mo30005a().mo30007a("5");
        C4509ae.m12844a(this.f9681b);
        XMPushService.m15050a(this.f9678a).mo29202c(C4713fx.mo29197a());
        C4408b.m12464a("clear account and start registration. " + this.f9679a);
        this.f9678a.mo29938a(this.f9680a, this.f9679a);
    }
}
