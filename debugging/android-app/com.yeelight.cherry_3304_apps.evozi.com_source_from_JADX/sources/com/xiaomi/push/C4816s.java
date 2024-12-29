package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.s */
public class C4816s {
    /* renamed from: a */
    public static String m15380a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) C4937t.m15867a((Context) null, "android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            C3989b.m10669a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
