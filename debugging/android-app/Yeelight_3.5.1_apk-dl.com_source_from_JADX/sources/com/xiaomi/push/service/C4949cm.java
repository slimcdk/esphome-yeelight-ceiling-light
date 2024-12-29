package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;

/* renamed from: com.xiaomi.push.service.cm */
class C4949cm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9669a;

    C4949cm(XMPushService xMPushService) {
        this.f9669a = xMPushService;
    }

    public void run() {
        boolean unused = this.f9669a.f9386a = true;
        try {
            C4408b.m12464a("try to trigger the wifi digest broadcast.");
            Object systemService = this.f9669a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                C4554bk.m13021b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused2) {
        }
    }
}
