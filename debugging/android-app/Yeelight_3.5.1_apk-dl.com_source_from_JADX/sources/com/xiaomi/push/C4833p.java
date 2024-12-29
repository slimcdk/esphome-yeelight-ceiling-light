package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.p */
final class C4833p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f9327a;

    /* renamed from: a */
    final /* synthetic */ Context f9328a;

    C4833p(Context context, ComponentName componentName) {
        this.f9328a = context;
        this.f9327a = componentName;
    }

    public void run() {
        try {
            PackageManager packageManager = this.f9328a.getPackageManager();
            if (packageManager.getComponentEnabledSetting(this.f9327a) != 2) {
                packageManager.setComponentEnabledSetting(this.f9327a, 2, 1);
            }
        } catch (Throwable th) {
            C4408b.m12464a("close static register of network status receiver failed:" + th);
        }
    }
}
