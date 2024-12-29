package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.r6 */
public final class C1766r6 {

    /* renamed from: a */
    final Context f2586a;
    @Nullable

    /* renamed from: b */
    String f2587b;
    @Nullable

    /* renamed from: c */
    String f2588c;
    @Nullable

    /* renamed from: d */
    String f2589d;
    @Nullable

    /* renamed from: e */
    Boolean f2590e;

    /* renamed from: f */
    long f2591f;
    @Nullable

    /* renamed from: g */
    zzcl f2592g;

    /* renamed from: h */
    boolean f2593h = true;
    @Nullable

    /* renamed from: i */
    final Long f2594i;
    @Nullable

    /* renamed from: j */
    String f2595j;

    @VisibleForTesting
    public C1766r6(Context context, @Nullable zzcl zzcl, @Nullable Long l) {
        C0917i.m1419j(context);
        Context applicationContext = context.getApplicationContext();
        C0917i.m1419j(applicationContext);
        this.f2586a = applicationContext;
        this.f2594i = l;
        if (zzcl != null) {
            this.f2592g = zzcl;
            this.f2587b = zzcl.f1751f;
            this.f2588c = zzcl.f1750e;
            this.f2589d = zzcl.f1749d;
            this.f2593h = zzcl.f1748c;
            this.f2591f = zzcl.f1747b;
            this.f2595j = zzcl.f1753h;
            Bundle bundle = zzcl.f1752g;
            if (bundle != null) {
                this.f2590e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
