package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4649dy;
import com.xiaomi.push.C4655ed;
import com.xiaomi.push.C4659eh;
import com.xiaomi.push.C4757hg;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.service.bm */
public class C4920bm implements C4659eh {
    /* renamed from: a */
    public void mo28706a(Context context, HashMap<String, String> hashMap) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(C4655ed.m13639a(context).mo29039a());
        iiVar.mo29606d(C4655ed.m13639a(context).mo29046b());
        iiVar.mo29602c(C4770ht.AwakeAppResponse.f8718a);
        iiVar.mo29593a(C4902bd.m15380a());
        iiVar.f8983a = hashMap;
        byte[] a = C4797it.m14834a(C4870ah.m15193a(iiVar.mo29603c(), iiVar.mo29600b(), iiVar, C4760hj.Notification));
        if (context instanceof XMPushService) {
            C4408b.m12464a("MoleInfo : send data directly in pushLayer " + iiVar.mo29592a());
            ((XMPushService) context).mo29936a(context.getPackageName(), a, true);
            return;
        }
        C4408b.m12464a("MoleInfo : context is not correct in pushLayer " + iiVar.mo29592a());
    }

    /* renamed from: b */
    public void mo28707b(Context context, HashMap<String, String> hashMap) {
        C4757hg a = C4757hg.m14171a(context);
        if (a != null) {
            a.mo29280a("category_awake_app", "wake_up_app", 1, C4649dy.m13607a(hashMap));
        }
    }

    /* renamed from: c */
    public void mo28708c(Context context, HashMap<String, String> hashMap) {
        C4408b.m12464a("MoleInfo：　" + C4649dy.m13609b(hashMap));
    }
}
