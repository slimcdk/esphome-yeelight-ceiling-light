package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.en */
final class C4646en implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f8577a;

    /* renamed from: a */
    final /* synthetic */ Context f8578a;

    /* renamed from: a */
    final /* synthetic */ String f8579a;

    /* renamed from: b */
    final /* synthetic */ String f8580b;

    C4646en(Context context, String str, int i, String str2) {
        this.f8578a = context;
        this.f8579a = str;
        this.f8577a = i;
        this.f8580b = str2;
    }

    public void run() {
        C4645em.m14082c(this.f8578a, this.f8579a, this.f8577a, this.f8580b);
    }
}
