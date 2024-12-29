package com.xiaomi.push;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.service.C4906bg;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.fk */
class C4694fk {
    /* renamed from: a */
    public static void m13859a(C4906bg.C4908b bVar, String str, C4711fw fwVar) {
        String str2;
        C4637dx.C4640c cVar = new C4637dx.C4640c();
        if (!TextUtils.isEmpty(bVar.f9543c)) {
            cVar.mo28964a(bVar.f9543c);
        }
        if (!TextUtils.isEmpty(bVar.f9545e)) {
            cVar.mo28968d(bVar.f9545e);
        }
        if (!TextUtils.isEmpty(bVar.f9546f)) {
            cVar.mo28970e(bVar.f9546f);
        }
        cVar.mo28965b(bVar.f9539a ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
        if (!TextUtils.isEmpty(bVar.f9544d)) {
            cVar.mo28966c(bVar.f9544d);
        } else {
            cVar.mo28966c("XIAOMI-SASL");
        }
        C4695fl flVar = new C4695fl();
        flVar.mo29157c(bVar.f9541b);
        flVar.mo29147a(Integer.parseInt(bVar.f9547g));
        flVar.mo29155b(bVar.f9537a);
        flVar.mo29150a("BIND", (String) null);
        flVar.mo29149a(flVar.mo29158e());
        C4408b.m12464a("[Slim]: bind id=" + flVar.mo29158e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f9543c);
        hashMap.put("chid", bVar.f9547g);
        hashMap.put(TypedValues.TransitionType.S_FROM, bVar.f9541b);
        hashMap.put("id", flVar.mo29158e());
        hashMap.put(TypedValues.TransitionType.S_TO, "xiaomi.com");
        if (bVar.f9539a) {
            hashMap.put("kick", TimerCodec.ENABLE);
        } else {
            hashMap.put("kick", TimerCodec.DISENABLE);
        }
        if (!TextUtils.isEmpty(bVar.f9545e)) {
            hashMap.put("client_attrs", bVar.f9545e);
        } else {
            hashMap.put("client_attrs", "");
        }
        if (!TextUtils.isEmpty(bVar.f9546f)) {
            hashMap.put("cloud_attrs", bVar.f9546f);
        } else {
            hashMap.put("cloud_attrs", "");
        }
        if (bVar.f9544d.equals("XIAOMI-PASS") || bVar.f9544d.equals("XMPUSH-PASS")) {
            str2 = C4559bn.m13036a(bVar.f9544d, (String) null, hashMap, bVar.f9548h);
        } else {
            bVar.f9544d.equals("XIAOMI-SASL");
            str2 = null;
        }
        cVar.mo28972f(str2);
        flVar.mo29152a(cVar.mo28924a(), (String) null);
        fwVar.mo29178b(flVar);
    }

    /* renamed from: a */
    public static void m13860a(String str, String str2, C4711fw fwVar) {
        C4695fl flVar = new C4695fl();
        flVar.mo29157c(str2);
        flVar.mo29147a(Integer.parseInt(str));
        flVar.mo29150a("UBND", (String) null);
        fwVar.mo29178b(flVar);
    }
}
