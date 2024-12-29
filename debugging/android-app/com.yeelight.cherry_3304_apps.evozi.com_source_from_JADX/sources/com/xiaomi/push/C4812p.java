package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.p */
public class C4812p {

    /* renamed from: a */
    private static volatile C4812p f9857a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9858a;

    /* renamed from: a */
    private Handler f9859a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private Map<String, Map<String, String>> f9860a = new HashMap();

    private C4812p(Context context) {
        this.f9858a = context;
    }

    /* renamed from: a */
    public static C4812p m15373a(Context context) {
        if (f9857a == null) {
            synchronized (C4812p.class) {
                if (f9857a == null) {
                    f9857a = new C4812p(context);
                }
            }
        }
        return f9857a;
    }

    /* renamed from: a */
    private synchronized String m15374a(String str, String str2) {
        if (this.f9860a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map map = this.f9860a.get(str);
            if (map == null) {
                return "";
            }
            return (String) map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private synchronized void m15375b(String str, String str2, String str3) {
        if (this.f9860a == null) {
            this.f9860a = new HashMap();
        }
        Map map = this.f9860a.get(str);
        if (map == null) {
            map = new HashMap();
        }
        map.put(str2, str3);
        this.f9860a.put(str, map);
    }

    /* renamed from: a */
    public synchronized String mo25850a(String str, String str2, String str3) {
        String a = m15374a(str, str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return this.f9858a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a */
    public synchronized void m15377a(String str, String str2, String str3) {
        m15375b(str, str2, str3);
        this.f9859a.post(new C4814q(this, str, str2, str3));
    }
}
