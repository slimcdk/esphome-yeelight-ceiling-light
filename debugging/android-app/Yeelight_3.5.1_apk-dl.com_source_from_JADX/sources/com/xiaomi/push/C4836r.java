package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.r */
public class C4836r {

    /* renamed from: a */
    private static volatile C4836r f9341a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9342a;

    /* renamed from: a */
    private Handler f9343a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private Map<String, Map<String, String>> f9344a = new HashMap();

    private C4836r(Context context) {
        this.f9342a = context;
    }

    /* renamed from: a */
    public static C4836r m15031a(Context context) {
        if (f9341a == null) {
            synchronized (C4836r.class) {
                if (f9341a == null) {
                    f9341a = new C4836r(context);
                }
            }
        }
        return f9341a;
    }

    /* renamed from: a */
    private synchronized String m15032a(String str, String str2) {
        if (this.f9344a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map map = this.f9344a.get(str);
            if (map == null) {
                return "";
            }
            return (String) map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private synchronized void m15033b(String str, String str2, String str3) {
        if (this.f9344a == null) {
            this.f9344a = new HashMap();
        }
        Map map = this.f9344a.get(str);
        if (map == null) {
            map = new HashMap();
        }
        map.put(str2, str3);
        this.f9344a.put(str, map);
    }

    /* renamed from: a */
    public synchronized String mo29899a(String str, String str2, String str3) {
        String a = m15032a(str, str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return this.f9342a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m15035a(String str, String str2, String str3) {
        m15033b(str, str2, str3);
        this.f9343a.post(new C4837s(this, str, str2, str3));
    }
}
