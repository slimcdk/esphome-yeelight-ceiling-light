package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.mipush.sdk.aa */
final class C4031aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6852a;

    /* renamed from: a */
    final /* synthetic */ Intent f6853a;

    C4031aa(Context context, Intent intent) {
        this.f6852a = context;
        this.f6853a = intent;
    }

    public void run() {
        try {
            this.f6852a.startService(this.f6853a);
        } catch (Exception e) {
            C3989b.m10669a(e.getMessage());
        }
    }
}
