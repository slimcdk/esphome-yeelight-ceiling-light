package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.mipush.sdk.ad */
class C4454ad extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ NotificationClickedActivity f7425a;

    C4454ad(NotificationClickedActivity notificationClickedActivity) {
        this.f7425a = notificationClickedActivity;
    }

    public void onReceive(Context context, Intent intent) {
        C4408b.m12481b("clicked activity finish by normal.");
        this.f7425a.finish();
    }
}
