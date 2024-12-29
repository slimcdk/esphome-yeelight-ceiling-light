package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.PerfClientReport;

/* renamed from: com.xiaomi.clientreport.manager.c */
class C3994c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PerfClientReport f6810a;

    /* renamed from: a */
    final /* synthetic */ C3992a f6811a;

    C3994c(C3992a aVar, PerfClientReport perfClientReport) {
        this.f6811a = aVar;
        this.f6810a = perfClientReport;
    }

    public void run() {
        this.f6811a.m10693b(this.f6810a);
    }
}
