package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.g */
public final class C1653g {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m4585a(Context context, Throwable th) {
        return m4586b(context, th, 536870912);
    }

    /* renamed from: b */
    private static boolean m4586b(Context context, Throwable th, int i) {
        try {
            C1609u.m4475k(context);
            C1609u.m4475k(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
