package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
public final class C2296q4 {
    @VisibleForTesting

    /* renamed from: a */
    private final String f4444a;

    /* renamed from: b */
    private final String f4445b;

    /* renamed from: c */
    private final String f4446c;

    /* renamed from: d */
    private final long f4447d;

    /* renamed from: e */
    private final /* synthetic */ C2218j4 f4448e;

    private C2296q4(C2218j4 j4Var, String str, long j) {
        this.f4448e = j4Var;
        C1609u.m4471g(str);
        C1609u.m4465a(j > 0);
        this.f4444a = String.valueOf(str).concat(":start");
        this.f4445b = String.valueOf(str).concat(":count");
        this.f4446c = String.valueOf(str).concat(":value");
        this.f4447d = j;
    }

    @WorkerThread
    /* renamed from: c */
    private final void m7388c() {
        this.f4448e.mo12567h();
        long a = this.f4448e.mo12429f().mo11378a();
        SharedPreferences.Editor edit = this.f4448e.mo12755B().edit();
        edit.remove(this.f4445b);
        edit.remove(this.f4446c);
        edit.putLong(this.f4444a, a);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: d */
    private final long m7389d() {
        return this.f4448e.mo12755B().getLong(this.f4444a, 0);
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair<String, Long> mo12897a() {
        long j;
        this.f4448e.mo12567h();
        this.f4448e.mo12567h();
        long d = m7389d();
        if (d == 0) {
            m7388c();
            j = 0;
        } else {
            j = Math.abs(d - this.f4448e.mo12429f().mo11378a());
        }
        long j2 = this.f4447d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m7388c();
            return null;
        }
        String string = this.f4448e.mo12755B().getString(this.f4446c, (String) null);
        long j3 = this.f4448e.mo12755B().getLong(this.f4445b, 0);
        m7388c();
        return (string == null || j3 <= 0) ? C2218j4.f4215E : new Pair<>(string, Long.valueOf(j3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12898b(String str, long j) {
        this.f4448e.mo12567h();
        if (m7389d() == 0) {
            m7388c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f4448e.mo12755B().getLong(this.f4445b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f4448e.mo12755B().edit();
            edit.putString(this.f4446c, str);
            edit.putLong(this.f4445b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f4448e.mo13110k().mo12950F0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f4448e.mo12755B().edit();
        if (z) {
            edit2.putString(this.f4446c, str);
        }
        edit2.putLong(this.f4445b, j3);
        edit2.apply();
    }
}
