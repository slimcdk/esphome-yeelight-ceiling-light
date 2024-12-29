package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4766hp;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4779ib;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4900bb;

/* renamed from: com.xiaomi.mipush.sdk.ae */
public class C4455ae extends C4516al.C4517a {

    /* renamed from: a */
    private Context f7426a;

    public C4455ae(Context context) {
        this.f7426a = context;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "2";
    }

    public void run() {
        C4898ba a = C4898ba.m15362a(this.f7426a);
        C4779ib ibVar = new C4779ib();
        ibVar.mo29500a(C4900bb.m15376a(a, C4766hp.MISC_CONFIG));
        ibVar.mo29503b(C4900bb.m15376a(a, C4766hp.PLUGIN_CONFIG));
        C4786ii iiVar = new C4786ii("-1", false);
        iiVar.mo29602c(C4770ht.DailyCheckClientConfig.f8718a);
        iiVar.mo29597a(C4797it.m14834a(ibVar));
        C4465ao.m12646a(this.f7426a).mo28661a(iiVar, C4760hj.Notification, (C4773hw) null);
    }
}
