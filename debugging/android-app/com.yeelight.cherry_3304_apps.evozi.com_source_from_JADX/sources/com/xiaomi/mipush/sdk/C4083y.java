package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.xiaomi.mipush.sdk.y */
final class C4083y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6967a;

    C4083y(Context context) {
        this.f6967a = context;
    }

    public void run() {
        try {
            PackageInfo packageInfo = this.f6967a.getPackageManager().getPackageInfo(this.f6967a.getPackageName(), 4612);
            C4080x.m11003c(this.f6967a);
            C4080x.m11005d(this.f6967a, packageInfo);
            C4080x.m11004c(this.f6967a, packageInfo);
        } catch (Throwable unused) {
        }
    }
}
