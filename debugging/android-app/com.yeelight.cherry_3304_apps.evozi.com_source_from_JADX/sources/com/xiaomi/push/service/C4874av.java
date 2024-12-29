package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4644el;
import com.xiaomi.push.C4649eq;
import com.xiaomi.push.C4653eu;
import com.xiaomi.push.C4737hk;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.service.av */
public class C4874av implements C4653eu {
    /* renamed from: a */
    public void mo22952a(Context context, HashMap<String, String> hashMap) {
        C4765il ilVar = new C4765il();
        ilVar.mo25562b(C4649eq.m14098a(context).mo25048a());
        ilVar.mo25569d(C4649eq.m14098a(context).mo25055b());
        ilVar.mo25565c(C4749hw.AwakeAppResponse.f9252a);
        ilVar.mo25555a(C4858an.m15586a());
        ilVar.f9524a = hashMap;
        byte[] a = C4776iw.m15225a(C4933w.m15854a(ilVar.mo25566c(), ilVar.mo25563b(), ilVar, C4739hm.Notification));
        if (context instanceof XMPushService) {
            C3989b.m10669a("MoleInfo : send data directly in pushLayer " + ilVar.mo25560a());
            ((XMPushService) context).mo25876a(context.getPackageName(), a, true);
            return;
        }
        C3989b.m10669a("MoleInfo : context is not correct in pushLayer " + ilVar.mo25560a());
    }

    /* renamed from: b */
    public void mo22953b(Context context, HashMap<String, String> hashMap) {
        C4737hk a = C4737hk.m14549a(context);
        if (a != null) {
            a.mo25251a("category_awake_app", "wake_up_app", 1, C4644el.m14075a(hashMap));
        }
    }

    /* renamed from: c */
    public void mo22954c(Context context, HashMap<String, String> hashMap) {
        C3989b.m10669a("MoleInfo：　" + C4644el.m14077b(hashMap));
    }
}
