package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.xiaomi.mipush.sdk.w */
final class C4500w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7525a;

    C4500w(Context context) {
        this.f7525a = context;
    }

    public void run() {
        try {
            PackageInfo packageInfo = this.f7525a.getPackageManager().getPackageInfo(this.f7525a.getPackageName(), 4612);
            C4497v.m12822c(this.f7525a);
            C4497v.m12824d(this.f7525a, packageInfo);
            C4497v.m12823c(this.f7525a, packageInfo);
        } catch (Throwable unused) {
        }
    }
}
