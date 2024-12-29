package com.xiaomi.push.service;

import com.xiaomi.push.C4758hh;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.service.XMPushService;
import java.util.List;

/* renamed from: com.xiaomi.push.service.r */
public class C4981r implements C4758hh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final XMPushService f9731a;

    public C4981r(XMPushService xMPushService) {
        this.f9731a = xMPushService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m15661a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f9731a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, (String) null);
    }

    /* renamed from: a */
    public void mo29281a(List<C4764hn> list, String str, String str2) {
        this.f9731a.mo29931a((XMPushService.C4849j) new C4983s(this, 4, str, list, str2));
    }
}
