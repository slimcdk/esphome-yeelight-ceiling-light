package com.xiaomi.push;

import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.service.C4860ap;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.fk */
class C4672fk {
    /* renamed from: a */
    public static void m14222a(C4860ap.C4862b bVar, String str, C4680fs fsVar) {
        String str2;
        C4632ek.C4635c cVar = new C4632ek.C4635c();
        if (!TextUtils.isEmpty(bVar.f9994c)) {
            cVar.mo24976a(bVar.f9994c);
        }
        if (!TextUtils.isEmpty(bVar.f9996e)) {
            cVar.mo24980d(bVar.f9996e);
        }
        if (!TextUtils.isEmpty(bVar.f9997f)) {
            cVar.mo24982e(bVar.f9997f);
        }
        cVar.mo24977b(bVar.f9990a ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
        if (!TextUtils.isEmpty(bVar.f9995d)) {
            cVar.mo24978c(bVar.f9995d);
        } else {
            cVar.mo24978c("XIAOMI-SASL");
        }
        C4673fl flVar = new C4673fl();
        flVar.mo25123c(bVar.f9992b);
        flVar.mo25114a(Integer.parseInt(bVar.f9998g));
        flVar.mo25121b(bVar.f9988a);
        flVar.mo25117a("BIND", (String) null);
        flVar.mo25116a(flVar.mo25124e());
        C3989b.m10669a("[Slim]: bind id=" + flVar.mo25124e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f9994c);
        hashMap.put("chid", bVar.f9998g);
        hashMap.put("from", bVar.f9992b);
        hashMap.put("id", flVar.mo25124e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f9990a) {
            hashMap.put("kick", TimerCodec.ENABLE);
        } else {
            hashMap.put("kick", TimerCodec.DISENABLE);
        }
        if (!TextUtils.isEmpty(bVar.f9996e)) {
            hashMap.put("client_attrs", bVar.f9996e);
        } else {
            hashMap.put("client_attrs", "");
        }
        if (!TextUtils.isEmpty(bVar.f9997f)) {
            hashMap.put("cloud_attrs", bVar.f9997f);
        } else {
            hashMap.put("cloud_attrs", "");
        }
        if (bVar.f9995d.equals("XIAOMI-PASS") || bVar.f9995d.equals("XMPUSH-PASS")) {
            str2 = C4530bd.m13426a(bVar.f9995d, (String) null, hashMap, bVar.f9999h);
        } else {
            bVar.f9995d.equals("XIAOMI-SASL");
            str2 = null;
        }
        cVar.mo24984f(str2);
        flVar.mo25119a(cVar.mo24930a(), (String) null);
        fsVar.mo25142b(flVar);
    }

    /* renamed from: a */
    public static void m14223a(String str, String str2, C4680fs fsVar) {
        C4673fl flVar = new C4673fl();
        flVar.mo25123c(str2);
        flVar.mo25114a(Integer.parseInt(str));
        flVar.mo25117a("UBND", (String) null);
        fsVar.mo25142b(flVar);
    }
}
