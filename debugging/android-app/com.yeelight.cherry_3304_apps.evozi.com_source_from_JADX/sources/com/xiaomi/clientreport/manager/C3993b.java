package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.EventClientReport;

/* renamed from: com.xiaomi.clientreport.manager.b */
class C3993b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventClientReport f6808a;

    /* renamed from: a */
    final /* synthetic */ C3992a f6809a;

    C3993b(C3992a aVar, EventClientReport eventClientReport) {
        this.f6809a = aVar;
        this.f6808a = eventClientReport;
    }

    public void run() {
        this.f6809a.m10692b(this.f6808a);
    }
}
