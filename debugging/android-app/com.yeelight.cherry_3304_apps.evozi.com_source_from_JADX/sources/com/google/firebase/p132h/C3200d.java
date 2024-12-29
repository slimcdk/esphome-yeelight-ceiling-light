package com.google.firebase.p132h;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

/* renamed from: com.google.firebase.h.d */
class C3200d {

    /* renamed from: b */
    private static C3200d f6175b;

    /* renamed from: a */
    private final SharedPreferences f6176a;

    private C3200d(Context context) {
        this.f6176a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* renamed from: a */
    static synchronized C3200d m9985a(Context context) {
        C3200d dVar;
        synchronized (C3200d.class) {
            if (f6175b == null) {
                f6175b = new C3200d(context);
            }
            dVar = f6175b;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo17783b(long j) {
        return mo17784c("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo17784c(String str, long j) {
        if (!this.f6176a.contains(str)) {
            this.f6176a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f6176a.getLong(str, -1) < MiStatInterface.MAX_UPLOAD_INTERVAL) {
            return false;
        } else {
            this.f6176a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
