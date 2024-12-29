package com.xiaomi.mipush.sdk;

import android.content.Context;

/* renamed from: com.xiaomi.mipush.sdk.ab */
final class C4032ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6854a;

    C4032ab(Context context) {
        this.f6854a = context;
    }

    public void run() {
        MessageHandleService.m10751c(this.f6854a);
    }
}
