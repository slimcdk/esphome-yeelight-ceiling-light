package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* renamed from: com.google.android.gms.internal.base.a */
final class C0987a {
    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    /* renamed from: a */
    static boolean m1641a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
