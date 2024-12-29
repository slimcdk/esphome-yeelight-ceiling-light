package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.d6 */
public final class C2148d6 {

    /* renamed from: a */
    final Context f4054a;

    /* renamed from: b */
    String f4055b;

    /* renamed from: c */
    String f4056c;

    /* renamed from: d */
    String f4057d;

    /* renamed from: e */
    Boolean f4058e;

    /* renamed from: f */
    long f4059f;

    /* renamed from: g */
    zzaa f4060g;

    /* renamed from: h */
    boolean f4061h = true;

    /* renamed from: i */
    Long f4062i;

    @VisibleForTesting
    public C2148d6(Context context, zzaa zzaa, Long l) {
        C1609u.m4475k(context);
        Context applicationContext = context.getApplicationContext();
        C1609u.m4475k(applicationContext);
        this.f4054a = applicationContext;
        this.f4062i = l;
        if (zzaa != null) {
            this.f4060g = zzaa;
            this.f4055b = zzaa.f3883f;
            this.f4056c = zzaa.f3882e;
            this.f4057d = zzaa.f3881d;
            this.f4061h = zzaa.f3880c;
            this.f4059f = zzaa.f3879b;
            Bundle bundle = zzaa.f3884g;
            if (bundle != null) {
                this.f4058e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
