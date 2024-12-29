package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.i */
public final class C1655i {

    /* renamed from: a */
    private static Boolean f3171a;

    /* renamed from: b */
    private static Boolean f3172b;

    /* renamed from: c */
    private static Boolean f3173c;

    @TargetApi(21)
    @KeepForSdk
    /* renamed from: a */
    public static boolean m4591a(Context context) {
        if (f3172b == null) {
            f3172b = Boolean.valueOf(C1660n.m4607g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3172b.booleanValue();
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m4592b() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    /* renamed from: c */
    public static boolean m4593c(Context context) {
        if (f3171a == null) {
            f3171a = Boolean.valueOf(C1660n.m4606f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f3171a.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    /* renamed from: d */
    public static boolean m4594d(Context context) {
        if (!m4593c(context)) {
            return false;
        }
        if (C1660n.m4608h()) {
            return m4591a(context) && !C1660n.m4609i();
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m4595e(Context context) {
        if (f3173c == null) {
            f3173c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f3173c.booleanValue();
    }
}
