package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.xiaomi.mipush.sdk.am */
final class C4043am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6870a;

    /* renamed from: a */
    final /* synthetic */ Intent f6871a;

    C4043am(Context context, Intent intent) {
        this.f6870a = context;
        this.f6871a = intent;
    }

    public void run() {
        PushMessageHandler.m10787b(this.f6870a, this.f6871a);
    }
}
