package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C4516au;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.service.C4887bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.y */
final class C4935y extends C4887bg.C4888a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10204a;

    /* renamed from: a */
    final /* synthetic */ C4919k f10205a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4935y(String str, long j, XMPushService xMPushService, C4919k kVar) {
        super(str, j);
        this.f10204a = xMPushService;
        this.f10205a = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25953a(C4887bg bgVar) {
        C4516au a = C4516au.m13333a((Context) this.f10204a);
        String a2 = bgVar.mo25950a("MSAID", "msaid");
        String str = a.mo24744a() + a.mo24745b() + a.mo24746c() + a.mo24747d();
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(a2, str)) {
            bgVar.mo25952a("MSAID", "msaid", str);
            C4765il ilVar = new C4765il();
            ilVar.mo25562b(this.f10205a.f10161d);
            ilVar.mo25565c(C4749hw.ClientInfoUpdate.f9252a);
            ilVar.mo25555a(C4858an.m15586a());
            ilVar.mo25557a((Map<String, String>) new HashMap());
            a.mo24750a((Map<String, String>) ilVar.mo25560a());
            byte[] a3 = C4776iw.m15225a(C4933w.m15854a(this.f10204a.getPackageName(), this.f10205a.f10161d, ilVar, C4739hm.Notification));
            XMPushService xMPushService = this.f10204a;
            xMPushService.mo25876a(xMPushService.getPackageName(), a3, true);
        }
    }
}
