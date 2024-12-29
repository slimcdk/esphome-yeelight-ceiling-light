package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.sa */
public final class C1782sa {

    /* renamed from: a */
    final Context f2666a;

    @VisibleForTesting
    public C1782sa(Context context) {
        C0917i.m1419j(context);
        Context applicationContext = context.getApplicationContext();
        C0917i.m1419j(applicationContext);
        this.f2666a = applicationContext;
    }
}
