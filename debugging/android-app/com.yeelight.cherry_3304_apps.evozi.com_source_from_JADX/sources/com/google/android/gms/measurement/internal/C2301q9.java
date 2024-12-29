package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.q9 */
public final class C2301q9 {

    /* renamed from: a */
    final Context f4456a;

    @VisibleForTesting
    public C2301q9(Context context) {
        C1609u.m4475k(context);
        Context applicationContext = context.getApplicationContext();
        C1609u.m4475k(applicationContext);
        this.f4456a = applicationContext;
    }
}
