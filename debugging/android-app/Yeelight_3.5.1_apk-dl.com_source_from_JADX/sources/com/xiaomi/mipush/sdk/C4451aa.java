package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.C4764hn;

/* renamed from: com.xiaomi.mipush.sdk.aa */
class C4451aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MiTinyDataClient.C4447a.C4448a f7421a;

    /* renamed from: a */
    final /* synthetic */ C4764hn f7422a;

    C4451aa(MiTinyDataClient.C4447a.C4448a aVar, C4764hn hnVar) {
        this.f7421a = aVar;
        this.f7422a = hnVar;
    }

    public void run() {
        this.f7421a.f7412a.add(this.f7422a);
        MiTinyDataClient.C4447a.C4448a.m12575a(this.f7421a);
    }
}
