package com.xiaomi.push.service;

import com.xiaomi.push.C4738hl;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.service.XMPushService;
import java.util.List;

/* renamed from: com.xiaomi.push.service.i */
public class C4917i implements C4738hl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final XMPushService f10152a;

    public C4917i(XMPushService xMPushService) {
        this.f10152a = xMPushService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m15780a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f10152a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, (String) null);
    }

    /* renamed from: a */
    public void mo25252a(List<C4743hq> list, String str, String str2) {
        this.f10152a.mo25871a((XMPushService.C4827i) new C4918j(this, 4, str, list, str2));
    }
}
