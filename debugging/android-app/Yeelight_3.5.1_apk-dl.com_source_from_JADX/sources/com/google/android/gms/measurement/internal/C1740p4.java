package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
public final class C1740p4 {
    @VisibleForTesting

    /* renamed from: a */
    final String f2508a;

    /* renamed from: b */
    private final String f2509b;

    /* renamed from: c */
    private final String f2510c;

    /* renamed from: d */
    private final long f2511d;

    /* renamed from: e */
    final /* synthetic */ C1764r4 f2512e;

    /* synthetic */ C1740p4(C1764r4 r4Var, String str, long j, C1728o4 o4Var) {
        this.f2512e = r4Var;
        C0917i.m1415f("health_monitor");
        C0917i.m1410a(j > 0);
        this.f2508a = "health_monitor:start";
        this.f2509b = "health_monitor:count";
        this.f2510c = "health_monitor:value";
        this.f2511d = j;
    }

    @WorkerThread
    /* renamed from: c */
    private final long m4562c() {
        return this.f2512e.mo14445o().getLong(this.f2508a, 0);
    }

    @WorkerThread
    /* renamed from: d */
    private final void m4563d() {
        this.f2512e.mo14009h();
        long a = this.f2512e.f2143a.mo14229c().mo11029a();
        SharedPreferences.Editor edit = this.f2512e.mo14445o().edit();
        edit.remove(this.f2509b);
        edit.remove(this.f2510c);
        edit.putLong(this.f2508a, a);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair mo14419a() {
        long j;
        this.f2512e.mo14009h();
        this.f2512e.mo14009h();
        long c = m4562c();
        if (c == 0) {
            m4563d();
            j = 0;
        } else {
            j = Math.abs(c - this.f2512e.f2143a.mo14229c().mo11029a());
        }
        long j2 = this.f2511d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m4563d();
            return null;
        }
        String string = this.f2512e.mo14445o().getString(this.f2510c, (String) null);
        long j3 = this.f2512e.mo14445o().getLong(this.f2509b, 0);
        m4563d();
        return (string == null || j3 <= 0) ? C1764r4.f2560x : new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14420b(String str, long j) {
        this.f2512e.mo14009h();
        if (m4562c() == 0) {
            m4563d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f2512e.mo14445o().getLong(this.f2509b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f2512e.mo14445o().edit();
            edit.putString(this.f2510c, str);
            edit.putLong(this.f2509b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f2512e.f2143a.mo14382N().mo14683u().nextLong();
        long j3 = j2 + 1;
        long j4 = LocationRequestCompat.PASSIVE_INTERVAL / j3;
        SharedPreferences.Editor edit2 = this.f2512e.mo14445o().edit();
        if ((nextLong & LocationRequestCompat.PASSIVE_INTERVAL) < j4) {
            edit2.putString(this.f2510c, str);
        }
        edit2.putLong(this.f2509b, j3);
        edit2.apply();
    }
}
