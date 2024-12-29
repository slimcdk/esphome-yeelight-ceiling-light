package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.mipush.sdk.y */
final class C4502y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7528a;

    /* renamed from: a */
    final /* synthetic */ Intent f7529a;

    C4502y(Context context, Intent intent) {
        this.f7528a = context;
        this.f7529a = intent;
    }

    public void run() {
        try {
            this.f7528a.startService(this.f7529a);
        } catch (Exception e) {
            C4408b.m12464a(e.getMessage());
        }
    }
}
