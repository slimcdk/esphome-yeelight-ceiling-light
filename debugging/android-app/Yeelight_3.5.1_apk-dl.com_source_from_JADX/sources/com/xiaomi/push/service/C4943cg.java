package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.XMPushService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.cg */
public class C4943cg implements XMPushService.C4853n {

    /* renamed from: a */
    private static Context f9659a;

    /* renamed from: a */
    private static final Map<Integer, Map<String, List<String>>> f9660a = new HashMap();

    /* renamed from: a */
    private static final boolean f9661a = Log.isLoggable("UNDatas", 3);

    public C4943cg(Context context) {
        f9659a = context;
    }

    /* renamed from: a */
    private static C4786ii m15524a(String str, String str2, String str3, String str4) {
        C4786ii iiVar = new C4786ii();
        if (str3 != null) {
            iiVar.mo29602c(str3);
        }
        if (str != null) {
            iiVar.mo29599b(str);
        }
        if (str2 != null) {
            iiVar.mo29593a(str2);
        }
        if (str4 != null) {
            iiVar.mo29606d(str4);
        }
        iiVar.mo29596a(false);
        return iiVar;
    }

    /* renamed from: a */
    private static void m15525a(Context context, C4786ii iiVar) {
        if (f9661a) {
            C4408b.m12481b("UNDatas upload message notification:" + iiVar);
        }
        C4516al.m12857a(context).mo28733a((Runnable) new C4944ch(iiVar));
    }

    /* renamed from: b */
    private static void m15526b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f9660a);
        if (hashMap.size() > 0) {
            for (Integer num : hashMap.keySet()) {
                Map map = (Map) hashMap.get(num);
                if (map != null && map.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map.keySet()) {
                        sb.append(str);
                        sb.append(Constants.COLON_SEPARATOR);
                        List list = (List) map.get(str);
                        if (!C4995w.m15747a((Collection<?>) list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    C4786ii a = m15524a((String) null, C4902bd.m15380a(), C4770ht.NotificationRemoved.f8718a, (String) null);
                    a.mo29598a("removed_reason", String.valueOf(num));
                    a.mo29598a("all_delete_msgId_appId", sb.toString());
                    C4408b.m12481b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    m15525a(f9659a, a);
                }
                f9660a.remove(num);
            }
        }
    }

    /* renamed from: a */
    public void m15527a() {
        Map<Integer, Map<String, List<String>>> map = f9660a;
        if (map.size() > 0) {
            synchronized (map) {
                m15526b();
            }
        }
    }
}
