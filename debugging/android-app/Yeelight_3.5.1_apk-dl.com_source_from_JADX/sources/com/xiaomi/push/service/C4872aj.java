package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C4539ba;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.service.C4932bx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.aj */
final class C4872aj extends C4932bx.C4933a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9449a;

    /* renamed from: a */
    final /* synthetic */ C4984t f9450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4872aj(String str, long j, XMPushService xMPushService, C4984t tVar) {
        super(str, j);
        this.f9449a = xMPushService;
        this.f9450a = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29965a(C4932bx bxVar) {
        C4539ba a = C4539ba.m12950a((Context) this.f9449a);
        String a2 = bxVar.mo30032a("MSAID", "msaid");
        String str = a.mo28768b() + a.mo28753a() + a.mo28769c() + a.mo28770d();
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(a2, str)) {
            bxVar.mo30034a("MSAID", "msaid", str);
            C4786ii iiVar = new C4786ii();
            iiVar.mo29599b(this.f9450a.f9744d);
            iiVar.mo29602c(C4770ht.ClientInfoUpdate.f8718a);
            iiVar.mo29593a(C4902bd.m15380a());
            iiVar.mo29595a((Map<String, String>) new HashMap());
            a.mo28767a((Map<String, String>) iiVar.mo29592a());
            byte[] a3 = C4797it.m14834a(C4870ah.m15193a(this.f9449a.getPackageName(), this.f9450a.f9744d, iiVar, C4760hj.Notification));
            XMPushService xMPushService = this.f9449a;
            xMPushService.mo29936a(xMPushService.getPackageName(), a3, true);
        }
    }
}
