package com.xiaomi.push;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

/* renamed from: com.xiaomi.push.n */
public abstract class C4810n {
    /* renamed from: a */
    public static void m15368a(Context context) {
    }

    /* renamed from: a */
    public static void m15369a(Context context, String str, boolean z) {
        m15368a(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }

    /* renamed from: a */
    public static void m15370a(Map<String, String> map, String str, String str2) {
        if (map != null && str != null && str2 != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static boolean m15371a(Context context, String str, boolean z) {
        m15368a(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }
}