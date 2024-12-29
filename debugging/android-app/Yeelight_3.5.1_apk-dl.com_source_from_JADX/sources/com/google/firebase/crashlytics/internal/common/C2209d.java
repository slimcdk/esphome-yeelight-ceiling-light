package com.google.firebase.crashlytics.internal.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.d */
class C2209d {

    /* renamed from: a */
    private final Float f3530a;

    /* renamed from: b */
    private final boolean f3531b;

    private C2209d(Float f, boolean z) {
        this.f3531b = z;
        this.f3530a = f;
    }

    /* renamed from: a */
    public static C2209d m5588a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m5590e(registerReceiver);
                f = m5589d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C3916f.m11190f().mo26402e("An error occurred getting battery state.", e);
        }
        return new C2209d(f, z);
    }

    /* renamed from: d */
    private static Float m5589d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m5590e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo18533b() {
        return this.f3530a;
    }

    /* renamed from: c */
    public int mo18534c() {
        Float f;
        if (!this.f3531b || (f = this.f3530a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
