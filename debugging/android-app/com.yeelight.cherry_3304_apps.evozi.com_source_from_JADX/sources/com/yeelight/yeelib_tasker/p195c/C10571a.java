package com.yeelight.yeelib_tasker.p195c;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.yeelight.yeelib_tasker.c.a */
public final class C10571a {
    /* renamed from: a */
    public static boolean m25876a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return m25877b(intent.getExtras());
    }

    /* renamed from: b */
    public static boolean m25877b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        try {
            bundle.containsKey((String) null);
            return false;
        } catch (Exception unused) {
            bundle.clear();
            return true;
        }
    }
}
