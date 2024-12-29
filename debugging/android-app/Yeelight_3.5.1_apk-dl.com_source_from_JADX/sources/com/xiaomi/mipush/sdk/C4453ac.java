package com.xiaomi.mipush.sdk;

import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.mipush.sdk.ac */
class C4453ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NotificationClickedActivity f7424a;

    C4453ac(NotificationClickedActivity notificationClickedActivity) {
        this.f7424a = notificationClickedActivity;
    }

    public void run() {
        C4408b.m12484e("clicked activity finish by timeout.");
        this.f7424a.finish();
    }
}
