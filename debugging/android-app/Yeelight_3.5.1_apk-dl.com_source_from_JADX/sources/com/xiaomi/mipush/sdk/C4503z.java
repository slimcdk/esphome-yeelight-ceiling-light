package com.xiaomi.mipush.sdk;

import android.content.Context;

/* renamed from: com.xiaomi.mipush.sdk.z */
final class C4503z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7530a;

    C4503z(Context context) {
        this.f7530a = context;
    }

    public void run() {
        MessageHandleService.m12560c(this.f7530a);
    }
}
