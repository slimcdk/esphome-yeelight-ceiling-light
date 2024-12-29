package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4713fx;
import com.xiaomi.push.C4717ga;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.cp */
class C4952cp extends C4713fx {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9672a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4952cp(XMPushService xMPushService, Map map, int i, String str, C4717ga gaVar) {
        super(map, i, str, gaVar);
        this.f9672a = xMPushService;
    }

    /* renamed from: a */
    public byte[] mo29197a() {
        try {
            C4637dx.C4639b bVar = new C4637dx.C4639b();
            bVar.mo28957a(C4929bv.mo30029a().mo30029a());
            return bVar.mo28924a();
        } catch (Exception e) {
            C4408b.m12464a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
