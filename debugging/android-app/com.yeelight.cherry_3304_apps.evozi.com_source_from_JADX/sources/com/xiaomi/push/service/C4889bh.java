package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4887bg;

/* renamed from: com.xiaomi.push.service.bh */
class C4889bh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4887bg f10100a;

    C4889bh(C4887bg bgVar) {
        this.f10100a = bgVar;
    }

    public void run() {
        try {
            for (C4887bg.C4888a run : C4887bg.m15692a(this.f10100a).values()) {
                run.run();
            }
        } catch (Exception e) {
            C3989b.m10669a("Sync job exception :" + e.getMessage());
        }
        boolean unused = this.f10100a.f10097a = false;
    }
}
