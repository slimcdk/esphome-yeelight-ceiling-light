package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.xiaomi.mipush.sdk.al */
final class C4462al implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7438a;

    /* renamed from: a */
    final /* synthetic */ Intent f7439a;

    C4462al(Context context, Intent intent) {
        this.f7438a = context;
        this.f7439a = intent;
    }

    public void run() {
        PushMessageHandler.m12598b(this.f7438a, this.f7439a);
    }
}
