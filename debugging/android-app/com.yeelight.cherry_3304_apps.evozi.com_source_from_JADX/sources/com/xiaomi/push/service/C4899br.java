package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.C4682ft;
import com.xiaomi.push.C4685fw;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.br */
class C4899br extends C4682ft {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10115a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4899br(XMPushService xMPushService, Map map, int i, String str, C4685fw fwVar) {
        super(map, i, str, fwVar);
        this.f10115a = xMPushService;
    }

    /* renamed from: a */
    public byte[] mo25160a() {
        try {
            C4632ek.C4634b bVar = new C4632ek.C4634b();
            bVar.mo24969a(C4884be.mo25947a().mo25947a());
            return bVar.mo24930a();
        } catch (Exception e) {
            C3989b.m10669a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
