package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.service.C4858an;

/* renamed from: com.xiaomi.mipush.sdk.o */
final class C4071o extends C4498ai.C4499a {

    /* renamed from: a */
    final /* synthetic */ Context f6948a;

    /* renamed from: a */
    final /* synthetic */ C4765il f6949a;

    C4071o(C4765il ilVar, Context context) {
        this.f6949a = ilVar;
        this.f6948a = context;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 22;
    }

    public void run() {
        C4765il ilVar = this.f6949a;
        if (ilVar != null) {
            ilVar.mo25555a(C4858an.m15586a());
            C4047aq.m10835a(this.f6948a.getApplicationContext()).mo22913a(this.f6949a, C4739hm.Notification, true, (C4752hz) null, true);
        }
    }
}
