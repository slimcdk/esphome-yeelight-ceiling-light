package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.j */
class C4918j extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4917i f10153a;

    /* renamed from: a */
    final /* synthetic */ String f10154a;

    /* renamed from: a */
    final /* synthetic */ List f10155a;

    /* renamed from: b */
    final /* synthetic */ String f10156b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4918j(C4917i iVar, int i, String str, List list, String str2) {
        super(i);
        this.f10153a = iVar;
        this.f10154a = str;
        this.f10155a = list;
        this.f10156b = str2;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "Send tiny data.";
    }

    /* renamed from: a */
    public void m15783a() {
        String a = this.f10153a.m15780a(this.f10154a);
        ArrayList<C4765il> a2 = C4890bi.m15703a(this.f10155a, this.f10154a, a, 32768);
        if (a2 != null) {
            Iterator<C4765il> it = a2.iterator();
            while (it.hasNext()) {
                C4765il next = it.next();
                next.mo25561a("uploadWay", "longXMPushService");
                C4762ii a3 = C4933w.m15854a(this.f10154a, a, next, C4739hm.Notification);
                if (!TextUtils.isEmpty(this.f10156b) && !TextUtils.equals(this.f10154a, this.f10156b)) {
                    if (a3.mo25521a() == null) {
                        C4752hz hzVar = new C4752hz();
                        hzVar.mo25364a("-1");
                        a3.mo25523a(hzVar);
                    }
                    a3.mo25521a().mo25371b("ext_traffic_source_pkg", this.f10156b);
                }
                this.f10153a.f10152a.mo25876a(this.f10154a, C4776iw.m15225a(a3), true);
            }
            return;
        }
        C3989b.m10681d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
    }
}
