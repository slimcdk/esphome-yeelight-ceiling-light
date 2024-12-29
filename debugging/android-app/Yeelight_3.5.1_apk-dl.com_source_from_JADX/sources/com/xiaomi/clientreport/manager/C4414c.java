package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.PerfClientReport;

/* renamed from: com.xiaomi.clientreport.manager.c */
class C4414c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PerfClientReport f7377a;

    /* renamed from: a */
    final /* synthetic */ C4412a f7378a;

    C4414c(C4412a aVar, PerfClientReport perfClientReport) {
        this.f7378a = aVar;
        this.f7377a = perfClientReport;
    }

    public void run() {
        this.f7378a.m12496b(this.f7377a);
    }
}
