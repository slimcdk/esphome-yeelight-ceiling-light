package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.xiaomi.push.dt */
class C4613dt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f8425a;

    /* renamed from: a */
    final /* synthetic */ Intent f8426a;

    /* renamed from: a */
    final /* synthetic */ C4612ds f8427a;

    C4613dt(C4612ds dsVar, Context context, Intent intent) {
        this.f8427a = dsVar;
        this.f8425a = context;
        this.f8426a = intent;
    }

    public void run() {
        this.f8427a.m13759b(this.f8425a, this.f8426a);
    }
}
