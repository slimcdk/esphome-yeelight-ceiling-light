package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.p105j.C1620c;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.d */
public class C1650d {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m4577a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m4578b(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (C1620c.m4502a(context).mo11301c(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
