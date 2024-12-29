package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.service.cn */
class C4950cn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ XMPushService f9670a;

    C4950cn(XMPushService xMPushService) {
        this.f9670a = xMPushService;
    }

    public void run() {
        try {
            PackageManager packageManager = this.f9670a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f9670a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            C4408b.m12464a("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
