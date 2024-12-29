package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4655ed;
import com.xiaomi.push.C4657ef;
import com.xiaomi.push.C4659eh;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4798iu;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4902bd;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.o */
public class C4490o {
    /* renamed from: a */
    public static void m12796a(Context context, Intent intent, Uri uri) {
        C4655ed a;
        C4657ef efVar;
        if (context != null) {
            C4465ao.m12646a(context).mo28653a();
            if (C4655ed.m13639a(context.getApplicationContext()).mo29039a() == null) {
                C4655ed.m13639a(context.getApplicationContext()).mo29045a(C4475b.m12705a(context.getApplicationContext()).mo28684a(), context.getPackageName(), C4898ba.m15362a(context.getApplicationContext()).mo29988a(C4765ho.AwakeInfoUploadWaySwitch.mo29322a(), 0), (C4659eh) new C4477c());
                C4898ba.m15362a(context).mo29993a((C4898ba.C4899a) new C4492q(102, "awake online config", context));
            }
            if ((context instanceof Activity) && intent != null) {
                a = C4655ed.m13639a(context.getApplicationContext());
                efVar = C4657ef.ACTIVITY;
            } else if (!(context instanceof Service) || intent == null) {
                if (uri != null && !TextUtils.isEmpty(uri.toString())) {
                    C4655ed.m13639a(context.getApplicationContext()).mo29042a(C4657ef.PROVIDER, context, (Intent) null, uri.toString());
                    return;
                }
                return;
            } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                a = C4655ed.m13639a(context.getApplicationContext());
                efVar = C4657ef.SERVICE_COMPONENT;
            } else {
                a = C4655ed.m13639a(context.getApplicationContext());
                efVar = C4657ef.SERVICE_ACTION;
            }
            a.mo29042a(efVar, context, intent, (String) null);
        }
    }

    /* renamed from: a */
    private static void m12797a(Context context, C4786ii iiVar) {
        boolean z = false;
        boolean a = C4898ba.m15362a(context).mo29996a(C4765ho.AwakeAppPingSwitch.mo29322a(), false);
        int a2 = C4898ba.m15362a(context).mo29988a(C4765ho.AwakeAppPingFrequency.mo29322a(), 0);
        if (a2 >= 0 && a2 < 30) {
            C4408b.m12482c("aw_ping: frquency need > 30s.");
            a2 = 30;
        }
        if (a2 >= 0) {
            z = a;
        }
        if (!C4830m.m14997a()) {
            m12798a(context, iiVar, z, a2);
        } else if (z) {
            C4516al.m12857a(context.getApplicationContext()).mo28736a((C4516al.C4517a) new C4491p(iiVar, context), a2);
        }
    }

    /* renamed from: a */
    public static final <T extends C4798iu<T, ?>> void m12798a(Context context, T t, boolean z, int i) {
        byte[] a = C4797it.m14834a(t);
        if (a == null) {
            C4408b.m12464a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4465ao.m12646a(context).mo28657a(intent);
    }

    /* renamed from: a */
    public static void m12799a(Context context, String str) {
        C4408b.m12464a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf(9999));
        hashMap.put("description", "ping message");
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(C4475b.m12705a(context).mo28684a());
        iiVar.mo29606d(context.getPackageName());
        iiVar.mo29602c(C4770ht.AwakeAppResponse.f8718a);
        iiVar.mo29593a(C4902bd.m15380a());
        iiVar.f8983a = hashMap;
        m12797a(context, iiVar);
    }

    /* renamed from: a */
    public static void m12800a(Context context, String str, int i, String str2) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(str);
        iiVar.mo29595a((Map<String, String>) new HashMap());
        iiVar.mo29592a().put("extra_aw_app_online_cmd", String.valueOf(i));
        iiVar.mo29592a().put("extra_help_aw_info", str2);
        iiVar.mo29593a(C4902bd.m15380a());
        byte[] a = C4797it.m14834a(iiVar);
        if (a == null) {
            C4408b.m12464a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a);
        C4465ao.m12646a(context).mo28657a(intent);
    }
}
