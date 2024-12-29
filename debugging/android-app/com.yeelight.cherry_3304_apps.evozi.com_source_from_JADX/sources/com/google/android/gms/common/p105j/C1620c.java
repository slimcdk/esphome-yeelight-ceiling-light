package com.google.android.gms.common.p105j;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* renamed from: com.google.android.gms.common.j.c */
public class C1620c {

    /* renamed from: b */
    private static C1620c f3098b = new C1620c();

    /* renamed from: a */
    private C1619b f3099a = null;

    @KeepForSdk
    /* renamed from: a */
    public static C1619b m4502a(Context context) {
        return f3098b.m4503b(context);
    }

    @VisibleForTesting
    /* renamed from: b */
    private final synchronized C1619b m4503b(Context context) {
        if (this.f3099a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3099a = new C1619b(context);
        }
        return this.f3099a;
    }
}
