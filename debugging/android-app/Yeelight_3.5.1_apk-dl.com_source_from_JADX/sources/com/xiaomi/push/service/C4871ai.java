package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.service.C4932bx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.ai */
final class C4871ai extends C4932bx.C4933a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9447a;

    /* renamed from: a */
    final /* synthetic */ C4984t f9448a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4871ai(String str, long j, XMPushService xMPushService, C4984t tVar) {
        super(str, j);
        this.f9447a = xMPushService;
        this.f9448a = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29965a(C4932bx bxVar) {
        String a = bxVar.mo30032a("GAID", "gaid");
        String a2 = C4805j.m14863a((Context) this.f9447a);
        if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a, a2)) {
            bxVar.mo30034a("GAID", "gaid", a2);
            C4786ii iiVar = new C4786ii();
            iiVar.mo29599b(this.f9448a.f9744d);
            iiVar.mo29602c(C4770ht.ClientInfoUpdate.f8718a);
            iiVar.mo29593a(C4902bd.m15380a());
            iiVar.mo29595a((Map<String, String>) new HashMap());
            iiVar.mo29592a().put("gaid", a2);
            byte[] a3 = C4797it.m14834a(C4870ah.m15193a(this.f9447a.getPackageName(), this.f9448a.f9744d, iiVar, C4760hj.Notification));
            XMPushService xMPushService = this.f9447a;
            xMPushService.mo29936a(xMPushService.getPackageName(), a3, true);
        }
    }
}
