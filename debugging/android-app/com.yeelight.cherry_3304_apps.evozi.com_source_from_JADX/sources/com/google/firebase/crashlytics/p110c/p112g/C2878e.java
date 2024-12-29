package com.google.firebase.crashlytics.p110c.p112g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* renamed from: com.google.firebase.crashlytics.c.g.e */
class C2878e {

    /* renamed from: a */
    private final Float f5542a;

    /* renamed from: b */
    private final boolean f5543b;

    private C2878e(Float f, boolean z) {
        this.f5543b = z;
        this.f5542a = f;
    }

    /* renamed from: a */
    public static C2878e m8757a(Context context) {
        boolean z;
        Float f = null;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            z = m8759e(registerReceiver);
            f = m8758d(registerReceiver);
        } else {
            z = false;
        }
        return new C2878e(f, z);
    }

    /* renamed from: d */
    private static Float m8758d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    private static boolean m8759e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float mo17167b() {
        return this.f5542a;
    }

    /* renamed from: c */
    public int mo17168c() {
        Float f;
        if (!this.f5543b || (f = this.f5542a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
