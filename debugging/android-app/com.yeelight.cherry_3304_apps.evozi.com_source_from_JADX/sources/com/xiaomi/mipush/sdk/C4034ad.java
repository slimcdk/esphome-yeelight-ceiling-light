package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.C4743hq;

/* renamed from: com.xiaomi.mipush.sdk.ad */
class C4034ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MiTinyDataClient.C4027a.C4028a f6855a;

    /* renamed from: a */
    final /* synthetic */ C4743hq f6856a;

    C4034ad(MiTinyDataClient.C4027a.C4028a aVar, C4743hq hqVar) {
        this.f6855a = aVar;
        this.f6856a = hqVar;
    }

    public void run() {
        this.f6855a.f6845a.add(this.f6856a);
        MiTinyDataClient.C4027a.C4028a.m10766a(this.f6855a);
    }
}
