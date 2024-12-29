package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.C1669t;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.stats.d */
public class C1643d {

    /* renamed from: a */
    private static C1643d f3168a = new C1643d();

    /* renamed from: b */
    private static Boolean f3169b;

    @KeepForSdk
    /* renamed from: a */
    public static C1643d m4558a() {
        return f3168a;
    }

    /* renamed from: c */
    private static void m4559c(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(C1641b.f3167a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    /* renamed from: d */
    private static boolean m4560d() {
        if (f3169b == null) {
            f3169b = Boolean.FALSE;
        }
        return f3169b.booleanValue();
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo11373b(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (m4560d()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "missing wakeLock key. ".concat(valueOf);
                } else {
                    new String("missing wakeLock key. ");
                }
            } else if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, C1642c.m4556b(list), str, SystemClock.elapsedRealtime(), C1669t.m4631a(context), str3, C1642c.m4557c(context.getPackageName()), C1669t.m4632b(context), j, str4, false);
                m4559c(context, wakeLockEvent);
            }
        }
    }
}
