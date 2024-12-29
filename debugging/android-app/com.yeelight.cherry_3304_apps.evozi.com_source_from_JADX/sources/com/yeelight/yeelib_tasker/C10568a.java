package com.yeelight.yeelib_tasker;

import android.content.Context;

/* renamed from: com.yeelight.yeelib_tasker.a */
public final class C10568a {
    /* renamed from: a */
    public static int m25864a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (UnsupportedOperationException unused) {
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
