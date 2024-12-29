package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.ea */
final class C4652ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7965a;

    /* renamed from: a */
    final /* synthetic */ Context f7966a;

    /* renamed from: a */
    final /* synthetic */ String f7967a;

    /* renamed from: b */
    final /* synthetic */ String f7968b;

    C4652ea(Context context, String str, int i, String str2) {
        this.f7966a = context;
        this.f7967a = str;
        this.f7965a = i;
        this.f7968b = str2;
    }

    public void run() {
        C4650dz.m13614c(this.f7966a, this.f7967a, this.f7965a, this.f7968b);
    }
}
