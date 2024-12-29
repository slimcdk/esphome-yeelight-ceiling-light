package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.s */
class C4983s extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4981r f9736a;

    /* renamed from: a */
    final /* synthetic */ String f9737a;

    /* renamed from: a */
    final /* synthetic */ List f9738a;

    /* renamed from: b */
    final /* synthetic */ String f9739b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4983s(C4981r rVar, int i, String str, List list, String str2) {
        super(i);
        this.f9736a = rVar;
        this.f9737a = str;
        this.f9738a = list;
        this.f9739b = str2;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "Send tiny data.";
    }

    /* renamed from: a */
    public void m15667a() {
        String a = this.f9736a.m15661a(this.f9737a);
        ArrayList<C4786ii> a2 = C4935bz.m15495a((List<C4764hn>) this.f9738a, this.f9737a, a, 32768);
        if (a2 != null) {
            Iterator<C4786ii> it = a2.iterator();
            while (it.hasNext()) {
                C4786ii next = it.next();
                next.mo29598a("uploadWay", "longXMPushService");
                C4783if a3 = C4870ah.m15193a(this.f9737a, a, next, C4760hj.Notification);
                if (!TextUtils.isEmpty(this.f9739b) && !TextUtils.equals(this.f9737a, this.f9739b)) {
                    if (a3.mo29558a() == null) {
                        C4773hw hwVar = new C4773hw();
                        hwVar.mo29395a("-1");
                        a3.mo29560a(hwVar);
                    }
                    a3.mo29558a().mo29402b("ext_traffic_source_pkg", this.f9739b);
                }
                this.f9736a.f9731a.mo29936a(this.f9737a, C4797it.m14834a(a3), true);
            }
            return;
        }
        C4408b.m12483d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
    }
}
