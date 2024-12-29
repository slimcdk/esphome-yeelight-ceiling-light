package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.xiaomi.mipush.sdk.ab */
class C4452ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MiTinyDataClient.C4447a.C4448a f7423a;

    C4452ab(MiTinyDataClient.C4447a.C4448a aVar) {
        this.f7423a = aVar;
    }

    public void run() {
        if (this.f7423a.f7412a.size() != 0) {
            this.f7423a.m12579b();
        } else if (MiTinyDataClient.C4447a.C4448a.m12575a(this.f7423a) != null) {
            MiTinyDataClient.C4447a.C4448a.m12575a(this.f7423a).cancel(false);
            ScheduledFuture unused = this.f7423a.f7413a = null;
        }
    }
}
