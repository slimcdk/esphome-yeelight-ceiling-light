package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.EventClientReport;

/* renamed from: com.xiaomi.clientreport.manager.b */
class C4413b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventClientReport f7375a;

    /* renamed from: a */
    final /* synthetic */ C4412a f7376a;

    C4413b(C4412a aVar, EventClientReport eventClientReport) {
        this.f7376a = aVar;
        this.f7375a = eventClientReport;
    }

    public void run() {
        this.f7376a.m12495b(this.f7375a);
    }
}
