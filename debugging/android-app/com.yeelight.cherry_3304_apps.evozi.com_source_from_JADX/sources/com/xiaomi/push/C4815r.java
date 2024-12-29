package com.xiaomi.push;

import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: com.xiaomi.push.r */
public final class C4815r {
    /* renamed from: a */
    public static void m15379a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT > 8) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
