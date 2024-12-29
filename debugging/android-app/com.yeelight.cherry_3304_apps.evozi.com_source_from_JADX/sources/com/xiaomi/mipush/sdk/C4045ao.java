package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.mipush.sdk.ao */
class C4045ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6876a;

    /* renamed from: a */
    final /* synthetic */ C4044an f6877a;

    /* renamed from: a */
    final /* synthetic */ String[] f6878a;

    C4045ao(C4044an anVar, String[] strArr, Context context) {
        this.f6877a = anVar;
        this.f6878a = strArr;
        this.f6876a = context;
    }

    public void run() {
        int i = 0;
        while (i < this.f6878a.length) {
            try {
                if (!TextUtils.isEmpty(this.f6878a[i])) {
                    if (i > 0) {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                    }
                    PackageInfo packageInfo = this.f6876a.getPackageManager().getPackageInfo(this.f6878a[i], 4);
                    if (packageInfo != null) {
                        this.f6877a.m10815a(this.f6876a, packageInfo);
                    }
                }
                i++;
            } catch (Throwable th) {
                C3989b.m10678a(th);
                return;
            }
        }
    }
}
