package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C1716n4 {

    /* renamed from: a */
    private final String f2328a;

    /* renamed from: b */
    private final long f2329b;

    /* renamed from: c */
    private boolean f2330c;

    /* renamed from: d */
    private long f2331d;

    /* renamed from: e */
    final /* synthetic */ C1764r4 f2332e;

    public C1716n4(C1764r4 r4Var, String str, long j) {
        this.f2332e = r4Var;
        C0917i.m1415f(str);
        this.f2328a = str;
        this.f2329b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo14368a() {
        if (!this.f2330c) {
            this.f2330c = true;
            this.f2331d = this.f2332e.mo14445o().getLong(this.f2328a, this.f2329b);
        }
        return this.f2331d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14369b(long j) {
        SharedPreferences.Editor edit = this.f2332e.mo14445o().edit();
        edit.putLong(this.f2328a, j);
        edit.apply();
        this.f2331d = j;
    }
}
