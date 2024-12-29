package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4649eq;
import com.xiaomi.push.C4651es;
import com.xiaomi.push.C4653eu;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4858an;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.n */
public class C4070n {
    /* renamed from: a */
    public static void m10970a(Context context, Intent intent, Uri uri) {
        C4649eq a;
        C4651es esVar;
        if (context != null) {
            C4047aq.m10835a(context).mo22903a();
            if (C4649eq.m14098a(context.getApplicationContext()).mo25048a() == null) {
                C4649eq.m14098a(context.getApplicationContext()).mo25054a(C4056b.m10888a(context.getApplicationContext()).mo22930a(), context.getPackageName(), C4854ak.m15568a(context.getApplicationContext()).mo25906a(C4744hr.AwakeInfoUploadWaySwitch.mo25291a(), 0), (C4653eu) new C4058c());
                C4854ak.m15568a(context).mo25909a((C4854ak.C4855a) new C4072p(102, "awake online config", context));
            }
            if ((context instanceof Activity) && intent != null) {
                a = C4649eq.m14098a(context.getApplicationContext());
                esVar = C4651es.ACTIVITY;
            } else if (!(context instanceof Service) || intent == null) {
                if (uri != null && !TextUtils.isEmpty(uri.toString())) {
                    C4649eq.m14098a(context.getApplicationContext()).mo25051a(C4651es.PROVIDER, context, (Intent) null, uri.toString());
                    return;
                }
                return;
            } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                a = C4649eq.m14098a(context.getApplicationContext());
                esVar = C4651es.SERVICE_COMPONENT;
            } else {
                a = C4649eq.m14098a(context.getApplicationContext());
                esVar = C4651es.SERVICE_ACTION;
            }
            a.mo25051a(esVar, context, intent, (String) null);
        }
    }

    /* renamed from: a */
    private static void m10971a(Context context, C4765il ilVar) {
        boolean z = false;
        boolean a = C4854ak.m15568a(context).mo25911a(C4744hr.AwakeAppPingSwitch.mo25291a(), false);
        int a2 = C4854ak.m15568a(context).mo25906a(C4744hr.AwakeAppPingFrequency.mo25291a(), 0);
        if (a2 >= 0 && a2 < 30) {
            C3989b.m10680c("aw_ping: frquency need > 30s.");
            a2 = 30;
        }
        if (a2 >= 0) {
            z = a;
        }
        if (!C4808l.m15356a()) {
            m10972a(context, ilVar, z, a2);
        } else if (z) {
            C4498ai.m13271a(context.getApplicationContext()).mo24729a((C4498ai.C4499a) new C4071o(ilVar, context), a2);
        }
    }

    /* renamed from: a */
    public static final <T extends C4777ix<T, ?>> void m10972a(Context context, T t, boolean z, int i) {
        byte[] a = C4776iw.m15225a(t);
        if (a == null) {
            C3989b.m10669a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4047aq.m10835a(context).mo22906a(intent);
    }

    /* renamed from: a */
    public static void m10973a(Context context, String str) {
        C3989b.m10669a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf(9999));
        hashMap.put("description", "ping message");
        C4765il ilVar = new C4765il();
        ilVar.mo25562b(C4056b.m10888a(context).mo22930a());
        ilVar.mo25569d(context.getPackageName());
        ilVar.mo25565c(C4749hw.AwakeAppResponse.f9252a);
        ilVar.mo25555a(C4858an.m15586a());
        ilVar.f9524a = hashMap;
        m10971a(context, ilVar);
    }

    /* renamed from: a */
    public static void m10974a(Context context, String str, int i, String str2) {
        C4765il ilVar = new C4765il();
        ilVar.mo25562b(str);
        ilVar.mo25557a((Map<String, String>) new HashMap());
        ilVar.mo25560a().put("extra_aw_app_online_cmd", String.valueOf(i));
        ilVar.mo25560a().put("extra_help_aw_info", str2);
        ilVar.mo25555a(C4858an.m15586a());
        byte[] a = C4776iw.m15225a(ilVar);
        if (a == null) {
            C3989b.m10669a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a);
        C4047aq.m10835a(context).mo22906a(intent);
    }
}
