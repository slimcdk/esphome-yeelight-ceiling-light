package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

/* renamed from: com.google.android.gms.common.util.t */
public final class C1669t {

    /* renamed from: a */
    private static final IntentFilter f3191a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f3192b;

    /* renamed from: c */
    private static float f3193c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m4631a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f3191a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C1660n.m4606f() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 2;
        }
        return i | i2;
    }

    /* renamed from: b */
    public static synchronized float m4632b(Context context) {
        synchronized (C1669t.class) {
            if (SystemClock.elapsedRealtime() - f3192b >= MiStatInterface.MIN_UPLOAD_INTERVAL || Float.isNaN(f3193c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f3191a);
                if (registerReceiver != null) {
                    f3193c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f3192b = SystemClock.elapsedRealtime();
                float f = f3193c;
                return f;
            }
            float f2 = f3193c;
            return f2;
        }
    }
}
