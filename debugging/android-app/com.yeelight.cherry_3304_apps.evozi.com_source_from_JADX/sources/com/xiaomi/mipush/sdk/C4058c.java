package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4644el;
import com.xiaomi.push.C4649eq;
import com.xiaomi.push.C4653eu;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.service.C4858an;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.c */
public class C4058c implements C4653eu {
    /* renamed from: a */
    public void mo22952a(Context context, HashMap<String, String> hashMap) {
        C4765il ilVar = new C4765il();
        ilVar.mo25562b(C4649eq.m14098a(context).mo25048a());
        ilVar.mo25569d(C4649eq.m14098a(context).mo25055b());
        ilVar.mo25565c(C4749hw.AwakeAppResponse.f9252a);
        ilVar.mo25555a(C4858an.m15586a());
        ilVar.f9524a = hashMap;
        C4047aq.m10835a(context).mo22913a(ilVar, C4739hm.Notification, true, (C4752hz) null, true);
        C3989b.m10669a("MoleInfo：　send data in app layer");
    }

    /* renamed from: b */
    public void mo22953b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1, C4644el.m14075a(hashMap));
        C3989b.m10669a("MoleInfo：　send data in app layer");
    }

    /* renamed from: c */
    public void mo22954c(Context context, HashMap<String, String> hashMap) {
        C3989b.m10669a("MoleInfo：　" + C4644el.m14077b(hashMap));
        String str = hashMap.get("awake_info");
        if (String.valueOf(1007).equals(hashMap.get("event_type"))) {
            C4070n.m10973a(context, str);
        }
    }
}
