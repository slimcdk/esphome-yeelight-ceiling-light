package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4649dy;
import com.xiaomi.push.C4655ed;
import com.xiaomi.push.C4659eh;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.C4902bd;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.c */
public class C4477c implements C4659eh {
    /* renamed from: a */
    public void mo28706a(Context context, HashMap<String, String> hashMap) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(C4655ed.m13639a(context).mo29039a());
        iiVar.mo29606d(C4655ed.m13639a(context).mo29046b());
        iiVar.mo29602c(C4770ht.AwakeAppResponse.f8718a);
        iiVar.mo29593a(C4902bd.m15380a());
        iiVar.f8983a = hashMap;
        C4465ao.m12646a(context).mo28664a(iiVar, C4760hj.Notification, true, (C4773hw) null, true);
        C4408b.m12464a("MoleInfo：　send data in app layer");
    }

    /* renamed from: b */
    public void mo28707b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1, C4649dy.m13607a(hashMap));
        C4408b.m12464a("MoleInfo：　send data in app layer");
    }

    /* renamed from: c */
    public void mo28708c(Context context, HashMap<String, String> hashMap) {
        C4408b.m12464a("MoleInfo：　" + C4649dy.m13609b(hashMap));
        String str = hashMap.get("awake_info");
        if (String.valueOf(1007).equals(hashMap.get("event_type"))) {
            C4490o.m12799a(context, str);
        }
    }
}
