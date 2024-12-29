package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.dz */
public class C4650dz {
    /* renamed from: a */
    public static void m13610a(Context context, String str, int i, String str2) {
        C4516al.m12857a(context).mo28733a((Runnable) new C4652ea(context, str, i, str2));
    }

    /* renamed from: a */
    private static void m13611a(Context context, HashMap<String, String> hashMap) {
        C4659eh a = C4655ed.m13639a(context).mo29039a();
        if (a != null) {
            a.mo28706a(context, hashMap);
        }
    }

    /* renamed from: b */
    private static void m13613b(Context context, HashMap<String, String> hashMap) {
        C4659eh a = C4655ed.m13639a(context).mo29039a();
        if (a != null) {
            a.mo28708c(context, hashMap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m13614c(Context context, String str, int i, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("awake_info", str);
                hashMap.put("event_type", String.valueOf(i));
                hashMap.put("description", str2);
                int a = C4655ed.m13639a(context).mo29039a();
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            m13611a(context, hashMap);
                        }
                    }
                    m13615c(context, hashMap);
                } else {
                    m13611a(context, hashMap);
                }
                m13613b(context, hashMap);
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
            }
        }
    }

    /* renamed from: c */
    private static void m13615c(Context context, HashMap<String, String> hashMap) {
        C4659eh a = C4655ed.m13639a(context).mo29039a();
        if (a != null) {
            a.mo28707b(context, hashMap);
        }
    }
}
