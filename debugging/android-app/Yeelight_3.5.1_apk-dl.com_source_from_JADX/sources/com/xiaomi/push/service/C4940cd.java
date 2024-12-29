package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.C4516al;

/* renamed from: com.xiaomi.push.service.cd */
final class C4940cd extends C4516al.C4517a {

    /* renamed from: a */
    final /* synthetic */ int f9653a;

    /* renamed from: a */
    final /* synthetic */ Notification f9654a;

    /* renamed from: a */
    final /* synthetic */ Context f9655a;

    /* renamed from: a */
    final /* synthetic */ String f9656a;

    /* renamed from: b */
    final /* synthetic */ String f9657b;

    C4940cd(int i, String str, Context context, String str2, Notification notification) {
        this.f9653a = i;
        this.f9656a = str;
        this.f9655a = context;
        this.f9657b = str2;
        this.f9654a = notification;
    }

    /* renamed from: a */
    public String mo28479a() {
        return C4939cc.m15517b(this.f9653a, this.f9656a);
    }

    @TargetApi(19)
    public void run() {
        C4939cc.m15519c(this.f9655a, this.f9657b, this.f9653a, this.f9656a, this.f9654a);
    }
}
