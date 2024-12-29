package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.u */
public class C4993u {
    /* renamed from: a */
    public static String m15732a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) C4994v.m15735a((Context) null, "android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            C4408b.m12464a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
