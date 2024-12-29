package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1534h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.p105j.C1620c;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.q */
public final class C1663q {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m4615a(Context context, int i) {
        if (!m4616b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1534h.m4161a(context).mo11094b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @TargetApi(19)
    @KeepForSdk
    /* renamed from: b */
    public static boolean m4616b(Context context, int i, String str) {
        return C1620c.m4502a(context).mo11307i(i, str);
    }
}
