package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.measurement.internal.C2111a5;

@ShowFirstParty
public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f4810a;

    private Analytics(C2111a5 a5Var) {
        C1609u.m4475k(a5Var);
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @Keep
    public static Analytics getInstance(Context context) {
        if (f4810a == null) {
            synchronized (Analytics.class) {
                if (f4810a == null) {
                    f4810a = new Analytics(C2111a5.m6707d(context, (zzaa) null, (Long) null));
                }
            }
        }
        return f4810a;
    }
}
