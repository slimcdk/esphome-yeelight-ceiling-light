package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.C4902bd;

/* renamed from: com.xiaomi.mipush.sdk.p */
final class C4491p extends C4516al.C4517a {

    /* renamed from: a */
    final /* synthetic */ Context f7515a;

    /* renamed from: a */
    final /* synthetic */ C4786ii f7516a;

    C4491p(C4786ii iiVar, Context context) {
        this.f7516a = iiVar;
        this.f7515a = context;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "22";
    }

    public void run() {
        C4786ii iiVar = this.f7516a;
        if (iiVar != null) {
            iiVar.mo29593a(C4902bd.m15380a());
            C4465ao.m12646a(this.f7515a.getApplicationContext()).mo28664a(this.f7516a, C4760hj.Notification, true, (C4773hw) null, true);
        }
    }
}
