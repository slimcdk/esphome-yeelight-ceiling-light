package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.service.C4887bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.x */
final class C4934x extends C4887bg.C4888a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10202a;

    /* renamed from: a */
    final /* synthetic */ C4919k f10203a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4934x(String str, long j, XMPushService xMPushService, C4919k kVar) {
        super(str, j);
        this.f10202a = xMPushService;
        this.f10203a = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25953a(C4887bg bgVar) {
        String a = bgVar.mo25950a("GAID", "gaid");
        String b = C4753i.m14747b((Context) this.f10202a);
        C3989b.m10680c("gaid :" + b);
        if (!TextUtils.isEmpty(b) && !TextUtils.equals(a, b)) {
            bgVar.mo25952a("GAID", "gaid", b);
            C4765il ilVar = new C4765il();
            ilVar.mo25562b(this.f10203a.f10161d);
            ilVar.mo25565c(C4749hw.ClientInfoUpdate.f9252a);
            ilVar.mo25555a(C4858an.m15586a());
            ilVar.mo25557a((Map<String, String>) new HashMap());
            ilVar.mo25560a().put("gaid", b);
            byte[] a2 = C4776iw.m15225a(C4933w.m15854a(this.f10202a.getPackageName(), this.f10203a.f10161d, ilVar, C4739hm.Notification));
            XMPushService xMPushService = this.f10202a;
            xMPushService.mo25876a(xMPushService.getPackageName(), a2, true);
        }
    }
}
