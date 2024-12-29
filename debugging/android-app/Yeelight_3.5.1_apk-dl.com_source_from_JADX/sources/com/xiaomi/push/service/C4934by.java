package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4932bx;

/* renamed from: com.xiaomi.push.service.by */
class C4934by implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4932bx f9643a;

    C4934by(C4932bx bxVar) {
        this.f9643a = bxVar;
    }

    public void run() {
        try {
            for (C4932bx.C4933a run : C4932bx.m15483a(this.f9643a).values()) {
                run.run();
            }
        } catch (Exception e) {
            C4408b.m12464a("Sync job exception :" + e.getMessage());
        }
        boolean unused = this.f9643a.f9640a = false;
    }
}
