package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C2263n4 {

    /* renamed from: a */
    private final String f4378a;

    /* renamed from: b */
    private final long f4379b;

    /* renamed from: c */
    private boolean f4380c;

    /* renamed from: d */
    private long f4381d;

    /* renamed from: e */
    private final /* synthetic */ C2218j4 f4382e;

    public C2263n4(C2218j4 j4Var, String str, long j) {
        this.f4382e = j4Var;
        C1609u.m4471g(str);
        this.f4378a = str;
        this.f4379b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo12849a() {
        if (!this.f4380c) {
            this.f4380c = true;
            this.f4381d = this.f4382e.mo12755B().getLong(this.f4378a, this.f4379b);
        }
        return this.f4381d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12850b(long j) {
        SharedPreferences.Editor edit = this.f4382e.mo12755B().edit();
        edit.putLong(this.f4378a, j);
        edit.apply();
        this.f4381d = j;
    }
}
