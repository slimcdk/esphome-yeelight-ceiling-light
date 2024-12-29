package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.em */
public class C4645em {
    /* renamed from: a */
    public static void m14078a(Context context, String str, int i, String str2) {
        C4498ai.m13271a(context).mo24725a((Runnable) new C4646en(context, str, i, str2));
    }

    /* renamed from: a */
    private static void m14079a(Context context, HashMap<String, String> hashMap) {
        C4653eu a = C4649eq.m14098a(context).mo25048a();
        if (a != null) {
            a.mo22952a(context, hashMap);
        }
    }

    /* renamed from: b */
    private static void m14081b(Context context, HashMap<String, String> hashMap) {
        C4653eu a = C4649eq.m14098a(context).mo25048a();
        if (a != null) {
            a.mo22954c(context, hashMap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m14082c(Context context, String str, int i, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("awake_info", str);
                hashMap.put("event_type", String.valueOf(i));
                hashMap.put("description", str2);
                int a = C4649eq.m14098a(context).mo25048a();
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            m14079a(context, hashMap);
                        }
                    }
                    m14083c(context, hashMap);
                } else {
                    m14079a(context, hashMap);
                }
                m14081b(context, hashMap);
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
        }
    }

    /* renamed from: c */
    private static void m14083c(Context context, HashMap<String, String> hashMap) {
        C4653eu a = C4649eq.m14098a(context).mo25048a();
        if (a != null) {
            a.mo22953b(context, hashMap);
        }
    }
}
